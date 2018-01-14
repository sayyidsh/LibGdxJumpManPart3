package pro.nanosystems.jumpman;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class JumpMan extends ApplicationAdapter {
    SpriteBatch batch;
    Texture background;
    // TODO (1) Declare Man texture: Texture[] man;
    Texture[] man;
    // TODO (2) Declare manState for index: int manState = 0;
    int manState = 0;

    @Override
    public void create() {
        batch = new SpriteBatch();
        background = new Texture("bg.png");
        // TODO (3) Instantiate man object: man = new Texture[4];
        man = new Texture[4];
        // TODO (4) Instantiate man elements object:
        // TODO (4.1)man[0] = new Texture("frame-1.png");
        man[0] = new Texture("frame-1.png");
        // TODO (4.2) man[1] = new Texture("frame-2.png");
        man[1] = new Texture("frame-2.png");
        // TODO (4.3)man[2] = new Texture("frame-3.png");
        man[2] = new Texture("frame-3.png");
        // TODO (4.4) man[3] = new Texture("frame-4.png");
        man[3] = new Texture("frame-4.png");
    }

    @Override
    public void render() {
        batch.begin();
        // draw scene
        batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        // TODO (5) control manState to be fom 0 to 3
            if (manState < 3) {
                manState++;
            } else manState = 0;
        // TODO (60) Draw man texture
        batch.draw(man[manState],
                Gdx.graphics.getWidth() / 2 - man[manState].getWidth() / 2,
                Gdx.graphics.getHeight() / 2  - man[manState].getHeight() /2
        );
        batch.end();
    }
    @Override
    public void dispose() {
        batch.dispose();
        background.dispose();
        // TODO (7) dispose man Object
        for(int i = 0; i < 4; i++){
            man[i].dispose();
        }
    }
}
