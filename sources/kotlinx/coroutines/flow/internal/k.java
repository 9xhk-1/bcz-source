package kotlinx.coroutines.flow.internal;

import a00.a1;
import c40.a0;
import c40.p2;
import c40.r0;
import c40.s0;
import e40.g0;
import e40.i0;
import e40.k0;
import e40.l0;
import h40.g1;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import xo.n;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCombine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,140:1\n105#2:141\n*S KotlinDebug\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n*L\n83#1:141\n*E\n"})
/* loaded from: classes8.dex */
public final class k {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {51, 73, 76}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f68210a;

        /* renamed from: b, reason: collision with root package name */
        public Object f68211b;

        /* renamed from: c, reason: collision with root package name */
        public int f68212c;

        /* renamed from: d, reason: collision with root package name */
        public int f68213d;

        /* renamed from: e, reason: collision with root package name */
        public int f68214e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f68215f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f68216g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ x00.a<T[]> f68217h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ x00.q<kotlinx.coroutines.flow.j<? super R>, T[], j00.c<? super g2>, Object> f68218i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.j<R> f68219j;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.internal.k$a$a, reason: collision with other inner class name */
        public static final class C0811a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f68220a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f68221b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f68222c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ AtomicInteger f68223d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ e40.o<a1<Object>> f68224e;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: kotlinx.coroutines.flow.internal.k$a$a$a, reason: collision with other inner class name */
            public static final class C0812a<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ e40.o<a1<Object>> f68225a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f68226b;

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                @l00.d(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", i = {}, l = {29, 30}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.internal.k$a$a$a$a, reason: collision with other inner class name */
                public static final class C0813a extends ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f68227a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ C0812a<T> f68228b;

                    /* renamed from: c, reason: collision with root package name */
                    public int f68229c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0813a(C0812a<? super T> c0812a, j00.c<? super C0813a> cVar) {
                        super(cVar);
                        this.f68228b = c0812a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f68227a = obj;
                        this.f68229c |= Integer.MIN_VALUE;
                        return this.f68228b.emit(null, this);
                    }
                }

