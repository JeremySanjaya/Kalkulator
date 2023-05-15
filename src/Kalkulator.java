import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator {
    private JPanel Kalkulator1;
    private JTextField tfAlas;
    private JTextField tfTinggi;
    private JTextField tfLuas;
    private JButton batalButton;
    private JButton hitungButton;
    private JButton keluarButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Kalkulator");
        frame.setContentPane(new Kalkulator().Kalkulator1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

public Kalkulator() {
    hitungButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            double alas,tinggi,luas;

            alas=Double.parseDouble(tfAlas.getText());
            tinggi=Double.parseDouble(tfTinggi.getText());

            luas=(alas*tinggi )/2;

            tfLuas.setText(String.valueOf(luas));
        }
    });
    keluarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            System.exit(0);

        }
    });
    batalButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        tfLuas.setText("");
        tfTinggi.setText("");
        tfAlas.setText("");

        }
    });
}
}
