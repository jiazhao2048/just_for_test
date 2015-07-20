package jizhang.main;

import java.util.ArrayList;

import com.example.jizhang.R;

import jizhang.adapter.fragments_adapter;
import jizhang.fragment.fragment_add_record;
import jizhang.fragment.fragment_check_history;
import jizhang.fragment.fragment_graphic_show;
import jizhang.subview.ScllorTabView;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.ActionBarActivity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.os.Bundle; 

public class MainActivity extends ActionBarActivity {

	private ArrayList<Fragment> fragments=null;
	private PagerAdapter pagerAdapter=null;
	private ViewPager viewPager;
	private TextView current;
	private LinearLayout topscrollbar;
	private ScllorTabView mScllorTabView;
	private int prefocuspage;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		iniView();
		iniListener();
		
		
	}
	private void creatFragment(){
		fragments=new ArrayList<Fragment>();
		fragments.add(new fragment_add_record());
		fragments.add(new fragment_check_history());
		fragments.add(new fragment_graphic_show());
		
		pagerAdapter=new fragments_adapter(getSupportFragmentManager(),fragments);
		
		
	}
	private void iniView(){
		viewPager=(ViewPager) findViewById(R.id.pager);
		topscrollbar=(LinearLayout) findViewById(R.id.topScrollBar);

		mScllorTabView=(ScllorTabView) findViewById(R.id.roll_bar);
		mScllorTabView.setSelectedColor(getResources().getColor(R.color.clr_red),getResources().getColor(R.color.clr_red));
		mScllorTabView.setTabNum(3);
		mScllorTabView.setCurrentNum(0);

	}
	private void iniListener(){
		creatFragment();
		viewPager.setOnPageChangeListener(new OnPageChangeListener() {
			
			@Override
			public void onPageSelected(int position) {
				current=(TextView) (topscrollbar.getChildAt(prefocuspage));
				current.setTextColor(getResources().getColor(R.color.clr_gray_text));
				prefocuspage=position;
				current=(TextView) (topscrollbar.getChildAt(prefocuspage));
				current.setTextColor(getResources().getColor(R.color.clr_red));

			}
			
			@Override
			public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
				mScllorTabView.setOffset(position, positionOffset);

			}
			
			@Override
			public void onPageScrollStateChanged(int arg0) {
				
			}
		});
		viewPager.setAdapter(pagerAdapter);		
	}
	

 
}
