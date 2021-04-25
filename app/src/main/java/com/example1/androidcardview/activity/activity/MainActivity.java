package com.example1.androidcardview.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example1.androidcardview.R;
import com.example1.androidcardview.activity.adapter.PostagemAdapter;
import com.example1.androidcardview.activity.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    // Criando uma lista de postagens conforme model
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        // Definir layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);

        // Configuração HORIZONTAL da aplicação
        // LinearLayoutManager layoutManager1 = new LinearLayoutManager(this);
        // layoutManager1.setOrientation(LinearLayout.HORIZONTAL);
        // recyclerPostagem.setLayoutManager(layoutManager1);

        // Configuração GRID da aplicação
        // RecyclerView.LayoutManager layoutManager3 = new GridLayoutManager(this, 2);
        // recyclerPostagem.setLayoutManager(layoutManager3);

        // Definir o adapter
        this.prepararPostagens();

        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void prepararPostagens() {
        Postagem post = new Postagem(
                "Kadu Floresta",
                "#TBT Viagem legal...",
                "Agora mesmo",
                R.drawable.imagem1);
        this.postagens.add(post);

        post = new Postagem(
                "Hotel Hits",
                "Desconto legais nessa trip...",
                "10 min atrás",
                R.drawable.imagem2);
        this.postagens.add(post);

        post = new Postagem("Julio Cesar",
                "#PARIS",
                "25 min atrás",
                R.drawable.imagem3);
        this.postagens.add(post);

        post = new Postagem("Maria Lucia",
                "Foto linda demais...",
                "1 hora atrás",
                R.drawable.imagem4);
        this.postagens.add(post);

    }
}