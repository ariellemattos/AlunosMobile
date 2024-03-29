package br.com.senaijandira.alunos.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import br.com.senaijandira.alunos.R;
import br.com.senaijandira.alunos.model.Aluno;

/**
 * Created by 17259195 on 29/10/2018.
 */

public class alunoAdapter extends ArrayAdapter<Aluno> {
    public alunoAdapter(Context ctx) {
        super(ctx, 0, new ArrayList<Aluno>());
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;


        if(v == null){
            v = LayoutInflater.from(getContext()).inflate(R.layout.list_view_item, parent, false);
        }

        Aluno aluno = getItem(position);

        TextView txtNome = v.findViewById(R.id.txtAluno);
        TextView txtMatricula = v.findViewById(R.id.txtMatricula);

        txtNome.setText(aluno.getNome());
        txtMatricula.setText(aluno.getMatricula() + "");

        return v;
    }
}

