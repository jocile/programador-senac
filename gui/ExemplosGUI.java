import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ExemplosGUI extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JMenu exemplosMenu;
    private JMenuItem maiorMenuItem, divisibilidadeMenuItem, maiorMenorMenuItem;

    public ExemplosGUI() {
        super("Exemplos");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria o menu
        menuBar = new JMenuBar();
        exemplosMenu = new JMenu("Exemplos");

        // Adiciona os itens do menu
        maiorMenuItem = new JMenuItem("Maior número");
        maiorMenuItem.addActionListener(this);
        exemplosMenu.add(maiorMenuItem);

        divisibilidadeMenuItem = new JMenuItem("Divisibilidade");
        divisibilidadeMenuItem.addActionListener(this);
        exemplosMenu.add(divisibilidadeMenuItem);

        maiorMenorMenuItem = new JMenuItem("Maior, Menor ou Igual");
        maiorMenorMenuItem.addActionListener(this);
        exemplosMenu.add(maiorMenorMenuItem);

        // Adiciona o menu à barra de menu
        menuBar.add(exemplosMenu);

        // Define a barra de menu da janela
        setJMenuBar(menuBar);
    }

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == maiorMenuItem) {
            // Executa o exemplo de encontrar o maior de três números
            new MaiorNumeroGUI().setVisible(true);
        } else if (evento.getSource() == divisibilidadeMenuItem) {
            // Executa o exemplo de verificar divisibilidade
            new DivisibilidadeGUI().setVisible(true);
        } else if (evento.getSource() == maiorMenorMenuItem) {
            // Executa o exemplo de encontrar o maior, menor ou igual
            new MaiorMenorIgualGUI().setVisible(true);
        }
    }

    public static void main(String[] args) {
        ExemplosGUI app = new ExemplosGUI();
        app.setVisible(true);
    }
}