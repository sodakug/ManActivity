//http://www.vogella.com/articles/AndroidListView/article.html

package com.npru.android.ListActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

	//@Override
	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		//setContentView(R.layout.activity_main);
		String[] values = new String[]{"Android", "iPhone", "Windows Mobile",
				"Linux", "OS/2", "Ubuntu", "Window8", "OSX", "Blackberry",
				"RedHat", "Fedora", "CentOS"};
		// Next line calls system variable
		//ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
			
		//Next line uses row layout
		ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.rowlayout, R.id.label, values);
		setListAdapter(adapter);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		//super.onListItemClick(l, v, position, id);
		String item = (String)getListAdapter().getItem(position);
		Toast.makeText(this, item+" selected", Toast.LENGTH_SHORT).show();
	}


}
