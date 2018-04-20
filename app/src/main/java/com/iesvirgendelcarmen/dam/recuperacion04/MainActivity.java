package com.iesvirgendelcarmen.dam.recuperacion04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView reciclador;
    private RecyclerView.Adapter adaptador;
    private RecyclerView.LayoutManager gestor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reciclador=(RecyclerView)findViewById(R.id.reciclador);

        List<Encapsulador>datos=new ArrayList<>();
        datos.add(new Encapsulador(R.drawable.ironman,"IRON MAN","Iron Man, cuyo nombre real es Anthony Edward Stark, mejor conocido como Tony Stark es un " +
                "superhéroe que aparece en los cómics publicados por Marvel Comics. Está casado con Pepper Potts."));
        datos.add(new Encapsulador(R.drawable.deadpool,"DEADPOOL","Wade Winston Wilson, más conocido como Deadpool, es un personaje ficticio, mercenario, supervillano y antihéroe, "+"" +
                "que aparece en los cómics publicados por Marvel Comics. Creado por el artista Rob Liefeld y el escritor Fabian Nicieza. Deadpool apareció por primera vez en New Mutants (vol. 1) #98 (1991)."));
        datos.add(new Encapsulador(R.drawable.thanos,"THANOS","Es un personaje de Marvel Comics y supervillano creado por Jim Starlin y Mike Friedrich. Su nombre es en "+"" +
                "parte un juego de palabras que hace referencia al término griego Θάνατος (Thánatos), que significa muerte, pero principalmente es una deformación del nombre del dios de la muerte no violenta, Tánatos."));
        datos.add(new Encapsulador(R.drawable.viuda,"VIUDA NEGRA","Viuda Negra (en inglés Black Widow), cuyo nombre real es Natalia Alianovna Romanova, mejor conocida como Natasha Romanoff es una superheroína "+
                "ficticia que pertenece a Marvel Comics. Dentro del Universo Marvel hay varias viudas negras, todas ellas pertenecen o han pertenecido a una organización espía rusa. La más importante es Natasha Romanoff, que ya abandonó "+
                "el grupo, para ejercer de agente de inteligencia y espionaje en organizaciones como S.H.I.E.L.D. y convertirse en una de las superheroínas más letales, al formar miembro del equipo de superhéroes, Los Vengadores."));
        reciclador.setHasFixedSize(true);

        gestor=new LinearLayoutManager(this);
        reciclador.setLayoutManager(gestor);

        adaptador=new Adaptador(datos);
        reciclador.setAdapter(adaptador);
    }
}
