package com.barbaro.barbaroapp;

import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.barbaro.barbaroapp.adapter.PageAdapter;
import com.barbaro.barbaroapp.fragments.Fragment1;
import com.barbaro.barbaroapp.fragments.Fragment2;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    // Lista donde almacenamos los fragments para cada vista
    private List<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TabLayout tabLayout = findViewById(R.id.tab);

        // Agregando taps
        tabLayout.addTab(tabLayout.newTab().setText("Hola"));
        tabLayout.addTab(tabLayout.newTab().setText("Barbaro"));
        tabLayout.addTab(tabLayout.newTab().setText("Producto"));

        // Configurando el listener para cuando se seleccione una tab
        tabLayout.addOnTabSelectedListener(this);

        fillPages();

        // Establecemos el primer fragment como la vista a mostrar
        tabLayout.getTabAt(0).select();
    }

    private void fillPages() {
        fragments = new ArrayList<>();

        // Agregar los tres fragments que seran la vista por cada tab
        fragments.add(Fragment1.newInstance("Hola mundo"));
        fragments.add(Fragment1.newInstance("Barbarillo"));
        fragments.add(Fragment2.newInstance("Computadora", "Una computadora barbara"));
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {

        // Cuando se selecciona una tab lo remplazamos con el indice seleccionado.
        // Remplazamos el contenido que se esta mostrando.
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.content, fragments.get(tab.getPosition()))
                .commit();
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
        // Estos metodos tienen otro uso
    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {
        // Estos metodos tienen otro uso
    }
}
