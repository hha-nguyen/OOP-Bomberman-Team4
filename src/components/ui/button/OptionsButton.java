package components.ui.button;

import asset.Asset;
import core.Router;

public class OptionsButton extends Button{
    public OptionsButton(int column, int row, int left, int right, int top, int bottom) {
        super(column, row, left, right, top, bottom);
    }

    @Override
    protected void setElementParameters() {
        width = 201;
        height = 49;
    }

    @Override
    protected void loadAllFrames() {
        frames.add(Asset.get("ui01").crop(243, 142, 122, 24));
        frames.add(Asset.get("ui02").crop(402, 237, 201, 49));

        currentFrame = frames.get(0);
    }

    @Override
    public void onClick() {
        Router.getInstance().redirect("OptionsMenu", false);
    }
}
