package jizhang.adapter;

import java.util.ArrayList;
import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class fragments_adapter extends FragmentPagerAdapter{

	private List<Fragment> fragments = new ArrayList<Fragment>();

	public fragments_adapter(FragmentManager fm) {
		super(fm);
	}
//构建fragment的适配器，并重写适配器的获得子fragment的方法
	public fragments_adapter(FragmentManager fragmentManager,ArrayList<Fragment> fragmentsi) {
		super(fragmentManager);
		fragments=fragmentsi;
	}
	
	@Override
	public Fragment getItem(int index) {
		return fragments.get(index);
	}

	@Override
	public int getCount() {
		return fragments.size();
	}

}
