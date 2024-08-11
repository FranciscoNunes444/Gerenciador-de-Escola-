import javax.swing.*;
import java.awt.*;

public class Screen {
    public Screen(){
        JFrame tela = new JFrame("Gerenciador De Escola"); // instanciando a tela
        tela.setSize(800, 600); // configurarndo sua resolução
        tela.setDefaultCloseOperation(tela.EXIT_ON_CLOSE); // fechando o programa após fechar a tela

        tela.setResizable(true);
        tela.setLocationRelativeTo(null);// deixando a tela centralizada no meio
        // criando um panel para adicionar o button

        JPanel panel = new JPanel();
        tela.setContentPane(panel);

        panel.setLayout(null);

        // criando um button
        JButton btn = new JButton("cadastro");
        panel.add(btn);
        btn.setBounds(100,200,250,70);
        btn.setFont(new Font("Arial",Font.BOLD,20));

        //atualizando a tela
        tela.revalidate();
        tela.repaint();

        tela.setVisible(true);// tornando a tela visivel
    }

}