package com.liferay.myapplication.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.liferay.mobile.screens.web.WebScreenlet;
import com.liferay.mobile.screens.web.WebScreenletConfiguration;
import com.liferay.myapplication.R;

/**
 * @author Víctor Galán Grande
 */
public class NewsFragment extends Fragment {

	public NewsFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_news, container, false);

		WebScreenlet webScreenlet = view.findViewById(R.id.web_screenlet);

		WebScreenletConfiguration configuration =
			new WebScreenletConfiguration.Builder(getString(R.string.news_url)).load();

		webScreenlet.setWebScreenletConfiguration(configuration);

		webScreenlet.load();

		return view;
	}
}
