import Style.AttackStrategy;
import Style.CoreStrategy;
import Style.DefenceStrategy;

public class Main {
    public static void main(String[] args) {
        Team kazakhstanTeam = new Team("Astana FC");
        Team spainTeam = new Team("Barcelona FC");

        kazakhstanTeam.setPlayingStyle(new AttackStrategy());
        spainTeam.setPlayingStyle(new CoreStrategy());

        System.out.println("GOOOAALL!!" + kazakhstanTeam.getName() + "scored a goal against an opponent. Score: 1 - 0");

        kazakhstanTeam.setPlayingStyle(new DefenceStrategy());

        System.out.println("And match is over! Score was: 1 - 0. Wins -> " + kazakhstanTeam.getName());


    }
}