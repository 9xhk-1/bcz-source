package io.ktor.server.engine;

import java.io.File;
import java.security.KeyStore;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class t1 extends n1 implements u1 {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public KeyStore f61440d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public String f61441e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public x00.a<char[]> f61442f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public x00.a<char[]> f61443g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public File f61444h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public KeyStore f61445i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    public File f61446j;

    /* renamed from: k, reason: collision with root package name */
    public int f61447k;

    /* renamed from: l, reason: collision with root package name */
    @m80.l
    public List<String> f61448l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(@m80.k KeyStore keyStore, @m80.k String keyAlias, @m80.k x00.a<char[]> keyStorePassword, @m80.k x00.a<char[]> privateKeyPassword) {
        super(z.f61475b.b());
        kotlin.jvm.internal.g0.p(keyStore, "keyStore");
        kotlin.jvm.internal.g0.p(keyAlias, "keyAlias");
        kotlin.jvm.internal.g0.p(keyStorePassword, "keyStorePassword");
        kotlin.jvm.internal.g0.p(privateKeyPassword, "privateKeyPassword");
        this.f61440d = keyStore;
        this.f61441e = keyAlias;
        this.f61442f = keyStorePassword;
        this.f61443g = privateKeyPassword;
        this.f61447k = 443;
    }

    @Override // io.ktor.server.engine.n1, io.ktor.server.engine.o1
    public int a() {
        return this.f61447k;
    }

    @Override // io.ktor.server.engine.u1
    @m80.k
    public String c() {
        return this.f61441e;
    }

    @Override // io.ktor.server.engine.u1
    @m80.l
    public File d() {
        return this.f61444h;
    }

    @Override // io.ktor.server.engine.u1
    @m80.l
    public KeyStore e() {
        return this.f61445i;
    }

    @Override // io.ktor.server.engine.u1
    @m80.l
    public File f() {
        return this.f61446j;
    }

    @Override // io.ktor.server.engine.u1
    @m80.k
    public x00.a<char[]> g() {
        return this.f61443g;
    }

    @Override // io.ktor.server.engine.u1
    @m80.l
    public List<String> h() {
        return this.f61448l;
    }

    @Override // io.ktor.server.engine.u1
    @m80.k
    public x00.a<char[]> i() {
        return this.f61442f;
    }

    @Override // io.ktor.server.engine.u1
    @m80.k
    public KeyStore j() {
        return this.f61440d;
    }

    @Override // io.ktor.server.engine.n1
    public void l(int i11) {
        this.f61447k = i11;
    }

    public void m(@m80.l List<String> list) {
        this.f61448l = list;
    }

    public void n(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<set-?>");
        this.f61441e = str;
    }

    public void o(@m80.k KeyStore keyStore) {
        kotlin.jvm.internal.g0.p(keyStore, "<set-?>");
        this.f61440d = keyStore;
    }

    public void p(@m80.k x00.a<char[]> aVar) {
        kotlin.jvm.internal.g0.p(aVar, "<set-?>");
        this.f61442f = aVar;
    }

    public void q(@m80.l File file) {
        this.f61444h = file;
    }

    public void r(@m80.k x00.a<char[]> aVar) {
        kotlin.jvm.internal.g0.p(aVar, "<set-?>");
        this.f61443g = aVar;
    }

    public void s(@m80.l KeyStore keyStore) {
        this.f61445i = keyStore;
    }

    public void t(@m80.l File file) {
        this.f61446j = file;
    }
}
