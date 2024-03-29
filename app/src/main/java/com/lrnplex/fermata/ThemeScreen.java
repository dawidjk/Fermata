package com.lrnplex.fermata;

import com.lrnplex.framework.Game;
import com.lrnplex.framework.Graphics;
import com.lrnplex.framework.Music;
import com.lrnplex.framework.Screen;

/**
 * Created by David on 7/6/2016.
 */
public class ThemeScreen extends Screen {
    private Music music = game.getMusic();
    public ThemeScreen(Game game){
        super(game);
    }

    @Override
    public void update(float deltaTime){

    }

    @Override
    public void present(float deltaTime){
        Graphics g = game.getGraphics();

        g.drawPixmap(Assets.getBackground(), 0, 0);

    }

    @Override
    public void pause() {
        music.pause();
    }

    @Override
    public void resume() {
        if(Settings.soundEnabled)
            music.play();
    }

    @Override
    public void dispose() {
    }
}
