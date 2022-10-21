import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public abstract class AST {
    abstract NewSignal eval(Environment env);

    abstract Boolean eval(Environment env, int clock);
}

abstract class NewSignal extends AST {

    abstract Boolean eval(Environment env, int clock);

    abstract NewSignal eval(Environment env);
}

class Start extends AST {

    List<String> inputs;
    List<String> outputs;
    List<Latch> latches;
    List<Update> updates;
    List<Simulation> simulations;
    Environment env;


    public Start(List<String> inputs, List<String> outputs, List<Latch> latches, List<Update> updates,
                 List<Simulation> simulations, Environment env) {
        this.inputs = inputs;
        this.outputs = outputs;
        this.latches = latches;
        this.updates = updates;
        this.simulations = simulations;
        this.env = env;

        for (Simulation simulation : simulations) {
            env.setVariable(simulation.variable, simulation.boolList);
        }

        for (Update update : updates) {
            Boolean[] bools = new Boolean[simulations.get(0).boolList.length];
            Arrays.fill(bools, Boolean.FALSE);
            env.setVariable(update.variable, bools);
        }

        for(Latch latch : latches){
            Boolean[] bools = new Boolean[simulations.get(0).boolList.length];
            Arrays.fill(bools, Boolean.FALSE);

            Boolean[] bools2 = new Boolean[simulations.get(0).boolList.length];
            Arrays.fill(bools2, Boolean.FALSE);

            env.setVariable(latch.i.varname, bools);
            env.setVariable(latch.o.varname, bools2);
        }
        init();
    }
    void cycle(int cycle) {
        executeLatches(cycle);
        executeUpdates(cycle);


    }

    void init() {

        for (Latch latch : latches) {
            latch.initialize();
        }

        for (int i = 0; i < simulations.get(0).boolList.length; i++) {
            cycle(i);
        }
        env.printOutString(outputs,simulations);
    }

    void executeUpdates(int cycle) {
        for (Update update : updates) {
            update.eval(env, cycle);
        }
    }

    void executeLatches(int cycle) {
            for (Latch latch : latches) {
                latch.nextCycle(env, cycle);
            }
    }

    @Override
    NewSignal eval(Environment env) {
        return new Variable("var");
    }

    @Override
    Boolean eval(Environment env, int clock) {
        return true;
    }
}

class Not extends NewSignal {
    NewSignal new1;

    Not(NewSignal new1) {
        this.new1 = new1;
    }

    @Override
    public Boolean eval(Environment env, int clock) {
        return !new1.eval(env, clock);
    }

    @Override
    NewSignal eval(Environment env) {
        return new1;
    }
}

class Latch extends AST {
    Variable i, o;

    public Latch(Variable input, Variable output) {
        this.i = input;
        this.o = output;
    }

    public void initialize() {
        this.o.value = false;
    }

    public void nextCycle(Environment env, int clock) {
        //getting earlier assigned input value to current output
        if(clock > 0) {
            this.o.value = this.i.value;

            //setting the boolean of output variable
            Boolean[] outputBool = env.getVariable(o.varname);
            outputBool[clock] = this.o.value;
            env.setVariable(this.o.varname, outputBool);
            // Shows True and False for every clock
            System.out.println(this.o.varname + " er " + Arrays.toString(outputBool));
        }
        //Changing the input variable for next use
        Boolean[] inputBool = env.getVariable(i.varname);
        this.i.value = inputBool[clock];


    }

    @Override
    NewSignal eval(Environment env) {
        return new Variable("var");
    }

    @Override
    Boolean eval(Environment env, int clock) {
        return true;
    }
}

class Simulation extends AST {
    String variable;
    Boolean[] boolList;

    public Simulation(String variable, String boolList) {
        this.variable = variable;

        Boolean[] booleans = new Boolean[boolList.length()];

        for (int i = 0; i < booleans.length; i++) {
            if (boolList.charAt(i) == '0') {
                booleans[i] = false;
            } else {
                booleans[i] = true;
            }
        }

        this.boolList = booleans;
    }

    @Override
    NewSignal eval(Environment env) {
        return new Variable("var");
    }

    @Override
    Boolean eval(Environment env, int clock) {
        boolList = env.getVariable(variable);
        return boolList[clock];
    }
}
class Update extends AST {
    String variable;
    NewSignal newSignal;

    public Update(String variable, NewSignal newSignal) {
        this.variable = variable;
        this.newSignal = newSignal;
    }

    @Override
    NewSignal eval(Environment env) {
        return new Variable("var");
    }

    @Override
    Boolean eval(Environment env, int clock) {

        Boolean[] var = env.getVariable(variable);
        var[clock] = newSignal.eval(env, clock);
        env.setVariable(variable, var);
        return newSignal.eval(env, clock);
    }
}

class Variable extends NewSignal {
    String varname;
    Boolean value;

    public Variable(String varname) {
        this.varname = varname;
    }

    @Override
    NewSignal eval(Environment env) {
        return null;
    }

    public Boolean eval(Environment env, int clock) {
        this.value = env.getVariable(varname)[clock];
        return env.getVariable(varname)[clock];
    }
}

class LogicalOr extends NewSignal {
    NewSignal new1, new2;

    LogicalOr(NewSignal new1, NewSignal new2) {
        this.new1 = new1;
        this.new2 = new2;
    }

    public Boolean eval(Environment env, int clock) {
        return new1.eval(env, clock) || new2.eval(env, clock);
    }

    @Override
    NewSignal eval(Environment env) {
        return null;
    }
}

class LogicalAnd extends NewSignal {
    NewSignal new1, new2;

    LogicalAnd(NewSignal new1, NewSignal new2) {
        this.new1 = new1;
        this.new2 = new2;
    }

    @Override
    public Boolean eval(Environment env, int clock) {
        return new1.eval(env, clock) && new2.eval(env, clock);
    }

    @Override
    NewSignal eval(Environment env) {
        return null;
    }
}
