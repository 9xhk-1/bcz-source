package androidx.camera.core.internal.compat.workaround;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class InvalidJpegDataParser {
    private final LargeJpegImageQuirk mQuirk = (LargeJpegImageQuirk) DeviceQuirks.get(LargeJpegImageQuirk.class);

    @VisibleForTesting
    public static int getJfifEoiMarkEndPosition(@NonNull byte[] bArr) {
        byte b11;
        int i11 = 2;
        while (i11 + 4 <= bArr.length && (b11 = bArr[i11]) == -1) {
            int i12 = i11 + 2;
            int i13 = ((bArr[i12] & 255) << 8) | (bArr[i11 + 3] & 255);
            if (b11 == -1 && bArr[i11 + 1] == -38) {
                while (true) {
                    int i14 = i12 + 2;
                    if (i14 > bArr.length) {
                        return -1;
                    }
                    if (bArr[i12] == -1 && bArr[i12 + 1] == -39) {
                        return i14;
                    }
                    i12++;
                }
            } else {
                i11 += i13 + 2;
            }
        }
        return -1;
    }

    public int getValidDataLength(@NonNull byte[] bArr) {
        LargeJpegImageQuirk largeJpegImageQuirk = this.mQuirk;
        if (largeJpegImageQuirk == null || !largeJpegImageQuirk.shouldCheckInvalidJpegData(bArr)) {
            return bArr.length;
        }
        int jfifEoiMarkEndPosition = getJfifEoiMarkEndPosition(bArr);
        return jfifEoiMarkEndPosition != -1 ? jfifEoiMarkEndPosition : bArr.length;
    }
}
