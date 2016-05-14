package br.edu.unoesc.pos.acoplamentoDIP;

/**
 * Exemplo base retirado do livro "Orientação a Objeto e SOLID para ninjas."
 * 
 * @author forchesatto
 *
 */
public class GeradorNotaFiscal {

	public class GeradorDeNotaFiscal {

		private final EnviadorDeEmail email;
		private final NotaFiscalDao dao;

		public GeradorDeNotaFiscal(EnviadorDeEmail email, NotaFiscalDao dao) {
			this.email = email;
			this.dao = dao;
		}

		public NotaFiscal gera(Fatura fatura) {

			double valor = fatura.getValorMensal();

			NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

			email.enviaEmail(nf);
			dao.persiste(nf);

			return nf;
		}

		private double impostoSimplesSobreO(double valor) {
			return valor * 0.06;
		}
	}
}
