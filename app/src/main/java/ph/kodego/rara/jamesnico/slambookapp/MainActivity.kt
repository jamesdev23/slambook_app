package ph.kodego.rara.jamesnico.slambookapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import ph.kodego.rara.jamesnico.slambookapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.title.text = "Main Page"
    }


}