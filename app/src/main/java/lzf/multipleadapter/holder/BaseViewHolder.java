package lzf.multipleadapter.holder;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;

/**
 * Created by Administrator on 2017/4/7 0007.
 */
public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {
    private SparseArray<View> views;
    private View itemView;

    public BaseViewHolder(View itemView) {
        super(itemView);
        this.itemView = itemView;
        views=new SparseArray<>();
    }
    public View getViewById(@IdRes int resID){
        View view=views.get(resID);
        if (view==null){
            view=itemView.findViewById(resID);
            views.put(resID,view);
        }
        return view;
    }
    public void begin(T model, Context context){
        findView();
        setViewData(model,context);
    }
    public abstract void findView();
    public abstract void setViewData(T model, Context context);
}
