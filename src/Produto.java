public class Produto {

    private String idProduto;
    private String nome;
    private String categoria;
    private String marca;
    private String modelo;
    private static double preco;
    private double altura;
    private double largura;
    private double comprimento;
    private double peso;

    public Produto(){
        idProduto = " ";
        nome = " ";
        categoria = " ";
        marca = " ";
        modelo = " ";
        preco = 0.0;
        altura = 0.0;
        largura = 0.0;
        comprimento = 0.0;
        peso = 0.0;
    }

    public Produto(String idProduto, String nome, String categoria, double preco, double altura, double largura, double comprimento, double peso) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
        this.peso = peso;
    }

    public Produto(String idProduto, String nome, double preco, double altura, double largura, double comprimento, double peso) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.preco = preco;
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
        this.peso = peso;
    }

    public String getIdProduto() {
        return idProduto;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco(){
        return preco;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPreco(double preco) {
        Produto.preco = preco;
    }

    public static double PrecoCalculo() {
        return preco;
    }
}
