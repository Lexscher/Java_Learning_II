package com.alexanderschelchere;

public class Desk {
    private DrawerOne drawer1;
    private DrawerTwo drawer2;
    private boolean key;

    public Desk(DrawerOne drawer1, DrawerTwo drawer2) {
        this(drawer1, drawer2, false);
    }

    private Desk(DrawerOne drawer1, DrawerTwo drawer2, boolean key) {
        this.drawer1 = drawer1;
        this.drawer2 = drawer2;
        this.key = key;
    }

    public void searchFirstDrawer() {
        getDrawer1().openDrawer();
    }

    public void searchSecondDrawer() {
        getDrawer2().openDrawer();
    }

    public void searchForTheKey() {
        this.key = true;
    }

    public void unlock() {
        if (!this.key) {
            System.out.println("We need to find the key!");
            return;
        }
        System.out.println("*Clicks*");
        getDrawer2().unlockDrawer();
        System.out.println("Ok, Great! That's unlocked now");
    }

    private DrawerOne getDrawer1() {
        return drawer1;
    }

    private DrawerTwo getDrawer2() {
        return drawer2;
    }

    public boolean isKey() {
        return key;
    }
}
