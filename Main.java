import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        int i;
        int x = 10;
        Produto[] produtos = new Produto[5];

        Produto p1 = new Produto("Batata", "Batatas frescas e deliciosas 100g", "Ultimate Batata Farmer 2000", 125.5, false);
        Produto p2 = new Produto("Super Doritos", "Doritos sabor morte industrial 85g", "APiorQueACienciaPodeOferecer.company", 65.5, false);
        Produto p3 = new Produto("Salsicha", "100g e vem acompanhado de biscoitos scooby", "PrimeVideo.company", 225.5, false);
        Produto p4 = new Produto("Carne", "20kg de carne da pra 20 comer", "VivoLixoPanoTodoDia.company", 112.5, false);
        Produto p5 = new Produto("Bambu", "Bambu Bioluminicente que da a luz no", "VivoLixoPanoTodoDia.company", 25.5, false);

        Carrinho carrinho = new Carrinho();

        produtos[0] = p1;
        produtos[1] = p2;
        produtos[2] = p3;
        produtos[3] = p4;
        produtos[4] = p5;

        carrinho.produtos = produtos;

        Scanner entrada = new Scanner(System.in);

        System.out.println("O que você deseja comprar? ");

        carrinho.exibirInfos();
        

        while (x != 0)
        {
            System.out.println("Batata(1) | Super Doritos(2) | Salsicha(3) | Carne(4) | Bambu(5) | Nada(0)");
            x = entrada.nextInt();

            if (x != 0)
            {
               p1.comprado = true;
            }
        }

        System.out.println(" Os items acrescentados ao carrinho foram: ");

        for (i = 0; i < 5; i++)
        {
            produtos[i].comprado = true;

            System.out.println(produtos[i].nome);

        }

        System.out.println("O preço total foi: ");
        carrinho.calculaTotal(i, produtos);
        System.out.println(carrinho.calculaTotal(i, produtos));


        entrada.close();
    }
}
