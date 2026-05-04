package com.tencent.open.a;

import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
class c implements g {

    /* renamed from: a, reason: collision with root package name */
    private String f44425a;

    /* renamed from: b, reason: collision with root package name */
    private int f44426b;

    /* renamed from: c, reason: collision with root package name */
    private int f44427c;

    /* renamed from: d, reason: collision with root package name */
    private int f44428d;

    /* renamed from: e, reason: collision with root package name */
    private String f44429e;

    /* renamed from: f, reason: collision with root package name */
    private Map<String, List<String>> f44430f = new HashMap();

    public c(HttpURLConnection httpURLConnection, String str, int i11, int i12, int i13, String str2) {
        Map<String, List<String>> headerFields;
        this.f44425a = str;
        this.f44426b = i11;
        this.f44427c = i12;
        this.f44428d = i13;
        this.f44429e = str2;
        if (httpURLConnection == null || (headerFields = httpURLConnection.getHeaderFields()) == null) {
            return;
        }
        this.f44430f.putAll(headerFields);
    }

    @Override // com.tencent.open.a.g
    public String a() {
        return this.f44425a;
    }

    @Override // com.tencent.open.a.g
    public int b() {
        return this.f44426b;
    }

    @Override // com.tencent.open.a.g
    public int c() {
        return this.f44427c;
    }

    @Override // com.tencent.open.a.g
    public int d() {
        return this.f44428d;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + hashCode() + "\ncontent = [" + this.f44425a + l50.b.f69930l + "\nresponseSize = " + this.f44426b + "\nrequestSize = " + this.f44427c + "\nresultCode = " + this.f44428d + "\nerrorMsg = " + this.f44429e;
    }
}
