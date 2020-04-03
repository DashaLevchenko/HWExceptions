import exceptions.EmailException;
import exceptions.KeyboardException;

/**
 * Father send email by his computer
 */
public class Father extends GrandFather {
    private boolean hasEmailAccount = false;
    private boolean keyboardConnection = true;

    @Override
    public void sendLetter() {
        try {
            logger.info("Father want to write an email to his classmate");
            writeLetter();
            pushSendButton();
        } catch (EmailException | KeyboardException e) {
            logger.error(e);
        }
    }

    public void pushSendButton() {
        //pushing button "Send"
    }

    @Override
    public void writeLetter() throws EmailException, KeyboardException {
        logger.warn("When father wants to write an email, he must have an account and keyboard connection");
        if(!hasEmailAccount){
            throw new EmailException("You need to create an account!");
        }
        if(keyboardConnection){
            throw  new KeyboardException("Your keyboard unconnected!");
        }
    }

    public void setHasEmailAccount(boolean hasEmailAccount) {
        this.hasEmailAccount = hasEmailAccount;
    }

    public void setKeyboardConnection(boolean keyboardConnection) {
        this.keyboardConnection = keyboardConnection;
    }
}
