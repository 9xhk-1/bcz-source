package com.baicizhan.client.business.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class KeepRatioImageView extends AppCompatImageView {
    public KeepRatioImageView(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        setMeasuredDimension(View.getDefaultSize(0, widthMeasureSpec), View.getDefaultSize(0, heightMeasureSpec));
        float measuredWidth = getMeasuredWidth();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) measuredWidth, 1073741824);
        float intrinsicWidth = drawable.getIntrinsicWidth();
        if (intrinsicWidth == 0.0f) {
            intrinsicWidth = 1.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) ((measuredWidth * drawable.getIntrinsicHeight()) / intrinsicWidth), 1073741824));
    }

    public KeepRatioImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public KeepRatioImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
