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
            logger.info("Son want to write a message to his friend");
            writeLetter();
            pushSendButton();
        } catch (MessengerException | VirtualKeyboardException e) {
            logger.error(e);
        }
    }

    @Override
    public void writeLetter() throws MessengerException, VirtualKeyboardException {
        logger.warn("When son wants to write a message, he must have actual version of messenger and virtual keyboard");
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
