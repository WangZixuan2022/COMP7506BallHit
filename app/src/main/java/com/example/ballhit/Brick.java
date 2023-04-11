package com.example.ballhit;

public class Brick {

    private boolean isVisible;
    public int row, column; // Position in the Bricks Grid
    public int width, height; // Size of the brick

    public Brick(int row, int column, int width, int height) {
        isVisible = true;
        this.row = row;
        this.column = column;
        this.width = width;
        this.height = height;
    }

    public void setInVisible() {
        this.isVisible = false;
    }

    public boolean getVisibility() {
        return this.isVisible;
    }

}
