package com.example.morningandroid

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.provider.Telephony.Carriers.PASSWORD
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardType.Companion.Password
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.morningandroid.ui.theme.MorningAndroidTheme
//import kotlinx.coroutines.flow.internal.NoOpContinuation.context
//import kotlin.coroutines.jvm.internal.CompletedContinuation.context

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MorningAndroidTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "ADEBAYOR",
                        modifier = Modifier.padding(innerPadding)
                    )

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var firstName by remember { mutableStateOf(value = "")
    }
    var secondName by remember {
        mutableStateOf(value = "")

    }
    var email by remember {
        mutableStateOf(value = "")
    }
    var password by remember {
        mutableStateOf(value = "")
    }
    val context = LocalContext.current
   Column(
       modifier = Modifier
           .clip(shape = RoundedCornerShape(10.dp))
           .fillMaxHeight()
           .fillMaxWidth(),
       verticalArrangement = Arrangement.Center

   ) {
       Text(text = "GoodMorning $name",
           fontSize = 20.sp,
           color = Color.Blue,
           fontFamily = FontFamily.SansSerif,
           fontStyle = FontStyle.Normal,
           textAlign = TextAlign.Center,
           modifier = Modifier
               .background(Color.Green)
               .padding(20.dp)
               .fillMaxWidth()
       )
       Spacer(modifier = Modifier.height(10.dp))
       Image(modifier = Modifier
           .wrapContentHeight()
           .fillMaxWidth()
           .height(80.dp),
           painter = painterResource(id = R.drawable.word                                                                                           )
           , contentDescription = "word Logo")
       Spacer(modifier = Modifier.height(10.dp))
       OutlinedTextField(modifier = Modifier
           .wrapContentWidth()
           .align(Alignment.CenterHorizontally),
           label = { Text(text = "Enter First Name")},
           placeholder = { Text(text = "Please enter first name")},
           value = firstName,
           onValueChange ={
               newName -> firstName = newName
           } )
       Spacer(modifier = modifier.height(10.dp))
       OutlinedTextField(modifier = Modifier
           .wrapContentWidth()
           .align(Alignment.CenterHorizontally),
           label = { Text(text = "Enter Last Name")},
           placeholder = { Text(text = "Please Enter Last Name")},
           value = secondName,
           onValueChange ={
               newName->secondName=newName
           } )
       Spacer(modifier = modifier.height(10.dp))
       OutlinedTextField(modifier = Modifier
           .wrapContentWidth()
           .align(Alignment.CenterHorizontally),
           label = { Text(text = "Enter Email")},
           placeholder = { Text(text = "Please Enter Email ")},
           value = email,
           onValueChange ={
                   newEmail->email=newEmail
       

   } )
       Spacer(modifier = modifier.height(10.dp))
       OutlinedTextField(modifier = Modifier
           .wrapContentWidth()
           .align(Alignment.CenterHorizontally),
           label = { Text(text = "Enter Password")},
           placeholder = { Text(text = "Please Enter PASSWORD ")},
           value = PASSWORD,
           onValueChange ={
                   newPassword->password=newPassword
} )
    Spacer(modifier = Modifier.height(20.dp))
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(Color.Green),
        modifier = Modifier
            .wrapContentWidth()
            .align(Alignment.CenterHorizontally)
    ) {
        Text(modifier = Modifier.padding(10.dp),
            text = "REGISTER HERE")
    }
       Spacer(modifier = Modifier.height(10.dp))
       Row {
           Button(
               onClick = {
                   val intent = Intent(context,Dashboard::class.java)
                   context.startActivity(intent)

               },
               colors = ButtonDefaults
                   .buttonColors(Color.Magenta)

           )

           {
               Text(text = "LOGIN HERE")

           }
           Spacer(modifier = Modifier.width(80.dp))
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults
                    .buttonColors(Color.Cyan)
            )
            {
                Text(text = "FORGET PASSWORD")

            }
       }

       }
        
    }   

//@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MorningAndroidTheme {
        Greeting("Android")
    }

}