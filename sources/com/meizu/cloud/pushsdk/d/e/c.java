package com.meizu.cloud.pushsdk.d.e;

import android.content.Context;
import android.os.Build;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.meizu.cloud.pushsdk.d.f.e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f39824a = "c";

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<String, String> f39825b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, Object> f39826c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, String> f39827d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Context f39828a = null;

        public a a(Context context) {
            this.f39828a = context;
            return this;
        }

        public c a() {
            return new c(this);
        }
    }

    private c(a aVar) {
        this.f39825b = new HashMap<>();
        this.f39826c = new HashMap<>();
        this.f39827d = new HashMap<>();
        d();
        e();
        f();
        g();
        if (aVar.f39828a != null) {
            a(aVar.f39828a);
        }
        com.meizu.cloud.pushsdk.d.f.c.c(f39824a, "Subject created successfully.", new Object[0]);
    }

    private void d() {
        a(CmcdConfiguration.KEY_OBJECT_TYPE, "android-" + Build.VERSION.RELEASE);
    }

    private void e() {
        a("ov", Build.DISPLAY);
    }

    private void f() {
        a("dm", Build.MODEL);
    }

    private void g() {
        a("df", Build.MANUFACTURER);
    }

    public Map<String, Object> a() {
        return this.f39826c;
    }

    public Map<String, String> b() {
        return this.f39827d;
    }

    public Map<String, String> c() {
        return this.f39825b;
    }

    public void a(Context context) {
        b(context);
    }

    public void b(Context context) {
        String b11 = e.b(context);
        if (b11 != null) {
            a(com.igexin.push.core.b.f37706ac, b11);
        }
    }

    private void a(String str, String str2) {
        if (str == null || str2 == null || str.isEmpty() || str2.isEmpty()) {
            return;
        }
        this.f39827d.put(str, str2);
    }
}
