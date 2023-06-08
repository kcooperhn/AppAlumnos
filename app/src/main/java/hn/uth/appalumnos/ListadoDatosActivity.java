package hn.uth.appalumnos;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

import hn.uth.appalumnos.adapter.AlumnosAdapter;
import hn.uth.appalumnos.databinding.ActivityListadoDatosBinding;
import hn.uth.appalumnos.entity.Alumno;

public class ListadoDatosActivity extends AppCompatActivity {


    private ActivityListadoDatosBinding binding;
    private AlumnosAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityListadoDatosBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAnchorView(R.id.fab)
                        .setAction("Action", null).show();
            }
        });
        List<Alumno> listadoAlumnos = new ArrayList<>();
        listadoAlumnos.add(new Alumno("Pedro Perez", "2020123456789"));
        listadoAlumnos.add(new Alumno("Juan Fernandez", "20234567895"));
        listadoAlumnos.add(new Alumno("Rosario Dominguez", "201921654655"));
        listadoAlumnos.add(new Alumno("Juan Castro", "2021123456789"));
        listadoAlumnos.add(new Alumno("Lucia Hernandez", "2018123456789"));
        listadoAlumnos.add(new Alumno("Lilian Cerrato", "2019123456789"));
        listadoAlumnos.add(new Alumno("Carlos Castro", "2020112356789"));
        listadoAlumnos.add(new Alumno("Roberto Contreras", "2020335456789"));
        listadoAlumnos.add(new Alumno("Julio Perdomo", "2020198756789"));
        listadoAlumnos.add(new Alumno("Sofia Lanza", "2020129586789"));
        listadoAlumnos.add(new Alumno("Pedro Perez", "2020123456789"));
        listadoAlumnos.add(new Alumno("Juan Fernandez", "20234567895"));
        listadoAlumnos.add(new Alumno("Rosario Dominguez", "201921654655"));
        listadoAlumnos.add(new Alumno("Juan Castro", "2021123456789"));
        listadoAlumnos.add(new Alumno("Lucia Hernandez", "2018123456789"));
        listadoAlumnos.add(new Alumno("Lilian Cerrato", "2019123456789"));
        listadoAlumnos.add(new Alumno("Carlos Castro", "2020112356789"));
        listadoAlumnos.add(new Alumno("Roberto Contreras", "2020335456789"));
        listadoAlumnos.add(new Alumno("Julio Perdomo", "2020198756789"));
        listadoAlumnos.add(new Alumno("Sofia Lanza", "2020129586789"));

        adapter = new AlumnosAdapter(listadoAlumnos);
        setupRecyclerView();
    }

    private void setupRecyclerView(){
        LinearLayoutManager linearLayout = new LinearLayoutManager(this.getApplicationContext());
        binding.contentlistado.rvDatos.setLayoutManager(linearLayout);
        binding.contentlistado.rvDatos.setAdapter(adapter);
    }

}