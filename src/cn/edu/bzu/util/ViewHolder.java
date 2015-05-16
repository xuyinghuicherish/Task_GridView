package cn.edu.bzu.util;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by monster on 2015/4/20.
 *  Have a good package ViewHolder
 *  get(Context context,View convertView,ViewGroup parent,int layoutId,int position) To make ViewHolder
 *
 */
public class ViewHolder {
    private SparseArray<View> mViews; //稀疏数组，SparseArray比HashMap执行效率高
    private int mPosition;
    private View mConvertView; //作用是方便系统在重写UI时，能重用原来实用过的View实例，以此来降低系统资源的消耗和提高代码效率
    /*
     *ConvertView的几点特征。
     *对于一个ListView，Android保存所有曾经生成过的ConvertView实例，直至系统垃圾回收这些实例位置，而不是只保存最后使用的ConvertView对象。
     *这些保存的ConvertView以使用时间顺序排序，并依次被传递到getView函数中。
     */
    public ViewHolder(Context context,ViewGroup parent,int layoutId,int position){
        //ViewHolder的构造方法
        this.mPosition=position;
        this.mViews=new SparseArray<View>(); //初始化SparseArray对象
        mConvertView= LayoutInflater.from(context).inflate(layoutId,parent,false);
        mConvertView.setTag(this);
    }

    public static ViewHolder get(Context context,View convertView,ViewGroup parent,int layoutId,int position){
        if(convertView==null){
               return new ViewHolder(context,parent,layoutId,position);
        }else{
            ViewHolder holder=(ViewHolder)convertView.getTag();
            holder.mPosition=position;
            return holder;
        }
    }

    /**
     * 通过viewId获取控件
     * @param viewId
     * @param <T>
     * @return
     */
    public <T extends View> T getView(int viewId){
        View view=mViews.get(viewId);
        if(view==null){
            view=mConvertView.findViewById(viewId);
            mViews.put(viewId,view);
        }
        return (T)view;
    }
    public View getConvertView() {
        return mConvertView;
    }

    /**
     * 为设置TextView的值
     * @param viewId
     * @param text
     * @return
     */
    public ViewHolder setText(int viewId,String text){
        TextView tv=getView(viewId);
        tv.setText(text);
        return this;
    }

    /**
     * 设置图片
     * @param viewId
     * @param resId
     * @return
     */
    public ViewHolder setImageResource(int viewId,int resId){
        ImageView view=getView(viewId);
        view.setImageResource(resId);
        return this;
    }
}
