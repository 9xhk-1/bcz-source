package com.badlogic.gdx;

import a3.d0;
import a3.j0;
import com.badlogic.gdx.Application;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import q1.g;
import w2.e;
import w2.i;
import w2.j;
import w2.k;
import w2.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface Net {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Protocol {
        TCP
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f11462a = "HEAD";

        /* renamed from: b, reason: collision with root package name */
        public static final String f11463b = "GET";

        /* renamed from: c, reason: collision with root package name */
        public static final String f11464c = "POST";

        /* renamed from: d, reason: collision with root package name */
        public static final String f11465d = "PUT";

        /* renamed from: e, reason: collision with root package name */
        public static final String f11466e = "PATCH";

        /* renamed from: f, reason: collision with root package name */
        public static final String f11467f = "DELETE";
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        Map<String, List<String>> a();

        InputStream b();

        String c(String str);

        String d();

        byte[] getResult();

        e getStatus();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d {
        void a();

        void b(c cVar);

        void c(Throwable th2);
    }

    boolean a(String str);

    k b(Protocol protocol, String str, int i11, l lVar);

    boolean c(b bVar);

    void d(b bVar, @d0 d dVar);

    i e(Protocol protocol, int i11, j jVar);

    i f(Protocol protocol, String str, int i11, j jVar);

    void g(b bVar);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements j0.a {

        /* renamed from: a, reason: collision with root package name */
        public String f11468a;

        /* renamed from: b, reason: collision with root package name */
        public String f11469b;

        /* renamed from: c, reason: collision with root package name */
        public Map<String, String> f11470c;

        /* renamed from: d, reason: collision with root package name */
        public int f11471d;

        /* renamed from: e, reason: collision with root package name */
        public String f11472e;

        /* renamed from: f, reason: collision with root package name */
        public InputStream f11473f;

        /* renamed from: g, reason: collision with root package name */
        public long f11474g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f11475h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f11476i;

        public b() {
            this.f11471d = 0;
            this.f11475h = true;
            this.f11476i = false;
            this.f11470c = new HashMap();
        }

        public String a() {
            return this.f11472e;
        }

        public long b() {
            return this.f11474g;
        }

        public InputStream c() {
            return this.f11473f;
        }

        public boolean d() {
            return this.f11475h;
        }

        public Map<String, String> e() {
            return this.f11470c;
        }

        public boolean f() {
            return this.f11476i;
        }

        public String g() {
            return this.f11468a;
        }

        public int h() {
            return this.f11471d;
        }

        public String i() {
            return this.f11469b;
        }

        public void j(InputStream inputStream, long j11) {
            this.f11473f = inputStream;
            this.f11474g = j11;
        }

        public void k(String str) {
            this.f11472e = str;
        }

        public void l(boolean z11) throws IllegalArgumentException {
            if (!z11 && g.f81378a.getType() == Application.ApplicationType.WebGL) {
                throw new IllegalArgumentException("Following redirects can't be disabled using the GWT/WebGL backend!");
            }
            this.f11475h = z11;
        }

        public void m(String str, String str2) {
            this.f11470c.put(str, str2);
        }

        public void n(boolean z11) {
            this.f11476i = z11;
        }

        public void o(String str) {
            this.f11468a = str;
        }

        public void p(int i11) {
            this.f11471d = i11;
        }

        public void q(String str) {
            this.f11469b = str;
        }

        @Override // a3.j0.a
        public void reset() {
            this.f11468a = null;
            this.f11469b = null;
            this.f11470c.clear();
            this.f11471d = 0;
            this.f11472e = null;
            this.f11473f = null;
            this.f11474g = 0L;
            this.f11475h = true;
        }

        public b(String str) {
            this();
            this.f11468a = str;
        }
    }
}
