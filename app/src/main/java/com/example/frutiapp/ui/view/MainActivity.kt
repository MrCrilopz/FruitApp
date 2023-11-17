package com.example.frutiapp.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.frutiapp.databinding.ActivityMainBinding
import com.example.frutiapp.ui.viewmodel.FrutasViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val frutasViewModel: FrutasViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        frutasViewModel.onCreate()

        frutasViewModel.frutasModel.observe(this, Observer {
            binding.tvNombre.text = it.nombre
            binding.tvCalorias.text = "Calorias: "+it.nutricion.calorias.toString()
            binding.tvGrasa.text = "Grasa: "+it.nutricion.grasa.toString()
            binding.tvAzucar.text = "Azúcar: "+it.nutricion.azucar.toString()
            binding.tvCarbohidratos.text = "Carbohidratos: "+it.nutricion.carbohidratos.toString()
            binding.tvProteina.text = "Proteína: "+it.nutricion.proteina.toString()
            binding.tvId.text = it.id.toString()
        })

        binding.viewContainer.setOnClickListener {
            frutasViewModel.onCreate()
        }
    }
}