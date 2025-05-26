package edu.pe.cibertec.loginapp.screen

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun  LoginScreen(modifier: Modifier = Modifier, navController: NavController){
    var userName by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column (modifier = modifier.fillMaxSize().padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

    )
    {
        Text(
            "Usuario",
            modifier = modifier.fillMaxWidth()
        )
        Spacer(modifier= Modifier.height(5.dp))
        OutlinedTextField(
            value = userName,
            onValueChange =  {
                userName = it.toString()
            },
            label = {
                Text("Usuario aqui")
            },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier= Modifier.height(5.dp))
        Text(
            "Password",
            modifier = modifier.fillMaxWidth()
        )
        Spacer(modifier= Modifier.height(5.dp))
        OutlinedTextField(
            value = password,
            onValueChange = {
                password = it.toString()
            },
            label = {
                Text("Password Aqui")
            },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier= Modifier.height(10.dp))
        Button(
            onClick = {
               navController.navigate("principal")
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Iniciar Sesion")
        }

    }

}