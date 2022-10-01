package Style;

import Style.Interface.IStyleStrategy;

public class CoreStrategy implements IStyleStrategy {
    @Override
    public void play(String team) {
        System.out.println(team + "will play in core style");
    }
}
