package z10;

import a00.k1;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import n10.o;
import s20.y;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h extends c {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ h10.n<Object>[] f100615h = {o0.u(new PropertyReference1Impl(o0.d(h.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final d30.i f100616g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@m80.l f20.a aVar, @m80.k b20.k c11) {
        super(c11, aVar, o.a.f74077y);
        g0.p(c11, "c");
        this.f100616g = c11.e().f(g.f100614a);
    }

    public static final Map i() {
        return k1.k(h1.a(d.f100605a.b(), new y("Deprecated in Java")));
    }

    @Override // z10.c, q10.c
    @m80.k
    public Map<n20.f, s20.g<?>> a() {
        return (Map) d30.m.a(this.f100616g, this, f100615h[0]);
    }
}
