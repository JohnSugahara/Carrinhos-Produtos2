public class Carrinho {

    double total;
    Produto produtos[];




    void exibirInfos()
    {

        int i;
        for (i = 0; i < 5; i++)
        {
            System.out.println("\n");
            System.out.println("O produto "+ produtos[i].nome + " vem da compania "+ produtos[i].fabricante + ". Compre esse produto, "+ produtos[i].descricao +".");
            System.out.println("\n");
        }

    }

    double calculaTotal(int i, Produto produtos[])
    {
        for (i = 0; i < 4; i++)
        {
            if (produtos[i].comprado = true)
            {

            total += this.produtos[i].preco; 

            }
        }
        return total;

    }   
}
