package com.xiaomi.push;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.GZIPInputStream;

/* loaded from: classes8.dex */
public class fo {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f45574a = {80, 85, 83, 72};

    /* renamed from: a, reason: collision with other field name */
    private byte f422a;

    /* renamed from: a, reason: collision with other field name */
    private int f423a;

    /* renamed from: a, reason: collision with other field name */
    private short f424a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f45575b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f45576a = new c();

        /* renamed from: a, reason: collision with other field name */
        public static final d f425a = new d();

        public static byte[] a(byte[] bArr) {
            return a(bArr, f425a);
        }

        public static byte[] a(byte[] bArr, b bVar) {
            if (!fo.m5954a(bArr)) {
                return bArr;
            }
            fo a11 = fo.a(bArr);
            return (a11.f422a == 0 || a11.f422a != bVar.a()) ? a11.f45575b : bVar.a(a11.f45575b, a11.f423a);
        }
    }

    public interface b {
        byte a();

        byte[] a(byte[] bArr, int i11);
    }

    public static final class c {
    }

    public static final class d implements b {
        @Override // com.xiaomi.push.fo.b
        public byte a() {
            return (byte) 2;
        }

        @Override // com.xiaomi.push.fo.b
        public byte[] a(byte[] bArr, int i11) {
            GZIPInputStream gZIPInputStream = null;
            try {
                GZIPInputStream gZIPInputStream2 = new GZIPInputStream(new ByteArrayInputStream(bArr), i11);
                try {
                    byte[] bArr2 = new byte[i11];
                    gZIPInputStream2.read(bArr2);
                    try {
                        gZIPInputStream2.close();
                    } catch (IOException unused) {
                    }
                    return bArr2;
                } catch (IOException unused2) {
                    gZIPInputStream = gZIPInputStream2;
                    if (gZIPInputStream != null) {
                        try {
                            gZIPInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return bArr;
                } catch (Throwable th2) {
                    th = th2;
                    gZIPInputStream = gZIPInputStream2;
                    if (gZIPInputStream != null) {
                        try {
                            gZIPInputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused5) {
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public fo(byte b11, int i11, byte[] bArr) {
        this((short) 1, b11, i11, bArr);
    }

    public fo(short s11, byte b11, int i11, byte[] bArr) {
        this.f424a = s11;
        this.f422a = b11;
        this.f423a = i11;
        this.f45575b = bArr;
    }

    public static fo a(byte b11, int i11, byte[] bArr) {
        return new fo(b11, i11, bArr);
    }

    public static fo a(short s11, byte b11, int i11, byte[] bArr) {
        return new fo(s11, b11, i11, bArr);
    }

    public static fo a(byte[] bArr) {
        if (!m5954a(bArr)) {
            return a((byte) 0, bArr.length, bArr);
        }
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
        order.getInt();
        short s11 = order.getShort();
        byte b11 = order.get();
        int i11 = order.getInt();
        byte[] bArr2 = new byte[order.getInt()];
        order.get(bArr2);
        return a(s11, b11, i11, bArr2);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m5954a(byte[] bArr) {
        byte[] bArr2 = f45574a;
        return a(bArr2, bArr, bArr2.length);
    }

    public static boolean a(byte[] bArr, byte[] bArr2, int i11) {
        if (bArr.length < i11 || bArr2.length < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (bArr[i12] != bArr2[i12]) {
                return false;
            }
        }
        return true;
    }
}
