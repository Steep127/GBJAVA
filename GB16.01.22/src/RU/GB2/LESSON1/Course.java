package RU.GB2.LESSON1;

public class Course {
    private boolean run = true;
    private boolean jump = true;

    Course(boolean _run, boolean _jump) {
        run = _run;
        jump = _jump;
    }



    public static void doIt(Boolean[] resultat_, Boolean[] run_, Boolean[] jump_) {
        for (int i = 0; i < resultat_.length; i++){
            if (run_[i] == true && jump_[i] == true){
                resultat_[i] = true;
            }
            else {
                resultat_[i] = false;
            }
        }
    }
}