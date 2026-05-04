package androidx.camera.core.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class ExifAttribute {
    public static final long BYTES_OFFSET_UNKNOWN = -1;
    static final int IFD_FORMAT_BYTE = 1;
    static final int IFD_FORMAT_DOUBLE = 12;
    static final int IFD_FORMAT_SBYTE = 6;
    static final int IFD_FORMAT_SINGLE = 11;
    static final int IFD_FORMAT_SLONG = 9;
    static final int IFD_FORMAT_SRATIONAL = 10;
    static final int IFD_FORMAT_SSHORT = 8;
    static final int IFD_FORMAT_STRING = 2;
    static final int IFD_FORMAT_ULONG = 4;
    static final int IFD_FORMAT_UNDEFINED = 7;
    static final int IFD_FORMAT_URATIONAL = 5;
    static final int IFD_FORMAT_USHORT = 3;
    private static final String TAG = "ExifAttribute";
    public final byte[] bytes;
    public final long bytesOffset;
    public final int format;
    public final int numberOfComponents;
    static final Charset ASCII = StandardCharsets.US_ASCII;
    static final String[] IFD_FORMAT_NAMES = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] IFD_FORMAT_BYTES_PER_FORMAT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] EXIF_ASCII_PREFIX = {65, 83, 67, 73, 73, 0, 0, 0};

    public ExifAttribute(int i11, int i12, byte[] bArr) {
        this(i11, i12, -1L, bArr);
    }

    @NonNull
    public static ExifAttribute createByte(@NonNull String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new ExifAttribute(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(ASCII);
        return new ExifAttribute(1, bytes.length, bytes);
    }

    @NonNull
    public static ExifAttribute createDouble(@NonNull double[] dArr, @NonNull ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[12] * dArr.length]);
        wrap.order(byteOrder);
        for (double d11 : dArr) {
            wrap.putDouble(d11);
        }
        return new ExifAttribute(12, dArr.length, wrap.array());
    }

    @NonNull
    public static ExifAttribute createSLong(@NonNull int[] iArr, @NonNull ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[9] * iArr.length]);
        wrap.order(byteOrder);
        for (int i11 : iArr) {
            wrap.putInt(i11);
        }
        return new ExifAttribute(9, iArr.length, wrap.array());
    }

    @NonNull
    public static ExifAttribute createSRational(@NonNull LongRational[] longRationalArr, @NonNull ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[10] * longRationalArr.length]);
        wrap.order(byteOrder);
        for (LongRational longRational : longRationalArr) {
            wrap.putInt((int) longRational.getNumerator());
            wrap.putInt((int) longRational.getDenominator());
        }
        return new ExifAttribute(10, longRationalArr.length, wrap.array());
    }

    @NonNull
    public static ExifAttribute createString(@NonNull String str) {
        byte[] bytes = (str + (char) 0).getBytes(ASCII);
        return new ExifAttribute(2, bytes.length, bytes);
    }

    @NonNull
    public static ExifAttribute createULong(@NonNull long[] jArr, @NonNull ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j11 : jArr) {
            wrap.putInt((int) j11);
        }
        return new ExifAttribute(4, jArr.length, wrap.array());
    }

    @NonNull
    public static ExifAttribute createURational(@NonNull LongRational[] longRationalArr, @NonNull ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[5] * longRationalArr.length]);
        wrap.order(byteOrder);
        for (LongRational longRational : longRationalArr) {
            wrap.putInt((int) longRational.getNumerator());
            wrap.putInt((int) longRational.getDenominator());
        }
        return new ExifAttribute(5, longRationalArr.length, wrap.array());
    }

    @NonNull
    public static ExifAttribute createUShort(@NonNull int[] iArr, @NonNull ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i11 : iArr) {
            wrap.putShort((short) i11);
        }
        return new ExifAttribute(3, iArr.length, wrap.array());
    }

    public double getDoubleValue(@NonNull ByteOrder byteOrder) {
        Object value = getValue(byteOrder);
        if (value == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (value instanceof String) {
            return Double.parseDouble((String) value);
        }
        if (value instanceof long[]) {
            if (((long[]) value).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (value instanceof int[]) {
            if (((int[]) value).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (value instanceof double[]) {
            double[] dArr = (double[]) value;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(value instanceof LongRational[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        LongRational[] longRationalArr = (LongRational[]) value;
        if (longRationalArr.length == 1) {
            return longRationalArr[0].toDouble();
        }
        throw new NumberFormatException("There are more than one component");
    }

    public int getIntValue(@NonNull ByteOrder byteOrder) {
        Object value = getValue(byteOrder);
        if (value == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (value instanceof String) {
            return Integer.parseInt((String) value);
        }
        if (value instanceof long[]) {
            long[] jArr = (long[]) value;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(value instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) value;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    @Nullable
    public String getStringValue(@NonNull ByteOrder byteOrder) {
        Object value = getValue(byteOrder);
        if (value == null) {
            return null;
        }
        if (value instanceof String) {
            return (String) value;
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        if (value instanceof long[]) {
            long[] jArr = (long[]) value;
            while (i11 < jArr.length) {
                sb2.append(jArr[i11]);
                i11++;
                if (i11 != jArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (value instanceof int[]) {
            int[] iArr = (int[]) value;
            while (i11 < iArr.length) {
                sb2.append(iArr[i11]);
                i11++;
                if (i11 != iArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (value instanceof double[]) {
            double[] dArr = (double[]) value;
            while (i11 < dArr.length) {
                sb2.append(dArr[i11]);
                i11++;
                if (i11 != dArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (!(value instanceof LongRational[])) {
            return null;
        }
        LongRational[] longRationalArr = (LongRational[]) value;
        while (i11 < longRationalArr.length) {
            sb2.append(longRationalArr[i11].getNumerator());
            sb2.append('/');
            sb2.append(longRationalArr[i11].getDenominator());
            i11++;
            if (i11 != longRationalArr.length) {
                sb2.append(",");
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0030: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:49), block:B:109:0x0030 */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v20, types: [int[]] */
    /* JADX WARN: Type inference failed for: r11v22, types: [long[]] */
    /* JADX WARN: Type inference failed for: r11v24, types: [androidx.camera.core.impl.utils.LongRational[]] */
    /* JADX WARN: Type inference failed for: r11v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r11v28, types: [int[]] */
    /* JADX WARN: Type inference failed for: r11v30, types: [androidx.camera.core.impl.utils.LongRational[]] */
    /* JADX WARN: Type inference failed for: r11v32, types: [double[]] */
    /* JADX WARN: Type inference failed for: r11v35, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getValue(java.nio.ByteOrder r11) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.ExifAttribute.getValue(java.nio.ByteOrder):java.lang.Object");
    }

    public int size() {
        return IFD_FORMAT_BYTES_PER_FORMAT[this.format] * this.numberOfComponents;
    }

    public String toString() {
        return j.f81006c + IFD_FORMAT_NAMES[this.format] + ", data length:" + this.bytes.length + j.f81007d;
    }

    public ExifAttribute(int i11, int i12, long j11, byte[] bArr) {
        this.format = i11;
        this.numberOfComponents = i12;
        this.bytesOffset = j11;
        this.bytes = bArr;
    }

    @NonNull
    public static ExifAttribute createDouble(double d11, @NonNull ByteOrder byteOrder) {
        return createDouble(new double[]{d11}, byteOrder);
    }

    @NonNull
    public static ExifAttribute createSLong(int i11, @NonNull ByteOrder byteOrder) {
        return createSLong(new int[]{i11}, byteOrder);
    }

    @NonNull
    public static ExifAttribute createULong(long j11, @NonNull ByteOrder byteOrder) {
        return createULong(new long[]{j11}, byteOrder);
    }

    @NonNull
    public static ExifAttribute createUShort(int i11, @NonNull ByteOrder byteOrder) {
        return createUShort(new int[]{i11}, byteOrder);
    }

    @NonNull
    public static ExifAttribute createSRational(@NonNull LongRational longRational, @NonNull ByteOrder byteOrder) {
        return createSRational(new LongRational[]{longRational}, byteOrder);
    }

    @NonNull
    public static ExifAttribute createURational(@NonNull LongRational longRational, @NonNull ByteOrder byteOrder) {
        return createURational(new LongRational[]{longRational}, byteOrder);
    }
}
