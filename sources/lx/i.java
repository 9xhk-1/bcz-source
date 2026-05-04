package lx;

import a00.d1;
import a00.i0;
import a00.r0;
import ix.e1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.u0;
import x00.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nChars.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chars.kt\nio/ktor/http/cio/internals/CharsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n34#1:132\n34#1:133\n1#2:134\n1557#3:135\n1628#3,3:136\n1557#3:139\n1628#3,3:140\n*S KotlinDebug\n*F\n+ 1 Chars.kt\nio/ktor/http/cio/internals/CharsKt\n*L\n15#1:132\n26#1:133\n39#1:135\n39#1:136,3\n48#1:139\n48#1:140,3\n*E\n"})
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final char f71665a = '\t';

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final c<e1> f71666b = c.f71645b.d(e1.f62753b.a(), new l() { // from class: lx.g
        @Override // x00.l
        public final Object invoke(Object obj) {
            int c11;
            c11 = i.c((e1) obj);
            return Integer.valueOf(c11);
        }
    }, new p() { // from class: lx.h
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            char d11;
            d11 = i.d((e1) obj, ((Integer) obj2).intValue());
            return Character.valueOf(d11);
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final long[] f71667c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final byte[] f71668d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.http.cio.internals.CharsKt", f = "Chars.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {108, 116}, m = "writeIntHex", n = {"$this$writeIntHex", "table", "current", "digits", "$this$writeIntHex", "table", "current", "digits"}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f71669a;

        /* renamed from: b, reason: collision with root package name */
        public Object f71670b;

        /* renamed from: c, reason: collision with root package name */
        public int f71671c;

        /* renamed from: d, reason: collision with root package name */
        public int f71672d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f71673e;

        /* renamed from: f, reason: collision with root package name */
        public int f71674f;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f71673e = obj;
            this.f71674f |= Integer.MIN_VALUE;
            return i.r(null, 0, this);
        }
    }

    static {
        long j11;
        g10.l lVar = new g10.l(0, 255);
        ArrayList arrayList = new ArrayList(i0.d0(lVar, 10));
        Iterator<Integer> it = lVar.iterator();
        while (it.hasNext()) {
            int nextInt = ((d1) it).nextInt();
            if (48 > nextInt || nextInt >= 58) {
                long j12 = nextInt;
                long j13 = 97;
                if (j12 < 97 || j12 > 102) {
                    j13 = 65;
                    if (j12 < 65 || j12 > 70) {
                        j11 = -1;
                    }
                }
                j11 = (j12 - j13) + 10;
            } else {
                j11 = nextInt - 48;
            }
            arrayList.add(Long.valueOf(j11));
        }
        f71667c = r0.b6(arrayList);
        g10.l lVar2 = new g10.l(0, 15);
        ArrayList arrayList2 = new ArrayList(i0.d0(lVar2, 10));
        Iterator<Integer> it2 = lVar2.iterator();
        while (it2.hasNext()) {
            int nextInt2 = ((d1) it2).nextInt();
            arrayList2.add(Byte.valueOf((byte) (nextInt2 < 10 ? nextInt2 + 48 : (char) (((char) (nextInt2 + 97)) - '\n'))));
        }
        f71668d = r0.T5(arrayList2);
    }

    public static final int c(e1 it) {
        g0.p(it, "it");
        return it.l().length();
    }

    public static final char d(e1 m11, int i11) {
        g0.p(m11, "m");
        return m11.l().charAt(i11);
    }

    public static final boolean e(@m80.k CharSequence charSequence, int i11, int i12, @m80.k CharSequence other) {
        g0.p(charSequence, "<this>");
        g0.p(other, "other");
        if (i12 - i11 != other.length()) {
            return false;
        }
        for (int i13 = i11; i13 < i12; i13++) {
            int charAt = charSequence.charAt(i13);
            if (65 <= charAt && charAt < 91) {
                charAt += 32;
            }
            int charAt2 = other.charAt(i13 - i11);
            if (65 <= charAt2 && charAt2 < 91) {
                charAt2 += 32;
            }
            if (charAt != charAt2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean f(CharSequence charSequence, int i11, int i12, CharSequence charSequence2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = charSequence.length();
        }
        return e(charSequence, i11, i12, charSequence2);
    }

    @m80.k
    public static final c<e1> g() {
        return f71666b;
    }

    @m80.k
    public static final byte[] h() {
        return f71668d;
    }

    public static final int i(@m80.k CharSequence charSequence, int i11, int i12) {
        g0.p(charSequence, "<this>");
        int i13 = 0;
        while (i11 < i12) {
            int charAt = charSequence.charAt(i11);
            if (65 <= charAt && charAt < 91) {
                charAt += 32;
            }
            i13 = (i13 * 31) + charAt;
            i11++;
        }
        return i13;
    }

    public static /* synthetic */ int j(CharSequence charSequence, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = charSequence.length();
        }
        return i(charSequence, i11, i12);
    }

    public static final Void k(CharSequence charSequence, int i11) {
        throw new NumberFormatException("Invalid HEX number: " + ((Object) charSequence) + ", wrong digit: " + charSequence.charAt(i11));
    }

    public static final void l(CharSequence charSequence) {
        throw new NumberFormatException("Invalid number " + ((Object) charSequence) + ": too large for Long type");
    }

    public static final void m(CharSequence charSequence, int i11) {
        throw new NumberFormatException("Invalid number: " + ((Object) charSequence) + ", wrong digit: " + charSequence.charAt(i11) + " at position " + i11);
    }

    public static final long n(@m80.k CharSequence charSequence) {
        g0.p(charSequence, "<this>");
        int length = charSequence.length();
        if (length > 19) {
            l(charSequence);
        }
        if (length == 19) {
            return o(charSequence);
        }
        long j11 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            long charAt = charSequence.charAt(i11) - 48;
            if (charAt < 0 || charAt > 9) {
                m(charSequence, i11);
            }
            j11 = (j11 << 3) + (j11 << 1) + charAt;
        }
        return j11;
    }

    public static final long o(CharSequence charSequence) {
        int length = charSequence.length();
        long j11 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            long charAt = charSequence.charAt(i11) - 48;
            if (charAt < 0 || charAt > 9) {
                m(charSequence, i11);
            }
            j11 = (j11 << 3) + (j11 << 1) + charAt;
            if (j11 < 0) {
                l(charSequence);
            }
        }
        return j11;
    }

    public static final long p(@m80.k CharSequence charSequence) {
        g0.p(charSequence, "<this>");
        long[] jArr = f71667c;
        int length = charSequence.length();
        long j11 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int charAt = charSequence.charAt(i11) & q.f67020c;
            long j12 = charAt < 255 ? jArr[charAt] : -1L;
            if (j12 == -1) {
                k(charSequence, i11);
                throw new KotlinNothingValueException();
            }
            j11 = (j11 << 4) | j12;
        }
        return j11;
    }

    public static final int q(int i11) {
        return (65 > i11 || i11 >= 91) ? i11 : i11 + 32;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0067, code lost:
    
        if (io.ktor.utils.io.q.p(r7, r9, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(@m80.k io.ktor.utils.io.m r7, int r8, @m80.k j00.c<? super yz.g2> r9) {
        /*
            boolean r0 = r9 instanceof lx.i.a
            if (r0 == 0) goto L13
            r0 = r9
            lx.i$a r0 = (lx.i.a) r0
            int r1 = r0.f71674f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f71674f = r1
            goto L18
        L13:
            lx.i$a r0 = new lx.i$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f71673e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f71674f
            r3 = 8
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            goto L33
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            int r7 = r0.f71672d
            int r8 = r0.f71671c
            java.lang.Object r2 = r0.f71670b
            byte[] r2 = (byte[]) r2
            java.lang.Object r5 = r0.f71669a
            io.ktor.utils.io.m r5 = (io.ktor.utils.io.m) r5
            kotlin.e.n(r9)
            r6 = r7
            r7 = r5
            goto L6c
        L45:
            kotlin.e.n(r9)
            if (r8 <= 0) goto L8c
            byte[] r2 = lx.i.f71668d
            r9 = 0
        L4d:
            int r6 = r9 + 1
            if (r9 >= r3) goto L6c
            int r9 = r8 >>> 28
            int r8 = r8 << 4
            if (r9 == 0) goto L6a
            r9 = r2[r9]
            r0.f71669a = r7
            r0.f71670b = r2
            r0.f71671c = r8
            r0.f71672d = r6
            r0.f71674f = r5
            java.lang.Object r9 = io.ktor.utils.io.q.p(r7, r9, r0)
            if (r9 != r1) goto L6c
            goto L86
        L6a:
            r9 = r6
            goto L4d
        L6c:
            int r9 = r6 + 1
            if (r6 >= r3) goto L89
            int r5 = r8 >>> 28
            int r8 = r8 << 4
            r5 = r2[r5]
            r0.f71669a = r7
            r0.f71670b = r2
            r0.f71671c = r8
            r0.f71672d = r9
            r0.f71674f = r4
            java.lang.Object r5 = io.ktor.utils.io.q.p(r7, r5, r0)
            if (r5 != r1) goto L87
        L86:
            return r1
        L87:
            r6 = r9
            goto L6c
        L89:
            yz.g2 r7 = yz.g2.f100423a
            return r7
        L8c:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Does only work for positive numbers"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lx.i.r(io.ktor.utils.io.m, int, j00.c):java.lang.Object");
    }
}
