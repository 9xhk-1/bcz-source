package z40;

import a00.q;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nByteStringBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteStringBuilder.kt\nkotlinx/io/bytestring/ByteStringBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1#2:130\n*E\n"})
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public byte[] f100829a;

    /* renamed from: b, reason: collision with root package name */
    public int f100830b;

    public d() {
        this(0, 1, null);
    }

    public static /* synthetic */ void c(d dVar, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = bArr.length;
        }
        dVar.b(bArr, i11, i12);
    }

    public final void a(byte b11) {
        d(f() + 1);
        byte[] bArr = this.f100829a;
        int i11 = this.f100830b;
        this.f100830b = i11 + 1;
        bArr[i11] = b11;
    }

    public final void b(@k byte[] array, int i11, int i12) {
        g0.p(array, "array");
        if (i11 > i12) {
            throw new IllegalArgumentException(("startIndex (" + i11 + ") > endIndex (" + i12 + ')').toString());
        }
        if (i11 >= 0 && i12 <= array.length) {
            d((this.f100830b + i12) - i11);
            q.v0(array, this.f100829a, this.f100830b, i11, i12);
            this.f100830b += i12 - i11;
            return;
        }
        throw new IndexOutOfBoundsException("startIndex (" + i11 + ") and endIndex (" + i12 + ") represents an interval out of array's bounds [0.." + array.length + ").");
    }

    public final void d(int i11) {
        byte[] bArr = this.f100829a;
        if (bArr.length >= i11) {
            return;
        }
        byte[] bArr2 = new byte[Math.max(bArr.length == 0 ? 16 : (int) (bArr.length * 1.5d), i11)];
        q.E0(this.f100829a, bArr2, 0, 0, 0, 14, null);
        this.f100829a = bArr2;
    }

    public final int e() {
        return this.f100829a.length;
    }

    public final int f() {
        return this.f100830b;
    }

    @k
    public final c g() {
        return f() == 0 ? g.a() : this.f100829a.length == f() ? c.f100824c.b(this.f100829a) : new c(this.f100829a, 0, f());
    }

    public d(int i11) {
        this.f100829a = new byte[i11];
    }

    public /* synthetic */ d(int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? 0 : i11);
    }
}
