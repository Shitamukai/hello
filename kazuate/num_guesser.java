import java.util.Scanner;

public class num_guesser {
    public static void main(String[] args) {
        // プログラム内で設定された数（2桁の正の整数）
        int targetNumber = (int)(Math.random() * 90) + 10; // 10〜99の乱数
        int maxAttempts = 5; // 最大試行回数
        Scanner scanner = new Scanner(System.in);

        System.out.println("数あてゲームを始めます！2桁の正の整数を予想してください。");

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("予想した数を入力してください（" + attempt + "回目）: ");
            int userGuess = scanner.nextInt();

            if (userGuess == targetNumber) {
                System.out.println("当たり！");
                break;
            } else {
                int difference = Math.abs(userGuess - targetNumber);
                if (difference > 20) {
                    System.out.println("設定された数と20以上差があります。");
                } else if (userGuess > targetNumber) {
                    System.out.println("設定された数より大きいです。");
                } else {
                    System.out.println("設定された数より小さいです。");
                }

                if (attempt == maxAttempts) {
                    System.out.println("ゲームオーバー！正解は " + targetNumber + " でした。");
                }
            }
        }

        scanner.close();
    }
}
