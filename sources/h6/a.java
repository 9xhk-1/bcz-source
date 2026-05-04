package h6;

import com.baicizhan.app.biz.game.repo.gameround.e;
import j00.c;
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
    public final e f58547a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f6.e f58548b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.baicizhan.app.biz.game.uc.gameround.AddGameRoundUC", f = "AddGameRoundUC.kt", i = {0, 0, 1, 1}, l = {17, 19}, m = "invoke", n = {"roundInfo", "bookId", "roundInfo", "bookId"}, s = {"L$0", "J$0", "L$0", "J$0"}, v = 1)
    /* renamed from: h6.a$a, reason: collision with other inner class name */
    public static final class C0660a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f58549a;

        /* renamed from: b, reason: collision with root package name */
        public Object f58550b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f58551c;

        /* renamed from: e, reason: collision with root package name */
        public int f58553e;

        public C0660a(c<? super C0660a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f58551c = obj;
            this.f58553e |= Integer.MIN_VALUE;
            return a.this.a(0L, null, this);
        }
    }

    public a(@k e gameRoundRepo, @k f6.e updateStudyIdxUC) {
        g0.p(gameRoundRepo, "gameRoundRepo");
        g0.p(updateStudyIdxUC, "updateStudyIdxUC");
        this.f58547a = gameRoundRepo;
        this.f58548b = updateStudyIdxUC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
    
        if (r11.g(r8, r10, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r11.a(r8, r2, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r8, @m80.k p8.h0 r10, @m80.k j00.c<? super yz.g2> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof h6.a.C0660a
            if (r0 == 0) goto L13
            r0 = r11
            h6.a$a r0 = (h6.a.C0660a) r0
            int r1 = r0.f58553e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58553e = r1
            goto L18
        L13:
            h6.a$a r0 = new h6.a$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f58551c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f58553e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r8 = r0.f58550b
            p8.h0 r8 = (p8.h0) r8
            kotlin.e.n(r11)
            goto L7c
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            long r8 = r0.f58549a
            java.lang.Object r10 = r0.f58550b
            p8.h0 r10 = (p8.h0) r10
            kotlin.e.n(r11)
            goto L69
        L42:
            kotlin.e.n(r11)
            int r11 = r10.f79850e
            com.baicizhan.app.biz.game.model.RoundType r2 = com.baicizhan.app.biz.game.model.RoundType.LEARNING
            long r5 = r2.getValue()
            int r2 = (int) r5
            if (r11 != r2) goto L69
            f6.e r11 = r7.f58548b
            java.util.List<p8.k0> r2 = r10.f79849d
            java.lang.Object r2 = a00.r0.G2(r2)
            p8.k0 r2 = (p8.k0) r2
            int r2 = r2.f79966a
            r0.f58550b = r10
            r0.f58549a = r8
            r0.f58553e = r4
            java.lang.Object r11 = r11.a(r8, r2, r0)
            if (r11 != r1) goto L69
            goto L7b
        L69:
            com.baicizhan.app.biz.game.repo.gameround.e r11 = r7.f58547a
            java.lang.Object r2 = l00.k.a(r10)
            r0.f58550b = r2
            r0.f58549a = r8
            r0.f58553e = r3
            java.lang.Object r8 = r11.g(r8, r10, r0)
            if (r8 != r1) goto L7c
        L7b:
            return r1
        L7c:
            yz.g2 r8 = yz.g2.f100423a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.a.a(long, p8.h0, j00.c):java.lang.Object");
    }
}
