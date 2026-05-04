package tx;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final y40.c0 f91177a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final l0 f91178b;

    public q(@m80.k y40.c0 packet, @m80.k l0 address) {
        kotlin.jvm.internal.g0.p(packet, "packet");
        kotlin.jvm.internal.g0.p(address, "address");
        this.f91177a = packet;
        this.f91178b = address;
        if (jz.j.j(packet) <= j60.g.f63638t) {
            return;
        }
        throw new IllegalArgumentException(("Datagram size limit exceeded: " + jz.j.j(packet) + " of possible 65535").toString());
    }

    @m80.k
    public final l0 a() {
        return this.f91178b;
    }

    @m80.k
    public final y40.c0 b() {
        return this.f91177a;
    }
}
