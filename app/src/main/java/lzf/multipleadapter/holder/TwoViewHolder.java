package lzf.multipleadapter.holder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import lzf.multipleadapter.R;
import lzf.multipleadapter.type.TwoType;


/**
 * Created by Administrator on 2017/4/7 0007.
 */
public class TwoViewHolder extends BaseViewHolder<TwoType> {
    private TextView two;
    public TwoViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void findView() {
        two= (TextView) getViewById(R.id.two);
    }

    @Override
    public void setViewData(TwoType model, Context context) {
        two.setText(model.getContent());
    }

}
