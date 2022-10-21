import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

class Environment {
    private HashMap<String, Boolean[]> variableValues = new HashMap<String, Boolean[]>();


    public Environment() {
    }

    public void setVariable(String name, Boolean[] values) {
        variableValues.put(name, values);
    }

    public Boolean[] getVariable(String name) {

        Boolean[] value = variableValues.get(name);

        if (value == null) {
            System.err.println("Variable not defined: " + name);
            System.exit(-1);
        }
        return value;
    }

    public String toString() {
        StringBuilder table = new StringBuilder();
        for (Entry<String, Boolean[]> entry : variableValues.entrySet()) {
            table.append(entry.getKey()).append("\t-> ").append(Arrays.deepToString(entry.getValue()).replace("true", "1")
                    .replace("false", "0")).append("\n");
        }
        return table.toString();
    }



    public void printOutString(List<String> outputs, List<Simulation> simulations) {
        // for button
        for (Simulation simulation : simulations) {
            StringBuilder simBuilder = new StringBuilder();

            for (int j = 0; j < simulation.boolList.length; j++) {
                if (simulation.boolList[j]) {
                    simBuilder.append("1");
                } else {
                    simBuilder.append("0");
                }
            }
            System.out.println();
            System.out.println(simBuilder + " " + simulation.variable);
            System.out.println();
        }
            // for the other outputs
        for (String output : outputs) {
            StringBuilder outputBuilder = new StringBuilder();

            for (int j = 0; j < variableValues.get(output).length; j++) {
                if (variableValues.get(output)[j]) {
                    outputBuilder.append("1");
                } else {
                    outputBuilder.append("0");
                }
            }
            System.out.println(outputBuilder + " " + output);

        }
    }
}


