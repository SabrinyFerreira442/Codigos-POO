package fakedb;

import java.util.ArrayList;

public abstract class BaseFakeDB<TDominio> {

    protected ArrayList<TDominio> tabela;

    public BaseFakeDB(ArrayList<TDominio> tabela) {
        this.tabela = tabela;
    }

    public ArrayList<TDominio> getTabela(){
        return tabela;
    }

    protected abstract void preencherDados();

    public BaseFakeDB(){
        this.preencherDados(); 
    }   
}

