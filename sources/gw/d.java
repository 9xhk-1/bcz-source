package gw;

import java.security.MessageDigest;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f57830a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', io.ktor.util.date.b.f62000f, 'e', 'f'};

    public static String a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            char[] cArr = new char[32];
            int i11 = 0;
            for (int i12 = 0; i12 < 16; i12++) {
                byte b11 = digest[i12];
                int i13 = i11 + 1;
                char[] cArr2 = f57830a;
                cArr[i11] = cArr2[(b11 >>> 4) & 15];
                i11 += 2;
                cArr[i13] = cArr2[b11 & 15];
            }
            return new String(cArr);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }
}
