package com.thoughtstreamllc.blurb;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class BlurbApplication extends Application{
	
	@Override
	public void onCreate() {
		super.onCreate();
		  Parse.initialize(this, "OYho7GcJYVqv3Ae9ll1m8SqrhKfFwye8OKd5lMS3", "IpBlvaC2ojxuzVsHl6e0T3BXxZaQfAGxjpDPs3MZ");
		}
}
