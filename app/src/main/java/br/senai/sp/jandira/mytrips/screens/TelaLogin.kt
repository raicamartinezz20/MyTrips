package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.mytrips.repository.ContaRepository
import br.senai.sp.jandira.mytrips.ui.theme.MytripsTheme

@Composable
fun TelaLogin(controleDeNavegacao: NavHostController) {


    var emailState = remember {
        mutableStateOf("")
    }

    var senhaState = remember {
        mutableStateOf("")
    }

    var erroLoginState = remember {
        mutableStateOf(false)
    }

    var mensagemErroState = remember {
        mutableStateOf("")
    }

    var contaRepository = ContaRepository(LocalContext.current)

    MytripsTheme {
        Column (
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ){
                Box(
                    modifier = Modifier
                        .background(
                            color = Color(0xFFCF06F0),
                            shape = RoundedCornerShape(bottomStart = 10.dp)
                        )
                        .height(40.dp)
                        .width(120.dp),

                    ){

                }

            }

        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(10.dp)
        ) {
            Text(
                text = "Login",
                color = Color(0xFFCF06F0),
                fontSize = 48.sp,
                fontWeight = FontWeight.ExtraBold,

                modifier = Modifier
                    .offset(x = 2.dp, y = 156.dp)


            )

            Text(
                text = "Please sign in to continue.",
                color = Color(0xFFA09C9C),
                fontSize = 14.sp,
                modifier = Modifier
                    .offset(x = 2.dp, y = 151.dp)
            )

        }

        Column (
            modifier = Modifier
                .padding(16.dp)
        ) {

            OutlinedTextField(
                value = emailState.value,
                onValueChange = {
                                emailState.value = it

                },
                isError = erroLoginState.value,
                modifier = Modifier
                    .padding(top = 300.dp)
                    .fillMaxWidth(),
                label = {
                    Text(text = "E-mail" )
                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        focusedBorderColor = Color(0xFFA600FF),
                        unfocusedBorderColor = Color(0xFFA600FF),
                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.Black
                    ),
                shape = RoundedCornerShape(16.dp),
                leadingIcon = {
                    Icon(imageVector = Icons.Filled.Email, contentDescription = "", tint = Color(0xFFCF06F0))
                }

            )
            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = senhaState.value,
                onValueChange ={
                               senhaState.value = it
                },
                isError = erroLoginState.value,
                modifier =  Modifier
                    .fillMaxWidth(),

                label = {
                    Text(text = "Password")
                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        focusedBorderColor = Color(0xFFA600FF),
                        unfocusedBorderColor = Color(0xFFA600FF),

                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.Black
                    ),
                shape = RoundedCornerShape(16.dp),
                leadingIcon = {
                    Icon(imageVector = Icons.Filled.Lock, contentDescription = "", tint = Color(0xFFCF06F0))
                }

            )

            Text(text = mensagemErroState.value,
                color = Color.Red)

        }


        Column {
            Button(
                onClick = {
                    val email = emailState.value
                    val senha = senhaState.value
                    if(contaRepository.verificarLogin(email, senha)){
                        controleDeNavegacao.navigate("home")
                    }else{
                        erroLoginState.value = true
                        mensagemErroState.value = "Usuario ou senha incorretos"
                    }
                          },
                modifier = Modifier
                    .width(150.dp)
                    .offset(x = 225.dp, y = 490.dp)
                    .height(50.dp),

                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFCF06F0)),
                shape = RoundedCornerShape(16.dp)
            ) {

                Text(
                    text = "SIGN IN",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Black

                )
                Icon(imageVector = Icons.Filled.ArrowForward, contentDescription = "", tint = Color.White)

            }

            Text(
                text = "Don’t have an account?",
                color = Color(0xFFA09C9C),
                fontSize = 12.sp,
                modifier = Modifier
                    .offset(x= 180.dp, y = 516.dp)
            )

            Text(
                text = "Sign up",
                color = Color(0xFFCF06F0),
                fontWeight = FontWeight.ExtraBold,
                fontSize = 14.sp,
                modifier = Modifier
                    .offset(x= 320.dp, y= 499.dp)
                    .clickable { controleDeNavegacao.navigate("cadastro") }

            )

        }


        Column (
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row (
                modifier = Modifier
                    .offset(y = 740.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ){
                Box(
                    modifier = Modifier
                        .background(
                            color = Color(0xFFCF06F0),
                            shape = RoundedCornerShape(topEnd = 10.dp)
                        )
                        .height(40.dp)
                        .width(120.dp)

                ){

                }

            }

        }
    }

}


@Preview
@Composable
fun TelaLoginPreview () {

    MytripsTheme {
//        TelaLogin(controleDeNavegacao = )
    }


}
