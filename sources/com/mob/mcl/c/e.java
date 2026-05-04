package com.mob.mcl.c;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f40500a;

    /* renamed from: b, reason: collision with root package name */
    public final int f40501b;

    /* renamed from: c, reason: collision with root package name */
    public long f40502c;

    /* renamed from: d, reason: collision with root package name */
    public String f40503d;

    public e(int i11) {
        this(i11, null);
    }

    public static e b(ByteBuffer byteBuffer) {
        int i11;
        e c11 = c(byteBuffer);
        if (c11 != null && (i11 = c11.f40500a) > 0) {
            if (i11 > byteBuffer.remaining()) {
                return null;
            }
            byte[] bArr = new byte[c11.f40500a];
            byteBuffer.get(bArr);
            c11.f40503d = new String(bArr);
        }
        return c11;
    }

    public static e c(ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 1) {
            return null;
        }
        int i11 = byteBuffer.getInt();
        int i12 = byteBuffer.getInt();
        if (i12 > 9999) {
            return null;
        }
        return new e(i11, i12, byteBuffer.getLong(), null);
    }

    public byte[] a() {
        ByteBuffer allocate = ByteBuffer.allocate(b());
        allocate.put((byte) 1);
        allocate.putInt(this.f40500a);
        allocate.putInt(this.f40501b);
        allocate.putLong(this.f40502c);
        String str = this.f40503d;
        if (str != null) {
            allocate.put(str.getBytes(Charset.forName("UTF-8")));
        }
        return allocate.array();
    }

    public e(int i11, String str) {
        this(str != null ? str.length() : 0, i11, 0L, str);
    }

    public e(int i11, int i12, long j11, String str) {
        this.f40500a = i11;
        this.f40501b = i12;
        this.f40502c = j11;
        this.f40503d = str;
    }

    public int b() {
        return this.f40500a + 17;
    }

    public static List<e> a(ByteBuffer byteBuffer) {
        e b11;
        ArrayList arrayList = new ArrayList();
        while (byteBuffer.remaining() >= 17 && (b11 = b(byteBuffer)) != null) {
            arrayList.add(b11);
        }
        return arrayList;
    }
}
