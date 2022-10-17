import java.util.Arrays;
import java.util.HashMap;
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
        String table = "";
        for (Entry<String, Boolean[]> entry : variableValues.entrySet()) {
            table += entry.getKey() + "\t-> " + Arrays.deepToString(entry.getValue()).replace("true", "1")
                    .replace("false", "0") + "\n";
        }
        return table;
    }
}


