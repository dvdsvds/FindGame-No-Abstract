package Find;

public class Main {
    public static void main(String[] args) {
        GameHelp help = new GameHelp();
        GameLogic logic = new GameLogic();

        help.HelpOrCommand();
        System.out.println("\n");

        //게임 시작
        logic.start();
            
        
    }
}