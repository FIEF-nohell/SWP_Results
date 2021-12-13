package com.nohell.games.firstgame;

import java.util.ArrayList;
import java.util.List;

import org.newdawn.slick.*;

public class MainGame extends BasicGame {

    private List<Actor> actors;

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        for (Actor actor : this.actors) {
            actor.render(graphics);
        }
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        MoveStrategy ms1 = new MoveRight(100, 100, 0.3f);
        MoveStrategy ms2 = new MoveRight(100, 200, 0.1f);
        MoveStrategy ms3 = new MoveLeft(850, 400, 0.2f);
        MoveStrategy ms4 = new MoveLeft(500, 100, 0.2f);
        MoveStrategy ms5 = new MoveRight(700, 100, 0.8f);

        this.actors = new ArrayList<>();
        this.actors.add(new CircleActor(ms1));
        this.actors.add(new CircleActor(ms2));
        this.actors.add(new RectActor(ms4));
        this.actors.add(new RectActor(ms5));
        this.actors.add(new CircleActor(ms3));
        this.actors.add(new HomerActor());
    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        for (Actor actor : this.actors) {
            actor.update(gc, delta);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("ala ala"));
            container.setDisplayMode(1700, 800, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
