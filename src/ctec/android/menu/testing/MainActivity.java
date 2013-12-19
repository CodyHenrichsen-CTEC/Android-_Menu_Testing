package ctec.android.menu.testing;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity
{

	protected Button homeButton;
	protected Button otherButton;

	protected void returnHome()
	{
		Intent myIntent = new Intent(this.getBaseContext(), MenuCalledActivity.class);
		startActivityForResult(myIntent, 0);
	}

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		homeButton = (Button) findViewById(R.id.button1);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
