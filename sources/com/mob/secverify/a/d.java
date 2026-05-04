package com.mob.secverify.a;

import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d extends com.mob.secverify.a.a {

    /* renamed from: a, reason: collision with root package name */
    private int f40646a;

    /* renamed from: b, reason: collision with root package name */
    private String f40647b;

    /* renamed from: c, reason: collision with root package name */
    private int f40648c;

    /* renamed from: d, reason: collision with root package name */
    private a f40649d;

    /* renamed from: e, reason: collision with root package name */
    private String f40650e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends f {

        /* renamed from: b, reason: collision with root package name */
        private String f40652b;

        /* renamed from: c, reason: collision with root package name */
        private String f40653c;

        /* renamed from: d, reason: collision with root package name */
        private long f40654d;

        private a() {
        }
    }

    public d(int i11, String str, int i12, Object obj, String str2) {
        a aVar;
        this.f40646a = i11;
        this.f40647b = str;
        this.f40648c = i12;
        this.f40650e = str2;
        if (i11 == 0 && obj != null) {
            try {
                JSONObject jSONObject = new JSONObject(obj.toString());
                a aVar2 = new a();
                this.f40649d = aVar2;
                aVar2.f40652b = jSONObject.optString("accessCode");
                this.f40649d.f40653c = jSONObject.optString("fakeMobile");
                if (jSONObject.has(w9.i.f96007a)) {
                    this.f40649d.f40654d = jSONObject.optLong(w9.i.f96007a);
                }
            } catch (JSONException e11) {
                com.mob.secverify.b.c.a().a(e11, "[SecPure] ==>%s", "AccessCodeCucc init Parse JSONObject failed.");
                this.f40649d = new a();
            }
        }
        if (this.f40646a == 0) {
            super.a(true);
        } else {
            super.a(false);
        }
        a aVar3 = this.f40649d;
        if (aVar3 != null) {
            super.b(aVar3.f40652b);
            if (this.f40649d.f40654d != 0) {
                super.a(this.f40649d.f40654d);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("code", Integer.valueOf(i11));
        hashMap.put("msg", str);
        hashMap.put("status", Integer.valueOf(i12));
        hashMap.put("response", obj);
        hashMap.put(ma.b.f72887a, str2);
        super.a(new JSONObject(hashMap).toString());
        if (this.f40646a != 0 || (aVar = this.f40649d) == null) {
            return;
        }
        super.c(aVar.f40653c);
    }
}
