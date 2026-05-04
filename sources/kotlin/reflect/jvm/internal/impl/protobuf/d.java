package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.collection.SieveCacheKt;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class d implements Iterable<Byte> {

    /* renamed from: a, reason: collision with root package name */
    public static final d f67542a = new m(new byte[0]);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ boolean f67543b = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a extends Iterator<Byte> {
        byte nextByte();
    }

    public static d a(Iterator<d> it, int i11) {
        if (i11 == 1) {
            return it.next();
        }
        int i12 = i11 >>> 1;
        return a(it, i12).b(a(it, i11 - i12));
    }

    public static d d(Iterable<d> iterable) {
        Collection collection;
        if (iterable instanceof Collection) {
            collection = (Collection) iterable;
        } else {
            collection = new ArrayList();
            Iterator<d> it = iterable.iterator();
            while (it.hasNext()) {
                collection.add(it.next());
            }
        }
        return collection.isEmpty() ? f67542a : a(collection.iterator(), collection.size());
    }

    public static d f(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    public static d g(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        return new m(bArr2);
    }

    public static d h(String str) {
        try {
            return new m(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("UTF-8 not supported?", e11);
        }
    }

    public static b q() {
        return new b(128);
    }

    public d b(d dVar) {
        int size = size();
        int size2 = dVar.size();
        if (size + size2 < SieveCacheKt.NodeLinkMask) {
            return r.C(this, dVar);
        }
        StringBuilder sb2 = new StringBuilder(53);
        sb2.append("ByteString would be too long: ");
        sb2.append(size);
        sb2.append("+");
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void j(byte[] bArr, int i11, int i12, int i13) {
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i11);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i12 < 0) {
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Target offset < 0: ");
            sb3.append(i12);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        if (i13 < 0) {
            StringBuilder sb4 = new StringBuilder(23);
            sb4.append("Length < 0: ");
            sb4.append(i13);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i14 = i11 + i13;
        if (i14 > size()) {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Source end offset < 0: ");
            sb5.append(i14);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
        int i15 = i12 + i13;
        if (i15 <= bArr.length) {
            if (i13 > 0) {
                k(bArr, i11, i12, i13);
            }
        } else {
            StringBuilder sb6 = new StringBuilder(34);
            sb6.append("Target end offset < 0: ");
            sb6.append(i15);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
    }

    public abstract void k(byte[] bArr, int i11, int i12, int i13);

    public abstract int l();

    public abstract boolean m();

    public abstract boolean n();

    @Override // java.lang.Iterable
    /* renamed from: o */
    public abstract a iterator();

    public abstract e p();

    public abstract int r(int i11, int i12, int i13);

    public abstract int s(int i11, int i12, int i13);

    public abstract int size();

    public abstract int t();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public byte[] u() {
        int size = size();
        if (size == 0) {
            return h.f67575a;
        }
        byte[] bArr = new byte[size];
        k(bArr, 0, 0, size);
        return bArr;
    }

    public abstract String v(String str) throws UnsupportedEncodingException;

    public String w() {
        try {
            return v("UTF-8");
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("UTF-8 not supported?", e11);
        }
    }

    public void x(OutputStream outputStream, int i11, int i12) throws IOException {
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i11);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i12 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i12);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i13 = i11 + i12;
        if (i13 <= size()) {
            if (i12 > 0) {
                y(outputStream, i11, i12);
            }
        } else {
            StringBuilder sb4 = new StringBuilder(39);
            sb4.append("Source end offset exceeded: ");
            sb4.append(i13);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
    }

    public abstract void y(OutputStream outputStream, int i11, int i12) throws IOException;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends OutputStream {

        /* renamed from: f, reason: collision with root package name */
        public static final byte[] f67544f = new byte[0];

        /* renamed from: a, reason: collision with root package name */
        public final int f67545a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList<d> f67546b;

        /* renamed from: c, reason: collision with root package name */
        public int f67547c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f67548d;

        /* renamed from: e, reason: collision with root package name */
        public int f67549e;

        public b(int i11) {
            if (i11 < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f67545a = i11;
            this.f67546b = new ArrayList<>();
            this.f67548d = new byte[i11];
        }

        public final byte[] a(byte[] bArr, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i11));
            return bArr2;
        }

        public final void c(int i11) {
            this.f67546b.add(new m(this.f67548d));
            int length = this.f67547c + this.f67548d.length;
            this.f67547c = length;
            this.f67548d = new byte[Math.max(this.f67545a, Math.max(i11, length >>> 1))];
            this.f67549e = 0;
        }

        public final void e() {
            int i11 = this.f67549e;
            byte[] bArr = this.f67548d;
            if (i11 >= bArr.length) {
                this.f67546b.add(new m(this.f67548d));
                this.f67548d = f67544f;
            } else if (i11 > 0) {
                this.f67546b.add(new m(a(bArr, i11)));
            }
            this.f67547c += this.f67549e;
            this.f67549e = 0;
        }

        public synchronized int f() {
            return this.f67547c + this.f67549e;
        }

        public synchronized d j() {
            e();
            return d.d(this.f67546b);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(f()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i11) {
            try {
                if (this.f67549e == this.f67548d.length) {
                    c(1);
                }
                byte[] bArr = this.f67548d;
                int i12 = this.f67549e;
                this.f67549e = i12 + 1;
                bArr[i12] = (byte) i11;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i11, int i12) {
            try {
                byte[] bArr2 = this.f67548d;
                int length = bArr2.length;
                int i13 = this.f67549e;
                if (i12 <= length - i13) {
                    System.arraycopy(bArr, i11, bArr2, i13, i12);
                    this.f67549e += i12;
                } else {
                    int length2 = bArr2.length - i13;
                    System.arraycopy(bArr, i11, bArr2, i13, length2);
                    int i14 = i12 - length2;
                    c(i14);
                    System.arraycopy(bArr, i11 + length2, this.f67548d, 0, i14);
                    this.f67549e = i14;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
