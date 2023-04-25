package testes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MinhaJanela extends JFrame implements ActionListener {
  
  public MinhaJanela() {
    // Define o t�tulo da janela
    setTitle("Minha Janela");
    
    // Cria um painel para conter os componentes
    JPanel painel = new JPanel();
    
    // Cria um bot�o
    JButton botao = new JButton("Clique aqui");
    
    // Adiciona um ouvinte de eventos ao bot�o
    botao.addActionListener(this);
    
    // Adiciona o bot�o ao painel
    painel.add(botao);
    
    // Adiciona o painel � janela
    add(painel);
    
    // Define o tamanho da janela
    setSize(500, 500);
    
    // Define a a��o padr�o para fechar a janela
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // Torna a janela vis�vel
    setVisible(true);
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
    // C�digo para lidar com o evento do bot�o aqui
    System.out.println("Bot�o clicado!" + e);
  }
  
  public static void main(String[] args) {
    // Cria uma nova inst�ncia da janela
    MinhaJanela janela = new MinhaJanela();
  }
}
