package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.Mp4Box;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class PsshAtomUtil {
    private static final String TAG = "PsshAtomUtil";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class PsshAtom {

        @Nullable
        public final UUID[] keyIds;
        public final byte[] schemeData;
        public final UUID uuid;
        public final int version;

        public PsshAtom(UUID uuid, int i11, byte[] bArr, @Nullable UUID[] uuidArr) {
            this.uuid = uuid;
            this.version = i11;
            this.schemeData = bArr;
            this.keyIds = uuidArr;
        }
    }

    private PsshAtomUtil() {
    }

    public static byte[] buildPsshAtom(UUID uuid, @Nullable byte[] bArr) {
        return buildPsshAtom(uuid, null, bArr);
    }

    public static boolean isPsshAtom(byte[] bArr) {
        return parsePsshAtom(bArr) != null;
    }

    @Nullable
    public static PsshAtom parsePsshAtom(byte[] bArr) {
        UUID[] uuidArr;
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        if (parsableByteArray.limit() < 32) {
            return null;
        }
        parsableByteArray.setPosition(0);
        int bytesLeft = parsableByteArray.bytesLeft();
        int readInt = parsableByteArray.readInt();
        if (readInt != bytesLeft) {
            Log.w(TAG, "Advertised atom size (" + readInt + ") does not match buffer size: " + bytesLeft);
            return null;
        }
        int readInt2 = parsableByteArray.readInt();
        if (readInt2 != 1886614376) {
            Log.w(TAG, "Atom type is not pssh: " + readInt2);
            return null;
        }
        int parseFullBoxVersion = BoxParser.parseFullBoxVersion(parsableByteArray.readInt());
        if (parseFullBoxVersion > 1) {
            Log.w(TAG, "Unsupported pssh version: " + parseFullBoxVersion);
            return null;
        }
        UUID uuid = new UUID(parsableByteArray.readLong(), parsableByteArray.readLong());
        if (parseFullBoxVersion == 1) {
            int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            uuidArr = new UUID[readUnsignedIntToInt];
            for (int i11 = 0; i11 < readUnsignedIntToInt; i11++) {
                uuidArr[i11] = new UUID(parsableByteArray.readLong(), parsableByteArray.readLong());
            }
        } else {
            uuidArr = null;
        }
        int readUnsignedIntToInt2 = parsableByteArray.readUnsignedIntToInt();
        int bytesLeft2 = parsableByteArray.bytesLeft();
        if (readUnsignedIntToInt2 == bytesLeft2) {
            byte[] bArr2 = new byte[readUnsignedIntToInt2];
            parsableByteArray.readBytes(bArr2, 0, readUnsignedIntToInt2);
            return new PsshAtom(uuid, parseFullBoxVersion, bArr2, uuidArr);
        }
        Log.w(TAG, "Atom data size (" + readUnsignedIntToInt2 + ") does not match the bytes left: " + bytesLeft2);
        return null;
    }

    @Nullable
    public static byte[] parseSchemeSpecificData(byte[] bArr, UUID uuid) {
        PsshAtom parsePsshAtom = parsePsshAtom(bArr);
        if (parsePsshAtom == null) {
            return null;
        }
        if (uuid.equals(parsePsshAtom.uuid)) {
            return parsePsshAtom.schemeData;
        }
        Log.w(TAG, "UUID mismatch. Expected: " + uuid + ", got: " + parsePsshAtom.uuid + ".");
        return null;
    }

    @Nullable
    public static UUID parseUuid(byte[] bArr) {
        PsshAtom parsePsshAtom = parsePsshAtom(bArr);
        if (parsePsshAtom == null) {
            return null;
        }
        return parsePsshAtom.uuid;
    }

    public static int parseVersion(byte[] bArr) {
        PsshAtom parsePsshAtom = parsePsshAtom(bArr);
        if (parsePsshAtom == null) {
            return -1;
        }
        return parsePsshAtom.version;
    }

    public static byte[] buildPsshAtom(UUID uuid, @Nullable UUID[] uuidArr, @Nullable byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(Mp4Box.TYPE_pssh);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            allocate.putInt(0);
        } else {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }
}
