package ctec.android.menu.testing;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v4.app.NavUtils;

public class BaseActivity extends Activity
{
	private View currentView;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_base);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.activity_base, menu);
		return true;
	}
	
	
	private void swap()
	{
		Intent myIntent = new Intent(this.getBaseContext(), MenuCalledActivity.class);
  	    startActivityForResult(myIntent, 0);
  	    
  	    int [] toast = new int[3];
  	    toast[0] = R.drawable.ic_action_search;
  	    
  	    
	}
	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		currentView = findViewById(R.id.defaultLayout);
		
		if(item.getItemId() == R.id.menuBlue)
		{
			currentView.setBackgroundResource(R.color.blue);
			return true;
		}
		else if(item.getItemId() == R.id.menuGreen)
		{
			currentView.setBackgroundResource(R.color.green);
			return true;
		}
		else if(item.getItemId() == R.id.menuRed)
		{
			currentView.setBackgroundResource(R.color.red);
			return true;
		}
		else if(item.getItemId() == R.id.menuThat)
		{
			currentView.setBackgroundResource(R.color.that);
			return true;
		}
		else if(item.getItemId() == R.id.menuOther)
		{
			currentView.setBackgroundResource(R.color.other);
			return true;
		}
		else if(item.getItemId() == R.id.menuPurple)
		{
			currentView.setBackgroundResource(R.color.purple);
			return true;
		}
		else if(item.getItemId() == R.id.secondMenuItem)
		{
			swap();
			return true;
		}
		else if(item.getItemId() == R.id.menu_settings)
		{
			currentView.setBackgroundResource(R.color.orange);
			return true;
		}
		else
		{
			return super.onOptionsItemSelected(item);
		}
		
		
		
//		switch (item.getItemId())
//		{
//			case R.id.menuBlue:
//				currentView.setBackgroundResource(R.color.blue);
//				return true;
//			case R.id.menuGreen:
//				currentView.setBackgroundResource(R.color.green);
//				return true;
//			case R.id.menuRed:
//				currentView.setBackgroundResource(R.color.red);
//				return true;
//			case R.id.menuOther:
//				currentView.setBackgroundResource(R.color.other);
//				return true;
//			case R.id.menuThat:
//				currentView.setBackgroundResource(R.color.that);
//				return true;
//			case R.id.menuPurple:
//				currentView.setBackgroundResource(R.color.purple);
//				return true;
//			case R.id.secondMenuItem:
//				swap();
//				return true;
//				
//			default:
//				return super.onOptionsItemSelected(item);	
//		}
	}

}
