package cn.edu.bzu.adapter;

import java.util.List;

import cn.edu.bzu.gridview.R;
import android.content.Context;
import cn.edu.bzu.module.Function;
import cn.edu.bzu.util.CommonAdapter;
import cn.edu.bzu.util.ViewHolder;
/**
 * 继承CommonAdapter，实现未实现的方法
 * @author monster
 *
 */
public class MyAdapter extends CommonAdapter<Function>{

	public MyAdapter(Context context, List<Function> datas) {
		super(context, datas);
	}

	@Override
	public void convert(ViewHolder holder, Function Function) {
		holder.setImageResource(R.id.Iv,Function.getImgId());
		holder.setText(R.id.Tv,Function.getText());
	}

}
