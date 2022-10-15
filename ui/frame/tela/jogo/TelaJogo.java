package ui.frame.tela.jogo;
import puzzle.nivel.NivelNumero;
import puzzle.deslocamento.DeslocamentoNumero;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.SwingUtilities;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.GridLayout;


public class TelaJogo {
	static TelaJogo sistema = new TelaJogo();
	private int posB1;
	private int posB2;
	private int tempB2;
	NivelNumero teste = new NivelNumero();
	JFrame jogo = new JFrame();
	JPanel matriz = new JPanel();
	JButton[] mov = new JButton[4];
	JButton[] botoes;
	GridLayout começo;
	Action Subir;
	Action Esquerda;
	Action Direita;
	Action Descer;
	
	public void Teste() {
		// Metodos para alterar o tabuleiro
		teste.deslocamento().getTabuleiro().setDefinir(3);
		teste.deslocamento().getTabuleiro().Calculo();
		this.começo = new GridLayout(teste.deslocamento().getTabuleiro().getDefinir(),teste.deslocamento().getTabuleiro().getDefinir());
		matriz.setLayout(começo);
		Subir = new Subir();
		Esquerda = new Esquerda();
		Direita = new Direita();
		Descer = new Descer();
		
		this.botoes = new JButton[(int)Math.pow(teste.deslocamento().getTabuleiro().getDefinir(), 2)];
		
		jogo.setSize(950, 750);
		jogo.getContentPane().setBackground(new Color(51,153,255));
		
		matriz.setBounds(260, 50, 370, 370);
		matriz.setBackground(new Color(51,153,255));
		mov[0] = new JButton("^");
	    mov[1] = new JButton("<");
		mov[2] = new JButton(">");
		mov[3] = new JButton("\\/");
		
		mov[0].setBounds(750, 450, 50, 50);
		mov[1].setBounds(680, 515, 50, 50);
		mov[2].setBounds(820, 515, 50, 50);
		mov[3].setBounds(750, 580, 50, 50);
		for(int i = 0; i<4; i++) {
			mov[i].setFont(new Font("Times New Roman",Font.BOLD,15));
		}
		jogo.add(mov[0]);
		jogo.add(mov[1]);
		jogo.add(mov[2]);
		jogo.add(mov[3]);
		
			for(int i = 0; i< (int)Math.pow(teste.deslocamento().getTabuleiro().getDefinir(), 2); i++) {
			if(teste.deslocamento().getTabuleiro().getNumeros().get(i) == null) {
				matriz.add(botoes[i] = new JButton(""));
			}
			else {
				matriz.add(botoes[i]= new JButton(String.valueOf(teste.deslocamento().getTabuleiro().getNumeros().get(i))));
			}
			botoes[i].setBackground(new Color(0,0,0));
			botoes[i].setForeground(new Color(255,153,0));
			
			}
			
			jogo.add(matriz);
			jogo.setLayout(null);
			jogo.setVisible(true);
			matriz.getInputMap().put(KeyStroke.getKeyStroke("W"), "Subir");
			matriz.getActionMap().put("Subir", Subir);
			matriz.getInputMap().put(KeyStroke.getKeyStroke("A"), "Esquerda");
			matriz.getActionMap().put("Esquerda", Esquerda);
			matriz.getInputMap().put(KeyStroke.getKeyStroke("D"), "Direita");
			matriz.getActionMap().put("Direita", Direita);
			matriz.getInputMap().put(KeyStroke.getKeyStroke("S"), "Descer");
			matriz.getActionMap().put("Descer", Descer);
	}
	public class Subir extends AbstractAction{
		public void actionPerformed(ActionEvent e) {
			teste.deslocamento().mudanças('w');
			matriz.removeAll();
			//matriz.repaint();
			for(int i = 0; i< (int)Math.pow(teste.deslocamento().getTabuleiro().getDefinir(), 2); i++) {
				if(teste.deslocamento().getTabuleiro().getNumeros().get(i) == null) {
					matriz.add(botoes[i] = new JButton(""));
				}
				else {
					matriz.add(botoes[i]= new JButton(String.valueOf(teste.deslocamento().getTabuleiro().getNumeros().get(i))));
				}
				botoes[i].setBackground(new Color(0,0,0));
				botoes[i].setForeground(new Color(255,153,0));
				botoes[i].repaint();
			}
			jogo.setVisible(false);
			jogo.setVisible(true);
		}
	}
	public class Esquerda extends AbstractAction{
		public void actionPerformed(ActionEvent e) {
			teste.deslocamento().mudanças('a');
			matriz.removeAll();
			//matriz.repaint();
			for(int i = 0; i< (int)Math.pow(teste.deslocamento().getTabuleiro().getDefinir(), 2); i++) {
				if(teste.deslocamento().getTabuleiro().getNumeros().get(i) == null) {
					matriz.add(botoes[i] = new JButton(""));
				}
				else {
					matriz.add(botoes[i]= new JButton(String.valueOf(teste.deslocamento().getTabuleiro().getNumeros().get(i))));
				}
				botoes[i].setBackground(new Color(0,0,0));
				botoes[i].setForeground(new Color(255,153,0));
				botoes[i].repaint();
			}
			jogo.setVisible(false);
			jogo.setVisible(true);
	}
}
	public class Direita extends AbstractAction{
		public void actionPerformed(ActionEvent e) {
			teste.deslocamento().mudanças('d');
			matriz.removeAll();
			//matriz.repaint();
			for(int i = 0; i< (int)Math.pow(teste.deslocamento().getTabuleiro().getDefinir(), 2); i++) {
				if(teste.deslocamento().getTabuleiro().getNumeros().get(i) == null) {
					matriz.add(botoes[i] = new JButton(""));
				}
				else {
					matriz.add(botoes[i]= new JButton(String.valueOf(teste.deslocamento().getTabuleiro().getNumeros().get(i))));
				}
				botoes[i].setBackground(new Color(0,0,0));
				botoes[i].setForeground(new Color(255,153,0));
				botoes[i].repaint();
			}
			jogo.setVisible(false);
			jogo.setVisible(true);
	}
}
	public class Descer extends AbstractAction{
		public void actionPerformed(ActionEvent e) {
			teste.deslocamento().mudanças('s');
			matriz.removeAll();
			//matriz.repaint();
			for(int i = 0; i< (int)Math.pow(teste.deslocamento().getTabuleiro().getDefinir(), 2); i++) {
				if(teste.deslocamento().getTabuleiro().getNumeros().get(i) == null) {
					matriz.add(botoes[i] = new JButton(""));
				}
				else {
					matriz.add(botoes[i]= new JButton(String.valueOf(teste.deslocamento().getTabuleiro().getNumeros().get(i))));
				}
				botoes[i].setBackground(new Color(0,0,0));
				botoes[i].setForeground(new Color(255,153,0));
				botoes[i].repaint();
			}
			jogo.setVisible(false);
			jogo.setVisible(true);
	}	
}
	public static void main(String[] args) {
		TelaJogo teste = new TelaJogo();
		teste.Teste();
	}
}