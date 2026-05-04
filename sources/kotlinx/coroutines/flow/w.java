package kotlinx.coroutines.flow;

import c40.l2;
import c40.n2;
import com.jiongji.andriod.card.R;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.CoroutineStart;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/FlowKt__ShareKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n1#2:430\n*E\n"})
/* loaded from: classes8.dex */
public final /* synthetic */ class w {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {210, R.styleable.Theme_drawable_review_sound, R.styleable.Theme_drawable_revocation, R.styleable.Theme_drawable_share_close}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f68424a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h0 f68425b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i<T> f68426c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x<T> f68427d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ T f68428e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.w$a$a, reason: collision with other inner class name */
        public static final class C0825a extends SuspendLambda implements x00.p<Integer, j00.c<? super Boolean>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f68429a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ int f68430b;

            public C0825a(j00.c<? super C0825a> cVar) {
                super(2, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                C0825a c0825a = new C0825a(cVar);
                c0825a.f68430b = ((Number) obj).intValue();
                return c0825a;
            }

            public final Object invoke(int i11, j00.c<? super Boolean> cVar) {
                return ((C0825a) create(Integer.valueOf(i11), cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f68429a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return l00.a.a(this.f68430b > 0);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Object invoke(Integer num, j00.c<? super Boolean> cVar) {
                return invoke(num.intValue(), cVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {R.styleable.Theme_drawable_sound1}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements x00.p<SharingCommand, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f68431a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f68432b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i<T> f68433c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ x<T> f68434d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ T f68435e;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: kotlinx.coroutines.flow.w$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C0826a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f68436a;

                static {
                    int[] iArr = new int[SharingCommand.values().length];
                    try {
                        iArr[SharingCommand.START.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SharingCommand.STOP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SharingCommand.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f68436a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(i<? extends T> iVar, x<T> xVar, T t11, j00.c<? super b> cVar) {
                super(2, cVar);
                this.f68433c = iVar;
                this.f68434d = xVar;
                this.f68435e = t11;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                b bVar = new b(this.f68433c, this.f68434d, this.f68435e, cVar);
                bVar.f68432b = obj;
                return bVar;
            }

            @Override // x00.p
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SharingCommand sharingCommand, j00.c<? super g2> cVar) {
                return ((b) create(sharingCommand, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f68431a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    int i12 = C0826a.f68436a[((SharingCommand) this.f68432b).ordinal()];
                    if (i12 == 1) {
                        i<T> iVar = this.f68433c;
                        c0 c0Var = this.f68434d;
                        this.f68431a = 1;
                        if (iVar.collect(c0Var, this) == l11) {
                            return l11;
                        }
                    } else if (i12 != 2) {
                        if (i12 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        T t11 = this.f68435e;
                        if (t11 == e0.f68130a) {
                            this.f68434d.c();
                        } else {
                            l00.a.a(this.f68434d.d(t11));
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                return g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(h0 h0Var, i<? extends T> iVar, x<T> xVar, T t11, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f68425b = h0Var;
            this.f68426c = iVar;
            this.f68427d = xVar;
            this.f68428e = t11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f68425b, this.f68426c, this.f68427d, this.f68428e, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
        
            if (r8.collect(r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        
            if (r8.collect(r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
        
            if (kotlinx.coroutines.flow.k.x0(r8, r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
        
            if (kotlinx.coroutines.flow.k.C(r8, r1, r7) == r0) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f68424a
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L21
                if (r1 != r2) goto L15
                goto L21
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                kotlin.e.n(r8)
                goto L5c
            L21:
                kotlin.e.n(r8)
                goto L8d
            L25:
                kotlin.e.n(r8)
                kotlinx.coroutines.flow.h0 r8 = r7.f68425b
                kotlinx.coroutines.flow.h0$a r1 = kotlinx.coroutines.flow.h0.f68148a
                kotlinx.coroutines.flow.h0 r6 = r1.c()
                if (r8 != r6) goto L3f
                kotlinx.coroutines.flow.i<T> r8 = r7.f68426c
                kotlinx.coroutines.flow.x<T> r1 = r7.f68427d
                r7.f68424a = r5
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                goto L8c
            L3f:
                kotlinx.coroutines.flow.h0 r8 = r7.f68425b
                kotlinx.coroutines.flow.h0 r1 = r1.d()
                r5 = 0
                if (r8 != r1) goto L69
                kotlinx.coroutines.flow.x<T> r8 = r7.f68427d
                kotlinx.coroutines.flow.m0 r8 = r8.f()
                kotlinx.coroutines.flow.w$a$a r1 = new kotlinx.coroutines.flow.w$a$a
                r1.<init>(r5)
                r7.f68424a = r4
                java.lang.Object r8 = kotlinx.coroutines.flow.k.x0(r8, r1, r7)
                if (r8 != r0) goto L5c
                goto L8c
            L5c:
                kotlinx.coroutines.flow.i<T> r8 = r7.f68426c
                kotlinx.coroutines.flow.x<T> r1 = r7.f68427d
                r7.f68424a = r3
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                goto L8c
            L69:
                kotlinx.coroutines.flow.h0 r8 = r7.f68425b
                kotlinx.coroutines.flow.x<T> r1 = r7.f68427d
                kotlinx.coroutines.flow.m0 r1 = r1.f()
                kotlinx.coroutines.flow.i r8 = r8.a(r1)
                kotlinx.coroutines.flow.i r8 = kotlinx.coroutines.flow.k.i0(r8)
                kotlinx.coroutines.flow.w$a$b r1 = new kotlinx.coroutines.flow.w$a$b
                kotlinx.coroutines.flow.i<T> r3 = r7.f68426c
                kotlinx.coroutines.flow.x<T> r4 = r7.f68427d
                T r6 = r7.f68428e
                r1.<init>(r3, r4, r6, r5)
                r7.f68424a = r2
                java.lang.Object r8 = kotlinx.coroutines.flow.k.C(r8, r1, r7)
                if (r8 != r0) goto L8d
            L8c:
                return r0
            L8d:
                yz.g2 r8 = yz.g2.f100423a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.w.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", i = {0}, l = {337}, m = "invokeSuspend", n = {"state"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f68437a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68438b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i<T> f68439c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c40.x<Result<m0<T>>> f68440d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/FlowKt__ShareKt$launchSharingDeferred$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n1#2:430\n*E\n"})
        public static final class a<T> implements j {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef<y<T>> f68441a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c40.r0 f68442b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c40.x<Result<m0<T>>> f68443c;

            public a(Ref.ObjectRef<y<T>> objectRef, c40.r0 r0Var, c40.x<Result<m0<T>>> xVar) {
                this.f68441a = objectRef;
                this.f68442b = r0Var;
                this.f68443c = xVar;
            }

            /* JADX WARN: Type inference failed for: r4v1, types: [T, kotlinx.coroutines.flow.m0, kotlinx.coroutines.flow.y] */
            @Override // kotlinx.coroutines.flow.j
            public final Object emit(T t11, j00.c<? super g2> cVar) {
                Ref.ObjectRef<y<T>> objectRef = this.f68441a;
                y<T> yVar = objectRef.element;
                if (yVar != null) {
                    yVar.setValue(t11);
                } else {
                    c40.r0 r0Var = this.f68442b;
                    c40.x<Result<m0<T>>> xVar = this.f68443c;
                    ?? r42 = (T) o0.a(t11);
                    Result.a aVar = Result.Companion;
                    xVar.c0(Result.m6307boximpl(Result.m6308constructorimpl(new a0(r42, n2.A(r0Var.getCoroutineContext())))));
                    objectRef.element = r42;
                }
                return g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(i<? extends T> iVar, c40.x<Result<m0<T>>> xVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f68439c = iVar;
            this.f68440d = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = new b(this.f68439c, this.f68440d, cVar);
            bVar.f68438b = obj;
            return bVar;
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef objectRef;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f68437a;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    c40.r0 r0Var = (c40.r0) this.f68438b;
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    i<T> iVar = this.f68439c;
                    a aVar = new a(objectRef2, r0Var, this.f68440d);
                    this.f68438b = objectRef2;
                    this.f68437a = 1;
                    if (iVar.collect(aVar, this) == l11) {
                        return l11;
                    }
                    objectRef = objectRef2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (Ref.ObjectRef) this.f68438b;
                    kotlin.e.n(obj);
                }
                if (objectRef.element == 0) {
                    c40.x<Result<m0<T>>> xVar = this.f68440d;
                    Result.a aVar2 = Result.Companion;
                    xVar.c0(Result.m6307boximpl(Result.m6308constructorimpl(kotlin.e.a(new NoSuchElementException("Flow is empty")))));
                }
                return g2.f100423a;
            } catch (Throwable th2) {
                this.f68440d.r(th2);
                throw th2;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__ShareKt", f = "Share.kt", i = {}, l = {326}, m = "stateIn", n = {}, s = {})
    public static final class c<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f68444a;

        /* renamed from: b, reason: collision with root package name */
        public int f68445b;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f68444a = obj;
            this.f68445b |= Integer.MIN_VALUE;
            return k.P1(null, null, this);
        }
    }

    @m80.k
    public static final <T> c0<T> a(@m80.k x<T> xVar) {
        return new z(xVar, null);
    }

    @m80.k
    public static final <T> m0<T> b(@m80.k y<T> yVar) {
        return new a0(yVar, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r3 == 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> kotlinx.coroutines.flow.g0<T> c(kotlinx.coroutines.flow.i<? extends T> r7, int r8) {
        /*
            e40.o$b r0 = e40.o.f49142n0
            int r0 = r0.a()
            int r0 = g10.u.u(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof kotlinx.coroutines.flow.internal.d
            if (r1 == 0) goto L3c
            r1 = r7
            kotlinx.coroutines.flow.internal.d r1 = (kotlinx.coroutines.flow.internal.d) r1
            kotlinx.coroutines.flow.i r2 = r1.k()
            if (r2 == 0) goto L3c
            kotlinx.coroutines.flow.g0 r7 = new kotlinx.coroutines.flow.g0
            int r3 = r1.f68159b
            r4 = -3
            if (r3 == r4) goto L26
            r4 = -2
            if (r3 == r4) goto L26
            if (r3 == 0) goto L26
            r0 = r3
            goto L34
        L26:
            kotlinx.coroutines.channels.BufferOverflow r4 = r1.f68160c
            kotlinx.coroutines.channels.BufferOverflow r5 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            r6 = 0
            if (r4 != r5) goto L31
            if (r3 != 0) goto L34
        L2f:
            r0 = r6
            goto L34
        L31:
            if (r8 != 0) goto L2f
            r0 = 1
        L34:
            kotlinx.coroutines.channels.BufferOverflow r8 = r1.f68160c
            kotlin.coroutines.d r1 = r1.f68158a
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3c:
            kotlinx.coroutines.flow.g0 r8 = new kotlinx.coroutines.flow.g0
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.w.c(kotlinx.coroutines.flow.i, int):kotlinx.coroutines.flow.g0");
    }

    public static final <T> l2 d(c40.r0 r0Var, kotlin.coroutines.d dVar, i<? extends T> iVar, x<T> xVar, h0 h0Var, T t11) {
        return c40.i.d(r0Var, dVar, kotlin.jvm.internal.g0.g(h0Var, h0.f68148a.c()) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED, new a(h0Var, iVar, xVar, t11, null));
    }

    public static final <T> void e(c40.r0 r0Var, kotlin.coroutines.d dVar, i<? extends T> iVar, c40.x<Result<m0<T>>> xVar) {
        c40.k.f(r0Var, dVar, null, new b(iVar, xVar, null), 2, null);
    }

    @m80.k
    public static final <T> c0<T> f(@m80.k c0<? extends T> c0Var, @m80.k x00.p<? super j<? super T>, ? super j00.c<? super g2>, ? extends Object> pVar) {
        return new r0(c0Var, pVar);
    }

    @m80.k
    public static final <T> c0<T> g(@m80.k i<? extends T> iVar, @m80.k c40.r0 r0Var, @m80.k h0 h0Var, int i11) {
        g0 c11 = c(iVar, i11);
        x a11 = e0.a(i11, c11.f68144b, c11.f68145c);
        return new z(a11, d(r0Var, c11.f68146d, c11.f68143a, a11, h0Var, e0.f68130a));
    }

    public static /* synthetic */ c0 h(i iVar, c40.r0 r0Var, h0 h0Var, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return k.I1(iVar, r0Var, h0Var, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object i(@m80.k kotlinx.coroutines.flow.i<? extends T> r4, @m80.k c40.r0 r5, @m80.k j00.c<? super kotlinx.coroutines.flow.m0<? extends T>> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.w.c
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.w$c r0 = (kotlinx.coroutines.flow.w.c) r0
            int r1 = r0.f68445b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68445b = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.w$c r0 = new kotlinx.coroutines.flow.w$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f68444a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f68445b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r6)
            goto L58
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.e.n(r6)
            kotlinx.coroutines.flow.g0 r4 = c(r4, r3)
            kotlin.coroutines.d r6 = r5.getCoroutineContext()
            c40.l2$b r2 = c40.l2.f7886e0
            kotlin.coroutines.d$b r6 = r6.get(r2)
            c40.l2 r6 = (c40.l2) r6
            c40.x r6 = c40.z.a(r6)
            kotlin.coroutines.d r2 = r4.f68146d
            kotlinx.coroutines.flow.i<T> r4 = r4.f68143a
            e(r5, r2, r4, r6)
            r0.f68445b = r3
            java.lang.Object r6 = r6.i(r0)
            if (r6 != r1) goto L58
            return r1
        L58:
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r4 = r6.m6317unboximpl()
            kotlin.e.n(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.w.i(kotlinx.coroutines.flow.i, c40.r0, j00.c):java.lang.Object");
    }

    @m80.k
    public static final <T> m0<T> j(@m80.k i<? extends T> iVar, @m80.k c40.r0 r0Var, @m80.k h0 h0Var, T t11) {
        g0 c11 = c(iVar, 1);
        y a11 = o0.a(t11);
        return new a0(a11, d(r0Var, c11.f68146d, c11.f68143a, a11, h0Var, t11));
    }
}
