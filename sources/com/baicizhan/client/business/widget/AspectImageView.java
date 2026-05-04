package com.baicizhan.client.business.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class AspectImageView extends AppCompatImageView {

    /* renamed from: a, reason: collision with root package name */
    public int f16942a;

    /* renamed from: b, reason: collision with root package name */
    public int f16943b;

    public AspectImageView(Context context) {
        super(context);
        this.f16942a = 4;
        this.f16943b = 3;
    }

    public void a(int aspectWidth, int aspectHeight) {
        this.f16942a = aspectWidth;
        this.f16943b = aspectHeight;
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (mode == 0 && mode2 == 0) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        int i11 = this.f16943b;
        int i12 = size * i11;
        int i13 = this.f16942a;
        int i14 = size2 * i13;
        if (mode2 == 0 || i14 > i12) {
            size2 = i12 / i13;
        } else {
            size = i14 / i11;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public AspectImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f16942a = 4;
        this.f16943b = 3;
    }
}
