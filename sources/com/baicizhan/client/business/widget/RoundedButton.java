package com.baicizhan.client.business.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class RoundedButton extends AppCompatButton {

    /* renamed from: i, reason: collision with root package name */
    public static final int f17167i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f17168j = 2;

    /* renamed from: k, reason: collision with root package name */
    public static final int f17169k = 4;

    /* renamed from: l, reason: collision with root package name */
    public static final int f17170l = 8;

    /* renamed from: m, reason: collision with root package name */
    public static final int f17171m = 15;

    /* renamed from: a, reason: collision with root package name */
    public int f17172a;

    /* renamed from: b, reason: collision with root package name */
    public int f17173b;

    /* renamed from: c, reason: collision with root package name */
    public int f17174c;

    /* renamed from: d, reason: collision with root package name */
    public int f17175d;

    /* renamed from: e, reason: collision with root package name */
    public int f17176e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f17177f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f17178g;

    /* renamed from: h, reason: collision with root package name */
    public GradientDrawable f17179h;

    public RoundedButton(Context context) {
        this(context, null, 0);
    }

    @SuppressLint({"NewApi"})
    private void setBackgroundCompat(Drawable background) {
        setBackground(background);
    }

    public final void a() {
        boolean z11;
        int colorForState;
        int colorForState2;
        int[] drawableState = getDrawableState();
        ColorStateList colorStateList = this.f17177f;
        boolean z12 = true;
        if (colorStateList == null || (colorForState2 = colorStateList.getColorForState(drawableState, 0)) == this.f17175d) {
            z11 = false;
        } else {
            this.f17175d = colorForState2;
            this.f17179h.setStroke(this.f17174c, colorForState2);
            z11 = true;
        }
        ColorStateList colorStateList2 = this.f17178g;
        if (colorStateList2 == null || (colorForState = colorStateList2.getColorForState(drawableState, 0)) == this.f17176e) {
            z12 = z11;
        } else {
            this.f17176e = colorForState;
            this.f17179h.setColor(colorForState);
        }
        if (z12) {
            invalidate();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        ColorStateList colorStateList2 = this.f17177f;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = this.f17178g) == null || !colorStateList.isStateful())) {
            return;
        }
        a();
    }

    public void setFillColor(ColorStateList colorStateList) {
        this.f17178g = colorStateList;
        a();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f17177f = colorStateList;
        a();
    }

    public void setStrokeWidth(int strokeWidth) {
        this.f17174c = strokeWidth;
        this.f17179h.setStroke(strokeWidth, this.f17175d);
        invalidate();
    }

    public RoundedButton(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RoundedButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.RoundedButton, defStyleAttr, 0);
        for (int i11 = 0; i11 < obtainStyledAttributes.getIndexCount(); i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            if (index == 1) {
                this.f17172a = obtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == 0) {
                this.f17173b = obtainStyledAttributes.getInt(index, 15);
            } else if (index == 4) {
                this.f17174c = obtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == 3) {
                this.f17177f = obtainStyledAttributes.getColorStateList(index);
            } else if (index == 2) {
                this.f17178g = obtainStyledAttributes.getColorStateList(index);
            }
        }
        obtainStyledAttributes.recycle();
        if (this.f17173b == 0 && this.f17172a > 0) {
            this.f17173b = 15;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f17179h = gradientDrawable;
        gradientDrawable.setShape(0);
        int i12 = this.f17173b;
        if (i12 == 15) {
            this.f17179h.setCornerRadius(this.f17172a);
        } else {
            float[] fArr = new float[8];
            if ((i12 & 1) > 0) {
                float f11 = this.f17172a;
                fArr[1] = f11;
                fArr[0] = f11;
            }
            if ((i12 & 2) > 0) {
                float f12 = this.f17172a;
                fArr[3] = f12;
                fArr[2] = f12;
            }
            if ((i12 & 4) > 0) {
                float f13 = this.f17172a;
                fArr[5] = f13;
                fArr[4] = f13;
            }
            if ((i12 & 8) > 0) {
                float f14 = this.f17172a;
                fArr[7] = f14;
                fArr[6] = f14;
            }
            this.f17179h.setCornerRadii(fArr);
        }
        setBackgroundCompat(this.f17179h);
        a();
    }
}
