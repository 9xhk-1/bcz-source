package m60;

import a00.l1;
import a00.r0;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import okio.f;
import u30.f0;
import u30.k0;
import yz.c2;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nZipFiles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFiles.kt\nokio/internal/ZipFilesKt\n+ 2 Okio.kt\nokio/Okio__OkioKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,503:1\n58#2,4:504\n58#2,4:508\n58#2,22:512\n66#2,10:534\n62#2,3:544\n77#2,3:547\n58#2,22:550\n66#2,10:572\n62#2,3:582\n77#2,3:585\n1056#3:588\n*S KotlinDebug\n*F\n+ 1 ZipFiles.kt\nokio/internal/ZipFilesKt\n*L\n66#1:504,4\n101#1:508,4\n109#1:512,22\n101#1:534,10\n101#1:544,3\n101#1:547,3\n125#1:550,22\n66#1:572,10\n66#1:582,3\n66#1:585,3\n155#1:588\n*E\n"})
/* loaded from: classes8.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final int f72501a = 67324752;

    /* renamed from: b, reason: collision with root package name */
    public static final int f72502b = 33639248;

    /* renamed from: c, reason: collision with root package name */
    public static final int f72503c = 101010256;

    /* renamed from: d, reason: collision with root package name */
    public static final int f72504d = 117853008;

    /* renamed from: e, reason: collision with root package name */
    public static final int f72505e = 101075792;

    /* renamed from: f, reason: collision with root package name */
    public static final int f72506f = 8;

    /* renamed from: g, reason: collision with root package name */
    public static final int f72507g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f72508h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f72509i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final long f72510j = 4294967295L;

    /* renamed from: k, reason: collision with root package name */
    public static final int f72511k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f72512l = 10;

    /* renamed from: m, reason: collision with root package name */
    public static final int f72513m = 21589;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ZipFiles.kt\nokio/internal/ZipFilesKt\n*L\n1#1,328:1\n155#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(((s) t11).b(), ((s) t12).b());
        }
    }

    public static final Map<okio.f, s> e(List<s> list) {
        okio.f h11 = f.a.h(okio.f.f77539b, "/", false, 1, null);
        Map<okio.f, s> j02 = l1.j0(h1.a(h11, new s(h11, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null)));
        for (s sVar : r0.z5(list, new a())) {
            if (j02.put(sVar.b(), sVar) == null) {
                while (true) {
                    okio.f t11 = sVar.b().t();
                    if (t11 != null) {
                        s sVar2 = j02.get(t11);
                        if (sVar2 != null) {
                            sVar2.c().add(sVar.b());
                            break;
                        }
                        s sVar3 = new s(t11, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null);
                        j02.put(t11, sVar3);
                        sVar3.c().add(sVar.b());
                        sVar = sVar3;
                    }
                }
            }
        }
        return j02;
    }

    @m80.l
    public static final Long f(int i11, int i12) {
        if (i12 == -1) {
            return null;
        }
        return Long.valueOf(b0.a(((i11 >> 9) & 127) + 1980, (i11 >> 5) & 15, i11 & 31, (i12 >> 11) & 31, (i12 >> 5) & 63, (i12 & 31) << 1));
    }

    public static final long g(long j11) {
        return (j11 / 10000) - 11644473600000L;
    }

    public static final String h(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("0x");
        String num = Integer.toString(i11, kotlin.text.a.a(16));
        g0.o(num, "toString(...)");
        sb2.append(num);
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010b A[Catch: all -> 0x0103, TryCatch #1 {all -> 0x0103, blocks: (B:3:0x0019, B:5:0x0027, B:6:0x0030, B:19:0x004e, B:21:0x005a, B:60:0x010b, B:65:0x00ff, B:77:0x010c, B:97:0x016e, B:104:0x017f, B:118:0x0168, B:10:0x0182, B:14:0x018e, B:15:0x0195, B:122:0x0196, B:123:0x0199, B:124:0x019a, B:125:0x01b4, B:8:0x0038, B:18:0x0041, B:79:0x011d, B:82:0x0125, B:84:0x0135, B:86:0x0141, B:88:0x0148, B:91:0x014c, B:92:0x0153, B:94:0x0154, B:115:0x0161, B:62:0x00f8), top: B:2:0x0019, inners: #0, #2, #3, #12 }] */
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final okio.h i(@m80.k okio.f r18, @m80.k okio.b r19, @m80.k x00.l<? super m60.s, java.lang.Boolean> r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m60.x.i(okio.f, okio.b, x00.l):okio.h");
    }

    public static /* synthetic */ okio.h j(okio.f fVar, okio.b bVar, x00.l lVar, int i11, Object obj) throws IOException {
        if ((i11 & 4) != 0) {
            lVar = new x00.l() { // from class: m60.t
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    boolean k11;
                    k11 = x.k((s) obj2);
                    return Boolean.valueOf(k11);
                }
            };
        }
        return i(fVar, bVar, lVar);
    }

    public static final boolean k(s it) {
        g0.p(it, "it");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final s l(@m80.k final l60.m mVar) throws IOException {
        g0.p(mVar, "<this>");
        int b82 = mVar.b8();
        if (b82 != 33639248) {
            throw new IOException("bad zip: expected " + h(f72502b) + " but was " + h(b82));
        }
        mVar.skip(4L);
        short v12 = mVar.v1();
        int i11 = v12 & c2.f100412d;
        if ((v12 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + h(i11));
        }
        int v13 = mVar.v1() & c2.f100412d;
        int v14 = mVar.v1() & c2.f100412d;
        int v15 = mVar.v1() & c2.f100412d;
        long b83 = mVar.b8() & 4294967295L;
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = mVar.b8() & 4294967295L;
        final Ref.LongRef longRef2 = new Ref.LongRef();
        longRef2.element = mVar.b8() & 4294967295L;
        int v16 = mVar.v1() & c2.f100412d;
        int v17 = mVar.v1() & c2.f100412d;
        int v18 = mVar.v1() & c2.f100412d;
        mVar.skip(8L);
        final Ref.LongRef longRef3 = new Ref.LongRef();
        longRef3.element = mVar.b8() & 4294967295L;
        String b22 = mVar.b2(v16);
        if (k0.m3(b22, (char) 0, false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j11 = longRef2.element == 4294967295L ? 8 : 0L;
        if (longRef.element == 4294967295L) {
            j11 += 8;
        }
        if (longRef3.element == 4294967295L) {
            j11 += 8;
        }
        final long j12 = j11;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        p(mVar, v17, new x00.p() { // from class: m60.w
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                g2 m11;
                m11 = x.m(Ref.BooleanRef.this, j12, longRef2, mVar, longRef, longRef3, objectRef, objectRef2, objectRef3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
                return m11;
            }
        });
        if (j12 <= 0 || booleanRef.element) {
            return new s(f.a.h(okio.f.f77539b, "/", false, 1, null).v(b22), f0.b2(b22, "/", false, 2, null), mVar.b2(v18), b83, longRef.element, longRef2.element, v13, longRef3.element, v15, v14, (Long) objectRef.element, (Long) objectRef2.element, (Long) objectRef3.element, null, null, null, 57344, null);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    public static final g2 m(Ref.BooleanRef booleanRef, long j11, Ref.LongRef longRef, final l60.m mVar, Ref.LongRef longRef2, Ref.LongRef longRef3, final Ref.ObjectRef objectRef, final Ref.ObjectRef objectRef2, final Ref.ObjectRef objectRef3, int i11, long j12) {
        if (i11 != 1) {
            if (i11 == 10) {
                if (j12 < 4) {
                    throw new IOException("bad zip: NTFS extra too short");
                }
                mVar.skip(4L);
                p(mVar, (int) (j12 - 4), new x00.p() { // from class: m60.u
                    @Override // x00.p
                    public final Object invoke(Object obj, Object obj2) {
                        g2 n11;
                        n11 = x.n(Ref.ObjectRef.this, mVar, objectRef2, objectRef3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
                        return n11;
                    }
                });
            }
        } else {
            if (booleanRef.element) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            booleanRef.element = true;
            if (j12 < j11) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            long j13 = longRef.element;
            if (j13 == 4294967295L) {
                j13 = mVar.B1();
            }
            longRef.element = j13;
            longRef2.element = longRef2.element == 4294967295L ? mVar.B1() : 0L;
            longRef3.element = longRef3.element == 4294967295L ? mVar.B1() : 0L;
        }
        return g2.f100423a;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Long] */
    public static final g2 n(Ref.ObjectRef objectRef, l60.m mVar, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, int i11, long j11) {
        if (i11 == 1) {
            if (objectRef.element != 0) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
            }
            if (j11 != 24) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
            }
            objectRef.element = Long.valueOf(mVar.B1());
            objectRef2.element = Long.valueOf(mVar.B1());
            objectRef3.element = Long.valueOf(mVar.B1());
        }
        return g2.f100423a;
    }

    public static final l o(l60.m mVar) throws IOException {
        int v12 = mVar.v1() & c2.f100412d;
        int v13 = mVar.v1() & c2.f100412d;
        long v14 = mVar.v1() & c2.f100412d;
        if (v14 != (mVar.v1() & c2.f100412d) || v12 != 0 || v13 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        mVar.skip(4L);
        return new l(v14, 4294967295L & mVar.b8(), mVar.v1() & c2.f100412d);
    }

    public static final void p(l60.m mVar, int i11, x00.p<? super Integer, ? super Long, g2> pVar) {
        long j11 = i11;
        while (j11 != 0) {
            if (j11 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int v12 = mVar.v1() & c2.f100412d;
            long v13 = mVar.v1() & j60.g.f63638t;
            long j12 = j11 - 4;
            if (j12 < v13) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            mVar.F(v13);
            long size = mVar.getBuffer().size();
            pVar.invoke(Integer.valueOf(v12), Long.valueOf(v13));
            long size2 = (mVar.getBuffer().size() + v13) - size;
            if (size2 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + v12);
            }
            if (size2 > 0) {
                mVar.getBuffer().skip(size2);
            }
            j11 = j12 - v13;
        }
    }

    @m80.k
    public static final s q(@m80.k l60.m mVar, @m80.k s centralDirectoryZipEntry) {
        g0.p(mVar, "<this>");
        g0.p(centralDirectoryZipEntry, "centralDirectoryZipEntry");
        s r11 = r(mVar, centralDirectoryZipEntry);
        g0.m(r11);
        return r11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final s r(final l60.m mVar, s sVar) {
        int b82 = mVar.b8();
        if (b82 != 67324752) {
            throw new IOException("bad zip: expected " + h(f72501a) + " but was " + h(b82));
        }
        mVar.skip(2L);
        short v12 = mVar.v1();
        int i11 = v12 & c2.f100412d;
        if ((v12 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + h(i11));
        }
        mVar.skip(18L);
        long v13 = mVar.v1() & j60.g.f63638t;
        int v14 = mVar.v1() & c2.f100412d;
        mVar.skip(v13);
        if (sVar == null) {
            mVar.skip(v14);
            return null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        p(mVar, v14, new x00.p() { // from class: m60.v
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                g2 s11;
                s11 = x.s(l60.m.this, objectRef, objectRef2, objectRef3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
                return s11;
            }
        });
        return sVar.a((Integer) objectRef.element, (Integer) objectRef2.element, (Integer) objectRef3.element);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v6, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v5, types: [T, java.lang.Integer] */
    public static final g2 s(l60.m mVar, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, int i11, long j11) {
        if (i11 == 21589) {
            if (j11 < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            byte readByte = mVar.readByte();
            boolean z11 = (readByte & 1) == 1;
            boolean z12 = (readByte & 2) == 2;
            boolean z13 = (readByte & 4) == 4;
            long j12 = z11 ? 5L : 1L;
            if (z12) {
                j12 += 4;
            }
            if (z13) {
                j12 += 4;
            }
            if (j11 < j12) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if (z11) {
                objectRef.element = Integer.valueOf(mVar.b8());
            }
            if (z12) {
                objectRef2.element = Integer.valueOf(mVar.b8());
            }
            if (z13) {
                objectRef3.element = Integer.valueOf(mVar.b8());
            }
        }
        return g2.f100423a;
    }

    public static final l t(l60.m mVar, l lVar) throws IOException {
        mVar.skip(12L);
        int b82 = mVar.b8();
        int b83 = mVar.b8();
        long B1 = mVar.B1();
        if (B1 != mVar.B1() || b82 != 0 || b83 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        mVar.skip(8L);
        return new l(B1, mVar.B1(), lVar.b());
    }

    public static final void u(@m80.k l60.m mVar) {
        g0.p(mVar, "<this>");
        r(mVar, null);
    }
}
