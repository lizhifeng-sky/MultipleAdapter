package lzf.multipleadapter.type;

import android.view.View;

import lzf.multipleadapter.R;
import lzf.multipleadapter.holder.BaseViewHolder;
import lzf.multipleadapter.holder.OneViewHolder;


/**
 * Created by Administrator on 2017/4/7 0007.
 */
public class OneType implements TypeInterface{
    private String text;
    public OneType(String text) {
        this.text = text;
    }
    public String getContent(){
        return text;
    }
    @Override
    public int getLayout() {
        return R.layout.item_one;
    }

    @Override
    public BaseViewHolder createViewHolder(View itemView) {
        return new OneViewHolder(itemView);
    }
}
