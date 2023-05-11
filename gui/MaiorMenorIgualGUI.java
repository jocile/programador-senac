import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MaiorMenorIgualGUI extends JFrame implements ActionListener {

    private JLabel label1, label2, resultado;
    private JTextField campo1, campo2;
    private JButton botao;

    public MaiorMenorIgualGUI() {
        super("Maior, Menor ou Igual");
        setSize(600, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label1 = new JLabel("Insira dois números:");
        label2 = new JLabel("");
        resultado = new JLabel("");

        campo1 = new JTextField(10);
        campo2 = new JTextField(10);

        botao = new JButton("Verificar");
        botao.addActionListener(this);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(4, 2, 10, 10));
        painel.add(label1);
        painel.add(label2);
        painel.add(new JLabel("Número 1:"));
        painel.add(campo1);
        painel.add(new JLabel("Número 2:"));
        painel.add(campo2);
        painel.add(botao);
        painel.add(resultado);

        add(painel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent evento) {
        int num1 = Integer.parseInt(campo1.getText());
        int num2 = Integer.parseInt(campo2.getText());

        if (num1 > num2) {
            resultado.setText(num1 + " é o maior número.");
        } else if (num2 > num1) {
            resultado.setText(num2 + " é o maior número.");
        } else {
            resultado.setText("Os números são iguais.");
        }

        if (num1 < num2) {
            resultado.setText(resultado.getText() + "\n" + num1 + " é o menor número.");
        } else if (num2 < num1) {
            resultado.setText(resultado.getText() + "\n" + num2 + " é o menor número.");
        } else {
            resultado.setText(resultado.getText() + "\n" + "Os números são iguais.");
        }
    }

    public static void main(String[] args) {
        MaiorMenorIgualGUI app = new MaiorMenorIgualGUI();
        app.setVisible(true);
    }
  }