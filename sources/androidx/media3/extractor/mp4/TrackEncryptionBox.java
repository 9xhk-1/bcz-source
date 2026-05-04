package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.TrackOutput;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class TrackEncryptionBox {
    private static final String TAG = "TrackEncryptionBox";
    public final TrackOutput.CryptoData cryptoData;

    @Nullable
    public final byte[] defaultInitializationVector;
    public final boolean isEncrypted;
    public final int perSampleIvSize;

    @Nullable
    public final String schemeType;

    public TrackEncryptionBox(boolean z11, @Nullable String str, int i11, byte[] bArr, int i12, int i13, @Nullable byte[] bArr2) {
        Assertions.checkArgument((bArr2 == null) ^ (i11 == 0));
        this.isEncrypted = z11;
        this.schemeType = str;
        this.perSampleIvSize = i11;
        this.defaultInitializationVector = bArr2;
        this.cryptoData = new TrackOutput.CryptoData(schemeToCryptoMode(str), bArr, i12, i13);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int schemeToCryptoMode(@Nullable String str) {
        if (str == null) {
            return 1;
        }
        char c11 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(C.CENC_TYPE_cbc1)) {
                    c11 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals(C.CENC_TYPE_cbcs)) {
                    c11 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals(C.CENC_TYPE_cenc)) {
                    c11 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals(C.CENC_TYPE_cens)) {
                    c11 = 3;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
            case 1:
                return 2;
            default:
                Log.w(TAG, "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
