import java.util.Scanner;

public class num_guesser {
    public static void main(String[] args) {
        // 2桁の正の整数をランダムに生成
        int targetNumber = (int) (Math.random() * 90) + 10;
        Scanner scanner = new Scanner(System.in);
        int attempts = 5;

        System.out.println("数あてゲームを始めます！2桁の正の整数を予想してください。");

        for (int i = 0; i < attempts; i++) {
            System.out.print((i + 1) + "回目の入力: ");
            int userGuess = scanner.nextInt();

            if (userGuess == targetNumber) {
                System.out.println("当たり！");
                break;
            } else {
                int difference = Math.abs(userGuess - targetNumber);
                if (difference > 20) {
                    System.out.println("20以上差があります。");
                } else if (userGuess > targetNumber) {
                    System.out.println("設定された数より大きいです。");
                } else {
                    System.out.println("設定された数より小さいです。");
                }
            }

            if (i == attempts - 1) {
                System.out.println("ゲームオーバー！正解は " + targetNumber + " でした。");
            }
        }

        scanner.close();
    }
}
