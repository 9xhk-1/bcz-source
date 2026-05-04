package wx;

import a00.a0;
import g10.u;
import io.ktor.network.tls.TLSException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import ux.i0;
import ux.l;
import xy.b0;
import y40.c0;
import y40.x;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCBCCipher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CBCCipher.kt\nio/ktor/network/tls/cipher/CBCCipher\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n*L\n1#1,127:1\n15#2,3:128\n15#2,3:131\n*S KotlinDebug\n*F\n+ 1 CBCCipher.kt\nio/ktor/network/tls/cipher/CBCCipher\n*L\n36#1:128,3\n63#1:131,3\n*E\n"})
/* loaded from: classes8.dex */
public final class b implements i {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ux.e f96944b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final byte[] f96945c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Cipher f96946d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SecretKeySpec f96947e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Mac f96948f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Cipher f96949g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SecretKeySpec f96950h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Mac f96951i;

    /* renamed from: j, reason: collision with root package name */
    public long f96952j;

    /* renamed from: k, reason: collision with root package name */
    public long f96953k;

    public b(@k ux.e suite, @k byte[] keyMaterial) {
        g0.p(suite, "suite");
        g0.p(keyMaterial, "keyMaterial");
        this.f96944b = suite;
        this.f96945c = keyMaterial;
        Cipher cipher = Cipher.getInstance(suite.x());
        g0.m(cipher);
        this.f96946d = cipher;
        this.f96947e = l.b(keyMaterial, suite);
        Mac mac = Mac.getInstance(suite.A());
        g0.m(mac);
        this.f96948f = mac;
        Cipher cipher2 = Cipher.getInstance(suite.x());
        g0.m(cipher2);
        this.f96949g = cipher2;
        this.f96950h = l.i(keyMaterial, suite);
        Mac mac2 = Mac.getInstance(suite.A());
        g0.m(mac2);
        this.f96951i = mac2;
    }

    public static final g2 d(b bVar, x cipherLoop) {
        g0.p(cipherLoop, "$this$cipherLoop");
        byte[] iv2 = bVar.f96946d.getIV();
        g0.o(iv2, "getIV(...)");
        jz.h.i(cipherLoop, iv2, 0, 0, 6, null);
        return g2.f100423a;
    }

    @Override // wx.i
    @k
    public i0 a(@k i0 record) {
        g0.p(record, "record");
        c0 a11 = record.a();
        this.f96949g.init(2, this.f96950h, new IvParameterSpec(y40.g0.d(a11, this.f96944b.u())));
        byte[] c11 = y40.g0.c(e.c(a11, this.f96949g, null, 2, null));
        int length = (c11.length - (c11[c11.length - 1] & 255)) - 1;
        int C = length - this.f96944b.C();
        g(c11, length);
        f(record, c11, C);
        y40.b bVar = new y40.b();
        jz.h.h(bVar, c11, 0, C);
        return new i0(record.b(), record.c(), bVar);
    }

    @Override // wx.i
    @k
    public i0 b(@k i0 record) {
        g0.p(record, "record");
        this.f96946d.init(1, this.f96947e, new IvParameterSpec(b0.f(this.f96944b.u())));
        byte[] c11 = y40.g0.c(record.a());
        byte[] e11 = e(record, c11);
        y40.b bVar = new y40.b();
        jz.h.i(bVar, c11, 0, 0, 6, null);
        jz.h.i(bVar, e11, 0, 0, 6, null);
        h(bVar);
        return new i0(record.b(), null, e.b(bVar, this.f96946d, new x00.l() { // from class: wx.a
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 d11;
                d11 = b.d(b.this, (x) obj);
                return d11;
            }
        }), 2, null);
    }

    public final byte[] e(i0 i0Var, byte[] bArr) {
        this.f96948f.reset();
        this.f96948f.init(l.c(this.f96945c, this.f96944b));
        byte[] bArr2 = new byte[13];
        c.b(bArr2, 0, this.f96953k);
        bArr2[8] = (byte) i0Var.b().getCode();
        bArr2[9] = 3;
        bArr2[10] = 3;
        c.c(bArr2, 11, (short) bArr.length);
        this.f96953k++;
        this.f96948f.update(bArr2);
        byte[] doFinal = this.f96948f.doFinal(bArr);
        g0.o(doFinal, "doFinal(...)");
        return doFinal;
    }

    public final void f(i0 i0Var, byte[] bArr, int i11) {
        this.f96951i.reset();
        this.f96951i.init(l.j(this.f96945c, this.f96944b));
        byte[] bArr2 = new byte[13];
        c.b(bArr2, 0, this.f96952j);
        bArr2[8] = (byte) i0Var.b().getCode();
        bArr2[9] = 3;
        bArr2[10] = 3;
        c.c(bArr2, 11, (short) i11);
        this.f96952j++;
        this.f96951i.update(bArr2);
        this.f96951i.update(bArr, 0, i11);
        byte[] doFinal = this.f96951i.doFinal();
        g0.m(doFinal);
        if (!MessageDigest.isEqual(doFinal, a0.qu(bArr, u.W1(i11, this.f96944b.C() + i11)))) {
            throw new TLSException("Failed to verify MAC content", null, 2, null);
        }
    }

    public final void g(byte[] bArr, int i11) {
        int i12 = bArr[bArr.length - 1] & 255;
        int length = bArr.length;
        while (i11 < length) {
            int i13 = bArr[i11] & 255;
            if (i12 != i13) {
                throw new TLSException("Padding invalid: expected " + i12 + ", actual " + i13, null, 2, null);
            }
            i11++;
        }
    }

    public final void h(x xVar) {
        byte blockSize = (byte) (this.f96946d.getBlockSize() - ((jz.h.f(xVar) + 1) % this.f96946d.getBlockSize()));
        int i11 = blockSize + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            xVar.u(blockSize);
        }
    }
}
