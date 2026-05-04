package com.zx.a.I8b7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.zx.module.annotation.Java2C;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import org.json.JSONArray;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class x1 {
    @Java2C.Method2C
    public static native String a(String str) throws NoSuchAlgorithmException, InvalidKeyException;

    public static JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        try {
            Bundle b11 = b(m3.f46585a);
            if (b11 != null) {
                for (String str : b11.keySet()) {
                    if (str.startsWith("ZX_APPID_")) {
                        String string = b11.getString(str);
                        if (!TextUtils.isEmpty(string)) {
                            jSONArray.put(string);
                        }
                    }
                }
            }
            return jSONArray;
        } catch (PackageManager.NameNotFoundException e11) {
            r2.a(e11);
            return jSONArray;
        }
    }

    public static Bundle b(Context context) throws PackageManager.NameNotFoundException {
        if (m3.J == null) {
            m3.J = w3.c(context.getApplicationContext()).getApplicationInfo(c(context), 128).metaData;
        }
        return m3.J;
    }

    @Java2C.Method2C
    private static native String b();

    public static String c(Context context) {
        if (TextUtils.isEmpty(m3.f46591g)) {
            m3.f46591g = context.getPackageName();
        }
        return m3.f46591g;
    }

    public static void d(Context context) {
        try {
            m3.f46589e = b(context).getString("ZX_CHANNEL_ID");
            r2.a("initChannelId: , channelId = '" + m3.f46589e + "'");
        } catch (Exception e11) {
            r2.a(e11);
        }
    }

    public static String a(Context context) throws Exception {
        String str;
        if (!TextUtils.isEmpty(m3.f46590f)) {
            return m3.f46590f.trim();
        }
        if (context != null) {
            try {
                str = b(context).getString("ZX_APPID");
            } catch (Exception e11) {
                r2.a(e11);
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                if (m3.f46589e == null) {
                    d(context);
                }
                if (!TextUtils.isEmpty(m3.f46589e)) {
                    str = a(c(context));
                } else {
                    throw new IllegalStateException("ZX_APPID not found");
                }
            }
            return str.trim();
        }
        throw new RuntimeException("context not provided, cannot be null");
    }
}
