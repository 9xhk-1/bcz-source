package com.baicizhan.client.business.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import va.m;
import va.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class RedDotTextView extends AppCompatTextView implements m {

    /* renamed from: a, reason: collision with root package name */
    public o f17166a;

    public RedDotTextView(Context context) {
        this(context, null, 0);
    }

    @Override // va.m
    public void a(boolean ignore) {
        this.f17166a.a(ignore);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f17166a.e(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean selected) {
        super.setSelected(selected);
    }

    @Override // va.m
    public void setShowRedDot(boolean showRedDot) {
        this.f17166a.setShowRedDot(showRedDot);
    }

    public RedDotTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RedDotTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        o oVar = new o(this);
        this.f17166a = oVar;
        oVar.d(context, attrs, defStyleAttr);
    }
}
