package Find;

public class GameMain {
    public static void main(String[] args) {
        GameHelp gameHelp = new GameHelp();
        GameLogic gameLogic = new GameLogic();

        gameHelp.HelpOrCommand();
        System.out.println("\n");

        //게임 시작
        gameLogic.gameStart();
            
        
    }
}