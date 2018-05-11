package com.liferay.myapplication.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.liferay.mobile.screens.web.WebScreenlet;
import com.liferay.mobile.screens.web.WebScreenletConfiguration;
import com.liferay.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContactFragment extends Fragment {

	public ContactFragment() {
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_contact, container, false);

		WebScreenlet webScreenlet = view.findViewById(R.id.web_screenlet);

		/*WebScreenletConfiguration configuration =
			new WebScreenletConfiguration.Builder(getString(R.string.contact_url)).load();

		webScreenlet.setWebScreenletConfiguration(configuration);

		webScreenlet.load();
		*/


		Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://telegram.me/SegurosLiferayBot?start"));
		startActivity(intent);

		return view;
	}
}
