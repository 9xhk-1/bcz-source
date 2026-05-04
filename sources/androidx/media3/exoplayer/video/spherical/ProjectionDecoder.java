package androidx.media3.exoplayer.video.spherical;

import androidx.annotation.Nullable;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.video.spherical.Projection;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class ProjectionDecoder {
    private static final int MAX_COORDINATE_COUNT = 10000;
    private static final int MAX_TRIANGLE_INDICES = 128000;
    private static final int MAX_VERTEX_COUNT = 32000;
    private static final int TYPE_DFL8 = 1684433976;
    private static final int TYPE_MESH = 1835365224;
    private static final int TYPE_MSHP = 1836279920;
    private static final int TYPE_PROJ = 1886547818;
    private static final int TYPE_RAW = 1918990112;
    private static final int TYPE_YTMP = 2037673328;

    private ProjectionDecoder() {
    }

    @Nullable
    public static Projection decode(byte[] bArr, int i11) {
        ArrayList<Projection.Mesh> arrayList;
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        try {
            arrayList = isProj(parsableByteArray) ? parseProj(parsableByteArray) : parseMshp(parsableByteArray);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            return new Projection(arrayList.get(0), i11);
        }
        if (size != 2) {
            return null;
        }
        return new Projection(arrayList.get(0), arrayList.get(1), i11);
    }

    private static int decodeZigZag(int i11) {
        return (-(i11 & 1)) ^ (i11 >> 1);
    }

    private static boolean isProj(ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(4);
        int readInt = parsableByteArray.readInt();
        parsableByteArray.setPosition(0);
        return readInt == 1886547818;
    }

    @Nullable
    private static Projection.Mesh parseMesh(ParsableByteArray parsableByteArray) {
        int readInt = parsableByteArray.readInt();
        Projection.Mesh mesh = null;
        if (readInt > 10000) {
            return null;
        }
        float[] fArr = new float[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            fArr[i11] = parsableByteArray.readFloat();
        }
        int readInt2 = parsableByteArray.readInt();
        if (readInt2 > 32000) {
            return null;
        }
        double d11 = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(readInt * 2.0d) / log);
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        int i12 = 8;
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        float[] fArr2 = new float[readInt2 * 5];
        int[] iArr = new int[5];
        int i13 = 0;
        int i14 = 0;
        while (i13 < readInt2) {
            Projection.Mesh mesh2 = mesh;
            int i15 = 0;
            while (i15 < 5) {
                int decodeZigZag = iArr[i15] + decodeZigZag(parsableBitArray.readBits(ceil));
                if (decodeZigZag >= readInt || decodeZigZag < 0) {
                    return mesh2;
                }
                fArr2[i14] = fArr[decodeZigZag];
                iArr[i15] = decodeZigZag;
                i15++;
                i14++;
            }
            i13++;
            mesh = mesh2;
        }
        Projection.Mesh mesh3 = mesh;
        parsableBitArray.setPosition((parsableBitArray.getPosition() + 7) & (-8));
        int i16 = 32;
        int readBits = parsableBitArray.readBits(32);
        Projection.SubMesh[] subMeshArr = new Projection.SubMesh[readBits];
        int i17 = 0;
        while (i17 < readBits) {
            int readBits2 = parsableBitArray.readBits(i12);
            int readBits3 = parsableBitArray.readBits(i12);
            int readBits4 = parsableBitArray.readBits(i16);
            if (readBits4 > 128000) {
                return mesh3;
            }
            int i18 = readBits;
            int ceil2 = (int) Math.ceil(Math.log(readInt2 * d11) / log);
            float[] fArr3 = new float[readBits4 * 3];
            float[] fArr4 = new float[readBits4 * 2];
            int i19 = 0;
            int i21 = 0;
            while (i19 < readBits4) {
                int decodeZigZag2 = i21 + decodeZigZag(parsableBitArray.readBits(ceil2));
                if (decodeZigZag2 < 0 || decodeZigZag2 >= readInt2) {
                    return mesh3;
                }
                int i22 = i19 * 3;
                int i23 = decodeZigZag2 * 5;
                fArr3[i22] = fArr2[i23];
                fArr3[i22 + 1] = fArr2[i23 + 1];
                fArr3[i22 + 2] = fArr2[i23 + 2];
                int i24 = i19 * 2;
                fArr4[i24] = fArr2[i23 + 3];
                fArr4[i24 + 1] = fArr2[i23 + 4];
                i19++;
                i21 = decodeZigZag2;
            }
            subMeshArr[i17] = new Projection.SubMesh(readBits2, fArr3, fArr4, readBits3);
            i17++;
            readBits = i18;
            i16 = 32;
            d11 = 2.0d;
            i12 = 8;
        }
        return new Projection.Mesh(subMeshArr);
    }

    @Nullable
    private static ArrayList<Projection.Mesh> parseMshp(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.readUnsignedByte() != 0) {
            return null;
        }
        parsableByteArray.skipBytes(7);
        int readInt = parsableByteArray.readInt();
        if (readInt == TYPE_DFL8) {
            ParsableByteArray parsableByteArray2 = new ParsableByteArray();
            Inflater inflater = new Inflater(true);
            try {
                if (!Util.inflate(parsableByteArray, parsableByteArray2, inflater)) {
                    return null;
                }
                inflater.end();
                parsableByteArray = parsableByteArray2;
            } finally {
                inflater.end();
            }
        } else if (readInt != TYPE_RAW) {
            return null;
        }
        return parseRawMshpData(parsableByteArray);
    }

    @Nullable
    private static ArrayList<Projection.Mesh> parseProj(ParsableByteArray parsableByteArray) {
        int readInt;
        parsableByteArray.skipBytes(8);
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        while (position < limit && (readInt = parsableByteArray.readInt() + position) > position && readInt <= limit) {
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == TYPE_YTMP || readInt2 == TYPE_MSHP) {
                parsableByteArray.setLimit(readInt);
                return parseMshp(parsableByteArray);
            }
            parsableByteArray.setPosition(readInt);
            position = readInt;
        }
        return null;
    }

    @Nullable
    private static ArrayList<Projection.Mesh> parseRawMshpData(ParsableByteArray parsableByteArray) {
        ArrayList<Projection.Mesh> arrayList = new ArrayList<>();
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        while (position < limit) {
            int readInt = parsableByteArray.readInt() + position;
            if (readInt <= position || readInt > limit) {
                return null;
            }
            if (parsableByteArray.readInt() == TYPE_MESH) {
                Projection.Mesh parseMesh = parseMesh(parsableByteArray);
                if (parseMesh == null) {
                    return null;
                }
                arrayList.add(parseMesh);
            }
            parsableByteArray.setPosition(readInt);
            position = readInt;
        }
        return arrayList;
    }
}
