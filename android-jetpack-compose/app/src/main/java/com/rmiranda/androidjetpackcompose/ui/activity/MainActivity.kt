package com.rmiranda.androidjetpackcompose.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Box
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.koduok.compose.glideimage.GlideImage
import com.rmiranda.androidjetpackcompose.R
import com.rmiranda.androidjetpackcompose.data.model.Talk
import com.rmiranda.androidjetpackcompose.ui.util.AndroidJetpackComposeTheme
import com.rmiranda.androidjetpackcompose.ui.util.typography

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
    ScrollableColumn(modifier = Modifier.padding(horizontal = 16.dp)) {
        CustomSpacer()
        talks.forEach {
            ItemCard(talk = it)
            CustomSpacer()
        }
    }
}

@Composable
fun ItemCard(talk: Talk) {
    MaterialTheme {
        Card(
            shape = RoundedCornerShape(8.dp),
            backgroundColor = MaterialTheme.colors.surface
        ) {
            Box {
                TalkItem(talk = talk)
            }
        }
    }
}

@Composable
fun TalkItem(talk: Talk) {
    GlideImage(talk.pictureUrl) {
        centerCrop()
    }
    Row(
        modifier = Modifier.padding(8.dp)
    ) {
        Column(modifier = Modifier.width(56.dp).padding(8.dp)) {
            GlideImage(model = talk.speaker.pictureUrl) {
                circleCrop()
            }
        }
        Column {
            Text(
                text = talk.title,
                style = typography.h6,
            )
            Text(
                text = talk.speaker.name,
                style = typography.subtitle1,
                modifier = Modifier.padding(vertical = 8.dp)
            )
            Text(
                text = talk.description
            )
        }
    }
}

@Composable
fun CustomSpacer() {
    Spacer(modifier = Modifier.preferredHeight(16.dp))
}

@Preview
@Composable
fun PreviewTalkItem() {
    TalkItem(talk = Talk.dummyTalks().first())
}