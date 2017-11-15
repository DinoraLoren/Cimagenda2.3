package com.uabc.dario.cimagenda20;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Button btn1, btn2, btn3, btn4, btn5;
    DrawerLayout drawer;
    NavigationView navigationView;
    Toolbar toolbar=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btn1 = (Button) findViewById(R.id.iv_agenda);
        btn2 = (Button) findViewById(R.id.iv_horario);
        btn3 = (Button) findViewById(R.id.iv_calendario);
        btn4 = (Button) findViewById(R.id.iv_materias);
        btn5 = (Button) findViewById(R.id.iv_usuario);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
             Intent a= new Intent(Home.this,Agenda.class);
             startActivity(a);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent a= new Intent(Home.this, Horario.class);
                startActivity(a);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent a= new Intent(Home.this,Calendario.class);
                startActivity(a);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent a= new Intent(Home.this,Materias.class);
                startActivity(a);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent a= new Intent(Home.this,Usuario.class);
                startActivity(a);
            }
        });


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Botón de acción para Home", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch(id){

            case R.id.nav_home:
                Intent h= new Intent(Home.this,Home.class);
                startActivity(h);
                break;

            case R.id.nav_agenda:
                Intent a= new Intent(Home.this,Agenda.class);
                startActivity(a);
                break;

            case R.id.nav_horario:
                Intent i= new Intent(Home.this,Horario.class);
                startActivity(i);
                break;

            case R.id.nav_calendario:
                Intent j= new Intent(Home.this,Calendario.class);
                startActivity(j);
                break;

            case R.id.nav_materias:
                Intent k= new Intent(Home.this,Materias.class);
                startActivity(k);
                break;

            case R.id.nav_usuario:
                Intent l= new Intent(Home.this,Usuario.class);
                startActivity(l);
                break;

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
