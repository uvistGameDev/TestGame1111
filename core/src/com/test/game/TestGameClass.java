package com.test.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.utils.viewport.ScreenViewport;


public class TestGameClass extends Game {
	SpriteBatch batch;
	Texture texture;
	Stage stage;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		texture = new Texture("bg_map.png");
		stage = new Stage(new ScreenViewport());
		Table main = new Table();
		main.setFillParent(true);
	}

	@Override
	public void render () {
		batch.begin();
		batch.draw(texture, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		texture.dispose();
	}







	//	@Override
//	public boolean touchDown(int x, int y, int pointer, int button) {
//		if((height-y)/ppuY >= 213 && (height-y)/ppuY <= 283 && x/ppuX>=660 && x/ppuX<=780)
//			downBtn = true;
//		return true;
//	}
//
//	@Override
//	public boolean touchUp(int x, int y, int pointer, int button) {
//		if (!Gdx.app.getType().equals(Application.ApplicationType.Android))
//		return false;
//		if(downBtn){
//			dispose();
//			game.setScreen(game.game);
//		}
//		downBtn = false;
//		return true;
//	}
}
