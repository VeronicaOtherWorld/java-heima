package Q1_fighting_game;

public class FightingGameApp {
    public static void main(String[] args) {
        FightingGame role1 = new FightingGame("lisa", 20);
        FightingGame role2 = new FightingGame("jacky", 20);
        while (true){
            if(role2.getHp() > 0) {
                role1.attack(role2);
            } else {
                System.out.println(role1.getName() + "won");
                break;
            }
            if(role1.getHp() > 0) {
                role2.attack(role1);
            } else {
                System.out.println(role2.getName() + "won");
                break;
            }
        }
    }
}
