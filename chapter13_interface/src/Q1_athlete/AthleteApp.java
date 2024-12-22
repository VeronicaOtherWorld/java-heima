package Q1_athlete;

public class AthleteApp {
    public static void main(String[] args) {
        BasketballAthlete athlete = new BasketballAthlete();
        BasketballCoach coach = new BasketballCoach();
        TennisAthlete tennis = new TennisAthlete();
        TennisCoach tennisCoach = new TennisCoach();
        athlete.learningEnglish();
        athlete.learn();
        coach.teach();
        tennisCoach.teach();
        tennis.learn();
        tennisCoach.teach();
        tennis.learningEnglish();
    }
}
