package com.badlogic.gdx.utils;

import a3.x0;
import com.badlogic.gdx.utils.JsonValue;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import yz.c2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class s implements a3.d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13450a = true;

    @Override // a3.d
    public JsonValue a(v1.a aVar) {
        try {
            return b(aVar.E(8192));
        } catch (Exception e11) {
            throw new SerializationException("Error parsing file: " + aVar, e11);
        }
    }

    @Override // a3.d
    public JsonValue b(InputStream inputStream) {
        DataInputStream dataInputStream;
        DataInputStream dataInputStream2 = null;
        try {
            try {
                dataInputStream = new DataInputStream(inputStream);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e11) {
            e = e11;
        }
        try {
            JsonValue c11 = c(dataInputStream);
            x0.a(dataInputStream);
            return c11;
        } catch (IOException e12) {
            e = e12;
            throw new SerializationException(e);
        } catch (Throwable th3) {
            th = th3;
            dataInputStream2 = dataInputStream;
            x0.a(dataInputStream2);
            throw th;
        }
    }

    public JsonValue c(DataInputStream dataInputStream) throws IOException {
        try {
            return d(dataInputStream, dataInputStream.readByte());
        } finally {
            x0.a(dataInputStream);
        }
    }

    public JsonValue d(DataInputStream dataInputStream, byte b11) throws IOException {
        if (b11 == 91) {
            return e(dataInputStream);
        }
        if (b11 == 123) {
            return g(dataInputStream);
        }
        if (b11 == 90) {
            return new JsonValue(JsonValue.ValueType.nullValue);
        }
        if (b11 == 84) {
            return new JsonValue(true);
        }
        if (b11 == 70) {
            return new JsonValue(false);
        }
        if (b11 == 66) {
            return new JsonValue(m(dataInputStream));
        }
        if (b11 == 85) {
            return new JsonValue(m(dataInputStream));
        }
        if (b11 == 105) {
            return new JsonValue(this.f13450a ? dataInputStream.readShort() : dataInputStream.readByte());
        }
        if (b11 == 73) {
            return new JsonValue(this.f13450a ? dataInputStream.readInt() : dataInputStream.readShort());
        }
        if (b11 == 108) {
            return new JsonValue(dataInputStream.readInt());
        }
        if (b11 == 76) {
            return new JsonValue(dataInputStream.readLong());
        }
        if (b11 == 100) {
            return new JsonValue(dataInputStream.readFloat());
        }
        if (b11 == 68) {
            return new JsonValue(dataInputStream.readDouble());
        }
        if (b11 == 115 || b11 == 83) {
            return new JsonValue(j(dataInputStream, b11));
        }
        if (b11 == 97 || b11 == 65) {
            return f(dataInputStream, b11);
        }
        if (b11 == 67) {
            return new JsonValue(dataInputStream.readChar());
        }
        throw new GdxRuntimeException("Unrecognized data type");
    }

    public JsonValue e(DataInputStream dataInputStream) throws IOException {
        byte b11;
        JsonValue jsonValue = new JsonValue(JsonValue.ValueType.array);
        byte readByte = dataInputStream.readByte();
        if (readByte == 36) {
            b11 = dataInputStream.readByte();
            readByte = dataInputStream.readByte();
        } else {
            b11 = 0;
        }
        long j11 = -1;
        if (readByte == 35) {
            j11 = i(dataInputStream, false, -1L);
            if (j11 < 0) {
                throw new GdxRuntimeException("Unrecognized data type");
            }
            if (j11 != 0) {
                readByte = b11 == 0 ? dataInputStream.readByte() : b11;
            }
            return jsonValue;
        }
        JsonValue jsonValue2 = null;
        long j12 = 0;
        while (dataInputStream.available() > 0 && readByte != 93) {
            JsonValue d11 = d(dataInputStream, readByte);
            d11.f13157g = jsonValue;
            if (jsonValue2 != null) {
                d11.f13159i = jsonValue2;
                jsonValue2.f13158h = d11;
                jsonValue.f13160j++;
            } else {
                jsonValue.f13156f = d11;
                jsonValue.f13160j = 1;
            }
            if (j11 > 0) {
                j12++;
                if (j12 >= j11) {
                    break;
                }
            }
            jsonValue2 = d11;
            readByte = b11 == 0 ? dataInputStream.readByte() : b11;
        }
        return jsonValue;
    }

    public JsonValue f(DataInputStream dataInputStream, byte b11) throws IOException {
        byte readByte = dataInputStream.readByte();
        long n11 = b11 == 65 ? n(dataInputStream) : m(dataInputStream);
        JsonValue jsonValue = new JsonValue(JsonValue.ValueType.array);
        JsonValue jsonValue2 = null;
        long j11 = 0;
        while (j11 < n11) {
            JsonValue d11 = d(dataInputStream, readByte);
            d11.f13157g = jsonValue;
            if (jsonValue2 != null) {
                jsonValue2.f13158h = d11;
                jsonValue.f13160j++;
            } else {
                jsonValue.f13156f = d11;
                jsonValue.f13160j = 1;
            }
            j11++;
            jsonValue2 = d11;
        }
        return jsonValue;
    }

    public JsonValue g(DataInputStream dataInputStream) throws IOException {
        byte b11;
        JsonValue jsonValue = new JsonValue(JsonValue.ValueType.object);
        byte readByte = dataInputStream.readByte();
        if (readByte == 36) {
            b11 = dataInputStream.readByte();
            readByte = dataInputStream.readByte();
        } else {
            b11 = 0;
        }
        long j11 = -1;
        if (readByte == 35) {
            j11 = i(dataInputStream, false, -1L);
            if (j11 < 0) {
                throw new GdxRuntimeException("Unrecognized data type");
            }
            if (j11 != 0) {
                readByte = dataInputStream.readByte();
            }
            return jsonValue;
        }
        JsonValue jsonValue2 = null;
        long j12 = 0;
        while (dataInputStream.available() > 0 && readByte != 125) {
            String k11 = k(dataInputStream, true, readByte);
            JsonValue d11 = d(dataInputStream, b11 == 0 ? dataInputStream.readByte() : b11);
            d11.K0(k11);
            d11.f13157g = jsonValue;
            if (jsonValue2 != null) {
                d11.f13159i = jsonValue2;
                jsonValue2.f13158h = d11;
                jsonValue.f13160j++;
            } else {
                jsonValue.f13156f = d11;
                jsonValue.f13160j = 1;
            }
            if (j11 > 0) {
                j12++;
                if (j12 >= j11) {
                    break;
                }
            }
            readByte = dataInputStream.readByte();
            jsonValue2 = d11;
        }
        return jsonValue;
    }

    public long h(DataInputStream dataInputStream, byte b11, boolean z11, long j11) throws IOException {
        return b11 == 105 ? m(dataInputStream) : b11 == 73 ? o(dataInputStream) : b11 == 108 ? n(dataInputStream) : b11 == 76 ? dataInputStream.readLong() : z11 ? ((b11 & 255) << 24) | ((dataInputStream.readByte() & 255) << 16) | ((dataInputStream.readByte() & 255) << 8) | (dataInputStream.readByte() & 255) : j11;
    }

    public long i(DataInputStream dataInputStream, boolean z11, long j11) throws IOException {
        return h(dataInputStream, dataInputStream.readByte(), z11, j11);
    }

    public String j(DataInputStream dataInputStream, byte b11) throws IOException {
        return k(dataInputStream, false, b11);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String k(java.io.DataInputStream r10, boolean r11, byte r12) throws java.io.IOException {
        /*
            r9 = this;
            r0 = 83
            r1 = -1
            if (r12 != r0) goto Le
            r11 = 1
            long r1 = r9.i(r10, r11, r1)
        Lb:
            r3 = r9
            r4 = r10
            goto L24
        Le:
            r0 = 115(0x73, float:1.61E-43)
            if (r12 != r0) goto L18
            short r11 = r9.m(r10)
            long r1 = (long) r11
            goto Lb
        L18:
            if (r11 == 0) goto Lb
            r6 = 0
            r7 = -1
            r3 = r9
            r4 = r10
            r5 = r12
            long r1 = r3.h(r4, r5, r6, r7)
        L24:
            r10 = 0
            int r10 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r10 < 0) goto L34
            if (r10 <= 0) goto L31
            java.lang.String r10 = r9.l(r4, r1)
            return r10
        L31:
            java.lang.String r10 = ""
            return r10
        L34:
            com.badlogic.gdx.utils.GdxRuntimeException r10 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r11 = "Unrecognized data type, string expected"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.s.k(java.io.DataInputStream, boolean, byte):java.lang.String");
    }

    public String l(DataInputStream dataInputStream, long j11) throws IOException {
        byte[] bArr = new byte[(int) j11];
        dataInputStream.readFully(bArr);
        return new String(bArr, "UTF-8");
    }

    public short m(DataInputStream dataInputStream) throws IOException {
        return (short) (dataInputStream.readByte() & 255);
    }

    public long n(DataInputStream dataInputStream) throws IOException {
        return dataInputStream.readInt();
    }

    public int o(DataInputStream dataInputStream) throws IOException {
        return dataInputStream.readShort() & c2.f100412d;
    }
}
