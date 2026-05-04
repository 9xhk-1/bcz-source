package com.huawei.hms.support.hwid.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.media3.ui.DefaultTimeBar;
import com.huawei.android.hms.hwid.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class HuaweiIdAuthButton extends RelativeLayout {
    public static final int COLOR_POLICY_BLACK = 3;
    public static final int COLOR_POLICY_GRAY = 4;
    public static final int COLOR_POLICY_RED = 0;
    public static final int COLOR_POLICY_WHITE = 1;
    public static final int COLOR_POLICY_WHITE_WITH_BORDER = 2;
    public static final int CORNER_RADIUS_LARGE = -1;
    public static final int CORNER_RADIUS_MEDIUM = -2;
    public static final int CORNER_RADIUS_SMALL = -3;
    public static final int THEME_FULL_TITLE = 1;
    public static final int THEME_NO_TITLE = 0;

    /* renamed from: a, reason: collision with root package name */
    private static final PorterDuffColorFilter f36424a;

    /* renamed from: b, reason: collision with root package name */
    private static final PorterDuffColorFilter f36425b;

    /* renamed from: c, reason: collision with root package name */
    private static final PorterDuffColorFilter f36426c;

    /* renamed from: d, reason: collision with root package name */
    private int f36427d;

    /* renamed from: e, reason: collision with root package name */
    private int f36428e;

    /* renamed from: f, reason: collision with root package name */
    private int f36429f;

    /* renamed from: g, reason: collision with root package name */
    private GradientDrawable f36430g;

    /* renamed from: h, reason: collision with root package name */
    private Button f36431h;

    /* renamed from: i, reason: collision with root package name */
    private ImageView f36432i;

    /* renamed from: j, reason: collision with root package name */
    private LinearLayout f36433j;

    static {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        f36424a = new PorterDuffColorFilter(218103808, mode);
        f36425b = new PorterDuffColorFilter(436207616, mode);
        f36426c = new PorterDuffColorFilter(DefaultTimeBar.DEFAULT_UNPLAYED_COLOR, mode);
    }

    public HuaweiIdAuthButton(Context context) {
        super(context);
        a((AttributeSet) null);
    }

    private void a(AttributeSet attributeSet) {
        GradientDrawable gradientDrawable = (GradientDrawable) getResources().getDrawable(R.drawable.hwid_auth_button_background);
        this.f36430g = gradientDrawable;
        setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f36433j = linearLayout;
        int i11 = 0;
        linearLayout.setOrientation(0);
        this.f36433j.setGravity(17);
        b();
        a();
        addView(this.f36433j);
        int a11 = a(8.0f);
        int i12 = 1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.HuaweiIdAuthButton);
            i12 = obtainStyledAttributes.getInt(R.styleable.HuaweiIdAuthButton_hwid_button_theme, 1);
            i11 = obtainStyledAttributes.getInt(R.styleable.HuaweiIdAuthButton_hwid_color_policy, 0);
            a11 = obtainStyledAttributes.getLayoutDimension(R.styleable.HuaweiIdAuthButton_hwid_corner_radius, a(8.0f));
            obtainStyledAttributes.recycle();
        }
        setLayoutParams(generateDefaultLayoutParams());
        setUIMode(i12, i11, a11);
    }

    private void b() {
        if (this.f36431h == null) {
            this.f36431h = new Button(getContext());
        }
        this.f36431h.setStateListAnimator(null);
        this.f36431h.setBackground(null);
        int intrinsicWidth = a(R.drawable.hwid_auth_button_white).getIntrinsicWidth();
        int a11 = a(8.0f);
        this.f36431h.setCompoundDrawablePadding(a11);
        a(intrinsicWidth, a11);
        this.f36431h.setLayoutParams(new ViewGroup.LayoutParams(-2, a(36.0f)));
        this.f36433j.addView(this.f36431h);
    }

    private void setBackgroundCornerRadius(int i11) {
        this.f36430g.mutate();
        this.f36430g.setCornerRadius(i11);
    }

    private void setBackgroundDrawableColor(int i11) {
        this.f36430g.mutate();
        this.f36430g.setColor(getResources().getColor(i11));
    }

    public int getColorPolicy() {
        return this.f36428e;
    }

    public int getCornerRadius() {
        return this.f36429f;
    }

    public int getTheme() {
        return this.f36427d;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        if (r0 != 4) goto L26;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            int r0 = r4.getAction()
            r1 = 1
            if (r0 != 0) goto L39
            android.graphics.drawable.GradientDrawable r0 = r3.f36430g
            if (r0 == 0) goto L46
            boolean r0 = r3.isEnabled()
            if (r0 == 0) goto L46
            int r0 = r3.f36428e
            if (r0 == 0) goto L31
            if (r0 == r1) goto L29
            r2 = 2
            if (r0 == r2) goto L29
            r2 = 3
            if (r0 == r2) goto L21
            r2 = 4
            if (r0 == r2) goto L29
            goto L46
        L21:
            android.graphics.drawable.GradientDrawable r0 = r3.f36430g
            android.graphics.PorterDuffColorFilter r2 = com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton.f36426c
            r0.setColorFilter(r2)
            goto L46
        L29:
            android.graphics.drawable.GradientDrawable r0 = r3.f36430g
            android.graphics.PorterDuffColorFilter r2 = com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton.f36424a
            r0.setColorFilter(r2)
            goto L46
        L31:
            android.graphics.drawable.GradientDrawable r0 = r3.f36430g
            android.graphics.PorterDuffColorFilter r2 = com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton.f36425b
            r0.setColorFilter(r2)
            goto L46
        L39:
            int r0 = r4.getAction()
            if (r1 != r0) goto L46
            android.graphics.drawable.GradientDrawable r0 = r3.f36430g
            if (r0 == 0) goto L46
            r0.clearColorFilter()
        L46:
            boolean r0 = r3.hasOnClickListeners()
            if (r0 == 0) goto L51
            boolean r4 = super.onTouchEvent(r4)
            return r4
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setColorPolicy(int i11) {
        if (i11 == 0) {
            a(i11, R.color.hwid_auth_button_color_red, R.color.hwid_auth_button_color_text_white, R.drawable.hwid_auth_button_white);
            this.f36432i.setImageDrawable(getResources().getDrawable(R.drawable.hwid_auth_button_round_white));
            return;
        }
        if (i11 == 1) {
            a(i11, R.color.hwid_auth_button_color_white, R.color.hwid_auth_button_color_text_black, R.drawable.hwid_auth_button_normal);
            this.f36432i.setImageDrawable(getResources().getDrawable(R.drawable.hwid_auth_button_round_normal));
            return;
        }
        if (i11 == 2) {
            a(i11, R.color.hwid_auth_button_color_white, R.color.hwid_auth_button_color_text_black, R.drawable.hwid_auth_button_normal);
            if (this.f36427d == 1) {
                b(a(1.0f), getResources().getColor(R.color.hwid_auth_button_color_border));
                return;
            }
            return;
        }
        if (i11 == 3) {
            a(i11, R.color.hwid_auth_button_color_black, R.color.hwid_auth_button_color_text_white, R.drawable.hwid_auth_button_white);
            this.f36432i.setImageDrawable(getResources().getDrawable(R.drawable.hwid_auth_button_round_white));
        } else {
            if (i11 != 4) {
                return;
            }
            a(i11, R.color.hwid_auth_button_color_gray, R.color.hwid_auth_button_color_text_black, R.drawable.hwid_auth_button_normal);
        }
    }

    public void setCornerRadius(int i11) {
        if (i11 == -3) {
            i11 = a(3.0f);
        } else if (i11 == -2) {
            i11 = a(8.0f);
        } else if (i11 == -1) {
            i11 = a(24.0f);
        }
        if (i11 < 0) {
            return;
        }
        this.f36429f = i11;
        setBackgroundCornerRadius(i11);
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        if (z11) {
            setAlpha(1.0f);
        } else {
            setAlpha(0.38f);
        }
    }

    public void setTheme(int i11) {
        if (i11 == 0) {
            this.f36427d = i11;
            this.f36432i.setVisibility(0);
            this.f36431h.setVisibility(8);
            setMinimumWidth(a(48.0f));
            setMinimumHeight(a(48.0f));
            this.f36433j.setMinimumWidth(a(48.0f));
            this.f36433j.setMinimumHeight(a(48.0f));
            return;
        }
        if (i11 != 1) {
            return;
        }
        this.f36427d = i11;
        this.f36432i.setVisibility(8);
        this.f36431h.setVisibility(0);
        setMinimumWidth(a(200.0f));
        setMinimumHeight(a(36.0f));
        this.f36433j.setMinimumWidth(a(200.0f));
        this.f36433j.setMinimumHeight(a(36.0f));
    }

    public void setUIMode(int i11, int i12, int i13) {
        setTheme(i11);
        setColorPolicy(i12);
        setCornerRadius(i13);
    }

    public HuaweiIdAuthButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public HuaweiIdAuthButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        a(attributeSet);
    }

    private void b(int i11, int i12) {
        this.f36430g.mutate();
        this.f36430g.setStroke(i11, i12);
    }

    private void a() {
        if (this.f36432i == null) {
            this.f36432i = new ImageView(getContext());
        }
        this.f36432i.setImageDrawable(getResources().getDrawable(R.drawable.hwid_auth_button_round_normal));
        setBackgroundDrawableColor(R.color.hwid_auth_button_color_white);
        this.f36433j.addView(this.f36432i);
    }

    private void a(int i11, int i12) {
        this.f36431h.setTextSize(16.0f);
        this.f36431h.setText(getResources().getText(R.string.hwid_huawei_login_button_text));
        this.f36431h.setSingleLine();
        int i13 = getResources().getDisplayMetrics().widthPixels;
        int a11 = a(16.0f);
        int i14 = a11 + a11;
        int i15 = i13 - i14;
        this.f36431h.setMaxWidth(i15);
        float measureText = this.f36431h.getPaint().measureText(this.f36431h.getText().toString());
        while (((int) measureText) + i11 + i12 + i14 > i15 && this.f36431h.getTextSize() > a(9.0f)) {
            Button button = this.f36431h;
            button.setTextSize(0, button.getTextSize() - 1.0f);
            measureText = this.f36431h.getPaint().measureText(this.f36431h.getText().toString());
        }
        this.f36431h.setEllipsize(TextUtils.TruncateAt.END);
        this.f36431h.setPadding(a11, 0, a11, 0);
    }

    private Drawable a(int i11) {
        Drawable drawable = getResources().getDrawable(i11);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.f36431h.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        return drawable;
    }

    private void a(int i11, int i12, int i13, int i14) {
        this.f36428e = i11;
        if (this.f36427d != 1 && i11 != 0 && i11 != 3 && i11 != 1) {
            setBackgroundDrawableColor(R.color.hwid_auth_button_color_white);
            this.f36432i.setImageDrawable(getResources().getDrawable(R.drawable.hwid_auth_button_round_normal));
        } else {
            setBackgroundDrawableColor(i12);
        }
        b(0, 0);
        this.f36431h.setTextColor(getResources().getColor(i13));
        a(i14);
    }

    private int a(float f11) {
        return (int) ((f11 * getResources().getDisplayMetrics().density) + 0.5f);
    }
}
