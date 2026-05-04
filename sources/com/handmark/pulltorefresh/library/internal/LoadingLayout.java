package com.handmark.pulltorefresh.library.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.R;
import jq.b;
import lq.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public abstract class LoadingLayout extends LinearLayout implements b {

    /* renamed from: l, reason: collision with root package name */
    public static final String f35167l = "PullToRefresh-LoadingLayout";

    /* renamed from: m, reason: collision with root package name */
    public static final Interpolator f35168m = new LinearInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public LinearLayout f35169a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f35170b;

    /* renamed from: c, reason: collision with root package name */
    public final ProgressBar f35171c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f35172d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f35173e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f35174f;

    /* renamed from: g, reason: collision with root package name */
    public final PullToRefreshBase.Mode f35175g;

    /* renamed from: h, reason: collision with root package name */
    public final PullToRefreshBase.Orientation f35176h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f35177i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f35178j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f35179k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35180a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f35181b;

        static {
            int[] iArr = new int[PullToRefreshBase.Mode.values().length];
            f35181b = iArr;
            try {
                iArr[PullToRefreshBase.Mode.PULL_FROM_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35181b[PullToRefreshBase.Mode.PULL_FROM_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[PullToRefreshBase.Orientation.values().length];
            f35180a = iArr2;
            try {
                iArr2[PullToRefreshBase.Orientation.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35180a[PullToRefreshBase.Orientation.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public LoadingLayout(Context context, final PullToRefreshBase.Mode mode, final PullToRefreshBase.Orientation scrollDirection, TypedArray attrs) {
        super(context);
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable;
        this.f35175g = mode;
        this.f35176h = scrollDirection;
        if (a.f35180a[scrollDirection.ordinal()] != 1) {
            LayoutInflater.from(context).inflate(R.layout.pull_to_refresh_header_vertical, this);
        } else {
            LayoutInflater.from(context).inflate(R.layout.pull_to_refresh_header_horizontal, this);
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.fl_inner);
        this.f35169a = linearLayout;
        TextView textView = (TextView) linearLayout.findViewById(R.id.pull_to_refresh_text);
        this.f35173e = textView;
        this.f35171c = (ProgressBar) this.f35169a.findViewById(R.id.pull_to_refresh_progress);
        TextView textView2 = (TextView) this.f35169a.findViewById(R.id.pull_to_refresh_sub_text);
        this.f35174f = textView2;
        this.f35170b = (ImageView) this.f35169a.findViewById(R.id.pull_to_refresh_image);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f35169a.getLayoutParams();
        int[] iArr = a.f35181b;
        if (iArr[mode.ordinal()] != 1) {
            layoutParams.gravity = scrollDirection == PullToRefreshBase.Orientation.VERTICAL ? 80 : 5;
            this.f35177i = context.getString(R.string.pull_to_refresh_pull_label);
            this.f35178j = context.getString(R.string.pull_to_refresh_refreshing_label);
            this.f35179k = context.getString(R.string.pull_to_refresh_release_label);
        } else {
            layoutParams.gravity = scrollDirection == PullToRefreshBase.Orientation.VERTICAL ? 48 : 3;
            this.f35177i = context.getString(R.string.pull_to_refresh_from_bottom_pull_label);
            this.f35178j = context.getString(R.string.pull_to_refresh_from_bottom_refreshing_label);
            this.f35179k = context.getString(R.string.pull_to_refresh_from_bottom_release_label);
        }
        int i11 = R.styleable.PullToRefresh_ptrHeaderBackground;
        if (attrs.hasValue(i11) && (drawable = attrs.getDrawable(i11)) != null) {
            c.b(this, drawable);
        }
        int i12 = R.styleable.PullToRefresh_ptrHeaderTextAppearance;
        if (attrs.hasValue(i12)) {
            TypedValue typedValue = new TypedValue();
            attrs.getValue(i12, typedValue);
            setTextAppearance(typedValue.data);
        }
        int i13 = R.styleable.PullToRefresh_ptrSubHeaderTextAppearance;
        if (attrs.hasValue(i13)) {
            TypedValue typedValue2 = new TypedValue();
            attrs.getValue(i13, typedValue2);
            setSubTextAppearance(typedValue2.data);
        }
        int i14 = R.styleable.PullToRefresh_ptrHeaderTextSize;
        if (attrs.hasValue(i14)) {
            int dimensionPixelSize = attrs.getDimensionPixelSize(i14, 0);
            if (textView != null) {
                textView.setTextSize(0, dimensionPixelSize);
            }
        }
        int i15 = R.styleable.PullToRefresh_ptrHeaderSubTextSize;
        if (attrs.hasValue(i15)) {
            int dimensionPixelSize2 = attrs.getDimensionPixelSize(i15, 0);
            if (textView2 != null) {
                textView2.setTextSize(0, dimensionPixelSize2);
            }
        }
        int i16 = R.styleable.PullToRefresh_ptrHeaderTextColor;
        if (attrs.hasValue(i16) && (colorStateList2 = attrs.getColorStateList(i16)) != null) {
            setTextColor(colorStateList2);
        }
        int i17 = R.styleable.PullToRefresh_ptrHeaderSubTextColor;
        if (attrs.hasValue(i17) && (colorStateList = attrs.getColorStateList(i17)) != null) {
            setSubTextColor(colorStateList);
        }
        int i18 = R.styleable.PullToRefresh_ptrDrawable;
        Drawable drawable2 = attrs.hasValue(i18) ? attrs.getDrawable(i18) : null;
        if (iArr[mode.ordinal()] != 1) {
            int i19 = R.styleable.PullToRefresh_ptrDrawableStart;
            if (attrs.hasValue(i19)) {
                drawable2 = attrs.getDrawable(i19);
            } else {
                int i21 = R.styleable.PullToRefresh_ptrDrawableTop;
                if (attrs.hasValue(i21)) {
                    lq.b.a("ptrDrawableTop", "ptrDrawableStart");
                    drawable2 = attrs.getDrawable(i21);
                }
            }
        } else {
            int i22 = R.styleable.PullToRefresh_ptrDrawableEnd;
            if (attrs.hasValue(i22)) {
                drawable2 = attrs.getDrawable(i22);
            } else {
                int i23 = R.styleable.PullToRefresh_ptrDrawableBottom;
                if (attrs.hasValue(i23)) {
                    lq.b.a("ptrDrawableBottom", "ptrDrawableEnd");
                    drawable2 = attrs.getDrawable(i23);
                }
            }
        }
        setLoadingDrawable(drawable2 == null ? context.getResources().getDrawable(getDefaultDrawableResId()) : drawable2);
        k();
    }

    private void setSubHeaderText(CharSequence label) {
        if (this.f35174f != null) {
            if (TextUtils.isEmpty(label)) {
                this.f35174f.setVisibility(8);
                return;
            }
            this.f35174f.setText(label);
            if (8 == this.f35174f.getVisibility()) {
                this.f35174f.setVisibility(0);
            }
        }
    }

    private void setSubTextAppearance(int value) {
        TextView textView = this.f35174f;
        if (textView != null) {
            textView.setTextAppearance(getContext(), value);
        }
    }

    private void setSubTextColor(ColorStateList color) {
        TextView textView = this.f35174f;
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    private void setTextAppearance(int value) {
        TextView textView = this.f35173e;
        if (textView != null) {
            textView.setTextAppearance(getContext(), value);
        }
        TextView textView2 = this.f35174f;
        if (textView2 != null) {
            textView2.setTextAppearance(getContext(), value);
        }
    }

    private void setTextColor(ColorStateList color) {
        TextView textView = this.f35173e;
        if (textView != null) {
            textView.setTextColor(color);
        }
        TextView textView2 = this.f35174f;
        if (textView2 != null) {
            textView2.setTextColor(color);
        }
    }

    public final void a() {
        if (this.f35173e.getVisibility() == 0) {
            this.f35173e.setVisibility(4);
        }
        if (this.f35171c.getVisibility() == 0) {
            this.f35171c.setVisibility(4);
        }
        if (this.f35170b.getVisibility() == 0) {
            this.f35170b.setVisibility(4);
        }
        if (this.f35174f.getVisibility() == 0) {
            this.f35174f.setVisibility(4);
        }
    }

    public abstract void b(Drawable imageDrawable);

    public final void c(float scaleOfLayout) {
        if (this.f35172d) {
            return;
        }
        d(scaleOfLayout);
    }

    public abstract void d(float scaleOfLayout);

    public final void e() {
        TextView textView = this.f35173e;
        if (textView != null) {
            textView.setText(this.f35177i);
        }
        f();
    }

    public abstract void f();

    public final void g() {
        TextView textView = this.f35173e;
        if (textView != null) {
            textView.setText(this.f35178j);
        }
        if (this.f35172d) {
            ((AnimationDrawable) this.f35170b.getDrawable()).start();
        } else {
            h();
        }
        TextView textView2 = this.f35174f;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
    }

    public final int getContentSize() {
        return a.f35180a[this.f35176h.ordinal()] != 1 ? this.f35169a.getHeight() : this.f35169a.getWidth();
    }

    public abstract int getDefaultDrawableResId();

    public abstract void h();

    public final void i() {
        TextView textView = this.f35173e;
        if (textView != null) {
            textView.setText(this.f35179k);
        }
        j();
    }

    public abstract void j();

    public final void k() {
        TextView textView = this.f35173e;
        if (textView != null) {
            textView.setText(this.f35177i);
        }
        this.f35170b.setVisibility(0);
        if (this.f35172d) {
            ((AnimationDrawable) this.f35170b.getDrawable()).stop();
        } else {
            l();
        }
        TextView textView2 = this.f35174f;
        if (textView2 != null) {
            if (TextUtils.isEmpty(textView2.getText())) {
                this.f35174f.setVisibility(8);
            } else {
                this.f35174f.setVisibility(0);
            }
        }
    }

    public abstract void l();

    public final void m() {
        if (4 == this.f35173e.getVisibility()) {
            this.f35173e.setVisibility(0);
        }
        if (4 == this.f35171c.getVisibility()) {
            this.f35171c.setVisibility(0);
        }
        if (4 == this.f35170b.getVisibility()) {
            this.f35170b.setVisibility(0);
        }
        if (4 == this.f35174f.getVisibility()) {
            this.f35174f.setVisibility(0);
        }
    }

    public final void setHeight(int height) {
        getLayoutParams().height = height;
        requestLayout();
    }

    @Override // jq.b
    public void setLastUpdatedLabel(CharSequence label) {
        setSubHeaderText(label);
    }

    @Override // jq.b
    public final void setLoadingDrawable(Drawable imageDrawable) {
        this.f35170b.setImageDrawable(imageDrawable);
        this.f35172d = imageDrawable instanceof AnimationDrawable;
        b(imageDrawable);
    }

    @Override // jq.b
    public void setPullLabel(CharSequence pullLabel) {
        this.f35177i = pullLabel;
    }

    @Override // jq.b
    public void setRefreshingLabel(CharSequence refreshingLabel) {
        this.f35178j = refreshingLabel;
    }

    @Override // jq.b
    public void setReleaseLabel(CharSequence releaseLabel) {
        this.f35179k = releaseLabel;
    }

    @Override // jq.b
    public void setTextTypeface(Typeface tf2) {
        this.f35173e.setTypeface(tf2);
    }

    public final void setWidth(int width) {
        getLayoutParams().width = width;
        requestLayout();
    }
}
