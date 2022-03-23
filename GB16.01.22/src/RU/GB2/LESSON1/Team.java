package RU.GB2.LESSON1;

public class Team {
    private String name;
    private String[] playerNames;
    // private String[] playerNamesWhichPassedCourse;
    private Boolean[] run;
    private Boolean[] jump;
    private Boolean[] resultat;


    Team(String _name, String[] _playerNames, Boolean[] _run, Boolean[] _jump, Boolean[] _resulstat) {
        name = _name;
        playerNames = _playerNames;
        run = _run;
        jump = _jump;
        resultat = _resulstat;
    }

    public void showAllPlayerNames() {
        this.printStringArray(this.playerNames, this.run, this.jump, this.resultat);

    }

    public Boolean[] getRun() {
        return run;
    }

    public Boolean[] getJump(){
        return jump;
    }

    public Boolean[] getResultat(){
        return resultat;
    }

    public void setResultat(Boolean[] resultat) {
        this.resultat = resultat;
    }

    public void showResults() {
        this.printStringArrayWinner(this.playerNames, this.resultat);
    }

    private void printStringArray(String[] array, Boolean[] rrun, Boolean[] jjump, Boolean[] rresultat) {
        for (int i=0; i < array.length; i++) {
            System.out.println("Player Name: " + array[i] + " | Player can run: " + rrun[i] + " | Player can jump: " +  jjump[i]);
        }
    }

    private void printStringArrayWinner(String[] array, Boolean[] rresultat){
        for (int i = 0; i < array.length; i++){
            if (rresultat[i] == true){
                System.out.println("Player name: " + array[i] + "| win is: " + rresultat[i]);
            }
        }
    }

}
