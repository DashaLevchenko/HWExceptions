import exceptions.PaperException;
import exceptions.PenException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Grandfather send paper mail by POST
 */
public class GrandFather {
    private boolean hasPen = true;
    private boolean hasPaper = true;
    protected static final Logger logger = LogManager.getLogger(GrandFather.class.getName());


    public void sendLetter() {
        try {
            logger.info("Grandfather want to write a letter to his friend which live in another city");
            writeLetter();
            goToThePost();
        } catch (PenException | PaperException e) {
            logger.error(e);
        }
    }

    public void writeLetter() throws PaperException, PenException {
        logger.warn("When grandfather wants to write a letter, he must have a pen and paper");
        if (!hasPaper) {
            throw new PaperException("You haven't got paper!You need to buy paper!");
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
