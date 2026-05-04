package xx;

import io.ktor.network.tls.extensions.TLSExtensionType;
import kotlin.jvm.internal.g0;
import m80.k;
import y40.c0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final TLSExtensionType f98482a;

    /* renamed from: b, reason: collision with root package name */
    public final int f98483b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c0 f98484c;

    public c(@k TLSExtensionType type, int i11, @k c0 packet) {
        g0.p(type, "type");
        g0.p(packet, "packet");
        this.f98482a = type;
        this.f98483b = i11;
        this.f98484c = packet;
    }

    public final int a() {
        return this.f98483b;
    }

    @k
    public final c0 b() {
        return this.f98484c;
    }

    @k
    public final TLSExtensionType c() {
        return this.f98482a;
    }
}
