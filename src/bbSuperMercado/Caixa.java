package bbSuperMercado;



import java.util.Iterator;

public class Caixa {
    float valorAcumulado = 0;
    Funcionario funcionario;

    public Caixa(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public float finalizarCompra(){
        float valorTotalCompra = 0;
        Iterator<Produto> itCarrinho = Cliente.carrinho.iterator();
        while(itCarrinho.hasNext()) {
            Produto produto = itCarrinho.next();

            valorTotalCompra += produto.getPrecoUni()* produto.getQuantidadeCompraAtual();
            this.valorAcumulado += produto.getPrecoUni()* produto.getQuantidadeCompraAtual();

            /*Produto produtoRelatorio = new Produto(
                    produto.getNome(),
                    produto.getQuantidadeEstoque(),
                    produto.getPrecoUni());

            produtoRelatorio.setQuantidadeCompra(produto.getQuantidadeCompra());*/

            boolean achou = false;
            //primeira inserção no relatório
            if(Gerente.relatorio.size() == 0){
                Gerente.relatorio.add(produto);
            }
            //relatório não null
            else{
                //verificar se o produto já existe no relatório
                for(Produto prd: Gerente.relatorio){
                    //caso exista, só altera valores
                    if(prd.getNome().equals(produto.getNome())){
                        prd.setQuantidadeEstoque(produto.getQuantidadeEstoque());
                        prd.setQuantidadeCompraTotal(produto.getQuantidadeCompraTotal());
                        prd.setQuantidadeCompraAtual(produto.getQuantidadeCompraAtual());
                        break;
                    }
                    //caso não exista, add
                    else{                        
                        Cliente.carrinho.add(produto);
                        break;
                    }
                }
            }
            itCarrinho.remove();
        }
        App.clear();        
        this.funcionario.vendas.add(valorTotalCompra);
        return valorTotalCompra;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public float getValorAcumulado() {
        return valorAcumulado;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }
}
