import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Translator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel germanlabel = new JLabel("Deutschen Text:");
        JTextArea germanTextArea = new JTextArea(5, 30);

        JLabel russianlabel = new JLabel("Русский Текст:");
        JTextArea russianTextArea = new JTextArea(5, 30);

        JButton saveButton = new JButton("Сохранить");

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(germanlabel);
        panel.add(new JScrollPane(germanTextArea));
        panel.add(Box.createVerticalStrut(10));

        panel.add(russianlabel);
        panel.add(new JScrollPane(russianTextArea));
        panel.add(Box.createVerticalStrut(10));

        panel.add(saveButton);

        add(panel);
    }
}
