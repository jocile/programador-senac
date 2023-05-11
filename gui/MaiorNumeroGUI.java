import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MaiorNumeroGUI extends JFrame{

    private JLabel label1, label2, label3, resultado;
    private JTextField campo1, campo2;
    private JButton botao;

    public MaiorNumeroGUI() {
        super("Encontre o maior número");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label1 = new JLabel("Insira três números:");
        label2 = new JLabel("Número 1:");
        label3 = new JLabel("Número 2:");
        resultado = new JLabel(" ");

        campo1 = new JTextField(10);
        campo2 = new JTextField(10);

        botao = new JButton("Encontrar o maior");

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(4, 2, 10, 10));
        painel.add(label1);
        painel.add(new JLabel(""));
        painel.add(label2);
        painel.add(campo1);
        painel.add(label3);
        painel.add(campo2);
        painel.add(botao);
        painel.add(resultado);        

        add(painel, BorderLayout.CENTER);
        //add(resultado, BorderLayout.SOUTH);
    

    botao.addActionListener(e -> {
        int num1 = Integer.parseInt(campo1.getText());
        int num2 = Integer.parseInt(campo2.getText());

        int maior = num1;
        if (num1 > maior) {
            maior = num1;
        } else {
            maior = num2;
        }

        resultado.setText("O maior número é: " + maior);
    });
  }

    public static void main(String[] args) {
        MaiorNumeroGUI app = new MaiorNumeroGUI();
        app.setVisible(true);
    }
}
