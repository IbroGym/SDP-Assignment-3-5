class Caretaker {
    private TextMemento memento;

    public void saveState(TextMemento memento) {
        this.memento = memento;
    }

    public TextMemento getState() {
        return memento;
    }
}
