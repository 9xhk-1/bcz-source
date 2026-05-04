package com.zx.a.I8b7;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.zx.a.I8b7.h3;
import com.zx.a.I8b7.k3;
import com.zx.a.I8b7.v3;
import com.zx.module.annotation.Java2C;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class x2 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f46744a = new AtomicBoolean(false);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f46745a;

        public a(Context context) {
            this.f46745a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m3.b(this.f46745a);
                try {
                    x2.a().a();
                } catch (Throwable th2) {
                    Log.i("core info Except", "can ignore," + th2.getMessage());
                }
            } catch (Throwable th3) {
                g3.a(th3, f3.a("ZXCore init failed: "));
                x2.f46744a.set(false);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final x2 f46746a = new x2();
    }

    public static h3 a() {
        Handler handler = k3.f46567a;
        k3 k3Var = k3.a.f46568a;
        if (k3Var.b()) {
            throw new RuntimeException("请先调用 ZXManager.checkPermission() 检查用户是否已授权");
        }
        if (!k3Var.a()) {
            throw new RuntimeException("用户未授权");
        }
        AtomicBoolean atomicBoolean = h3.f46533e;
        return h3.e.f46542a;
    }

    public static final x2 b() {
        if (f46744a.get()) {
            return b.f46746a;
        }
        throw new IllegalStateException("ZXManager not init, should init firstly");
    }

    @Java2C.Method2C
    public native String a(String str, String str2) throws Throwable;

    public static void a(Context context) {
        try {
            if (f46744a.getAndSet(true)) {
                return;
            }
            v3.f.f46726a.f46721a.execute(new a(context));
        } catch (Throwable th2) {
            f46744a.set(false);
            r.b("ZXManager.init failed:" + th2);
        }
    }
}
