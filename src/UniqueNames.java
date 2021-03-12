import acm.program.ConsoleProgram;
import java.util.ArrayList;

public class UniqueNames extends ConsoleProgram {
    private ArrayList<String> nameList;
    private static final String SENTINEL = "";

    public UniqueNames() {
        nameList = new ArrayList();
    }

    public void run() {
        while (true) {
            String name = readLine("Enter a name: ");
            if (name.equals(SENTINEL)) {
                println("Unique name list contains: ");
                printUniqueNameList();
                break;
            }
            addNameToTheList(name);
        }
    }

    private void printUniqueNameList() {
        for (int i=0; i<nameList.size(); i++){
            println(nameList.get(i));
        }
    }

    private void addNameToTheList(String name) {
        if (!nameList.contains(name)) {
            nameList.add(name);
        }
    }
}