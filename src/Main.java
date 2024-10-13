public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.addText("Как вы родные? ");
        caretaker.saveState(editor.save());

        editor.addText("Это если что пример паттерна Мементо");
        System.out.println("Current Text: " + editor.getText());

        editor.restore(caretaker.getState());
        System.out.println("Restored Text: " + editor.getText());
    }
}
