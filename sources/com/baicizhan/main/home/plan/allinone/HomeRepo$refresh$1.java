package com.baicizhan.main.home.plan.allinone;

import com.baicizhan.main.home.plan.allinone.c1;
import com.baicizhan.online.thrift.basic.LogicException;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "com.baicizhan.main.home.plan.allinone.HomeRepo$refresh$1", f = "IHomeRepo.kt", i = {1, 1}, l = {61, 63}, m = "invokeSuspend", n = {"it", "$i$a$-also-HomeRepo$refresh$1$3"}, s = {"L$1", "I$0"}, v = 1)
@kotlin.jvm.internal.u0({"SMAP\nIHomeRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IHomeRepo.kt\ncom/baicizhan/main/home/plan/allinone/HomeRepo$refresh$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,93:1\n49#2:94\n51#2:98\n46#3:95\n51#3:97\n105#4:96\n*S KotlinDebug\n*F\n+ 1 IHomeRepo.kt\ncom/baicizhan/main/home/plan/allinone/HomeRepo$refresh$1\n*L\n45#1:94\n45#1:98\n45#1:95\n45#1:97\n45#1:96\n*E\n"})
/* loaded from: classes4.dex */
public final class HomeRepo$refresh$1 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super c1>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public Object f22063a;

    /* renamed from: b, reason: collision with root package name */
    public Object f22064b;

    /* renamed from: c, reason: collision with root package name */
    public int f22065c;

    /* renamed from: d, reason: collision with root package name */
    public int f22066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ HomeRepo f22067e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.allinone.HomeRepo$refresh$1$2", f = "IHomeRepo.kt", i = {0, 0, 0, 0}, l = {58}, m = "invokeSuspend", n = {"$this$catch", "e", "it", "$i$a$-also-HomeRepo$refresh$1$2$1"}, s = {"L$0", "L$1", "L$3", "I$0"}, v = 1)
    public static final class a extends SuspendLambda implements x00.q<kotlinx.coroutines.flow.j<? super c1>, Throwable, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f22068a;

        /* renamed from: b, reason: collision with root package name */
        public Object f22069b;

        /* renamed from: c, reason: collision with root package name */
        public int f22070c;

        /* renamed from: d, reason: collision with root package name */
        public int f22071d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f22072e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f22073f;

        public a(j00.c<? super a> cVar) {
            super(3, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f22072e;
            Throwable th2 = (Throwable) this.f22073f;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f22071d;
            if (i11 == 0) {
                kotlin.e.n(obj);
                String str = th2 instanceof LogicException ? ((LogicException) th2).message : "网络错误，请点击重试";
                kotlin.jvm.internal.g0.m(str);
                c1.b bVar = new c1.b(str);
                this.f22072e = l00.k.a(jVar);
                this.f22073f = l00.k.a(th2);
                this.f22068a = str;
                this.f22069b = l00.k.a(str);
                this.f22070c = 0;
                this.f22071d = 1;
                if (jVar.emit(bVar, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return yz.g2.f100423a;
        }

        @Override // x00.q
        public final Object invoke(kotlinx.coroutines.flow.j<? super c1> jVar, Throwable th2, j00.c<? super yz.g2> cVar) {
            a aVar = new a(cVar);
            aVar.f22072e = jVar;
            aVar.f22073f = th2;
            return aVar.invokeSuspend(yz.g2.f100423a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeRepo$refresh$1(HomeRepo homeRepo, j00.c<? super HomeRepo$refresh$1> cVar) {
        super(2, cVar);
        this.f22067e = homeRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
        return new HomeRepo$refresh$1(this.f22067e, cVar);
    }

    @Override // x00.p
    public final Object invoke(c40.r0 r0Var, j00.c<? super c1> cVar) {
        return ((HomeRepo$refresh$1) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r6 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r5.f22066d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            java.lang.Object r0 = r5.f22064b
            com.baicizhan.main.home.plan.allinone.c1 r0 = (com.baicizhan.main.home.plan.allinone.c1) r0
            java.lang.Object r0 = r5.f22063a
            kotlin.e.n(r6)
            return r0
        L18:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L20:
            kotlin.e.n(r6)
            goto L43
        L24:
            kotlin.e.n(r6)
            kotlinx.coroutines.flow.i r6 = com.baicizhan.main.home.plan.allinone.StudyServiceFXKt.b()
            com.baicizhan.main.home.plan.allinone.HomeRepo$refresh$1$invokeSuspend$$inlined$map$1 r1 = new com.baicizhan.main.home.plan.allinone.HomeRepo$refresh$1$invokeSuspend$$inlined$map$1
            r1.<init>()
            com.baicizhan.main.home.plan.allinone.HomeRepo$refresh$1$a r6 = new com.baicizhan.main.home.plan.allinone.HomeRepo$refresh$1$a
            r4 = 0
            r6.<init>(r4)
            kotlinx.coroutines.flow.i r6 = kotlinx.coroutines.flow.k.v(r1, r6)
            r5.f22066d = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.k.w0(r6, r5)
            if (r6 != r0) goto L43
            goto L5f
        L43:
            com.baicizhan.main.home.plan.allinone.HomeRepo r1 = r5.f22067e
            r3 = r6
            com.baicizhan.main.home.plan.allinone.c1 r3 = (com.baicizhan.main.home.plan.allinone.c1) r3
            kotlinx.coroutines.flow.y r1 = com.baicizhan.main.home.plan.allinone.HomeRepo.d(r1)
            r5.f22063a = r6
            java.lang.Object r4 = l00.k.a(r3)
            r5.f22064b = r4
            r4 = 0
            r5.f22065c = r4
            r5.f22066d = r2
            java.lang.Object r1 = r1.emit(r3, r5)
            if (r1 != r0) goto L60
        L5f:
            return r0
        L60:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.allinone.HomeRepo$refresh$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
