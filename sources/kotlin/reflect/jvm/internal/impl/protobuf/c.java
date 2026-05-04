package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class c extends m {

    /* renamed from: e, reason: collision with root package name */
    public final int f67537e;

    /* renamed from: f, reason: collision with root package name */
    public final int f67538f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public int f67539a;

        /* renamed from: b, reason: collision with root package name */
        public final int f67540b;

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f67539a < this.f67540b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte nextByte() {
            int i11 = this.f67539a;
            if (i11 >= this.f67540b) {
                throw new NoSuchElementException();
            }
            byte[] bArr = c.this.f67586c;
            this.f67539a = i11 + 1;
            return bArr[i11];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public b() {
            int B = c.this.B();
            this.f67539a = B;
            this.f67540b = B + c.this.size();
        }
    }

    public c(byte[] bArr, int i11, int i12) {
        super(bArr);
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Offset too small: ");
            sb2.append(i11);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i12 < 0) {
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append("Length too small: ");
            sb3.append(i11);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (i11 + i12 <= bArr.length) {
            this.f67537e = i11;
            this.f67538f = i12;
            return;
        }
        StringBuilder sb4 = new StringBuilder(48);
        sb4.append("Offset+Length too large: ");
        sb4.append(i11);
        sb4.append("+");
        sb4.append(i12);
        throw new IllegalArgumentException(sb4.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public int B() {
        return this.f67537e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m, kotlin.reflect.jvm.internal.impl.protobuf.d
    public void k(byte[] bArr, int i11, int i12, int i13) {
        System.arraycopy(this.f67586c, B() + i11, bArr, i12, i13);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m, kotlin.reflect.jvm.internal.impl.protobuf.d, java.lang.Iterable
    /* renamed from: o */
    public d.a iterator() {
        return new b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m, kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f67538f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public byte z(int i11) {
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(28);
            sb2.append("Index too small: ");
            sb2.append(i11);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < size()) {
            return this.f67586c[this.f67537e + i11];
        }
        int size = size();
        StringBuilder sb3 = new StringBuilder(41);
        sb3.append("Index too large: ");
        sb3.append(i11);
        sb3.append(j2.O);
        sb3.append(size);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }
}
