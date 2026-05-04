package com.meizu.cloud.pushsdk.c.c;

import com.meizu.cloud.pushsdk.c.c.c;

/* loaded from: classes7.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private final i f39606a;

    /* renamed from: b, reason: collision with root package name */
    private final int f39607b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39608c;

    /* renamed from: d, reason: collision with root package name */
    private final c f39609d;

    /* renamed from: e, reason: collision with root package name */
    private final l f39610e;

    /* renamed from: f, reason: collision with root package name */
    private final k f39611f;

    /* renamed from: g, reason: collision with root package name */
    private final k f39612g;

    /* renamed from: h, reason: collision with root package name */
    private final k f39613h;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private i f39614a;

        /* renamed from: c, reason: collision with root package name */
        private String f39616c;

        /* renamed from: e, reason: collision with root package name */
        private l f39618e;

        /* renamed from: f, reason: collision with root package name */
        private k f39619f;

        /* renamed from: g, reason: collision with root package name */
        private k f39620g;

        /* renamed from: h, reason: collision with root package name */
        private k f39621h;

        /* renamed from: b, reason: collision with root package name */
        private int f39615b = -1;

        /* renamed from: d, reason: collision with root package name */
        private c.a f39617d = new c.a();

        public a a(int i11) {
            this.f39615b = i11;
            return this;
        }

        public a a(c cVar) {
            this.f39617d = cVar.c();
            return this;
        }

        public a a(i iVar) {
            this.f39614a = iVar;
            return this;
        }

        public a a(l lVar) {
            this.f39618e = lVar;
            return this;
        }

        public a a(String str) {
            this.f39616c = str;
            return this;
        }

        public k a() {
            if (this.f39614a == null) {
                throw new IllegalStateException("request == null");
            }
            if (this.f39615b >= 0) {
                return new k(this);
            }
            throw new IllegalStateException("code < 0: " + this.f39615b);
        }
    }

    private k(a aVar) {
        this.f39606a = aVar.f39614a;
        this.f39607b = aVar.f39615b;
        this.f39608c = aVar.f39616c;
        this.f39609d = aVar.f39617d.a();
        this.f39610e = aVar.f39618e;
        this.f39611f = aVar.f39619f;
        this.f39612g = aVar.f39620g;
        this.f39613h = aVar.f39621h;
    }

    public int a() {
        return this.f39607b;
    }

    public l b() {
        return this.f39610e;
    }

    public String toString() {
        return "Response{protocol=, code=" + this.f39607b + ", message=" + this.f39608c + ", url=" + this.f39606a.a() + l50.b.f69928j;
    }
}
