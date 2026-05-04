package com.vivo.push.cache;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.vivo.push.util.f;
import com.vivo.push.util.p;
import com.vivo.push.util.z;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a extends c<com.vivo.push.model.a> {
    public a(Context context) {
        super(context);
    }

    @Override // com.vivo.push.cache.c
    public final List<com.vivo.push.model.a> a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.trim().split("@#")) {
                String trim = str2.trim();
                String[] split = trim.trim().split(",");
                if (split.length >= 2) {
                    try {
                        String str3 = split[0];
                        arrayList.add(new com.vivo.push.model.a(str3, trim.substring(str3.length() + 1)));
                    } catch (Exception e11) {
                        p.d("AppConfigSettings", "str2Clients E: ".concat(String.valueOf(e11)));
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.vivo.push.cache.c
    public final String b(String str) throws Exception {
        return new String(f.a(f.a(e()), f.a(f()), Base64.decode(str, 2)), "utf-8");
    }

    public final com.vivo.push.model.a c(String str) {
        synchronized (c.f44946a) {
            try {
                for (T t11 : this.f44947b) {
                    if (!TextUtils.isEmpty(t11.a()) && t11.a().equals(str)) {
                        return t11;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int b() {
        com.vivo.push.model.a c11 = c("push_mode");
        if (c11 != null && !TextUtils.isEmpty(c11.b())) {
            try {
                return Integer.parseInt(c11.b());
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    @Override // com.vivo.push.cache.c
    public final String a() {
        return "com.vivo.pushservice.back_up";
    }

    public static boolean a(int i11) {
        if (i11 != -1) {
            return (i11 & 1) != 0;
        }
        return z.b("persist.sys.log.ctrl", ma.b.I0).equals(ma.b.H0);
    }
}
