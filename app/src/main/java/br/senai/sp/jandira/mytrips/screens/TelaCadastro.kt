package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.mytrips.R
import br.senai.sp.jandira.mytrips.model.Usuario
import br.senai.sp.jandira.mytrips.repository.ContaRepository
import br.senai.sp.jandira.mytrips.ui.theme.MytripsTheme



@Composable
fun TelaCadastro(controleDeNavegacao: NavHostController) {


    var nomeState = remember {
        mutableStateOf("")
    }
    var emailState = remember {
        mutableStateOf("")
    }
    var foneState = remember {
        mutableStateOf("")
    }
    var senhaState = remember {
        mutableStateOf("")
    }

    var isOverState = remember {
        mutableStateOf(false)
    }

    val cr = ContaRepository(LocalContext.current)




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
            text = "Sign Up",
            color = Color(0xFFCF06F0),
            fontSize = 32.sp,
            fontWeight = FontWeight.ExtraBold,

            modifier = Modifier
                .offset(x = 125.dp, y = 41.dp)


        )

        Text(
            text = "Create a new account",
            color = Color(0xFFA09C9C),
            fontSize = 14.sp,
            modifier = Modifier
                .offset(x = 110.dp, y = 46.dp)
        )

        Card (
            modifier = Modifier
                .size(120.dp)
                .offset(x = 144.dp, y = 60.dp),
            shape = CircleShape,
            colors = CardDefaults.cardColors(Color.Transparent),
        ){
            Image(
                painter = painterResource(id = R.drawable.perfil),
                contentDescription = "",
                modifier = Modifier.size(100.dp),
                contentScale = ContentScale.Crop
            )
        }

    }

    Column (
        modifier = Modifier
            .padding(16.dp)
    ) {

        OutlinedTextField(
            value = nomeState.value,
            onValueChange = {
                            nomeState.value = it
            },
            modifier = Modifier
                .padding(top = 225.dp)
                .fillMaxWidth(),
            label = {
                Text(text = "Username" )
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
            value = foneState.value ,
            onValueChange ={
                           foneState.value = it
            },
            modifier =  Modifier
                .fillMaxWidth(),

            label = {
                Text(text = "Phone")
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
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = emailState.value,
            onValueChange ={
                           emailState.value = it
            },
            modifier =  Modifier
                .fillMaxWidth(),

            label = {
                Text(text = "E-mail")
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
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = senhaState.value,
            onValueChange ={
                           senhaState.value = it
            },
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




    }


    Column {

        Checkbox(
            checked = isOverState.value,
            onCheckedChange = {
                              isOverState.value = it
            },
            colors = CheckboxDefaults.colors(
                uncheckedColor = Color(0xFFCF06F0),
                checkedColor = Color(0xFFCF06F0)
            ),
            modifier = Modifier
                .offset(x=10.dp, y = 550.dp)


        )
        Text(
            text = "Over 18?",
            color = Color.Black,
            modifier = Modifier
                .offset(x = 50.dp, y = 515.dp)
        )

        Button(onClick = {
                      val conta = Usuario(
                          nome = nomeState.value,
                          telefone = foneState.value,
                          email = emailState.value,
                          senha = senhaState.value,
                          isOver = isOverState.value
                      )
            cr.salvar(conta)
            controleDeNavegacao.navigate("login")
                         },
            modifier = Modifier
                .width(327.dp)
                .offset(x = 35.dp, y = 540.dp)
                .height(48.dp),

            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFCF06F0)),
            shape = RoundedCornerShape(16.dp)
        ) {

            Text(
                text = "CREATE ACCOUNT",
                fontSize = 16.sp,
                fontWeight = FontWeight.Black

            )
        }

        Text(
            text = "Already have an account?",
            color = Color(0xFFA09C9C),
            fontSize = 12.sp,
            modifier = Modifier
                .offset(x= 165.dp, y = 551.dp)
        )

        Text(
            text = "Sign in",
            color = Color(0xFFCF06F0),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 14.sp,
            modifier = Modifier
                .offset(x = 320.dp, y = 533.dp)
                .clickable {
                    controleDeNavegacao.navigate("login")
                }
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
                        // Borda da box
                        shape = RoundedCornerShape(topEnd = 10.dp)
                    )
                    .height(40.dp)
                    .width(120.dp)

            ){

            }

        }

    }


}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaCadastroPreview() {
    MytripsTheme {
//        TelaCadastro(controleDeNavegacao = )

    }
}
