package com.meizu.cloud.pushsdk.a;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.d.f.e;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f39335a = "b";

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<String, String> f39336b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, Object> f39337c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, Object> f39338d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Context f39339a = null;

        public a a(Context context) {
            this.f39339a = context;
            return this;
        }

        public b a() {
            return new b(this);
        }
    }

    private b(a aVar) {
        this.f39336b = new HashMap<>();
        this.f39337c = new HashMap<>();
        this.f39338d = new HashMap<>();
        d();
        if (aVar.f39339a != null) {
            b(aVar.f39339a);
            a(aVar.f39339a);
            c(aVar.f39339a);
            d(aVar.f39339a);
        }
        DebugLogger.i(f39335a, "Subject created successfully.");
    }

    private void d() {
        a("br", Build.BRAND);
        a("dc", Build.MODEL);
        a(CmcdConfiguration.KEY_OBJECT_TYPE, Build.VERSION.RELEASE);
        a("ov", Build.DISPLAY);
        a("ll", MzSystemUtils.getCurrentLanguage());
    }

    public Map<String, String> a() {
        return this.f39336b;
    }

    public Map<String, Object> b() {
        return this.f39337c;
    }

    public Map<String, Object> c() {
        return this.f39338d;
    }

    private void b(Context context) {
        a("op", e.c(context));
    }

    private void c(Context context) {
        b("nt", MzSystemUtils.getNetWorkType(context));
    }

    private void d(Context context) {
        a("pn", (Object) context.getPackageName());
        a("pv", (Object) MzSystemUtils.getAppVersionName(context));
        a("pvc", Integer.valueOf(MzSystemUtils.getAppVersionCode(context)));
        a("st", Integer.valueOf(!TextUtils.isEmpty(MzSystemUtils.findReceiver(context, "com.meizu.ups.push.intent.MESSAGE", context.getPackageName())) ? 1 : 0));
    }

    public void a(Context context) {
        Point d11 = e.d(context);
        if (d11 == null) {
            DebugLogger.e(f39335a, "screen information not available.");
        } else {
            a("ss", d11.x, d11.y);
        }
    }

    private void a(String str, int i11, int i12) {
        this.f39336b.put(str, i11 + "." + i12);
    }

    private void b(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        if ((obj instanceof String) && ((String) obj).isEmpty()) {
            return;
        }
        this.f39338d.put(str, obj);
    }

    private void a(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        if ((obj instanceof String) && ((String) obj).isEmpty()) {
            return;
        }
        this.f39337c.put(str, obj);
    }

    private void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f39336b.put(str, str2);
    }
}
