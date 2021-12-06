package bbSuperMercado;

import java.util.ArrayList;
import java.util.Scanner;

public class Gerente extends Estoque {
    private String nome;
    private int idade;
    static ArrayList<Produto> relatorio = new ArrayList<>();

    Gerente(String nome, int idade){
        this.idade = idade;
        this.setNome(nome);
    }

    //valor total por caixa
    /*static void relatorioVendas(){
        App.clear();

        System.out.println("$ Tipo Login > Gerente");
        System.out.println("===========================");
        System.out.println("Relatório de Vendas");
        System.out.println();
        for(Caixa caixa: App.caixas){
            System.out.println("Caixa: "+(App.caixas.indexOf(caixa)+1)
                    +" | Valor no Caixa: "+caixa.getValorAcumulado()
                    +" | Funcionario atual: "+caixa.funcionario.getNome());
        }
        System.out.println("===========================");
        System.out.print("Any - Para continuar > ");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        App.clear();
    }

    
    static void relatorioEstoque(){
        App.clear();

        System.out.println("$ Tipo Login > Gerente");
        System.out.println("===========================");
        System.out.println("Relatório de Alteração de Estoque");
        System.out.println();
        for(Produto produto: relatorio){
            System.out.println("Produto{nome="+produto.getNome()
                    +", estoqueInicial="+produto.getQuantidadeEstoque()
                    +", estoqueFinal="+(produto.getQuantidadeEstoque()-produto.getQuantidadeCompra())
                    +'}');
        }
        System.out.println("===========================");
        System.out.print("Any - Para continuar > ");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        App.clear();
    }

    static void relatorioVendasFuncionario(){
        App.clear();

        System.out.println("$ Tipo Login > Gerente");
        System.out.println("===========================");
        System.out.println("Relatório de Venda por Funcionario");
        System.out.println();
        for(Funcionario funcionario: App.funcionarios){
            System.out.println(funcionario);
        }
        System.out.println("===========================");
        System.out.print("Any - Para continuar > ");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        App.clear();
    }*/

    static void cadastrarProduto(Produto produto, String setor){
        setor.toLowerCase();

        switch (setor){
            case "alimento":
                setorAlimento.add(produto);
                break;

            case "limpeza":
                setorLimpeza.add(produto);
                break;

            case "acougue":
                setorAcougue.add(produto);
                break;

            case "bebidas":
                setorBebidas.add(produto);
                break;

            case "hortifruti":
                setorHortifruti.add(produto);
                break;

            case "padaria":
                setorPadaria.add(produto);
                break;

            default:
                System.out.println("Setor inexistente!");
                //App.opGerente();
        }
    }

    public String getNome() {
        return nome;
    }
    private void setNome(String nome) {
        this.nome = nome;
    }
}

