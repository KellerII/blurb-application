package com.thoughtstreamllc.blurb;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class BlurbApplication extends Application{
	
	@Override
	public void onCreate() {
		super.onCreate();
		  Parse.initialize(this, "", "");
		}
}
