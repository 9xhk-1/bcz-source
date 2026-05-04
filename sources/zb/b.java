package zb;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.media3.common.C;
import ct.d;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: h, reason: collision with root package name */
    public static final int f102478h = -1728053248;

    /* renamed from: i, reason: collision with root package name */
    public static String f102479i;

    /* renamed from: a, reason: collision with root package name */
    public final C1392b f102480a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f102481b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f102482c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f102483d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f102484e;

    /* renamed from: f, reason: collision with root package name */
    public View f102485f;

    /* renamed from: g, reason: collision with root package name */
    public View f102486g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: zb.b$b, reason: collision with other inner class name */
    public static class C1392b {

        /* renamed from: j, reason: collision with root package name */
        public static final String f102487j = "status_bar_height";

        /* renamed from: k, reason: collision with root package name */
        public static final String f102488k = "navigation_bar_height";

        /* renamed from: l, reason: collision with root package name */
        public static final String f102489l = "navigation_bar_height_landscape";

        /* renamed from: m, reason: collision with root package name */
        public static final String f102490m = "navigation_bar_width";

        /* renamed from: n, reason: collision with root package name */
        public static final String f102491n = "config_showNavigationBar";

        /* renamed from: a, reason: collision with root package name */
        public final boolean f102492a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f102493b;

        /* renamed from: c, reason: collision with root package name */
        public final int f102494c;

        /* renamed from: d, reason: collision with root package name */
        public final int f102495d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f102496e;

        /* renamed from: f, reason: collision with root package name */
        public final int f102497f;

        /* renamed from: g, reason: collision with root package name */
        public final int f102498g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f102499h;

        /* renamed from: i, reason: collision with root package name */
        public final float f102500i;

        public int a() {
            return this.f102495d;
        }

        @TargetApi(14)
        public final int b(Context context) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
            return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }

        public final int c(Resources res, String key) {
            int identifier = res.getIdentifier(key, "dimen", "android");
            if (identifier > 0) {
                return res.getDimensionPixelSize(identifier);
            }
            return 0;
        }

        public int d() {
            return this.f102497f;
        }

        @TargetApi(14)
        public final int e(Context context) {
            Resources resources = context.getResources();
            if (m(context)) {
                return c(resources, this.f102499h ? f102488k : f102489l);
            }
            return 0;
        }

        public int f() {
            return this.f102498g;
        }

        @TargetApi(14)
        public final int g(Context context) {
            Resources resources = context.getResources();
            if (m(context)) {
                return c(resources, f102490m);
            }
            return 0;
        }

        public int h() {
            if (this.f102493b && o()) {
                return this.f102497f;
            }
            return 0;
        }

        public int i() {
            if (!this.f102493b || o()) {
                return 0;
            }
            return this.f102498g;
        }

        public int j(boolean withActionBar) {
            return (this.f102492a ? this.f102494c : 0) + (withActionBar ? this.f102495d : 0);
        }

        @SuppressLint({"NewApi"})
        public final float k(Activity activity) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            float f11 = displayMetrics.widthPixels;
            float f12 = displayMetrics.density;
            return Math.min(f11 / f12, displayMetrics.heightPixels / f12);
        }

        public int l() {
            return this.f102494c;
        }

        @TargetApi(14)
        public final boolean m(Context context) {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier(f102491n, "bool", "android");
            if (identifier == 0) {
                return !ViewConfiguration.get(context).hasPermanentMenuKey();
            }
            boolean z11 = resources.getBoolean(identifier);
            if ("1".equals(b.f102479i)) {
                return false;
            }
            if ("0".equals(b.f102479i)) {
                return true;
            }
            return z11;
        }

        public boolean n() {
            return this.f102496e;
        }

        public boolean o() {
            return this.f102500i >= 600.0f || this.f102499h;
        }

        public C1392b(Activity activity, boolean translucentStatusBar, boolean traslucentNavBar) {
            Resources resources = activity.getResources();
            this.f102499h = resources.getConfiguration().orientation == 1;
            this.f102500i = k(activity);
            this.f102494c = c(resources, f102487j);
            this.f102495d = b(activity);
            int e11 = e(activity);
            this.f102497f = e11;
            this.f102498g = g(activity);
            this.f102496e = e11 > 0;
            this.f102492a = translucentStatusBar;
            this.f102493b = traslucentNavBar;
        }
    }

    static {
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod(d.f46852f, String.class);
            declaredMethod.setAccessible(true);
            f102479i = (String) declaredMethod.invoke(null, "qemu.hw.mainkeys");
        } catch (Throwable unused) {
            f102479i = null;
        }
    }

    @TargetApi(19)
    public b(Activity activity) {
        Window window = activity.getWindow();
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        int[] iArr = {R.attr.windowTranslucentStatus, R.attr.windowTranslucentNavigation};
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(iArr);
        try {
            this.f102481b = obtainStyledAttributes.getBoolean(iArr[0], false);
            this.f102482c = obtainStyledAttributes.getBoolean(iArr[1], false);
            obtainStyledAttributes.recycle();
            int i11 = window.getAttributes().flags;
            if ((67108864 & i11) != 0) {
                this.f102481b = true;
            }
            if ((i11 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0) {
                this.f102482c = true;
            }
            C1392b c1392b = new C1392b(activity, this.f102481b, this.f102482c);
            this.f102480a = c1392b;
            if (!c1392b.n()) {
                this.f102482c = false;
            }
            if (this.f102481b) {
                t(activity, viewGroup);
            }
            if (this.f102482c) {
                s(activity, viewGroup);
            }
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public C1392b b() {
        return this.f102480a;
    }

    public boolean c() {
        return this.f102484e;
    }

    public boolean d() {
        return this.f102483d;
    }

    @TargetApi(11)
    public void e(float alpha) {
        if (this.f102482c) {
            this.f102486g.setAlpha(alpha);
        }
    }

    public void f(int color) {
        if (this.f102482c) {
            this.f102486g.setBackgroundColor(color);
        }
    }

    public void g(Drawable drawable) {
        if (this.f102482c) {
            this.f102486g.setBackgroundDrawable(drawable);
        }
    }

    public void h(boolean enabled) {
        this.f102484e = enabled;
        if (this.f102482c) {
            this.f102486g.setVisibility(enabled ? 0 : 8);
        }
    }

    public void i(int res) {
        if (this.f102482c) {
            this.f102486g.setBackgroundResource(res);
        }
    }

    @TargetApi(11)
    public void j(float alpha) {
        if (this.f102481b) {
            this.f102485f.setAlpha(alpha);
        }
    }

    public void k(int color) {
        if (this.f102481b) {
            this.f102485f.setBackgroundColor(color);
        }
    }

    public void l(Drawable drawable) {
        if (this.f102481b) {
            this.f102485f.setBackgroundDrawable(drawable);
        }
    }

    public void m(boolean enabled) {
        this.f102483d = enabled;
        if (this.f102481b) {
            this.f102485f.setVisibility(enabled ? 0 : 8);
        }
    }

    public void n(int res) {
        if (this.f102481b) {
            this.f102485f.setBackgroundResource(res);
        }
    }

    public void o(float alpha) {
        j(alpha);
        e(alpha);
    }

    public void p(int color) {
        k(color);
        f(color);
    }

    public void q(Drawable drawable) {
        l(drawable);
        g(drawable);
    }

    public void r(int res) {
        n(res);
        i(res);
    }

    public final void s(Context context, ViewGroup decorViewGroup) {
        FrameLayout.LayoutParams layoutParams;
        this.f102486g = new View(context);
        if (this.f102480a.o()) {
            layoutParams = new FrameLayout.LayoutParams(-1, this.f102480a.d());
            layoutParams.gravity = 80;
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.f102480a.f(), -1);
            layoutParams.gravity = 5;
        }
        this.f102486g.setLayoutParams(layoutParams);
        this.f102486g.setBackgroundColor(-1728053248);
        this.f102486g.setVisibility(8);
        decorViewGroup.addView(this.f102486g);
    }

    public final void t(Context context, ViewGroup decorViewGroup) {
        this.f102485f = new View(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f102480a.l());
        layoutParams.gravity = 48;
        if (this.f102482c && !this.f102480a.o()) {
            layoutParams.rightMargin = this.f102480a.f();
        }
        this.f102485f.setLayoutParams(layoutParams);
        this.f102485f.setBackgroundColor(-1728053248);
        this.f102485f.setVisibility(8);
        decorViewGroup.addView(this.f102485f);
    }
}
