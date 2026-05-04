package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class m extends d {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f67586c;

    /* renamed from: d, reason: collision with root package name */
    public int f67587d = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public int f67588a;

        /* renamed from: b, reason: collision with root package name */
        public final int f67589b;

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f67588a < this.f67589b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte nextByte() {
            try {
                byte[] bArr = m.this.f67586c;
                int i11 = this.f67588a;
                this.f67588a = i11 + 1;
                return bArr[i11];
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new NoSuchElementException(e11.getMessage());
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public b() {
            this.f67588a = 0;
            this.f67589b = m.this.size();
        }
    }

    public m(byte[] bArr) {
        this.f67586c = bArr;
    }

    public static int C(int i11, byte[] bArr, int i12, int i13) {
        for (int i14 = i12; i14 < i12 + i13; i14++) {
            i11 = (i11 * 31) + bArr[i14];
        }
        return i11;
    }

    public boolean A(m mVar, int i11, int i12) {
        if (i12 > mVar.size()) {
            int size = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i12);
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i11 + i12 > mVar.size()) {
            int size2 = mVar.size();
            StringBuilder sb3 = new StringBuilder(59);
            sb3.append("Ran off end of other: ");
            sb3.append(i11);
            sb3.append(j2.O);
            sb3.append(i12);
            sb3.append(j2.O);
            sb3.append(size2);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = this.f67586c;
        byte[] bArr2 = mVar.f67586c;
        int B = B() + i12;
        int B2 = B();
        int B3 = mVar.B() + i11;
        while (B2 < B) {
            if (bArr[B2] != bArr2[B3]) {
                return false;
            }
            B2++;
            B3++;
        }
        return true;
    }

    public int B() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d) || size() != ((d) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof m) {
            return A((m) obj, 0, size());
        }
        if (obj instanceof r) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
        sb2.append("Has a new type of ByteString been created? Found ");
        sb2.append(valueOf);
        throw new IllegalArgumentException(sb2.toString());
    }

    public int hashCode() {
        int i11 = this.f67587d;
        if (i11 == 0) {
            int size = size();
            i11 = r(size, 0, size);
            if (i11 == 0) {
                i11 = 1;
            }
            this.f67587d = i11;
        }
        return i11;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public void k(byte[] bArr, int i11, int i12, int i13) {
        System.arraycopy(this.f67586c, i11, bArr, i12, i13);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int l() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public boolean m() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public boolean n() {
        int B = B();
        return u.f(this.f67586c, B, size() + B);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d, java.lang.Iterable
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public d.a iterator() {
        return new b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public e p() {
        return e.h(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int r(int i11, int i12, int i13) {
        return C(i11, this.f67586c, B() + i12, i13);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int s(int i11, int i12, int i13) {
        int B = B() + i12;
        return u.g(i11, this.f67586c, B, i13 + B);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f67586c.length;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int t() {
        return this.f67587d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public String v(String str) throws UnsupportedEncodingException {
        return new String(this.f67586c, B(), size(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public void y(OutputStream outputStream, int i11, int i12) throws IOException {
        outputStream.write(this.f67586c, B() + i11, i12);
    }

    public byte z(int i11) {
        return this.f67586c[i11];
    }
}
