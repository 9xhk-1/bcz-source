package com.vivo.push.util;

import android.content.Context;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class w extends b {

    /* renamed from: b, reason: collision with root package name */
    private static w f45120b;

    public static synchronized w b() {
        w wVar;
        synchronized (w.class) {
            try {
                if (f45120b == null) {
                    f45120b = new w();
                }
                wVar = f45120b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }

    public final synchronized void a(Context context) {
        if (this.f45082a == null) {
            this.f45082a = context;
            a(context, "com.vivo.push_preferences");
        }
    }

    public final byte[] c() {
        byte[] c11 = c(b("com.vivo.push.secure_cache_iv", ""));
        return (c11 == null || c11.length <= 0) ? new byte[]{34, 32, 33, s60.e.f88061c, 33, 34, 32, 33, 33, 33, 34, 41, 35, 32, 32, 32} : c11;
    }

    public final byte[] d() {
        byte[] c11 = c(b("com.vivo.push.secure_cache_key", ""));
        return (c11 == null || c11.length <= 0) ? new byte[]{33, 34, 35, 36, s60.e.f88061c, 38, 39, 40, 41, 32, 38, s60.e.f88061c, 36, 35, 34, 33} : c11;
    }

    private static byte[] c(String str) {
        int i11;
        byte[] bArr = null;
        try {
            String[] split = str.split(",");
            if (split.length > 0) {
                bArr = new byte[split.length];
                i11 = split.length;
            } else {
                i11 = 0;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                bArr[i12] = Byte.parseByte(split[i12].trim());
            }
            return bArr;
        } catch (Exception e11) {
            p.a("SharePreferenceManager", "getCodeBytes error:" + e11.getMessage());
            return bArr;
        }
    }
}
