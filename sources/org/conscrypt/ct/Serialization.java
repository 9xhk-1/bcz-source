package org.conscrypt.ct;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class Serialization {
    private static final int DER_LENGTH_LONG_FORM_FLAG = 128;
    private static final int DER_TAG_MASK = 63;
    private static final int DER_TAG_OCTET_STRING = 4;

    private Serialization() {
    }

    public static byte readByte(InputStream inputStream) throws SerializationException {
        try {
            int read = inputStream.read();
            if (read != -1) {
                return (byte) read;
            }
            throw new SerializationException("Premature end of input, could not read byte.");
        } catch (IOException e11) {
            throw new SerializationException(e11);
        }
    }

    public static byte[] readDEROctetString(byte[] bArr) throws SerializationException {
        return readDEROctetString(new ByteArrayInputStream(bArr));
    }

    public static byte[] readFixedBytes(InputStream inputStream, int i11) throws SerializationException {
        try {
            if (i11 < 0) {
                throw new SerializationException("Negative length: " + i11);
            }
            byte[] bArr = new byte[i11];
            int read = inputStream.read(bArr);
            if (read >= i11) {
                return bArr;
            }
            throw new SerializationException("Premature end of input, expected " + i11 + " bytes, only read " + read);
        } catch (IOException e11) {
            throw new SerializationException(e11);
        }
    }

    public static byte[][] readList(byte[] bArr, int i11, int i12) throws SerializationException {
        return readList(new ByteArrayInputStream(bArr), i11, i12);
    }

    public static long readLong(InputStream inputStream, int i11) throws SerializationException {
        if (i11 > 8 || i11 < 0) {
            throw new IllegalArgumentException("Invalid width: " + i11);
        }
        long j11 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            j11 = (j11 << 8) | (readByte(inputStream) & 255);
        }
        return j11;
    }

    public static int readNumber(InputStream inputStream, int i11) throws SerializationException {
        if (i11 > 4 || i11 < 0) {
            throw new SerializationException("Invalid width: " + i11);
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 = (i12 << 8) | (readByte(inputStream) & 255);
        }
        return i12;
    }

    public static byte[] readVariableBytes(InputStream inputStream, int i11) throws SerializationException {
        return readFixedBytes(inputStream, readNumber(inputStream, i11));
    }

    public static void writeFixedBytes(OutputStream outputStream, byte[] bArr) throws SerializationException {
        try {
            outputStream.write(bArr);
        } catch (IOException e11) {
            throw new SerializationException(e11);
        }
    }

    public static void writeNumber(OutputStream outputStream, long j11, int i11) throws SerializationException {
        if (i11 < 0) {
            throw new SerializationException("Negative width: " + i11);
        }
        if (i11 < 8 && j11 >= (1 << (i11 * 8))) {
            throw new SerializationException("Number too large, " + j11 + " does not fit in " + i11 + " bytes");
        }
        while (i11 > 0) {
            if ((i11 - 1) * 8 < 64) {
                try {
                    outputStream.write((byte) ((j11 >> ((int) r0)) & 255));
                } catch (IOException e11) {
                    throw new SerializationException(e11);
                }
            } else {
                outputStream.write(0);
            }
            i11--;
        }
    }

    public static void writeVariableBytes(OutputStream outputStream, byte[] bArr, int i11) throws SerializationException {
        writeNumber(outputStream, bArr.length, i11);
        writeFixedBytes(outputStream, bArr);
    }

    public static byte[] readDEROctetString(InputStream inputStream) throws SerializationException {
        int readByte = readByte(inputStream) & 63;
        if (readByte == 4) {
            int readNumber = readNumber(inputStream, 1);
            if ((readNumber & 128) != 0) {
                readNumber = readNumber(inputStream, readNumber & (-129));
            }
            return readFixedBytes(inputStream, readNumber);
        }
        throw new SerializationException("Wrong DER tag, expected OCTET STRING, got " + readByte);
    }

    public static byte[][] readList(InputStream inputStream, int i11, int i12) throws SerializationException {
        ArrayList arrayList = new ArrayList();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(readVariableBytes(inputStream, i11));
        while (byteArrayInputStream.available() > 0) {
            try {
                arrayList.add(readVariableBytes(byteArrayInputStream, i12));
            } catch (IOException e11) {
                throw new SerializationException(e11);
            }
        }
        return (byte[][]) arrayList.toArray(new byte[arrayList.size()][]);
    }
}
