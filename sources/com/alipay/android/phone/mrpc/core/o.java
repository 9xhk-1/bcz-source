package com.alipay.android.phone.mrpc.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class o extends t {

    /* renamed from: b, reason: collision with root package name */
    public String f10302b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f10303c;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10307g;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<org.apache.http.e> f10305e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    public Map<String, String> f10306f = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public String f10304d = "application/x-www-form-urlencoded";

    public o(String str) {
        this.f10302b = str;
    }

    public final String a() {
        return this.f10302b;
    }

    public final String b(String str) {
        Map<String, String> map = this.f10306f;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public final String c() {
        return this.f10304d;
    }

    public final ArrayList<org.apache.http.e> d() {
        return this.f10305e;
    }

    public final boolean e() {
        return this.f10307g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        byte[] bArr = this.f10303c;
        if (bArr == null) {
            if (oVar.f10303c != null) {
                return false;
            }
        } else if (!bArr.equals(oVar.f10303c)) {
            return false;
        }
        String str = this.f10302b;
        String str2 = oVar.f10302b;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Map<String, String> map = this.f10306f;
        int hashCode = ((map == null || !map.containsKey("id")) ? 1 : this.f10306f.get("id").hashCode() + 31) * 31;
        String str = this.f10302b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return String.format("Url : %s,HttpHeader: %s", this.f10302b, this.f10305e);
    }

    public final void a(String str) {
        this.f10304d = str;
    }

    public final byte[] b() {
        return this.f10303c;
    }

    public final void a(String str, String str2) {
        if (this.f10306f == null) {
            this.f10306f = new HashMap();
        }
        this.f10306f.put(str, str2);
    }

    public final void a(org.apache.http.e eVar) {
        this.f10305e.add(eVar);
    }

    public final void a(boolean z11) {
        this.f10307g = z11;
    }

    public final void a(byte[] bArr) {
        this.f10303c = bArr;
    }
}
