package com.example.submenus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    private static final int OPCION1=1;
    private static final int OPCION2=2;
    private static final int OPCION3=3;
    private static final int OPCION1_1=4;
    private static final int OPCION1_2=5;
    private static final int OPCION3_1=6;
    private static final int OPCION3_2=7;
    ImageView img;
    Toolbar tb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=(TextView)findViewById(R.id.texto);
        img=(ImageView)findViewById(R.id.imageFrutas);
        
        //El action bar que he colocado se puede hacer de forma personalizada creando otro xml el cual su raiz sea toolbar,
        //Estas lineas son las que determina la creacion del toolbar, ya sea interno como externo
        //Si es personalizado, es decir, externo, no hace falta que lo personalice usando el objeto del toolbar, sino que lo hago desde ahi directamente.

        tb=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(tb);
      /*  tb.setBackgroundColor(getResources().getColor(R.color.teal_700));
        tb.setTitleTextColor(getResources().getColor(R.color.white));

        ActionBar ab=getSupportActionBar();

        ab.setDisplayHomeAsUpEnabled(true);*/
    }

    //Teniendo un xml previamente creado
  /*  @Override
    public boolean onCreateOptionsMenu(Menu menu){

        super.onCreateOptionsMenu(menu);

        getMenuInflater().inflate(R.menu.menusubmenu,menu);
        return true;
    }

    //Solo selecciono aquellos id que voy a hacer algo con ellos, sino no hace falta que los indique
    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId()){
            case R.id.goldId:
                tv1.setText("Manzanas Gold");
                return true;
            case R.id.pinkId:
                tv1.setText("Manzanas Pink Lady");
                return true;
            case R.id.platanoId:
                tv1.setText("Platanos");
                return true;
            case R.id.peraConferenciaId:
                tv1.setText("Pera Conferencia");
                return true;
            case R.id.peraLimoneroId:
                tv1.setText("Pera Limonera");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        SubMenu sbm=menu.addSubMenu(Menu.NONE,OPCION1,Menu.NONE,"Manzanas");
        sbm.add(Menu.NONE,OPCION1_1,Menu.NONE,"Gold");
        sbm.add(Menu.NONE,OPCION1_2,Menu.NONE,"Pink Lady");

        menu.add(Menu.NONE,OPCION2,Menu.NONE,"Platanos");//añade el elemento padre ya que no tiene hijos
        SubMenu sbm2=menu.addSubMenu(Menu.NONE,OPCION3,Menu.NONE,"Peras");//Esta linea se la asigna al elemento padre
        sbm2.add(Menu.NONE,OPCION3_1,Menu.NONE,"Conferencia").setIcon(R.mipmap.conficon_round);//añade el elemento hijo
        sbm2.add(Menu.NONE,OPCION3_2,Menu.NONE,"Limonera").setIcon(R.mipmap.limoneraicon_round);//le añado el icono el cual se va a presentar al lado del texto

        return true;
    }

    //Ejercicio de seleccion desde java
 /*   @Override
    public boolean onOptionsItemSelected( MenuItem item) {

        switch(item.getItemId()){
            case OPCION1_1:
                tv1.setText("Manzanas Gold");
                return true;
            case OPCION1_2:
                tv1.setText("Manzanas Pink Lady");
                return true;
            case OPCION2:
                tv1.setText("Platanos");
                return true;
            case OPCION3_1:
                tv1.setText("Peras Conferencia");
                return true;
            case OPCION3_2:
                tv1.setText("Peras Limoneras");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }*/

    //Ampliacion de añadir fotos
    @Override
    public boolean onOptionsItemSelected( MenuItem item) {

        switch(item.getItemId()){
            case OPCION1_1:
                tv1.setText("Manzanas Gold");
                img.setImageResource(R.drawable.gold);
                return true;
            case OPCION1_2:
                tv1.setText("Manzanas Pink Lady");
                img.setImageResource(R.drawable.pinklady);
                return true;
            case OPCION2:
                tv1.setText("Platanos");
                img.setImageResource(R.drawable.platanos);
                return true;
            case OPCION3_1:
                tv1.setText("Peras Conferencia");
                img.setImageResource(R.drawable.conferencia);
                return true;
            case OPCION3_2:
                tv1.setText("Peras Limoneras");
                img.setImageResource(R.drawable.limoneras);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
