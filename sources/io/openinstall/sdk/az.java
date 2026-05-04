package io.openinstall.sdk;

/* loaded from: classes8.dex */
public class az {

    /* renamed from: a, reason: collision with root package name */
    public a f62590a;

    /* renamed from: b, reason: collision with root package name */
    public int f62591b;

    /* renamed from: c, reason: collision with root package name */
    public String f62592c;

    /* renamed from: d, reason: collision with root package name */
    public String f62593d;

    /* renamed from: e, reason: collision with root package name */
    public String f62594e;

    public enum a {
        SUCCESS,
        FAIL,
        ERROR
    }

    public az() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r1.isNull("msg") == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static io.openinstall.sdk.az b(java.lang.String r4) throws org.json.JSONException {
        /*
            io.openinstall.sdk.az r0 = new io.openinstall.sdk.az
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r4)
            java.lang.String r4 = "config"
            boolean r2 = r1.has(r4)
            if (r2 == 0) goto L1f
            boolean r2 = r1.isNull(r4)
            if (r2 != 0) goto L1f
            java.lang.String r4 = r1.optString(r4)
            r0.j(r4)
        L1f:
            java.lang.String r4 = "code"
            r2 = -2
            int r4 = r1.optInt(r4, r2)
            java.lang.String r3 = "msg"
            if (r4 != 0) goto L5c
            io.openinstall.sdk.az$a r4 = io.openinstall.sdk.az.a.SUCCESS
            r0.d(r4)
            r4 = 0
            r0.c(r4)
            java.lang.String r4 = "body"
            boolean r2 = r1.has(r4)
            if (r2 == 0) goto L48
            boolean r2 = r1.isNull(r4)
            if (r2 != 0) goto L48
            java.lang.String r4 = r1.optString(r4)
            r0.h(r4)
        L48:
            boolean r4 = r1.has(r3)
            if (r4 == 0) goto L5b
            boolean r4 = r1.isNull(r3)
            if (r4 != 0) goto L5b
        L54:
            java.lang.String r4 = r1.optString(r3)
            r0.f(r4)
        L5b:
            return r0
        L5c:
            io.openinstall.sdk.az$a r4 = io.openinstall.sdk.az.a.ERROR
            r0.d(r4)
            r0.c(r2)
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: io.openinstall.sdk.az.b(java.lang.String):io.openinstall.sdk.az");
    }

    public a a() {
        return this.f62590a;
    }

    public void c(int i11) {
        this.f62591b = i11;
    }

    public void d(a aVar) {
        this.f62590a = aVar;
    }

    public int e() {
        return this.f62591b;
    }

    public void f(String str) {
        this.f62593d = str;
    }

    public String g() {
        return this.f62593d;
    }

    public void h(String str) {
        this.f62592c = str;
    }

    public String i() {
        return this.f62592c;
    }

    public void j(String str) {
        this.f62594e = str;
    }

    public String k() {
        return this.f62594e;
    }

    public az(a aVar, int i11) {
        this.f62590a = aVar;
        this.f62591b = i11;
    }
}
