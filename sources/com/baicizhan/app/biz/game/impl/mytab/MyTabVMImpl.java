package com.baicizhan.app.biz.game.impl.mytab;

import c4.o;
import c40.l3;
import c40.n0;
import c40.r0;
import c40.s0;
import h5.z;
import k3.w1;
import k3.x1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.m0;
import l00.d;
import l3.m;
import m80.k;
import m80.l;
import oa0.c;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@c(binds = {x1.class})
@u0({"SMAP\nMyTabVMImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyTabVMImpl.kt\ncom/baicizhan/app/biz/game/impl/mytab/MyTabVMImpl\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 TimeMeasurer.kt\ncom/baicizhan/app/biz/base/TimeMeasurerKt\n+ 7 BizCatch.kt\ncom/baicizhan/app/biz/base/BizCatchKt\n*L\n1#1,58:1\n47#2,4:59\n49#3:63\n51#3:67\n46#4:64\n51#4:66\n105#5:65\n12#6,3:68\n15#6,10:83\n12#7,12:71\n*S KotlinDebug\n*F\n+ 1 MyTabVMImpl.kt\ncom/baicizhan/app/biz/game/impl/mytab/MyTabVMImpl\n*L\n26#1:59,4\n31#1:63\n31#1:67\n31#1:64\n31#1:66\n31#1:65\n-1#1:68,3\n-1#1:83,10\n-1#1:71,12\n*E\n"})
/* loaded from: classes3.dex */
public final class MyTabVMImpl implements x1 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final t5.a f14152b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final r0 f14153c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final m0<w1> f14154d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.baicizhan.app.biz.game.impl.mytab.MyTabVMImpl", f = "MyTabVMImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {49}, m = "enter", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-MyTabVMImpl$enter$2", "$i$f$bizCatch", "$i$a$-bizCatch-MyTabVMImpl$enter$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14157a;

        /* renamed from: b, reason: collision with root package name */
        public int f14158b;

        /* renamed from: c, reason: collision with root package name */
        public int f14159c;

        /* renamed from: d, reason: collision with root package name */
        public int f14160d;

        /* renamed from: e, reason: collision with root package name */
        public int f14161e;

        /* renamed from: f, reason: collision with root package name */
        public long f14162f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f14163g;

        /* renamed from: i, reason: collision with root package name */
        public int f14165i;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f14163g = obj;
            this.f14165i |= Integer.MIN_VALUE;
            return MyTabVMImpl.this.h2(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 MyTabVMImpl.kt\ncom/baicizhan/app/biz/game/impl/mytab/MyTabVMImpl\n*L\n1#1,49:1\n27#2,2:50\n*E\n"})
    public static final class b extends kotlin.coroutines.a implements n0 {
        public b(n0.b bVar) {
            super(bVar);
        }

        @Override // c40.n0
        public void handleException(kotlin.coroutines.d dVar, Throwable th2) {
            z6.b.f101032b.e(com.baicizhan.app.biz.game.impl.mytab.a.f14166a, "Uncaught exception in viewModelScope", th2);
        }
    }

    public MyTabVMImpl(@k t5.a notificationRepo) {
        g0.p(notificationRepo, "notificationRepo");
        this.f14152b = notificationRepo;
        r0 a11 = s0.a(o.c().plus(l3.c(null, 1, null)).plus(new b(n0.f7891d0)));
        this.f14153c = a11;
        final i<z> d11 = notificationRepo.d();
        this.f14154d = kotlinx.coroutines.flow.k.Q1(new i<w1>() { // from class: com.baicizhan.app.biz.game.impl.mytab.MyTabVMImpl$special$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 MyTabVMImpl.kt\ncom/baicizhan/app/biz/game/impl/mytab/MyTabVMImpl\n*L\n1#1,49:1\n50#2:50\n32#3,4:51\n*E\n"})
            /* renamed from: com.baicizhan.app.biz.game.impl.mytab.MyTabVMImpl$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f14156a;

                @d(c = "com.baicizhan.app.biz.game.impl.mytab.MyTabVMImpl$special$$inlined$map$1$2", f = "MyTabVMImpl.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.app.biz.game.impl.mytab.MyTabVMImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(j00.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar) {
                    this.f14156a = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, j00.c r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.baicizhan.app.biz.game.impl.mytab.MyTabVMImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.baicizhan.app.biz.game.impl.mytab.MyTabVMImpl$special$$inlined$map$1$2$1 r0 = (com.baicizhan.app.biz.game.impl.mytab.MyTabVMImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.app.biz.game.impl.mytab.MyTabVMImpl$special$$inlined$map$1$2$1 r0 = new com.baicizhan.app.biz.game.impl.mytab.MyTabVMImpl$special$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r7 = r0.L$3
                        kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                        java.lang.Object r7 = r0.L$1
                        com.baicizhan.app.biz.game.impl.mytab.MyTabVMImpl$special$$inlined$map$1$2$1 r7 = (com.baicizhan.app.biz.game.impl.mytab.MyTabVMImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r7
                        kotlin.e.n(r8)
                        goto L72
                    L31:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L39:
                        kotlin.e.n(r8)
                        kotlinx.coroutines.flow.j r8 = r6.f14156a
                        r2 = r7
                        h5.z r2 = (h5.z) r2
                        k3.w1 r4 = new k3.w1
                        java.lang.String r5 = r2.j()
                        int r2 = r2.i()
                        r4.<init>(r5, r2)
                        java.lang.Object r2 = l00.k.a(r7)
                        r0.L$0 = r2
                        java.lang.Object r2 = l00.k.a(r0)
                        r0.L$1 = r2
                        java.lang.Object r7 = l00.k.a(r7)
                        r0.L$2 = r7
                        java.lang.Object r7 = l00.k.a(r8)
                        r0.L$3 = r7
                        r7 = 0
                        r0.I$0 = r7
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r4, r0)
                        if (r7 != r1) goto L72
                        return r1
                    L72:
                        yz.g2 r7 = yz.g2.f100423a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.mytab.MyTabVMImpl$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super w1> jVar, j00.c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar), cVar);
                return collect == b.l() ? collect : g2.f100423a;
            }
        }, a11, h0.f68148a.c(), new w1("", 0));
    }

    @Override // k3.x1
    @k
    public m0<w1> getState() {
        return this.f14154d;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7 A[Catch: all -> 0x00cf, TryCatch #2 {all -> 0x00cf, blocks: (B:22:0x00b0, B:24:0x00b7, B:26:0x00bb, B:28:0x00bf, B:30:0x00c3, B:32:0x00c7, B:43:0x012e, B:34:0x00d2, B:36:0x00dd, B:38:0x00f1, B:40:0x0105, B:42:0x011a), top: B:21:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011a A[Catch: all -> 0x00cf, TryCatch #2 {all -> 0x00cf, blocks: (B:22:0x00b0, B:24:0x00b7, B:26:0x00bb, B:28:0x00bf, B:30:0x00c3, B:32:0x00c7, B:43:0x012e, B:34:0x00d2, B:36:0x00dd, B:38:0x00f1, B:40:0x0105, B:42:0x011a), top: B:21:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.x1
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h2(@m80.k j00.c<? super yz.g2> r14) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.mytab.MyTabVMImpl.h2(j00.c):java.lang.Object");
    }

    @Override // k3.x1
    @k
    public m o(@k x00.l<? super w1, g2> onState) {
        g0.p(onState, "onState");
        return u4.c.a(onState, getState(), com.baicizhan.app.biz.game.impl.mytab.a.f14166a);
    }
}
