package com.aurelhubert.ahbottomnavigation;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;
import com.aurelhubert.ahbottomnavigation.notification.AHNotification;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import zb.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class AHBottomNavigation extends FrameLayout {

    /* renamed from: l1, reason: collision with root package name */
    public static final int f11234l1 = -1;

    /* renamed from: m1, reason: collision with root package name */
    public static final int f11235m1 = -1;

    /* renamed from: n1, reason: collision with root package name */
    public static String f11236n1 = "AHBottomNavigation";

    /* renamed from: o1, reason: collision with root package name */
    public static final String f11237o1 = "The position (%d) is out of bounds of the items (%d elements)";

    /* renamed from: p1, reason: collision with root package name */
    public static final int f11238p1 = 3;

    /* renamed from: q1, reason: collision with root package name */
    public static final int f11239q1 = 5;

    @ColorInt
    public int A;

    @ColorInt
    public int B;

    @ColorInt
    public int C;

    @ColorInt
    public int D;

    @ColorInt
    public int E;

    @ColorInt
    public int F;
    public float G;
    public float H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public float Q;
    public float R;
    public boolean S;
    public TitleState T;

    @ColorInt
    public int U;

    @ColorInt
    public int V;
    public Drawable W;

    /* renamed from: a, reason: collision with root package name */
    public g f11240a;

    /* renamed from: b, reason: collision with root package name */
    public f f11241b;

    /* renamed from: c, reason: collision with root package name */
    public Context f11242c;

    /* renamed from: d, reason: collision with root package name */
    public Resources f11243d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<com.aurelhubert.ahbottomnavigation.a> f11244e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList<View> f11245f;

    /* renamed from: f0, reason: collision with root package name */
    public Typeface f11246f0;

    /* renamed from: f1, reason: collision with root package name */
    public int f11247f1;

    /* renamed from: g, reason: collision with root package name */
    public AHBottomNavigationBehavior<AHBottomNavigation> f11248g;

    /* renamed from: h, reason: collision with root package name */
    public LinearLayout f11249h;

    /* renamed from: h1, reason: collision with root package name */
    public int f11250h1;

    /* renamed from: i, reason: collision with root package name */
    public View f11251i;

    /* renamed from: i1, reason: collision with root package name */
    public int f11252i1;

    /* renamed from: j, reason: collision with root package name */
    public Animator f11253j;

    /* renamed from: j1, reason: collision with root package name */
    public int f11254j1;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11255k;

    /* renamed from: k1, reason: collision with root package name */
    public long f11256k1;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11257l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11258m;

    /* renamed from: n, reason: collision with root package name */
    public List<AHNotification> f11259n;

    /* renamed from: o, reason: collision with root package name */
    public Boolean[] f11260o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11261p;

    /* renamed from: q, reason: collision with root package name */
    public int f11262q;

    /* renamed from: r, reason: collision with root package name */
    public int f11263r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f11264s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f11265t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f11266u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f11267v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f11268w;

    /* renamed from: x, reason: collision with root package name */
    public int f11269x;

    /* renamed from: y, reason: collision with root package name */
    public int f11270y;

    /* renamed from: z, reason: collision with root package name */
    @ColorInt
    public int f11271z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum TitleState {
        SHOW_WHEN_ACTIVE,
        SHOW_WHEN_ACTIVE_FORCE,
        ALWAYS_SHOW,
        ALWAYS_HIDE
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AHBottomNavigation.this.requestLayout();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f11273a;

        public b(final int val$itemIndex) {
            this.f11273a = val$itemIndex;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            AHBottomNavigation.this.B(this.f11273a);
            AHBottomNavigation.this.S(this.f11273a, true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f11275a;

        public c(final int val$itemIndex) {
            this.f11275a = val$itemIndex;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            AHBottomNavigation.this.B(this.f11275a);
            AHBottomNavigation.this.U(this.f11275a, true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface f {
        void a(int y11);
    }

    public AHBottomNavigation(Context context) {
        super(context);
        this.f11244e = new ArrayList<>();
        this.f11245f = new ArrayList<>();
        this.f11255k = false;
        this.f11257l = false;
        this.f11259n = AHNotification.e(5);
        Boolean bool = Boolean.TRUE;
        this.f11260o = new Boolean[]{bool, bool, bool, bool, bool};
        this.f11261p = false;
        this.f11262q = 0;
        this.f11263r = 0;
        this.f11264s = true;
        this.f11265t = false;
        this.f11266u = false;
        this.f11267v = true;
        this.f11269x = -1;
        this.f11270y = 0;
        this.L = 0;
        this.P = 0;
        this.S = false;
        this.T = TitleState.SHOW_WHEN_ACTIVE;
        t(context, null);
    }

    public void A(FloatingActionButton fab) {
        if (fab.getParent() instanceof CoordinatorLayout) {
            ((CoordinatorLayout.LayoutParams) fab.getLayoutParams()).setBehavior(new AHBottomNavigationFABBehavior(this.L));
        }
    }

    public final void B(int index) {
        g gVar;
        if (this.f11262q == index || (gVar = this.f11240a) == null) {
            return;
        }
        gVar.K(index);
    }

    public void C() {
        k();
    }

    public void D() {
        this.f11244e.clear();
        k();
    }

    public void E(int index) {
        if (index < this.f11244e.size()) {
            this.f11244e.remove(index);
            k();
        }
    }

    public void F() {
        this.f11241b = null;
        AHBottomNavigationBehavior<AHBottomNavigation> aHBottomNavigationBehavior = this.f11248g;
        if (aHBottomNavigationBehavior != null) {
            aHBottomNavigationBehavior.z();
        }
    }

    public void G() {
        this.f11240a = null;
    }

    public void H() {
        I(true);
    }

    public void I(boolean withAnimation) {
        AHBottomNavigationBehavior<AHBottomNavigation> aHBottomNavigationBehavior = this.f11248g;
        if (aHBottomNavigationBehavior != null) {
            aHBottomNavigationBehavior.A(this, withAnimation);
        } else {
            ViewCompat.animate(this).translationY(0.0f).setInterpolator(new LinearOutSlowInInterpolator()).setDuration(withAnimation ? 300L : 0L).start();
        }
    }

    public void J(@ColorInt int colorActive, @ColorInt int colorInactive) {
        this.E = colorActive;
        this.F = colorInactive;
        k();
    }

    public void K(int position, boolean useCallback) {
        if (position >= this.f11244e.size()) {
            Log.w(f11236n1, "The position is out of bounds of the items (" + this.f11244e.size() + " elements)");
            return;
        }
        if (this.T == TitleState.ALWAYS_HIDE || !(this.f11244e.size() == 3 || this.T == TitleState.ALWAYS_SHOW)) {
            U(position, useCallback);
        } else {
            S(position, useCallback);
        }
    }

    @Deprecated
    public void L(int nbNotification, int itemPosition) {
        if (itemPosition < 0 || itemPosition > this.f11244e.size() - 1) {
            throw new IndexOutOfBoundsException(String.format(Locale.US, f11237o1, Integer.valueOf(itemPosition), Integer.valueOf(this.f11244e.size())));
        }
        this.f11259n.set(itemPosition, AHNotification.l(nbNotification == 0 ? "" : String.valueOf(nbNotification)));
        T(false, itemPosition);
    }

    public void M(AHNotification notification, int itemPosition) {
        if (itemPosition < 0 || itemPosition > this.f11244e.size() - 1) {
            throw new IndexOutOfBoundsException(String.format(Locale.US, f11237o1, Integer.valueOf(itemPosition), Integer.valueOf(this.f11244e.size())));
        }
        if (notification == null) {
            notification = new AHNotification();
        }
        this.f11259n.set(itemPosition, notification);
        T(true, itemPosition);
    }

    public void N(String title, int itemPosition) {
        if (itemPosition < 0 || itemPosition > this.f11244e.size() - 1) {
            throw new IndexOutOfBoundsException(String.format(Locale.US, f11237o1, Integer.valueOf(itemPosition), Integer.valueOf(this.f11244e.size())));
        }
        this.f11259n.set(itemPosition, AHNotification.l(title));
        T(false, itemPosition);
    }

    public void O(int activeMargin, int inactiveMargin) {
        this.f11247f1 = activeMargin;
        this.f11250h1 = inactiveMargin;
        k();
    }

    public void P(float activeSize, float inactiveSize) {
        this.G = activeSize;
        this.H = inactiveSize;
        k();
    }

    public void Q(float activeSize, float inactiveSize) {
        this.G = TypedValue.applyDimension(2, activeSize, this.f11243d.getDisplayMetrics());
        this.H = TypedValue.applyDimension(2, inactiveSize, this.f11243d.getDisplayMetrics());
        k();
    }

    public void R(boolean useElevation, float elevation) {
        if (!useElevation) {
            elevation = 0.0f;
        }
        ViewCompat.setElevation(this, elevation);
        setClipToPadding(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S(final int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aurelhubert.ahbottomnavigation.AHBottomNavigation.S(int, boolean):void");
    }

    public final void T(boolean updateStyle, int itemPosition) {
        for (int i11 = 0; i11 < this.f11245f.size() && i11 < this.f11259n.size(); i11++) {
            if (itemPosition == -1 || itemPosition == i11) {
                AHNotification aHNotification = this.f11259n.get(i11);
                boolean h11 = aHNotification.h();
                int b11 = p1.a.b(aHNotification, this.U);
                int a11 = p1.a.a(aHNotification, this.V);
                TextView textView = (TextView) this.f11245f.get(i11).findViewById(R.id.bottom_navigation_notification);
                boolean equals = textView.getText().toString().equals(String.valueOf(aHNotification.i()));
                if (updateStyle) {
                    textView.setTextColor(b11);
                    Typeface typeface = this.f11246f0;
                    if (typeface != null) {
                        textView.setTypeface(typeface);
                    } else {
                        textView.setTypeface(null, 1);
                    }
                    Drawable drawable = this.W;
                    if (drawable != null) {
                        textView.setBackground(drawable.getConstantState().newDrawable());
                    } else if (a11 != 0) {
                        textView.setBackground(o1.b.b(ContextCompat.getDrawable(this.f11242c, R.drawable.notification_background), a11, this.S));
                    }
                }
                textView.setTextSize(0, h11 ? 0.0f : getResources().getDimension(R.dimen.bottom_navigation_notification_text_size));
                if (aHNotification.k() && textView.getText().length() > 0) {
                    textView.setText("");
                    if (!equals) {
                        textView.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setInterpolator(new AccelerateInterpolator()).setDuration(this.f11256k1).start();
                    }
                } else if (!aHNotification.k()) {
                    textView.setText(String.valueOf(aHNotification.i()));
                    if (!equals) {
                        textView.setScaleX(0.0f);
                        textView.setScaleY(0.0f);
                        textView.animate().scaleX(h11 ? 0.5f : 1.0f).scaleY(h11 ? 0.5f : 1.0f).alpha(1.0f).setInterpolator(new OvershootInterpolator()).setDuration(this.f11256k1).start();
                    }
                }
            }
        }
    }

    public final void U(final int itemIndex, boolean useCallback) {
        if (this.f11262q == itemIndex) {
            g gVar = this.f11240a;
            if (gVar == null || !useCallback) {
                return;
            }
            gVar.r(itemIndex, true);
            return;
        }
        g gVar2 = this.f11240a;
        if (gVar2 == null || !useCallback || gVar2.r(itemIndex, false)) {
            int dimension = (int) this.f11243d.getDimension(R.dimen.bottom_navigation_small_margin_top_active);
            int dimension2 = (int) this.f11243d.getDimension(R.dimen.bottom_navigation_small_margin_top);
            int i11 = 0;
            while (i11 < this.f11245f.size()) {
                View view = this.f11245f.get(i11);
                if (this.f11257l) {
                    view.setSelected(i11 == itemIndex);
                }
                if (i11 == itemIndex) {
                    FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.bottom_navigation_small_container);
                    TextView textView = (TextView) view.findViewById(R.id.bottom_navigation_small_item_title);
                    ImageView imageView = (ImageView) view.findViewById(R.id.bottom_navigation_small_item_icon);
                    TextView textView2 = (TextView) view.findViewById(R.id.bottom_navigation_notification);
                    imageView.setSelected(true);
                    if (this.T != TitleState.ALWAYS_HIDE) {
                        o1.b.k(imageView, dimension2, dimension);
                        o1.b.h(textView2, this.f11250h1, this.f11247f1);
                        o1.b.k(textView2, this.f11254j1, this.f11252i1);
                        o1.b.i(textView, this.A, this.f11271z);
                        o1.b.m(frameLayout, this.R, this.Q);
                    }
                    o1.b.e(textView, 0.0f, 1.0f);
                    if (!this.f11244e.get(itemIndex).g()) {
                        o1.b.g(this.f11242c, this.f11244e.get(itemIndex).c(this.f11242c), imageView, this.A, this.f11271z, this.S);
                    }
                    if (this.f11255k) {
                        int max = Math.max(getWidth(), getHeight());
                        int x11 = ((int) this.f11245f.get(itemIndex).getX()) + (this.f11245f.get(itemIndex).getWidth() / 2);
                        int height = this.f11245f.get(itemIndex).getHeight() / 2;
                        Animator animator = this.f11253j;
                        if (animator != null && animator.isRunning()) {
                            this.f11253j.cancel();
                            setBackgroundColor(this.f11244e.get(itemIndex).b(this.f11242c));
                            this.f11251i.setBackgroundColor(0);
                        }
                        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.f11251i, x11, height, 0.0f, max);
                        this.f11253j = createCircularReveal;
                        createCircularReveal.setStartDelay(5L);
                        this.f11253j.addListener(new e(itemIndex));
                        this.f11253j.start();
                    } else {
                        int i12 = this.f11270y;
                        if (i12 != 0) {
                            setBackgroundResource(i12);
                        } else {
                            setBackgroundColor(this.f11269x);
                        }
                        this.f11251i.setBackgroundColor(0);
                    }
                } else if (i11 == this.f11262q) {
                    View findViewById = view.findViewById(R.id.bottom_navigation_small_container);
                    TextView textView3 = (TextView) view.findViewById(R.id.bottom_navigation_small_item_title);
                    ImageView imageView2 = (ImageView) view.findViewById(R.id.bottom_navigation_small_item_icon);
                    TextView textView4 = (TextView) view.findViewById(R.id.bottom_navigation_notification);
                    imageView2.setSelected(false);
                    if (this.T != TitleState.ALWAYS_HIDE) {
                        o1.b.k(imageView2, dimension, dimension2);
                        o1.b.h(textView4, this.f11247f1, this.f11250h1);
                        o1.b.k(textView4, this.f11252i1, this.f11254j1);
                        o1.b.i(textView3, this.f11271z, this.A);
                        o1.b.m(findViewById, this.Q, this.R);
                    }
                    o1.b.e(textView3, 1.0f, 0.0f);
                    if (!this.f11244e.get(itemIndex).g()) {
                        o1.b.g(this.f11242c, this.f11244e.get(this.f11262q).c(this.f11242c), imageView2, this.f11271z, this.A, this.S);
                    }
                }
                i11++;
            }
            this.f11262q = itemIndex;
            if (itemIndex > 0 && itemIndex < this.f11244e.size()) {
                this.f11263r = this.f11244e.get(this.f11262q).b(this.f11242c);
                return;
            }
            if (this.f11262q == -1) {
                int i13 = this.f11270y;
                if (i13 != 0) {
                    setBackgroundResource(i13);
                } else {
                    setBackgroundColor(this.f11269x);
                }
                this.f11251i.setBackgroundColor(0);
            }
        }
    }

    public void g(com.aurelhubert.ahbottomnavigation.a item) {
        if (this.f11244e.size() > 5) {
            Log.w(f11236n1, "The items list should not have more than 5 items");
        }
        this.f11244e.add(item);
        k();
    }

    public int getAccentColor() {
        return this.f11271z;
    }

    public int getCurrentItem() {
        return this.f11262q;
    }

    public int getDefaultBackgroundColor() {
        return this.f11269x;
    }

    public int getInactiveColor() {
        return this.A;
    }

    public int getItemsCount() {
        return this.f11244e.size();
    }

    public TitleState getTitleState() {
        return this.T;
    }

    public void h(List<com.aurelhubert.ahbottomnavigation.a> items) {
        if (items.size() > 5 || this.f11244e.size() + items.size() > 5) {
            Log.w(f11236n1, "The items list should not have more than 5 items");
        }
        this.f11244e.addAll(items);
        k();
    }

    @SuppressLint({"NewApi"})
    @TargetApi(21)
    public final int i(int layoutHeight) {
        if (!this.f11258m) {
            return layoutHeight;
        }
        int identifier = getResources().getIdentifier(b.C1392b.f102488k, "dimen", "android");
        if (identifier > 0) {
            this.L = this.f11243d.getDimensionPixelSize(identifier);
        }
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{android.R.attr.fitsSystemWindows, android.R.attr.windowTranslucentNavigation});
        obtainStyledAttributes.getBoolean(0, false);
        boolean z11 = obtainStyledAttributes.getBoolean(1, true);
        if (q() && z11) {
            layoutHeight += this.L;
        }
        obtainStyledAttributes.recycle();
        return layoutHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(android.widget.LinearLayout r21) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aurelhubert.ahbottomnavigation.AHBottomNavigation.j(android.widget.LinearLayout):void");
    }

    public final void k() {
        if (this.f11244e.size() < 3) {
            Log.w(f11236n1, "The items list should have at least 3 items");
        } else if (this.f11244e.size() > 5) {
            Log.w(f11236n1, "The items list should not have more than 5 items");
        }
        int i11 = this.K;
        removeAllViews();
        this.f11245f.clear();
        this.f11251i = new View(this.f11242c);
        addView(this.f11251i, new FrameLayout.LayoutParams(-1, i(i11)));
        this.I = i11;
        LinearLayout linearLayout = new LinearLayout(this.f11242c);
        this.f11249h = linearLayout;
        linearLayout.setOrientation(0);
        this.f11249h.setGravity(17);
        addView(this.f11249h, new FrameLayout.LayoutParams(-1, i11));
        TitleState titleState = this.T;
        if (titleState == TitleState.ALWAYS_HIDE || titleState == TitleState.SHOW_WHEN_ACTIVE_FORCE || !(this.f11244e.size() == 3 || this.T == TitleState.ALWAYS_SHOW)) {
            l(this.f11249h);
        } else {
            j(this.f11249h);
        }
        post(new a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean, int] */
    public final void l(LinearLayout linearLayout) {
        LayoutInflater layoutInflater = (LayoutInflater) this.f11242c.getSystemService("layout_inflater");
        float f11 = this.K;
        float dimension = this.f11243d.getDimension(R.dimen.bottom_navigation_small_inactive_min_width);
        float dimension2 = this.f11243d.getDimension(R.dimen.bottom_navigation_small_inactive_max_width);
        int width = getWidth();
        if (width == 0 || this.f11244e.size() == 0) {
            return;
        }
        float size = width / this.f11244e.size();
        if (size >= dimension) {
            dimension = size > dimension2 ? dimension2 : size;
        }
        int dimension3 = (int) this.f11243d.getDimension(R.dimen.bottom_navigation_small_margin_top_active);
        float dimension4 = this.f11243d.getDimension(R.dimen.bottom_navigation_small_selected_width_difference);
        this.Q = (this.f11244e.size() * dimension4) + dimension;
        float f12 = dimension - dimension4;
        this.R = f12;
        ?? r52 = 0;
        int i11 = 0;
        while (i11 < this.f11244e.size()) {
            com.aurelhubert.ahbottomnavigation.a aVar = this.f11244e.get(i11);
            View inflate = layoutInflater.inflate(R.layout.bottom_navigation_small_item, this, (boolean) r52);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.bottom_navigation_small_item_icon);
            TextView textView = (TextView) inflate.findViewById(R.id.bottom_navigation_small_item_title);
            TextView textView2 = (TextView) inflate.findViewById(R.id.bottom_navigation_notification);
            TextView textView3 = (TextView) inflate.findViewById(R.id.bottom_navigation_badge);
            imageView.setImageDrawable(aVar.c(this.f11242c));
            if (aVar.a() != null) {
                textView3.setVisibility(r52);
                textView3.setBackgroundResource(aVar.a().f11325b);
                textView3.setText(aVar.a().f11324a);
            } else {
                textView3.setVisibility(8);
            }
            TitleState titleState = this.T;
            TitleState titleState2 = TitleState.ALWAYS_HIDE;
            if (titleState != titleState2) {
                textView.setText(aVar.f(this.f11242c));
            }
            float f13 = this.G;
            if (f13 != 0.0f) {
                textView.setTextSize(r52, f13);
            }
            Typeface typeface = this.f11268w;
            if (typeface != null) {
                textView.setTypeface(typeface);
            }
            if (i11 == this.f11262q) {
                if (this.f11257l) {
                    inflate.setSelected(true);
                }
                imageView.setSelected(true);
                if (this.T != titleState2 && (inflate.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, dimension3, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                    int i12 = this.M;
                    marginLayoutParams.width = i12;
                    marginLayoutParams.height = i12;
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView2.getLayoutParams();
                    marginLayoutParams2.setMargins(this.f11247f1, this.f11252i1, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                    inflate.requestLayout();
                }
            } else {
                imageView.setSelected(r52);
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) textView2.getLayoutParams();
                marginLayoutParams3.setMargins(this.f11250h1, this.f11254j1, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
            }
            if (!this.f11255k) {
                int i13 = this.f11270y;
                if (i13 != 0) {
                    setBackgroundResource(i13);
                } else {
                    setBackgroundColor(this.f11269x);
                }
            } else if (i11 == this.f11262q) {
                setBackgroundColor(aVar.b(this.f11242c));
                this.f11263r = aVar.b(this.f11242c);
            }
            if (this.f11260o[i11].booleanValue()) {
                if (!this.f11244e.get(i11).g()) {
                    imageView.setImageDrawable(o1.b.b(this.f11244e.get(i11).c(this.f11242c), this.f11262q == i11 ? this.f11271z : this.A, this.S));
                }
                textView.setTextColor(this.f11262q == i11 ? this.f11271z : this.A);
                textView.setAlpha(this.f11262q == i11 ? 1.0f : 0.0f);
                inflate.setOnClickListener(new c(i11));
                inflate.setSoundEffectsEnabled(this.f11267v);
            } else {
                if (!this.f11244e.get(i11).g()) {
                    imageView.setImageDrawable(o1.b.b(this.f11244e.get(i11).c(this.f11242c), this.C, this.S));
                }
                textView.setTextColor(this.C);
                textView.setAlpha(0.0f);
            }
            int i14 = i11 == this.f11262q ? (int) this.Q : (int) f12;
            if (this.T == titleState2) {
                i14 = (int) (f12 * 1.16d);
            }
            linearLayout.addView(inflate, new FrameLayout.LayoutParams(i14, (int) f11));
            this.f11245f.add(inflate);
            i11++;
            r52 = 0;
        }
        T(true, -1);
    }

    public void m(int position) {
        if (position >= 0 && position <= this.f11244e.size() - 1) {
            this.f11260o[position] = Boolean.FALSE;
            k();
            return;
        }
        Log.w(f11236n1, "The position is out of bounds of the items (" + this.f11244e.size() + " elements)");
    }

    public void n(int position) {
        if (position >= 0 && position <= this.f11244e.size() - 1) {
            this.f11260o[position] = Boolean.TRUE;
            k();
            return;
        }
        Log.w(f11236n1, "The position is out of bounds of the items (" + this.f11244e.size() + " elements)");
    }

    public com.aurelhubert.ahbottomnavigation.a o(int position) {
        if (position >= 0 && position <= this.f11244e.size() - 1) {
            return this.f11244e.get(position);
        }
        Log.w(f11236n1, "The position is out of bounds of the items (" + this.f11244e.size() + " elements)");
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.f11261p) {
            return;
        }
        setBehaviorTranslationEnabled(this.f11264s);
        this.f11261p = true;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        if (state instanceof Bundle) {
            Bundle bundle = (Bundle) state;
            this.f11262q = bundle.getInt("current_item");
            this.f11259n = bundle.getParcelableArrayList("notifications");
            state = bundle.getParcelable("superState");
        }
        super.onRestoreInstanceState(state);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        bundle.putInt("current_item", this.f11262q);
        bundle.putParcelableArrayList("notifications", new ArrayList<>(this.f11259n));
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        k();
    }

    public View p(int position) {
        LinearLayout linearLayout = this.f11249h;
        if (linearLayout == null || position < 0 || position >= linearLayout.getChildCount()) {
            return null;
        }
        return this.f11249h.getChildAt(position);
    }

    @SuppressLint({"NewApi"})
    @TargetApi(21)
    public boolean q() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        int i11 = displayMetrics.heightPixels;
        int i12 = displayMetrics.widthPixels;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics2);
        return i12 > displayMetrics2.widthPixels || i11 > displayMetrics2.heightPixels;
    }

    public void r() {
        s(true);
    }

    public void s(boolean withAnimation) {
        AHBottomNavigationBehavior<AHBottomNavigation> aHBottomNavigationBehavior = this.f11248g;
        if (aHBottomNavigationBehavior != null) {
            aHBottomNavigationBehavior.x(this, this.I, withAnimation);
        } else if (!(getParent() instanceof CoordinatorLayout)) {
            ViewCompat.animate(this).translationY(this.I).setInterpolator(new LinearOutSlowInInterpolator()).setDuration(withAnimation ? 300L : 0L).start();
        } else {
            this.f11265t = true;
            this.f11266u = withAnimation;
        }
    }

    public void setAccentColor(int accentColor) {
        this.B = accentColor;
        this.f11271z = accentColor;
        k();
    }

    public void setBehaviorTranslationEnabled(boolean behaviorTranslationEnabled) {
        this.f11264s = behaviorTranslationEnabled;
        if (getParent() instanceof CoordinatorLayout) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            AHBottomNavigationBehavior<AHBottomNavigation> aHBottomNavigationBehavior = this.f11248g;
            if (aHBottomNavigationBehavior == null) {
                this.f11248g = new AHBottomNavigationBehavior<>(behaviorTranslationEnabled, this.L);
            } else {
                aHBottomNavigationBehavior.B(behaviorTranslationEnabled, this.L);
            }
            f fVar = this.f11241b;
            if (fVar != null) {
                this.f11248g.C(fVar);
            }
            ((CoordinatorLayout.LayoutParams) layoutParams).setBehavior(this.f11248g);
            if (this.f11265t) {
                this.f11265t = false;
                this.f11248g.x(this, this.I, this.f11266u);
            }
        }
    }

    public void setColored(boolean colored) {
        this.f11255k = colored;
        this.f11271z = colored ? this.E : this.B;
        this.A = colored ? this.F : this.D;
        k();
    }

    public void setCurrentItem(int position) {
        K(position, true);
    }

    public void setDefaultBackgroundColor(@ColorInt int defaultBackgroundColor) {
        this.f11269x = defaultBackgroundColor;
        k();
    }

    public void setDefaultBackgroundResource(@DrawableRes int defaultBackgroundResource) {
        this.f11270y = defaultBackgroundResource;
        k();
    }

    public void setForceTint(boolean forceTint) {
        this.S = forceTint;
        k();
    }

    public void setInactiveColor(int inactiveColor) {
        this.D = inactiveColor;
        this.A = inactiveColor;
        k();
    }

    public void setItemDisableColor(@ColorInt int itemDisableColor) {
        this.C = itemDisableColor;
    }

    public void setNotificationAnimationDuration(long notificationAnimationDuration) {
        this.f11256k1 = notificationAnimationDuration;
        T(true, -1);
    }

    public void setNotificationBackground(Drawable drawable) {
        this.W = drawable;
        T(true, -1);
    }

    public void setNotificationBackgroundColor(@ColorInt int color) {
        this.V = color;
        T(true, -1);
    }

    public void setNotificationBackgroundColorResource(@ColorRes int color) {
        this.V = ContextCompat.getColor(this.f11242c, color);
        T(true, -1);
    }

    public void setNotificationTextColor(@ColorInt int textColor) {
        this.U = textColor;
        T(true, -1);
    }

    public void setNotificationTextColorResource(@ColorRes int textColor) {
        this.U = ContextCompat.getColor(this.f11242c, textColor);
        T(true, -1);
    }

    public void setNotificationTypeface(Typeface typeface) {
        this.f11246f0 = typeface;
        T(true, -1);
    }

    public void setOnNavigationPositionListener(f navigationPositionListener) {
        this.f11241b = navigationPositionListener;
        AHBottomNavigationBehavior<AHBottomNavigation> aHBottomNavigationBehavior = this.f11248g;
        if (aHBottomNavigationBehavior != null) {
            aHBottomNavigationBehavior.C(navigationPositionListener);
        }
    }

    public void setOnTabSelectedListener(g tabSelectedListener) {
        this.f11240a = tabSelectedListener;
    }

    public void setSelectedBackgroundVisible(boolean visible) {
        this.f11257l = visible;
        k();
    }

    @Override // android.view.View
    public void setSoundEffectsEnabled(final boolean soundEffectsEnabled) {
        super.setSoundEffectsEnabled(soundEffectsEnabled);
        this.f11267v = soundEffectsEnabled;
    }

    public void setTitleState(TitleState titleState) {
        this.T = titleState;
        k();
    }

    public void setTitleTypeface(Typeface typeface) {
        this.f11268w = typeface;
        k();
    }

    public void setTranslucentNavigationEnabled(boolean translucentNavigationEnabled) {
        this.f11258m = translucentNavigationEnabled;
    }

    public void setUseElevation(boolean useElevation) {
        ViewCompat.setElevation(this, useElevation ? this.J : 0.0f);
        setClipToPadding(false);
    }

    public final void t(Context context, AttributeSet attrs) {
        this.f11242c = context;
        this.f11243d = context.getResources();
        int i11 = R.color.colorBottomNavigationAccent;
        this.B = ContextCompat.getColor(context, i11);
        int i12 = R.color.colorBottomNavigationInactive;
        this.D = ContextCompat.getColor(context, i12);
        int i13 = R.color.colorBottomNavigationDisable;
        this.C = ContextCompat.getColor(context, i13);
        int i14 = R.color.colorBottomNavigationActiveColored;
        this.E = ContextCompat.getColor(context, i14);
        int i15 = R.color.colorBottomNavigationInactiveColored;
        this.F = ContextCompat.getColor(context, i15);
        if (attrs != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.AHBottomNavigation, 0, 0);
            try {
                this.f11269x = obtainStyledAttributes.getColor(R.styleable.AHBottomNavigation_defaultBackground, -1);
                this.f11257l = obtainStyledAttributes.getBoolean(R.styleable.AHBottomNavigation_selectedBackgroundVisible, false);
                this.f11258m = obtainStyledAttributes.getBoolean(R.styleable.AHBottomNavigation_translucentNavigationEnabled, false);
                this.B = obtainStyledAttributes.getColor(R.styleable.AHBottomNavigation_accentColor, ContextCompat.getColor(context, i11));
                this.D = obtainStyledAttributes.getColor(R.styleable.AHBottomNavigation_inactiveColor, ContextCompat.getColor(context, i12));
                this.C = obtainStyledAttributes.getColor(R.styleable.AHBottomNavigation_disableColor, ContextCompat.getColor(context, i13));
                this.E = obtainStyledAttributes.getColor(R.styleable.AHBottomNavigation_coloredActive, ContextCompat.getColor(context, i14));
                this.F = obtainStyledAttributes.getColor(R.styleable.AHBottomNavigation_coloredInactive, ContextCompat.getColor(context, i15));
                this.f11255k = obtainStyledAttributes.getBoolean(R.styleable.AHBottomNavigation_colored, false);
                int i16 = obtainStyledAttributes.getInt(R.styleable.AHBottomNavigation_titleState, -1);
                if (i16 != -1) {
                    this.T = TitleState.values()[i16];
                    Log.d(f11236n1, "titleState: state -> " + this.T);
                }
                this.I = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AHBottomNavigation_navigationHeight, (int) this.f11243d.getDimension(R.dimen.bottom_navigation_height));
                this.K = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AHBottomNavigation_navigationContentHeight, (int) this.f11243d.getDimension(R.dimen.bottom_navigation_content_height));
                this.M = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AHBottomNavigation_navigationIconSize, (int) this.f11243d.getDimension(R.dimen.bottom_navigation_icon));
                this.N = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AHBottomNavigation_navigationMarginTopActive, (int) this.f11243d.getDimension(R.dimen.bottom_navigation_margin_top_active));
                this.O = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AHBottomNavigation_navigationMarginTopInactive, (int) this.f11243d.getDimension(R.dimen.bottom_navigation_margin_top_inactive));
                this.P = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AHBottomNavigation_navigationMarginBottom, (int) this.f11243d.getDimension(R.dimen.bottom_navigation_margin_bottom));
                obtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        }
        this.U = ContextCompat.getColor(context, android.R.color.white);
        this.f11271z = this.B;
        this.A = this.D;
        this.f11247f1 = (int) this.f11243d.getDimension(R.dimen.bottom_navigation_notification_margin_left_active);
        this.f11250h1 = (int) this.f11243d.getDimension(R.dimen.bottom_navigation_notification_margin_left);
        this.f11252i1 = (int) this.f11243d.getDimension(R.dimen.bottom_navigation_notification_margin_top_active);
        this.f11254j1 = (int) this.f11243d.getDimension(R.dimen.bottom_navigation_notification_margin_top);
        this.f11256k1 = 150L;
        ViewCompat.setElevation(this, this.J);
        setClipToPadding(false);
        setLayoutParams(new ViewGroup.LayoutParams(-1, this.I));
    }

    public boolean u() {
        return this.f11264s;
    }

    public final boolean v() {
        TitleState titleState = this.T;
        TitleState titleState2 = TitleState.ALWAYS_SHOW;
        if (titleState != titleState2) {
            return this.f11244e.size() <= 3 && this.T != titleState2;
        }
        return true;
    }

    public boolean w() {
        return this.f11255k;
    }

    public boolean x() {
        return this.S;
    }

    public boolean y() {
        AHBottomNavigationBehavior<AHBottomNavigation> aHBottomNavigationBehavior = this.f11248g;
        if (aHBottomNavigationBehavior != null) {
            return aHBottomNavigationBehavior.y();
        }
        return false;
    }

    public boolean z() {
        return this.f11258m;
    }

    public AHBottomNavigation(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f11244e = new ArrayList<>();
        this.f11245f = new ArrayList<>();
        this.f11255k = false;
        this.f11257l = false;
        this.f11259n = AHNotification.e(5);
        Boolean bool = Boolean.TRUE;
        this.f11260o = new Boolean[]{bool, bool, bool, bool, bool};
        this.f11261p = false;
        this.f11262q = 0;
        this.f11263r = 0;
        this.f11264s = true;
        this.f11265t = false;
        this.f11266u = false;
        this.f11267v = true;
        this.f11269x = -1;
        this.f11270y = 0;
        this.L = 0;
        this.P = 0;
        this.S = false;
        this.T = TitleState.SHOW_WHEN_ACTIVE;
        t(context, attrs);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f11277a;

        public d(final int val$itemIndex) {
            this.f11277a = val$itemIndex;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            AHBottomNavigation aHBottomNavigation = AHBottomNavigation.this;
            aHBottomNavigation.setBackgroundColor(((com.aurelhubert.ahbottomnavigation.a) aHBottomNavigation.f11244e.get(this.f11277a)).b(AHBottomNavigation.this.f11242c));
            AHBottomNavigation.this.f11251i.setBackgroundColor(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            AHBottomNavigation.this.f11251i.setBackgroundColor(((com.aurelhubert.ahbottomnavigation.a) AHBottomNavigation.this.f11244e.get(this.f11277a)).b(AHBottomNavigation.this.f11242c));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f11279a;

        public e(final int val$itemIndex) {
            this.f11279a = val$itemIndex;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            AHBottomNavigation aHBottomNavigation = AHBottomNavigation.this;
            aHBottomNavigation.setBackgroundColor(((com.aurelhubert.ahbottomnavigation.a) aHBottomNavigation.f11244e.get(this.f11279a)).b(AHBottomNavigation.this.f11242c));
            AHBottomNavigation.this.f11251i.setBackgroundColor(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            AHBottomNavigation.this.f11251i.setBackgroundColor(((com.aurelhubert.ahbottomnavigation.a) AHBottomNavigation.this.f11244e.get(this.f11279a)).b(AHBottomNavigation.this.f11242c));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface g {
        boolean r(int position, boolean wasSelected);

        default void K(int position) {
        }
    }

    public AHBottomNavigation(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f11244e = new ArrayList<>();
        this.f11245f = new ArrayList<>();
        this.f11255k = false;
        this.f11257l = false;
        this.f11259n = AHNotification.e(5);
        Boolean bool = Boolean.TRUE;
        this.f11260o = new Boolean[]{bool, bool, bool, bool, bool};
        this.f11261p = false;
        this.f11262q = 0;
        this.f11263r = 0;
        this.f11264s = true;
        this.f11265t = false;
        this.f11266u = false;
        this.f11267v = true;
        this.f11269x = -1;
        this.f11270y = 0;
        this.L = 0;
        this.P = 0;
        this.S = false;
        this.T = TitleState.SHOW_WHEN_ACTIVE;
        t(context, attrs);
    }
}
