package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Pools;
import androidx.core.view.GravityCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.R;
import com.google.android.material.internal.m0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ViewPager.DecorView
/* loaded from: classes7.dex */
public class TabLayout extends HorizontalScrollView {
    public static final int A1 = 2;
    public static final int B1 = 3;
    public static final int C1 = 0;
    public static final int D1 = 1;
    public static final int E1 = 2;

    /* renamed from: f1, reason: collision with root package name */
    @Dimension(unit = 0)
    public static final int f32232f1 = 72;

    /* renamed from: h1, reason: collision with root package name */
    @Dimension(unit = 0)
    public static final int f32233h1 = 8;

    /* renamed from: i1, reason: collision with root package name */
    @Dimension(unit = 0)
    public static final int f32234i1 = 48;

    /* renamed from: j1, reason: collision with root package name */
    @Dimension(unit = 0)
    public static final int f32235j1 = 56;

    /* renamed from: k1, reason: collision with root package name */
    @Dimension(unit = 0)
    public static final int f32236k1 = 16;

    /* renamed from: l1, reason: collision with root package name */
    public static final int f32237l1 = -1;

    /* renamed from: m1, reason: collision with root package name */
    public static final int f32238m1 = 300;

    /* renamed from: n1, reason: collision with root package name */
    public static final int f32239n1 = -1;

    /* renamed from: p1, reason: collision with root package name */
    public static final String f32241p1 = "TabLayout";

    /* renamed from: q1, reason: collision with root package name */
    public static final int f32242q1 = 0;

    /* renamed from: r1, reason: collision with root package name */
    public static final int f32243r1 = 1;

    /* renamed from: s1, reason: collision with root package name */
    public static final int f32244s1 = 2;

    /* renamed from: t1, reason: collision with root package name */
    public static final int f32245t1 = 0;

    /* renamed from: u1, reason: collision with root package name */
    public static final int f32246u1 = 1;

    /* renamed from: v1, reason: collision with root package name */
    public static final int f32247v1 = 0;

    /* renamed from: w1, reason: collision with root package name */
    public static final int f32248w1 = 1;

    /* renamed from: x1, reason: collision with root package name */
    public static final int f32249x1 = 2;

    /* renamed from: y1, reason: collision with root package name */
    public static final int f32250y1 = 0;

    /* renamed from: z1, reason: collision with root package name */
    public static final int f32251z1 = 1;
    public int A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public com.google.android.material.tabs.a J;
    public final TimeInterpolator K;

    @Nullable
    public c L;
    public final ArrayList<c> M;

    @Nullable
    public c N;
    public ValueAnimator O;

    @Nullable
    public ViewPager P;

    @Nullable
    public PagerAdapter Q;
    public DataSetObserver R;
    public m S;
    public b T;
    public boolean U;
    public int V;
    public final Pools.Pool<TabView> W;

    /* renamed from: a, reason: collision with root package name */
    public int f32252a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<i> f32253b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public i f32254c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final h f32255d;

    /* renamed from: e, reason: collision with root package name */
    public int f32256e;

    /* renamed from: f, reason: collision with root package name */
    public int f32257f;

    /* renamed from: g, reason: collision with root package name */
    public int f32258g;

    /* renamed from: h, reason: collision with root package name */
    public int f32259h;

    /* renamed from: i, reason: collision with root package name */
    public final int f32260i;

    /* renamed from: j, reason: collision with root package name */
    public final int f32261j;

    /* renamed from: k, reason: collision with root package name */
    public int f32262k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f32263l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f32264m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f32265n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public Drawable f32266o;

    /* renamed from: p, reason: collision with root package name */
    public int f32267p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f32268q;

    /* renamed from: r, reason: collision with root package name */
    public float f32269r;

    /* renamed from: s, reason: collision with root package name */
    public float f32270s;

    /* renamed from: t, reason: collision with root package name */
    public float f32271t;

    /* renamed from: u, reason: collision with root package name */
    public final int f32272u;

    /* renamed from: v, reason: collision with root package name */
    public int f32273v;

    /* renamed from: w, reason: collision with root package name */
    public final int f32274w;

    /* renamed from: x, reason: collision with root package name */
    public final int f32275x;

    /* renamed from: y, reason: collision with root package name */
    public final int f32276y;

    /* renamed from: z, reason: collision with root package name */
    public int f32277z;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f32231f0 = R.style.Widget_Design_TabLayout;

    /* renamed from: o1, reason: collision with root package name */
    public static final Pools.Pool<i> f32240o1 = new Pools.SynchronizedPool(16);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class TabView extends LinearLayout {

        /* renamed from: a, reason: collision with root package name */
        public i f32278a;

        /* renamed from: b, reason: collision with root package name */
        public TextView f32279b;

        /* renamed from: c, reason: collision with root package name */
        public ImageView f32280c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        public View f32281d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        public com.google.android.material.badge.a f32282e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        public View f32283f;

        /* renamed from: g, reason: collision with root package name */
        @Nullable
        public TextView f32284g;

        /* renamed from: h, reason: collision with root package name */
        @Nullable
        public ImageView f32285h;

        /* renamed from: i, reason: collision with root package name */
        @Nullable
        public Drawable f32286i;

        /* renamed from: j, reason: collision with root package name */
        public int f32287j;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements View.OnLayoutChangeListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ View f32289a;

            public a(View view) {
                this.f32289a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                if (this.f32289a.getVisibility() == 0) {
                    TabView.this.w(this.f32289a);
                }
            }
        }

