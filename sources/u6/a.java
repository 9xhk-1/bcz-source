package u6;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import l00.d;
import m80.k;
import m80.l;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u5.b f91856a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c6.b f91857b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.baicizhan.app.biz.game.uc.userbook.CollectWordsToBooksUC", f = "DoCollectWord.kt", i = {0, 0, 0}, l = {22}, m = "invoke", n = {"userBookIds", "topicId", "bookId"}, s = {"L$0", "I$0", "I$1"}, v = 1)
    /* renamed from: u6.a$a, reason: collision with other inner class name */
    public static final class C1224a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f91858a;

        /* renamed from: b, reason: collision with root package name */
        public int f91859b;

        /* renamed from: c, reason: collision with root package name */
        public Object f91860c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f91861d;

        /* renamed from: f, reason: collision with root package name */
        public int f91863f;

        public C1224a(j00.c<? super C1224a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f91861d = obj;
            this.f91863f |= Integer.MIN_VALUE;
            return a.this.a(0, null, 0, this);
        }
    }

    public a(@k u5.b plugin, @k c6.b gameInfoRepo) {
        g0.p(plugin, "plugin");
        g0.p(gameInfoRepo, "gameInfoRepo");
        this.f91856a = plugin;
        this.f91857b = gameInfoRepo;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r20, @m80.k java.util.List<java.lang.Long> r21, int r22, @m80.k j00.c<? super yz.g2> r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            boolean r5 = r4 instanceof u6.a.C1224a
            if (r5 == 0) goto L1d
            r5 = r4
            u6.a$a r5 = (u6.a.C1224a) r5
            int r6 = r5.f91863f
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L1d
            int r6 = r6 - r7
            r5.f91863f = r6
            goto L22
        L1d:
            u6.a$a r5 = new u6.a$a
            r5.<init>(r4)
        L22:
            java.lang.Object r4 = r5.f91861d
            java.lang.Object r6 = kotlin.coroutines.intrinsics.b.l()
            int r7 = r5.f91863f
            r8 = 1
            if (r7 == 0) goto L3f
            if (r7 != r8) goto L37
            java.lang.Object r1 = r5.f91860c
            java.util.List r1 = (java.util.List) r1
            kotlin.e.n(r4)
            goto L90
        L37:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3f:
            kotlin.e.n(r4)
            z6.b r9 = z6.b.f101032b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "Collecting words to books, topicId: "
            r4.append(r7)
            r4.append(r1)
            java.lang.String r7 = ", bookIds: "
            r4.append(r7)
            r10 = r2
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            r17 = 62
            r18 = 0
            java.lang.String r11 = ","
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            java.lang.String r7 = a00.r0.r3(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r4.append(r7)
            java.lang.String r11 = r4.toString()
            r13 = 4
            r14 = 0
            java.lang.String r10 = "DoCollectWordsToBooks"
            z6.b.d(r9, r10, r11, r12, r13, r14)
            u5.b r4 = r0.f91856a
            u5.a$c r4 = r4.b()
            java.lang.Object r7 = l00.k.a(r2)
            r5.f91860c = r7
            r5.f91858a = r1
            r5.f91859b = r3
            r5.f91863f = r8
            java.lang.Object r1 = r4.b(r1, r3, r2, r5)
            if (r1 != r6) goto L90
            return r6
        L90:
            z6.b r7 = z6.b.f101032b
            r11 = 4
            r12 = 0
            java.lang.String r8 = "DoCollectWordsToBooks"
            java.lang.String r9 = "success"
            r10 = 0
            z6.b.d(r7, r8, r9, r10, r11, r12)
            yz.g2 r1 = yz.g2.f100423a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.a.a(int, java.util.List, int, j00.c):java.lang.Object");
    }
}
