package com.badlogic.gdx.graphics;

import com.badlogic.gdx.utils.GdxRuntimeException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class s implements Iterable<r>, Comparable<s> {

    /* renamed from: a, reason: collision with root package name */
    public final r[] f12496a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12497b;

    /* renamed from: c, reason: collision with root package name */
    public long f12498c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f12499d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f12500e = -1;

    /* renamed from: f, reason: collision with root package name */
    public a<r> f12501f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<T> implements Iterable<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T[] f12502a;

        /* renamed from: b, reason: collision with root package name */
        public b f12503b;

        /* renamed from: c, reason: collision with root package name */
        public b f12504c;

        public a(T[] tArr) {
            this.f12502a = tArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            if (a3.k.f1553a) {
                return new b(this.f12502a);
            }
            if (this.f12503b == null) {
                this.f12503b = new b(this.f12502a);
                this.f12504c = new b(this.f12502a);
            }
            b bVar = this.f12503b;
            if (!bVar.f12507c) {
                bVar.f12506b = 0;
                bVar.f12507c = true;
                this.f12504c.f12507c = false;
                return bVar;
            }
            b bVar2 = this.f12504c;
            bVar2.f12506b = 0;
            bVar2.f12507c = true;
            bVar.f12507c = false;
            return bVar2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final int f12508a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f12509b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f12510c = 4;

        /* renamed from: d, reason: collision with root package name */
        public static final int f12511d = 8;

        /* renamed from: e, reason: collision with root package name */
        public static final int f12512e = 16;

        /* renamed from: f, reason: collision with root package name */
        public static final int f12513f = 32;

        /* renamed from: g, reason: collision with root package name */
        public static final int f12514g = 64;

        /* renamed from: h, reason: collision with root package name */
        public static final int f12515h = 128;

        /* renamed from: i, reason: collision with root package name */
        public static final int f12516i = 256;
    }

    public s(r... rVarArr) {
        if (rVarArr.length == 0) {
            throw new IllegalArgumentException("attributes must be >= 1");
        }
        r[] rVarArr2 = new r[rVarArr.length];
        for (int i11 = 0; i11 < rVarArr.length; i11++) {
            rVarArr2[i11] = rVarArr[i11];
        }
        this.f12496a = rVarArr2;
        this.f12497b = a();
    }

    public final int a() {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            r[] rVarArr = this.f12496a;
            if (i11 >= rVarArr.length) {
                return i12;
            }
            r rVar = rVarArr[i11];
            rVar.f12492e = i12;
            i12 += rVar.l();
            i11++;
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(s sVar) {
        r[] rVarArr = this.f12496a;
        int length = rVarArr.length;
        r[] rVarArr2 = sVar.f12496a;
        if (length != rVarArr2.length) {
            return rVarArr.length - rVarArr2.length;
        }
        long k11 = k();
        long k12 = sVar.k();
        if (k11 != k12) {
            return k11 < k12 ? -1 : 1;
        }
        for (int length2 = this.f12496a.length - 1; length2 >= 0; length2--) {
            r rVar = this.f12496a[length2];
            r rVar2 = sVar.f12496a[length2];
            int i11 = rVar.f12488a;
            int i12 = rVar2.f12488a;
            if (i11 != i12) {
                return i11 - i12;
            }
            int i13 = rVar.f12494g;
            int i14 = rVar2.f12494g;
            if (i13 != i14) {
                return i13 - i14;
            }
            int i15 = rVar.f12489b;
            int i16 = rVar2.f12489b;
            if (i15 != i16) {
                return i15 - i16;
            }
            boolean z11 = rVar.f12490c;
            if (z11 != rVar2.f12490c) {
                return z11 ? 1 : -1;
            }
            int i17 = rVar.f12491d;
            int i18 = rVar2.f12491d;
            if (i17 != i18) {
                return i17 - i18;
            }
        }
        return 0;
    }

    public r d(int i11) {
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            if (f(i12).f12488a == i11) {
                return f(i12);
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f12496a.length != sVar.f12496a.length) {
            return false;
        }
        int i11 = 0;
        while (true) {
            r[] rVarArr = this.f12496a;
            if (i11 >= rVarArr.length) {
                return true;
            }
            if (!rVarArr[i11].j(sVar.f12496a[i11])) {
                return false;
            }
            i11++;
        }
    }

    public r f(int i11) {
        return this.f12496a[i11];
    }

    public int g() {
        if (this.f12499d < 0) {
            int i11 = 0;
            this.f12499d = 0;
            while (true) {
                r[] rVarArr = this.f12496a;
                if (i11 >= rVarArr.length) {
                    break;
                }
                r rVar = rVarArr[i11];
                if (rVar.f12488a == 64) {
                    this.f12499d = Math.max(this.f12499d, rVar.f12494g + 1);
                }
                i11++;
            }
        }
        return this.f12499d;
    }

    public int hashCode() {
        long length = this.f12496a.length * 61;
        int i11 = 0;
        while (true) {
            if (i11 >= this.f12496a.length) {
                return (int) (length ^ (length >> 32));
            }
            length = (length * 61) + r3[i11].hashCode();
            i11++;
        }
    }

    @Override // java.lang.Iterable
    public Iterator<r> iterator() {
        if (this.f12501f == null) {
            this.f12501f = new a<>(this.f12496a);
        }
        return this.f12501f.iterator();
    }

    public long k() {
        if (this.f12498c == -1) {
            long j11 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= this.f12496a.length) {
                    break;
                }
                j11 |= r3[i11].f12488a;
                i11++;
            }
            this.f12498c = j11;
        }
        return this.f12498c;
    }

    public long l() {
        return k() | (this.f12496a.length << 32);
    }

    public int m(int i11) {
        return o(i11, 0);
    }

    public int o(int i11, int i12) {
        r d11 = d(i11);
        return d11 == null ? i12 : d11.f12492e / 4;
    }

    public int p() {
        if (this.f12500e < 0) {
            int i11 = 0;
            this.f12500e = 0;
            while (true) {
                r[] rVarArr = this.f12496a;
                if (i11 >= rVarArr.length) {
                    break;
                }
                r rVar = rVarArr[i11];
                if (rVar.f12488a == 16) {
                    this.f12500e = Math.max(this.f12500e, rVar.f12494g + 1);
                }
                i11++;
            }
        }
        return this.f12500e;
    }

    public int size() {
        return this.f12496a.length;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (int i11 = 0; i11 < this.f12496a.length; i11++) {
            sb2.append(pn.j.f81006c);
            sb2.append(this.f12496a[i11].f12493f);
            sb2.append(j2.O);
            sb2.append(this.f12496a[i11].f12488a);
            sb2.append(j2.O);
            sb2.append(this.f12496a[i11].f12489b);
            sb2.append(j2.O);
            sb2.append(this.f12496a[i11].f12492e);
            sb2.append(pn.j.f81007d);
            sb2.append("\n");
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<T> implements Iterator<T>, Iterable<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T[] f12505a;

        /* renamed from: b, reason: collision with root package name */
        public int f12506b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f12507c = true;

        public b(T[] tArr) {
            this.f12505a = tArr;
        }

        public void a() {
            this.f12506b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f12507c) {
                return this.f12506b < this.f12505a.length;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.util.Iterator
        public T next() {
            int i11 = this.f12506b;
            T[] tArr = this.f12505a;
            if (i11 >= tArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f12506b));
            }
            if (!this.f12507c) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            this.f12506b = i11 + 1;
            return tArr[i11];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new GdxRuntimeException("Remove not allowed.");
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this;
        }
    }
}
