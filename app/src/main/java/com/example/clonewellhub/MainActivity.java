package com.example.clonewellhub;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.activity_main);

        // Primeiro cartão
        View academia1 = findViewById(R.id.academia_1);

        TextView nome1 = academia1.findViewById(R.id.txt_nome_academia);
        nome1.setText(R.string.academia_arena);


        // Segundo cartão
        View academia2 = findViewById(R.id.academia_2);

        TextView nome2 = academia2.findViewById(R.id.txt_nome_academia);
        nome2.setText(R.string.academia_box);

        // Terceiro cartão
        View academia3 = findViewById(R.id.academia_3);

        TextView nome3 = academia3.findViewById(R.id.txt_nome_academia);
        nome3.setText(R.string.academia_clinica);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}