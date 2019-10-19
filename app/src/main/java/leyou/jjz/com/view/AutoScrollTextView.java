package leyou.jjz.com.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class AutoScrollTextView extends TextView {
    public AutoScrollTextView(Context context) {
        super(context);
    }

    public AutoScrollTextView(Context context,  AttributeSet attrs) {
        super(context, attrs);
    }

    public AutoScrollTextView(Context context,  AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean isFocused() {
        return true;
    }
}
