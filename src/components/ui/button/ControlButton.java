package components.ui.button;

import asset.Asset;
import config.KeyConfig;
import core.Handler;
import core.Router;
import modules.Provider;

import java.awt.event.KeyEvent;

public class ControlButton extends Button {

    public ControlButton(int column, int row, int left, int right, int top, int bottom) {
        super(column, row, left, right, top, bottom);
    }

    @Override
    protected void setElementParameters() {
        width = 167;
        height = 55;
    }

    @Override
    protected void loadAllFrames() {
        frames.add(Asset.get("ui04").crop(181, 251, 76, 31));
        frames.add(Asset.get("ui04").crop(181, 251, 76, 31));

        currentFrame = frames.get(0);
    }

    @Override
    public void onClick() {
        if (KeyConfig.isCursor) {
            KeyConfig.UP = KeyEvent.VK_W;
            KeyConfig.DOWN = KeyEvent.VK_S;
            KeyConfig.LEFT = KeyEvent.VK_A;
            KeyConfig.RIGHT = KeyEvent.VK_D;
            KeyConfig.isCursor = false;
        } else {
            KeyConfig.UP = KeyEvent.VK_UP;
            KeyConfig.DOWN = KeyEvent.VK_DOWN;
            KeyConfig.LEFT = KeyEvent.VK_LEFT;
            KeyConfig.RIGHT = KeyEvent.VK_RIGHT;
            KeyConfig.isCursor = true;
        }
        Handler handler = Handler.getInstance();
        handler.launch();
    }
}
