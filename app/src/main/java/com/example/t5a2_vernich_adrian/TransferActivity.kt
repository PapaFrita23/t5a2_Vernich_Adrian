package com.example.t5a2_vernich_adrian

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.t5a2_vernich_adrian.databinding.ActivityWelcomeBinding
import com.example.t5a2_vernich_adrian.databinding.ActivityMainBinding
import com.example.t5a2_vernich_adrian.databinding.ActivityLoginBinding
import com.example.t5a2_vernich_adrian.databinding.ActivityTransferBinding

class TransferActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTransferBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTransferBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}