                public C0812a(e40.o<a1<Object>> oVar, int i11) {
                    this.f68225a = oVar;
                    this.f68226b = i11;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
                
                    if (c40.b4.a(r0) != r1) goto L22;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
                
                    return r1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
                
                    if (r8.b(r2, r0) == r1) goto L21;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r7, j00.c<? super yz.g2> r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof kotlinx.coroutines.flow.internal.k.a.C0811a.C0812a.C0813a
                        if (r0 == 0) goto L13
                        r0 = r8
                        kotlinx.coroutines.flow.internal.k$a$a$a$a r0 = (kotlinx.coroutines.flow.internal.k.a.C0811a.C0812a.C0813a) r0
                        int r1 = r0.f68229c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f68229c = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.internal.k$a$a$a$a r0 = new kotlinx.coroutines.flow.internal.k$a$a$a$a
                        r0.<init>(r6, r8)
                    L18:
                        java.lang.Object r8 = r0.f68227a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.f68229c
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        kotlin.e.n(r8)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        kotlin.e.n(r8)
                        goto L4d
                    L38:
                        kotlin.e.n(r8)
                        e40.o<a00.a1<java.lang.Object>> r8 = r6.f68225a
                        a00.a1 r2 = new a00.a1
                        int r5 = r6.f68226b
                        r2.<init>(r5, r7)
                        r0.f68229c = r4
                        java.lang.Object r7 = r8.b(r2, r0)
                        if (r7 != r1) goto L4d
                        goto L55
                    L4d:
                        r0.f68229c = r3
                        java.lang.Object r7 = c40.b4.a(r0)
                        if (r7 != r1) goto L56
                    L55:
                        return r1
                    L56:
                        yz.g2 r7 = yz.g2.f100423a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.k.a.C0811a.C0812a.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0811a(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, int i11, AtomicInteger atomicInteger, e40.o<a1<Object>> oVar, j00.c<? super C0811a> cVar) {
                super(2, cVar);
                this.f68221b = iVarArr;
                this.f68222c = i11;
                this.f68223d = atomicInteger;
                this.f68224e = oVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new C0811a(this.f68221b, this.f68222c, this.f68223d, this.f68224e, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((C0811a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                AtomicInteger atomicInteger;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f68220a;
                try {
                    if (i11 == 0) {
                        kotlin.e.n(obj);
                        kotlinx.coroutines.flow.i[] iVarArr = this.f68221b;
                        int i12 = this.f68222c;
                        kotlinx.coroutines.flow.i iVar = iVarArr[i12];
                        C0812a c0812a = new C0812a(this.f68224e, i12);
                        this.f68220a = 1;
                        if (iVar.collect(c0812a, this) == l11) {
                            return l11;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.e.n(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        l0.a.a(this.f68224e, null, 1, null);
                    }
                    return g2.f100423a;
                } finally {
                    if (this.f68223d.decrementAndGet() == 0) {
                        l0.a.a(this.f68224e, null, 1, null);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, x00.a<T[]> aVar, x00.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super j00.c<? super g2>, ? extends Object> qVar, kotlinx.coroutines.flow.j<? super R> jVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f68216g = iVarArr;
            this.f68217h = aVar;
            this.f68218i = qVar;
            this.f68219j = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f68216g, this.f68217h, this.f68218i, this.f68219j, cVar);
            aVar.f68215f = obj;
            return aVar;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0106, code lost:
        
            if (r10.invoke(r11, r9, r21) == r1) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0126, code lost:
        
            if (r11.invoke(r12, r10, r21) == r1) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0129, code lost:
        
            if (r6 != 0) goto L44;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00c1 A[LOOP:0: B:18:0x00c1->B:33:?, LOOP_START, PHI: r6 r10
          0x00c1: PHI (r6v4 int) = (r6v3 int), (r6v5 int) binds: [B:15:0x00bc, B:33:?] A[DONT_GENERATE, DONT_INLINE]
          0x00c1: PHI (r10v5 a00.a1) = (r10v4 a00.a1), (r10v12 a00.a1) binds: [B:15:0x00bc, B:33:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0106 -> B:10:0x0129). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0126 -> B:10:0x0129). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 304
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n*L\n1#1,108:1\n84#2:109\n139#2:110\n*E\n"})
    public static final class b<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.i f68230a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.i f68231b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.q f68232c;

        public b(kotlinx.coroutines.flow.i iVar, kotlinx.coroutines.flow.i iVar2, x00.q qVar) {
            this.f68230a = iVar;
            this.f68231b = iVar2;
            this.f68232c = qVar;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j<? super R> jVar, j00.c<? super g2> cVar) {
            Object g11 = s0.g(new c(this.f68230a, this.f68231b, jVar, this.f68232c, null), cVar);
            return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0, 0}, l = {123}, m = "invokeSuspend", n = {n.r.f98264f, "collectJob"}, s = {"L$0", "L$1"})
    public static final class c extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f68233a;

        /* renamed from: b, reason: collision with root package name */
        public int f68234b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f68235c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.i<T2> f68236d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.i<T1> f68237e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.j<R> f68238f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ x00.q<T1, T2, j00.c<? super R>, Object> f68239g;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a implements x00.l<Throwable, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a0 f68240a;

            public a(a0 a0Var) {
                this.f68240a = a0Var;
            }

            public final void a(Throwable th2) {
                if (this.f68240a.isActive()) {
                    this.f68240a.cancel(new AbortFlowException(this.f68240a));
                }
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
                a(th2);
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements x00.p<g2, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f68241a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.i<T1> f68242b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ kotlin.coroutines.d f68243c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Object f68244d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ k0<Object> f68245e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.j<R> f68246f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ x00.q<T1, T2, j00.c<? super R>, Object> f68247g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ a0 f68248h;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class a<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlin.coroutines.d f68249a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Object f68250b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ k0<Object> f68251c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j<R> f68252d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ x00.q<T1, T2, j00.c<? super R>, Object> f68253e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ a0 f68254f;

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                @l00.d(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {126, 129, 129}, m = "invokeSuspend", n = {}, s = {})
                @u0({"SMAP\nCombine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,140:1\n994#2:141\n14#3:142\n*S KotlinDebug\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$1\n*L\n126#1:141\n129#1:142\n*E\n"})
                /* renamed from: kotlinx.coroutines.flow.internal.k$c$b$a$a, reason: collision with other inner class name */
                public static final class C0814a extends SuspendLambda implements x00.p<g2, j00.c<? super g2>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    public Object f68255a;

                    /* renamed from: b, reason: collision with root package name */
                    public int f68256b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ k0<Object> f68257c;

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ kotlinx.coroutines.flow.j<R> f68258d;

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ x00.q<T1, T2, j00.c<? super R>, Object> f68259e;

                    /* renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ T1 f68260f;

                    /* renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ a0 f68261g;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0814a(k0<? extends Object> k0Var, kotlinx.coroutines.flow.j<? super R> jVar, x00.q<? super T1, ? super T2, ? super j00.c<? super R>, ? extends Object> qVar, T1 t12, a0 a0Var, j00.c<? super C0814a> cVar) {
                        super(2, cVar);
                        this.f68257c = k0Var;
                        this.f68258d = jVar;
                        this.f68259e = qVar;
                        this.f68260f = t12;
                        this.f68261g = a0Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                        return new C0814a(this.f68257c, this.f68258d, this.f68259e, this.f68260f, this.f68261g, cVar);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
                    
                        if (r1.emit(r9, r8) == r0) goto L29;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
                    
                        return r0;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
                    
                        if (r9 == r0) goto L29;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:30:0x003b, code lost:
                    
                        if (r9 == r0) goto L29;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v3, types: [kotlinx.coroutines.flow.j] */
                    /* JADX WARN: Type inference failed for: r1v6 */
                    /* JADX WARN: Type inference failed for: r1v7 */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                        /*
                            r8 = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                            int r1 = r8.f68256b
                            r2 = 0
                            r3 = 3
                            r4 = 2
                            r5 = 1
                            if (r1 == 0) goto L30
                            if (r1 == r5) goto L26
                            if (r1 == r4) goto L1e
                            if (r1 != r3) goto L16
                            kotlin.e.n(r9)
                            goto L71
                        L16:
                            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r9.<init>(r0)
                            throw r9
                        L1e:
                            java.lang.Object r1 = r8.f68255a
                            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                            kotlin.e.n(r9)
                            goto L66
                        L26:
                            kotlin.e.n(r9)
                            e40.s r9 = (e40.s) r9
                            java.lang.Object r9 = r9.o()
                            goto L3e
                        L30:
                            kotlin.e.n(r9)
                            e40.k0<java.lang.Object> r9 = r8.f68257c
                            r8.f68256b = r5
                            java.lang.Object r9 = r9.N(r8)
                            if (r9 != r0) goto L3e
                            goto L70
                        L3e:
                            c40.a0 r1 = r8.f68261g
                            boolean r5 = r9 instanceof e40.s.c
                            if (r5 == 0) goto L50
                            java.lang.Throwable r9 = e40.s.f(r9)
                            if (r9 != 0) goto L4f
                            kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
                            r9.<init>(r1)
                        L4f:
                            throw r9
                        L50:
                            kotlinx.coroutines.flow.j<R> r1 = r8.f68258d
                            x00.q<T1, T2, j00.c<? super R>, java.lang.Object> r5 = r8.f68259e
                            T1 r6 = r8.f68260f
                            h40.x0 r7 = kotlinx.coroutines.flow.internal.s.f68282a
                            if (r9 != r7) goto L5b
                            r9 = r2
                        L5b:
                            r8.f68255a = r1
                            r8.f68256b = r4
                            java.lang.Object r9 = r5.invoke(r6, r9, r8)
                            if (r9 != r0) goto L66
                            goto L70
                        L66:
                            r8.f68255a = r2
                            r8.f68256b = r3
                            java.lang.Object r9 = r1.emit(r9, r8)
                            if (r9 != r0) goto L71
                        L70:
                            return r0
                        L71:
                            yz.g2 r9 = yz.g2.f100423a
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.k.c.b.a.C0814a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    @Override // x00.p
                    public final Object invoke(g2 g2Var, j00.c<? super g2> cVar) {
                        return ((C0814a) create(g2Var, cVar)).invokeSuspend(g2.f100423a);
                    }
                }

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                @l00.d(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1", f = "Combine.kt", i = {}, l = {125}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.internal.k$c$b$a$b, reason: collision with other inner class name */
                public static final class C0815b extends ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f68262a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ a<T> f68263b;

                    /* renamed from: c, reason: collision with root package name */
                    public int f68264c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0815b(a<? super T> aVar, j00.c<? super C0815b> cVar) {
                        super(cVar);
                        this.f68263b = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f68262a = obj;
                        this.f68264c |= Integer.MIN_VALUE;
                        return this.f68263b.emit(null, this);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public a(kotlin.coroutines.d dVar, Object obj, k0<? extends Object> k0Var, kotlinx.coroutines.flow.j<? super R> jVar, x00.q<? super T1, ? super T2, ? super j00.c<? super R>, ? extends Object> qVar, a0 a0Var) {
                    this.f68249a = dVar;
                    this.f68250b = obj;
                    this.f68251c = k0Var;
                    this.f68252d = jVar;
                    this.f68253e = qVar;
                    this.f68254f = a0Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T1 r13, j00.c<? super yz.g2> r14) {
                    /*
                        r12 = this;
                        boolean r0 = r14 instanceof kotlinx.coroutines.flow.internal.k.c.b.a.C0815b
                        if (r0 == 0) goto L13
                        r0 = r14
                        kotlinx.coroutines.flow.internal.k$c$b$a$b r0 = (kotlinx.coroutines.flow.internal.k.c.b.a.C0815b) r0
                        int r1 = r0.f68264c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f68264c = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.internal.k$c$b$a$b r0 = new kotlinx.coroutines.flow.internal.k$c$b$a$b
                        r0.<init>(r12, r14)
                    L18:
                        java.lang.Object r14 = r0.f68262a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.f68264c
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.e.n(r14)
                        goto L52
                    L29:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r14)
                        throw r13
                    L31:
                        kotlin.e.n(r14)
                        kotlin.coroutines.d r14 = r12.f68249a
                        yz.g2 r2 = yz.g2.f100423a
                        java.lang.Object r4 = r12.f68250b
                        kotlinx.coroutines.flow.internal.k$c$b$a$a r5 = new kotlinx.coroutines.flow.internal.k$c$b$a$a
                        e40.k0<java.lang.Object> r6 = r12.f68251c
                        kotlinx.coroutines.flow.j<R> r7 = r12.f68252d
                        x00.q<T1, T2, j00.c<? super R>, java.lang.Object> r8 = r12.f68253e
                        c40.a0 r10 = r12.f68254f
                        r11 = 0
                        r9 = r13
                        r5.<init>(r6, r7, r8, r9, r10, r11)
                        r0.f68264c = r3
                        java.lang.Object r13 = kotlinx.coroutines.flow.internal.e.c(r14, r2, r4, r5, r0)
                        if (r13 != r1) goto L52
                        return r1
                    L52:
                        yz.g2 r13 = yz.g2.f100423a
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.k.c.b.a.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(kotlinx.coroutines.flow.i<? extends T1> iVar, kotlin.coroutines.d dVar, Object obj, k0<? extends Object> k0Var, kotlinx.coroutines.flow.j<? super R> jVar, x00.q<? super T1, ? super T2, ? super j00.c<? super R>, ? extends Object> qVar, a0 a0Var, j00.c<? super b> cVar) {
                super(2, cVar);
                this.f68242b = iVar;
                this.f68243c = dVar;
                this.f68244d = obj;
                this.f68245e = k0Var;
                this.f68246f = jVar;
                this.f68247g = qVar;
                this.f68248h = a0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new b(this.f68242b, this.f68243c, this.f68244d, this.f68245e, this.f68246f, this.f68247g, this.f68248h, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f68241a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    kotlinx.coroutines.flow.i<T1> iVar = this.f68242b;
                    a aVar = new a(this.f68243c, this.f68244d, this.f68245e, this.f68246f, this.f68247g, this.f68248h);
                    this.f68241a = 1;
                    if (iVar.collect(aVar, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                return g2.f100423a;
            }

            @Override // x00.p
            public final Object invoke(g2 g2Var, j00.c<? super g2> cVar) {
                return ((b) create(g2Var, cVar)).invokeSuspend(g2.f100423a);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.internal.k$c$c, reason: collision with other inner class name */
        public static final class C0816c extends SuspendLambda implements x00.p<i0<? super Object>, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f68265a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f68266b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.i<T2> f68267c;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: kotlinx.coroutines.flow.internal.k$c$c$a */
            public static final class a<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ i0<Object> f68268a;

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                @l00.d(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1", f = "Combine.kt", i = {}, l = {87}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.internal.k$c$c$a$a, reason: collision with other inner class name */
                public static final class C0817a extends ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f68269a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ a<T> f68270b;

                    /* renamed from: c, reason: collision with root package name */
                    public int f68271c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0817a(a<? super T> aVar, j00.c<? super C0817a> cVar) {
                        super(cVar);
                        this.f68270b = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f68269a = obj;
                        this.f68271c |= Integer.MIN_VALUE;
                        return this.f68270b.emit(null, this);
                    }
                }

                public a(i0<Object> i0Var) {
                    this.f68268a = i0Var;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T2 r5, j00.c<? super yz.g2> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.internal.k.c.C0816c.a.C0817a
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.internal.k$c$c$a$a r0 = (kotlinx.coroutines.flow.internal.k.c.C0816c.a.C0817a) r0
                        int r1 = r0.f68271c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f68271c = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.internal.k$c$c$a$a r0 = new kotlinx.coroutines.flow.internal.k$c$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f68269a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.f68271c
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.e.n(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.e.n(r6)
                        e40.i0<java.lang.Object> r6 = r4.f68268a
                        e40.l0 r6 = r6.getChannel()
                        if (r5 != 0) goto L3e
                        h40.x0 r5 = kotlinx.coroutines.flow.internal.s.f68282a
                    L3e:
                        r0.f68271c = r3
                        java.lang.Object r5 = r6.b(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        yz.g2 r5 = yz.g2.f100423a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.k.c.C0816c.a.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0816c(kotlinx.coroutines.flow.i<? extends T2> iVar, j00.c<? super C0816c> cVar) {
                super(2, cVar);
                this.f68267c = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                C0816c c0816c = new C0816c(this.f68267c, cVar);
                c0816c.f68266b = obj;
                return c0816c;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(i0<Object> i0Var, j00.c<? super g2> cVar) {
                return ((C0816c) create(i0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f68265a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    i0 i0Var = (i0) this.f68266b;
                    kotlinx.coroutines.flow.i<T2> iVar = this.f68267c;
                    a aVar = new a(i0Var);
                    this.f68265a = 1;
                    if (iVar.collect(aVar, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                return g2.f100423a;
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Object invoke(i0<? super Object> i0Var, j00.c<? super g2> cVar) {
                return invoke2((i0<Object>) i0Var, cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(kotlinx.coroutines.flow.i<? extends T2> iVar, kotlinx.coroutines.flow.i<? extends T1> iVar2, kotlinx.coroutines.flow.j<? super R> jVar, x00.q<? super T1, ? super T2, ? super j00.c<? super R>, ? extends Object> qVar, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f68236d = iVar;
            this.f68237e = iVar2;
            this.f68238f = jVar;
            this.f68239g = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            c cVar2 = new c(this.f68236d, this.f68237e, this.f68238f, this.f68239g, cVar);
            cVar2.f68235c = obj;
            return cVar2;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a0 c11;
            k0 k0Var;
            a0 a0Var;
            k0 k0Var2;
            a0 a0Var2;
            g2 g2Var;
            b bVar;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f68234b;
            if (i11 == 0) {
                kotlin.e.n(obj);
                r0 r0Var = (r0) this.f68235c;
                k0 j11 = g0.j(r0Var, null, 0, new C0816c(this.f68236d, null), 3, null);
                c11 = p2.c(null, 1, null);
                kotlin.jvm.internal.g0.n(j11, "null cannot be cast to non-null type kotlinx.coroutines.channels.SendChannel<*>");
                ((l0) j11).u(new a(c11));
                try {
                    kotlin.coroutines.d coroutineContext = r0Var.getCoroutineContext();
                    Object g11 = g1.g(coroutineContext);
                    kotlin.coroutines.d plus = r0Var.getCoroutineContext().plus(c11);
                    try {
                        try {
                            g2Var = g2.f100423a;
                            try {
                                bVar = new b(this.f68237e, coroutineContext, g11, j11, this.f68238f, this.f68239g, c11, null);
                                k0Var = j11;
                                a0Var = c11;
                            } catch (AbortFlowException e11) {
                                e = e11;
                                k0Var = j11;
                                a0Var = c11;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            k0Var = j11;
                        }
                    } catch (AbortFlowException e12) {
                        e = e12;
                        a0Var = c11;
                        k0Var = j11;
                    }
                    try {
                        this.f68235c = k0Var;
                        this.f68233a = a0Var;
                        this.f68234b = 1;
                        if (e.d(plus, g2Var, null, bVar, this, 4, null) == l11) {
                            return l11;
                        }
                        k0Var2 = k0Var;
                    } catch (AbortFlowException e13) {
                        e = e13;
                        a0Var2 = a0Var;
                        k0Var2 = k0Var;
                        o.b(e, a0Var2);
                        k0.a.b(k0Var2, null, 1, null);
                        return g2.f100423a;
                    } catch (Throwable th3) {
                        th = th3;
                        k0Var2 = k0Var;
                        k0.a.b(k0Var2, null, 1, null);
                        throw th;
                    }
                } catch (AbortFlowException e14) {
                    e = e14;
                    k0Var = j11;
                    a0Var = c11;
                } catch (Throwable th4) {
                    th = th4;
                    k0Var = j11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0Var2 = (a0) this.f68233a;
                k0Var2 = (k0) this.f68235c;
                try {
                    try {
                        kotlin.e.n(obj);
                    } catch (AbortFlowException e15) {
                        e = e15;
                        o.b(e, a0Var2);
                        k0.a.b(k0Var2, null, 1, null);
                        return g2.f100423a;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    k0.a.b(k0Var2, null, 1, null);
                    throw th;
                }
            }
            k0.a.b(k0Var2, null, 1, null);
            return g2.f100423a;
        }
    }

    @m80.l
    @v0
    public static final <R, T> Object a(@m80.k kotlinx.coroutines.flow.j<? super R> jVar, @m80.k kotlinx.coroutines.flow.i<? extends T>[] iVarArr, @m80.k x00.a<T[]> aVar, @m80.k x00.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super j00.c<? super g2>, ? extends Object> qVar, @m80.k j00.c<? super g2> cVar) {
        Object a11 = n.a(new a(iVarArr, aVar, qVar, jVar, null), cVar);
        return a11 == kotlin.coroutines.intrinsics.b.l() ? a11 : g2.f100423a;
    }

    @m80.k
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> b(@m80.k kotlinx.coroutines.flow.i<? extends T1> iVar, @m80.k kotlinx.coroutines.flow.i<? extends T2> iVar2, @m80.k x00.q<? super T1, ? super T2, ? super j00.c<? super R>, ? extends Object> qVar) {
        return new b(iVar2, iVar, qVar);
    }
}
