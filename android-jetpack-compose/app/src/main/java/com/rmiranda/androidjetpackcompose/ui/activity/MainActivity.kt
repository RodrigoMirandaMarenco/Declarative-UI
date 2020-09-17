package com.rmiranda.androidjetpackcompose.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.rmiranda.androidjetpackcompose.R
import com.rmiranda.androidjetpackcompose.data.model.Talk
import com.rmiranda.androidjetpackcompose.ui.util.AndroidJetpackComposeTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidJetpackComposeTheme {
                Surface(color = MaterialTheme.colors.background) {
                    MainScreen(getString(R.string.app_name), Talk.dummyTalks())
                }
            }
        }
    }
}

@Composable
fun MainScreen(customTitle: String, talks: List<Talk>) {
    Column {
        CustomTopAppBar(customTitle = customTitle)
        TalkList(talks = talks)
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

@Composable
fun TalkList(talks: List<Talk>) {
    ScrollableColumn {
        talks.forEach {
            TalkItem(talk = it)
        }
    }
}

@Composable
fun TalkItem(talk: Talk) {
    MaterialTheme {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = talk.title
            )
        }
    }
}