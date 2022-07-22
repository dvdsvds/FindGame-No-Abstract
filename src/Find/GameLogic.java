package Find;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GameLogic {
    Random random_size = new Random();
    Scanner sc = new Scanner(System.in);

    int mapsize; 
    int failcount = 0;

    //맵 생성
    public void map(int size) {
        mapsize = size;
        System.out.println("");

        for(int i = 1; i < size+1; i++) {
            System.out.print("  " + i + " ");
        }
        System.out.println("");

        for(int i = 1; i < size+1; i++) {
            System.out.print(i);
            for(int j = 0; j < size; j++) {
                System.out.print(" ■  ");

            }
            System.out.println("\n");
        }
        System.out.println("\n");
    }

    public void timeDelay(int time) {
        String str = "... ";
        char[] arr = str.toCharArray();
        try {
            for(int i = 0; i < arr.length; i++) {
                TimeUnit.SECONDS.sleep(1);
                System.out.print(arr[i]);
            }
        }
        catch(Exception e) {}
        System.out.println("\n");
    }

    public void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
     
    //==============================맵 선택==============================

    int[] arr = {5,6,7,8};
    int x_coordinate = 1;
    int y_coordinate = 1;

    public void gameStart() {
        map(arr[random_size.nextInt(4)]);
        while(true) {
            System.out.println("맵을 다시 고르려면 yes, 이대로 진행하려면 no를 입력하세요.");
            System.out.print("→ ");
            String yes_no = sc.next(); 
            
            if(yes_no.equals("yes")) {
                clearConsole();
                System.out.print("맵 생성중");
                timeDelay(1);
                clearConsole();
                map(arr[random_size.nextInt(4)]);
                continue;
            }

            else if(yes_no.equals("no")) {
                break;
            }

            else {
                System.out.println("다시 입력해주세요.\n");
                continue;
            }
        }

        // 생성 좌표 지정
        System.out.println("생성될 지점을 정해주세요.");
        while(true) {
            System.out.print("x → ");
            x_coordinate = sc.nextInt();
            System.out.print("y → ");
            y_coordinate = sc.nextInt();

            if(x_coordinate > mapsize || y_coordinate > mapsize) {
                System.out.println("값이 잘못되었습니다.\n다시 입력해주세요.");
                System.out.println(mapsize + " 보다 크게 생성할 수는 없습니다.");
                continue;
            }

            else {
                break;
            }
        }

        //목표물 랜덤 생성
        int target_x = (int) (Math.random() * mapsize + 1);
        int target_y = (int) (Math.random() * mapsize + 1);
        clearConsole();
        System.out.print("목표물 생성중");
        timeDelay(1);
        System.out.println("목표물이 생성되었습니다.");

        //할 행동
        System.out.println("행동 입력");
        while(true) {
            while(true) {
                System.out.print("→ ");
                String up_active = sc.next();
                if(up_active.equals("xwalk")) {
                    while(true) {
                        System.out.print(" ↘ ");
                        String down_active = sc.next();

                        if(down_active.equals("walk")) {
                            x_coordinate++;

                            if(x_coordinate > mapsize) {
                                System.out.println("맵 밖으로 나갈 수 없습니다.");
                                System.out.println("다시 입력해주세요.");
                                x_coordinate = mapsize;
                                continue;
                            }
                        }

                        else if(down_active.equals("here")) {
                            System.out.println("\n  =========");
                            System.out.println("  현재 좌표");
                            System.out.println("  X : " + x_coordinate + "\n  Y : " + y_coordinate);
                            System.out.println("  =========\n");
                            continue;
                        }
                        
                        else if(down_active.equals("end")) {
                            break;
                        }

                        else {
                            System.out.println("다시 입력해주세요.");
                            continue;
                        }
                    }
                }
                
                else if(up_active.equals("ywalk")) {
                    while(true) {
                        System.out.print(" ↘ ");
                        String down_active = sc.next();
                        if(down_active.equals("walk")) {
                            y_coordinate++;

                            if(y_coordinate > mapsize) {
                                System.out.println("맵 밖으로 나갈 수 없습니다.");
                                System.out.println("다시 입력해주세요.");
                                y_coordinate = mapsize;
                                continue;
                            }
                        }

                        else if(down_active.equals("here")) {
                            System.out.println("\n  =========");
                            System.out.println("  현재 좌표");
                            System.out.println("  X : " + x_coordinate + "\n  Y : " + y_coordinate);
                            System.out.println("  =========\n");
                            continue;
                        }
                        
                        else if(down_active.equals("end")) {
                            break;
                        }

                        else {
                            System.out.println("다시 입력해주세요.");
                            continue;
                        }
                    }
                }

                else if(up_active.equals("xback")) {
                    while(true) {
                        System.out.print(" ↘ ");
                        String down_active = sc.next();
                        if(down_active.equals("back")) {
                            x_coordinate--;

                            if(x_coordinate <= 0) {
                                System.out.println("맵 밖으로 나갈 수 없습니다.");
                                System.out.println("다시 입력해주세요.");
                                x_coordinate = mapsize;
                                continue;
                            }
                        }

                        else if(down_active.equals("here")) {
                            System.out.println("\n  =========");
                            System.out.println("  현재 좌표");
                            System.out.println("  X : " + x_coordinate + "\n  Y : " + y_coordinate);
                            System.out.println("  =========\n");
                            continue;
                        }
                        
                        else if(down_active.equals("end")) {
                            break;
                        }

                        else {
                            System.out.println("다시 입력해주세요.");
                            continue;
                        }
                    }
                }
                
                else if(up_active.equals("yback")) {
                    while(true) {
                        System.out.print(" ↘ ");
                        String down_active = sc.next();
                        if(down_active.equals("back")) {
                            y_coordinate--;

                            if(y_coordinate <= 0) {
                                System.out.println("맵 밖으로 나갈 수 없습니다.");
                                System.out.println("다시 입력해주세요.");
                                y_coordinate = mapsize;
                                continue;
                            }
                        }

                        else if(down_active.equals("here")) {
                            System.out.println("\n  =========");
                            System.out.println("  현재 좌표");
                            System.out.println("  X : " + x_coordinate + "\n  Y : " + y_coordinate);
                            System.out.println("  =========\n");
                            continue;
                        }
                        
                        else if(down_active.equals("end")) {
                            break;
                        }

                        else {
                            System.out.println("다시 입력해주세요.");
                            continue;
                        }
                    }
                }

                else if(up_active.equals("check")) {
                    if(x_coordinate == target_x && y_coordinate == target_y) {
                        System.out.println("목표물을 찾았습니다.");
                    }   

                    else {
                        System.out.println("목표물을 찾지 못했습니다.");
                        failcount++;
                        System.out.println("실패 횟수 : " + failcount);
                        continue;
                    }

                }

                else if(up_active.equals("here")) {
                    System.out.println("\n=========");
                    System.out.println("현재 좌표");
                    System.out.println("X : " + x_coordinate + "\nY : " + y_coordinate);
                    System.out.println("=========\n");
                }
                
                else if(up_active.equals("end")) { 
                    System.exit(1);
                }

                else if(up_active.equals("clear")) {
                    clearConsole();
                    continue;
                }
                
                else {
                    System.out.println("다시 입력해주세요.");
                    continue;
                }
            break;

            }
        }
    }

    //==========================================================================================
}
