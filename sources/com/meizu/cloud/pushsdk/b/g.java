package com.meizu.cloud.pushsdk.b;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;

/* loaded from: classes7.dex */
public class g extends h<f> implements f {

    /* renamed from: a, reason: collision with root package name */
    private static g f39414a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f39415b;

    private g(f fVar) {
        super(fVar);
        this.f39415b = false;
    }

    public static g b() {
        if (f39414a == null) {
            synchronized (g.class) {
                try {
                    if (f39414a == null) {
                        f39414a = new g(new b());
                    }
                } finally {
                }
            }
        }
        return f39414a;
    }

    public void a(Context context) {
        a(context, (String) null);
    }

    @Override // com.meizu.cloud.pushsdk.b.f
    public void c(String str, String str2) {
        c().c(str, str2);
    }

    @Override // com.meizu.cloud.pushsdk.b.f
    public void d(String str, String str2) {
        c().d(str, str2);
    }

    public void a(Context context, String str) {
        if (this.f39415b) {
            return;
        }
        this.f39415b = true;
        b((context.getApplicationInfo().flags & 2) != 0);
        if (str == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                str = MzSystemUtils.getDocumentsPath(context) + "/pushSdk/" + context.getPackageName();
            } else {
                str = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/pushSdk/" + context.getPackageName();
            }
        }
        a(str);
    }

    @Override // com.meizu.cloud.pushsdk.b.f
    public void b(String str, String str2) {
        c().b(str, str2);
    }

    @Override // com.meizu.cloud.pushsdk.b.f
    public void a(String str) {
        c().a(str);
    }

    @Override // com.meizu.cloud.pushsdk.b.f
    public void b(boolean z11) {
        c().b(z11);
    }

    @Override // com.meizu.cloud.pushsdk.b.f
    public void a(String str, String str2) {
        c().a(str, str2);
    }

    @Override // com.meizu.cloud.pushsdk.b.f
    public void a(String str, String str2, Throwable th2) {
        c().a(str, str2, th2);
    }

    @Override // com.meizu.cloud.pushsdk.b.f
    public void a(boolean z11) {
        c().a(z11);
    }

    @Override // com.meizu.cloud.pushsdk.b.f
    public boolean a() {
        return c().a();
    }
}
