package app.views;

import components.ui.Element;
import components.ui.button.*;
import components.ui.image.menu.MenuBackground;
import components.ui.text.options.*;
import config.KeyConfig;

import java.awt.*;
import java.util.ArrayList;

public class OptionsView extends View {
    private boolean isCursor = true;
    private int cursorFlag = 1;
    private int spaceFlag = 0;
    @Override
    public void buildUI() {
        elements = new ArrayList<Element>();

        // Add background
        elements.add(new MenuBackground(6, 6, 0, 0, 0, 0));

        // Add butons
        elements.add(new ReturnButton(1, 1, 0, 0, 0, 0));
        elements.add(new ControlButton(6, 7, 0, 0, 0, 0));


        // Add text
        elements.add(new OptionSelectionTitle(6, 2, 0, 0, 0, 0));
        elements.add(new OptionDescriptionTitle(6, 3, 0, 0, 0, 0));
        elements.add(new MoveSelectionTitle(6, 6, 0, 0, 0, 0));

        elements.add(new MoveSelectionCursor(6, 7, 0, 0, 0, 0));
    }

    @Override
    public void reset() {
        //
    }

    @Override
    public void tick() {
        elements.forEach(button -> button.tick());
        if (KeyConfig.isCursor) {
            elements.remove(elements.size() - 1);
            elements.add(new MoveSelectionCursor(6, 7, 0, 0, 0, 0));
        } else {
            elements.remove(elements.size() - 1);
            elements.add(new MoveSelectionWASD(6, 7, 0, 0, 0, 0));
        }
    }

    @Override
    public void render(Graphics graphics) {
        elements.forEach(button -> button.render(graphics));
    }
}
