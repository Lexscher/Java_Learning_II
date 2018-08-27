package com.alexanderschelchere;

public class Main {

    public static void main(String[] args) {
        // BAD.
//	    Player player = new Player();
//	    player.name = "alex";
//	    player.health = 9001;
//	    player.weapon = "Nen";
//
//	    int damage = 11;
//	    player.loseHealth(damage);
//        damageControl(player.name, player.health);
//
//        damage = 8991;
//        player.health = 9000;
//        player.loseHealth(damage);
//        damageControl(player.name, player.health);
        EnhancedPlayer hunter = new EnhancedPlayer("Gon", 280, "Jajanken");
        System.out.println("initial health is " + hunter.getHealth());
    }

    public static void damageControl(String name, int health) {
        System.out.println("Remaining Health for " + name + " = " + health);
    }

}
