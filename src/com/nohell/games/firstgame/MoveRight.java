package com.nohell.games.firstgame;

public class MoveRight implements MoveStrategy{
    private float x,y,speed;

    public MoveRight(float x, float y, float speed) {
        super();
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void update (int delta){
        this.x += delta * speed;
        this.y += delta * (speed/2);
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
