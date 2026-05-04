package com.baicizhan.main;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.multidex.MultiDex;
import com.baicizhan.client.business.util.PicassoUtil;
import com.baicizhan.learning_strategy.util.L;
import ct.d;
import dd.h;
import dd.k;
import dd.m;
import ig.c;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import n3.e;
import org.junit.jupiter.api.j2;
import qu.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f
/* loaded from: classes4.dex */
public class BaicizhanApp extends k implements c {

    /* renamed from: g, reason: collision with root package name */
    public static final String f17832g = "BaicizhanApp";

    /* renamed from: h, reason: collision with root package name */
    public static final int f17833h = 2;

    /* renamed from: d, reason: collision with root package name */
    public e f17834d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17835e = false;

    /* renamed from: f, reason: collision with root package name */
    public int f17836f = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Runtime.getRuntime().gc();
            System.runFinalization();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements L.Logger {

        /* renamed from: b, reason: collision with root package name */
        public static final String f17838b = "LSTAG";

        public b() {
        }

        @Override // com.baicizhan.learning_strategy.util.L.Logger
        public void debug(String s11) {
            qb.c.b(f17838b, s11, new Object[0]);
        }

        @Override // com.baicizhan.learning_strategy.util.L.Logger
        public void error(String s11) {
            qb.c.d(f17838b, s11, new Object[0]);
        }

        @Override // com.baicizhan.learning_strategy.util.L.Logger
        public void info(String msg) {
            int i11 = 0;
            while (i11 < msg.length()) {
                int i12 = 3000;
                if (msg.length() - i11 <= 3000) {
                    i12 = msg.length() - i11;
                }
                int i13 = i11 + i12;
                qb.c.i(f17838b, "%s", msg.substring(i11, i13));
                i11 = i13;
            }
        }

        @Override // com.baicizhan.learning_strategy.util.L.Logger
        public void error(String s11, Throwable throwable) {
            qb.c.c(f17838b, s11, throwable);
        }
    }

    @Override // ig.c
    public void a(boolean enabled) {
        this.f17835e = enabled;
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override // com.baicizhan.client.framework.BaseApp
    public pb.a[] b() {
        return new pb.a[]{new m()};
    }

    public void f() {
        this.f17836f++;
    }

    public void g() {
        this.f17835e = false;
    }

    public final void h() {
        try {
            Method method = UserManager.class.getMethod(d.f46852f, Context.class);
            method.setAccessible(true);
            method.invoke(null, this);
        } catch (Throwable th2) {
            qb.c.c(f17832g, "fix google issue 173789 failed: ", th2);
        }
    }

    public final void i() {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        try {
            Class<?> cls = Class.forName("java.lang.Daemons$FinalizerWatchdogDaemon");
            Field declaredField = cls.getDeclaredField("INSTANCE");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            try {
                Field declaredField2 = cls.getSuperclass().getDeclaredField("thread");
                declaredField2.setAccessible(true);
                declaredField2.set(obj, null);
            } catch (Throwable th2) {
                qb.c.d(f17832g, "stopWatchDog, set null occur error:" + th2, new Object[0]);
                th2.printStackTrace();
                try {
                    Method declaredMethod = cls.getSuperclass().getDeclaredMethod("stop", null);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(obj, null);
                } catch (Throwable unused) {
                    qb.c.d(f17832g, "stopWatchDog, stop occur error:" + th2, new Object[0]);
                }
            }
        } catch (Throwable th3) {
            qb.c.d(f17832g, "stopWatchDog, get object occur error:" + th3, new Object[0]);
        }
        new Thread(new a()).start();
    }

    @NonNull
    public e j() {
        e eVar = this.f17834d;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException("BizSdk is not initialized");
    }

    public final void k() {
        String packageName = getPackageName();
        String e11 = xb.f.e(this);
        if (TextUtils.isEmpty(e11)) {
            return;
        }
        String str = "BCZ";
        if (!packageName.equals(e11)) {
            str = "BCZ" + e11.replaceAll(packageName, "");
        }
        if (e11.contains(":daemon") || e11.contains(":wordlock")) {
            return;
        }
        File externalFilesDir = getExternalFilesDir("log");
        if (externalFilesDir == null) {
            externalFilesDir = getFilesDir();
        }
        qb.c.j(externalFilesDir != null ? externalFilesDir.getPath() : "", null, str);
        L.setLog(new b());
    }

    public boolean l() {
        return this.f17835e && this.f17836f < 2;
    }

    public final void m() {
        if (xb.f.e(this).equals(getPackageName())) {
            dd.a.f47820a.g(getApplicationContext());
        }
    }

    public void n(e bizSdk) {
        this.f17834d = bizSdk;
    }

    public final void o() {
        String processName;
        if (Build.VERSION.SDK_INT >= 28) {
            String packageName = getPackageName();
            processName = Application.getProcessName();
            qb.c.i(f17832g, "setupWeb: %s, %s", packageName, processName);
            if (packageName.equals(processName)) {
                return;
            }
            WebView.setDataDirectorySuffix(processName);
        }
    }

    @Override // dd.k, com.baicizhan.client.framework.BaseApp, android.app.Application
    public void onCreate() {
        Log.d(f17832g, "!!!!! onCreate " + Process.myPid() + j2.O + xb.f.e(getApplicationContext()));
        k();
        o();
        uf.a.e(this);
        m();
        super.onCreate();
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new ig.a(this));
        h();
        i();
        h.h(this);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        qb.c.b(f17832g, "onLowMemory", new Object[0]);
        PicassoUtil.releaseMemory();
        System.gc();
    }

    @Override // com.baicizhan.client.framework.BaseApp, android.app.Application
    public void onTerminate() {
        super.onTerminate();
        qb.c.b(f17832g, "onTerminate", new Object[0]);
        ia.a.l(ia.a.f60460k, 0L);
    }
}
