package io.openinstall.sdk;

import android.text.TextUtils;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class aw implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f62587a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f62588b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f62589c = "";

    public static aw d(String str) throws JSONException {
        aw awVar = new aw();
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("market")) {
                awVar.a(jSONObject.optString("market"));
            }
            if (jSONObject.has("channelCode")) {
                awVar.b(jSONObject.optString("channelCode"));
            }
            if (jSONObject.has("bind")) {
                awVar.c(jSONObject.optString("bind"));
            }
        }
        return awVar;
    }

    public String a() {
        return this.f62588b;
    }

    public String b() {
        return this.f62589c;
    }

    public void c(String str) {
        this.f62589c = str;
    }

    public void a(String str) {
        this.f62587a = str;
    }

    public void b(String str) {
        this.f62588b = str;
    }
}
