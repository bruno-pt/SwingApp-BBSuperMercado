package bbSuperMercado;

import java.util.ArrayList;

public class Estoque {
    protected static ArrayList<Produto> setorAlimento = new ArrayList<Produto>();
    protected static ArrayList<Produto> setorLimpeza = new ArrayList<Produto>();
    protected static ArrayList<Produto> setorAcougue = new ArrayList<Produto>();
    protected static ArrayList<Produto> setorBebidas = new ArrayList<Produto>();
    protected static ArrayList<Produto> setorHortifruti = new ArrayList<Produto>();
    protected static ArrayList<Produto> setorPadaria = new ArrayList<Produto>();

    public void consultaSetorAlimento() {
        for(Produto produto: setorAlimento){System.out.println(produto);}
    }

    public void consultaSetorLimpeza() {
        for(Produto produto: setorLimpeza){System.out.println(produto);}
    }

    public void consultaSetorAcougue() {
        for(Produto produto: setorAcougue){System.out.println(produto);}
    }

    public void consultaSetorBebidas() {
        for(Produto produto: setorBebidas){System.out.println(produto);}
    }

    public void consultaSetorHortifruti() {
        for(Produto produto: setorHortifruti){System.out.println(produto);}
    }

    public void consultaSetorPadaria() {
        for(Produto produto: setorPadaria){System.out.println(produto);}
    }

    public ArrayList<Produto> getSetorAlimento() {
        return setorAlimento;
    }
}
