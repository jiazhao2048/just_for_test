package jizhang.fragment;

import com.example.jizhang.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class fragment_add_record extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
		View rootView=inflater.inflate(R.layout.layout_add_record, container,false);
		return rootView;
	}
}
