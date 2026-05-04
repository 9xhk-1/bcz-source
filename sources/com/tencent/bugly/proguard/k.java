package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    protected String f42610a = "GBK";

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer f42611b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public byte f42612a;

        /* renamed from: b, reason: collision with root package name */
        public int f42613b;
    }

    public k() {
    }

    private boolean b(int i11) {
        int i12;
        try {
            a aVar = new a();
            while (true) {
                int a11 = a(aVar, this.f42611b.duplicate());
                i12 = aVar.f42613b;
                if (i11 <= i12 || aVar.f42612a == 11) {
                    break;
                }
                a(a11);
                a(aVar.f42612a);
            }
        } catch (h | BufferUnderflowException unused) {
        }
        return i11 == i12;
    }

    private boolean[] d(int i11, boolean z11) {
        if (!b(i11)) {
            if (z11) {
                throw new h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar);
        if (aVar.f42612a != 9) {
            throw new h("type mismatch.");
        }
        int a11 = a(0, 0, true);
        if (a11 < 0) {
            throw new h("size invalid: ".concat(String.valueOf(a11)));
        }
        boolean[] zArr = new boolean[a11];
        for (int i12 = 0; i12 < a11; i12++) {
            zArr[i12] = a(0, true);
        }
        return zArr;
    }

    private short[] e(int i11, boolean z11) {
        if (!b(i11)) {
            if (z11) {
                throw new h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar);
        if (aVar.f42612a != 9) {
            throw new h("type mismatch.");
        }
        int a11 = a(0, 0, true);
        if (a11 < 0) {
            throw new h("size invalid: ".concat(String.valueOf(a11)));
        }
        short[] sArr = new short[a11];
        for (int i12 = 0; i12 < a11; i12++) {
            sArr[i12] = a(sArr[0], 0, true);
        }
        return sArr;
    }

    private int[] f(int i11, boolean z11) {
        if (!b(i11)) {
            if (z11) {
                throw new h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar);
        if (aVar.f42612a != 9) {
            throw new h("type mismatch.");
        }
        int a11 = a(0, 0, true);
        if (a11 < 0) {
            throw new h("size invalid: ".concat(String.valueOf(a11)));
        }
        int[] iArr = new int[a11];
        for (int i12 = 0; i12 < a11; i12++) {
            iArr[i12] = a(iArr[0], 0, true);
        }
        return iArr;
    }

    private long[] g(int i11, boolean z11) {
        if (!b(i11)) {
            if (z11) {
                throw new h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar);
        if (aVar.f42612a != 9) {
            throw new h("type mismatch.");
        }
        int a11 = a(0, 0, true);
        if (a11 < 0) {
            throw new h("size invalid: ".concat(String.valueOf(a11)));
        }
        long[] jArr = new long[a11];
        for (int i12 = 0; i12 < a11; i12++) {
            jArr[i12] = a(jArr[0], 0, true);
        }
        return jArr;
    }

    private float[] h(int i11, boolean z11) {
        if (!b(i11)) {
            if (z11) {
                throw new h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar);
        if (aVar.f42612a != 9) {
            throw new h("type mismatch.");
        }
        int a11 = a(0, 0, true);
        if (a11 < 0) {
            throw new h("size invalid: ".concat(String.valueOf(a11)));
        }
        float[] fArr = new float[a11];
        for (int i12 = 0; i12 < a11; i12++) {
            fArr[i12] = a(fArr[0], 0, true);
        }
        return fArr;
    }

    private double[] i(int i11, boolean z11) {
        if (!b(i11)) {
            if (z11) {
                throw new h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar);
        if (aVar.f42612a != 9) {
            throw new h("type mismatch.");
        }
        int a11 = a(0, 0, true);
        if (a11 < 0) {
            throw new h("size invalid: ".concat(String.valueOf(a11)));
        }
        double[] dArr = new double[a11];
        for (int i12 = 0; i12 < a11; i12++) {
            dArr[i12] = a(dArr[0], 0, true);
        }
        return dArr;
    }

    public final void a(byte[] bArr) {
        ByteBuffer byteBuffer = this.f42611b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        this.f42611b = ByteBuffer.wrap(bArr);
    }

    public final byte[] c(int i11, boolean z11) {
        if (!b(i11)) {
            if (z11) {
                throw new h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar);
        byte b11 = aVar.f42612a;
        if (b11 == 9) {
            int a11 = a(0, 0, true);
            if (a11 < 0) {
                throw new h("size invalid: ".concat(String.valueOf(a11)));
            }
            byte[] bArr = new byte[a11];
            for (int i12 = 0; i12 < a11; i12++) {
                bArr[i12] = a(bArr[0], 0, true);
            }
            return bArr;
        }
        if (b11 != 13) {
            throw new h("type mismatch.");
        }
        a aVar2 = new a();
        a(aVar2);
        if (aVar2.f42612a != 0) {
            throw new h("type mismatch, tag: " + i11 + ", type: " + ((int) aVar.f42612a) + j2.O + ((int) aVar2.f42612a));
        }
        int a12 = a(0, 0, true);
        if (a12 >= 0) {
            byte[] bArr2 = new byte[a12];
            this.f42611b.get(bArr2);
            return bArr2;
        }
        throw new h("invalid size, tag: " + i11 + ", type: " + ((int) aVar.f42612a) + j2.O + ((int) aVar2.f42612a) + ", size: " + a12);
    }

    public k(byte[] bArr) {
        this.f42611b = ByteBuffer.wrap(bArr);
    }

    private static int a(a aVar, ByteBuffer byteBuffer) {
        byte b11 = byteBuffer.get();
        aVar.f42612a = (byte) (b11 & 15);
        int i11 = (b11 & 240) >> 4;
        aVar.f42613b = i11;
        if (i11 != 15) {
            return 1;
        }
        aVar.f42613b = byteBuffer.get();
        return 2;
    }

    public k(byte[] bArr, byte b11) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.f42611b = wrap;
        wrap.position(4);
    }

    private void b() {
        a aVar = new a();
        a(aVar);
        a(aVar.f42612a);
    }

    private void a(a aVar) {
        a(aVar, this.f42611b);
    }

    private void a(int i11) {
        ByteBuffer byteBuffer = this.f42611b;
        byteBuffer.position(byteBuffer.position() + i11);
    }

    public final String b(int i11, boolean z11) {
        if (!b(i11)) {
            if (z11) {
                throw new h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar);
        byte b11 = aVar.f42612a;
        if (b11 == 6) {
            int i12 = this.f42611b.get();
            if (i12 < 0) {
                i12 += 256;
            }
            byte[] bArr = new byte[i12];
            this.f42611b.get(bArr);
            try {
                return new String(bArr, this.f42610a);
            } catch (UnsupportedEncodingException unused) {
                return new String(bArr);
            }
        }
        if (b11 == 7) {
            int i13 = this.f42611b.getInt();
            if (i13 <= 104857600 && i13 >= 0) {
                byte[] bArr2 = new byte[i13];
                this.f42611b.get(bArr2);
                try {
                    return new String(bArr2, this.f42610a);
                } catch (UnsupportedEncodingException unused2) {
                    return new String(bArr2);
                }
            }
            throw new h("String too long: ".concat(String.valueOf(i13)));
        }
        throw new h("type mismatch.");
    }

    private void a() {
        a aVar = new a();
        do {
            a(aVar);
            a(aVar.f42612a);
        } while (aVar.f42612a != 11);
    }

    private void a(byte b11) {
        int i11 = 0;
        switch (b11) {
            case 0:
                a(1);
                return;
            case 1:
                a(2);
                return;
            case 2:
                a(4);
                return;
            case 3:
                a(8);
                return;
            case 4:
                a(4);
                return;
            case 5:
                a(8);
                return;
            case 6:
                int i12 = this.f42611b.get();
                if (i12 < 0) {
                    i12 += 256;
                }
                a(i12);
                return;
            case 7:
                a(this.f42611b.getInt());
                return;
            case 8:
                int a11 = a(0, 0, true);
                while (i11 < a11 * 2) {
                    b();
                    i11++;
                }
                return;
            case 9:
                int a12 = a(0, 0, true);
                while (i11 < a12) {
                    b();
                    i11++;
                }
                return;
            case 10:
                a();
                return;
            case 11:
            case 12:
                return;
            case 13:
                a aVar = new a();
                a(aVar);
                if (aVar.f42612a == 0) {
                    a(a(0, 0, true));
                    return;
                }
                throw new h("skipField with invalid type, type value: " + ((int) b11) + j2.O + ((int) aVar.f42612a));
            default:
                throw new h("invalid type.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> T[] b(T t11, int i11, boolean z11) {
        if (!b(i11)) {
            if (z11) {
                throw new h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar);
        if (aVar.f42612a == 9) {
            int a11 = a(0, 0, true);
            if (a11 >= 0) {
                T[] tArr = (T[]) ((Object[]) Array.newInstance(t11.getClass(), a11));
                for (int i12 = 0; i12 < a11; i12++) {
                    tArr[i12] = a((k) t11, 0, true);
                }
                return tArr;
            }
            throw new h("size invalid: ".concat(String.valueOf(a11)));
        }
        throw new h("type mismatch.");
    }

    public final boolean a(int i11, boolean z11) {
        return a((byte) 0, i11, z11) != 0;
    }

    public final byte a(byte b11, int i11, boolean z11) {
        if (!b(i11)) {
            if (z11) {
                throw new h("require field not exist.");
            }
            return b11;
        }
        a aVar = new a();
        a(aVar);
        byte b12 = aVar.f42612a;
        if (b12 == 0) {
            return this.f42611b.get();
        }
        if (b12 == 12) {
            return (byte) 0;
        }
        throw new h("type mismatch.");
    }

    public final short a(short s11, int i11, boolean z11) {
        if (!b(i11)) {
            if (z11) {
                throw new h("require field not exist.");
            }
            return s11;
        }
        a aVar = new a();
        a(aVar);
        byte b11 = aVar.f42612a;
        if (b11 == 0) {
            return this.f42611b.get();
        }
        if (b11 == 1) {
            return this.f42611b.getShort();
        }
        if (b11 == 12) {
            return (short) 0;
        }
        throw new h("type mismatch.");
    }

    public final int a(int i11, int i12, boolean z11) {
        if (!b(i12)) {
            if (z11) {
                throw new h("require field not exist.");
            }
            return i11;
        }
        a aVar = new a();
        a(aVar);
        byte b11 = aVar.f42612a;
        if (b11 == 0) {
            return this.f42611b.get();
        }
        if (b11 == 1) {
            return this.f42611b.getShort();
        }
        if (b11 == 2) {
            return this.f42611b.getInt();
        }
        if (b11 == 12) {
            return 0;
        }
        throw new h("type mismatch.");
    }

    public final long a(long j11, int i11, boolean z11) {
        if (!b(i11)) {
            if (z11) {
                throw new h("require field not exist.");
            }
            return j11;
        }
        a aVar = new a();
        a(aVar);
        byte b11 = aVar.f42612a;
        if (b11 == 0) {
            return this.f42611b.get();
        }
        if (b11 == 1) {
            return this.f42611b.getShort();
        }
        if (b11 == 2) {
            return this.f42611b.getInt();
        }
        if (b11 == 3) {
            return this.f42611b.getLong();
        }
        if (b11 == 12) {
            return 0L;
        }
        throw new h("type mismatch.");
    }

    private float a(float f11, int i11, boolean z11) {
        if (!b(i11)) {
            if (z11) {
                throw new h("require field not exist.");
            }
            return f11;
        }
        a aVar = new a();
        a(aVar);
        byte b11 = aVar.f42612a;
        if (b11 == 4) {
            return this.f42611b.getFloat();
        }
        if (b11 == 12) {
            return 0.0f;
        }
        throw new h("type mismatch.");
    }

    private double a(double d11, int i11, boolean z11) {
        if (!b(i11)) {
            if (z11) {
                throw new h("require field not exist.");
            }
            return d11;
        }
        a aVar = new a();
        a(aVar);
        byte b11 = aVar.f42612a;
        if (b11 == 4) {
            return this.f42611b.getFloat();
        }
        if (b11 == 5) {
            return this.f42611b.getDouble();
        }
        if (b11 == 12) {
            return 0.0d;
        }
        throw new h("type mismatch.");
    }

    public final <K, V> HashMap<K, V> a(Map<K, V> map, int i11, boolean z11) {
        return (HashMap) a(new HashMap(), map, i11, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> Map<K, V> a(Map<K, V> map, Map<K, V> map2, int i11, boolean z11) {
        if (map2 != null && !map2.isEmpty()) {
            Map.Entry<K, V> next = map2.entrySet().iterator().next();
            K key = next.getKey();
            V value = next.getValue();
            if (b(i11)) {
                a aVar = new a();
                a(aVar);
                if (aVar.f42612a == 8) {
                    int a11 = a(0, 0, true);
                    if (a11 < 0) {
                        throw new h("size invalid: ".concat(String.valueOf(a11)));
                    }
                    for (int i12 = 0; i12 < a11; i12++) {
                        map.put(a((k) key, 0, true), a((k) value, 1, true));
                    }
                } else {
                    throw new h("type mismatch.");
                }
            } else if (z11) {
                throw new h("require field not exist.");
            }
            return map;
        }
        return new HashMap();
    }

    private <T> T[] a(T[] tArr, int i11, boolean z11) {
        if (tArr != null && tArr.length != 0) {
            return (T[]) b(tArr[0], i11, z11);
        }
        throw new h("unable to get type of key and value.");
    }

    private <T> List<T> a(List<T> list, int i11, boolean z11) {
        if (list != null && !list.isEmpty()) {
            Object[] b11 = b(list.get(0), i11, z11);
            if (b11 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : b11) {
                arrayList.add(obj);
            }
            return arrayList;
        }
        return new ArrayList();
    }

    public final m a(m mVar, int i11, boolean z11) {
        if (!b(i11)) {
            if (z11) {
                throw new h("require field not exist.");
            }
            return null;
        }
        try {
            m mVar2 = (m) mVar.getClass().newInstance();
            a aVar = new a();
            a(aVar);
            if (aVar.f42612a == 10) {
                mVar2.a(this);
                a();
                return mVar2;
            }
            throw new h("type mismatch.");
        } catch (Exception e11) {
            throw new h(e11.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> Object a(T t11, int i11, boolean z11) {
        if (t11 instanceof Byte) {
            return Byte.valueOf(a((byte) 0, i11, z11));
        }
        if (t11 instanceof Boolean) {
            return Boolean.valueOf(a(i11, z11));
        }
        if (t11 instanceof Short) {
            return Short.valueOf(a((short) 0, i11, z11));
        }
        if (t11 instanceof Integer) {
            return Integer.valueOf(a(0, i11, z11));
        }
        if (t11 instanceof Long) {
            return Long.valueOf(a(0L, i11, z11));
        }
        if (t11 instanceof Float) {
            return Float.valueOf(a(0.0f, i11, z11));
        }
        if (t11 instanceof Double) {
            return Double.valueOf(a(0.0d, i11, z11));
        }
        if (t11 instanceof String) {
            return String.valueOf(b(i11, z11));
        }
        if (t11 instanceof Map) {
            return a((Map) t11, i11, z11);
        }
        if (t11 instanceof List) {
            return a((List) t11, i11, z11);
        }
        if (t11 instanceof m) {
            return a((m) t11, i11, z11);
        }
        if (t11.getClass().isArray()) {
            if (!(t11 instanceof byte[]) && !(t11 instanceof Byte[])) {
                if (t11 instanceof boolean[]) {
                    return d(i11, z11);
                }
                if (t11 instanceof short[]) {
                    return e(i11, z11);
                }
                if (t11 instanceof int[]) {
                    return f(i11, z11);
                }
                if (t11 instanceof long[]) {
                    return g(i11, z11);
                }
                if (t11 instanceof float[]) {
                    return h(i11, z11);
                }
                if (t11 instanceof double[]) {
                    return i(i11, z11);
                }
                return a((Object[]) t11, i11, z11);
            }
            return c(i11, z11);
        }
        throw new h("read object error: unsupport type.");
    }

    public final int a(String str) {
        this.f42610a = str;
        return 0;
    }
}
