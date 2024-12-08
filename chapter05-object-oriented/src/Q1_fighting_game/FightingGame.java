package Q1_fighting_game;

import java.util.Random;

// javabean
public class FightingGame {
    private String name;
    private int hp;
    private int remainHP;

    public FightingGame() {
    }

    public FightingGame(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getRemainHP() {
        return remainHP;
    }

    public void setRemainHP(int remainHP) {
        this.remainHP = remainHP;
    }

    public void attack (FightingGame role) {
        Random rand = new Random();
        int hurt = rand.nextInt(1,10);
        remainHP = role.getHp() - (hurt);
        remainHP = remainHP < 0 ? 0 : remainHP;
        role.setHp(remainHP);
        System.out.println(this.getName() + " attacked " + role.getName() + " with hp " + hurt + ", the remain HP is " + role.getHp());
    }
}
