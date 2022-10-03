package components.actions.move.conllision;

import components.actions.collide.entity.ObstacleCollision;
import components.actions.move.Move;
import components.actions.move.MoveDecorator;

public class AvoidingObstacle extends MoveDecorator {

    public AvoidingObstacle(Move move) {
        super(move);

        this.setCollision(new ObstacleCollision(this.getCollision()));
    }

    @Override
    protected void decorate() {
        //
    }
}
