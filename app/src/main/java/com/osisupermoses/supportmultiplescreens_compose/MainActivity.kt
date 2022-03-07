package com.osisupermoses.supportmultiplescreens_compose

import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.osisupermoses.supportmultiplescreens_compose.ui.theme.SupportMultipleScreensComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            MediaQuery(Dimensions.Width lessThan 400.dp) {
                Text(
                    text = "I'm only shown below a width of 400dp",
                    modifier = Modifier
                        .background(Color.Green)
                        .mediaQuery(
                            comparator = Dimensions.Width lessThan 400.dp,
                            modifier = Modifier.size(300.dp)
                        )
                )
//            }

        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SupportMultipleScreensComposeTheme {
        Greeting("Android")
    }
}