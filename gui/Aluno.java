// Definir a estrutura de registro para o aluno

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Aluno extends JFrame implements ActionListener{
  String nome;
  int idade;
  int matricula;
  String curso;
// Inicializar as variáveis de entrada
JTextField nomeTextField, idadeTextField, matriculaTextField, cursoTextField; 


public Aluno() {
  super("Cadastro de Aluno");
}

// Criar o formulário
public void CadastroAluno() {


  // Criar os campos de entrada para nome, idade, matrícula e curso
  JLabel nomeLabel = new JLabel("Nome:");
  nomeTextField = new JTextField(20);
  JLabel idadeLabel = new JLabel("Idade:");
  idadeTextField = new JTextField(3);
  JLabel matriculaLabel = new JLabel("Matrícula:");
  matriculaTextField = new JTextField(10);
  JLabel cursoLabel = new JLabel("Curso:");
  cursoTextField = new JTextField(20);

  // Criar o botão para submeter o formulário
  JButton cadastrarButton = new JButton("Cadastrar");
  cadastrarButton.addActionListener(this);

  // Adicionar os campos de entrada e o botão ao formulário
  JPanel panel = new JPanel(new GridLayout(5, 2));
  panel.add(nomeLabel);
  panel.add(nomeTextField);
  panel.add(idadeLabel);
  panel.add(idadeTextField);
  panel.add(matriculaLabel);
  panel.add(matriculaTextField);
  panel.add(cursoLabel);
  panel.add(cursoTextField);
  panel.add(new JLabel(""));
  panel.add(cadastrarButton);
  add(panel);

  // Configurar o tamanho e a visibilidade do formulário
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setSize(300, 200);
  setVisible(true);
}

// Ação do botão cadastrar
public void actionPerformed(ActionEvent event) {
  try {
      // Ler as informações de entrada do usuário
      String nome = nomeTextField.getText();
      int idade = Integer.parseInt(idadeTextField.getText());
      int matricula = Integer.parseInt(matriculaTextField.getText());
      String curso = cursoTextField.getText();

      // Criar um objeto Aluno com as informações lidas
      Aluno aluno = new Aluno();
      aluno.nome = nome;
      aluno.idade = idade;
      aluno.matricula = matricula;
      aluno.curso = curso;

      // Escrever as informações do objeto Aluno em um arquivo de texto
      FileWriter writer = new FileWriter("alunos.txt", true);
      PrintWriter printer = new PrintWriter(writer);
      printer.printf("%s,%d,%d,%s\\n", aluno.nome, aluno.idade, aluno.matricula, aluno.curso);
      printer.close();

      // Exibir uma mensagem de confirmação para o usuário
      JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso!");

      // Limpar os campos de entrada
      nomeTextField.setText("");
      idadeTextField.setText("");
      matriculaTextField.setText("");
      cursoTextField.setText("");
  } catch (NumberFormatException e) {
      // Exibir uma mensagem de erro para o usuário caso a idade ou a matrícula não sejam números
      JOptionPane.showMessageDialog(this, "A idade e a matrícula devem ser números!");
  } catch (IOException e) {
      // Exibir uma mensagem de erro para o usuário caso ocorra um erro ao escrever no arquivo
      JOptionPane.showMessageDialog(this, "Erro ao cadastrar aluno!");
  }
}

// Método main para iniciar o programa
public static void main(String[] args) {
  Aluno Aluno = new Aluno();
  Aluno.CadastroAluno();
}
}