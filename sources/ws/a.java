package ws;

import kotlin.jvm.internal.g0;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class a implements i {

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final zs.e f96754a;

    public a(@m80.k zs.e transport) {
        g0.p(transport, "transport");
        this.f96754a = transport;
    }

    public static /* synthetic */ Object a(a aVar, j00.c<? super g2> cVar) {
        Object g11 = aVar.f96754a.g(cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f96754a.close();
    }

    @Override // ws.i
    @l
    public Object g(@m80.k j00.c<? super g2> cVar) {
        return a(this, cVar);
    }
}
