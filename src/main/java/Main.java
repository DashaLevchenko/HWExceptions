public class Main {
    public static void main(String[] args) {
        GrandFather grandFather = new GrandFather();
        grandFather.setHasPaper(false);
        grandFather.sendLetter();
        System.out.println();

        Father father = new Father();
        father.sendLetter();
        System.out.println();

        Son son = new Son();
        son.setMessengerWasUpdated(false);
        son.sendLetter();
    }
}
