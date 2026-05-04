package androidx.media3.extractor.ts;

import androidx.media3.common.C;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class TsUtil {
    private TsUtil() {
    }

    public static int findSyncBytePosition(byte[] bArr, int i11, int i12) {
        while (i11 < i12 && bArr[i11] != 71) {
            i11++;
        }
        return i11;
    }

    public static boolean isStartOfTsPacket(byte[] bArr, int i11, int i12, int i13) {
        int i14 = 0;
        for (int i15 = -4; i15 <= 4; i15++) {
            int i16 = (i15 * 188) + i13;
            if (i16 < i11 || i16 >= i12 || bArr[i16] != 71) {
                i14 = 0;
            } else {
                i14++;
                if (i14 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long readPcrFromPacket(ParsableByteArray parsableByteArray, int i11, int i12) {
        parsableByteArray.setPosition(i11);
        if (parsableByteArray.bytesLeft() < 5) {
            return C.TIME_UNSET;
        }
        int readInt = parsableByteArray.readInt();
        if ((8388608 & readInt) != 0 || ((2096896 & readInt) >> 8) != i12 || (readInt & 32) == 0 || parsableByteArray.readUnsignedByte() < 7 || parsableByteArray.bytesLeft() < 7 || (parsableByteArray.readUnsignedByte() & 16) != 16) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[6];
        parsableByteArray.readBytes(bArr, 0, 6);
        return readPcrValueFromPcrBytes(bArr);
    }

    private static long readPcrValueFromPcrBytes(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
