package tx;

import java.net.InetSocketAddress;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a0 extends l0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final InetSocketAddress f91060a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(@m80.k InetSocketAddress address) {
        super(null);
        kotlin.jvm.internal.g0.p(address, "address");
        this.f91060a = address;
    }

    public static /* synthetic */ a0 e(a0 a0Var, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = a0Var.g();
        }
        if ((i12 & 2) != 0) {
            i11 = a0Var.h();
        }
        return a0Var.d(str, i11);
    }

    @m80.k
    public final String b() {
        return g();
    }

    public final int c() {
        return h();
    }

    @m80.k
    public final a0 d(@m80.k String hostname, int i11) {
        kotlin.jvm.internal.g0.p(hostname, "hostname");
        return new a0(hostname, i11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.g0.g(a0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.g0.n(obj, "null cannot be cast to non-null type io.ktor.network.sockets.InetSocketAddress");
        return kotlin.jvm.internal.g0.g(a(), ((a0) obj).a());
    }

    @Override // tx.l0
    @m80.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InetSocketAddress a() {
        return this.f91060a;
    }

    @m80.k
    public final String g() {
        String hostName = a().getHostName();
        kotlin.jvm.internal.g0.o(hostName, "getHostName(...)");
        return hostName;
    }

    public final int h() {
        return a().getPort();
    }

    public int hashCode() {
        return a().hashCode();
    }

    @m80.k
    public String toString() {
        String inetSocketAddress = a().toString();
        kotlin.jvm.internal.g0.o(inetSocketAddress, "toString(...)");
        return inetSocketAddress;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(@m80.k String hostname, int i11) {
        this(new InetSocketAddress(hostname, i11));
        kotlin.jvm.internal.g0.p(hostname, "hostname");
    }
}
