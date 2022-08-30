package ui.visualizado.botao;
import java.awt.event.ActionEvent;
import ui.modelo.Jogador;
import ui.modelo.Tabuleiro;
import ui.visualizado.tela.TelaControle;
import ui.visualizado.tela.TelaTabuleiro;

public class BotaoCima extends BotaoPrincipal{
	public BotaoCima(String posicao, Tabuleiro tabuleiro, 
			TelaTabuleiro telaTabuleiro, TelaControle controleTabuleiro, Jogador jogador) {
			super(posicao, tabuleiro, telaTabuleiro, controleTabuleiro, jogador);
		}

		@Override
		public void actionPerformed(ActionEvent event) {//Altera o tabuleiro para o movimento de cima
			alteraEstadoTabuleiro();
		}

		@Override
		public void alteraEstadoTabuleiro() {//Faz a contagem do movimento
			this.getTabuleiroControle().moverPraCima();
			this.getTelaTabuleiro().atualizarTelaTabuleiro(this.getTabuleiro());
			Integer jogadas = this.getJogador().getJogadas();
			this.getJogador().setJogadas(jogadas + 1);
		};
}