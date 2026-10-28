import java.lang.Thread;
public class Main{
    public static void main(String[] args) {
        try{
            for (int i = 1; i <= 5; i++) {
                //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
                // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
                IO.println("i = " + i);
                Thread.sleep(2000);
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
            System.out.println("done");
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

    }
}
