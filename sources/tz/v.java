package tz;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes8.dex */
public class v implements Cloneable {

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f91378i = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public int f91379a;

    /* renamed from: b, reason: collision with root package name */
    public int f91380b;

    /* renamed from: c, reason: collision with root package name */
    public int f91381c;

    /* renamed from: d, reason: collision with root package name */
    public int f91382d;

    /* renamed from: e, reason: collision with root package name */
    public long f91383e;

    /* renamed from: f, reason: collision with root package name */
    public long f91384f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f91385g = f91378i;

    /* renamed from: h, reason: collision with root package name */
    public long f91386h;

    public int a() {
        return this.f91385g.length + 22;
    }

    public ByteBuffer b(long j11) {
        ByteBuffer allocate = ByteBuffer.allocate(a());
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(101010256);
        allocate.putShort((short) this.f91379a);
        allocate.putShort((short) this.f91380b);
        allocate.putShort((short) this.f91381c);
        allocate.putShort((short) this.f91382d);
        allocate.putInt((int) this.f91383e);
        allocate.putInt((int) j11);
        allocate.putShort((short) this.f91385g.length);
        allocate.put(this.f91385g);
        allocate.flip();
        return allocate;
    }

    public void c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            bArr = f91378i;
        }
        this.f91385g = bArr;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public v clone() {
        try {
            return (v) super.clone();
        } catch (CloneNotSupportedException e11) {
            throw new Error(e11);
        }
    }
}
