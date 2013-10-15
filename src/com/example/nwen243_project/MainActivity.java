package com.example.nwen243_project;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Spinner modesSpinner = (Spinner) findViewById(R.id.modes_spinner);
		ArrayAdapter<CharSequence> modesAdapter = ArrayAdapter.createFromResource(this,
		        R.array.modes_array, android.R.layout.simple_spinner_item);
		modesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		modesSpinner.setAdapter(modesAdapter);

		Spinner routesSpinner = (Spinner) findViewById(R.id.routes_spinner);
		ArrayAdapter<CharSequence> routesAdapter = ArrayAdapter.createFromResource(this,
		        R.array.train_routes, android.R.layout.simple_spinner_item);
		routesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		routesSpinner.setAdapter(routesAdapter);
		
		Spinner directionSpinner = (Spinner) findViewById(R.id.direction_spinner);
		ArrayAdapter<CharSequence> directionAdapter = ArrayAdapter.createFromResource(this,
		        R.array.direction, android.R.layout.simple_spinner_item);
		directionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		directionSpinner.setAdapter(directionAdapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
