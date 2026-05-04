package com.mob.secverify.a;

import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class g extends h {

    /* renamed from: a, reason: collision with root package name */
    public String f40658a;

    /* renamed from: b, reason: collision with root package name */
    public String f40659b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f40660c;

    @Override // com.mob.secverify.a.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public g b(String str) {
        try {
            super.b(str);
            this.f40658a = String.valueOf(this.f40662e.get("opToken"));
            this.f40659b = String.valueOf(this.f40662e.get("phone"));
            this.f40660c = ((Boolean) this.f40662e.get("use")).booleanValue();
            return this;
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2, "[SecPure] ==>%s", "Entity analyse exception.");
            return this;
        }
    }

    public String a() {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("opToken", this.f40658a);
            hashMap.put("use", Boolean.valueOf(this.f40660c));
            hashMap.put("phone", this.f40659b);
            return this.f40661d.fromHashMap(hashMap);
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2, "[SecPure] ==>%s", "Error parse entity to json");
            return "";
        }
    }
}
