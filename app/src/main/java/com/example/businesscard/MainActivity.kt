package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCard(
                        name = "Muhammadou Drammeh",
                        title = "Software Engineer",
                        phoneNumber = "+1 206-234-4324",
                        socialMediaHandle = "@MuhammadTech",
                        emailAddress = "Muhamdra@gmail.com"
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(name: String,   title: String,
             phoneNumber: String,
             socialMediaHandle: String,
             emailAddress: String) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ){
    Column(modifier = Modifier.weight(2F)) {
        Text(
            text = name,
            style = MaterialTheme.typography.h5,
            modifier = Modifier.padding(8.dp)
        )
        Text(
            text = title,
            style = MaterialTheme.typography.body2,
            modifier = Modifier.padding(16.dp)
        )
    }
        Divider(modifier = Modifier.fillMaxWidth())
        Column(
            modifier = Modifier.weight(3F)
        ) {
            Text(
                text = "Phone: $phoneNumber",
                style = MaterialTheme.typography.body2,
                modifier = Modifier.padding(8.dp)
            )

            Text(
                text = "Social: $socialMediaHandle",
                style = MaterialTheme.typography.body2,
                modifier = Modifier.padding(8.dp)
            )

            Text(
                text = "Email: $emailAddress",
                style = MaterialTheme.typography.body2,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        BusinessCard(
            name = "Muhammadou Drammeh",
            title = "Software Engineer",
            phoneNumber = "+1 206-234-4324",
            socialMediaHandle = "@MuhammadTech",
            emailAddress = "Muhamdra@gmail.com"
        )
    }
}