import  java.util.Scanner; 
public class ContaTerminal { 
    public static void main(String[] args) { 

    Scanner sc = new Scanner(System.in);    
    
    int numeroConta; 
    String agencia; 
    String nomeCliente; 
    double saldo; 

    System.out.print("Digite o nome do cliente: "); 
    nomeCliente = sc.nextLine(); 
    System.out.print("Digite o número da conta: "); 
    numeroConta = sc.nextInt(); sc.nextLine(); 
    System.out.print("Digite o número da agência: "); 
    agencia = sc.nextLine(); 
    System.out.print("Digite o saldo inicial: "); 
    saldo = sc.nextDouble(); 

    System.out.println( "Olá " .concat(nomeCliente) 
    .concat(",obrigado por criar uma conta em nosso banco, sua agência é ") 
    .concat(agencia) 
    .concat(", conta ") 
    .concat(String.valueOf(numeroConta)) 
    .concat(" e seu saldo R$ " ) 
    .concat(String.valueOf(saldo)) 
    .concat("Já está disponível para saque. ") 
); 
sc.close(); 
}   
}