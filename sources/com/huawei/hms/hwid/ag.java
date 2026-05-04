package com.huawei.hms.hwid;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ag {

    /* renamed from: a, reason: collision with root package name */
    private Integer f35942a;

    /* renamed from: b, reason: collision with root package name */
    private String f35943b;

    public Integer a() {
        return this.f35942a;
    }

    public String b() {
        return this.f35943b;
    }

    public static ag b(String str) {
        if (TextUtils.isEmpty(str)) {
            return new ag();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Integer valueOf = jSONObject.has("errorCode") ? Integer.valueOf(jSONObject.getInt("errorCode")) : null;
            String string = jSONObject.has("errorMsg") ? jSONObject.getString("errorMsg") : null;
            ag agVar = new ag();
            agVar.a(valueOf);
            agVar.a(string);
            return agVar;
        } catch (JSONException unused) {
            as.d("ReadSmsOutputBean", "ReadSmsOutputBean json parse falied", true);
            return new ag();
        }
    }

    public void a(Integer num) {
        this.f35942a = num;
    }

    public void a(String str) {
        this.f35943b = str;
    }
}
