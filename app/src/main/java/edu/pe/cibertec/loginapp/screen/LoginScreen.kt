package edu.pe.cibertec.loginapp.screen

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(
    showBackground = true
)
@Composable
fun  LoginScreen(modifier: Modifier = Modifier){
    var userName:String = ""
    var password: String = ""
    Column (modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center)
    {
        Text(
            "Usuario",
            modifier = modifier.fillMaxWidth()
        )
        Spacer(modifier= Modifier.height(15.dp))
        OutlinedTextField(
            value = "",
            onValueChange =  {
                userName = it.toString()
            },
            label = {
                Text("Usuario aqui")
            },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier= Modifier.height(15.dp))
        Text(
            "Password",
            modifier = modifier.fillMaxWidth()
        )
        Spacer(modifier= Modifier.height(15.dp))
        OutlinedTextField(
            value = "",
            onValueChange = {
                password = it.toString()
            },
            label = {
                Text("Password Aqui")
            },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier= Modifier.height(15.dp))
        Button(
            onClick = {

            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Iniciar Sesion")
        }


    }

}