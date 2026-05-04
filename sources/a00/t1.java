package a00;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n204#1:208\n204#1:209\n204#1:210\n1#2:207\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n106#1:208\n175#1:209\n188#1:210\n*E\n"})
/* loaded from: classes8.dex */
public final class t1<T> extends d<T> implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Object[] f1146a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1147b;

    /* renamed from: c, reason: collision with root package name */
    public int f1148c;

    /* renamed from: d, reason: collision with root package name */
    public int f1149d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n+ 2 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n1#1,206:1\n204#2:207\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n*L\n121#1:207\n*E\n"})
    public static final class a extends c<T> {

        /* renamed from: c, reason: collision with root package name */
        public int f1150c;

        /* renamed from: d, reason: collision with root package name */
        public int f1151d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ t1<T> f1152e;

        public a(t1<T> t1Var) {
            this.f1152e = t1Var;
            this.f1150c = t1Var.size();
            this.f1151d = t1Var.f1148c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // a00.c
        public void a() {
            if (this.f1150c == 0) {
                b();
                return;
            }
            c(this.f1152e.f1146a[this.f1151d]);
            this.f1151d = (this.f1151d + 1) % this.f1152e.f1147b;
            this.f1150c--;
        }
    }

    public t1(@m80.k Object[] buffer, int i11) {
        kotlin.jvm.internal.g0.p(buffer, "buffer");
        this.f1146a = buffer;
        if (i11 < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i11).toString());
        }
        if (i11 <= buffer.length) {
            this.f1147b = buffer.length;
            this.f1149d = i11;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i11 + " cannot be larger than the buffer size: " + buffer.length).toString());
    }

    @Override // a00.d, java.util.List
    public T get(int i11) {
        d.Companion.b(i11, size());
        return (T) this.f1146a[(this.f1148c + i11) % this.f1147b];
    }

    @Override // a00.d, a00.b
    public int getSize() {
        return this.f1149d;
    }

    public final void h(T t11) {
        if (l()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f1146a[(this.f1148c + size()) % this.f1147b] = t11;
        this.f1149d = size() + 1;
    }

    @Override // a00.d, a00.b, java.util.Collection, java.lang.Iterable
    @m80.k
    public Iterator<T> iterator() {
        return new a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public final t1<T> j(int i11) {
        Object[] array;
        int i12 = this.f1147b;
        int B = g10.u.B(i12 + (i12 >> 1) + 1, i11);
        if (this.f1148c == 0) {
            array = Arrays.copyOf(this.f1146a, B);
            kotlin.jvm.internal.g0.o(array, "copyOf(...)");
        } else {
            array = toArray(new Object[B]);
        }
        return new t1<>(array, size());
    }

    public final int k(int i11, int i12) {
        return (i11 + i12) % this.f1147b;
    }

    public final boolean l() {
        return size() == this.f1147b;
    }

    public final void m(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i11).toString());
        }
        if (i11 > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i11 + ", size = " + size()).toString());
        }
        if (i11 > 0) {
            int i12 = this.f1148c;
            int i13 = (i12 + i11) % this.f1147b;
            if (i12 > i13) {
                q.M1(this.f1146a, null, i12, this.f1147b);
                q.M1(this.f1146a, null, 0, i13);
            } else {
                q.M1(this.f1146a, null, i12, i13);
            }
            this.f1148c = i13;
            this.f1149d = size() - i11;
        }
    }

    @Override // a00.b, java.util.Collection
    @m80.k
    public <T> T[] toArray(@m80.k T[] array) {
        kotlin.jvm.internal.g0.p(array, "array");
        int length = array.length;
        Object[] objArr = array;
        if (length < size()) {
            Object[] objArr2 = (T[]) Arrays.copyOf(array, size());
            kotlin.jvm.internal.g0.o(objArr2, "copyOf(...)");
            objArr = objArr2;
        }
        int size = size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = this.f1148c; i12 < size && i13 < this.f1147b; i13++) {
            objArr[i12] = this.f1146a[i13];
            i12++;
        }
        while (i12 < size) {
            objArr[i12] = this.f1146a[i11];
            i12++;
            i11++;
        }
        return (T[]) g0.o(size, objArr);
    }

    public t1(int i11) {
        this(new Object[i11], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a00.b, java.util.Collection
    @m80.k
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
