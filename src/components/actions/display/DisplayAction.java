package components.actions.display;

import components.entities.Entity;

import java.awt.*;

public class DisplayAction implements Display {

    private Entity entity;

    public DisplayAction(Entity entity) {
        this.entity = entity;
    }

    @Override
    public Entity getEntity() {
        return entity;
    }

    @Override
    public void display(Graphics graphics) {
        //
    }
}
