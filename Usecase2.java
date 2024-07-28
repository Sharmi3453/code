interface Command {
    void execute();
}

class TextEditor {
    private String text = "";
    private String clipboard = "";

    public void setText(String text) {
        this.text = text;
    }

    public void copy() {
        clipboard = text;
    }

    public void paste() {
        text += clipboard;
    }

    public void showText() {
        System.out.println(text);
    }
}

class CopyCommand implements Command {
    private TextEditor editor;

    public CopyCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.copy();
    }
}

class PasteCommand implements Command {
    private TextEditor editor;

    public PasteCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.paste();
    }
}

public class Usecase2 {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.setText("Hello, World!");

        Command copyCommand = new CopyCommand(editor);
        Command pasteCommand = new PasteCommand(editor);

        copyCommand.execute();
        editor.setText("Hello, ");
        pasteCommand.execute();
        editor.showText();  // Output: Hello, Hello, World!
    }
}
