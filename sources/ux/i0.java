package ux;

import io.ktor.network.tls.TLSRecordType;
import io.ktor.network.tls.TLSVersion;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final TLSRecordType f92616a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final TLSVersion f92617b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final y40.c0 f92618c;

    public i0() {
        this(null, null, null, 7, null);
    }

    @m80.k
    public final y40.c0 a() {
        return this.f92618c;
    }

    @m80.k
    public final TLSRecordType b() {
        return this.f92616a;
    }

    @m80.k
    public final TLSVersion c() {
        return this.f92617b;
    }

    public i0(@m80.k TLSRecordType type, @m80.k TLSVersion version, @m80.k y40.c0 packet) {
        kotlin.jvm.internal.g0.p(type, "type");
        kotlin.jvm.internal.g0.p(version, "version");
        kotlin.jvm.internal.g0.p(packet, "packet");
        this.f92616a = type;
        this.f92617b = version;
        this.f92618c = packet;
    }

    public /* synthetic */ i0(TLSRecordType tLSRecordType, TLSVersion tLSVersion, y40.c0 c0Var, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? TLSRecordType.Handshake : tLSRecordType, (i11 & 2) != 0 ? TLSVersion.TLS12 : tLSVersion, (i11 & 4) != 0 ? jz.j.i() : c0Var);
    }
}
