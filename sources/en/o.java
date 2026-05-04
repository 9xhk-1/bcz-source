package en;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.core.os.BuildCompat;
import com.google.android.material.R;
import en.p;
import fn.f6;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f50004a = {R.attr.dynamicColorThemeOverlay};

    /* renamed from: b, reason: collision with root package name */
    public static final c f50005b;

    /* renamed from: c, reason: collision with root package name */
    @SuppressLint({"PrivateApi"})
    public static final c f50006c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map<String, c> f50007d;

    /* renamed from: e, reason: collision with root package name */
    public static final Map<String, c> f50008e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f50009f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final String f50010g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements c {
        @Override // en.o.c
        public boolean isSupported() {
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public Long f50011a;

        @Override // en.o.c
        public boolean isSupported() {
            if (this.f50011a == null) {
                try {
                    Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                    declaredMethod.setAccessible(true);
                    Long l11 = (Long) declaredMethod.invoke(null, "ro.build.version.oneui");
                    l11.longValue();
                    this.f50011a = l11;
                } catch (Exception unused) {
                    this.f50011a = -1L;
                }
            }
            return this.f50011a.longValue() >= 40100;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        boolean isSupported();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface e {
        void a(@NonNull Activity activity);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface f {
        boolean a(@NonNull Activity activity, @StyleRes int i11);
    }

    static {
        a aVar = new a();
        f50005b = aVar;
        b bVar = new b();
        f50006c = bVar;
        HashMap hashMap = new HashMap();
        hashMap.put("fcnt", aVar);
        hashMap.put("google", aVar);
        hashMap.put("hmd global", aVar);
        hashMap.put("infinix", aVar);
        hashMap.put("infinix mobility limited", aVar);
        hashMap.put("itel", aVar);
        hashMap.put("kyocera", aVar);
        hashMap.put("lenovo", aVar);
        hashMap.put(com.google.android.material.internal.l.f31606a, aVar);
        hashMap.put("meizu", aVar);
        hashMap.put("motorola", aVar);
        hashMap.put("nothing", aVar);
        hashMap.put("oneplus", aVar);
        hashMap.put("oppo", aVar);
        hashMap.put("realme", aVar);
        hashMap.put("robolectric", aVar);
        hashMap.put(com.google.android.material.internal.l.f31607b, bVar);
        hashMap.put("sharp", aVar);
        hashMap.put("shift", aVar);
        hashMap.put("sony", aVar);
        hashMap.put("tcl", aVar);
        hashMap.put("tecno", aVar);
        hashMap.put("tecno mobile limited", aVar);
        hashMap.put("vivo", aVar);
        hashMap.put("wingtech", aVar);
        hashMap.put("xiaomi", aVar);
        f50007d = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("asus", aVar);
        hashMap2.put("jio", aVar);
        f50008e = Collections.unmodifiableMap(hashMap2);
        f50010g = o.class.getSimpleName();
    }

    @Deprecated
    public static void a(@NonNull Activity activity) {
        i(activity);
    }

    @Deprecated
    public static void b(@NonNull Activity activity, @StyleRes int i11) {
        j(activity, new p.c().k(i11).f());
    }

    @Deprecated
    public static void c(@NonNull Activity activity, @NonNull f fVar) {
        j(activity, new p.c().j(fVar).f());
    }

    public static void d(@NonNull Application application) {
        h(application, new p.c().f());
    }

    @Deprecated
    public static void e(@NonNull Application application, @StyleRes int i11) {
        h(application, new p.c().k(i11).f());
    }

    @Deprecated
    public static void f(@NonNull Application application, @StyleRes int i11, @NonNull f fVar) {
        h(application, new p.c().k(i11).j(fVar).f());
    }

    @Deprecated
    public static void g(@NonNull Application application, @NonNull f fVar) {
        h(application, new p.c().j(fVar).f());
    }

    public static void h(@NonNull Application application, @NonNull p pVar) {
        application.registerActivityLifecycleCallbacks(new d(pVar));
    }

    public static void i(@NonNull Activity activity) {
        j(activity, new p.c().f());
    }

    public static void j(@NonNull Activity activity, @NonNull p pVar) {
        if (m()) {
            int k11 = pVar.d() == null ? pVar.g() == 0 ? k(activity, f50004a) : pVar.g() : 0;
            if (pVar.f().a(activity, k11)) {
                if (pVar.d() != null) {
                    f6 f6Var = new f6(fn.l.b(pVar.d().intValue()), !u.r(activity), l(activity));
                    l c11 = l.c();
                    if (c11 == null || !c11.b(activity, t.a(f6Var))) {
                        return;
                    }
                } else {
                    y.a(activity, k11);
                }
                pVar.e().a(activity);
            }
        }
    }

    public static int k(@NonNull Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static float l(Context context) {
        float contrast;
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (uiModeManager == null || Build.VERSION.SDK_INT < 34) {
            return 0.0f;
        }
        contrast = uiModeManager.getContrast();
        return contrast;
    }

    @ChecksSdkIntAtLeast(api = 31)
    @SuppressLint({"DefaultLocale"})
    public static boolean m() {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        if (BuildCompat.isAtLeastT()) {
            return true;
        }
        Map<String, c> map = f50007d;
        String str = Build.MANUFACTURER;
        Locale locale = Locale.ROOT;
        c cVar = map.get(str.toLowerCase(locale));
        if (cVar == null) {
            cVar = f50008e.get(Build.BRAND.toLowerCase(locale));
        }
        return cVar != null && cVar.isSupported();
    }

    @NonNull
    public static Context n(@NonNull Context context) {
        return o(context, 0);
    }

    @NonNull
    public static Context o(@NonNull Context context, @StyleRes int i11) {
        return p(context, new p.c().k(i11).f());
    }

    @NonNull
    public static Context p(@NonNull Context context, @NonNull p pVar) {
        if (m()) {
            int g11 = pVar.g();
            if (g11 == 0) {
                g11 = k(context, f50004a);
            }
            if (g11 != 0) {
                if (pVar.d() != null) {
                    f6 f6Var = new f6(fn.l.b(pVar.d().intValue()), !u.r(context), l(context));
                    l c11 = l.c();
                    if (c11 != null) {
                        return c11.a(context, t.a(f6Var));
                    }
                }
                return new ContextThemeWrapper(context, g11);
            }
        }
        return context;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        public final p f50012a;

        public d(@NonNull p pVar) {
            this.f50012a = pVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
            o.j(activity, this.f50012a);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }
    }
}
