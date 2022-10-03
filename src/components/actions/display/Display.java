package components.actions.display;

import components.entities.Entity;

import java.awt.*;

public interface Display {
    public Entity getEntity();

    public void display(Graphics graphics);
}
