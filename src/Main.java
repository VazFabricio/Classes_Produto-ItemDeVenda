public class Main {
    public static void main(String[] args) {
        //public Produto(String idProduto, String nome, String categoria, double preco, double altura, double largura, double comprimento, double peso)
        Produto pc = new Produto("1", "PC", "Eletronico", 100.00, 10, 10, 10, 10 );
        System.out.println(pc.getNome() +", "+ pc.getPreco());
        ItemDeVenda pcVenda = new ItemDeVenda(pc, pc.getPreco());
        System.out.println(pcVenda.getProduto()+ ", " + pcVenda.getQuantidade());
        pcVenda.atualizaProduto(pc, 10);
        System.out.println(pcVenda.getProduto()+ ", " + pcVenda.getQuantidade());
        System.out.println(pcVenda.calculaSubtotal(pc, pcVenda.getQuantidade()));
    }
}