package br.edu.ifro.vilhena.ads.tarefas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifro.vilhena.ads.tarefas.model.Tarefa;

public class ListarTarefasActivity extends AppCompatActivity {

    private ListView IsvListarTarefas;
    private List<Tarefa> tarefas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_tarefas);
        IsvListarTarefas= findViewById(R.id.ISV_listar_tarefas);
        ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();

        Tarefa t1 = new Tarefa(1,"pagar Boleto energia");
        Tarefa t2 = new Tarefa(2,"Estudar para a prova de Matematica");
        Tarefa t3 = new Tarefa(3,"Comprar biscoito");

        tarefas.add(t1);
        tarefas.add(t2);
        tarefas.add(t3);

        //vincula a lista ao ListView
        ArrayAdapter<Tarefa> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,tarefas);

        IsvListarTarefas.setAdapter(adapter);
    }
}
