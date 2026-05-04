package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.collection.SieveCacheKt;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class r extends kotlin.reflect.jvm.internal.impl.protobuf.d {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f67591i;

    /* renamed from: c, reason: collision with root package name */
    public final int f67592c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.protobuf.d f67593d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.protobuf.d f67594e;

    /* renamed from: f, reason: collision with root package name */
    public final int f67595f;

    /* renamed from: g, reason: collision with root package name */
    public final int f67596g;

    /* renamed from: h, reason: collision with root package name */
    public int f67597h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Stack<kotlin.reflect.jvm.internal.impl.protobuf.d> f67598a;

        public b() {
            this.f67598a = new Stack<>();
        }

        public final kotlin.reflect.jvm.internal.impl.protobuf.d b(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
            c(dVar);
            c(dVar2);
            kotlin.reflect.jvm.internal.impl.protobuf.d pop = this.f67598a.pop();
            while (!this.f67598a.isEmpty()) {
                pop = new r(this.f67598a.pop(), pop);
            }
            return pop;
        }

        public final void c(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            if (dVar.m()) {
                e(dVar);
                return;
            }
            if (dVar instanceof r) {
                r rVar = (r) dVar;
                c(rVar.f67593d);
                c(rVar.f67594e);
            } else {
                String valueOf = String.valueOf(dVar.getClass());
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
                sb2.append("Has a new type of ByteString been created? Found ");
                sb2.append(valueOf);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        public final int d(int i11) {
            int binarySearch = Arrays.binarySearch(r.f67591i, i11);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        public final void e(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            int d11 = d(dVar.size());
            int i11 = r.f67591i[d11 + 1];
            if (this.f67598a.isEmpty() || this.f67598a.peek().size() >= i11) {
                this.f67598a.push(dVar);
                return;
            }
            int i12 = r.f67591i[d11];
            kotlin.reflect.jvm.internal.impl.protobuf.d pop = this.f67598a.pop();
            while (true) {
                if (this.f67598a.isEmpty() || this.f67598a.peek().size() >= i12) {
                    break;
                } else {
                    pop = new r(this.f67598a.pop(), pop);
                }
            }
            r rVar = new r(pop, dVar);
            while (!this.f67598a.isEmpty()) {
                if (this.f67598a.peek().size() >= r.f67591i[d(rVar.size()) + 1]) {
                    break;
                } else {
                    rVar = new r(this.f67598a.pop(), rVar);
                }
            }
            this.f67598a.push(rVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements Iterator<m> {

        /* renamed from: a, reason: collision with root package name */
        public final Stack<r> f67599a;

        /* renamed from: b, reason: collision with root package name */
        public m f67600b;

        public final m a(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            while (dVar instanceof r) {
                r rVar = (r) dVar;
                this.f67599a.push(rVar);
                dVar = rVar.f67593d;
            }
            return (m) dVar;
        }

        public final m b() {
            while (!this.f67599a.isEmpty()) {
                m a11 = a(this.f67599a.pop().f67594e);
                if (!a11.isEmpty()) {
                    return a11;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public m next() {
            m mVar = this.f67600b;
            if (mVar == null) {
                throw new NoSuchElementException();
            }
            this.f67600b = b();
            return mVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f67600b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public c(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            this.f67599a = new Stack<>();
            this.f67600b = a(dVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public final c f67601a;

        /* renamed from: b, reason: collision with root package name */
        public d.a f67602b;

        /* renamed from: c, reason: collision with root package name */
        public int f67603c;

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f67603c > 0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte nextByte() {
            if (!this.f67602b.hasNext()) {
                this.f67602b = this.f67601a.next().iterator();
            }
            this.f67603c--;
            return this.f67602b.nextByte();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public d() {
            c cVar = new c(r.this);
            this.f67601a = cVar;
            this.f67602b = cVar.next().iterator();
            this.f67603c = r.this.size();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i11 = 1;
        int i12 = 1;
        while (i11 > 0) {
            arrayList.add(Integer.valueOf(i11));
            int i13 = i12 + i11;
            i12 = i11;
            i11 = i13;
        }
        arrayList.add(Integer.MAX_VALUE);
        f67591i = new int[arrayList.size()];
        int i14 = 0;
        while (true) {
            int[] iArr = f67591i;
            if (i14 >= iArr.length) {
                return;
            }
            iArr[i14] = ((Integer) arrayList.get(i14)).intValue();
            i14++;
        }
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.d C(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
        r rVar = dVar instanceof r ? (r) dVar : null;
        if (dVar2.size() == 0) {
            return dVar;
        }
        if (dVar.size() == 0) {
            return dVar2;
        }
        int size = dVar.size() + dVar2.size();
        if (size < 128) {
            return D(dVar, dVar2);
        }
        if (rVar != null && rVar.f67594e.size() + dVar2.size() < 128) {
            return new r(rVar.f67593d, D(rVar.f67594e, dVar2));
        }
        if (rVar == null || rVar.f67593d.l() <= rVar.f67594e.l() || rVar.l() <= dVar2.l()) {
            return size >= f67591i[Math.max(dVar.l(), dVar2.l()) + 1] ? new r(dVar, dVar2) : new b().b(dVar, dVar2);
        }
        return new r(rVar.f67593d, new r(rVar.f67594e, dVar2));
    }

    public static m D(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
        int size = dVar.size();
        int size2 = dVar2.size();
        byte[] bArr = new byte[size + size2];
        dVar.j(bArr, 0, 0, size);
        dVar2.j(bArr, 0, size, size2);
        return new m(bArr);
    }

    public final boolean E(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
        c cVar = new c(this);
        m next = cVar.next();
        c cVar2 = new c(dVar);
        m next2 = cVar2.next();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int size = next.size() - i11;
            int size2 = next2.size() - i12;
            int min = Math.min(size, size2);
            if (!(i11 == 0 ? next.A(next2, i12, min) : next2.A(next, i11, min))) {
                return false;
            }
            i13 += min;
            int i14 = this.f67592c;
            if (i13 >= i14) {
                if (i13 == i14) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                next = cVar.next();
                i11 = 0;
            } else {
                i11 += min;
            }
            if (min == size2) {
                next2 = cVar2.next();
                i12 = 0;
            } else {
                i12 += min;
            }
        }
    }

    public boolean equals(Object obj) {
        int t11;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.d)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.protobuf.d dVar = (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
        if (this.f67592c != dVar.size()) {
            return false;
        }
        if (this.f67592c == 0) {
            return true;
        }
        if (this.f67597h == 0 || (t11 = dVar.t()) == 0 || this.f67597h == t11) {
            return E(dVar);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.f67597h;
        if (i11 == 0) {
            int i12 = this.f67592c;
            i11 = r(i12, 0, i12);
            if (i11 == 0) {
                i11 = 1;
            }
            this.f67597h = i11;
        }
        return i11;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public void k(byte[] bArr, int i11, int i12, int i13) {
        int i14 = i11 + i13;
        int i15 = this.f67595f;
        if (i14 <= i15) {
            this.f67593d.k(bArr, i11, i12, i13);
        } else {
            if (i11 >= i15) {
                this.f67594e.k(bArr, i11 - i15, i12, i13);
                return;
            }
            int i16 = i15 - i11;
            this.f67593d.k(bArr, i11, i12, i16);
            this.f67594e.k(bArr, 0, i12 + i16, i13 - i16);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int l() {
        return this.f67596g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public boolean m() {
        return this.f67592c >= f67591i[this.f67596g];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public boolean n() {
        int s11 = this.f67593d.s(0, 0, this.f67595f);
        kotlin.reflect.jvm.internal.impl.protobuf.d dVar = this.f67594e;
        return dVar.s(s11, 0, dVar.size()) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d, java.lang.Iterable
    /* renamed from: o */
    public d.a iterator() {
        return new d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public kotlin.reflect.jvm.internal.impl.protobuf.e p() {
        return kotlin.reflect.jvm.internal.impl.protobuf.e.g(new e());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int r(int i11, int i12, int i13) {
        int i14 = i12 + i13;
        int i15 = this.f67595f;
        if (i14 <= i15) {
            return this.f67593d.r(i11, i12, i13);
        }
        if (i12 >= i15) {
            return this.f67594e.r(i11, i12 - i15, i13);
        }
        int i16 = i15 - i12;
        return this.f67594e.r(this.f67593d.r(i11, i12, i16), 0, i13 - i16);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int s(int i11, int i12, int i13) {
        int i14 = i12 + i13;
        int i15 = this.f67595f;
        if (i14 <= i15) {
            return this.f67593d.s(i11, i12, i13);
        }
        if (i12 >= i15) {
            return this.f67594e.s(i11, i12 - i15, i13);
        }
        int i16 = i15 - i12;
        return this.f67594e.s(this.f67593d.s(i11, i12, i16), 0, i13 - i16);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f67592c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int t() {
        return this.f67597h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public String v(String str) throws UnsupportedEncodingException {
        return new String(u(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public void y(OutputStream outputStream, int i11, int i12) throws IOException {
        int i13 = i11 + i12;
        int i14 = this.f67595f;
        if (i13 <= i14) {
            this.f67593d.y(outputStream, i11, i12);
        } else {
            if (i11 >= i14) {
                this.f67594e.y(outputStream, i11 - i14, i12);
                return;
            }
            int i15 = i14 - i11;
            this.f67593d.y(outputStream, i11, i15);
            this.f67594e.y(outputStream, 0, i12 - i15);
        }
    }

    public r(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
        this.f67597h = 0;
        this.f67593d = dVar;
        this.f67594e = dVar2;
        int size = dVar.size();
        this.f67595f = size;
        this.f67592c = size + dVar2.size();
        this.f67596g = Math.max(dVar.l(), dVar2.l()) + 1;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends InputStream {

        /* renamed from: a, reason: collision with root package name */
        public c f67605a;

        /* renamed from: b, reason: collision with root package name */
        public m f67606b;

        /* renamed from: c, reason: collision with root package name */
        public int f67607c;

        /* renamed from: d, reason: collision with root package name */
        public int f67608d;

        /* renamed from: e, reason: collision with root package name */
        public int f67609e;

        /* renamed from: f, reason: collision with root package name */
        public int f67610f;

        public e() {
            c();
        }

        public final void a() {
            if (this.f67606b != null) {
                int i11 = this.f67608d;
                int i12 = this.f67607c;
                if (i11 == i12) {
                    this.f67609e += i12;
                    this.f67608d = 0;
                    if (!this.f67605a.hasNext()) {
                        this.f67606b = null;
                        this.f67607c = 0;
                    } else {
                        m next = this.f67605a.next();
                        this.f67606b = next;
                        this.f67607c = next.size();
                    }
                }
            }
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return r.this.size() - (this.f67609e + this.f67608d);
        }

        public final void c() {
            c cVar = new c(r.this);
            this.f67605a = cVar;
            m next = cVar.next();
            this.f67606b = next;
            this.f67607c = next.size();
            this.f67608d = 0;
            this.f67609e = 0;
        }

        public final int e(byte[] bArr, int i11, int i12) {
            int i13 = i12;
            while (true) {
                if (i13 <= 0) {
                    break;
                }
                a();
                if (this.f67606b != null) {
                    int min = Math.min(this.f67607c - this.f67608d, i13);
                    if (bArr != null) {
                        this.f67606b.j(bArr, this.f67608d, i11, min);
                        i11 += min;
                    }
                    this.f67608d += min;
                    i13 -= min;
                } else if (i13 == i12) {
                    return -1;
                }
            }
            return i12 - i13;
        }

        @Override // java.io.InputStream
        public void mark(int i11) {
            this.f67610f = this.f67609e + this.f67608d;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i11, int i12) {
            bArr.getClass();
            if (i11 < 0 || i12 < 0 || i12 > bArr.length - i11) {
                throw new IndexOutOfBoundsException();
            }
            return e(bArr, i11, i12);
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            c();
            e(null, 0, this.f67610f);
        }

        @Override // java.io.InputStream
        public long skip(long j11) {
            if (j11 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j11 > SieveCacheKt.NodeLinkMask) {
                j11 = 2147483647L;
            }
            return e(null, 0, (int) j11);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            a();
            m mVar = this.f67606b;
            if (mVar == null) {
                return -1;
            }
            int i11 = this.f67608d;
            this.f67608d = i11 + 1;
            return mVar.z(i11) & 255;
        }
    }
}
