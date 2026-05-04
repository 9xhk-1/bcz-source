package com.mob.secverify.a;

import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b extends com.mob.secverify.a.a {

    /* renamed from: a, reason: collision with root package name */
    private int f40632a;

    /* renamed from: b, reason: collision with root package name */
    private a f40633b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends f {

        /* renamed from: b, reason: collision with root package name */
        private String f40635b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f40636c;

        /* renamed from: d, reason: collision with root package name */
        private int f40637d;

        private a() {
        }
    }

    private b() {
        this.f40632a = -1;
    }

    public b(int i11, JSONObject jSONObject) {
        this.f40632a = i11;
        a aVar = new a();
        this.f40633b = aVar;
        if (jSONObject != null) {
            aVar.f40635b = jSONObject.optString("resultCode");
            this.f40633b.f40636c = jSONObject.optBoolean("resultDesc");
            this.f40633b.f40637d = jSONObject.optInt("SDKRequestCode");
        }
        if ("103000".equals(this.f40633b.f40635b)) {
            super.a(true);
        } else {
            super.a(false);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", Integer.valueOf(i11));
        hashMap.put("jsonObject", jSONObject);
        super.a(new JSONObject(hashMap).toString());
        super.a(System.currentTimeMillis() + 3600000);
    }
}
