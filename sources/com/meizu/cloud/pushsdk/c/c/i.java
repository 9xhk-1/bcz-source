package com.meizu.cloud.pushsdk.c.c;

import com.badlogic.gdx.Net;
import com.meizu.cloud.pushsdk.c.c.c;

/* loaded from: classes7.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final f f39590a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39591b;

    /* renamed from: c, reason: collision with root package name */
    private final c f39592c;

    /* renamed from: d, reason: collision with root package name */
    private final j f39593d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f39594e;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private f f39595a;

        /* renamed from: b, reason: collision with root package name */
        private String f39596b = "GET";

        /* renamed from: c, reason: collision with root package name */
        private c.a f39597c = new c.a();

        /* renamed from: d, reason: collision with root package name */
        private j f39598d;

        /* renamed from: e, reason: collision with root package name */
        private Object f39599e;

        public a b() {
            return a(Net.a.f11462a, (j) null);
        }

        public a d(j jVar) {
            return a("PATCH", jVar);
        }

        public a a() {
            return a("GET", (j) null);
        }

        public a b(j jVar) {
            return a(Net.a.f11467f, jVar);
        }

        public a c(j jVar) {
            return a(Net.a.f11465d, jVar);
        }

        public a a(c cVar) {
            this.f39597c = cVar.c();
            return this;
        }

        public i c() {
            if (this.f39595a != null) {
                return new i(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a a(f fVar) {
            if (fVar == null) {
                throw new IllegalArgumentException("url == null");
            }
            this.f39595a = fVar;
            return this;
        }

        public a a(j jVar) {
            return a("POST", jVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.meizu.cloud.pushsdk.c.c.i.a a(java.lang.String r7) {
            /*
                r6 = this;
                if (r7 == 0) goto L61
                r4 = 0
                r5 = 3
                r1 = 1
                r2 = 0
                java.lang.String r3 = "ws:"
                r0 = r7
                boolean r7 = r0.regionMatches(r1, r2, r3, r4, r5)
                if (r7 == 0) goto L26
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r1 = "http:"
                r7.append(r1)
                r1 = 3
            L1a:
                java.lang.String r0 = r0.substring(r1)
                r7.append(r0)
                java.lang.String r7 = r7.toString()
                goto L3f
            L26:
                r4 = 0
                r5 = 4
                r1 = 1
                r2 = 0
                java.lang.String r3 = "wss:"
                boolean r7 = r0.regionMatches(r1, r2, r3, r4, r5)
                if (r7 == 0) goto L3e
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r1 = "https:"
                r7.append(r1)
                r1 = 4
                goto L1a
            L3e:
                r7 = r0
            L3f:
                com.meizu.cloud.pushsdk.c.c.f r0 = com.meizu.cloud.pushsdk.c.c.f.c(r7)
                if (r0 == 0) goto L4a
                com.meizu.cloud.pushsdk.c.c.i$a r7 = r6.a(r0)
                return r7
            L4a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "unexpected url: "
                r1.append(r2)
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                r0.<init>(r7)
                throw r0
            L61:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "url == null"
                r7.<init>(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.c.c.i.a.a(java.lang.String):com.meizu.cloud.pushsdk.c.c.i$a");
        }

        public a a(String str, j jVar) {
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("method == null || method.length() == 0");
            }
            if (jVar != null && !d.b(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            }
            if (jVar != null || !d.a(str)) {
                this.f39596b = str;
                this.f39598d = jVar;
                return this;
            }
            throw new IllegalArgumentException("method " + str + " must have a request body.");
        }

        public a a(String str, String str2) {
            this.f39597c.a(str, str2);
            return this;
        }
    }

    private i(a aVar) {
        this.f39590a = aVar.f39595a;
        this.f39591b = aVar.f39596b;
        this.f39592c = aVar.f39597c.a();
        this.f39593d = aVar.f39598d;
        this.f39594e = aVar.f39599e != null ? aVar.f39599e : this;
    }

    public f a() {
        return this.f39590a;
    }

    public String b() {
        return this.f39591b;
    }

    public int c() {
        if ("POST".equals(b())) {
            return 1;
        }
        if (Net.a.f11465d.equals(b())) {
            return 2;
        }
        if (Net.a.f11467f.equals(b())) {
            return 3;
        }
        if (Net.a.f11462a.equals(b())) {
            return 4;
        }
        return "PATCH".equals(b()) ? 5 : 0;
    }

    public c d() {
        return this.f39592c;
    }

    public j e() {
        return this.f39593d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(this.f39591b);
        sb2.append(", url=");
        sb2.append(this.f39590a);
        sb2.append(", tag=");
        Object obj = this.f39594e;
        if (obj == this) {
            obj = null;
        }
        sb2.append(obj);
        sb2.append(l50.b.f69928j);
        return sb2.toString();
    }

    public String a(String str) {
        return this.f39592c.a(str);
    }
}
