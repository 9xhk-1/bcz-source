package o4;

import io.ktor.utils.io.g;
import ix.k;
import kotlin.jvm.internal.g0;
import m80.k;
import mx.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c extends v.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final byte[] f75716b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ix.k f75717c;

    /* renamed from: d, reason: collision with root package name */
    public final long f75718d;

    public c(@k byte[] data, @k ix.k contentType) {
        g0.p(data, "data");
        g0.p(contentType, "contentType");
        this.f75716b = data;
        this.f75717c = contentType;
        this.f75718d = data.length;
    }

    @Override // mx.v
    @k
    public Long a() {
        return Long.valueOf(this.f75718d);
    }

    @Override // mx.v
    @k
    public ix.k b() {
        return this.f75717c;
    }

    @Override // mx.v.e
    @k
    public g m() {
        return io.ktor.utils.io.c.e(this.f75716b, 0, 0, 6, null);
    }

    public /* synthetic */ c(byte[] bArr, ix.k kVar, int i11, kotlin.jvm.internal.v vVar) {
        this(bArr, (i11 & 2) != 0 ? k.a.f62847a.j() : kVar);
    }
}
