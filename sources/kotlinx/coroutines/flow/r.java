package kotlinx.coroutines.flow;

import c40.a1;
import c40.a2;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.jiongji.andriod.card.R;
import e40.s;
import h40.x0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,407:1\n1#2:408\n*E\n"})
/* loaded from: classes8.dex */
public final /* synthetic */ class r {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {R.styleable.Theme_drawable_revocation, 415}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
    @u0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,407:1\n14#2:408\n14#2:410\n1#3:409\n54#4,5:411\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1\n*L\n212#1:408\n215#1:410\n222#1:411,5\n*E\n"})
    public static final class a<T> extends SuspendLambda implements x00.q<c40.r0, j<? super T>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f68359a;

        /* renamed from: b, reason: collision with root package name */
        public Object f68360b;

        /* renamed from: c, reason: collision with root package name */
        public int f68361c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f68362d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f68363e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x00.l<T, Long> f68364f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ i<T> f68365g;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", i = {}, l = {226}, m = "invokeSuspend", n = {}, s = {})
        @u0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$1\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,407:1\n14#2:408\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$1\n*L\n226#1:408\n*E\n"})
        /* renamed from: kotlinx.coroutines.flow.r$a$a, reason: collision with other inner class name */
        public static final class C0820a extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f68366a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j<T> f68367b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef<Object> f68368c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0820a(j<? super T> jVar, Ref.ObjectRef<Object> objectRef, j00.c<? super C0820a> cVar) {
                super(1, cVar);
                this.f68367b = jVar;
                this.f68368c = objectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new C0820a(this.f68367b, this.f68368c, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super g2> cVar) {
                return ((C0820a) create(cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f68366a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    j<T> jVar = this.f68367b;
                    x0 x0Var = kotlinx.coroutines.flow.internal.s.f68282a;
                    T t11 = this.f68368c.element;
                    if (t11 == x0Var) {
                        t11 = null;
                    }
                    this.f68366a = 1;
                    if (jVar.emit(t11, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                this.f68368c.element = null;
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", i = {0}, l = {R.styleable.Theme_drawable_tab_mall_1111}, m = "invokeSuspend", n = {"$this$onFailure_u2dWpGqRn0$iv"}, s = {"L$0"})
        @u0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$2\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,407:1\n1009#2,2:408\n1026#2:410\n1027#2:413\n1#3:411\n14#4:412\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$2\n*L\n232#1:408,2\n233#1:410\n233#1:413\n236#1:412\n*E\n"})
        public static final class b extends SuspendLambda implements x00.p<e40.s<? extends Object>, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f68369a;

            /* renamed from: b, reason: collision with root package name */
            public int f68370b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f68371c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef<Object> f68372d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ j<T> f68373e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Ref.ObjectRef<Object> objectRef, j<? super T> jVar, j00.c<? super b> cVar) {
                super(2, cVar);
                this.f68372d = objectRef;
                this.f68373e = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                b bVar = new b(this.f68372d, this.f68373e, cVar);
                bVar.f68371c = obj;
                return bVar;
            }

            public final Object i(Object obj, j00.c<? super g2> cVar) {
                return ((b) create(e40.s.b(obj), cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Object invoke(e40.s<? extends Object> sVar, j00.c<? super g2> cVar) {
                return i(sVar.o(), cVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Ref.ObjectRef<Object> objectRef;
                Ref.ObjectRef<Object> objectRef2;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f68370b;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    T t11 = (T) ((e40.s) this.f68371c).o();
                    objectRef = this.f68372d;
                    boolean z11 = t11 instanceof s.c;
                    if (!z11) {
                        objectRef.element = t11;
                    }
                    j<T> jVar = this.f68373e;
                    if (z11) {
                        Throwable f11 = e40.s.f(t11);
                        if (f11 != null) {
                            throw f11;
                        }
                        Object obj2 = objectRef.element;
                        if (obj2 != null) {
                            if (obj2 == kotlinx.coroutines.flow.internal.s.f68282a) {
                                obj2 = null;
                            }
                            this.f68371c = t11;
                            this.f68369a = objectRef;
                            this.f68370b = 1;
                            if (jVar.emit(obj2, this) == l11) {
                                return l11;
                            }
                            objectRef2 = objectRef;
                        }
                        objectRef.element = (T) kotlinx.coroutines.flow.internal.s.f68284c;
                    }
                    return g2.f100423a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef2 = (Ref.ObjectRef) this.f68369a;
                kotlin.e.n(obj);
                objectRef = objectRef2;
                objectRef.element = (T) kotlinx.coroutines.flow.internal.s.f68284c;
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements x00.p<e40.i0<? super Object>, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f68374a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f68375b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i<T> f68376c;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: kotlinx.coroutines.flow.r$a$c$a, reason: collision with other inner class name */
            public static final class C0821a<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ e40.i0<Object> f68377a;

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                @l00.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", i = {}, l = {204}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.r$a$c$a$a, reason: collision with other inner class name */
                public static final class C0822a extends ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f68378a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ C0821a<T> f68379b;

                    /* renamed from: c, reason: collision with root package name */
                    public int f68380c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0822a(C0821a<? super T> c0821a, j00.c<? super C0822a> cVar) {
                        super(cVar);
                        this.f68379b = c0821a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f68378a = obj;
                        this.f68380c |= Integer.MIN_VALUE;
                        return this.f68379b.emit(null, this);
                    }
                }

                public C0821a(e40.i0<Object> i0Var) {
                    this.f68377a = i0Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r5, j00.c<? super yz.g2> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.r.a.c.C0821a.C0822a
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.r$a$c$a$a r0 = (kotlinx.coroutines.flow.r.a.c.C0821a.C0822a) r0
                        int r1 = r0.f68380c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f68380c = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.r$a$c$a$a r0 = new kotlinx.coroutines.flow.r$a$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f68378a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.f68380c
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.e.n(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.e.n(r6)
                        e40.i0<java.lang.Object> r6 = r4.f68377a
                        if (r5 != 0) goto L3a
                        h40.x0 r5 = kotlinx.coroutines.flow.internal.s.f68282a
                    L3a:
                        r0.f68380c = r3
                        java.lang.Object r5 = r6.b(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        yz.g2 r5 = yz.g2.f100423a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.a.c.C0821a.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(i<? extends T> iVar, j00.c<? super c> cVar) {
                super(2, cVar);
                this.f68376c = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                c cVar2 = new c(this.f68376c, cVar);
                cVar2.f68375b = obj;
                return cVar2;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(e40.i0<Object> i0Var, j00.c<? super g2> cVar) {
                return ((c) create(i0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f68374a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    e40.i0 i0Var = (e40.i0) this.f68375b;
                    i<T> iVar = this.f68376c;
                    C0821a c0821a = new C0821a(i0Var);
                    this.f68374a = 1;
                    if (iVar.collect(c0821a, this) == l11) {
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
            public /* bridge */ /* synthetic */ Object invoke(e40.i0<? super Object> i0Var, j00.c<? super g2> cVar) {
                return invoke2((e40.i0<Object>) i0Var, cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x00.l<? super T, Long> lVar, i<? extends T> iVar, j00.c<? super a> cVar) {
            super(3, cVar);
            this.f68364f = lVar;
            this.f68365g = iVar;
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c40.r0 r0Var, j<? super T> jVar, j00.c<? super g2> cVar) {
            a aVar = new a(this.f68364f, this.f68365g, cVar);
            aVar.f68362d = r0Var;
            aVar.f68363e = jVar;
            return aVar.invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
        
            if (r7.emit(r15, r14) == r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00e4, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00e2, code lost:
        
            if (r7.w(r14) != r0) goto L7;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0066  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00e2 -> B:6:0x001e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 232
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1", f = "Delay.kt", i = {0, 1, 2}, l = {307, 309, 310}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    public static final class b extends SuspendLambda implements x00.p<e40.i0<? super g2>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f68381a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68382b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f68383c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j11, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f68383c = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = new b(this.f68383c, cVar);
            bVar.f68382b = obj;
            return bVar;
        }

        @Override // x00.p
        public final Object invoke(e40.i0<? super g2> i0Var, j00.c<? super g2> cVar) {
            return ((b) create(i0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
        
            if (c40.a1.b(r4, r7) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
        
            if (r8.b(r4, r7) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
        
            if (c40.a1.b(r5, r7) == r0) goto L20;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005a -> B:12:0x003f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f68381a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2a
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L22
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                java.lang.Object r1 = r7.f68382b
                e40.i0 r1 = (e40.i0) r1
                kotlin.e.n(r8)
                goto L50
            L22:
                java.lang.Object r1 = r7.f68382b
                e40.i0 r1 = (e40.i0) r1
                kotlin.e.n(r8)
                goto L3f
            L2a:
                kotlin.e.n(r8)
                java.lang.Object r8 = r7.f68382b
                r1 = r8
                e40.i0 r1 = (e40.i0) r1
                long r5 = r7.f68383c
                r7.f68382b = r1
                r7.f68381a = r4
                java.lang.Object r8 = c40.a1.b(r5, r7)
                if (r8 != r0) goto L3f
                goto L5c
            L3f:
                e40.l0 r8 = r1.getChannel()
                yz.g2 r4 = yz.g2.f100423a
                r7.f68382b = r1
                r7.f68381a = r3
                java.lang.Object r8 = r8.b(r4, r7)
                if (r8 != r0) goto L50
                goto L5c
            L50:
                long r4 = r7.f68383c
                r7.f68382b = r1
                r7.f68381a = r2
                java.lang.Object r8 = c40.a1.b(r4, r7)
                if (r8 != r0) goto L3f
            L5c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", i = {0, 0, 0, 0}, l = {412}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", RemoteMessageConst.Notification.TICKER}, s = {"L$0", "L$1", "L$2", "L$3"})
    @u0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2\n+ 2 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,407:1\n54#2,5:408\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2\n*L\n278#1:408,5\n*E\n"})
    public static final class c<T> extends SuspendLambda implements x00.q<c40.r0, j<? super T>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f68384a;

        /* renamed from: b, reason: collision with root package name */
        public Object f68385b;

        /* renamed from: c, reason: collision with root package name */
        public int f68386c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f68387d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f68388e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f68389f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ i<T> f68390g;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @u0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,407:1\n1009#2,2:408\n1026#2:410\n1027#2:412\n1#3:411\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$1\n*L\n281#1:408,2\n282#1:410\n282#1:412\n*E\n"})
        public static final class a extends SuspendLambda implements x00.p<e40.s<? extends Object>, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f68391a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f68392b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef<Object> f68393c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ e40.k0<g2> f68394d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ref.ObjectRef<Object> objectRef, e40.k0<g2> k0Var, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f68393c = objectRef;
                this.f68394d = k0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                a aVar = new a(this.f68393c, this.f68394d, cVar);
                aVar.f68392b = obj;
                return aVar;
            }

            public final Object i(Object obj, j00.c<? super g2> cVar) {
                return ((a) create(e40.s.b(obj), cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Object invoke(e40.s<? extends Object> sVar, j00.c<? super g2> cVar) {
                return i(sVar.o(), cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f68391a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                T t11 = (T) ((e40.s) this.f68392b).o();
                Ref.ObjectRef<Object> objectRef = this.f68393c;
                boolean z11 = t11 instanceof s.c;
                if (!z11) {
                    objectRef.element = t11;
                }
                e40.k0<g2> k0Var = this.f68394d;
                if (z11) {
                    Throwable f11 = e40.s.f(t11);
                    if (f11 != null) {
                        throw f11;
                    }
                    k0Var.cancel(new ChildCancelledException());
                    objectRef.element = (T) kotlinx.coroutines.flow.internal.s.f68284c;
                }
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", i = {}, l = {293}, m = "invokeSuspend", n = {}, s = {})
        @u0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$2\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,407:1\n14#2:408\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$2\n*L\n293#1:408\n*E\n"})
        public static final class b extends SuspendLambda implements x00.p<g2, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f68395a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef<Object> f68396b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j<T> f68397c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Ref.ObjectRef<Object> objectRef, j<? super T> jVar, j00.c<? super b> cVar) {
                super(2, cVar);
                this.f68396b = objectRef;
                this.f68397c = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new b(this.f68396b, this.f68397c, cVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f68395a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    Ref.ObjectRef<Object> objectRef = this.f68396b;
                    Object obj2 = objectRef.element;
                    if (obj2 == null) {
                        return g2.f100423a;
                    }
                    objectRef.element = null;
                    j<T> jVar = this.f68397c;
                    if (obj2 == kotlinx.coroutines.flow.internal.s.f68282a) {
                        obj2 = null;
                    }
                    this.f68395a = 1;
                    if (jVar.emit(obj2, this) == l11) {
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
        @l00.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1", f = "Delay.kt", i = {}, l = {e3.a.A}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.r$c$c, reason: collision with other inner class name */
        public static final class C0823c extends SuspendLambda implements x00.p<e40.i0<? super Object>, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f68398a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f68399b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i<T> f68400c;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: kotlinx.coroutines.flow.r$c$c$a */
            public static final class a<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ e40.i0<Object> f68401a;

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                @l00.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1", f = "Delay.kt", i = {}, l = {e3.a.A}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.r$c$c$a$a, reason: collision with other inner class name */
                public static final class C0824a extends ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f68402a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ a<T> f68403b;

                    /* renamed from: c, reason: collision with root package name */
                    public int f68404c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0824a(a<? super T> aVar, j00.c<? super C0824a> cVar) {
                        super(cVar);
                        this.f68403b = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f68402a = obj;
                        this.f68404c |= Integer.MIN_VALUE;
                        return this.f68403b.emit(null, this);
                    }
                }

                public a(e40.i0<Object> i0Var) {
                    this.f68401a = i0Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r5, j00.c<? super yz.g2> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.r.c.C0823c.a.C0824a
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.r$c$c$a$a r0 = (kotlinx.coroutines.flow.r.c.C0823c.a.C0824a) r0
                        int r1 = r0.f68404c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f68404c = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.r$c$c$a$a r0 = new kotlinx.coroutines.flow.r$c$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f68402a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.f68404c
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.e.n(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.e.n(r6)
                        e40.i0<java.lang.Object> r6 = r4.f68401a
                        if (r5 != 0) goto L3a
                        h40.x0 r5 = kotlinx.coroutines.flow.internal.s.f68282a
                    L3a:
                        r0.f68404c = r3
                        java.lang.Object r5 = r6.b(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        yz.g2 r5 = yz.g2.f100423a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.c.C0823c.a.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0823c(i<? extends T> iVar, j00.c<? super C0823c> cVar) {
                super(2, cVar);
                this.f68400c = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                C0823c c0823c = new C0823c(this.f68400c, cVar);
                c0823c.f68399b = obj;
                return c0823c;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(e40.i0<Object> i0Var, j00.c<? super g2> cVar) {
                return ((C0823c) create(i0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f68398a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    e40.i0 i0Var = (e40.i0) this.f68399b;
                    i<T> iVar = this.f68400c;
                    a aVar = new a(i0Var);
                    this.f68398a = 1;
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
            public /* bridge */ /* synthetic */ Object invoke(e40.i0<? super Object> i0Var, j00.c<? super g2> cVar) {
                return invoke2((e40.i0<Object>) i0Var, cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(long j11, i<? extends T> iVar, j00.c<? super c> cVar) {
            super(3, cVar);
            this.f68389f = j11;
            this.f68390g = iVar;
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c40.r0 r0Var, j<? super T> jVar, j00.c<? super g2> cVar) {
            c cVar2 = new c(this.f68389f, this.f68390g, cVar);
            cVar2.f68387d = r0Var;
            cVar2.f68388e = jVar;
            return cVar2.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            e40.k0 k0Var;
            e40.k0<g2> A0;
            Ref.ObjectRef objectRef;
            j jVar;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f68386c;
            if (i11 == 0) {
                kotlin.e.n(obj);
                c40.r0 r0Var = (c40.r0) this.f68387d;
                j jVar2 = (j) this.f68388e;
                e40.k0 j11 = e40.g0.j(r0Var, null, -1, new C0823c(this.f68390g, null), 1, null);
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                k0Var = j11;
                A0 = k.A0(r0Var, this.f68389f);
                objectRef = objectRef2;
                jVar = jVar2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                A0 = (e40.k0) this.f68385b;
                objectRef = (Ref.ObjectRef) this.f68384a;
                k0Var = (e40.k0) this.f68388e;
                jVar = (j) this.f68387d;
                kotlin.e.n(obj);
            }
            while (objectRef.element != kotlinx.coroutines.flow.internal.s.f68284c) {
                k40.m mVar = new k40.m(getContext());
                mVar.f(k0Var.K(), new a(objectRef, A0, null));
                mVar.f(A0.Q(), new b(objectRef, jVar, null));
                this.f68387d = jVar;
                this.f68388e = k0Var;
                this.f68384a = objectRef;
                this.f68385b = A0;
                this.f68386c = 1;
                if (mVar.w(this) == l11) {
                    return l11;
                }
            }
            return g2.f100423a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", f = "Delay.kt", i = {0, 0}, l = {413}, m = "invokeSuspend", n = {"downStream", "values"}, s = {"L$0", "L$1"})
    @u0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1\n+ 2 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n+ 3 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,407:1\n27#2:408\n28#2:414\n54#3,5:409\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1\n*L\n392#1:408\n392#1:414\n392#1:409,5\n*E\n"})
    public static final class d<T> extends SuspendLambda implements x00.q<c40.r0, j<? super T>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public long f68405a;

        /* renamed from: b, reason: collision with root package name */
        public int f68406b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f68407c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f68408d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f68409e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ i<T> f68410f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", i = {0}, l = {395}, m = "invokeSuspend", n = {"$this$onSuccess_u2dWpGqRn0$iv"}, s = {"L$0"})
        @u0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,407:1\n1009#2,2:408\n1047#2:410\n1048#2:412\n1#3:411\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1$1$1\n*L\n394#1:408,2\n396#1:410\n396#1:412\n*E\n"})
        public static final class a extends SuspendLambda implements x00.p<e40.s<? extends T>, j00.c<? super Boolean>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f68411a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f68412b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j<T> f68413c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(j<? super T> jVar, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f68413c = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                a aVar = new a(this.f68413c, cVar);
                aVar.f68412b = obj;
                return aVar;
            }

            public final Object i(Object obj, j00.c<? super Boolean> cVar) {
                return ((a) create(e40.s.b(obj), cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, j00.c<? super Boolean> cVar) {
                return i(((e40.s) obj).o(), cVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r4.f68411a
                    r2 = 1
                    if (r1 == 0) goto L19
                    if (r1 != r2) goto L11
                    java.lang.Object r0 = r4.f68412b
                    kotlin.e.n(r5)
                    goto L36
                L11:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L19:
                    kotlin.e.n(r5)
                    java.lang.Object r5 = r4.f68412b
                    e40.s r5 = (e40.s) r5
                    java.lang.Object r5 = r5.o()
                    kotlinx.coroutines.flow.j<T> r1 = r4.f68413c
                    boolean r3 = r5 instanceof e40.s.c
                    if (r3 != 0) goto L37
                    r4.f68412b = r5
                    r4.f68411a = r2
                    java.lang.Object r1 = r1.emit(r5, r4)
                    if (r1 != r0) goto L35
                    return r0
                L35:
                    r0 = r5
                L36:
                    r5 = r0
                L37:
                    boolean r0 = r5 instanceof e40.s.a
                    if (r0 == 0) goto L49
                    java.lang.Throwable r5 = e40.s.f(r5)
                    if (r5 != 0) goto L48
                    r5 = 0
                    java.lang.Boolean r5 = l00.a.a(r5)
                    return r5
                L48:
                    throw r5
                L49:
                    java.lang.Boolean r5 = l00.a.a(r2)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements x00.l<j00.c<?>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f68414a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f68415b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(long j11, j00.c<? super b> cVar) {
                super(1, cVar);
                this.f68415b = j11;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new b(this.f68415b, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<?> cVar) {
                return ((b) create(cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f68414a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                throw new TimeoutCancellationException("Timed out waiting for " + ((Object) kotlin.time.e.f0(this.f68415b)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(long j11, i<? extends T> iVar, j00.c<? super d> cVar) {
            super(3, cVar);
            this.f68409e = j11;
            this.f68410f = iVar;
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c40.r0 r0Var, j<? super T> jVar, j00.c<? super g2> cVar) {
            d dVar = new d(this.f68409e, this.f68410f, cVar);
            dVar.f68407c = r0Var;
            dVar.f68408d = jVar;
            return dVar.invokeSuspend(g2.f100423a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0076 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0074 -> B:5:0x0077). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r9.f68406b
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L22
                if (r1 != r2) goto L1a
                long r4 = r9.f68405a
                java.lang.Object r1 = r9.f68408d
                e40.k0 r1 = (e40.k0) r1
                java.lang.Object r6 = r9.f68407c
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
                kotlin.e.n(r10)
                goto L77
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L22:
                kotlin.e.n(r10)
                java.lang.Object r10 = r9.f68407c
                c40.r0 r10 = (c40.r0) r10
                java.lang.Object r1 = r9.f68408d
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                long r4 = r9.f68409e
                kotlin.time.e$a r6 = kotlin.time.e.f67757b
                long r6 = r6.T()
                int r4 = kotlin.time.e.i(r4, r6)
                if (r4 <= 0) goto L82
                kotlinx.coroutines.flow.i<T> r4 = r9.f68410f
                r5 = 0
                r6 = 2
                kotlinx.coroutines.flow.i r4 = kotlinx.coroutines.flow.k.r(r4, r5, r3, r6, r3)
                e40.k0 r10 = kotlinx.coroutines.flow.k.q1(r4, r10)
                long r4 = r9.f68409e
                r6 = r1
                r1 = r10
            L4b:
                k40.m r10 = new k40.m
                kotlin.coroutines.d r7 = r9.getContext()
                r10.<init>(r7)
                k40.h r7 = r1.K()
                kotlinx.coroutines.flow.r$d$a r8 = new kotlinx.coroutines.flow.r$d$a
                r8.<init>(r6, r3)
                r10.f(r7, r8)
                kotlinx.coroutines.flow.r$d$b r7 = new kotlinx.coroutines.flow.r$d$b
                r7.<init>(r4, r3)
                k40.c.b(r10, r4, r7)
                r9.f68407c = r6
                r9.f68408d = r1
                r9.f68405a = r4
                r9.f68406b = r2
                java.lang.Object r10 = r10.w(r9)
                if (r10 != r0) goto L77
                return r0
            L77:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 != 0) goto L4b
                yz.g2 r10 = yz.g2.f100423a
                return r10
            L82:
                kotlinx.coroutines.TimeoutCancellationException r10 = new kotlinx.coroutines.TimeoutCancellationException
                java.lang.String r0 = "Timed out immediately"
                r10.<init>(r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @a2
    @m80.k
    public static final <T> i<T> c(@m80.k i<? extends T> iVar, final long j11) {
        if (j11 >= 0) {
            return j11 == 0 ? iVar : i(iVar, new x00.l() { // from class: kotlinx.coroutines.flow.q
                @Override // x00.l
                public final Object invoke(Object obj) {
                    long e11;
                    e11 = r.e(j11, obj);
                    return Long.valueOf(e11);
                }
            });
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    @a2
    @m80.k
    @yz.p0
    public static final <T> i<T> d(@m80.k i<? extends T> iVar, @m80.k x00.l<? super T, Long> lVar) {
        return i(iVar, lVar);
    }

    public static final long f(x00.l lVar, Object obj) {
        return a1.e(((kotlin.time.e) lVar.invoke(obj)).k0());
    }

    @a2
    @m80.k
    public static final <T> i<T> g(@m80.k i<? extends T> iVar, long j11) {
        return k.c0(iVar, a1.e(j11));
    }

    @w00.j(name = "debounceDuration")
    @m80.k
    @yz.p0
    @a2
    public static final <T> i<T> h(@m80.k i<? extends T> iVar, @m80.k final x00.l<? super T, kotlin.time.e> lVar) {
        return i(iVar, new x00.l() { // from class: kotlinx.coroutines.flow.p
            @Override // x00.l
            public final Object invoke(Object obj) {
                long f11;
                f11 = r.f(x00.l.this, obj);
                return Long.valueOf(f11);
            }
        });
    }

    public static final <T> i<T> i(i<? extends T> iVar, x00.l<? super T, Long> lVar) {
        return kotlinx.coroutines.flow.internal.n.b(new a(lVar, iVar, null));
    }

    @m80.k
    public static final e40.k0<g2> j(@m80.k c40.r0 r0Var, long j11) {
        return e40.g0.j(r0Var, null, 0, new b(j11, null), 1, null);
    }

    @a2
    @m80.k
    public static final <T> i<T> k(@m80.k i<? extends T> iVar, long j11) {
        if (j11 > 0) {
            return kotlinx.coroutines.flow.internal.n.b(new c(j11, iVar, null));
        }
        throw new IllegalArgumentException("Sample period should be positive");
    }

    @a2
    @m80.k
    public static final <T> i<T> l(@m80.k i<? extends T> iVar, long j11) {
        return k.D1(iVar, a1.e(j11));
    }

    @a2
    @m80.k
    public static final <T> i<T> m(@m80.k i<? extends T> iVar, long j11) {
        return n(iVar, j11);
    }

    public static final <T> i<T> n(i<? extends T> iVar, long j11) {
        return kotlinx.coroutines.flow.internal.n.b(new d(j11, iVar, null));
    }

    public static final long e(long j11, Object obj) {
        return j11;
    }
}
