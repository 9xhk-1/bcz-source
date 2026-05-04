package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a0 implements g {

    /* renamed from: a, reason: collision with root package name */
    private Context f35747a = q0.i();

    /* renamed from: b, reason: collision with root package name */
    private String f35748b;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f35749c;

    /* renamed from: d, reason: collision with root package name */
    private String f35750d;

    /* renamed from: e, reason: collision with root package name */
    private String f35751e;

    /* renamed from: f, reason: collision with root package name */
    private String f35752f;

    /* renamed from: g, reason: collision with root package name */
    private String f35753g;

    /* renamed from: h, reason: collision with root package name */
    private Boolean f35754h;

    public a0(String str, JSONObject jSONObject, String str2, String str3, long j11) {
        this.f35748b = str;
        this.f35749c = jSONObject;
        this.f35750d = str2;
        this.f35751e = str3;
        this.f35752f = String.valueOf(j11);
        if (z.i(str2, "oper")) {
            p0 a11 = y.a().a(str2, j11);
            this.f35753g = a11.a();
            this.f35754h = Boolean.valueOf(a11.b());
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray;
        v.c("hmsSdk", "Begin to run EventRecordTask...");
        int h11 = q0.h();
        int k11 = a1.k(this.f35750d, this.f35751e);
        if (c0.a(this.f35747a, "stat_v2_1", h11 * 1048576)) {
            v.c("hmsSdk", "stat sp file reach max limited size, discard new event");
            e.a().a("", "alltype");
            return;
        }
        b1 b1Var = new b1();
        b1Var.b(this.f35748b);
        b1Var.a(this.f35749c.toString());
        b1Var.d(this.f35751e);
        b1Var.c(this.f35752f);
        b1Var.f(this.f35753g);
        Boolean bool = this.f35754h;
        b1Var.e(bool == null ? null : String.valueOf(bool));
        try {
            JSONObject d11 = b1Var.d();
            String a11 = n1.a(this.f35750d, this.f35751e);
            String a12 = d.a(this.f35747a, "stat_v2_1", a11, "");
            try {
                jSONArray = !TextUtils.isEmpty(a12) ? new JSONArray(a12) : new JSONArray();
            } catch (JSONException unused) {
                v.d("hmsSdk", "Cached data corrupted: stat_v2_1");
                jSONArray = new JSONArray();
            }
            jSONArray.put(d11);
            d.b(this.f35747a, "stat_v2_1", a11, jSONArray.toString());
            if (jSONArray.toString().length() > k11 * 1024) {
                e.a().a(this.f35750d, this.f35751e);
            }
        } catch (JSONException unused2) {
            v.e("hmsSdk", "eventRecord toJson error! The record failed.");
        }
    }
}
