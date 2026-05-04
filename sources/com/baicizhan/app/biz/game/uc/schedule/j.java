package com.baicizhan.app.biz.game.uc.schedule;

import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import l7.p;
import m80.l;
import oa0.r;
import y7.d;
import yz.g2;
import z8.b2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nSelectNewScheduleUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectNewScheduleUC.kt\ncom/baicizhan/app/biz/game/uc/schedule/SelectNewScheduleUC\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,28:1\n6#2:29\n64#3,2:30\n66#3:33\n67#3,2:39\n6#4:32\n124#5,4:34\n142#6:38\n*S KotlinDebug\n*F\n+ 1 SelectNewScheduleUC.kt\ncom/baicizhan/app/biz/game/uc/schedule/SelectNewScheduleUC\n*L\n17#1:29\n17#1:30,2\n17#1:33\n17#1:39,2\n17#1:32\n17#1:34,4\n17#1:38\n*E\n"})
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p f15115a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.schedule.a f15116b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.schedule.SelectNewScheduleUC", f = "SelectNewScheduleUC.kt", i = {0, 0, 1, 1}, l = {22, 23}, m = "invoke", n = {"targetBookId", "group", "targetBookId", "group"}, s = {"J$0", "I$0", "J$0", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f15117a;

        /* renamed from: b, reason: collision with root package name */
        public int f15118b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15119c;

        /* renamed from: e, reason: collision with root package name */
        public int f15121e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15119c = obj;
            this.f15121e |= Integer.MIN_VALUE;
            return j.this.b(0L, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class b implements x00.l<w7.d<b2>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f15122a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f15123b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f15124c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f15125a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f15126b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f15127c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f15125a = eVar;
                this.f15126b = cVar;
                this.f15127c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f15125a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f15125a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f15126b.b(this.f15127c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public b(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f15122a = dVar;
            this.f15123b = eVar;
            this.f15124c = cVar;
        }

        public final void a(w7.d<b2> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f15123b, this.f15124c, this.f15122a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f15122a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<b2> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public j(@m80.k p thriftService, @m80.k com.baicizhan.app.biz.game.uc.schedule.a changeScheduleUC) {
        g0.p(thriftService, "thriftService");
        g0.p(changeScheduleUC, "changeScheduleUC");
        this.f15115a = thriftService;
        this.f15116b = changeScheduleUC;
    }

    public final b2 a() {
        return (b2) w7.f.b(new b(o0.d(b2.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0095, code lost:
    
        if (r4.h(r1, r3, r9) != r10) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r19, int r21, @m80.k j00.c<? super yz.g2> r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r8 = r21
            r3 = r22
            boolean r4 = r3 instanceof com.baicizhan.app.biz.game.uc.schedule.j.a
            if (r4 == 0) goto L1c
            r4 = r3
            com.baicizhan.app.biz.game.uc.schedule.j$a r4 = (com.baicizhan.app.biz.game.uc.schedule.j.a) r4
            int r5 = r4.f15121e
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1c
            int r5 = r5 - r6
            r4.f15121e = r5
        L1a:
            r9 = r4
            goto L22
        L1c:
            com.baicizhan.app.biz.game.uc.schedule.j$a r4 = new com.baicizhan.app.biz.game.uc.schedule.j$a
            r4.<init>(r3)
            goto L1a
        L22:
            java.lang.Object r3 = r9.f15119c
            java.lang.Object r10 = kotlin.coroutines.intrinsics.b.l()
            int r4 = r9.f15121e
            r11 = 2
            r5 = 1
            if (r4 == 0) goto L48
            if (r4 == r5) goto L3e
            if (r4 != r11) goto L36
            kotlin.e.n(r3)
            goto L98
        L36:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3e:
            int r1 = r9.f15118b
            long r4 = r9.f15117a
            kotlin.e.n(r3)
            r3 = r1
            r1 = r4
            goto L89
        L48:
            kotlin.e.n(r3)
            z6.b r12 = z6.b.f101032b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "change schedule bookId:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = ", group:"
            r3.append(r4)
            r3.append(r8)
            java.lang.String r14 = r3.toString()
            r16 = 4
            r17 = 0
            java.lang.String r13 = "SelectNewScheduleUC"
            r15 = 0
            z6.b.j(r12, r13, r14, r15, r16, r17)
            z8.b2 r3 = r0.a()
            int r4 = (int) r1
            r9.f15117a = r1
            r9.f15118b = r8
            r9.f15121e = r5
            r5 = 10
            r6 = 10
            r7 = -1
            java.lang.Object r3 = r3.Z(r4, r5, r6, r7, r8, r9)
            if (r3 != r10) goto L87
            goto L97
        L87:
            r3 = r21
        L89:
            com.baicizhan.app.biz.game.uc.schedule.a r4 = r0.f15116b
            r9.f15117a = r1
            r9.f15118b = r3
            r9.f15121e = r11
            java.lang.Object r1 = r4.h(r1, r3, r9)
            if (r1 != r10) goto L98
        L97:
            return r10
        L98:
            yz.g2 r1 = yz.g2.f100423a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.schedule.j.b(long, int, j00.c):java.lang.Object");
    }
}
