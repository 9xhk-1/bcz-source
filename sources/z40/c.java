package z40;

import a00.q;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.o1;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nkotlinx/io/bytestring/ByteString\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,550:1\n1#2:551\n*E\n"})
/* loaded from: classes8.dex */
public final class c implements Comparable<c> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f100824c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final c f100825d = new c(new byte[0], null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final char[] f100826e;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final byte[] f100827a;

    /* renamed from: b, reason: collision with root package name */
    @b
    public int f100828b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final c a() {
            return c.f100825d;
        }

        @k
        public final c b(@k byte[] byteArray) {
            g0.p(byteArray, "byteArray");
            v vVar = null;
            return new c(byteArray, vVar, vVar);
        }

        public a() {
        }
    }

    static {
        char[] charArray = u30.h.f91619a.toCharArray();
        g0.o(charArray, "toCharArray(...)");
        f100826e = charArray;
    }

    public /* synthetic */ c(byte[] bArr, Object obj, v vVar) {
        this(bArr, obj);
    }

    public static /* synthetic */ void d(c cVar, byte[] bArr, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = cVar.g();
        }
        cVar.c(bArr, i11, i12, i13);
    }

    public static /* synthetic */ c k(c cVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = cVar.g();
        }
        return cVar.i(i11, i12);
    }

    public static /* synthetic */ byte[] m(c cVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = cVar.g();
        }
        return cVar.l(i11, i12);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@k c other) {
        g0.p(other, "other");
        if (other == this) {
            return 0;
        }
        byte[] bArr = this.f100827a;
        byte[] bArr2 = other.f100827a;
        int min = Math.min(g(), other.g());
        for (int i11 = 0; i11 < min; i11++) {
            int t11 = g0.t(o1.i(bArr[i11]) & 255, o1.i(bArr2[i11]) & 255);
            if (t11 != 0) {
                return t11;
            }
        }
        return g0.t(g(), other.g());
    }

    public final void c(@k byte[] destination, int i11, int i12, int i13) {
        g0.p(destination, "destination");
        if (i12 <= i13) {
            q.v0(this.f100827a, destination, i11, i12, i13);
            return;
        }
        throw new IllegalArgumentException(("startIndex (" + i12 + ") > endIndex (" + i13 + ')').toString());
    }

    public final byte e(int i11) {
        if (i11 >= 0 && i11 < g()) {
            return this.f100827a[i11];
        }
        throw new IndexOutOfBoundsException("index (" + i11 + ") is out of byte string bounds: [0.." + g() + ')');
    }

    public boolean equals(@l Object obj) {
        int i11;
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        byte[] bArr = cVar.f100827a;
        int length = bArr.length;
        byte[] bArr2 = this.f100827a;
        if (length != bArr2.length) {
            return false;
        }
        int i12 = cVar.f100828b;
        if (i12 == 0 || (i11 = this.f100828b) == 0 || i12 == i11) {
            return Arrays.equals(bArr2, bArr);
        }
        return false;
    }

    @v0
    @k
    public final byte[] f() {
        return this.f100827a;
    }

    public final int g() {
        return this.f100827a.length;
    }

    public int hashCode() {
        int i11 = this.f100828b;
        if (i11 != 0) {
            return i11;
        }
        int hashCode = Arrays.hashCode(this.f100827a);
        this.f100828b = hashCode;
        return hashCode;
    }

    @k
    public final c i(int i11, int i12) {
        return i11 == i12 ? f100825d : new c(this.f100827a, i11, i12);
    }

    @k
    public final byte[] l(int i11, int i12) {
        if (i11 <= i12) {
            return q.f1(this.f100827a, i11, i12);
        }
        throw new IllegalArgumentException(("startIndex (" + i11 + ") > endIndex (" + i12 + ')').toString());
    }

    @k
    public String toString() {
        if (g.p(this)) {
            return "ByteString(size=0)";
        }
        String valueOf = String.valueOf(g());
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 22 + (g() * 2));
        sb2.append("ByteString(size=");
        sb2.append(valueOf);
        sb2.append(" hex=");
        byte[] bArr = this.f100827a;
        int g11 = g();
        for (int i11 = 0; i11 < g11; i11++) {
            byte b11 = bArr[i11];
            char[] cArr = f100826e;
            sb2.append(cArr[(b11 >>> 4) & 15]);
            sb2.append(cArr[b11 & 15]);
        }
        sb2.append(')');
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    public c(byte[] bArr, Object obj) {
        this.f100827a = bArr;
    }

    public /* synthetic */ c(byte[] bArr, int i11, int i12, int i13, v vVar) {
        this(bArr, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? bArr.length : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@k byte[] data, int i11, int i12) {
        this(q.f1(data, i11, i12), null);
        g0.p(data, "data");
    }
}
