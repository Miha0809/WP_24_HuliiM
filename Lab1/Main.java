import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main extends JFrame {
  private JButton button_1 = new JButton("1");
  private JButton button_2 = new JButton("2");
  private JButton button_3 = new JButton("3");
  private JButton button_4 = new JButton("4");
  private JButton button_5 = new JButton("5");
  private JButton button_6 = new JButton("6");
  private JButton button_7 = new JButton("7");
  private JButton button_8 = new JButton("8");
  private JButton button_9 = new JButton("9");
  private JButton button_0 = new JButton("0");
  private JButton button_multi = new JButton("*");
  private JButton button_div = new JButton("/");
  private JButton button_minus = new JButton("-");
  private JButton button_plus = new JButton("+");
  private JButton button_C = new JButton("C");
  private JButton button_undo = new JButton("<-");
  private JButton button_suma = new JButton("=");

  private JTextField textField;

  public Main() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel mainPanel = new JPanel(new BorderLayout());
    textField = new JTextField("");
    mainPanel.add("North", textField);

    JPanel buttonPanel = new JPanel(new GridLayout(6, 4));
    buttonPanel.add(new JLabel());
    buttonPanel.add(new JLabel());
    buttonPanel.add(new JLabel());
    buttonPanel.add(button_C);
    buttonPanel.add(button_7);
    buttonPanel.add(button_8);
    buttonPanel.add(button_9);
    buttonPanel.add(button_minus);
    buttonPanel.add(button_4);
    buttonPanel.add(button_5);
    buttonPanel.add(button_6);
    buttonPanel.add(button_plus);
    buttonPanel.add(button_1);
    buttonPanel.add(button_2);
    buttonPanel.add(button_3);
    buttonPanel.add(button_multi);
    buttonPanel.add(new JLabel());
    buttonPanel.add(button_0);
    buttonPanel.add(new JLabel());
    buttonPanel.add(button_div);
    buttonPanel.add(button_undo);
    buttonPanel.add(new JLabel());
    buttonPanel.add(new JLabel());
    buttonPanel.add(button_suma);

    mainPanel.add("Center", buttonPanel);

    setContentPane(mainPanel);
    pack();
    setVisible(true);
  }

  public static void main(String args[]) {
    new Main();
  }
}
