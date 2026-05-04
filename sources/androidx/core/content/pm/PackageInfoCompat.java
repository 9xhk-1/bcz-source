package androidx.core.content.pm;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.Size;
import androidx.media3.common.C;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class PackageInfoCompat {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
        }

        @Nullable
        @DoNotInline
        public static Signature[] getApkContentsSigners(@NonNull SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        @DoNotInline
        public static long getLongVersionCode(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }

        @Nullable
        @DoNotInline
        public static Signature[] getSigningCertificateHistory(@NonNull SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        @DoNotInline
        public static boolean hasMultipleSigners(@NonNull SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        @DoNotInline
        public static boolean hasSigningCertificate(@NonNull PackageManager packageManager, @NonNull String str, @NonNull byte[] bArr, int i11) {
            return packageManager.hasSigningCertificate(str, bArr, i11);
        }
    }

    private PackageInfoCompat() {
    }

    private static boolean byteArrayContains(@NonNull byte[][] bArr, @NonNull byte[] bArr2) {
        for (byte[] bArr3 : bArr) {
            if (Arrays.equals(bArr2, bArr3)) {
                return true;
            }
        }
        return false;
    }

    private static byte[] computeSHA256Digest(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA256").digest(bArr);
        } catch (NoSuchAlgorithmException e11) {
            throw new RuntimeException("Device doesn't support SHA256 cert checking", e11);
        }
    }

    public static long getLongVersionCode(@NonNull PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Api28Impl.getLongVersionCode(packageInfo) : packageInfo.versionCode;
    }

    @NonNull
    public static List<Signature> getSignatures(@NonNull PackageManager packageManager, @NonNull String str) throws PackageManager.NameNotFoundException {
        Signature[] signatureArr;
        SigningInfo signingInfo;
        if (Build.VERSION.SDK_INT >= 28) {
            signingInfo = packageManager.getPackageInfo(str, C.BUFFER_FLAG_FIRST_SAMPLE).signingInfo;
            signatureArr = Api28Impl.hasMultipleSigners(signingInfo) ? Api28Impl.getApkContentsSigners(signingInfo) : Api28Impl.getSigningCertificateHistory(signingInfo);
        } else {
            signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        }
        return signatureArr == null ? Collections.EMPTY_LIST : Arrays.asList(signatureArr);
    }

    public static boolean hasSignatures(@NonNull PackageManager packageManager, @NonNull String str, @NonNull @Size(min = 1) Map<byte[], Integer> map, boolean z11) throws PackageManager.NameNotFoundException {
        byte[][] bArr;
        if (map.isEmpty()) {
            return false;
        }
        Set<byte[]> keySet = map.keySet();
        for (byte[] bArr2 : keySet) {
            if (bArr2 == null) {
                throw new IllegalArgumentException("Cert byte array cannot be null when verifying " + str);
            }
            Integer num = map.get(bArr2);
            if (num == null) {
                throw new IllegalArgumentException("Type must be specified for cert when verifying " + str);
            }
            int intValue = num.intValue();
            if (intValue != 0 && intValue != 1) {
                throw new IllegalArgumentException("Unsupported certificate type " + num + " when verifying " + str);
            }
        }
        List<Signature> signatures = getSignatures(packageManager, str);
        if (!z11 && Build.VERSION.SDK_INT >= 28) {
            for (byte[] bArr3 : keySet) {
                if (!Api28Impl.hasSigningCertificate(packageManager, str, bArr3, map.get(bArr3).intValue())) {
                    return false;
                }
            }
            return true;
        }
        if (signatures.size() != 0 && map.size() <= signatures.size() && (!z11 || map.size() == signatures.size())) {
            if (map.containsValue(1)) {
                bArr = new byte[signatures.size()][];
                for (int i11 = 0; i11 < signatures.size(); i11++) {
                    bArr[i11] = computeSHA256Digest(signatures.get(i11).toByteArray());
                }
            } else {
                bArr = null;
            }
            Iterator<byte[]> it = keySet.iterator();
            if (it.hasNext()) {
                byte[] next = it.next();
                Integer num2 = map.get(next);
                int intValue2 = num2.intValue();
                if (intValue2 != 0) {
                    if (intValue2 != 1) {
                        throw new IllegalArgumentException("Unsupported certificate type " + num2);
                    }
                    if (!byteArrayContains(bArr, next)) {
                        return false;
                    }
                } else if (!signatures.contains(new Signature(next))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
