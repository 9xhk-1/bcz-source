package androidx.media3.extractor;

import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class CeaUtil {
    private static final int COUNTRY_CODE = 181;
    private static final int PAYLOAD_TYPE_CC = 4;
    private static final int PROVIDER_CODE_ATSC = 49;
    private static final int PROVIDER_CODE_DIRECTV = 47;
    private static final String TAG = "CeaUtil";
    public static final int USER_DATA_IDENTIFIER_GA94 = 1195456820;
    public static final int USER_DATA_TYPE_CODE_MPEG_CC = 3;

    private CeaUtil() {
    }

    public static void consume(long j11, ParsableByteArray parsableByteArray, TrackOutput[] trackOutputArr) {
        while (true) {
            if (parsableByteArray.bytesLeft() <= 1) {
                return;
            }
            int readNon255TerminatedValue = readNon255TerminatedValue(parsableByteArray);
            int readNon255TerminatedValue2 = readNon255TerminatedValue(parsableByteArray);
            int position = parsableByteArray.getPosition() + readNon255TerminatedValue2;
            if (readNon255TerminatedValue2 == -1 || readNon255TerminatedValue2 > parsableByteArray.bytesLeft()) {
                Log.w(TAG, "Skipping remainder of malformed SEI NAL unit.");
                position = parsableByteArray.limit();
            } else if (readNon255TerminatedValue == 4 && readNon255TerminatedValue2 >= 8) {
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                int readUnsignedShort = parsableByteArray.readUnsignedShort();
                int readInt = readUnsignedShort == 49 ? parsableByteArray.readInt() : 0;
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                if (readUnsignedShort == 47) {
                    parsableByteArray.skipBytes(1);
                }
                boolean z11 = readUnsignedByte == 181 && (readUnsignedShort == 49 || readUnsignedShort == 47) && readUnsignedByte2 == 3;
                if (readUnsignedShort == 49) {
                    z11 &= readInt == 1195456820;
                }
                if (z11) {
                    consumeCcData(j11, parsableByteArray, trackOutputArr);
                }
            }
            parsableByteArray.setPosition(position);
        }
    }

    public static void consumeCcData(long j11, ParsableByteArray parsableByteArray, TrackOutput[] trackOutputArr) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if ((readUnsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(1);
            int i11 = (readUnsignedByte & 31) * 3;
            int position = parsableByteArray.getPosition();
            for (TrackOutput trackOutput : trackOutputArr) {
                parsableByteArray.setPosition(position);
                trackOutput.sampleData(parsableByteArray, i11);
                Assertions.checkState(j11 != C.TIME_UNSET);
                trackOutput.sampleMetadata(j11, 1, i11, 0, null);
            }
        }
    }

    private static int readNon255TerminatedValue(ParsableByteArray parsableByteArray) {
        int i11 = 0;
        while (parsableByteArray.bytesLeft() != 0) {
            int readUnsignedByte = parsableByteArray.readUnsignedByte();
            i11 += readUnsignedByte;
            if (readUnsignedByte != 255) {
                return i11;
            }
        }
        return -1;
    }
}
