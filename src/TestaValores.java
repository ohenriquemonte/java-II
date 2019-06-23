
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(123, 432);
		
		conta.setAgencia(-50);
		conta.setNumero(-330);
		
		Conta conta2 = new Conta(1337, 123123);
		
		System.out.println(Conta.getTotal());
	}
}
