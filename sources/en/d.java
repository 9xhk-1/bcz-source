package en;

import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.app.UiModeManager$ContrastChangeListener;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final float f49916a = 0.33333334f;

    /* renamed from: b, reason: collision with root package name */
    public static final float f49917b = 0.6666667f;

    public static void a(@NonNull Application application, @NonNull e eVar) {
        if (d()) {
            application.registerActivityLifecycleCallbacks(new a(eVar));
        }
    }

    public static void b(@NonNull Activity activity, @NonNull e eVar) {
        int c11;
        if (d() && (c11 = c(activity, eVar)) != 0) {
            y.a(activity, c11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(android.content.Context r3, en.e r4) {
        /*
            java.lang.String r0 = "uimode"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.app.UiModeManager r3 = (android.app.UiModeManager) r3
            boolean r0 = d()
            r1 = 0
            if (r0 == 0) goto L33
            if (r3 != 0) goto L12
            goto L33
        L12:
            float r3 = en.a.a(r3)
            int r0 = r4.b()
            int r4 = r4.a()
            r2 = 1059760811(0x3f2aaaab, float:0.6666667)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 < 0) goto L28
            if (r4 != 0) goto L31
            goto L32
        L28:
            r2 = 1051372203(0x3eaaaaab, float:0.33333334)
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 < 0) goto L33
            if (r0 != 0) goto L32
        L31:
            return r4
        L32:
            return r0
        L33:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: en.d.c(android.content.Context, en.e):int");
    }

    @ChecksSdkIntAtLeast(api = 34)
    public static boolean d() {
        return Build.VERSION.SDK_INT >= 34;
    }

    @NonNull
    public static Context e(@NonNull Context context, @NonNull e eVar) {
        int c11;
        return (d() && (c11 = c(context, eVar)) != 0) ? new ContextThemeWrapper(context, c11) : context;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(34)
    public static class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        public final Set<Activity> f49918a = new LinkedHashSet();

        /* renamed from: b, reason: collision with root package name */
        public final e f49919b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        public UiModeManager$ContrastChangeListener f49920c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: en.d$a$a, reason: collision with other inner class name */
        public class C0601a implements UiModeManager$ContrastChangeListener {
            public C0601a() {
            }

            public void onContrastChanged(float f11) {
                Iterator it = a.this.f49918a.iterator();
                while (it.hasNext()) {
                    ((Activity) it.next()).recreate();
                }
            }
        }

        public a(e eVar) {
            this.f49919b = eVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
            this.f49918a.remove(activity);
            UiModeManager uiModeManager = (UiModeManager) activity.getSystemService("uimode");
            if (uiModeManager == null || this.f49920c == null || !this.f49918a.isEmpty()) {
                return;
            }
            uiModeManager.removeContrastChangeListener(this.f49920c);
            this.f49920c = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
            UiModeManager uiModeManager = (UiModeManager) activity.getSystemService("uimode");
            if (uiModeManager != null && this.f49918a.isEmpty() && this.f49920c == null) {
                this.f49920c = new C0601a();
                uiModeManager.addContrastChangeListener(ContextCompat.getMainExecutor(activity.getApplicationContext()), this.f49920c);
            }
            this.f49918a.add(activity);
            if (uiModeManager != null) {
                d.b(activity, this.f49919b);
            }
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
