package jp.ac.uryukyu.ie.e185749;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {
    @Test
    void attack() {
        int enemyHP = 10;
        int heroHP = 3;
        Hero hero = new Hero("テスト勇者", heroHP, 5);
        Enemy enemy = new Enemy("テストスライム", enemyHP, 3);
        hero.dead = true;
        for(int i=0; i<10; i++) {
            hero.attack(enemy); //乱数で0ダメージとなることもあるため、複数回実行してみる。
        }
        assertEquals(enemyHP, enemy.hitPoint);
    }

}