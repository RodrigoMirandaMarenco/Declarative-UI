package com.rmiranda.androidjetpackcompose.ui.activity

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.ColumnScope.gravity
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.ui.tooling.preview.Preview
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