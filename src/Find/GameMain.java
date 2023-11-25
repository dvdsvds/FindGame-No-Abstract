package Find;

public class Main {
    public static void main(String[] args) {
        gameHelp help = new gameHelp();
        gameLogic logic = new gameLogic();

        help.HelpOrCommand();
        System.out.println("\n");

        //게임 시작
        logic.start();
            
        
    }
}