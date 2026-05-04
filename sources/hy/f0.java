package hy;

import ix.q0;
import kotlin.LazyThreadSafetyMode;
import mx.v;
import xy.c2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nPreCompressed.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreCompressed.kt\nio/ktor/server/http/content/PreCompressedResponse\n+ 2 Headers.kt\nio/ktor/http/Headers$Companion\n*L\n1#1,217:1\n23#2:218\n*S KotlinDebug\n*F\n+ 1 PreCompressed.kt\nio/ktor/server/http/content/PreCompressedResponse\n*L\n46#1:218\n*E\n"})
/* loaded from: classes8.dex */
public final class f0 extends v.e {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final v.e f59833b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final String f59834c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final yz.c0 f59835d;

    public f0(@m80.k v.e original, @m80.l String str) {
        kotlin.jvm.internal.g0.p(original, "original");
        this.f59833b = original;
        this.f59834c = str;
        this.f59835d = yz.e0.b(LazyThreadSafetyMode.NONE, new x00.a() { // from class: hy.e0
            @Override // x00.a
            public final Object invoke() {
                ix.q0 r11;
                r11 = f0.r(f0.this);
                return r11;
            }
        });
    }

    public static final ix.q0 r(f0 f0Var) {
        if (f0Var.f59834c == null) {
            return f0Var.f59833b.d();
        }
        q0.a aVar = ix.q0.f62976a;
        ix.r0 r0Var = new ix.r0(0, 1, null);
        c2.g(r0Var, f0Var.f59833b.d(), false, new x00.p() { // from class: hy.d0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                boolean s11;
                s11 = f0.s((String) obj, (String) obj2);
                return Boolean.valueOf(s11);
            }
        }, 2, null);
        r0Var.k(ix.y0.f63006a.x(), f0Var.f59834c);
        return r0Var.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(String name, String str) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(str, "<unused var>");
        return !u30.f0.c2(name, ix.y0.f63006a.z(), true);
    }

    @Override // mx.v
    @m80.l
    public Long a() {
        return this.f59833b.a();
    }

    @Override // mx.v
    @m80.l
    public ix.k b() {
        return this.f59833b.b();
    }

    @Override // mx.v
    @m80.k
    public ix.q0 d() {
        return (ix.q0) this.f59835d.getValue();
    }

    @Override // mx.v
    @m80.l
    public <T> T e(@m80.k xy.a<T> key) {
        kotlin.jvm.internal.g0.p(key, "key");
        return (T) this.f59833b.e(key);
    }

    @Override // mx.v
    @m80.l
    public ix.g1 h() {
        return this.f59833b.h();
    }

    @Override // mx.v
    public <T> void i(@m80.k xy.a<T> key, @m80.l T t11) {
        kotlin.jvm.internal.g0.p(key, "key");
        this.f59833b.i(key, t11);
    }

    @Override // mx.v.e
    @m80.k
    public io.ktor.utils.io.g m() {
        return this.f59833b.m();
    }

    @Override // mx.v.e
    @m80.k
    public io.ktor.utils.io.g n(@m80.k g10.o range) {
        kotlin.jvm.internal.g0.p(range, "range");
        return this.f59833b.n(range);
    }
}
