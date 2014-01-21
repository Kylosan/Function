package com.example.funkc;

																//Za³adowanie pakietów 
import com.example.funkc.MainActivity;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {
	DravView dravview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btn = (Button) findViewById(R.id.button1);
		btn.setOnClickListener(new CalcButtonListener());
	}
	public float a=1,b=1,c=1;
																//Funkcje generowane przy tworzeniu aplikacji
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void ConfigurationChanged(Configuration newConfig)	//Utworzenie nowej konfiguracji
	{
		super.onConfigurationChanged(newConfig);
	}


private class CalcButtonListener implements OnClickListener		//Klasa nas³uchuj¹ca klikniêcia
{
	public void onClick(View v)									//Funkcja obs³uguj¹ca eventy zwi¹zane z konkretnymi objektami
	{
		
		EditText ed1 = (EditText) findViewById(R.id.editText1);
		EditText ed2 = (EditText) findViewById(R.id.editText2);
		EditText ed3 = (EditText) findViewById(R.id.editText3);
	
		
		try														//Sprawdzanie poprawnoœci danych dla argumentu A
		{
			a=Float.parseFloat(ed1.getText().toString());
		}
		catch(Exception e)										//Powiadomienie gdy dane nie s¹ poprawne
		{
			ed1.setText(getString(R.string.bad_value));
			return;
		}
		try														//Sprawdzanie poprawnoœci danych dla argumentu A
		{
			b=Float.parseFloat(ed2.getText().toString());
		}
		catch(Exception e)										//Powiadomienie gdy dane nie s¹ poprawne
		{
			ed2.setText(getString(R.string.bad_value));
			return;
		}
		try														//Sprawdzanie poprawnoœci danych dla argumentu A
		{
			c=Float.parseFloat(ed3.getText().toString());
		}
		catch(Exception e)					
		{
			ed3.setText(getString(R.string.bad_value));			//Powiadomienie gdy dane nie s¹ poprawne
			return;
		}
		
	}
}


}