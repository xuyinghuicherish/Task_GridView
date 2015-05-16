package cn.edu.bzu.gridview;

import java.util.ArrayList;
import java.util.List;

import cn.edu.bzu.adapter.MyAdapter;
import cn.edu.bzu.module.Function;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.GridView;
/**
 * 实现GridView的功能（绑定适配器，初始化数据源等操作）
 * @author monster
 *
 */
public class MainActivity extends Activity {
	private GridView gridView;
	private List<Function> list;
	private MyAdapter adapter; //定义自定义adapter
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setData();
        initView();
    }
	private void initView() {
		// 初始化视图
		gridView=(GridView)findViewById(R.id.Gv);
		adapter=new MyAdapter(MainActivity.this, list);
		gridView.setAdapter(adapter);
	}
	private void setData() {
		// 初始化数据源
		list=new ArrayList<Function>();
		list.add(new Function(R.drawable.grid_payout,"记录消费"));
		list.add(new Function(R.drawable.grid_income,"增加消费"));
		list.add(new Function(R.drawable.grid_report,"统计管理"));
		list.add(new Function(R.drawable.grid_account_book,"账本管理"));
		list.add(new Function(R.drawable.grid_category,"类别消费"));
		list.add(new Function(R.drawable.grid_user,"人员管理"));
	}
    
}
