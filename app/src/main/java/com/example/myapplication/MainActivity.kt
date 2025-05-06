package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.View
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //default to create_account
        setContentView(R.layout.activity_create_account)
        //click to signUpCustomer gia na pame sto signUpScreen
        val btnSignUpCustomer=findViewById<View>(R.id.signUpCustomerButton)
        btnSignUpCustomer.setOnClickListener{
            Intent(this,SignUpCustomerActivity::class.java).also{
                startActivity(it)
            }
        }
        //click to signUpTech gia na pame sto signUpTech
        val btnSignUpTech=findViewById<View>(R.id.signUpTechButton)
        btnSignUpTech.setOnClickListener {
            Intent(this, SignUpTechActivity::class.java).also {
                startActivity(it)
            }
        }
        //click gia signIn
        val btnSignIn=findViewById<View>(R.id.signInButton)
        btnSignIn.setOnClickListener{
            Intent(this,SignInActivity::class.java).also{
                    startActivity(it)
            }

        }

        }

    }
