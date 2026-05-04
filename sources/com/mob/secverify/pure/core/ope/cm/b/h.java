package com.mob.secverify.pure.core.ope.cm.b;

import com.mob.secverify.pure.entity.PreVerifyResult;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class h extends a {

    /* renamed from: c, reason: collision with root package name */
    private String f40991c;

    /* renamed from: d, reason: collision with root package name */
    private String f40992d;

    public void b(String str) {
        this.f40991c = str;
    }

    public void c(String str) {
        this.f40992d = str;
    }

    @Override // com.mob.secverify.pure.core.ope.cm.b.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public h a(String str) {
        try {
            super.a(str);
            this.f40991c = String.valueOf(this.f40952b.get("phoneScript"));
            this.f40992d = String.valueOf(this.f40952b.get("securityPhone"));
            return this;
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2, "[SecPure] ==>%s", "Entity analyse exception.");
            return this;
        }
    }

    public String a() {
        return this.f40991c;
    }

    public String b() {
        return this.f40992d;
    }

    public String c() {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("phoneScript", this.f40991c);
            hashMap.put("securityPhone", this.f40992d);
            return this.f40951a.fromHashMap(hashMap);
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2, "[SecPure] ==>%s", "Error parse entity to json");
            return "";
        }
    }

    public PreVerifyResult d() {
        return new PreVerifyResult(this.f40992d, "CMCC");
    }
}
