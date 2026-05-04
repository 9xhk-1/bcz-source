package me.grantland.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.jiongji.andriod.card.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class AutofitLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f73150a;

    /* renamed from: b, reason: collision with root package name */
    public float f73151b;

    /* renamed from: c, reason: collision with root package name */
    public float f73152c;

    /* renamed from: d, reason: collision with root package name */
    public WeakHashMap<View, a> f73153d;

    public AutofitLayout(Context context) {
        super(context);
        this.f73153d = new WeakHashMap<>();
        c(context, null, 0);
    }

    public a a(int index) {
        return this.f73153d.get(getChildAt(index));
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        TextView textView = (TextView) child;
        a v11 = a.f(textView).v(this.f73150a);
        float f11 = this.f73152c;
        if (f11 > 0.0f) {
            v11.C(f11);
        }
        float f12 = this.f73151b;
        if (f12 > 0.0f) {
            v11.B(0, f12);
        }
        this.f73153d.put(textView, v11);
    }

    public a b(TextView textView) {
        return this.f73153d.get(textView);
    }

    public final void c(Context context, AttributeSet attrs, int defStyle) {
        boolean z11 = true;
        int i11 = -1;
        float f11 = -1.0f;
        if (attrs != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.AutofitTextView, defStyle, 0);
            boolean z12 = obtainStyledAttributes.getBoolean(3, true);
            i11 = obtainStyledAttributes.getDimensionPixelSize(1, -1);
            f11 = obtainStyledAttributes.getFloat(2, -1.0f);
            obtainStyledAttributes.recycle();
            z11 = z12;
        }
        this.f73150a = z11;
        this.f73151b = i11;
        this.f73152c = f11;
    }

    public AutofitLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f73153d = new WeakHashMap<>();
        c(context, attrs, 0);
    }

    public AutofitLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f73153d = new WeakHashMap<>();
        c(context, attrs, defStyle);
    }
}
