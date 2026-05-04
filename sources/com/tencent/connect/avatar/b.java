package com.tencent.connect.avatar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b extends View {

    /* renamed from: a, reason: collision with root package name */
    private Rect f42835a;

    /* renamed from: b, reason: collision with root package name */
    private Paint f42836b;

    public b(Context context) {
        super(context);
        b();
    }

    private void b() {
        this.f42836b = new Paint();
    }

    public Rect a() {
        if (this.f42835a == null) {
            this.f42835a = new Rect();
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int min = Math.min(Math.min(measuredHeight - 140, measuredWidth), 640);
            int i11 = (measuredWidth - min) / 2;
            int i12 = (measuredHeight - min) / 2;
            this.f42835a.set(i11, i12, i11 + min, min + i12);
        }
        return this.f42835a;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect a11 = a();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f42836b.setStyle(Paint.Style.FILL);
        this.f42836b.setColor(Color.argb(100, 0, 0, 0));
        float f11 = measuredWidth;
        canvas.drawRect(0.0f, 0.0f, f11, a11.top, this.f42836b);
        canvas.drawRect(0.0f, a11.bottom, f11, measuredHeight, this.f42836b);
        canvas.drawRect(0.0f, a11.top, a11.left, a11.bottom, this.f42836b);
        canvas.drawRect(a11.right, a11.top, f11, a11.bottom, this.f42836b);
        canvas.drawColor(Color.argb(100, 0, 0, 0));
        this.f42836b.setStyle(Paint.Style.STROKE);
        this.f42836b.setColor(-1);
        canvas.drawRect(a11.left, a11.top, a11.right - 1, a11.bottom, this.f42836b);
    }
}
