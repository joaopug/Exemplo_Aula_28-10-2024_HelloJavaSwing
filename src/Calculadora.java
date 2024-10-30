import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JTextField txtPrimeiroValor;
    private JTextField txtSegundoValor;
    private JButton btnSomar;
    private JTextField txtResultado;
    private JButton btnLimpar;
    private JPanel panelMain;

    public Calculadora() {
        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Peguei a informação da tela
                Integer primeiro = Integer.valueOf(txtPrimeiroValor.getText());
                Integer segundo = Integer.valueOf(txtSegundoValor.getText());

                //Processei
                Integer soma = primeiro + segundo;

                //Mandei para a tela o resultado
                txtResultado.setText(soma.toString());

                System.out.println(primeiro + "+" + segundo + "=" + soma);
                System.out.println(primeiro);
            }
        });

        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txtPrimeiroValor.setText("");
                txtSegundoValor.setText("");
                txtResultado.setText("");
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new Calculadora().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        //frame.pack();
        //Ajusta o tamanho

        frame.setVisible(true);

    }
}
