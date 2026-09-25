package com.example.pizzariadose;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        // Pizza 1
        ImageView imgPizza1 = findViewById(R.id.imgPizza1);
        TextView txtNome1 = findViewById(R.id.txtNome1);
        TextView txtIngredientes1 = findViewById(R.id.txtIngredientes1);
        TextView txtPreco1 = findViewById(R.id.txtPreco1);

        imgPizza1.setImageResource(R.drawable.pizza_margherita);
        txtNome1.setText("Margherita");
        txtIngredientes1.setText("Molho de tomate, mussarela, manjericão e azeite.");
        txtPreco1.setText("R$ 32,90");


        // Pizza 2
        ImageView imgPizza2 = findViewById(R.id.imgPizza2);
        TextView txtNome2 = findViewById(R.id.txtNome2);
        TextView txtIngredientes2 = findViewById(R.id.txtIngredientes2);
        TextView txtPreco2 = findViewById(R.id.txtPreco2);

        imgPizza2.setImageResource(R.drawable.pizza_calabresa);
        txtNome2.setText("Calabresa");
        txtIngredientes2.setText("Molho de tomate, mussarela, calabresa, cebola e orégano.");
        txtPreco2.setText("R$ 34,90");


        // Pizza 3
        ImageView imgPizza3 = findViewById(R.id.imgPizza3);
        TextView txtNome3 = findViewById(R.id.txtNome3);
        TextView txtIngredientes3 = findViewById(R.id.txtIngredientes3);
        TextView txtPreco3 = findViewById(R.id.txtPreco3);

        imgPizza3.setImageResource(R.drawable.pizza_frango);
        txtNome3.setText("Frango com Catupiry");
        txtIngredientes3.setText("Molho de tomate, frango desfiado, catupiry e orégano.");
        txtPreco3.setText("R$ 36,90");
    }
}