package com.alexanderschelchere;

public class DrawerTwo {
    private boolean locked;
    private boolean hasFiles;
    private boolean hasLunch;

    public DrawerTwo() {
        this(true, true, false);
    }

    private DrawerTwo(boolean locked, boolean hasFiles, boolean hasLunch) {
        this.locked = locked;
        this.hasFiles = hasFiles;
        this.hasLunch = hasLunch;
    }

    public void unlockDrawer() {
        this.locked = false;
    }

    public boolean openDrawer() {
        if (locked) {
            System.out.println("I'll need to find the key in order to open this drawer...");
            return false;
        }
        return searchDrawer();
    }

    private boolean searchDrawer() {
        System.out.println("Sweet! I think these files may have the password to the computer!");
        return this.hasFiles;
    }

    public boolean isHasLock() {
        return locked;
    }

    public boolean isHasFiles() {
        return hasFiles;
    }

    public boolean isHasLunch() {
        return hasLunch;
    }
}
