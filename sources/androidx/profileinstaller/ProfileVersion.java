package androidx.profileinstaller;

import androidx.annotation.RestrictTo;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public class ProfileVersion {
    public static final int MIN_SUPPORTED_SDK = 24;
    static final byte[] V015_S = {48, 49, 53, 0};
    static final byte[] V010_P = {48, 49, 48, 0};
    static final byte[] V009_O_MR1 = {48, 48, 57, 0};
    static final byte[] V005_O = {48, 48, 53, 0};
    static final byte[] V001_N = {48, 48, 49, 0};
    static final byte[] METADATA_V001_N = {48, 48, 49, 0};
    static final byte[] METADATA_V002 = {48, 48, 50, 0};

    private ProfileVersion() {
    }

    public static String dexKeySeparator(byte[] bArr) {
        return (Arrays.equals(bArr, V001_N) || Arrays.equals(bArr, V005_O)) ? ":" : "!";
    }
}
