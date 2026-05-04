package com.baicizhan.client.business.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes4.dex */
public class StrokeButton extends AppCompatButton {

    /* renamed from: j, reason: collision with root package name */
    public static final int f16760j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f16761k = 1;

    /* renamed from: a, reason: collision with root package name */
    public b f16762a;

    /* renamed from: b, reason: collision with root package name */
    public View.OnTouchListener f16763b;

    /* renamed from: c, reason: collision with root package name */
    public int f16764c;

    /* renamed from: d, reason: collision with root package name */
    public int f16765d;

    /* renamed from: e, reason: collision with root package name */
    public int f16766e;

    /* renamed from: f, reason: collision with root package name */
    public int f16767f;

    /* renamed from: g, reason: collision with root package name */
    public int f16768g;

    /* renamed from: h, reason: collision with root package name */
    public int f16769h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16770i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View v11, MotionEvent event) {
            StrokeButton.this.f16762a.onTouch(v11, event);
            if (StrokeButton.this.f16763b != null) {
                return StrokeButton.this.f16763b.onTouch(v11, event);
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View v11, MotionEvent event) {
            int action = event.getAction();
            if (action == 0) {
                StrokeButton strokeButton = StrokeButton.this;
                strokeButton.setTextColor(strokeButton.f16765d);
                if (StrokeButton.this.f16770i) {
                    StrokeButton strokeButton2 = StrokeButton.this;
                    strokeButton2.setBackgroundResource(strokeButton2.f16768g);
                } else {
                    StrokeButton.this.setBackgroundColor(0);
                }
            } else if ((action == 1 || action == 3) && !StrokeButton.this.isSelected()) {
                StrokeButton strokeButton3 = StrokeButton.this;
                strokeButton3.setTextColor(strokeButton3.f16764c);
                if (StrokeButton.this.f16770i) {
                    StrokeButton strokeButton4 = StrokeButton.this;
                    strokeButton4.setBackgroundResource(strokeButton4.f16767f);
                } else {
                    StrokeButton.this.setBackgroundColor(0);
                }
            }
            return false;
        }

        public b() {
        }
    }

    public StrokeButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f16762a = new b();
        this.f16770i = false;
        setDefaultAttrs(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.StrokeButton);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            if (index == 4) {
                setStyle(obtainStyledAttributes.getInt(index, 0));
            } else if (index == 0) {
                this.f16770i = obtainStyledAttributes.getBoolean(index, true);
            } else if (index == 1) {
                this.f16764c = obtainStyledAttributes.getColor(index, this.f16764c);
            } else if (index == 2) {
                this.f16765d = obtainStyledAttributes.getColor(index, this.f16765d);
            } else if (index == 3) {
                this.f16766e = obtainStyledAttributes.getColor(index, this.f16766e);
            }
        }
        obtainStyledAttributes.recycle();
        h();
    }

    private void setDefaultAttrs(Context context) {
        this.f16764c = -1;
        this.f16765d = -1996488705;
        this.f16766e = -1996488705;
        this.f16767f = R.drawable.business_white_stroke_rounded_btn_rect;
        this.f16768g = R.drawable.business_white_stroke_rounded_btn_rect_pressed;
        this.f16769h = R.drawable.business_white_stroke_rounded_btn_rect_pressed;
        this.f16770i = true;
    }

    public final void h() {
        setOnTouchListener(this.f16762a);
        setTextColor(this.f16764c);
        if (this.f16770i) {
            setBackgroundResource(this.f16767f);
        } else {
            setBackgroundColor(0);
        }
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener l11) {
        b bVar = this.f16762a;
        if (l11 == bVar) {
            super.setOnTouchListener(bVar);
        } else {
            this.f16763b = l11;
            super.setOnTouchListener(new a());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean selected) {
        super.setSelected(selected);
        if (isSelected()) {
            setTextColor(this.f16766e);
            if (this.f16770i) {
                setBackgroundResource(this.f16769h);
                return;
            } else {
                setBackgroundColor(0);
                return;
            }
        }
        setTextColor(this.f16764c);
        if (this.f16770i) {
            setBackgroundResource(this.f16767f);
        } else {
            setBackgroundColor(0);
        }
    }

    public void setStyle(int style) {
        if (style != 1) {
            this.f16764c = -1;
            this.f16765d = -1996488705;
            this.f16766e = -1996488705;
            this.f16767f = R.drawable.business_white_stroke_rounded_btn_rect;
            this.f16768g = R.drawable.business_white_stroke_rounded_btn_rect_pressed;
            this.f16769h = R.drawable.business_white_stroke_rounded_btn_rect_pressed;
            return;
        }
        this.f16764c = getResources().getColor(R.color.business_def_blue_color);
        this.f16765d = getResources().getColor(R.color.business_def_deep_blue_color);
        this.f16766e = getResources().getColor(R.color.business_def_deep_blue_color);
        this.f16767f = R.drawable.business_blue_stroke_rounded_btn_rect;
        this.f16768g = R.drawable.business_blue_stroke_rounded_btn_rect_pressed;
        this.f16769h = R.drawable.business_blue_stroke_rounded_btn_rect_pressed;
    }
}
