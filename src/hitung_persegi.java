import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class hitung_persegi {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button1;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("hitung_persegi");
        frame.setContentPane(new hitung_persegi().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public hitung_persegi() {
        button1.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                int s,s2,hasil;
                s = Integer.parseInt(textField1.getText());
                s2 = Integer.parseInt(textField2.getText());

                hasil = s*s2;
                textField3.setText(Integer.toString(hasil));
            }
        });
    }
}
