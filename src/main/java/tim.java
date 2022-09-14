public class tim {
    public static void main(String[] args) {
        boolean gameover = true;
        int score = 5000;
        int levelCompleted =5;
        int bonus = 100;
        if(gameover== true){
            int finalscore = score +(levelCompleted *bonus);
            System.out.println("finalscore was = " + finalscore);

        }
        boolean newGameOver = true;
        int newScore = 1000;
        int newlevelCompleted =8;
        int newBonus = 200;
        if(newGameOver == true){
            int finalscore = newScore +(newlevelCompleted*bonus);
            System.out.println("finalscore was = " + finalscore);

    }
}
