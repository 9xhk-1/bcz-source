package ij;

import a00.i0;
import a00.l1;
import a00.w1;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\ndata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 data.kt\ncom/baicizhan/main/word_book/data/DataKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,138:1\n1#2:139\n1563#3:140\n1634#3,3:141\n37#4,2:144\n*S KotlinDebug\n*F\n+ 1 data.kt\ncom/baicizhan/main/word_book/data/DataKt\n*L\n100#1:140\n100#1:141,3\n100#1:144,2\n*E\n"})
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f60622a = "收藏的单词";

    /* renamed from: b, reason: collision with root package name */
    public static final long f60623b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final long f60624c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f60625d = 3000;

    /* renamed from: e, reason: collision with root package name */
    public static final int f60626e = 500;

    /* JADX WARN: Removed duplicated region for block: B:10:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ij.z a(@m80.k kj.b r19, long r20) {
        /*
            java.lang.String r0 = "<this>"
            r1 = r19
            kotlin.jvm.internal.g0.p(r1, r0)
            ij.z$a r0 = ij.z.f60671m
            long r2 = r1.u()
            int r5 = r0.b(r2)
            long r2 = r1.u()
            int r6 = r0.a(r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r20)
            long r2 = r0.longValue()
            r7 = -1
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L29
            goto L2a
        L29:
            r0 = r3
        L2a:
            if (r0 == 0) goto L45
            long r9 = r0.longValue()
            java.util.Map r0 = r1.r()
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            java.lang.Object r0 = r0.get(r2)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L45
            long r9 = r0.longValue()
            goto L49
        L45:
            long r9 = java.lang.System.currentTimeMillis()
        L49:
            java.lang.String r0 = r1.v()
            r11 = r7
            r7 = r9
            java.lang.String r10 = r1.s()
            java.lang.String r2 = r1.p()
            java.lang.String r4 = ""
            if (r2 != 0) goto L5c
            r2 = r4
        L5c:
            java.lang.String r9 = r1.o()
            if (r9 != 0) goto L63
            goto L64
        L63:
            r4 = r9
        L64:
            java.lang.String r13 = r1.n()
            java.lang.Long r9 = java.lang.Long.valueOf(r20)
            long r14 = r9.longValue()
            int r11 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r11 == 0) goto L75
            r3 = r9
        L75:
            if (r3 == 0) goto L92
            long r11 = r3.longValue()
            java.util.Map r1 = r1.t()
            java.lang.Long r3 = java.lang.Long.valueOf(r11)
            java.lang.Object r1 = r1.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L92
            int r1 = r1.intValue()
        L8f:
            r14 = r1
            r12 = r4
            goto L94
        L92:
            r1 = 0
            goto L8f
        L94:
            ij.z r4 = new ij.z
            r15 = 0
            r16 = 0
            r17 = 1536(0x600, float:2.152E-42)
            r18 = 0
            r9 = r0
            r11 = r2
            r4.<init>(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ij.c.a(kj.b, long):ij.z");
    }

    public static /* synthetic */ z b(kj.b bVar, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = -1;
        }
        return a(bVar, j11);
    }

    @m80.k
    public static final kj.b c(@m80.k z zVar, @m80.k Set<Long> bookIds) {
        g0.p(zVar, "<this>");
        g0.p(bookIds, "bookIds");
        long y11 = zVar.y();
        Set<Long> set = bookIds;
        ArrayList arrayList = new ArrayList(i0.d0(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(h1.a(Long.valueOf(((Number) it.next()).longValue()), Long.valueOf(zVar.s())));
        }
        Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        return new kj.b(y11, bookIds, l1.W((Pair[]) Arrays.copyOf(pairArr, pairArr.length)), l1.z(), zVar.z(), zVar.t(), zVar.o(), zVar.q(), zVar.p());
    }

    public static /* synthetic */ kj.b d(z zVar, Set set, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            set = w1.k();
        }
        return c(zVar, set);
    }

    @m80.k
    public static final c0 e(@m80.k e0 e0Var, long j11) {
        g0.p(e0Var, "<this>");
        return new c0(e0Var.k(), e0Var.i(), j11, e0Var.l(), e0Var.j(), e0Var.h(), null, 64, null);
    }

    public static /* synthetic */ c0 f(e0 e0Var, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = System.currentTimeMillis();
        }
        return e(e0Var, j11);
    }

    @m80.k
    public static final TopicRecord g(@m80.k z zVar) {
        g0.p(zVar, "<this>");
        TopicRecord topicRecord = new TopicRecord();
        topicRecord.bookId = zVar.r();
        topicRecord.topicId = zVar.x();
        topicRecord.word = zVar.z();
        topicRecord.phonetic = zVar.o();
        topicRecord.wordMean = zVar.t();
        topicRecord.wordAudio = zVar.q();
        return topicRecord;
    }
}
