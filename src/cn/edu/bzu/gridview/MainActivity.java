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
 * ʵ��GridView�Ĺ��ܣ�������������ʼ������Դ�Ȳ�����
 * @author monster
 *
 */
public class MainActivity extends Activity {
	private GridView gridView;
	private List<Function> list;
	private MyAdapter adapter; //�����Զ���adapter
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setData();
        initView();
    }
	private void initView() {
		// ��ʼ����ͼ
		gridView=(GridView)findViewById(R.id.Gv);
		adapter=new MyAdapter(MainActivity.this, list);
		gridView.setAdapter(adapter);
	}
	private void setData() {
		// ��ʼ������Դ
		list=new ArrayList<Function>();
		list.add(new Function(R.drawable.grid_payout,"��¼����"));
		list.add(new Function(R.drawable.grid_income,"��������"));
		list.add(new Function(R.drawable.grid_report,"ͳ�ƹ���"));
		list.add(new Function(R.drawable.grid_account_book,"�˱�����"));
		list.add(new Function(R.drawable.grid_category,"�������"));
		list.add(new Function(R.drawable.grid_user,"��Ա����"));
	}
    
}
