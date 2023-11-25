package Find;

public class Main {
    public static void main(String[] args) {
        Help help = new Help();
        Logic logic = new Logic();

        help.HelpOrCommand();
        System.out.println("\n");

        //게임 시작
        logic.start();
            
        
    }
}