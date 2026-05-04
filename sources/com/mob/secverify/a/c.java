package com.mob.secverify.a;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c extends com.mob.secverify.a.a {

    /* renamed from: a, reason: collision with root package name */
    private int f40638a;

    /* renamed from: b, reason: collision with root package name */
    private String f40639b;

    /* renamed from: c, reason: collision with root package name */
    private a f40640c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends f {

        /* renamed from: b, reason: collision with root package name */
        private String f40642b;

        /* renamed from: c, reason: collision with root package name */
        private String f40643c;

        /* renamed from: d, reason: collision with root package name */
        private long f40644d;

        /* renamed from: e, reason: collision with root package name */
        private String f40645e;

        private a() {
        }
    }

    private c() {
        this.f40638a = -1;
    }

    public c(String str) {
        super(str);
        this.f40638a = -1;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f40638a = jSONObject.optInt("result");
            this.f40639b = jSONObject.optString("msg");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                a aVar = new a();
                this.f40640c = aVar;
                aVar.f40642b = optJSONObject.optString("accessCode");
                this.f40640c.f40643c = optJSONObject.optString("operatorType");
                this.f40640c.f40644d = optJSONObject.optLong("expiredTime");
                if (optJSONObject.has("number")) {
                    this.f40640c.f40645e = optJSONObject.optString("number");
                }
            }
        } catch (JSONException e11) {
            com.mob.secverify.b.c.a().a(e11, "[SecPure] ==>%s", "AccessCodeCtcc initParse JSONObject failed.");
            this.f40640c = new a();
        }
        if (this.f40638a == 0) {
            a(true);
        } else {
            a(false);
        }
        a aVar2 = this.f40640c;
        if (aVar2 != null) {
            b(aVar2.f40642b);
            a(this.f40640c.f40644d * 1000);
            if (TextUtils.isEmpty(this.f40640c.f40645e)) {
                return;
            }
            c(this.f40640c.f40645e);
        }
    }
}
