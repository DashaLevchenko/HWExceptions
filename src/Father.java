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
            writeLetter();
            pushSendButton();
        } catch (EmailException | KeyboardException e) {
            System.out.println(e.getMessage());
        }
    }

    public void pushSendButton() {
        //pushing button "Send"
    }

    @Override
    public void writeLetter() throws EmailException, KeyboardException {
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
