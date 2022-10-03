package components.actions.move.conllision;

import components.actions.collide.entity.BlockCollision;
import components.actions.move.Move;
import components.actions.move.MoveDecorator;

public class AvoidingBlock extends MoveDecorator {

    public AvoidingBlock(Move move) {
        super(move);

        this.setCollision(new BlockCollision(this.getCollision()));
    }

    @Override
    protected void decorate() {
        //
    }
}
