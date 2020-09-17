package com.rmiranda.androidjetpackcompose.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import com.rmiranda.androidjetpackcompose.R
import com.rmiranda.androidjetpackcompose.ui.util.AndroidJetpackComposeTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    CustomTopAppBar(getString(R.string.app_name))
                }
            }
        }
    }
}

@Composable
fun CustomTopAppBar(customTitle: String) {
    TopAppBar(
            title = {
                Text(text = customTitle)
            }
    )
}