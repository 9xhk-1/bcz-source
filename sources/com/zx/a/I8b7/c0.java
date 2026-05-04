package com.zx.a.I8b7;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class c0 {
    public static boolean a() {
        try {
        } catch (Exception e11) {
            r2.a(e11);
        }
        if (TextUtils.isEmpty(m3.B)) {
            return false;
        }
        if (System.currentTimeMillis() - m3.f46605u < new JSONObject(m3.B).getLong("frequency") * 1000) {
            r2.a("report freq c true");
            return true;
        }
        return false;
    }
}
