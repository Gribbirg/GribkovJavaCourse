package Practice_24.Ex_3.TextDocument;

import Practice_24.Ex_3.IDocument;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class TextDocument implements IDocument {
    private File file;

    private JTextArea jTextArea;

    public TextDocument(File file) {
        this.file = file;
    }

    @Override
    public String getPath() {
        return file.getPath();
    }

    @Override
    public void save() throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(jTextArea.getText());
        fileWriter.close();
    }

    @Override
    public void createEditor(JFrame jFrame) throws IOException {
        Scanner scanner = new Scanner(file);
        StringBuilder text = new StringBuilder();
        if (scanner.hasNextLine()) {
            text.append(scanner.nextLine());
            while (scanner.hasNextLine()) {
                text.append("\n");
                text.append(scanner.nextLine());
            }
        }
        jTextArea = new JTextArea(text.toString());
        jFrame.add(jTextArea);
        jFrame.setVisible(true);
    }

    @Override
    public void removeEditor(JFrame jFrame) {
        jFrame.remove(jTextArea);
        jFrame.repaint();
    }
}
