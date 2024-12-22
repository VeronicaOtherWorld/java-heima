package Q1_athlete;

public class TennisCoach extends Coach {
    public TennisCoach() {
    }

    public TennisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("TennisCoach teach");
    }
}
