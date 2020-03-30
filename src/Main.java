public class Main {
    public static void main(String[] args) {
        System.out.println("Grandfather want to write a letter to his friend which live in another city");
        GrandFather grandFather = new GrandFather();
        grandFather.setHasPaper(false);
        grandFather.sendLetter();
        System.out.println();

        System.out.println("Father want to write an email to his classmate");
        Father father = new Father();
        father.sendLetter();
        System.out.println();

        System.out.println("Son want to write a message to his friend");
        Son son = new Son();
        son.setMessengerWasUpdated(false);
        son.sendLetter();
    }

}
