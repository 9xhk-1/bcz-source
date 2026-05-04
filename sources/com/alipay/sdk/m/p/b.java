package com.alipay.sdk.m.p;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f10893a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10894b;

    public b(String str, String str2) {
        this.f10893a = str;
        this.f10894b = str2;
    }

    public String a() {
        return this.f10894b;
    }

    public String b() {
        return this.f10893a;
    }

    public JSONObject c() {
        if (TextUtils.isEmpty(this.f10894b)) {
            return null;
        }
        try {
            return new JSONObject(this.f10894b);
        } catch (Exception e11) {
            com.alipay.sdk.m.u.e.a(e11);
            return null;
        }
    }

    public String toString() {
        return String.format("<Letter envelop=%s body=%s>", this.f10893a, this.f10894b);
    }
}
