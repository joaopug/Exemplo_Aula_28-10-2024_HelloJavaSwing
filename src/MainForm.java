import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JTextField txtNome;
    private JLabel lblNome;
    private JButton btnValidar;
    private JLabel txtResultado;
    private JPanel mainPanel;

    public static void main(String[] args) {

        //Cria a minha tela (TV)
        JFrame frame = new JFrame("Minha primeira tela");
        //Mostra qual painel vai ser assistido
        frame.setContentPane(new MainForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Ajusta a minha TV no tamanho do meu painel
        frame.pack();
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    public MainForm() {

        btnValidar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Obter nome do input
                String nomeDigitado = txtNome.getText();

                txtResultado.setText(nomeDigitado);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
