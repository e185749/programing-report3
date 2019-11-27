package jp.ac.uryukyu.ie.e185749;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    public LivingThing(String name,int hitPoint,int attack){
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        dead = false;
    }
    public boolean isDead() {
        return dead;
    }
    public String getName() {
        return name;
    }

    public void attack(LivingThing opponent){
        if(dead){
            System.out.printf("%sは死んでいる\n",name);
            return;
        }
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.name, damage);
        opponent.wounded(damage);
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%s倒れた。\n", name);
        }
    }
}
