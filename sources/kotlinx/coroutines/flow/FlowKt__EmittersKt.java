package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,218:1\n105#2:219\n105#2:220\n105#2:221\n105#2:222\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n46#1:219\n72#1:220\n142#1:221\n177#1:222\n*E\n"})
/* loaded from: classes8.dex */
public final /* synthetic */ class FlowKt__EmittersKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", i = {0}, l = {212}, m = "invokeSafely$FlowKt__EmittersKt", n = {"cause"}, s = {"L$0"})
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f67833a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f67834b;

        /* renamed from: c, reason: collision with root package name */
        public int f67835c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f67834b = obj;
            this.f67835c |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt.c(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> implements j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f67836a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j<T> f67837b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1", f = "Emitters.kt", i = {}, l = {181}, m = "emit", n = {}, s = {})
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f67838a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b<T> f67839b;

            /* renamed from: c, reason: collision with root package name */
            public int f67840c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b<? super T> bVar, j00.c<? super a> cVar) {
                super(cVar);
                this.f67839b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f67838a = obj;
                this.f67840c |= Integer.MIN_VALUE;
                return this.f67839b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(Ref.BooleanRef booleanRef, j<? super T> jVar) {
            this.f67836a = booleanRef;
            this.f67837b = jVar;
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
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt.b.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.FlowKt__EmittersKt$b$a r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt.b.a) r0
                int r1 = r0.f67840c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f67840c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__EmittersKt$b$a r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$b$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f67838a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f67840c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.e.n(r6)
                goto L44
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.e.n(r6)
                kotlin.jvm.internal.Ref$BooleanRef r6 = r4.f67836a
                r2 = 0
                r6.element = r2
                kotlinx.coroutines.flow.j<T> r6 = r4.f67837b
                r0.f67840c = r3
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L44
                return r1
            L44:
                yz.g2 r5 = yz.g2.f100423a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt.b.emit(java.lang.Object, j00.c):java.lang.Object");
        }
    }

    public static final void b(@m80.k j<?> jVar) {
        if (jVar instanceof s0) {
            throw ((s0) jVar).f68421a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(kotlinx.coroutines.flow.j<? super T> r4, x00.q<? super kotlinx.coroutines.flow.j<? super T>, ? super java.lang.Throwable, ? super j00.c<? super yz.g2>, ? extends java.lang.Object> r5, java.lang.Throwable r6, j00.c<? super yz.g2> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__EmittersKt$a r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt.a) r0
            int r1 = r0.f67835c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67835c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$a r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f67834b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f67835c
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.f67833a
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            kotlin.e.n(r7)     // Catch: java.lang.Throwable -> L2e
            goto L46
        L2e:
            r4 = move-exception
            goto L49
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            kotlin.e.n(r7)
            r0.f67833a = r6     // Catch: java.lang.Throwable -> L2e
            r0.f67835c = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r4 != r1) goto L46
            return r1
        L46:
            yz.g2 r4 = yz.g2.f100423a
            return r4
        L49:
            if (r6 == 0) goto L50
            if (r6 == r4) goto L50
            yz.r.a(r4, r6)
        L50:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt.c(kotlinx.coroutines.flow.j, x00.q, java.lang.Throwable, j00.c):java.lang.Object");
    }

    @m80.k
    public static final <T> i<T> d(@m80.k i<? extends T> iVar, @m80.k x00.q<? super j<? super T>, ? super Throwable, ? super j00.c<? super g2>, ? extends Object> qVar) {
        return new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(iVar, qVar);
    }

    @m80.k
    public static final <T> i<T> e(@m80.k i<? extends T> iVar, @m80.k x00.p<? super j<? super T>, ? super j00.c<? super g2>, ? extends Object> pVar) {
        return new FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1(iVar, pVar);
    }

    @m80.k
    public static final <T> i<T> f(@m80.k i<? extends T> iVar, @m80.k x00.p<? super j<? super T>, ? super j00.c<? super g2>, ? extends Object> pVar) {
        return new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(pVar, iVar);
    }

    @m80.k
    public static final <T, R> i<R> g(@m80.k i<? extends T> iVar, @yz.b @m80.k x00.q<? super j<? super R>, ? super T, ? super j00.c<? super g2>, ? extends Object> qVar) {
        return k.K0(new FlowKt__EmittersKt$transform$1(iVar, qVar, null));
    }

    @v0
    @m80.k
    public static final <T, R> i<R> h(@m80.k i<? extends T> iVar, @yz.b @m80.k x00.q<? super j<? super R>, ? super T, ? super j00.c<? super g2>, ? extends Object> qVar) {
        return new FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1(iVar, qVar);
    }
}
