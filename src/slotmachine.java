import java.util.*;
public class slotmachine {
    public static void main(String[] args) {

        double balance = 100;
        int bet;
        int redeem;
        String[] row;
        String playagain;
        boolean isPlaying = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("***************************************************************");
        System.out.println("Welcome to slot machine casino! It's your Lucky Day!");
        System.out.println("symbols: \uD83C\uDF52 \uD83C\uDF49 \uD83C\uDF4B \uD83D\uDD14 ⭐");
        System.out.println("***************************************************************");


        while (isPlaying && balance > 0) {
            System.out.println("your balance amount is ₹" + balance);
            System.out.print("Enter your bet amount: ");
            bet = sc.nextInt();
            sc.nextLine();

            if (bet > balance) {
                System.out.println("Insufficient Balance!");
                continue;
            } else if (bet <= 0) {
                System.out.println("bet amount should be greater than zero!");
                continue;
            } else {
                balance -= bet;
            }

            System.out.println("spinning......");
            row = spinrow();
            printrow(row);
            redeem = getredeem(row, bet);

            if(redeem > 0){
                System.out.println("Congratulations, You won ₹." +redeem);
                balance += redeem;
            }
            else{
                System.out.println("Sorry you Lost!");
            }


            while(true){
                System.out.print("Do you want to Play Again(Y/N): ");
                playagain = sc.nextLine().trim().toUpperCase();
                if(playagain.equals("Y")){
                    break;
                }
                else if (playagain.equals("N")){
                    isPlaying = false;
                    break;
                }
                else {
                    System.out.println("Enter valid option! (Y/N): ");
                }
            }


        }


        sc.close();
    }

    static String[] spinrow() {
        String[] symbol = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String[] row = new String[3];

        Random rc = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbol[rc.nextInt(symbol.length)];
        }

//        System.out.print(symbol[rc.nextInt(5)] + " ");
//        System.out.print(symbol[rc.nextInt(5)] + " ");
//        System.out.println(symbol[rc.nextInt(5)]);


        return row;
    }

    static void printrow(String[] row) {
        System.out.println("*************");
        System.out.println(String.join(" | ", row));
        System.out.println("*************");
    }

    static int getredeem(String[] row, int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        }
        else if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }
}
