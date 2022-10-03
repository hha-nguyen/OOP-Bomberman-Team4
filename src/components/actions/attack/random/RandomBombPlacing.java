package components.actions.attack.random;

import components.actions.attack.Attack;
import components.actions.attack.nonstop.BombPlacing;
import components.entities.statics.bombs.Bomb;

import java.util.Random;

public class RandomBombPlacing extends BombPlacing {

    private static Random random = new Random();

    public RandomBombPlacing(Attack attack, Bomb bomb) {
        super(attack, bomb);
    }

    @Override
    protected void decorate() {
        int chance = random.nextInt(100);

        if (chance == 0) {
            super.decorate();
        }
    }
}
