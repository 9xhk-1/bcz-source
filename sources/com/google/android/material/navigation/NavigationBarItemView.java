package com.google.android.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import org.junit.jupiter.api.j2;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public abstract class NavigationBarItemView extends FrameLayout implements MenuView.ItemView {
    public static final int G = -1;
    public static final int[] H = {R.attr.state_checked};
    public static final d I;
    public static final d J;
    public boolean A;
    public int B;
    public int C;
    public boolean D;
    public int E;

    @Nullable
    public com.google.android.material.badge.a F;

    /* renamed from: a, reason: collision with root package name */
    public boolean f31718a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f31719b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public Drawable f31720c;

    /* renamed from: d, reason: collision with root package name */
    public int f31721d;

    /* renamed from: e, reason: collision with root package name */
    public int f31722e;

    /* renamed from: f, reason: collision with root package name */
    public int f31723f;

    /* renamed from: g, reason: collision with root package name */
    public float f31724g;

    /* renamed from: h, reason: collision with root package name */
    public float f31725h;

    /* renamed from: i, reason: collision with root package name */
    public float f31726i;

    /* renamed from: j, reason: collision with root package name */
    public int f31727j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f31728k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public final FrameLayout f31729l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public final View f31730m;

    /* renamed from: n, reason: collision with root package name */
    public final ImageView f31731n;

    /* renamed from: o, reason: collision with root package name */
    public final ViewGroup f31732o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f31733p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f31734q;

    /* renamed from: r, reason: collision with root package name */
    public int f31735r;

    /* renamed from: s, reason: collision with root package name */
    @StyleRes
    public int f31736s;

    /* renamed from: t, reason: collision with root package name */
    @Nullable
    public MenuItemImpl f31737t;

    /* renamed from: u, reason: collision with root package name */
    @Nullable
    public ColorStateList f31738u;

    /* renamed from: v, reason: collision with root package name */
    @Nullable
    public Drawable f31739v;

    /* renamed from: w, reason: collision with root package name */
    @Nullable
    public Drawable f31740w;

    /* renamed from: x, reason: collision with root package name */
    public ValueAnimator f31741x;

    /* renamed from: y, reason: collision with root package name */
    public d f31742y;

    /* renamed from: z, reason: collision with root package name */
    public float f31743z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            if (NavigationBarItemView.this.f31731n.getVisibility() == 0) {
                NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
                navigationBarItemView.u(navigationBarItemView.f31731n);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f31745a;

        public b(int i11) {
            this.f31745a = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            NavigationBarItemView.this.v(this.f31745a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f31747a;

        public c(float f11) {
            this.f31747a = f11;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            NavigationBarItemView.this.o(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f31747a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public static final float f31749a = 0.4f;

        /* renamed from: b, reason: collision with root package name */
        public static final float f31750b = 1.0f;

        /* renamed from: c, reason: collision with root package name */
        public static final float f31751c = 0.2f;

        public d() {
        }

        public float a(@FloatRange(from = 0.0d, to = 1.0d) float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12) {
            return vm.b.b(0.0f, 1.0f, f12 == 0.0f ? 0.8f : 0.0f, f12 == 0.0f ? 1.0f : 0.2f, f11);
        }

        public float b(@FloatRange(from = 0.0d, to = 1.0d) float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12) {
            return vm.b.a(0.4f, 1.0f, f11);
        }

        public float c(@FloatRange(from = 0.0d, to = 1.0d) float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12) {
            return 1.0f;
        }

        public void d(@FloatRange(from = 0.0d, to = 1.0d) float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12, @NonNull View view) {
            view.setScaleX(b(f11, f12));
            view.setScaleY(c(f11, f12));
            view.setAlpha(a(f11, f12));
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e extends d {
        public e() {
            super(null);
        }

        @Override // com.google.android.material.navigation.NavigationBarItemView.d
        public float c(float f11, float f12) {
            return b(f11, f12);
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        I = new d(aVar);
        J = new e(aVar);
    }

    public NavigationBarItemView(@NonNull Context context) {
        super(context);
        this.f31718a = false;
        this.f31735r = -1;
        this.f31736s = 0;
        this.f31742y = I;
        this.f31743z = 0.0f;
        this.A = false;
        this.B = 0;
        this.C = 0;
        this.D = false;
        this.E = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f31729l = (FrameLayout) findViewById(com.google.android.material.R.id.navigation_bar_item_icon_container);
        this.f31730m = findViewById(com.google.android.material.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(com.google.android.material.R.id.navigation_bar_item_icon_view);
        this.f31731n = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(com.google.android.material.R.id.navigation_bar_item_labels_group);
        this.f31732o = viewGroup;
        TextView textView = (TextView) findViewById(com.google.android.material.R.id.navigation_bar_item_small_label_view);
        this.f31733p = textView;
        TextView textView2 = (TextView) findViewById(com.google.android.material.R.id.navigation_bar_item_large_label_view);
        this.f31734q = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f31721d = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f31722e = viewGroup.getPaddingBottom();
        this.f31723f = getResources().getDimensionPixelSize(com.google.android.material.R.dimen.m3_navigation_item_active_indicator_label_padding);
        ViewCompat.setImportantForAccessibility(textView, 2);
        ViewCompat.setImportantForAccessibility(textView2, 2);
        setFocusable(true);
        e(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new a());
        }
    }

    public static Drawable g(@NonNull ColorStateList colorStateList) {
        return new RippleDrawable(tn.b.a(colorStateList), null, null);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f31729l;
        return frameLayout != null ? frameLayout : this.f31731n;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i11 = 0;
        for (int i12 = 0; i12 < indexOfChild; i12++) {
            View childAt = viewGroup.getChildAt(i12);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i11++;
            }
        }
        return i11;
    }

    private int getSuggestedIconHeight() {
        return ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin + getIconOrContainer().getMeasuredHeight();
    }

    private int getSuggestedIconWidth() {
        com.google.android.material.badge.a aVar = this.F;
        int minimumWidth = aVar == null ? 0 : aVar.getMinimumWidth() - this.F.u();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.f31731n.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    public static void p(TextView textView, @StyleRes int i11) {
        TextViewCompat.setTextAppearance(textView, i11);
        int i12 = sn.c.i(textView.getContext(), i11, 0);
        if (i12 != 0) {
            textView.setTextSize(0, i12);
        }
    }

    public static void q(@NonNull View view, float f11, float f12, int i11) {
        view.setScaleX(f11);
        view.setScaleY(f12);
        view.setVisibility(i11);
    }

    public static void r(@NonNull View view, int i11, int i12) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i11;
        layoutParams.bottomMargin = i11;
        layoutParams.gravity = i12;
        view.setLayoutParams(layoutParams);
    }

    public static void x(@NonNull View view, int i11) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f31729l;
        if (frameLayout != null && this.A) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(float f11, float f12) {
        this.f31724g = f11 - f12;
        this.f31725h = (f12 * 1.0f) / f11;
        this.f31726i = (f11 * 1.0f) / f12;
    }

    public void f() {
        n();
        this.f31737t = null;
        this.f31743z = 0.0f;
        this.f31718a = false;
    }

    @Nullable
    public Drawable getActiveIndicatorDrawable() {
        View view = this.f31730m;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    @Nullable
    public com.google.android.material.badge.a getBadge() {
        return this.F;
    }

    @DrawableRes
    public int getItemBackgroundResId() {
        return com.google.android.material.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    @Nullable
    public MenuItemImpl getItemData() {
        return this.f31737t;
    }

    @DimenRes
    public int getItemDefaultMarginResId() {
        return com.google.android.material.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    @LayoutRes
    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f31735r;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f31732o.getLayoutParams();
        return getSuggestedIconHeight() + (this.f31732o.getVisibility() == 0 ? this.f31723f : 0) + layoutParams.topMargin + this.f31732o.getMeasuredHeight() + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f31732o.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams.leftMargin + this.f31732o.getMeasuredWidth() + layoutParams.rightMargin);
    }

    @Nullable
    public final FrameLayout h(View view) {
        ImageView imageView = this.f31731n;
        if (view == imageView && com.google.android.material.badge.b.f30581a) {
            return (FrameLayout) imageView.getParent();
        }
        return null;
    }

    public final boolean i() {
        return this.F != null;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(@NonNull MenuItemImpl menuItemImpl, int i11) {
        this.f31737t = menuItemImpl;
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.getTitle());
        setId(menuItemImpl.getItemId());
        if (!TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(menuItemImpl.getContentDescription());
        }
        TooltipCompat.setTooltipText(this, !TextUtils.isEmpty(menuItemImpl.getTooltipText()) ? menuItemImpl.getTooltipText() : menuItemImpl.getTitle());
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        this.f31718a = true;
    }

    public final boolean j() {
        return this.D && this.f31727j == 2;
    }

    public final void k(@FloatRange(from = 0.0d, to = 1.0d) float f11) {
        if (!this.A || !this.f31718a || !ViewCompat.isAttachedToWindow(this)) {
            o(f11, f11);
            return;
        }
        ValueAnimator valueAnimator = this.f31741x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f31741x = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f31743z, f11);
        this.f31741x = ofFloat;
        ofFloat.addUpdateListener(new c(f11));
        this.f31741x.setInterpolator(j.g(getContext(), com.google.android.material.R.attr.motionEasingEmphasizedInterpolator, vm.b.f94061b));
        this.f31741x.setDuration(j.f(getContext(), com.google.android.material.R.attr.motionDurationLong2, getResources().getInteger(com.google.android.material.R.integer.material_motion_duration_long_1)));
        this.f31741x.start();
    }

    public final void l() {
        MenuItemImpl menuItemImpl = this.f31737t;
        if (menuItemImpl != null) {
            setChecked(menuItemImpl.isChecked());
        }
    }

    public final void m() {
        Drawable drawable = this.f31720c;
        RippleDrawable rippleDrawable = null;
        boolean z11 = true;
        if (this.f31719b != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.A && getActiveIndicatorDrawable() != null && this.f31729l != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(tn.b.e(this.f31719b), null, activeIndicatorDrawable);
                z11 = false;
            } else if (drawable == null) {
                drawable = g(this.f31719b);
            }
        }
        FrameLayout frameLayout = this.f31729l;
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            this.f31729l.setForeground(rippleDrawable);
        }
        ViewCompat.setBackground(this, drawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z11);
        }
    }

    public void n() {
        t(this.f31731n);
    }

    public final void o(@FloatRange(from = 0.0d, to = 1.0d) float f11, float f12) {
        View view = this.f31730m;
        if (view != null) {
            this.f31742y.d(f11, f12, view);
        }
        this.f31743z = f11;
    }

    @Override // android.view.ViewGroup, android.view.View
    @NonNull
    public int[] onCreateDrawableState(int i11) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i11 + 1);
        MenuItemImpl menuItemImpl = this.f31737t;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.f31737t.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, H);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        com.google.android.material.badge.a aVar = this.F;
        if (aVar != null && aVar.isVisible()) {
            CharSequence title = this.f31737t.getTitle();
            if (!TextUtils.isEmpty(this.f31737t.getContentDescription())) {
                title = this.f31737t.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + j2.O + ((Object) this.F.r()));
        }
        AccessibilityNodeInfoCompat wrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        wrap.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            wrap.setClickable(false);
            wrap.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
        }
        wrap.setRoleDescription(getResources().getString(com.google.android.material.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        post(new b(i11));
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
        return false;
    }

    public final void s(@Nullable View view) {
        if (i() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            com.google.android.material.badge.b.d(this.F, view, h(view));
        }
    }

    public void setActiveIndicatorDrawable(@Nullable Drawable drawable) {
        View view = this.f31730m;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        m();
    }

    public void setActiveIndicatorEnabled(boolean z11) {
        this.A = z11;
        m();
        View view = this.f31730m;
        if (view != null) {
            view.setVisibility(z11 ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i11) {
        this.C = i11;
        v(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i11) {
        if (this.f31723f != i11) {
            this.f31723f = i11;
            l();
        }
    }

    public void setActiveIndicatorMarginHorizontal(@Px int i11) {
        this.E = i11;
        v(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z11) {
        this.D = z11;
    }

    public void setActiveIndicatorWidth(int i11) {
        this.B = i11;
        v(getWidth());
    }

    public void setBadge(@NonNull com.google.android.material.badge.a aVar) {
        if (this.F == aVar) {
            return;
        }
        if (i() && this.f31731n != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            t(this.f31731n);
        }
        this.F = aVar;
        ImageView imageView = this.f31731n;
        if (imageView != null) {
            s(imageView);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z11) {
        refreshDrawableState();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z11) {
        this.f31734q.setPivotX(r0.getWidth() / 2);
        this.f31734q.setPivotY(r0.getBaseline());
        this.f31733p.setPivotX(r0.getWidth() / 2);
        this.f31733p.setPivotY(r0.getBaseline());
        k(z11 ? 1.0f : 0.0f);
        int i11 = this.f31727j;
        if (i11 != -1) {
            if (i11 == 0) {
                if (z11) {
                    r(getIconOrContainer(), this.f31721d, 49);
                    x(this.f31732o, this.f31722e);
                    this.f31734q.setVisibility(0);
                } else {
                    r(getIconOrContainer(), this.f31721d, 17);
                    x(this.f31732o, 0);
                    this.f31734q.setVisibility(4);
                }
                this.f31733p.setVisibility(4);
            } else if (i11 == 1) {
                x(this.f31732o, this.f31722e);
                if (z11) {
                    r(getIconOrContainer(), (int) (this.f31721d + this.f31724g), 49);
                    q(this.f31734q, 1.0f, 1.0f, 0);
                    TextView textView = this.f31733p;
                    float f11 = this.f31725h;
                    q(textView, f11, f11, 4);
                } else {
                    r(getIconOrContainer(), this.f31721d, 49);
                    TextView textView2 = this.f31734q;
                    float f12 = this.f31726i;
                    q(textView2, f12, f12, 4);
                    q(this.f31733p, 1.0f, 1.0f, 0);
                }
            } else if (i11 == 2) {
                r(getIconOrContainer(), this.f31721d, 17);
                this.f31734q.setVisibility(8);
                this.f31733p.setVisibility(8);
            }
        } else if (this.f31728k) {
            if (z11) {
                r(getIconOrContainer(), this.f31721d, 49);
                x(this.f31732o, this.f31722e);
                this.f31734q.setVisibility(0);
            } else {
                r(getIconOrContainer(), this.f31721d, 17);
                x(this.f31732o, 0);
                this.f31734q.setVisibility(4);
            }
            this.f31733p.setVisibility(4);
        } else {
            x(this.f31732o, this.f31722e);
            if (z11) {
                r(getIconOrContainer(), (int) (this.f31721d + this.f31724g), 49);
                q(this.f31734q, 1.0f, 1.0f, 0);
                TextView textView3 = this.f31733p;
                float f13 = this.f31725h;
                q(textView3, f13, f13, 4);
            } else {
                r(getIconOrContainer(), this.f31721d, 49);
                TextView textView4 = this.f31734q;
                float f14 = this.f31726i;
                q(textView4, f14, f14, 4);
                q(this.f31733p, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z11);
    }

    @Override // android.view.View, androidx.appcompat.view.menu.MenuView.ItemView
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        this.f31733p.setEnabled(z11);
        this.f31734q.setEnabled(z11);
        this.f31731n.setEnabled(z11);
        if (z11) {
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), 1002));
        } else {
            ViewCompat.setPointerIcon(this, null);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(@Nullable Drawable drawable) {
        if (drawable == this.f31739v) {
            return;
        }
        this.f31739v = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = DrawableCompat.wrap(drawable).mutate();
            this.f31740w = drawable;
            ColorStateList colorStateList = this.f31738u;
            if (colorStateList != null) {
                DrawableCompat.setTintList(drawable, colorStateList);
            }
        }
        this.f31731n.setImageDrawable(drawable);
    }

    public void setIconSize(int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f31731n.getLayoutParams();
        layoutParams.width = i11;
        layoutParams.height = i11;
        this.f31731n.setLayoutParams(layoutParams);
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        Drawable drawable;
        this.f31738u = colorStateList;
        if (this.f31737t == null || (drawable = this.f31740w) == null) {
            return;
        }
        DrawableCompat.setTintList(drawable, colorStateList);
        this.f31740w.invalidateSelf();
    }

    public void setItemBackground(int i11) {
        setItemBackground(i11 == 0 ? null : ContextCompat.getDrawable(getContext(), i11));
    }

    public void setItemPaddingBottom(int i11) {
        if (this.f31722e != i11) {
            this.f31722e = i11;
            l();
        }
    }

    public void setItemPaddingTop(int i11) {
        if (this.f31721d != i11) {
            this.f31721d = i11;
            l();
        }
    }

    public void setItemPosition(int i11) {
        this.f31735r = i11;
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.f31719b = colorStateList;
        m();
    }

    public void setLabelVisibilityMode(int i11) {
        if (this.f31727j != i11) {
            this.f31727j = i11;
            w();
            v(getWidth());
            l();
        }
    }

    public void setShifting(boolean z11) {
        if (this.f31728k != z11) {
            this.f31728k = z11;
            l();
        }
    }

    public void setTextAppearanceActive(@StyleRes int i11) {
        this.f31736s = i11;
        p(this.f31734q, i11);
        e(this.f31733p.getTextSize(), this.f31734q.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z11) {
        setTextAppearanceActive(this.f31736s);
        TextView textView = this.f31734q;
        textView.setTypeface(textView.getTypeface(), z11 ? 1 : 0);
    }

    public void setTextAppearanceInactive(@StyleRes int i11) {
        p(this.f31733p, i11);
        e(this.f31733p.getTextSize(), this.f31734q.getTextSize());
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f31733p.setTextColor(colorStateList);
            this.f31734q.setTextColor(colorStateList);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(@Nullable CharSequence charSequence) {
        this.f31733p.setText(charSequence);
        this.f31734q.setText(charSequence);
        MenuItemImpl menuItemImpl = this.f31737t;
        if (menuItemImpl == null || TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(charSequence);
        }
        MenuItemImpl menuItemImpl2 = this.f31737t;
        if (menuItemImpl2 != null && !TextUtils.isEmpty(menuItemImpl2.getTooltipText())) {
            charSequence = this.f31737t.getTooltipText();
        }
        TooltipCompat.setTooltipText(this, charSequence);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return true;
    }

    public final void t(@Nullable View view) {
        if (i()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                com.google.android.material.badge.b.j(this.F, view);
            }
            this.F = null;
        }
    }

    public final void u(View view) {
        if (i()) {
            com.google.android.material.badge.b.m(this.F, view, h(view));
        }
    }

    public final void v(int i11) {
        if (this.f31730m == null || i11 <= 0) {
            return;
        }
        int min = Math.min(this.B, i11 - (this.E * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f31730m.getLayoutParams();
        layoutParams.height = j() ? min : this.C;
        layoutParams.width = min;
        this.f31730m.setLayoutParams(layoutParams);
    }

    public final void w() {
        if (j()) {
            this.f31742y = J;
        } else {
            this.f31742y = I;
        }
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f31720c = drawable;
        m();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean z11, char c11) {
    }
}
