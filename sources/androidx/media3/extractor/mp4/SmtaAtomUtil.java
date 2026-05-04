package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class SmtaAtomUtil {
    private static final int CAMCORDER_FRC_SUPERSLOW_MOTION = 9;
    private static final int CAMCORDER_FRC_SUPERSLOW_MOTION_HEVC = 22;
    private static final int CAMCORDER_NORMAL = 0;
    private static final int CAMCORDER_QFRC_SUPERSLOW_MOTION = 23;
    private static final int CAMCORDER_SINGLE_SUPERSLOW_MOTION = 7;
    private static final int CAMCORDER_SLOW_MOTION_V2 = 12;
    private static final int CAMCORDER_SLOW_MOTION_V2_120 = 13;
    private static final int CAMCORDER_SLOW_MOTION_V2_HEVC = 21;
    private static final int NO_VALUE = -1;

    private SmtaAtomUtil() {
    }

    private static int getCaptureFrameRate(int i11, ParsableByteArray parsableByteArray, int i12) {
        if (i11 == 12) {
            return 240;
        }
        if (i11 == 13) {
            return 120;
        }
        if (i11 == 21 && parsableByteArray.bytesLeft() >= 8 && parsableByteArray.getPosition() + 8 <= i12) {
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            if (readInt >= 12 && readInt2 == 1936877170) {
                return parsableByteArray.readUnsignedFixedPoint1616();
            }
        }
        return C.RATE_UNSET_INT;
    }

    @Nullable
    public static Metadata parseSmta(ParsableByteArray parsableByteArray, int i11) {
        parsableByteArray.skipBytes(12);
        while (parsableByteArray.getPosition() < i11) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1935766900) {
                if (readInt < 16) {
                    return null;
                }
                parsableByteArray.skipBytes(4);
                int i12 = -1;
                int i13 = 0;
                for (int i14 = 0; i14 < 2; i14++) {
                    int readUnsignedByte = parsableByteArray.readUnsignedByte();
                    int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                    if (readUnsignedByte == 0) {
                        i12 = readUnsignedByte2;
                    } else if (readUnsignedByte == 1) {
                        i13 = readUnsignedByte2;
                    }
                }
                int captureFrameRate = getCaptureFrameRate(i12, parsableByteArray, i11);
                if (captureFrameRate == -2147483647) {
                    return null;
                }
                return new Metadata(new SmtaMetadataEntry(captureFrameRate, i13));
            }
            parsableByteArray.setPosition(position + readInt);
        }
        return null;
    }
}
