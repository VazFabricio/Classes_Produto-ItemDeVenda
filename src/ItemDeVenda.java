public class ItemDeVenda {
     private Produto produto;
     private int quantidade;
     private double subtotal;

     public ItemDeVenda(Produto produto, double preco) {
          this.produto = produto;
          produto.setPreco(preco);
     }

     public Produto getProduto() {
          return produto;
     }

     public int getQuantidade() {
          return quantidade;
     }

     public double getSubtotal() {
          return subtotal;
     }

     public void setProduto(Produto produto) {
          this.produto = produto;
     }

     public void setQuantidade(int quantidade) {
          this.quantidade = quantidade;
     }

     public void setSubtotal(double subtotal) {
          this.subtotal = subtotal;
     }

     public void atualizaProduto( Produto produto, int quantidade ){
          this.produto = produto;
          this.quantidade = quantidade;
     }
     public double calculaSubtotal (Produto produto, int quantidade){
          return Produto.PrecoCalculo()*quantidade;
     }
}
