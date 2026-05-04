package com.baicizhan.client.business.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class NoScrollGridView extends GridView {
    public NoScrollGridView(Context context) {
        super(context);
    }

    @Override // android.widget.GridView
    public int getRequestedColumnWidth() {
        return super.getRequestedColumnWidth();
    }

    @Override // android.widget.GridView
    public int getRequestedHorizontalSpacing() {
        return super.getRequestedHorizontalSpacing();
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }

    public NoScrollGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
