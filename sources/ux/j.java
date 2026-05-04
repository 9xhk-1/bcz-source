package ux;

import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.SecretKey;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j {
    @m80.k
    public static final byte[] a(@m80.k SecretKey secret, @m80.k byte[] label, @m80.k byte[] seed, int i11) {
        kotlin.jvm.internal.g0.p(secret, "secret");
        kotlin.jvm.internal.g0.p(label, "label");
        kotlin.jvm.internal.g0.p(seed, "seed");
        byte[] g32 = a00.q.g3(label, seed);
        Mac mac = Mac.getInstance(secret.getAlgorithm());
        kotlin.jvm.internal.g0.o(mac, "getInstance(...)");
        return c(g32, mac, secret, i11);
    }

    public static /* synthetic */ byte[] b(SecretKey secretKey, byte[] bArr, byte[] bArr2, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i11 = 12;
        }
        return a(secretKey, bArr, bArr2, i11);
    }

    public static final byte[] c(byte[] bArr, Mac mac, SecretKey secretKey, int i11) {
        if (i11 < 12) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        byte[] bArr2 = new byte[0];
        byte[] bArr3 = bArr;
        while (bArr2.length < i11) {
            mac.reset();
            SecretKey secretKey2 = secretKey;
            mac.init(secretKey2);
            mac.update(bArr3);
            bArr3 = mac.doFinal();
            mac.reset();
            mac.init(secretKey2);
            mac.update(bArr3);
            mac.update(bArr);
            byte[] doFinal = mac.doFinal();
            kotlin.jvm.internal.g0.o(doFinal, "doFinal(...)");
            bArr2 = a00.q.g3(bArr2, doFinal);
        }
        byte[] copyOf = Arrays.copyOf(bArr2, i11);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static /* synthetic */ byte[] d(byte[] bArr, Mac mac, SecretKey secretKey, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i11 = 12;
        }
        return c(bArr, mac, secretKey, i11);
    }
}
