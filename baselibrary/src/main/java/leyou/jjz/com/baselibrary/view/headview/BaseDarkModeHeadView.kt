package cn.figo.huaji.base.widget

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import com.qmuiteam.qmui.util.QMUIStatusBarHelper
import kotlinx.android.synthetic.main.view_base_head.view.*
import leyou.jjz.com.baselibrary.R

/**
 * @date   2019-06-25.
 */
class BaseDarkModeHeadView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : RelativeLayout(context, attrs, defStyle) {

    init {
        View.inflate(context, R.layout.view_base_head, this)

        layoutHeadView.setBackgroundColor(context.resources.getColor(R.color.colorPrimary))
        ivHeadBack.setImageResource(R.drawable.qmui_dialog_bg)
        tvHeadTitle.setTextColor(context.resources.getColor(R.color.btn_filled_blue_bg_disabled))

        statusBarView.setBackgroundColor(context.resources.getColor(R.color.colorPrimary))
        val layoutParams = statusBarView.layoutParams
        layoutParams.height = QMUIStatusBarHelper.getStatusbarHeight(context)


        QMUIStatusBarHelper.setStatusBarDarkMode(context as Activity)
    }

    fun setTitle(title: String) {
        tvHeadTitle.text = title
    }

    fun setBackIcon(@DrawableRes resId: Int = R.drawable.qmui_dialog_bg, listener: OnClickListener) {
        ivHeadBack.setImageResource(resId)
        ivHeadBack.setOnClickListener(listener)
    }

    fun setRightImage(@DrawableRes resId: Int, listener: OnClickListener) {
        ivHeadRight.setImageResource(resId)
        ivHeadRight.setOnClickListener(listener)
        ivHeadRight.visibility = View.VISIBLE
    }

    fun setRightText(text: String, listener: OnClickListener) {
        tvHeadRight.text = text
        tvHeadRight.setOnClickListener(listener)
        tvHeadRight.visibility = View.VISIBLE
        layoutHeadRight.visibility = View.VISIBLE
    }

    fun setRightTextStyle(@DrawableRes bg: Int, @ColorInt textColor: Int) {
        tvHeadRight.setBackgroundResource(bg)
        tvHeadRight.setTextColor(textColor)
    }

    fun getRightText(): TextView {
        return tvHeadRight
    }
}