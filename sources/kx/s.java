package kx;

import kotlin.NotImplementedError;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import q30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHttpHeadersMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpHeadersMap.kt\nio/ktor/http/cio/HttpHeadersMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n1#2:150\n*E\n"})
/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final lx.d f69036a;

    /* renamed from: b, reason: collision with root package name */
    public int f69037b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public int[] f69038c;

    public s(@m80.k lx.d builder) {
        pz.d dVar;
        g0.p(builder, "builder");
        this.f69036a = builder;
        dVar = t.f69043e;
        this.f69038c = (int[]) dVar.U6();
    }

    public static /* synthetic */ int f(s sVar, String str, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return sVar.e(str, i11);
    }

    public static final Integer i(s sVar, int i11) {
        int i12 = i11 + 1;
        if (i12 >= sVar.f69037b) {
            return null;
        }
        return Integer.valueOf(i12);
    }

    public static final int j(int i11) {
        return i11 * 8;
    }

    public static final boolean k(s sVar, int i11, int i12) {
        return sVar.f69038c[i12] == i11;
    }

    public static final CharSequence l(s sVar, int i11) {
        lx.d dVar = sVar.f69036a;
        int[] iArr = sVar.f69038c;
        return dVar.subSequence(iArr[i11 + 4], iArr[i11 + 5]);
    }

    public final int e(@m80.k String name, int i11) {
        g0.p(name, "name");
        int j11 = lx.i.j(name, 0, 0, 3, null);
        int i12 = this.f69037b;
        while (i11 < i12) {
            if (this.f69038c[i11 * 8] == j11) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @m80.l
    public final CharSequence g(@m80.k String name) {
        g0.p(name, "name");
        int j11 = lx.i.j(name, 0, 0, 3, null);
        int i11 = this.f69037b;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i12 * 8;
            int[] iArr = this.f69038c;
            if (iArr[i13] == j11) {
                return this.f69036a.subSequence(iArr[i13 + 4], iArr[i13 + 5]);
            }
        }
        return null;
    }

    @m80.k
    public final q30.m<CharSequence> h(@m80.k String name) {
        g0.p(name, "name");
        final int j11 = lx.i.j(name, 0, 0, 3, null);
        return k0.N1(k0.P0(k0.N1(q30.x.t(0, new x00.l() { // from class: kx.o
            @Override // x00.l
            public final Object invoke(Object obj) {
                Integer i11;
                i11 = s.i(s.this, ((Integer) obj).intValue());
                return i11;
            }
        }), new x00.l() { // from class: kx.p
            @Override // x00.l
            public final Object invoke(Object obj) {
                int j12;
                j12 = s.j(((Integer) obj).intValue());
                return Integer.valueOf(j12);
            }
        }), new x00.l() { // from class: kx.q
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean k11;
                k11 = s.k(s.this, j11, ((Integer) obj).intValue());
                return Boolean.valueOf(k11);
            }
        }), new x00.l() { // from class: kx.r
            @Override // x00.l
            public final Object invoke(Object obj) {
                CharSequence l11;
                l11 = s.l(s.this, ((Integer) obj).intValue());
                return l11;
            }
        });
    }

    public final int m() {
        return this.f69037b;
    }

    @m80.k
    public final CharSequence n(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i11 >= this.f69037b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i12 = i11 * 8;
        int[] iArr = this.f69038c;
        return this.f69036a.subSequence(iArr[i12 + 2], iArr[i12 + 3]);
    }

    public final void o(int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = this.f69037b;
        int i18 = i17 * 8;
        int[] iArr = this.f69038c;
        if (i18 >= iArr.length) {
            throw new NotImplementedError("An operation is not implemented: Implement headers overflow");
        }
        iArr[i18] = i11;
        iArr[i18 + 1] = i12;
        iArr[i18 + 2] = i13;
        iArr[i18 + 3] = i14;
        iArr[i18 + 4] = i15;
        iArr[i18 + 5] = i16;
        iArr[i18 + 6] = -1;
        iArr[i18 + 7] = -1;
        this.f69037b = i17 + 1;
    }

    public final void p() {
        int[] iArr;
        int[] iArr2;
        pz.d dVar;
        this.f69037b = 0;
        int[] iArr3 = this.f69038c;
        iArr = t.f69042d;
        this.f69038c = iArr;
        iArr2 = t.f69042d;
        if (iArr3 != iArr2) {
            dVar = t.f69043e;
            dVar.b4(iArr3);
        }
    }

    @m80.k
    public final CharSequence q(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i11 >= this.f69037b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i12 = i11 * 8;
        int[] iArr = this.f69038c;
        return this.f69036a.subSequence(iArr[i12 + 4], iArr[i12 + 5]);
    }

    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        t.c(this, "", sb2);
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }
}
