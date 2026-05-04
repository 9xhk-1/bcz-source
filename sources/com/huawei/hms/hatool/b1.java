package com.huawei.hms.hatool;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b1 implements o1 {

    /* renamed from: a, reason: collision with root package name */
    private String f35768a;

    /* renamed from: b, reason: collision with root package name */
    private String f35769b;

    /* renamed from: c, reason: collision with root package name */
    private String f35770c;

    /* renamed from: d, reason: collision with root package name */
    private String f35771d;

    /* renamed from: e, reason: collision with root package name */
    private String f35772e;

    /* renamed from: f, reason: collision with root package name */
    private String f35773f;

    @Override // com.huawei.hms.hatool.o1
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", this.f35768a);
        jSONObject.put("eventtime", this.f35771d);
        jSONObject.put(NotificationCompat.CATEGORY_EVENT, this.f35769b);
        jSONObject.put("event_session_name", this.f35772e);
        jSONObject.put("first_session_event", this.f35773f);
        if (TextUtils.isEmpty(this.f35770c)) {
            return null;
        }
        jSONObject.put("properties", new JSONObject(this.f35770c));
        return jSONObject;
    }

    public String b() {
        return this.f35771d;
    }

    public String c() {
        return this.f35768a;
    }

    public JSONObject d() {
        JSONObject a11 = a();
        a11.put("properties", n.b(this.f35770c, o0.d().a()));
        return a11;
    }

    public void e(String str) {
        this.f35773f = str;
    }

    public void f(String str) {
        this.f35772e = str;
    }

    public void a(String str) {
        this.f35770c = str;
    }

    public void b(String str) {
        this.f35769b = str;
    }

    public void c(String str) {
        this.f35771d = str;
    }

    public void d(String str) {
        this.f35768a = str;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f35769b = jSONObject.optString(NotificationCompat.CATEGORY_EVENT);
        this.f35770c = n.a(jSONObject.optString("properties"), o0.d().a());
        this.f35768a = jSONObject.optString("type");
        this.f35771d = jSONObject.optString("eventtime");
        this.f35772e = jSONObject.optString("event_session_name");
        this.f35773f = jSONObject.optString("first_session_event");
    }
}
