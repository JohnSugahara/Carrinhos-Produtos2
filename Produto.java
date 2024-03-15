public class Produto {


    String nome;
    String descricao;
    String fabricante;
    double preco;
    boolean comprado;

    Produto(String nome, String descricao, String fabricante, double preco, boolean comprado)
    {
        this.nome = nome;
        this.descricao = descricao;
        this.fabricante = fabricante;
        this.preco = preco;
        this.comprado = false;
    }
    

}
