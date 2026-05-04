package com.tencent.bugly.proguard;

import androidx.collection.SieveCacheKt;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public ByteBuffer f42614a;

    /* renamed from: b, reason: collision with root package name */
    protected String f42615b;

    public l(int i11) {
        this.f42615b = "GBK";
        this.f42614a = ByteBuffer.allocate(i11);
    }

    private void a(int i11) {
        if (this.f42614a.remaining() < i11) {
            ByteBuffer allocate = ByteBuffer.allocate((this.f42614a.capacity() + i11) * 2);
            allocate.put(this.f42614a.array(), 0, this.f42614a.position());
            this.f42614a = allocate;
        }
    }

    private void b(byte b11, int i11) {
        if (i11 < 15) {
            this.f42614a.put((byte) (b11 | (i11 << 4)));
        } else {
            if (i11 >= 256) {
                throw new j("tag is too large: ".concat(String.valueOf(i11)));
            }
            this.f42614a.put((byte) (b11 | 240));
            this.f42614a.put((byte) i11);
        }
    }

    public l() {
        this(128);
    }

    public final void a(boolean z11, int i11) {
        a(z11 ? (byte) 1 : (byte) 0, i11);
    }

    public final void a(byte b11, int i11) {
        a(3);
        if (b11 == 0) {
            b((byte) 12, i11);
        } else {
            b((byte) 0, i11);
            this.f42614a.put(b11);
        }
    }

    public final void a(short s11, int i11) {
        a(4);
        if (s11 >= -128 && s11 <= 127) {
            a((byte) s11, i11);
        } else {
            b((byte) 1, i11);
            this.f42614a.putShort(s11);
        }
    }

    public final void a(int i11, int i12) {
        a(6);
        if (i11 >= -32768 && i11 <= 32767) {
            a((short) i11, i12);
        } else {
            b((byte) 2, i12);
            this.f42614a.putInt(i11);
        }
    }

    public final void a(long j11, int i11) {
        a(10);
        if (j11 >= SieveCacheKt.NodeMetaAndPreviousMask && j11 <= SieveCacheKt.NodeLinkMask) {
            a((int) j11, i11);
        } else {
            b((byte) 3, i11);
            this.f42614a.putLong(j11);
        }
    }

    private void a(float f11, int i11) {
        a(6);
        b((byte) 4, i11);
        this.f42614a.putFloat(f11);
    }

    private void a(double d11, int i11) {
        a(10);
        b((byte) 5, i11);
        this.f42614a.putDouble(d11);
    }

    public final void a(String str, int i11) {
        byte[] bytes;
        try {
            bytes = str.getBytes(this.f42615b);
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        a(bytes.length + 10);
        if (bytes.length > 255) {
            b((byte) 7, i11);
            this.f42614a.putInt(bytes.length);
            this.f42614a.put(bytes);
        } else {
            b((byte) 6, i11);
            this.f42614a.put((byte) bytes.length);
            this.f42614a.put(bytes);
        }
    }

    public final <K, V> void a(Map<K, V> map, int i11) {
        a(8);
        b((byte) 8, i11);
        a(map == null ? 0 : map.size(), 0);
        if (map != null) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                a(entry.getKey(), 0);
                a(entry.getValue(), 1);
            }
        }
    }

    private void a(boolean[] zArr, int i11) {
        a(8);
        b((byte) 9, i11);
        a(zArr.length, 0);
        for (boolean z11 : zArr) {
            a(z11, 0);
        }
    }

    public final void a(byte[] bArr, int i11) {
        a(bArr.length + 8);
        b((byte) 13, i11);
        b((byte) 0, 0);
        a(bArr.length, 0);
        this.f42614a.put(bArr);
    }

    private void a(short[] sArr, int i11) {
        a(8);
        b((byte) 9, i11);
        a(sArr.length, 0);
        for (short s11 : sArr) {
            a(s11, 0);
        }
    }

    private void a(int[] iArr, int i11) {
        a(8);
        b((byte) 9, i11);
        a(iArr.length, 0);
        for (int i12 : iArr) {
            a(i12, 0);
        }
    }

    private void a(long[] jArr, int i11) {
        a(8);
        b((byte) 9, i11);
        a(jArr.length, 0);
        for (long j11 : jArr) {
            a(j11, 0);
        }
    }

    private void a(float[] fArr, int i11) {
        a(8);
        b((byte) 9, i11);
        a(fArr.length, 0);
        for (float f11 : fArr) {
            a(f11, 0);
        }
    }

    private void a(double[] dArr, int i11) {
        a(8);
        b((byte) 9, i11);
        a(dArr.length, 0);
        for (double d11 : dArr) {
            a(d11, 0);
        }
    }

    private void a(Object[] objArr, int i11) {
        a(8);
        b((byte) 9, i11);
        a(objArr.length, 0);
        for (Object obj : objArr) {
            a(obj, 0);
        }
    }

    public final <T> void a(Collection<T> collection, int i11) {
        a(8);
        b((byte) 9, i11);
        a(collection == null ? 0 : collection.size(), 0);
        if (collection != null) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                a(it.next(), 0);
            }
        }
    }

    public final void a(m mVar, int i11) {
        a(2);
        b((byte) 10, i11);
        mVar.a(this);
        a(2);
        b((byte) 11, 0);
    }

    public final void a(Object obj, int i11) {
        if (obj instanceof Byte) {
            a(((Byte) obj).byteValue(), i11);
            return;
        }
        if (obj instanceof Boolean) {
            a(((Boolean) obj).booleanValue(), i11);
            return;
        }
        if (obj instanceof Short) {
            a(((Short) obj).shortValue(), i11);
            return;
        }
        if (obj instanceof Integer) {
            a(((Integer) obj).intValue(), i11);
            return;
        }
        if (obj instanceof Long) {
            a(((Long) obj).longValue(), i11);
            return;
        }
        if (obj instanceof Float) {
            a(((Float) obj).floatValue(), i11);
            return;
        }
        if (obj instanceof Double) {
            a(((Double) obj).doubleValue(), i11);
            return;
        }
        if (obj instanceof String) {
            a((String) obj, i11);
            return;
        }
        if (obj instanceof Map) {
            a((Map) obj, i11);
            return;
        }
        if (obj instanceof List) {
            a((Collection) obj, i11);
            return;
        }
        if (obj instanceof m) {
            a((m) obj, i11);
            return;
        }
        if (obj instanceof byte[]) {
            a((byte[]) obj, i11);
            return;
        }
        if (obj instanceof boolean[]) {
            a((boolean[]) obj, i11);
            return;
        }
        if (obj instanceof short[]) {
            a((short[]) obj, i11);
            return;
        }
        if (obj instanceof int[]) {
            a((int[]) obj, i11);
            return;
        }
        if (obj instanceof long[]) {
            a((long[]) obj, i11);
            return;
        }
        if (obj instanceof float[]) {
            a((float[]) obj, i11);
            return;
        }
        if (obj instanceof double[]) {
            a((double[]) obj, i11);
            return;
        }
        if (obj.getClass().isArray()) {
            a((Object[]) obj, i11);
        } else if (obj instanceof Collection) {
            a((Collection) obj, i11);
        } else {
            throw new j("write object error: unsupport type. " + obj.getClass());
        }
    }

    public final int a(String str) {
        this.f42615b = str;
        return 0;
    }
}
