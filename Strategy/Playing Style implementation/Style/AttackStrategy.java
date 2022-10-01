package Style;

import Style.Interface.IStyleStrategy;

public class AttackStrategy implements IStyleStrategy {
    @Override
    public void play(String team) {
        System.out.println(team + " will play in attacking style");
    }
}
