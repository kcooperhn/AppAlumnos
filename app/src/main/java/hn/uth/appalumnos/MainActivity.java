package hn.uth.appalumnos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

import hn.uth.appalumnos.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnSaludar.setOnClickListener(v -> {

            if(binding.edtNombre.getText().toString().isEmpty()){
                binding.imgSaludo.setVisibility(View.GONE);
                Snackbar.make(binding.layoutBienvenida, R.string.mensaje_error_nombre,
                                Snackbar.LENGTH_LONG).show();
            }else{
                String mensajeBienvenida = getString(R.string.mensaje_bienvenida, binding.edtNombre.getText());
                binding.txtTitulo.setText(mensajeBienvenida);
                binding.imgSaludo.setVisibility(View.VISIBLE);
            }
        });

    }
}