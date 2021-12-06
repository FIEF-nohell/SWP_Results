package com.nohell.games.firstgame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class RectActor implements Actor {
    private MoveStrategy movestrategy;

    public RectActor(MoveStrategy mr) {
        super();
        this.movestrategy = mr;
    }

    public void update(GameContainer gc, int delta){
        movestrategy.update(delta);
    }

    public void render(Graphics graphics){
        graphics.drawRect(this.movestrategy.getX(), this.movestrategy.getY(), 20, 20);
    }

}
