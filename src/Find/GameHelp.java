package Find;

import java.util.Scanner;

public class GameHelp {
    GameLogic gameLogic = new GameLogic();
    Scanner sc = new Scanner(System.in);
    
    public void HelpOrCommand() {
        System.out.println("도움말을 보려면 help, 명령어 목록을 보려면 command를 입력해주세요.");
        System.out.println("게임을 시작하려면 start, 종료하려면 end를 입력해주세요.");
        while(true) {
            System.out.print("→ ");
            String help_Command = sc.next(); 
            if(help_Command.equals("help")) {
                System.out.println("\n===========");
                System.out.println("<게임 방법>");
                System.out.println("명령어를 이용해 목표물을 찾으면 끝나는 게임입니다.");
                System.out.println("실패 횟수가 10번 채워지면 게임이 종료됩니다.");
                System.out.println("===========\n");
                continue;
            }

            else if(help_Command.equals("command")) {
                System.out.println("\n========");
                System.out.println("<전체적인 명령어>(→)");
                System.out.println("- xwalk : walk 입력 수 만큼 x좌표를 증가시킵니다.");
                System.out.println("- ywalk : walk 입력 수 만큼 y좌표를 증가시킵니다.");
                System.out.println("- xback : back 입력 수 만큼 x좌표를 감소시킵니다.");
                System.out.println("- yback : back 입력 수 만큼 y좌표를 감소시킵니다.");
                System.out.println("- chech : 현재 위치한 좌표에 목표물이 있는지 확인합니다.");
                System.out.println("- here  : 현재의 좌표를 알려줍니다.");
                System.out.println("- clear : 콘솔을 정리합니다.\n");
                System.out.println("<세부적인 명령어>(↘)");
                System.out.println("- walk : x,y좌표가 1만큼 증가합니다.");
                System.out.println("- back : x,y좌표가 1만큼 감소합니다.");
                System.out.println("- here  : 현재의 좌표를 알려줍니다.");
                System.out.println("========\n");
                continue;
            }

            else if(help_Command.equals("start")) {
                break;
            }

            else if(help_Command.equals("end")) {
                System.out.println("게임이 종료됩니다.");
                System.exit(1);
            }

            else {
                System.out.println("다시 입력해주세요.");
                
                continue;
            }
            
            break;
        }
    }
    
}
