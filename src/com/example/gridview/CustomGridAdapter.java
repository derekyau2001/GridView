package com.example.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomGridAdapter extends BaseAdapter {

	Context ctx;
	Integer[] imgArr = { R.drawable.img01, R.drawable.img02, R.drawable.img03,
			R.drawable.img04, R.drawable.img05, R.drawable.img06,
			R.drawable.img07, R.drawable.img08};

	public CustomGridAdapter(Context c) {
		ctx = c;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return imgArr.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return imgArr[position];
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ImageView v;

		if (convertView == null) {
			v = new ImageView(ctx);
			v.setLayoutParams(new GridView.LayoutParams(90, 90));
			v.setScaleType(ImageView.ScaleType.CENTER_CROP);
			v.setPadding(5, 5, 5, 5);
		} else {
			v = (ImageView) convertView;
		}
		/*
		 * TextView tw = new TextView(ctx);
		 * tw.setText(String.valueOf(items.charAt(position))); return tw;
		 */

		v.setImageResource(imgArr[position]);

		return v;
	}

}
