package com.villanuevand.fragments.dinamicos;


import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// Instanciando el nuevo fragmento
		MainFragment fragment = new MainFragment();
		/*Obteniendo soporte de la librer�a V4 al Fragment Manager
		 * esto debido a que estoy implementando este proyecto con un 
		 * API level 8, como se puede ver en el AndroidManifest.
		 * */
		FragmentManager manager = getSupportFragmentManager();
		//Inicializando la transaccion
		FragmentTransaction transaction  = manager.beginTransaction();
		transaction.add(R.id.main_layout,fragment,"Villanuevand");
		/*El m�todo Add de la clase FragmentTransaction necesita
		 * de 3 par�metros que son: 
		 *  1 - Id del layout donde se inflar� el Fragment
		 *  2 - El fragmento instanciado que queremos inflar
		 *  3 - Un String que funcionar� como TAG y haces la veces
		 *      de elemento key-value par. 
		 * */
		transaction.commit();
		//Enviando la transacci�n. �Y Listo =) !
		
		
		
	}

	

}
