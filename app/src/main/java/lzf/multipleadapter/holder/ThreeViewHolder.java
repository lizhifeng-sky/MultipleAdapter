package lzf.multipleadapter.holder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import lzf.multipleadapter.R;
import lzf.multipleadapter.type.ThreeType;


/**
 * Created by Administrator on 2017/4/7 0007.
 */
public class ThreeViewHolder extends BaseViewHolder<ThreeType> {
    private TextView three;
    public ThreeViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void findView() {
        three= (TextView) getViewById(R.id.three);
    }

    @Override
    public void setViewData(ThreeType model, Context context) {
        three.setText(model.getContent());
    }
}
