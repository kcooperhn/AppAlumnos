package hn.uth.appalumnos;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

import hn.uth.appalumnos.adapter.AlumnosAdapter;
import hn.uth.appalumnos.databinding.ActivityListadoDatosBinding;
import hn.uth.appalumnos.entity.Alumno;

public class ListadoDatosActivity extends AppCompatActivity implements OnItemClickListener<Alumno> {


    private ActivityListadoDatosBinding binding;
    private AlumnosAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityListadoDatosBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        binding.fab.setOnClickListener(view -> {
           Intent intento = new Intent(this.getBaseContext(), MainActivity.class);
           startActivity(intento);
        });

        List<Alumno> listadoAlumnos = new ArrayList<>();
        listadoAlumnos.add(new Alumno("Pedro Perez", "2020123456789", "pedro@gmail.com","Masculino","SPS"));
        listadoAlumnos.add(new Alumno("Juan Fernandez", "20234567895", "juan@gmail.com","Masculino","SPS"));
        listadoAlumnos.add(new Alumno("Rosario Dominguez", "201921654655", "rosario@gmail.com","Femenino","SPS"));
        listadoAlumnos.add(new Alumno("Juan Castro", "2021123456789", "juanc@gmail.com","Masculino","TGU"));
        listadoAlumnos.add(new Alumno("Lucia Hernandez", "2018123456789", "lucia@gmail.com","Femenino","Roatan"));
        listadoAlumnos.add(new Alumno("Lilian Cerrato", "2019123456789", "lilian@gmail.com","Femenino","SPS"));
        listadoAlumnos.add(new Alumno("Carlos Castro", "2020112356789", "carlos@gmail.com","Masculino","Choloma"));
        listadoAlumnos.add(new Alumno("Roberto Contreras", "2020335456789", "roberto@gmail.com","Masculino","SPS"));
        listadoAlumnos.add(new Alumno("Julio Perdomo", "2020198756789", "julio@gmail.com","Masculino","Juticalpa"));
        listadoAlumnos.add(new Alumno("Sofia Lanza", "2020129586789", "sofia@gmail.com","Femenino","SPS"));
        listadoAlumnos.add(new Alumno("Pedro Perez", "2020123456789", "pedrop@gmail.com","Masculino","Puerto Cortes"));
        listadoAlumnos.add(new Alumno("Juan Fernandez", "20234567895", "juanf@gmail.com","Masculino","SPS"));
        listadoAlumnos.add(new Alumno("Rosario Dominguez", "201921654655", "rosi@gmail.com","Femenino","SPS"));
        listadoAlumnos.add(new Alumno("Juan Castro", "2021123456789", "juanca@gmail.com","Masculino","SPS"));
        listadoAlumnos.add(new Alumno("Lucia Hernandez", "2018123456789", "luci@gmail.com","Femenino","SPS"));
        listadoAlumnos.add(new Alumno("Lilian Cerrato", "2019123456789", "lili@gmail.com","Masculino","SPS"));
        listadoAlumnos.add(new Alumno("Carlos Castro", "2020112356789", "carlisc@gmail.com","Masculino","SPS"));
        listadoAlumnos.add(new Alumno("Roberto Contreras", "2020335456789", "rober@gmail.com","Masculino","SPS"));
        listadoAlumnos.add(new Alumno("Julio Perdomo", "2020198756789", "juliop@gmail.com","Masculino","SPS"));
        listadoAlumnos.add(new Alumno("Sofia Lanza", "2020129586789", "sofi@gmail.com","Masculino","TGU"));

        adapter = new AlumnosAdapter(listadoAlumnos, this);
        setupRecyclerView();
    }

    private void setupRecyclerView(){
        LinearLayoutManager linearLayout = new LinearLayoutManager(this.getApplicationContext());
        binding.contentlistado.rvDatos.setLayoutManager(linearLayout);
        binding.contentlistado.rvDatos.setAdapter(adapter);
    }

    @Override
    public void onItemClick(Alumno data) {
        Intent intento = new Intent(this.getBaseContext(), MainActivity.class);
        intento.putExtra("ALUMNO_NOMBRE", data.getNombre());
        intento.putExtra("ALUMNO_CUENTA", data.getCuenta());
        intento.putExtra("ALUMNO_CORREO", data.getCorreo());
        intento.putExtra("ALUMNO_GENERO", data.getGenero());
        intento.putExtra("ALUMNO_CAMPUS", data.getCampus());
        startActivity(intento);
    }
}