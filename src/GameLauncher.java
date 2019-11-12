class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    public  void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guesssp1 = 0;
        int guesssp2 = 0;
        int guesssp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNember = (int) (Math.random()*10);
        System.out.println("Я загадываю число от 0 до 9..");

        while (true) {
            System.out.println("Число, которое нужно угадать - "+targetNember);
            p1.guess();
            p2.guess();
            p3.guess();

            guesssp1 = p1.number;
            System.out.println("Первый игрок думает, что это цифра - "+guesssp1);

            guesssp2 = p2.number;
            System.out.println("Второй игрок думает, что это цифра - "+guesssp2);

            guesssp2 = p3.number;
            System.out.println("Третий игрок думает, что это цифра - "+guesssp3);

            if (guesssp1 == targetNember) {
                p1isRight = true;
            }

            if (guesssp2 == targetNember) {
                p2isRight = true;
            }

            if (guesssp3 == targetNember) {
                p3isRight = true;
            }

            if (p1isRight||p1isRight||p3isRight) {
                System.out.println("У нас победитель!");
                System.out.println("Первый игрок угадал?"+p1isRight);
                System.out.println("Второй игрок угадал?"+p2isRight);
                System.out.println("Третий игрок угадал?"+p3isRight);
                System.out.println("Конец игры");
                break;
            } else {
                System.out.println("Игроки должны попробовтаь еще раз");
            }
        }
    }
}





 class Player{
    int number = 0;
    public void guess() {
        number = (int) (Math.random()*10);
        System.out.println("Я думаю это число "+number);
    }

}

public class GameLauncher {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();

    }
}
