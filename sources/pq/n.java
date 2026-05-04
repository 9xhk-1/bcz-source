package pq;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes7.dex */
public class n {
    public static String a(Context context, String str, String str2) {
        int identifier;
        if (TextUtils.isEmpty(str2) || (identifier = context.getResources().getIdentifier(str2, TypedValues.Custom.S_STRING, str)) == 0) {
            return null;
        }
        try {
            return context.getResources().getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static String b(Context context, String str, String str2, String str3) {
        try {
            return a(context, str, str2 + a.c(c(str3.getBytes("utf-8"))));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e11) {
            Log.e("ResourcesUtils", "getResources exception:" + e11.getMessage());
            return null;
        }
    }

    public static byte[] c(byte[] bArr) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("SHA-256").digest(bArr);
    }
}
