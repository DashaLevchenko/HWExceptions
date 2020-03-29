import exceptions.PaperException;
import exceptions.PenException;

/**
 * Grandfather send paper mail by POST
 */
public class GrandFather {
    private boolean hasPen = false;
    private boolean hasPaper = false;


    public void sendLetter() {
        try {
            writeLetter();
            goToThePost();
        } catch (PenException | PaperException e) {
            System.out.println(e.getMessage());
        }

    }

    public void writeLetter() throws PaperException, PenException {
        if (!hasPaper) {
            throw new PaperException("You haven't got paper!");
        }
        if (!hasPen) {
            throw new PenException("Your pen haven't got ink!Buy new pen");
        }
    }
    public void setHasPen(boolean hasPen) {
        this.hasPen = hasPen;
    }

    public void setHasPaper(boolean hasPaper) {
        this.hasPaper = hasPaper;
    }

    private void goToThePost() {
        //going to the Post for send letter
    }


}
