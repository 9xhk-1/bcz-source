package com.huawei.hms.hatool;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class f implements g {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f35786a;

    /* renamed from: b, reason: collision with root package name */
    private String f35787b;

    /* renamed from: c, reason: collision with root package name */
    private String f35788c;

    /* renamed from: d, reason: collision with root package name */
    private String f35789d;

    /* renamed from: e, reason: collision with root package name */
    private String f35790e;

    /* renamed from: f, reason: collision with root package name */
    private List<b1> f35791f;

    public f(byte[] bArr, String str, String str2, String str3, String str4, List<b1> list) {
        this.f35786a = (byte[]) bArr.clone();
        this.f35787b = str;
        this.f35788c = str2;
        this.f35790e = str3;
        this.f35789d = str4;
        this.f35791f = list;
    }

    private n0 a(Map<String, String> map) {
        return w.a(this.f35787b, this.f35786a, map);
    }

    private void b() {
        b0.c().a(new d1(this.f35791f, this.f35788c, this.f35789d, this.f35790e));
    }

    @Override // java.lang.Runnable
    public void run() {
        v.c("hmsSdk", "send data running");
        int b11 = a(a()).b();
        if (b11 != 200) {
            b();
            return;
        }
        v.b("hmsSdk", "events PostRequest sendevent TYPE : %s, TAG : %s, resultCode: %d ,reqID:" + this.f35789d, this.f35790e, this.f35788c, Integer.valueOf(b11));
    }

    private Map<String, String> a() {
        return k.b(this.f35788c, this.f35790e, this.f35789d);
    }
}
