package di;

import androidx.compose.runtime.internal.StabilityInferred;
import k3.d1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWordFavoritePlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordFavoritePlugin.kt\ncom/baicizhan/main/unity/data/WordFavoritePlugin\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,39:1\n774#2:40\n865#2,2:41\n1563#2:43\n1634#2,3:44\n1563#2:47\n1634#2,3:48\n*S KotlinDebug\n*F\n+ 1 WordFavoritePlugin.kt\ncom/baicizhan/main/unity/data/WordFavoritePlugin\n*L\n28#1:40\n28#1:41,2\n28#1:43\n28#1:44,3\n29#1:47\n29#1:48,3\n*E\n"})
/* loaded from: classes4.dex */
public final class d implements d1.e {

    /* renamed from: b, reason: collision with root package name */
    public static final int f48003b = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ij.e f48004a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.unity.data.WordFavoritePlugin", f = "WordFavoritePlugin.kt", i = {0, 0, 0}, l = {19}, m = "collectWord2Books", n = {"bookIds", "topicId", "bookId"}, s = {"L$0", "I$0", "I$1"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f48005a;

        /* renamed from: b, reason: collision with root package name */
        public int f48006b;

        /* renamed from: c, reason: collision with root package name */
        public Object f48007c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f48008d;

        /* renamed from: f, reason: collision with root package name */
        public int f48010f;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f48008d = obj;
            this.f48010f |= Integer.MIN_VALUE;
            return d.this.b(0, 0, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.unity.data.WordFavoritePlugin", f = "WordFavoritePlugin.kt", i = {0}, l = {23}, m = "getWordCollectionState", n = {"topicId"}, s = {"I$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f48011a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f48012b;

        /* renamed from: d, reason: collision with root package name */
        public int f48014d;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f48012b = obj;
            this.f48014d |= Integer.MIN_VALUE;
            return d.this.c(0, this);
        }
    }

    public d(@k ij.e controller) {
        g0.p(controller, "controller");
        this.f48004a = controller;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // k3.d1.e
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(int r11, int r12, @m80.k java.util.List<java.lang.Long> r13, @m80.k j00.c<? super yz.g2> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof di.d.a
            if (r0 == 0) goto L13
            r0 = r14
            di.d$a r0 = (di.d.a) r0
            int r1 = r0.f48010f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48010f = r1
            goto L18
        L13:
            di.d$a r0 = new di.d$a
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f48008d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f48010f
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r11 = r0.f48007c
            java.util.List r11 = (java.util.List) r11
            kotlin.e.n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            r14.m6317unboximpl()
            goto L71
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            kotlin.e.n(r14)
            ij.e r14 = r10.f48004a
            ij.q r14 = r14.O()
            ij.e0 r4 = new ij.e0
            java.lang.String r8 = ""
            java.lang.String r9 = ""
            java.lang.String r7 = ""
            r5 = r11
            r6 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r11 = 0
            r2 = 0
            ij.c0 r11 = ij.c.f(r4, r11, r3, r2)
            r12 = r13
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Set r12 = a00.r0.f6(r12)
            java.lang.Object r13 = l00.k.a(r13)
            r0.f48007c = r13
            r0.f48005a = r5
            r0.f48006b = r6
            r0.f48010f = r3
            java.lang.Object r11 = r14.c0(r11, r12, r0)
            if (r11 != r1) goto L71
            return r1
        L71:
            yz.g2 r11 = yz.g2.f100423a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: di.d.b(int, int, java.util.List, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d A[LOOP:1: B:22:0x0097->B:24:0x009d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2 A[LOOP:2: B:27:0x00bc->B:29:0x00c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // k3.d1.e
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(int r9, @m80.k j00.c<? super k3.h4> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof di.d.b
            if (r0 == 0) goto L13
            r0 = r10
            di.d$b r0 = (di.d.b) r0
            int r1 = r0.f48014d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48014d = r1
            goto L18
        L13:
            di.d$b r0 = new di.d$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f48012b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f48014d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            kotlin.e.n(r10)
            goto L48
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            kotlin.e.n(r10)
            ij.e r10 = r8.f48004a
            ij.z$a r2 = ij.z.f60671m
            long r5 = r2.c(r3, r9)
            r0.f48011a = r9
            r0.f48014d = r4
            java.lang.Object r10 = r10.o(r5, r0)
            if (r10 != r1) goto L48
            return r1
        L48:
            java.util.List r10 = (java.util.List) r10
            int r9 = r10.size()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getWordCollectionState: "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "WordFavoritePlugin"
            qb.c.b(r1, r9, r0)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r0 = r10.iterator()
        L71:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L88
            java.lang.Object r1 = r0.next()
            r2 = r1
            com.baicizhan.main.word_book.data.FavoriteInfo r2 = (com.baicizhan.main.word_book.data.FavoriteInfo) r2
            boolean r2 = r2.k()
            if (r2 == 0) goto L71
            r9.add(r1)
            goto L71
        L88:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r2 = a00.i0.d0(r9, r1)
            r0.<init>(r2)
            java.util.Iterator r9 = r9.iterator()
        L97:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Laf
            java.lang.Object r2 = r9.next()
            com.baicizhan.main.word_book.data.FavoriteInfo r2 = (com.baicizhan.main.word_book.data.FavoriteInfo) r2
            long r2 = r2.i()
            java.lang.Long r2 = l00.a.g(r2)
            r0.add(r2)
            goto L97
        Laf:
            java.util.ArrayList r9 = new java.util.ArrayList
            int r1 = a00.i0.d0(r10, r1)
            r9.<init>(r1)
            java.util.Iterator r10 = r10.iterator()
        Lbc:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto Le1
            java.lang.Object r1 = r10.next()
            com.baicizhan.main.word_book.data.FavoriteInfo r1 = (com.baicizhan.main.word_book.data.FavoriteInfo) r1
            k3.p3 r2 = new k3.p3
            long r3 = r1.i()
            java.lang.String r5 = r1.l()
            int r6 = r1.m()
            java.lang.String r7 = r1.j()
            r2.<init>(r3, r5, r6, r7)
            r9.add(r2)
            goto Lbc
        Le1:
            k3.h4 r10 = new k3.h4
            r10.<init>(r0, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: di.d.c(int, j00.c):java.lang.Object");
    }
}
