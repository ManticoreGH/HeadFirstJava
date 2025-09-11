import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;


public class QuizCardBuilder {
    private ArrayList<QuizCard> cardList = new ArrayList<>();
    private JTextArea question;
    private JTextArea answer;
    private JFrame frame;

    public static void main(String[] args) throws Exception {
        new QuizCardBuilder().go();
    }

    public void go() {
        // Build and display GUI.
        frame = new JFrame("Quiz Card Builder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        Font bigFont = new Font("sanserif", Font.BOLD, 24);
        question = createTextArea(bigFont);
        JScrollPane qScroller = new JScrollPane(question);
        answer = createTextArea(bigFont);
        JScrollPane aScroller = new JScrollPane(answer);

        mainPanel.add(new JLabel("Question:"));
        mainPanel.add(qScroller);
        mainPanel.add(new JLabel("Answer:"));
        mainPanel.add(aScroller);

        JButton nextButton = new JButton("Next Card");
        nextButton.addActionListener(e -> nextCard());
        mainPanel.add(nextButton);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        JMenuItem newMenuItem = new JMenuItem("New");
        newMenuItem.addActionListener(e -> clearAll());

        JMenuItem saveMenuItem = new JMenuItem("Save");
        saveMenuItem.addActionListener(e -> saveCard());

        fileMenu.add(newMenuItem);
        fileMenu.add(saveMenuItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(500, 600);
        frame.setVisible(true);
    }

    private JScrollPane createScroller(JTextArea textArea) {
        JScrollPane scroller = new JScrollPane(textArea);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        return scroller;
    }

    private JTextArea createTextArea(Font font) {
        JTextArea textArea = new JTextArea(6, 20);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(font);
        return textArea;
    }

    
    private void nextCard() {
        // Add the current card to the list
        // and clear the text area.
        QuizCard card = new QuizCard(question.getText(), answer.getText());
        cardList.add(card);
        clearCard();
    }

    private void saveCard(){
        // Iterate through the list of cards and write
        // each one out to a text file in a parseable way 
        // (in other words, with clear separations between parts).
        QuizCard card = new QuizCard(question.getText(), answer.getText());
        cardList.add(card);
        
        JFileChooser fileSave = new JFileChooser();
        fileSave.showSaveDialog(frame);
        saveFile(fileSave.getSelectedFile());
    }
    
    private void clearAll() {
        cardList.clear();
        clearCard();
    }
    
    private void clearCard(){
        // Clear out the text areas.
        question.setText("");
        answer.setText("");
        question.requestFocus();
    }
    private void saveFile(File file) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (QuizCard card : cardList) {
                writer.write(card.getQuestion() + "/");
                writer.write(card.getAnswer() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("couldn't write the cardList out: " + e.getMessage());
        }
    }
}
