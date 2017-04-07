package lzf.multipleadapter.type;

import android.view.View;

import lzf.multipleadapter.holder.BaseViewHolder;


/**
 * Created by Administrator on 2017/4/7 0007.
 */
public interface TypeInterface {
    int getLayout();
    BaseViewHolder createViewHolder(View itemView);
}
