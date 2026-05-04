package h6;

import com.baicizhan.app.biz.game.repo.gameround.e;
import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l00.d;
import m80.k;
import m80.l;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nUpdateGameRoundUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateGameRoundUC.kt\ncom/baicizhan/app/biz/game/uc/gameround/UpdateGameRoundUC\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,21:1\n295#2,2:22\n*S KotlinDebug\n*F\n+ 1 UpdateGameRoundUC.kt\ncom/baicizhan/app/biz/game/uc/gameround/UpdateGameRoundUC\n*L\n16#1:22,2\n*E\n"})
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f58554a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f6.e f58555b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.baicizhan.app.biz.game.uc.gameround.UpdateGameRoundUC", f = "UpdateGameRoundUC.kt", i = {0, 0, 0, 0, 1, 1}, l = {17, 19}, m = "invoke", n = {"roundInfoList", "it", "bookId", "$i$a$-also-UpdateGameRoundUC$invoke$3", "roundInfoList", "bookId"}, s = {"L$0", "L$2", "J$0", "I$0", "L$0", "J$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f58556a;

        /* renamed from: b, reason: collision with root package name */
        public Object f58557b;

        /* renamed from: c, reason: collision with root package name */
        public Object f58558c;

        /* renamed from: d, reason: collision with root package name */
        public Object f58559d;

        /* renamed from: e, reason: collision with root package name */
        public int f58560e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f58561f;

        /* renamed from: h, reason: collision with root package name */
        public int f58563h;

        public a(c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f58561f = obj;
            this.f58563h |= Integer.MIN_VALUE;
            return b.this.a(0L, null, this);
        }
    }

    public b(@k e gameRoundRepo, @k f6.e updateStudyIdxUC) {
        g0.p(gameRoundRepo, "gameRoundRepo");
        g0.p(updateStudyIdxUC, "updateStudyIdxUC");
        this.f58554a = gameRoundRepo;
        this.f58555b = updateStudyIdxUC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ac, code lost:
    
        if (r13.d(r10, r12, r0) != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ae, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        if (r13.a(r10, r6, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r10, @m80.k java.util.List<p8.h0> r12, @m80.k j00.c<? super yz.g2> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof h6.b.a
            if (r0 == 0) goto L13
            r0 = r13
            h6.b$a r0 = (h6.b.a) r0
            int r1 = r0.f58563h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58563h = r1
            goto L18
        L13:
            h6.b$a r0 = new h6.b$a
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f58561f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f58563h
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r10 = r0.f58557b
            java.util.List r10 = (java.util.List) r10
            kotlin.e.n(r13)
            goto Laf
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            long r10 = r0.f58556a
            java.lang.Object r12 = r0.f58559d
            p8.h0 r12 = (p8.h0) r12
            java.lang.Object r12 = r0.f58558c
            p8.h0 r12 = (p8.h0) r12
            java.lang.Object r12 = r0.f58557b
            java.util.List r12 = (java.util.List) r12
            kotlin.e.n(r13)
            goto L98
        L4c:
            kotlin.e.n(r13)
            r13 = r12
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r13 = r13.iterator()
        L56:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r13.next()
            r6 = r2
            p8.h0 r6 = (p8.h0) r6
            int r6 = r6.f79850e
            com.baicizhan.app.biz.game.model.RoundType r7 = com.baicizhan.app.biz.game.model.RoundType.LEARNING
            long r7 = r7.getValue()
            int r7 = (int) r7
            if (r6 != r7) goto L56
            goto L70
        L6f:
            r2 = r5
        L70:
            p8.h0 r2 = (p8.h0) r2
            if (r2 == 0) goto L98
            f6.e r13 = r9.f58555b
            java.util.List<p8.k0> r6 = r2.f79849d
            java.lang.Object r6 = a00.r0.G2(r6)
            p8.k0 r6 = (p8.k0) r6
            int r6 = r6.f79966a
            r0.f58557b = r12
            r0.f58558c = r2
            java.lang.Object r2 = l00.k.a(r2)
            r0.f58559d = r2
            r0.f58556a = r10
            r2 = 0
            r0.f58560e = r2
            r0.f58563h = r4
            java.lang.Object r13 = r13.a(r10, r6, r0)
            if (r13 != r1) goto L98
            goto Lae
        L98:
            com.baicizhan.app.biz.game.repo.gameround.e r13 = r9.f58554a
            java.lang.Object r2 = l00.k.a(r12)
            r0.f58557b = r2
            r0.f58558c = r5
            r0.f58559d = r5
            r0.f58556a = r10
            r0.f58563h = r3
            java.lang.Object r10 = r13.d(r10, r12, r0)
            if (r10 != r1) goto Laf
        Lae:
            return r1
        Laf:
            yz.g2 r10 = yz.g2.f100423a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.b.a(long, java.util.List, j00.c):java.lang.Object");
    }
}
