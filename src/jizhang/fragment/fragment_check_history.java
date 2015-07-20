package jizhang.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jizhang.R;

public class fragment_check_history extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
		View rootView=inflater.inflate(R.layout.layout_check_history, container,false);
		return rootView;
	}
}
