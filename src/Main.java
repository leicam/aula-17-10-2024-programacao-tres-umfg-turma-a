import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Produto testeUm = new Produto("1234",
                "TESTE UM",
                399.90);
        Produto testeDois = new Produto("4321",
                "TESTE DOIS",
                239.90);

        Carrinho carrinho = new Carrinho();

        carrinho.addProduto(testeUm);
        carrinho.addProduto(testeUm);
        carrinho.removeProduto(testeUm);
        carrinho.addProduto(testeUm);
        carrinho.addProduto(testeDois);
        carrinho.addProduto(testeDois);
        carrinho.removeProduto(testeDois);

        System.out.println("Selecione a opção de pagamento:");
        System.out.println("1 - Cartão de Crédito");
        System.out.println("2 - Cartão de Débito");
        System.out.println("3 - PIX");
        System.out.println("4 - Dinheiro");

        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextInt()){
            case 1:
                carrinho.receber(new CartaoCreditoStrategy(
                        "CLIENTE",
                        "000000000000",
                        "000",
                        "08/29"));
                break;
            case 2:
                break;
            case 3:
                carrinho.receber(new PixStrategy());
                break;
            case 4:
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}