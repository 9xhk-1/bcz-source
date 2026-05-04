package tz;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes8.dex */
public class u implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final long f91374a;

    /* renamed from: b, reason: collision with root package name */
    public final List f91375b = new ArrayList();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f91376a;

        public a(byte[] bArr) {
            this.f91376a = bArr;
        }

        public byte[] a() {
            byte[] bArr = this.f91376a;
            int length = bArr.length - 12;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 12, bArr2, 0, length);
            return bArr2;
        }
    }

    public u(long j11) {
        this.f91374a = j11;
    }

    public long a() {
        return this.f91374a + g();
    }

    public void b(int i11, byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length + 12];
        ByteBuffer order = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
        order.putLong(r0 + 4).putInt(i11);
        order.put(bArr);
        t tVar = new t(Integer.valueOf(i11), new a(bArr2));
        ListIterator listIterator = this.f91375b.listIterator();
        while (listIterator.hasNext()) {
            if (((Integer) ((t) listIterator.next()).f91370a).intValue() == i11) {
                listIterator.set(tVar);
                return;
            }
        }
        this.f91375b.add(tVar);
    }

    public void c(byte[] bArr) {
        if (bArr == null) {
            f(987894612);
        } else {
            b(987894612, bArr);
        }
    }

    public final byte[] d(int i11) {
        for (t tVar : this.f91375b) {
            if (((Integer) tVar.f91370a).intValue() == i11) {
                return ((a) tVar.f91371b).a();
            }
        }
        return null;
    }

    public long e() {
        return this.f91374a;
    }

    public final void f(int i11) {
        Iterator it = this.f91375b.iterator();
        while (it.hasNext()) {
            if (((Integer) ((t) it.next()).f91370a).intValue() == i11) {
                it.remove();
            }
        }
    }

    public long g() {
        long j11 = 32;
        while (this.f91375b.iterator().hasNext()) {
            j11 += ((a) ((t) r0.next()).f91371b).f91376a.length;
        }
        return j11;
    }

    public byte[] h() {
        return d(987894612);
    }

    public ByteBuffer[] i() {
        ByteBuffer[] byteBufferArr = new ByteBuffer[this.f91375b.size() + 2];
        long g11 = g() - 8;
        byteBufferArr[0] = (ByteBuffer) ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(g11).flip();
        Iterator it = this.f91375b.iterator();
        int i11 = 1;
        while (it.hasNext()) {
            byteBufferArr[i11] = ByteBuffer.wrap(((a) ((t) it.next()).f91371b).f91376a);
            i11++;
        }
        byteBufferArr[i11] = (ByteBuffer) ByteBuffer.allocate(24).order(ByteOrder.LITTLE_ENDIAN).putLong(g11).putLong(ss.a.f88913b).putLong(ss.a.f88912a).flip();
        return byteBufferArr;
    }

    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public u clone() {
        u uVar = new u(this.f91374a);
        for (t tVar : this.f91375b) {
            uVar.f91375b.add(new t(tVar.f91370a, tVar.f91371b));
        }
        return uVar;
    }
}
