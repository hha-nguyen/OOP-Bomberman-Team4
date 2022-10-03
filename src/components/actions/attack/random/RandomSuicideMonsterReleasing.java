package components.actions.attack.random;

import components.actions.attack.Attack;
import components.actions.attack.nonstop.SuicideMonsterReleasing;

import java.util.Random;

public class RandomSuicideMonsterReleasing extends SuicideMonsterReleasing {

    private static Random random = new Random();

    public RandomSuicideMonsterReleasing(Attack attack) {
        super(attack);

    }

    @Override
    protected void decorate()
    {
        int chance = random.nextInt(100);

        if (chance == 0) {
            super.decorate();
        }
    }

}
