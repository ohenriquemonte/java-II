
public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(123123, 123123);
		// primeiraConta.saldo = 300;
		
		// System.out.println("saldo da primeira:" + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		// System.out.println("saldo da segunda:" + segundaConta.saldo);
		
		// segundaConta.saldo += 100;
		// System.out.println("saldo da segunda:" + segundaConta.saldo);
		// System.out.println("saldo da primeira:" + primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("sao a mesmissima conta");
		}
	}
}
