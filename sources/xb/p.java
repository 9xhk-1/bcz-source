package xb;

import android.content.Context;
import java.security.MessageDigest;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public static final String f97983a = "SignatureUtils";

    public static String a(Context context) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            byte[] byteArray = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray();
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(byteArray);
            byte[] digest = messageDigest.digest();
            for (int i11 = 0; i11 < digest.length; i11++) {
                if (Integer.toHexString(digest[i11] & 255).length() == 1) {
                    stringBuffer.append("0");
                    stringBuffer.append(Integer.toHexString(digest[i11] & 255));
                } else {
                    stringBuffer.append(Integer.toHexString(digest[i11] & 255));
                }
            }
        } catch (Exception e11) {
            qb.c.c(f97983a, "", e11);
        }
        return stringBuffer.toString();
    }
}
