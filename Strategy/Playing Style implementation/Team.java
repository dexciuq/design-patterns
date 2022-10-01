import Style.Interface.IStyleStrategy;

public class Team {
    private String name;
    private IStyleStrategy playingStyle;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPlayingStyle(IStyleStrategy playingStyle) {
        this.playingStyle = playingStyle;
        playingStyle.play(name);
    }
}
