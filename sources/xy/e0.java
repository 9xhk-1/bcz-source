package xy;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCrypto.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Crypto.kt\nio/ktor/util/CryptoKt__CryptoKt\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n*L\n1#1,113:1\n15#2,3:114\n*S KotlinDebug\n*F\n+ 1 Crypto.kt\nio/ktor/util/CryptoKt__CryptoKt\n*L\n59#1:114,3\n*E\n"})
/* loaded from: classes8.dex */
public final /* synthetic */ class e0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final char[] f98500a = v.b(u30.h.f91619a);

    @m80.l
    @io.ktor.utils.io.b0
    public static final Object a(@m80.k k0 k0Var, @m80.k String str, @m80.k Charset charset, @m80.k j00.c<? super byte[]> cVar) {
        k0Var.b(jz.s.l(str, charset));
        return k0Var.a(cVar);
    }

    @m80.l
    @io.ktor.utils.io.b0
    public static final Object b(@m80.k k0 k0Var, @m80.k byte[] bArr, @m80.k j00.c<? super byte[]> cVar) {
        k0Var.b(bArr);
        return k0Var.a(cVar);
    }

    public static /* synthetic */ Object c(k0 k0Var, String str, Charset charset, j00.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            charset = u30.d.f91599b;
        }
        return b0.b(k0Var, str, charset, cVar);
    }

    @m80.k
    public static final byte[] d(int i11) {
        y40.b bVar = new y40.b();
        while (jz.h.f(bVar) < i11) {
            jz.s.p(bVar, b0.e(), 0, 0, null, 14, null);
        }
        return y40.g0.d(bVar, i11);
    }

    @m80.k
    public static final String e(@m80.k byte[] bytes) {
        kotlin.jvm.internal.g0.p(bytes, "bytes");
        char[] cArr = new char[bytes.length * 2];
        char[] cArr2 = f98500a;
        int i11 = 0;
        for (byte b11 : bytes) {
            int i12 = i11 + 1;
            cArr[i11] = cArr2[(b11 & 255) >> 4];
            i11 += 2;
            cArr[i12] = cArr2[b11 & 15];
        }
        return u30.f0.L1(cArr);
    }

    @m80.k
    public static final byte[] f(@m80.k String s11) {
        kotlin.jvm.internal.g0.p(s11, "s");
        int length = s11.length() / 2;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            bArr[i11] = (byte) (Integer.parseInt(String.valueOf(s11.charAt(i12 + 1)), kotlin.text.a.a(16)) | (Integer.parseInt(String.valueOf(s11.charAt(i12)), kotlin.text.a.a(16)) << 4));
        }
        return bArr;
    }
}
