package com.bun.miitmdid;

import android.content.Context;
import com.bun.miitmdid.interfaces.IIdConfig;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class b implements IIdConfig {

    /* renamed from: a, reason: collision with root package name */
    public static String f28871a = "";

    /* renamed from: b, reason: collision with root package name */
    public a f28872b = new a();

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public z f28873a;

        public a() {
        }
    }

    public static native b a(Context context);

    public static boolean a(b bVar, JSONObject jSONObject) {
        if (jSONObject != null && bVar != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("vivo");
            z zVar = new z();
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("appid");
                zVar.f28996a = optString;
                f28871a = optString;
                bVar.f28872b.f28873a = zVar;
            }
            if (bVar.f28872b.f28873a != null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bun.miitmdid.interfaces.IIdConfig
    public native String getVivoAppID();
}
