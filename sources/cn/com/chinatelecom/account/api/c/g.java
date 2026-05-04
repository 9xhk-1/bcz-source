package cn.com.chinatelecom.account.api.c;

import android.net.Network;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public Network f8927a;

    /* renamed from: b, reason: collision with root package name */
    public int f8928b;

    /* renamed from: c, reason: collision with root package name */
    public String f8929c;

    /* renamed from: d, reason: collision with root package name */
    public String f8930d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8931e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8932f;

    /* renamed from: g, reason: collision with root package name */
    public String f8933g;

    /* renamed from: h, reason: collision with root package name */
    public String f8934h;

    /* renamed from: i, reason: collision with root package name */
    private int f8935i;

    /* renamed from: j, reason: collision with root package name */
    private int f8936j;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f8937a;

        /* renamed from: b, reason: collision with root package name */
        private int f8938b;

        /* renamed from: c, reason: collision with root package name */
        private Network f8939c;

        /* renamed from: d, reason: collision with root package name */
        private int f8940d;

        /* renamed from: e, reason: collision with root package name */
        private String f8941e;

        /* renamed from: f, reason: collision with root package name */
        private String f8942f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f8943g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f8944h;

        /* renamed from: i, reason: collision with root package name */
        private String f8945i;

        /* renamed from: j, reason: collision with root package name */
        private String f8946j;

        public a a(int i11) {
            this.f8937a = i11;
            return this;
        }

        public a b(int i11) {
            this.f8938b = i11;
            return this;
        }

        public a a(Network network) {
            this.f8939c = network;
            return this;
        }

        public a b(String str) {
            this.f8942f = str;
            return this;
        }

        public a a(String str) {
            this.f8941e = str;
            return this;
        }

        public a a(boolean z11) {
            this.f8943g = z11;
            return this;
        }

        public a a(boolean z11, String str, String str2) {
            this.f8944h = z11;
            this.f8945i = str;
            this.f8946j = str2;
            return this;
        }

        public g a() {
            return new g(this);
        }
    }

    public g(a aVar) {
        this.f8935i = aVar.f8937a;
        this.f8936j = aVar.f8938b;
        this.f8927a = aVar.f8939c;
        this.f8928b = aVar.f8940d;
        this.f8929c = aVar.f8941e;
        this.f8930d = aVar.f8942f;
        this.f8931e = aVar.f8943g;
        this.f8932f = aVar.f8944h;
        this.f8933g = aVar.f8945i;
        this.f8934h = aVar.f8946j;
    }

    public int a() {
        int i11 = this.f8935i;
        if (i11 > 0) {
            return i11;
        }
        return 3000;
    }

    public int b() {
        int i11 = this.f8936j;
        if (i11 > 0) {
            return i11;
        }
        return 3000;
    }
}
