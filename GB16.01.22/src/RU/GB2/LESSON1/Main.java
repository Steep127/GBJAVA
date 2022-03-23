package RU.GB2.LESSON1;

public class Main {
    public static void main(String[] arg) {


        String[] playerNamesOfKolobkiTeam = new String[]{"Petr", "Andrey", "Alex", "Mass"};
        Boolean[] playerBoolenRun = new Boolean[]{true, false, true, true};
        Boolean[] playerBoolenJump = new Boolean[]{true, false, true, true};
        Boolean[] playerResulstat = new Boolean[]{false, false, false, false};
        Team kolobkiTeam = new Team("kolobku", playerNamesOfKolobkiTeam, playerBoolenRun, playerBoolenJump, playerResulstat);
        kolobkiTeam.showAllPlayerNames();
        System.out.println("");
        System.out.println("");
        Course.doIt(kolobkiTeam.getResultat(), kolobkiTeam.getRun(), kolobkiTeam.getJump());
        System.out.println("");
        System.out.println("");
        kolobkiTeam.showResults();

    }
}