package fakedb;

import dominio.ClasseProduto;
import java.time.LocalDate;

public class ClasseProdutoFakeDB extends BaseFakeDB<ClasseProduto>{

    public ClasseProdutoFakeDB(){
        super();
    }  
    @Override
    protected void preencherDados(){
        this.tabela.add(new ClasseProduto(1, "Carnes", LocalDate.now()));
        this.tabela.add(new ClasseProduto(2, "Bebidas", LocalDate.now()));
        this.tabela.add(new ClasseProduto(3, "Laticínios", LocalDate.now()));
        this.tabela.add(new ClasseProduto(4, "Higiene", LocalDate.now()));
        this.tabela.add(new ClasseProduto(5, "Limpeza", LocalDate.now()));
    }  
}