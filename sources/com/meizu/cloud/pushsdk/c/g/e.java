package com.meizu.cloud.pushsdk.c.g;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* loaded from: classes7.dex */
public class e implements Serializable, Comparable<e> {

    /* renamed from: a, reason: collision with root package name */
    static final char[] f39643a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', io.ktor.util.date.b.f62000f, 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    public static final e f39644b = a(new byte[0]);
    private static final long serialVersionUID = 1;

    /* renamed from: c, reason: collision with root package name */
    final byte[] f39645c;

    /* renamed from: d, reason: collision with root package name */
    transient int f39646d;

    /* renamed from: e, reason: collision with root package name */
    transient String f39647e;

    public e(byte[] bArr) {
        this.f39645c = bArr;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        e a11 = a(objectInputStream, objectInputStream.readInt());
        try {
            Field declaredField = e.class.getDeclaredField("c");
            declaredField.setAccessible(true);
            declaredField.set(this, a11.f39645c);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (NoSuchFieldException unused2) {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f39645c.length);
        objectOutputStream.write(this.f39645c);
    }

    public byte a(int i11) {
        return this.f39645c[i11];
    }

    public e b() {
        return b("MD5");
    }

    public String c() {
        byte[] bArr = this.f39645c;
        char[] cArr = new char[bArr.length * 2];
        int i11 = 0;
        for (byte b11 : bArr) {
            int i12 = i11 + 1;
            char[] cArr2 = f39643a;
            cArr[i11] = cArr2[(b11 >> 4) & 15];
            i11 += 2;
            cArr[i12] = cArr2[b11 & 15];
        }
        return new String(cArr);
    }

    public int d() {
        return this.f39645c.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            int d11 = eVar.d();
            byte[] bArr = this.f39645c;
            if (d11 == bArr.length && eVar.a(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.f39646d;
        if (i11 != 0) {
            return i11;
        }
        int hashCode = Arrays.hashCode(this.f39645c);
        this.f39646d = hashCode;
        return hashCode;
    }

    public String toString() {
        byte[] bArr = this.f39645c;
        if (bArr.length == 0) {
            return "ByteString[size=0]";
        }
        int length = bArr.length;
        Integer valueOf = Integer.valueOf(bArr.length);
        return length <= 16 ? String.format("ByteString[size=%s data=%s]", valueOf, c()) : String.format("ByteString[size=%s md5=%s]", valueOf, b().c());
    }

    private e b(String str) {
        try {
            return a(MessageDigest.getInstance(str).digest(this.f39645c));
        } catch (NoSuchAlgorithmException e11) {
            throw new AssertionError(e11);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(e eVar) {
        int d11 = d();
        int d12 = eVar.d();
        int min = Math.min(d11, d12);
        for (int i11 = 0; i11 < min; i11++) {
            int a11 = a(i11) & 255;
            int a12 = eVar.a(i11) & 255;
            if (a11 != a12) {
                return a11 < a12 ? -1 : 1;
            }
        }
        if (d11 == d12) {
            return 0;
        }
        return d11 < d12 ? -1 : 1;
    }

    public static e a(InputStream inputStream, int i11) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + i11);
        }
        byte[] bArr = new byte[i11];
        int i12 = 0;
        while (i12 < i11) {
            int read = inputStream.read(bArr, i12, i11 - i12);
            if (read == -1) {
                throw new EOFException();
            }
            i12 += read;
        }
        return new e(bArr);
    }

    public static e a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        e eVar = new e(str.getBytes(o.f39673a));
        eVar.f39647e = str;
        return eVar;
    }

    public static e a(byte... bArr) {
        if (bArr != null) {
            return new e((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public String a() {
        String str = this.f39647e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f39645c, o.f39673a);
        this.f39647e = str2;
        return str2;
    }

    public void a(b bVar) {
        byte[] bArr = this.f39645c;
        bVar.c(bArr, 0, bArr.length);
    }

    public boolean a(int i11, byte[] bArr, int i12, int i13) {
        byte[] bArr2 = this.f39645c;
        return i11 <= bArr2.length - i13 && i12 <= bArr.length - i13 && o.a(bArr2, i11, bArr, i12, i13);
    }
}
