package br.com.senaijandira.alunos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;

import java.util.List;

import br.com.senaijandira.alunos.adapter.alunoAdapter;
import br.com.senaijandira.alunos.model.Aluno;
import br.com.senaijandira.alunos.service.ServiceFactory;

public class MainActivity
        extends AppCompatActivity
         implements MainView

{

    ListView listView;
    alunoAdapter adapter;
    ProgressBar progressBar;
    MainPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        progressBar = findViewById(R.id.progressBar);

        listView = findViewById(R.id.listview);

        adapter = new alunoAdapter(this);

        listView.setAdapter(adapter);

        presenter= new MainPresenter(this, ServiceFactory.create());
        presenter.carregarAlunos();

    }

    @Override
    public void exibirBarraProgesso(){
        progressBar.setVisibility(View.VISIBLE);
        listView.setVisibility(View.GONE);

    }

    @Override
    public void esconderBarraProgesso(){
        progressBar.setVisibility(View.GONE);
        listView.setVisibility(View.VISIBLE);

    }



    public void preencherLista(List<Aluno> lstAluno){
        adapter.clear();
        adapter.addAll(lstAluno);


    }


}
