package wx;

import io.ktor.network.tls.TLSRecordType;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import ux.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nGCMCipher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GCMCipher.kt\nio/ktor/network/tls/cipher/GCMCipherKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
/* loaded from: classes8.dex */
public final class h {
    public static final Cipher c(ux.e eVar, byte[] bArr, TLSRecordType tLSRecordType, int i11, long j11, long j12) {
        Cipher cipher = Cipher.getInstance(eVar.x());
        g0.m(cipher);
        SecretKeySpec i12 = l.i(bArr, eVar);
        byte[] copyOf = Arrays.copyOf(l.h(bArr, eVar), eVar.w());
        g0.o(copyOf, "copyOf(...)");
        c.b(copyOf, eVar.u(), j11);
        cipher.init(2, i12, new GCMParameterSpec(eVar.q() * 8, copyOf));
        int w11 = (i11 - (eVar.w() - eVar.u())) - eVar.q();
        if (w11 >= 65536) {
            throw new IllegalStateException(("Content size should fit in 2 bytes, actual: " + w11).toString());
        }
        byte[] bArr2 = new byte[13];
        c.b(bArr2, 0, j12);
        bArr2[8] = (byte) tLSRecordType.getCode();
        bArr2[9] = 3;
        bArr2[10] = 3;
        c.c(bArr2, 11, (short) w11);
        cipher.updateAAD(bArr2);
        return cipher;
    }

    public static final Cipher d(ux.e eVar, byte[] bArr, TLSRecordType tLSRecordType, int i11, long j11, long j12) {
        Cipher cipher = Cipher.getInstance(eVar.x());
        g0.m(cipher);
        SecretKeySpec b11 = l.b(bArr, eVar);
        byte[] copyOf = Arrays.copyOf(l.a(bArr, eVar), eVar.w());
        g0.o(copyOf, "copyOf(...)");
        c.b(copyOf, eVar.u(), j11);
        cipher.init(1, b11, new GCMParameterSpec(eVar.q() * 8, copyOf));
        byte[] bArr2 = new byte[13];
        c.b(bArr2, 0, j12);
        bArr2[8] = (byte) tLSRecordType.getCode();
        bArr2[9] = 3;
        bArr2[10] = 3;
        c.c(bArr2, 11, (short) i11);
        cipher.updateAAD(bArr2);
        return cipher;
    }
}
