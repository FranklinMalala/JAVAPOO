package testes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MinhaJanela extends JFrame implements ActionListener {
  
  public MinhaJanela() {
    // Define o título da janela
    setTitle("Minha Janela");
    
    // Cria um painel para conter os componentes
    JPanel painel = new JPanel();
    
    // Cria um botão
    JButton botao = new JButton("Clique aqui");
    
    // Adiciona um ouvinte de eventos ao botão
    botao.addActionListener(this);
    
    // Adiciona o botão ao painel
    painel.add(botao);
    
    // Adiciona o painel à janela
    add(painel);
    
    // Define o tamanho da janela
    setSize(500, 500);
    
    // Define a ação padrão para fechar a janela
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // Torna a janela visível
    setVisible(true);
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
    // Código para lidar com o evento do botão aqui
    System.out.println("Botão clicado!" + e);
  }
  
  public static void main(String[] args) {
    // Cria uma nova instância da janela
    MinhaJanela janela = new MinhaJanela();
  }
}
