package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.xiaomi.mipush.sdk.Constants;
import java.util.UUID;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class j {

    /* renamed from: b, reason: collision with root package name */
    private static j f35828b;

    /* renamed from: a, reason: collision with root package name */
    private Context f35829a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends e0 {

        /* renamed from: a, reason: collision with root package name */
        String f35830a;

        /* renamed from: b, reason: collision with root package name */
        String f35831b;

        public a(String str, String str2) {
            this.f35830a = str;
            this.f35831b = str2;
        }

        @Override // com.huawei.hms.hatool.e0
        public String a() {
            return z.d(this.f35830a, this.f35831b);
        }

        @Override // com.huawei.hms.hatool.e0
        public String b() {
            return z.g(this.f35830a, this.f35831b);
        }

        @Override // com.huawei.hms.hatool.e0
        public String c() {
            return z.j(this.f35830a, this.f35831b);
        }

        @Override // com.huawei.hms.hatool.e0
        public int d() {
            return (z.k(this.f35830a, this.f35831b) ? 4 : 0) | (z.e(this.f35830a, this.f35831b) ? 2 : 0) | (z.h(this.f35830a, this.f35831b) ? 1 : 0);
        }

        @Override // com.huawei.hms.hatool.e0
        public String a(String str) {
            return qr.d.b(str);
        }
    }

    public static j a() {
        j jVar;
        synchronized (j.class) {
            try {
                if (f35828b == null) {
                    f35828b = new j();
                }
                jVar = f35828b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }

    public String b(String str, String str2) {
        return i0.b(this.f35829a, str, str2);
    }

    public i c(String str, String str2) {
        return new a(str, str2).a(this.f35829a);
    }

    public String d(String str, String str2) {
        return f1.b(str, str2);
    }

    public Pair<String, String> e(String str, String str2) {
        if (!z.f(str, str2)) {
            return new Pair<>("", "");
        }
        String p11 = s.c().b().p();
        String q11 = s.c().b().q();
        if (!TextUtils.isEmpty(p11) && !TextUtils.isEmpty(q11)) {
            return new Pair<>(p11, q11);
        }
        Pair<String, String> e11 = x0.e(this.f35829a);
        s.c().b().k((String) e11.first);
        s.c().b().l((String) e11.second);
        return e11;
    }

    public String f(String str, String str2) {
        return f1.a(str, str2);
    }

    public String a(String str, String str2) {
        return i0.a(this.f35829a, str, str2);
    }

    public String a(boolean z11) {
        if (!z11) {
            return "";
        }
        String e11 = q0.e();
        if (TextUtils.isEmpty(e11)) {
            e11 = d.a(this.f35829a, "global_v2", "uuid", "");
            if (TextUtils.isEmpty(e11)) {
                e11 = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
                d.b(this.f35829a, "global_v2", "uuid", e11);
            }
            q0.h(e11);
        }
        return e11;
    }

    public void a(Context context) {
        if (this.f35829a == null) {
            this.f35829a = context;
        }
    }
}
