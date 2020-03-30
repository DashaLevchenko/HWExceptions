import exceptions.MessengerException;
import exceptions.VirtualKeyboardException;

/**
 * Son sens message by messenger in his phone
 */
public class Son extends Father {
    private boolean messengerWasUpdated = true;
    private boolean virtualKeyboardWasUpdated = true;

    @Override
    public void sendLetter() {
        try {
            writeLetter();
            pushSendButton();
        } catch (MessengerException | VirtualKeyboardException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void writeLetter() throws MessengerException, VirtualKeyboardException {
        if(!messengerWasUpdated){
            throw new MessengerException("You have old version of messenger, you need to update it!");
        }
        if(!virtualKeyboardWasUpdated){
            throw new VirtualKeyboardException("You have old version of keyboard, you need to update it!");
        }
    }

    public void setMessengerWasUpdated(boolean messengerWasUpdated) {
        this.messengerWasUpdated = messengerWasUpdated;
    }

    public void setVirtualKeyboardWasUpdated(boolean virtualKeyboardWasUpdated) {
        this.virtualKeyboardWasUpdated = virtualKeyboardWasUpdated;
    }
}
