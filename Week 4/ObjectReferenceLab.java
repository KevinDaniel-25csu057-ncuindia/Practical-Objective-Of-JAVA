import java.util.Scanner;

class ScoreBox {
    private int score;

    public ScoreBox(int score) {
        if (score < 0 || score > 100)
            throw new IllegalArgumentException("Score must be 0 to 100");

        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public boolean setScore(int score) {
        if (score < 0 || score > 100)
            return false;

        this.score = score;
        return true;
    }

    public String toString() {
        return "Score: " + score;
    }
}

public class ObjectReferenceLab {

    static void addBonus(ScoreBox box, int bonus) {
        box.setScore(box.getScore() + bonus);
    }

    static void replaceLocally(ScoreBox box) {
        box = new ScoreBox(100);
        System.out.println("Inside method: " + box);
    }

    static ScoreBox createScoreBox(int score) {
        return new ScoreBox(score);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first score: ");
        int score1 = sc.nextInt();

        ScoreBox box1 = new ScoreBox(score1);

        ScoreBox alias = box1;

        System.out.println("box1: " + box1);
        System.out.println("alias: " + alias);

        System.out.println("box1 == alias: " + (box1 == alias));

        System.out.print("\nEnter bonus: ");
        int bonus = sc.nextInt();

        addBonus(alias, bonus);

        System.out.println("After bonus:");
        System.out.println("box1: " + box1);
        System.out.println("alias: " + alias);

        System.out.print("\nEnter separate score: ");
        int score2 = sc.nextInt();

        ScoreBox box2 = new ScoreBox(score2);

        System.out.println("box1 == box2: " + (box1 == box2));

        replaceLocally(box1);

        System.out.println("box1 after replaceLocally: " + box1);

        System.out.print("\nEnter score for new object: ");
        int score3 = sc.nextInt();

        ScoreBox box3 = createScoreBox(score3);

        System.out.println("box3: " + box3);
        System.out.println("box1 == box3: " + (box1 == box3));

        sc.close();
    }
}