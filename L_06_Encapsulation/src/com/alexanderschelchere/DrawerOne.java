package com.alexanderschelchere;

public class DrawerOne {

    private boolean locked;
    private boolean hasFiles;
    private boolean hasLunch;

    public DrawerOne() {
        this(false, false, true);
    }

    private DrawerOne(boolean locked, boolean hasFiles, boolean hasLunch) {
        this.locked = locked;
        this.hasFiles = hasFiles;
        this.hasLunch = hasLunch;
    }

    public void openDrawer() {
        searchDrawer();
    }

    private boolean searchDrawer() {
        System.out.println("Nothin' here but a gross sandwich!");
        return this.hasFiles;
    }

    public boolean isLocked() {
        return locked;
    }

    public boolean isHasFiles() {
        return hasFiles;
    }

    public boolean isHasLunch() {
        return hasLunch;
    }
}
