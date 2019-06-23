
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();

		// contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);

		// System.out.println(contaDoPaulo.saldo);

		boolean conseguiuRetirar = contaDoPaulo.saca(30);
		// System.out.println(contaDoPaulo.saldo);

		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);

		boolean sucessoTransferencia = contaDaMarcela.transfere(1500, contaDoPaulo);

		// if(contaDaMarcela.transfere(1500, contaDoPaulo)) {
		if (sucessoTransferencia) {
			System.out.println("Transferencia realizada com sucesso!");
		} else {
			System.out.println("Faltou dinheiro");
		}
		// System.out.println(contaDaMarcela.saldo);
		// System.out.println(contaDoPaulo.saldo);
	}
}
