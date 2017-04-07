package lzf.multipleadapter.type;

import android.view.View;

import lzf.multipleadapter.R;
import lzf.multipleadapter.holder.BaseViewHolder;
import lzf.multipleadapter.holder.ThreeViewHolder;


/**
 * Created by Administrator on 2017/4/7 0007.
 */
public class ThreeType implements TypeInterface{
    private String text;
    public ThreeType(String text) {
        this.text = text;
    }
    public String getContent(){
        return text;
    }
    @Override
    public int getLayout() {
        return R.layout.item_three;
    }

    @Override
    public BaseViewHolder createViewHolder(View itemView) {
        return new ThreeViewHolder(itemView);
    }
}
