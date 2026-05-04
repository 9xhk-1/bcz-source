package io.ktor.server.engine;

import io.ktor.server.engine.a;
import java.io.File;
import java.security.KeyStore;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class p1 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements u1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t1 f61421a;

        /* renamed from: b, reason: collision with root package name */
        public final int f61422b;

        public a(o1 o1Var, int i11) {
            this.f61421a = (t1) o1Var;
            this.f61422b = i11;
        }

        @Override // io.ktor.server.engine.o1
        public int a() {
            return this.f61422b;
        }

        @Override // io.ktor.server.engine.o1
        public String b() {
            return this.f61421a.b();
        }

        @Override // io.ktor.server.engine.u1
        public String c() {
            return this.f61421a.c();
        }

        @Override // io.ktor.server.engine.u1
        public File d() {
            return this.f61421a.d();
        }

        @Override // io.ktor.server.engine.u1
        public KeyStore e() {
            return this.f61421a.e();
        }

        @Override // io.ktor.server.engine.u1
        public File f() {
            return this.f61421a.f();
        }

        @Override // io.ktor.server.engine.u1
        public x00.a<char[]> g() {
            return this.f61421a.g();
        }

        @Override // io.ktor.server.engine.o1
        public z getType() {
            return this.f61421a.getType();
        }

        @Override // io.ktor.server.engine.u1
        public List<String> h() {
            return this.f61421a.h();
        }

        @Override // io.ktor.server.engine.u1
        public x00.a<char[]> i() {
            return this.f61421a.i();
        }

        @Override // io.ktor.server.engine.u1
        public KeyStore j() {
            return this.f61421a.j();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements o1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o1 f61423a;

        /* renamed from: b, reason: collision with root package name */
        public final int f61424b;

        public b(o1 o1Var, int i11) {
            this.f61423a = o1Var;
            this.f61424b = i11;
        }

        @Override // io.ktor.server.engine.o1
        public int a() {
            return this.f61424b;
        }

        @Override // io.ktor.server.engine.o1
        public String b() {
            return this.f61423a.b();
        }

        @Override // io.ktor.server.engine.o1
        public z getType() {
            return this.f61423a.getType();
        }
    }

    public static final void a(@m80.k a.C0709a c0709a, @m80.k KeyStore keyStore, @m80.k String keyAlias, @m80.k x00.a<char[]> keyStorePassword, @m80.k x00.a<char[]> privateKeyPassword, @m80.k x00.l<? super t1, yz.g2> builder) {
        kotlin.jvm.internal.g0.p(c0709a, "<this>");
        kotlin.jvm.internal.g0.p(keyStore, "keyStore");
        kotlin.jvm.internal.g0.p(keyAlias, "keyAlias");
        kotlin.jvm.internal.g0.p(keyStorePassword, "keyStorePassword");
        kotlin.jvm.internal.g0.p(privateKeyPassword, "privateKeyPassword");
        kotlin.jvm.internal.g0.p(builder, "builder");
        List<o1> c11 = c0709a.c();
        t1 t1Var = new t1(keyStore, keyAlias, keyStorePassword, privateKeyPassword);
        builder.invoke(t1Var);
        c11.add(t1Var);
    }

    @m80.k
    public static final o1 b(@m80.k o1 o1Var, int i11) {
        kotlin.jvm.internal.g0.p(o1Var, "<this>");
        return o1Var instanceof t1 ? new a(o1Var, i11) : new b(o1Var, i11);
    }
}
