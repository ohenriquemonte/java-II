
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		// primeiraConta.saldo = 200;
		// primeiraConta.saldo += 100;

		Conta segundaConta = new Conta();
		// segundaConta.saldo = 50;

		// System.out.println("primeiraConta tem: " + primeiraConta.saldo);
		// System.out.println("segundaConta tem: " + segundaConta.saldo);

		// System.out.println(primeiraConta.agencia);
		// System.out.println(primeiraConta.titular);

		// segundaConta.agencia = 146;
		// System.out.println("Agora a segunda conta esta na agencia " + segundaConta.agencia);

		if (primeiraConta == segundaConta) {
			System.out.println("mesma conta");
		} else {
			System.out.println("contas diferentes");
		}

		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		// System.out.println(segundaConta.saldo);
	}
}
