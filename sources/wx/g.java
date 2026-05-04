package wx;

import io.ktor.network.tls.TLSRecordType;
import javax.crypto.Cipher;
import jz.j;
import kotlin.jvm.internal.g0;
import m80.k;
import ux.i0;
import x00.l;
import y40.c0;
import y40.x;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g implements i {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ux.e f96957b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final byte[] f96958c;

    /* renamed from: d, reason: collision with root package name */
    public long f96959d;

    /* renamed from: e, reason: collision with root package name */
    public long f96960e;

    public g(@k ux.e suite, @k byte[] keyMaterial) {
        g0.p(suite, "suite");
        g0.p(keyMaterial, "keyMaterial");
        this.f96957b = suite;
        this.f96958c = keyMaterial;
    }

    public static final g2 d(long j11, x cipherLoop) {
        g0.p(cipherLoop, "$this$cipherLoop");
        cipherLoop.writeLong(j11);
        return g2.f100423a;
    }

    @Override // wx.i
    @k
    public i0 a(@k i0 record) {
        Cipher c11;
        g0.p(record, "record");
        c0 a11 = record.a();
        long j11 = j.j(a11);
        long readLong = a11.readLong();
        long j12 = this.f96959d;
        this.f96959d = 1 + j12;
        c11 = h.c(this.f96957b, this.f96958c, record.b(), (int) j11, readLong, j12);
        return new i0(record.b(), record.c(), e.c(a11, c11, null, 2, null));
    }

    @Override // wx.i
    @k
    public i0 b(@k i0 record) {
        Cipher d11;
        g0.p(record, "record");
        ux.e eVar = this.f96957b;
        byte[] bArr = this.f96958c;
        TLSRecordType b11 = record.b();
        int j11 = (int) j.j(record.a());
        long j12 = this.f96960e;
        d11 = h.d(eVar, bArr, b11, j11, j12, j12);
        final long j13 = this.f96960e;
        c0 b12 = e.b(record.a(), d11, new l() { // from class: wx.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 d12;
                d12 = g.d(j13, (x) obj);
                return d12;
            }
        });
        this.f96960e++;
        return new i0(record.b(), null, b12, 2, null);
    }
}
