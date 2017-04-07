package lzf.multipleadapter.holder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import lzf.multipleadapter.R;
import lzf.multipleadapter.type.OneType;

/**
 * Created by Administrator on 2017/4/7 0007.
 */
public class OneViewHolder extends BaseViewHolder<OneType> {
    private TextView one;
    public OneViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void findView() {
        one= (TextView) getViewById(R.id.one);
    }

    @Override
    public void setViewData(OneType model, Context context) {
        one.setText(model.getContent());
    }
}