        public TabView(@NonNull Context context) {
            super(context);
            this.f32287j = 2;
            y(context);
            ViewCompat.setPaddingRelative(this, TabLayout.this.f32256e, TabLayout.this.f32257f, TabLayout.this.f32258g, TabLayout.this.f32259h);
            setGravity(17);
            setOrientation(!TabLayout.this.E ? 1 : 0);
            setClickable(true);
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), 1002));
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Nullable
        public com.google.android.material.badge.a getBadge() {
            return this.f32282e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @NonNull
        public com.google.android.material.badge.a getOrCreateBadge() {
            if (this.f32282e == null) {
                this.f32282e = com.google.android.material.badge.a.f(getContext());
            }
            v();
            com.google.android.material.badge.a aVar = this.f32282e;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final void A() {
            ViewParent parent;
            i iVar = this.f32278a;
            View g11 = iVar != null ? iVar.g() : null;
            if (g11 != null) {
                ViewParent parent2 = g11.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(g11);
                    }
                    View view = this.f32283f;
                    if (view != null && (parent = view.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f32283f);
                    }
                    addView(g11);
                }
                this.f32283f = g11;
                TextView textView = this.f32279b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f32280c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f32280c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) g11.findViewById(android.R.id.text1);
                this.f32284g = textView2;
                if (textView2 != null) {
                    this.f32287j = TextViewCompat.getMaxLines(textView2);
                }
                this.f32285h = (ImageView) g11.findViewById(android.R.id.icon);
            } else {
                View view2 = this.f32283f;
                if (view2 != null) {
                    removeView(view2);
                    this.f32283f = null;
                }
                this.f32284g = null;
                this.f32285h = null;
            }
            if (this.f32283f == null) {
                if (this.f32280c == null) {
                    p();
                }
                if (this.f32279b == null) {
                    q();
                    this.f32287j = TextViewCompat.getMaxLines(this.f32279b);
                }
                TextViewCompat.setTextAppearance(this.f32279b, TabLayout.this.f32260i);
                if (!isSelected() || TabLayout.this.f32262k == -1) {
                    TextViewCompat.setTextAppearance(this.f32279b, TabLayout.this.f32261j);
                } else {
                    TextViewCompat.setTextAppearance(this.f32279b, TabLayout.this.f32262k);
                }
                ColorStateList colorStateList = TabLayout.this.f32263l;
                if (colorStateList != null) {
                    this.f32279b.setTextColor(colorStateList);
                }
                B(this.f32279b, this.f32280c, true);
                v();
                i(this.f32280c);
                i(this.f32279b);
            } else {
                TextView textView3 = this.f32284g;
                if (textView3 != null || this.f32285h != null) {
                    B(textView3, this.f32285h, false);
                }
            }
            if (iVar == null || TextUtils.isEmpty(iVar.f32305d)) {
                return;
            }
            setContentDescription(iVar.f32305d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
        
            if (r7.f32278a.f32308g == 1) goto L28;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void B(@androidx.annotation.Nullable android.widget.TextView r8, @androidx.annotation.Nullable android.widget.ImageView r9, boolean r10) {
            /*
                r7 = this;
                com.google.android.material.tabs.TabLayout$i r0 = r7.f32278a
                r1 = 0
                if (r0 == 0) goto L1a
                android.graphics.drawable.Drawable r0 = r0.h()
                if (r0 == 0) goto L1a
                com.google.android.material.tabs.TabLayout$i r0 = r7.f32278a
                android.graphics.drawable.Drawable r0 = r0.h()
                android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
                android.graphics.drawable.Drawable r0 = r0.mutate()
                goto L1b
            L1a:
                r0 = r1
            L1b:
                if (r0 == 0) goto L2d
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.f32264m
                androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r2)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.graphics.PorterDuff$Mode r2 = r2.f32268q
                if (r2 == 0) goto L2d
                androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r2)
            L2d:
                com.google.android.material.tabs.TabLayout$i r2 = r7.f32278a
                if (r2 == 0) goto L36
                java.lang.CharSequence r2 = r2.n()
                goto L37
            L36:
                r2 = r1
            L37:
                r3 = 8
                r4 = 0
                if (r9 == 0) goto L4e
                if (r0 == 0) goto L48
                r9.setImageDrawable(r0)
                r9.setVisibility(r4)
                r7.setVisibility(r4)
                goto L4e
            L48:
                r9.setVisibility(r3)
                r9.setImageDrawable(r1)
            L4e:
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r8 == 0) goto L77
                if (r0 != 0) goto L60
                com.google.android.material.tabs.TabLayout$i r5 = r7.f32278a
                int r5 = com.google.android.material.tabs.TabLayout.i.b(r5)
                r6 = 1
                if (r5 != r6) goto L60
                goto L61
            L60:
                r6 = r4
            L61:
                if (r0 != 0) goto L65
                r5 = r2
                goto L66
            L65:
                r5 = r1
            L66:
                r8.setText(r5)
                if (r6 == 0) goto L6d
                r5 = r4
                goto L6e
            L6d:
                r5 = r3
            L6e:
                r8.setVisibility(r5)
                if (r0 != 0) goto L78
                r7.setVisibility(r4)
                goto L78
            L77:
                r6 = r4
            L78:
                if (r10 == 0) goto Lbc
                if (r9 == 0) goto Lbc
                android.view.ViewGroup$LayoutParams r8 = r9.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
                if (r6 == 0) goto L94
                int r10 = r9.getVisibility()
                if (r10 != 0) goto L94
                android.content.Context r10 = r7.getContext()
                float r10 = com.google.android.material.internal.m0.i(r10, r3)
                int r10 = (int) r10
                goto L95
            L94:
                r10 = r4
            L95:
                com.google.android.material.tabs.TabLayout r3 = com.google.android.material.tabs.TabLayout.this
                boolean r3 = r3.E
                if (r3 == 0) goto Lad
                int r3 = androidx.core.view.MarginLayoutParamsCompat.getMarginEnd(r8)
                if (r10 == r3) goto Lbc
                androidx.core.view.MarginLayoutParamsCompat.setMarginEnd(r8, r10)
                r8.bottomMargin = r4
                r9.setLayoutParams(r8)
                r9.requestLayout()
                goto Lbc
            Lad:
                int r3 = r8.bottomMargin
                if (r10 == r3) goto Lbc
                r8.bottomMargin = r10
                androidx.core.view.MarginLayoutParamsCompat.setMarginEnd(r8, r4)
                r9.setLayoutParams(r8)
                r9.requestLayout()
            Lbc:
                com.google.android.material.tabs.TabLayout$i r8 = r7.f32278a
                if (r8 == 0) goto Lc4
                java.lang.CharSequence r1 = com.google.android.material.tabs.TabLayout.i.c(r8)
            Lc4:
                if (r0 != 0) goto Lc7
                goto Lc8
            Lc7:
                r2 = r1
            Lc8:
                androidx.appcompat.widget.TooltipCompat.setTooltipText(r7, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.TabView.B(android.widget.TextView, android.widget.ImageView, boolean):void");
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f32286i;
            if ((drawable == null || !drawable.isStateful()) ? false : this.f32286i.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public int getContentHeight() {
            View[] viewArr = {this.f32279b, this.f32280c, this.f32283f};
            int i11 = 0;
            int i12 = 0;
            boolean z11 = false;
            for (int i13 = 0; i13 < 3; i13++) {
                View view = viewArr[i13];
                if (view != null && view.getVisibility() == 0) {
                    i12 = z11 ? Math.min(i12, view.getTop()) : view.getTop();
                    i11 = z11 ? Math.max(i11, view.getBottom()) : view.getBottom();
                    z11 = true;
                }
            }
            return i11 - i12;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f32279b, this.f32280c, this.f32283f};
            int i11 = 0;
            int i12 = 0;
            boolean z11 = false;
            for (int i13 = 0; i13 < 3; i13++) {
                View view = viewArr[i13];
                if (view != null && view.getVisibility() == 0) {
                    i12 = z11 ? Math.min(i12, view.getLeft()) : view.getLeft();
                    i11 = z11 ? Math.max(i11, view.getRight()) : view.getRight();
                    z11 = true;
                }
            }
            return i11 - i12;
        }

        @Nullable
        public i getTab() {
            return this.f32278a;
        }

        public final void i(@Nullable View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        public final float j(@NonNull Layout layout, int i11, float f11) {
            return layout.getLineWidth(i11) * (f11 / layout.getPaint().getTextSize());
        }

        public final void k(boolean z11) {
            setClipChildren(z11);
            setClipToPadding(z11);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z11);
                viewGroup.setClipToPadding(z11);
            }
        }

        @NonNull
        public final FrameLayout l() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        public final void m(@NonNull Canvas canvas) {
            Drawable drawable = this.f32286i;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f32286i.draw(canvas);
            }
        }

        @Nullable
        public final FrameLayout n(@NonNull View view) {
            if ((view == this.f32280c || view == this.f32279b) && com.google.android.material.badge.b.f30581a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        public final boolean o() {
            return this.f32282e != null;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            AccessibilityNodeInfoCompat wrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
            com.google.android.material.badge.a aVar = this.f32282e;
            if (aVar != null && aVar.isVisible()) {
                wrap.setContentDescription(this.f32282e.r());
            }
            wrap.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, this.f32278a.k(), 1, false, isSelected()));
            if (isSelected()) {
                wrap.setClickable(false);
                wrap.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
            }
            wrap.setRoleDescription(getResources().getString(R.string.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i11, int i12) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i11);
            int mode = View.MeasureSpec.getMode(i11);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i11 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f32273v, Integer.MIN_VALUE);
            }
            super.onMeasure(i11, i12);
            if (this.f32279b != null) {
                float f11 = TabLayout.this.f32269r;
                int i13 = this.f32287j;
                ImageView imageView = this.f32280c;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f32279b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f11 = TabLayout.this.f32271t;
                    }
                } else {
                    i13 = 1;
                }
                float textSize = this.f32279b.getTextSize();
                int lineCount = this.f32279b.getLineCount();
                int maxLines = TextViewCompat.getMaxLines(this.f32279b);
                if (f11 != textSize || (maxLines >= 0 && i13 != maxLines)) {
                    if (TabLayout.this.D != 1 || f11 <= textSize || lineCount != 1 || ((layout = this.f32279b.getLayout()) != null && j(layout, 0, f11) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.f32279b.setTextSize(0, f11);
                        this.f32279b.setMaxLines(i13);
                        super.onMeasure(i11, i12);
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void p() {
            FrameLayout frameLayout;
            if (com.google.android.material.badge.b.f30581a) {
                frameLayout = l();
                addView(frameLayout, 0);
            } else {
                frameLayout = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) frameLayout, false);
            this.f32280c = imageView;
            frameLayout.addView(imageView, 0);
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f32278a == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f32278a.r();
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void q() {
            FrameLayout frameLayout;
            if (com.google.android.material.badge.b.f30581a) {
                frameLayout = l();
                addView(frameLayout);
            } else {
                frameLayout = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) frameLayout, false);
            this.f32279b = textView;
            frameLayout.addView(textView);
        }

        public final void r() {
            if (this.f32281d != null) {
                u();
            }
            this.f32282e = null;
        }

        public void s() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void setSelected(boolean z11) {
            isSelected();
            super.setSelected(z11);
            TextView textView = this.f32279b;
            if (textView != null) {
                textView.setSelected(z11);
            }
            ImageView imageView = this.f32280c;
            if (imageView != null) {
                imageView.setSelected(z11);
            }
            View view = this.f32283f;
            if (view != null) {
                view.setSelected(z11);
            }
        }

        public void setTab(@Nullable i iVar) {
            if (iVar != this.f32278a) {
                this.f32278a = iVar;
                x();
            }
        }

        public final void t(@Nullable View view) {
            if (o() && view != null) {
                k(false);
                com.google.android.material.badge.b.d(this.f32282e, view, n(view));
                this.f32281d = view;
            }
        }

        public final void u() {
            if (o()) {
                k(true);
                View view = this.f32281d;
                if (view != null) {
                    com.google.android.material.badge.b.j(this.f32282e, view);
                    this.f32281d = null;
                }
            }
        }

        public final void v() {
            i iVar;
            i iVar2;
            if (o()) {
                if (this.f32283f != null) {
                    u();
                    return;
                }
                if (this.f32280c != null && (iVar2 = this.f32278a) != null && iVar2.h() != null) {
                    View view = this.f32281d;
                    ImageView imageView = this.f32280c;
                    if (view == imageView) {
                        w(imageView);
                        return;
                    } else {
                        u();
                        t(this.f32280c);
                        return;
                    }
                }
                if (this.f32279b == null || (iVar = this.f32278a) == null || iVar.l() != 1) {
                    u();
                    return;
                }
                View view2 = this.f32281d;
                TextView textView = this.f32279b;
                if (view2 == textView) {
                    w(textView);
                } else {
                    u();
                    t(this.f32279b);
                }
            }
        }

        public final void w(@NonNull View view) {
            if (o() && view == this.f32281d) {
                com.google.android.material.badge.b.m(this.f32282e, view, n(view));
            }
        }

        public final void x() {
            A();
            i iVar = this.f32278a;
            setSelected(iVar != null && iVar.o());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        public final void y(Context context) {
            int i11 = TabLayout.this.f32272u;
            if (i11 != 0) {
                Drawable drawable = AppCompatResources.getDrawable(context, i11);
                this.f32286i = drawable;
                if (drawable != null && drawable.isStateful()) {
                    this.f32286i.setState(getDrawableState());
                }
            } else {
                this.f32286i = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (TabLayout.this.f32265n != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList a11 = tn.b.a(TabLayout.this.f32265n);
                boolean z11 = TabLayout.this.I;
                if (z11) {
                    gradientDrawable = null;
                }
                gradientDrawable = new RippleDrawable(a11, gradientDrawable, z11 ? null : gradientDrawable2);
            }
            ViewCompat.setBackground(this, gradientDrawable);
            TabLayout.this.invalidate();
        }

        public final void z() {
            setOrientation(!TabLayout.this.E ? 1 : 0);
            TextView textView = this.f32284g;
            if (textView == null && this.f32285h == null) {
                B(this.f32279b, this.f32280c, true);
            } else {
                B(textView, this.f32285h, false);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements ViewPager.OnAdapterChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public boolean f32292a;

        public b() {
        }

        public void a(boolean z11) {
            this.f32292a = z11;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.P == viewPager) {
                tabLayout.T(pagerAdapter2, this.f32292a);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Deprecated
    public interface c<T extends i> {
        void onTabReselected(T t11);

        void onTabSelected(T t11);

        void onTabUnselected(T t11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public @interface d {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface e {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface f extends c<i> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g extends DataSetObserver {
        public g() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.J();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.J();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h extends LinearLayout {

        /* renamed from: a, reason: collision with root package name */
        public ValueAnimator f32295a;

        /* renamed from: b, reason: collision with root package name */
        public int f32296b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ View f32298a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f32299b;

            public a(View view, View view2) {
                this.f32298a = view;
                this.f32299b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                h.this.j(this.f32298a, this.f32299b, valueAnimator.getAnimatedFraction());
            }
        }

        public h(Context context) {
            super(context);
            this.f32296b = -1;
            setWillNotDraw(false);
        }

        public void c(int i11, int i12) {
            ValueAnimator valueAnimator = this.f32295a;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f32252a != i11) {
                this.f32295a.cancel();
            }
            k(true, i11, i12);
        }

        public boolean d() {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (getChildAt(i11).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(@NonNull Canvas canvas) {
            int height;
            int height2 = TabLayout.this.f32266o.getBounds().height();
            if (height2 < 0) {
                height2 = TabLayout.this.f32266o.getIntrinsicHeight();
            }
            int i11 = TabLayout.this.C;
            if (i11 == 0) {
                height = getHeight() - height2;
                height2 = getHeight();
            } else if (i11 != 1) {
                height = 0;
                if (i11 != 2) {
                    height2 = i11 != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - height2) / 2;
                height2 = (getHeight() + height2) / 2;
            }
            if (TabLayout.this.f32266o.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f32266o.getBounds();
                TabLayout.this.f32266o.setBounds(bounds.left, height, bounds.right, height2);
                TabLayout.this.f32266o.draw(canvas);
            }
            super.draw(canvas);
        }

        public final void e() {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f32252a == -1) {
                tabLayout.f32252a = tabLayout.getSelectedTabPosition();
            }
            f(TabLayout.this.f32252a);
        }

        public final void f(int i11) {
            if (TabLayout.this.V == 0 || (TabLayout.this.getTabSelectedIndicator().getBounds().left == -1 && TabLayout.this.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i11);
                com.google.android.material.tabs.a aVar = TabLayout.this.J;
                TabLayout tabLayout = TabLayout.this;
                aVar.c(tabLayout, childAt, tabLayout.f32266o);
                TabLayout.this.f32252a = i11;
            }
        }

        public final void g() {
            f(TabLayout.this.getSelectedTabPosition());
        }

        public void h(int i11, float f11) {
            TabLayout.this.f32252a = Math.round(i11 + f11);
            ValueAnimator valueAnimator = this.f32295a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f32295a.cancel();
            }
            j(getChildAt(i11), getChildAt(i11 + 1), f11);
        }

        public void i(int i11) {
            Rect bounds = TabLayout.this.f32266o.getBounds();
            TabLayout.this.f32266o.setBounds(bounds.left, 0, bounds.right, i11);
            requestLayout();
        }

        public final void j(View view, View view2, float f11) {
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = TabLayout.this.f32266o;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f32266o.getBounds().bottom);
            } else {
                com.google.android.material.tabs.a aVar = TabLayout.this.J;
                TabLayout tabLayout = TabLayout.this;
                aVar.d(tabLayout, view, view2, f11, tabLayout.f32266o);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }

        public final void k(boolean z11, int i11, int i12) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f32252a == i11) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i11);
            if (childAt2 == null) {
                g();
                return;
            }
            TabLayout.this.f32252a = i11;
            a aVar = new a(childAt, childAt2);
            if (!z11) {
                this.f32295a.removeAllUpdateListeners();
                this.f32295a.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f32295a = valueAnimator;
            valueAnimator.setInterpolator(TabLayout.this.K);
            valueAnimator.setDuration(i12);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.start();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
            super.onLayout(z11, i11, i12, i13, i14);
            ValueAnimator valueAnimator = this.f32295a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                e();
            } else {
                k(false, TabLayout.this.getSelectedTabPosition(), -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i11, int i12) {
            super.onMeasure(i11, i12);
            if (View.MeasureSpec.getMode(i11) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z11 = true;
            if (tabLayout.A == 1 || tabLayout.D == 2) {
                int childCount = getChildCount();
                int i13 = 0;
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = getChildAt(i14);
                    if (childAt.getVisibility() == 0) {
                        i13 = Math.max(i13, childAt.getMeasuredWidth());
                    }
                }
                if (i13 <= 0) {
                    return;
                }
                if (i13 * childCount <= getMeasuredWidth() - (((int) m0.i(getContext(), 16)) * 2)) {
                    boolean z12 = false;
                    for (int i15 = 0; i15 < childCount; i15++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i15).getLayoutParams();
                        if (layoutParams.width != i13 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i13;
                            layoutParams.weight = 0.0f;
                            z12 = true;
                        }
                    }
                    z11 = z12;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.A = 0;
                    tabLayout2.c0(false);
                }
                if (z11) {
                    super.onMeasure(i11, i12);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i11) {
            super.onRtlPropertiesChanged(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i {

        /* renamed from: k, reason: collision with root package name */
        public static final int f32301k = -1;

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        public Object f32302a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        public Drawable f32303b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        public CharSequence f32304c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        public CharSequence f32305d;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        public View f32307f;

        /* renamed from: h, reason: collision with root package name */
        @Nullable
        public TabLayout f32309h;

        /* renamed from: i, reason: collision with root package name */
        @NonNull
        public TabView f32310i;

        /* renamed from: e, reason: collision with root package name */
        public int f32306e = -1;

        /* renamed from: g, reason: collision with root package name */
        @d
        public int f32308g = 1;

        /* renamed from: j, reason: collision with root package name */
        public int f32311j = -1;

        @NonNull
        @uo.a
        public i A(@d int i11) {
            this.f32308g = i11;
            TabLayout tabLayout = this.f32309h;
            if (tabLayout.A == 1 || tabLayout.D == 2) {
                tabLayout.c0(true);
            }
            E();
            if (com.google.android.material.badge.b.f30581a && this.f32310i.o() && this.f32310i.f32282e.isVisible()) {
                this.f32310i.invalidate();
            }
            return this;
        }

        @NonNull
        @uo.a
        public i B(@Nullable Object obj) {
            this.f32302a = obj;
            return this;
        }

        @NonNull
        @uo.a
        public i C(@StringRes int i11) {
            TabLayout tabLayout = this.f32309h;
            if (tabLayout != null) {
                return D(tabLayout.getResources().getText(i11));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull
        @uo.a
        public i D(@Nullable CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f32305d) && !TextUtils.isEmpty(charSequence)) {
                this.f32310i.setContentDescription(charSequence);
            }
            this.f32304c = charSequence;
            E();
            return this;
        }

        public void E() {
            TabView tabView = this.f32310i;
            if (tabView != null) {
                tabView.x();
            }
        }

        @Nullable
        public com.google.android.material.badge.a e() {
            return this.f32310i.getBadge();
        }

        @Nullable
        public CharSequence f() {
            TabView tabView = this.f32310i;
            if (tabView == null) {
                return null;
            }
            return tabView.getContentDescription();
        }

        @Nullable
        public View g() {
            return this.f32307f;
        }

        @Nullable
        public Drawable h() {
            return this.f32303b;
        }

        public int i() {
            return this.f32311j;
        }

        @NonNull
        public com.google.android.material.badge.a j() {
            return this.f32310i.getOrCreateBadge();
        }

        public int k() {
            return this.f32306e;
        }

        @d
        public int l() {
            return this.f32308g;
        }

        @Nullable
        public Object m() {
            return this.f32302a;
        }

        @Nullable
        public CharSequence n() {
            return this.f32304c;
        }

        public boolean o() {
            TabLayout tabLayout = this.f32309h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            return selectedTabPosition != -1 && selectedTabPosition == this.f32306e;
        }

        public void p() {
            this.f32310i.r();
        }

        public void q() {
            this.f32309h = null;
            this.f32310i = null;
            this.f32302a = null;
            this.f32303b = null;
            this.f32311j = -1;
            this.f32304c = null;
            this.f32305d = null;
            this.f32306e = -1;
            this.f32307f = null;
        }

        public void r() {
            TabLayout tabLayout = this.f32309h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.R(this);
        }

        @NonNull
        @uo.a
        public i s(@StringRes int i11) {
            TabLayout tabLayout = this.f32309h;
            if (tabLayout != null) {
                return t(tabLayout.getResources().getText(i11));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull
        @uo.a
        public i t(@Nullable CharSequence charSequence) {
            this.f32305d = charSequence;
            E();
            return this;
        }

        @NonNull
        @uo.a
        public i u(@LayoutRes int i11) {
            return v(LayoutInflater.from(this.f32310i.getContext()).inflate(i11, (ViewGroup) this.f32310i, false));
        }

        @NonNull
        @uo.a
        public i v(@Nullable View view) {
            this.f32307f = view;
            E();
            return this;
        }

        @NonNull
        @uo.a
        public i w(@DrawableRes int i11) {
            TabLayout tabLayout = this.f32309h;
            if (tabLayout != null) {
                return x(AppCompatResources.getDrawable(tabLayout.getContext(), i11));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull
        @uo.a
        public i x(@Nullable Drawable drawable) {
            this.f32303b = drawable;
            TabLayout tabLayout = this.f32309h;
            if (tabLayout.A == 1 || tabLayout.D == 2) {
                tabLayout.c0(true);
            }
            E();
            if (com.google.android.material.badge.b.f30581a && this.f32310i.o() && this.f32310i.f32282e.isVisible()) {
                this.f32310i.invalidate();
            }
            return this;
        }

        @NonNull
        @uo.a
        public i y(int i11) {
            this.f32311j = i11;
            TabView tabView = this.f32310i;
            if (tabView != null) {
                tabView.setId(i11);
            }
            return this;
        }

        public void z(int i11) {
            this.f32306e = i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface j {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface k {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface l {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class m implements ViewPager.OnPageChangeListener {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public final WeakReference<TabLayout> f32312a;

        /* renamed from: b, reason: collision with root package name */
        public int f32313b;

        /* renamed from: c, reason: collision with root package name */
        public int f32314c;

        public m(TabLayout tabLayout) {
            this.f32312a = new WeakReference<>(tabLayout);
        }

        public void b() {
            this.f32314c = 0;
            this.f32313b = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i11) {
            this.f32313b = this.f32314c;
            this.f32314c = i11;
            TabLayout tabLayout = this.f32312a.get();
            if (tabLayout != null) {
                tabLayout.d0(this.f32314c);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i11, float f11, int i12) {
            boolean z11;
            TabLayout tabLayout = this.f32312a.get();
            if (tabLayout != null) {
                int i13 = this.f32314c;
                boolean z12 = true;
                if (i13 != 2 || this.f32313b == 1) {
                    z11 = true;
                } else {
                    z11 = true;
                    z12 = false;
                }
                if (i13 == 2 && this.f32313b == 0) {
                    z11 = false;
                }
                tabLayout.W(i11, f11, z12, z11, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i11) {
            TabLayout tabLayout = this.f32312a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i11 || i11 >= tabLayout.getTabCount()) {
                return;
            }
            int i12 = this.f32314c;
            tabLayout.S(tabLayout.D(i11), i12 == 0 || (i12 == 2 && this.f32313b == 0));
        }
    }

    public TabLayout(@NonNull Context context) {
        this(context, null);
    }

    @Dimension(unit = 0)
    private int getDefaultHeight() {
        int size = this.f32253b.size();
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = this.f32253b.get(i11);
            if (iVar != null && iVar.h() != null && !TextUtils.isEmpty(iVar.n())) {
                return !this.E ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i11 = this.f32274w;
        if (i11 != -1) {
            return i11;
        }
        int i12 = this.D;
        if (i12 == 0 || i12 == 2) {
            return this.f32276y;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f32255d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i11) {
        int childCount = this.f32255d.getChildCount();
        if (i11 < childCount) {
            int i12 = 0;
            while (i12 < childCount) {
                View childAt = this.f32255d.getChildAt(i12);
                if ((i12 != i11 || childAt.isSelected()) && (i12 == i11 || !childAt.isSelected())) {
                    childAt.setSelected(i12 == i11);
                    childAt.setActivated(i12 == i11);
                } else {
                    childAt.setSelected(i12 == i11);
                    childAt.setActivated(i12 == i11);
                    if (childAt instanceof TabView) {
                        ((TabView) childAt).A();
                    }
                }
                i12++;
            }
        }
    }

    @NonNull
    public static ColorStateList v(int i11, int i12) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i12, i11});
    }

    public final void A(@NonNull i iVar) {
        for (int size = this.M.size() - 1; size >= 0; size--) {
            this.M.get(size).onTabSelected(iVar);
        }
    }

    public final void B(@NonNull i iVar) {
        for (int size = this.M.size() - 1; size >= 0; size--) {
            this.M.get(size).onTabUnselected(iVar);
        }
    }

    public final void C() {
        if (this.O == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.O = valueAnimator;
            valueAnimator.setInterpolator(this.K);
            this.O.setDuration(this.B);
            this.O.addUpdateListener(new a());
        }
    }

    @Nullable
    public i D(int i11) {
        if (i11 < 0 || i11 >= getTabCount()) {
            return null;
        }
        return this.f32253b.get(i11);
    }

    public boolean E() {
        return this.I;
    }

    public boolean F() {
        return this.E;
    }

    public final boolean G() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    public boolean H() {
        return this.F;
    }

    @NonNull
    public i I() {
        i x11 = x();
        x11.f32309h = this;
        x11.f32310i = y(x11);
        if (x11.f32311j != -1) {
            x11.f32310i.setId(x11.f32311j);
        }
        return x11;
    }

    public void J() {
        int currentItem;
        L();
        PagerAdapter pagerAdapter = this.Q;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i11 = 0; i11 < count; i11++) {
                l(I().D(this.Q.getPageTitle(i11)), false);
            }
            ViewPager viewPager = this.P;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            R(D(currentItem));
        }
    }

    public boolean K(i iVar) {
        return f32240o1.release(iVar);
    }

    public void L() {
        for (int childCount = this.f32255d.getChildCount() - 1; childCount >= 0; childCount--) {
            Q(childCount);
        }
        Iterator<i> it = this.f32253b.iterator();
        while (it.hasNext()) {
            i next = it.next();
            it.remove();
            next.q();
            K(next);
        }
        this.f32254c = null;
    }

    @Deprecated
    public void M(@Nullable c cVar) {
        this.M.remove(cVar);
    }

    public void N(@NonNull f fVar) {
        M(fVar);
    }

    public void O(@NonNull i iVar) {
        if (iVar.f32309h != this) {
            throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
        }
        P(iVar.k());
    }

    public void P(int i11) {
        i iVar = this.f32254c;
        int k11 = iVar != null ? iVar.k() : 0;
        Q(i11);
        i remove = this.f32253b.remove(i11);
        if (remove != null) {
            remove.q();
            K(remove);
        }
        int size = this.f32253b.size();
        int i12 = -1;
        for (int i13 = i11; i13 < size; i13++) {
            if (this.f32253b.get(i13).k() == this.f32252a) {
                i12 = i13;
            }
            this.f32253b.get(i13).z(i13);
        }
        this.f32252a = i12;
        if (k11 == i11) {
            R(this.f32253b.isEmpty() ? null : this.f32253b.get(Math.max(0, i11 - 1)));
        }
    }

    public final void Q(int i11) {
        TabView tabView = (TabView) this.f32255d.getChildAt(i11);
        this.f32255d.removeViewAt(i11);
        if (tabView != null) {
            tabView.s();
            this.W.release(tabView);
        }
        requestLayout();
    }

    public void R(@Nullable i iVar) {
        S(iVar, true);
    }

    public void S(@Nullable i iVar, boolean z11) {
        i iVar2 = this.f32254c;
        if (iVar2 == iVar) {
            if (iVar2 != null) {
                z(iVar);
                p(iVar.k());
                return;
            }
            return;
        }
        int k11 = iVar != null ? iVar.k() : -1;
        if (z11) {
            if ((iVar2 == null || iVar2.k() == -1) && k11 != -1) {
                U(k11, 0.0f, true);
            } else {
                p(k11);
            }
            if (k11 != -1) {
                setSelectedTabView(k11);
            }
        }
        this.f32254c = iVar;
        if (iVar2 != null && iVar2.f32309h != null) {
            B(iVar2);
        }
        if (iVar != null) {
            A(iVar);
        }
    }

    public void T(@Nullable PagerAdapter pagerAdapter, boolean z11) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.Q;
        if (pagerAdapter2 != null && (dataSetObserver = this.R) != null) {
            pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.Q = pagerAdapter;
        if (z11 && pagerAdapter != null) {
            if (this.R == null) {
                this.R = new g();
            }
            pagerAdapter.registerDataSetObserver(this.R);
        }
        J();
    }

    public void U(int i11, float f11, boolean z11) {
        V(i11, f11, z11, true);
    }

    public void V(int i11, float f11, boolean z11, boolean z12) {
        W(i11, f11, z11, z12, true);
    }

    public void W(int i11, float f11, boolean z11, boolean z12, boolean z13) {
        int round = Math.round(i11 + f11);
        if (round < 0 || round >= this.f32255d.getChildCount()) {
            return;
        }
        if (z12) {
            this.f32255d.h(i11, f11);
        }
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.O.cancel();
        }
        int s11 = s(i11, f11);
        int scrollX = getScrollX();
        boolean z14 = (i11 < getSelectedTabPosition() && s11 >= scrollX) || (i11 > getSelectedTabPosition() && s11 <= scrollX) || i11 == getSelectedTabPosition();
        if (ViewCompat.getLayoutDirection(this) == 1) {
            z14 = (i11 < getSelectedTabPosition() && s11 <= scrollX) || (i11 > getSelectedTabPosition() && s11 >= scrollX) || i11 == getSelectedTabPosition();
        }
        if (z14 || this.V == 1 || z13) {
            if (i11 < 0) {
                s11 = 0;
            }
            scrollTo(s11, 0);
        }
        if (z11) {
            setSelectedTabView(round);
        }
    }

    public void X(int i11, int i12) {
        setTabTextColors(v(i11, i12));
    }

    public void Y(@Nullable ViewPager viewPager, boolean z11) {
        Z(viewPager, z11, false);
    }

    public final void Z(@Nullable ViewPager viewPager, boolean z11, boolean z12) {
        ViewPager viewPager2 = this.P;
        if (viewPager2 != null) {
            m mVar = this.S;
            if (mVar != null) {
                viewPager2.removeOnPageChangeListener(mVar);
            }
            b bVar = this.T;
            if (bVar != null) {
                this.P.removeOnAdapterChangeListener(bVar);
            }
        }
        c cVar = this.N;
        if (cVar != null) {
            M(cVar);
            this.N = null;
        }
        if (viewPager != null) {
            this.P = viewPager;
            if (this.S == null) {
                this.S = new m(this);
            }
            this.S.b();
            viewPager.addOnPageChangeListener(this.S);
            n nVar = new n(viewPager);
            this.N = nVar;
            g(nVar);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                T(adapter, z11);
            }
            if (this.T == null) {
                this.T = new b();
            }
            this.T.a(z11);
            viewPager.addOnAdapterChangeListener(this.T);
            U(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.P = null;
            T(null, false);
        }
        this.U = z12;
    }

    public final void a0() {
        int size = this.f32253b.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f32253b.get(i11).E();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        o(view);
    }

    public final void b0(@NonNull LinearLayout.LayoutParams layoutParams) {
        if (this.D == 1 && this.A == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    public void c0(boolean z11) {
        for (int i11 = 0; i11 < this.f32255d.getChildCount(); i11++) {
            View childAt = this.f32255d.getChildAt(i11);
            childAt.setMinimumWidth(getTabMinWidth());
            b0((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z11) {
                childAt.requestLayout();
            }
        }
    }

    public void d0(int i11) {
        this.V = i11;
    }

    @Deprecated
    public void g(@Nullable c cVar) {
        if (this.M.contains(cVar)) {
            return;
        }
        this.M.add(cVar);
    }

    public int getSelectedTabPosition() {
        i iVar = this.f32254c;
        if (iVar != null) {
            return iVar.k();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f32253b.size();
    }

    public int getTabGravity() {
        return this.A;
    }

    @Nullable
    public ColorStateList getTabIconTint() {
        return this.f32264m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.H;
    }

    public int getTabIndicatorGravity() {
        return this.C;
    }

    public int getTabMaxWidth() {
        return this.f32273v;
    }

    public int getTabMode() {
        return this.D;
    }

    @Nullable
    public ColorStateList getTabRippleColor() {
        return this.f32265n;
    }

    @NonNull
    public Drawable getTabSelectedIndicator() {
        return this.f32266o;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.f32263l;
    }

    public void h(@NonNull f fVar) {
        g(fVar);
    }

    public void i(@NonNull i iVar) {
        l(iVar, this.f32253b.isEmpty());
    }

    public void j(@NonNull i iVar, int i11) {
        k(iVar, i11, this.f32253b.isEmpty());
    }

    public void k(@NonNull i iVar, int i11, boolean z11) {
        if (iVar.f32309h != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        u(iVar, i11);
        n(iVar);
        if (z11) {
            iVar.r();
        }
    }

    public void l(@NonNull i iVar, boolean z11) {
        k(iVar, this.f32253b.size(), z11);
    }

    public final void m(@NonNull TabItem tabItem) {
        i I = I();
        CharSequence charSequence = tabItem.f32228a;
        if (charSequence != null) {
            I.D(charSequence);
        }
        Drawable drawable = tabItem.f32229b;
        if (drawable != null) {
            I.x(drawable);
        }
        int i11 = tabItem.f32230c;
        if (i11 != 0) {
            I.u(i11);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            I.t(tabItem.getContentDescription());
        }
        i(I);
    }

    public final void n(@NonNull i iVar) {
        TabView tabView = iVar.f32310i;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.f32255d.addView(tabView, iVar.k(), w());
    }

    public final void o(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        m((TabItem) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vn.l.e(this);
        if (this.P == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                Z((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.U) {
            setupWithViewPager(null);
            this.U = false;
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        for (int i11 = 0; i11 < this.f32255d.getChildCount(); i11++) {
            View childAt = this.f32255d.getChildAt(i11);
            if (childAt instanceof TabView) {
                ((TabView) childAt).m(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return G() && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        int round = Math.round(m0.i(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i12);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i12 = View.MeasureSpec.makeMeasureSpec(round + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i12) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i11);
        if (View.MeasureSpec.getMode(i11) != 0) {
            int i13 = this.f32275x;
            if (i13 <= 0) {
                i13 = (int) (size - m0.i(getContext(), 56));
            }
            this.f32273v = i13;
        }
        super.onMeasure(i11, i12);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i14 = this.D;
            if (i14 != 0) {
                if (i14 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
                }
                if (i14 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || G()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void p(int i11) {
        if (i11 == -1) {
            return;
        }
        if (getWindowToken() == null || !ViewCompat.isLaidOut(this) || this.f32255d.d()) {
            U(i11, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int s11 = s(i11, 0.0f);
        if (scrollX != s11) {
            C();
            this.O.setIntValues(scrollX, s11);
            this.O.start();
        }
        this.f32255d.c(i11, this.B);
    }

    public final void q(int i11) {
        if (i11 == 0) {
            Log.w(f32241p1, "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i11 == 1) {
            this.f32255d.setGravity(1);
            return;
        } else if (i11 != 2) {
            return;
        }
        this.f32255d.setGravity(GravityCompat.START);
    }

    public final void r() {
        int i11 = this.D;
        ViewCompat.setPaddingRelative(this.f32255d, (i11 == 0 || i11 == 2) ? Math.max(0, this.f32277z - this.f32256e) : 0, 0, 0, 0);
        int i12 = this.D;
        if (i12 == 0) {
            q(this.A);
        } else if (i12 == 1 || i12 == 2) {
            if (this.A == 2) {
                Log.w(f32241p1, "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f32255d.setGravity(1);
        }
        c0(true);
    }

    public final int s(int i11, float f11) {
        View childAt;
        int i12 = this.D;
        if ((i12 != 0 && i12 != 2) || (childAt = this.f32255d.getChildAt(i11)) == null) {
            return 0;
        }
        int i13 = i11 + 1;
        View childAt2 = i13 < this.f32255d.getChildCount() ? this.f32255d.getChildAt(i13) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i14 = (int) ((width + width2) * 0.5f * f11);
        return ViewCompat.getLayoutDirection(this) == 0 ? left + i14 : left - i14;
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f11) {
        super.setElevation(f11);
        vn.l.d(this, f11);
    }

    public void setInlineLabel(boolean z11) {
        if (this.E != z11) {
            this.E = z11;
            for (int i11 = 0; i11 < this.f32255d.getChildCount(); i11++) {
                View childAt = this.f32255d.getChildAt(i11);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).z();
                }
            }
            r();
        }
    }

    public void setInlineLabelResource(@BoolRes int i11) {
        setInlineLabel(getResources().getBoolean(i11));
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable f fVar) {
        setOnTabSelectedListener((c) fVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        C();
        this.O.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(@Nullable Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = DrawableCompat.wrap(drawable).mutate();
        this.f32266o = mutate;
        kn.d.n(mutate, this.f32267p);
        int i11 = this.G;
        if (i11 == -1) {
            i11 = this.f32266o.getIntrinsicHeight();
        }
        this.f32255d.i(i11);
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i11) {
        this.f32267p = i11;
        kn.d.n(this.f32266o, i11);
        c0(false);
    }

    public void setSelectedTabIndicatorGravity(int i11) {
        if (this.C != i11) {
            this.C = i11;
            ViewCompat.postInvalidateOnAnimation(this.f32255d);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i11) {
        this.G = i11;
        this.f32255d.i(i11);
    }

    public void setTabGravity(int i11) {
        if (this.A != i11) {
            this.A = i11;
            r();
        }
    }

    public void setTabIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f32264m != colorStateList) {
            this.f32264m = colorStateList;
            a0();
        }
    }

    public void setTabIconTintResource(@ColorRes int i11) {
        setTabIconTint(AppCompatResources.getColorStateList(getContext(), i11));
    }

    public void setTabIndicatorAnimationMode(int i11) {
        this.H = i11;
        if (i11 == 0) {
            this.J = new com.google.android.material.tabs.a();
            return;
        }
        if (i11 == 1) {
            this.J = new yn.a();
        } else {
            if (i11 == 2) {
                this.J = new yn.b();
                return;
            }
            throw new IllegalArgumentException(i11 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z11) {
        this.F = z11;
        this.f32255d.g();
        ViewCompat.postInvalidateOnAnimation(this.f32255d);
    }

    public void setTabMode(int i11) {
        if (i11 != this.D) {
            this.D = i11;
            r();
        }
    }

    public void setTabRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f32265n != colorStateList) {
            this.f32265n = colorStateList;
            for (int i11 = 0; i11 < this.f32255d.getChildCount(); i11++) {
                View childAt = this.f32255d.getChildAt(i11);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).y(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(@ColorRes int i11) {
        setTabRippleColor(AppCompatResources.getColorStateList(getContext(), i11));
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.f32263l != colorStateList) {
            this.f32263l = colorStateList;
            a0();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable PagerAdapter pagerAdapter) {
        T(pagerAdapter, false);
    }

    public void setUnboundedRipple(boolean z11) {
        if (this.I != z11) {
            this.I = z11;
            for (int i11 = 0; i11 < this.f32255d.getChildCount(); i11++) {
                View childAt = this.f32255d.getChildAt(i11);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).y(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(@BoolRes int i11) {
        setUnboundedRipple(getResources().getBoolean(i11));
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        Y(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public void t() {
        this.M.clear();
    }

    public final void u(@NonNull i iVar, int i11) {
        iVar.z(i11);
        this.f32253b.add(i11, iVar);
        int size = this.f32253b.size();
        int i12 = -1;
        for (int i13 = i11 + 1; i13 < size; i13++) {
            if (this.f32253b.get(i13).k() == this.f32252a) {
                i12 = i13;
            }
            this.f32253b.get(i13).z(i13);
        }
        this.f32252a = i12;
    }

    @NonNull
    public final LinearLayout.LayoutParams w() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        b0(layoutParams);
        return layoutParams;
    }

    public i x() {
        i acquire = f32240o1.acquire();
        return acquire == null ? new i() : acquire;
    }

    @NonNull
    public final TabView y(@NonNull i iVar) {
        Pools.Pool<TabView> pool = this.W;
        TabView acquire = pool != null ? pool.acquire() : null;
        if (acquire == null) {
            acquire = new TabView(getContext());
        }
        acquire.setTab(iVar);
        acquire.setFocusable(true);
        acquire.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(iVar.f32305d)) {
            acquire.setContentDescription(iVar.f32304c);
            return acquire;
        }
        acquire.setContentDescription(iVar.f32305d);
        return acquire;
    }

    public final void z(@NonNull i iVar) {
        for (int size = this.M.size() - 1; size >= 0; size--) {
            this.M.get(size).onTabReselected(iVar);
        }
    }

    public TabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i11) {
        o(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable c cVar) {
        c cVar2 = this.L;
        if (cVar2 != null) {
            M(cVar2);
        }
        this.L = cVar;
        if (cVar != null) {
            g(cVar);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TabLayout(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.Nullable android.util.AttributeSet r11, int r12) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        o(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        o(view);
    }

    public void setSelectedTabIndicator(@DrawableRes int i11) {
        if (i11 != 0) {
            setSelectedTabIndicator(AppCompatResources.getDrawable(getContext(), i11));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class n implements f {

        /* renamed from: a, reason: collision with root package name */
        public final ViewPager f32315a;

        public n(ViewPager viewPager) {
            this.f32315a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabSelected(@NonNull i iVar) {
            this.f32315a.setCurrentItem(iVar.k());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabReselected(i iVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabUnselected(i iVar) {
        }
    }
}
