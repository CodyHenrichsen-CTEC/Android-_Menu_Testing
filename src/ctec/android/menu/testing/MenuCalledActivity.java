package ctec.android.menu.testing;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v4.app.NavUtils;

public class MenuCalledActivity extends Activity
{
	View menuCalledView;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_called);

	}

	private void swapBack()
	{
		Intent intent = new Intent();
		setResult(RESULT_OK, intent);
		finish();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.activity_menu_called, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		if(item.getItemId() == R.id.returnToBase)
		{
			swapBack();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
