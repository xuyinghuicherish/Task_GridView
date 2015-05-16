package cn.edu.bzu.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import cn.edu.bzu.gridview.R;

/**
 * CommonAdapter makes Common extends BaseAdapter
 * Created by monster on 2015/5/3.
 */
public abstract class CommonAdapter<T> extends BaseAdapter {
    protected Context mContext;
    protected List<T> mDatas;
    protected LayoutInflater mInflater;

    public CommonAdapter(Context context,List<T>datas){
        this.mContext=context;
        this.mDatas=datas;
        mInflater=LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public T getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder holder=ViewHolder.get(mContext,convertView,parent, R.layout.listview_item,position);
        convert(holder,getItem(position));
        return holder.getConvertView();
    }
    public abstract void convert(ViewHolder holder,T t);
    
}
