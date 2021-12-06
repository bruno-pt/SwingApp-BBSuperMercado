package bbSuperMercado;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private static JPanel mainPanel;
    private static JButton button1;
    private static int cont = 0;
    
    static ArrayList<Caixa> caixas = new ArrayList<Caixa>();
    static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    public ArrayList<Caixa> getCaixas() {
        return caixas;
    }
    
    public static void clear(){
        System.out.println(new String(new char[50]).replace("\0", "\r\n"));
    }    

    public static void main(String[] args) {        
        //FORM CREATION
        //#########################################################
        JFrame loginFrame = new loginFrame();

        loginFrame.setVisible(true);
        //#########################################################
        
        funcionarios.add(new Funcionario("Gabriel", 20));
        funcionarios.add(new Funcionario("Maria", 21));
        funcionarios.add(new Funcionario("Romualdo", 43));
        funcionarios.add(new Funcionario("Leandro", 54));
        funcionarios.add(new Funcionario("Josimara", 34));

        Collections.shuffle(funcionarios);

        for(int i = 0; i < 3; i++){
            caixas.add(new Caixa(funcionarios.get(i)));
        }
        
        instanceProducts();
    }

    private static void instanceProducts(){
        Gerente.cadastrarProduto(new Produto("Arroz",5, 7.5f), "alimento");
        Gerente.cadastrarProduto(new Produto("Feijao",29, 6), "alimento");
        Gerente.cadastrarProduto(new Produto("Miojo",999, 0.50f), "alimento");
        Gerente.cadastrarProduto(new Produto("Omo",7, 7), "limpeza");
        Gerente.cadastrarProduto(new Produto("Detergente",8, 15), "limpeza");
        Gerente.cadastrarProduto(new Produto("Veja",7, 15), "limpeza");
        Gerente.cadastrarProduto(new Produto("Hortela",30, 15), "hortifruti");
        Gerente.cadastrarProduto(new Produto("Couve",12, 15), "hortifruti");
        Gerente.cadastrarProduto(new Produto("Alface",11, 15), "hortifruti");
        Gerente.cadastrarProduto(new Produto("Skol",15, 2), "bebidas");
        Gerente.cadastrarProduto(new Produto("Glacial",2350, 0.1f), "bebidas");
        Gerente.cadastrarProduto(new Produto("Velho barreiro",20, 9.90f), "bebidas");
        Gerente.cadastrarProduto(new Produto("Pao",60, 4.99f), "padaria");
        Gerente.cadastrarProduto(new Produto("Pao de queijo",30, 2.50f), "padaria");
        Gerente.cadastrarProduto(new Produto("Rosquinha",55,5.50f ), "padaria");
        Gerente.cadastrarProduto(new Produto("Lula",20, 30.50f), "acougue");
        Gerente.cadastrarProduto(new Produto("Linguiça",36,10.50f), "acougue");
        Gerente.cadastrarProduto(new Produto("Picanha",2, 1500), "acougue");
    }
}
