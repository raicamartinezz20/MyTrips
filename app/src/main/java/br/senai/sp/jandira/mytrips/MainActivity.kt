'package br.senai.sp.jandira.mytrips

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.mytrips.screens.TelaCadastro
import br.senai.sp.jandira.mytrips.screens.TelaHome
import br.senai.sp.jandira.mytrips.screens.TelaLogin
import br.senai.sp.jandira.mytrips.ui.theme.MytripsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MytripsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val controleDeNavegacao = rememberNavController()

                    NavHost(
                        navController = controleDeNavegacao ,
                        startDestination = "login"
                    ){
                        composable(route = "login"){ TelaLogin(controleDeNavegacao) }
                        composable(route = "home"){  TelaHome(controleDeNavegacao) }
                        composable(route = "cadastro"){ TelaCadastro(controleDeNavegacao) }
                    }
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MytripsTheme {
        Greeting("Android")
    }
}
