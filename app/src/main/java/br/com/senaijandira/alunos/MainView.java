package br.com.senaijandira.alunos;

import java.util.List;

import br.com.senaijandira.alunos.model.Aluno;

/**
 * Created by 17259195 on 29/10/2018.
 */

public interface MainView {

    void exibirBarraProgesso();

    void esconderBarraProgesso();

    void preencherLista(List<Aluno> lstAlunos);




}
