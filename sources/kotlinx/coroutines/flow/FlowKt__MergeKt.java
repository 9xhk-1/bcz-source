package kotlinx.coroutines.flow;

import c40.a2;
import c40.y1;
import com.jiongji.andriod.card.R;
import h40.a1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n49#2:215\n51#2:219\n49#2:220\n51#2:224\n46#3:216\n51#3:218\n46#3:221\n51#3:223\n105#4:217\n105#4:222\n105#4:225\n1#5:226\n*S KotlinDebug\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n43#1:215\n43#1:219\n70#1:220\n70#1:224\n43#1:216\n43#1:218\n70#1:221\n70#1:223\n43#1:217\n70#1:222\n78#1:225\n*E\n"})
/* loaded from: classes8.dex */
public final /* synthetic */ class FlowKt__MergeKt {

    /* renamed from: a, reason: collision with root package name */
    public static final int f67922a = a1.b(k.f68297a, 16, 1, Integer.MAX_VALUE);

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,108:1\n79#2,2:109\n*E\n"})
    public static final class a<T> implements i<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f67931a;

        public a(i iVar) {
            this.f67931a = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(j<? super T> jVar, j00.c<? super g2> cVar) {
            Object collect = this.f67931a.collect(new b(jVar), cVar);
            return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> implements j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j<T> f67932a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", f = "Merge.kt", i = {}, l = {79}, m = "emit", n = {}, s = {})
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f67933a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b<T> f67934b;

            /* renamed from: c, reason: collision with root package name */
            public int f67935c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b<? super T> bVar, j00.c<? super a> cVar) {
                super(cVar);
                this.f67934b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f67933a = obj;
                this.f67935c |= Integer.MIN_VALUE;
                return this.f67934b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(j<? super T> jVar) {
            this.f67932a = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.j
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(kotlinx.coroutines.flow.i<? extends T> r5, j00.c<? super yz.g2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__MergeKt.b.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.FlowKt__MergeKt$b$a r0 = (kotlinx.coroutines.flow.FlowKt__MergeKt.b.a) r0
                int r1 = r0.f67935c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f67935c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__MergeKt$b$a r0 = new kotlinx.coroutines.flow.FlowKt__MergeKt$b$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f67933a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f67935c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.e.n(r6)
                goto L3f
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.e.n(r6)
                kotlinx.coroutines.flow.j<T> r6 = r4.f67932a
                r0.f67935c = r3
                java.lang.Object r5 = kotlinx.coroutines.flow.k.o0(r6, r5, r0)
                if (r5 != r1) goto L3f
                return r1
            L3f:
                yz.g2 r5 = yz.g2.f100423a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt.b.emit(kotlinx.coroutines.flow.i, j00.c):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", i = {}, l = {R.styleable.Theme_drawable_reset_plan, R.styleable.Theme_drawable_reset_plan}, m = "invokeSuspend", n = {}, s = {})
    public static final class c<R, T> extends SuspendLambda implements x00.q<j<? super R>, T, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f67936a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f67937b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f67938c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x00.p<T, j00.c<? super R>, Object> f67939d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(x00.p<? super T, ? super j00.c<? super R>, ? extends Object> pVar, j00.c<? super c> cVar) {
            super(3, cVar);
            this.f67939d = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // x00.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, j00.c<? super g2> cVar) {
            return invoke((j) obj, (j<? super R>) obj2, cVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        
            if (r6 == r0) goto L15;
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
                int r1 = r5.f67936a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r6)
                goto L45
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f67937b
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.e.n(r6)
                goto L39
            L22:
                kotlin.e.n(r6)
                java.lang.Object r6 = r5.f67937b
                r1 = r6
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                java.lang.Object r6 = r5.f67938c
                x00.p<T, j00.c<? super R>, java.lang.Object> r4 = r5.f67939d
                r5.f67937b = r1
                r5.f67936a = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L39
                goto L44
            L39:
                r3 = 0
                r5.f67937b = r3
                r5.f67936a = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L45
            L44:
                return r0
            L45:
                yz.g2 r6 = yz.g2.f100423a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(j<? super R> jVar, T t11, j00.c<? super g2> cVar) {
            c cVar2 = new c(this.f67939d, cVar);
            cVar2.f67937b = jVar;
            cVar2.f67938c = t11;
            return cVar2.invokeSuspend(g2.f100423a);
        }
    }

    @y1
    @m80.k
    public static final <T, R> i<R> a(@m80.k final i<? extends T> iVar, @m80.k final x00.p<? super T, ? super j00.c<? super i<? extends R>>, ? extends Object> pVar) {
        return k.H0(new i<i<? extends R>>() { // from class: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n50#2:50\n*E\n"})
            /* renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f67925a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ x00.p f67926b;

                @l00.d(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {50, 50}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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

                public AnonymousClass2(j jVar, x00.p pVar) {
                    this.f67925a = jVar;
                    this.f67926b = pVar;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
                
                    if (r7.emit(r8, r0) != r1) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, j00.c r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3c
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        kotlin.e.n(r8)
                        goto L5d
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        java.lang.Object r7 = r0.L$0
                        kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                        kotlin.e.n(r8)
                        goto L51
                    L3c:
                        kotlin.e.n(r8)
                        kotlinx.coroutines.flow.j r8 = r6.f67925a
                        x00.p r2 = r6.f67926b
                        r0.L$0 = r8
                        r0.label = r4
                        java.lang.Object r7 = r2.invoke(r7, r0)
                        if (r7 != r1) goto L4e
                        goto L5c
                    L4e:
                        r5 = r8
                        r8 = r7
                        r7 = r5
                    L51:
                        r2 = 0
                        r0.L$0 = r2
                        r0.label = r3
                        java.lang.Object r7 = r7.emit(r8, r0)
                        if (r7 != r1) goto L5d
                    L5c:
                        return r1
                    L5d:
                        yz.g2 r7 = yz.g2.f100423a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j jVar, j00.c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar, pVar), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        });
    }

    @y1
    @m80.k
    public static final <T, R> i<R> b(@m80.k i<? extends T> iVar, @yz.b @m80.k x00.p<? super T, ? super j00.c<? super i<? extends R>>, ? extends Object> pVar) {
        return k.f2(iVar, new FlowKt__MergeKt$flatMapLatest$1(pVar, null));
    }

    @y1
    @m80.k
    public static final <T, R> i<R> c(@m80.k final i<? extends T> iVar, int i11, @m80.k final x00.p<? super T, ? super j00.c<? super i<? extends R>>, ? extends Object> pVar) {
        return k.I0(new i<i<? extends R>>() { // from class: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n50#2:50\n*E\n"})
            /* renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f67929a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ x00.p f67930b;

                @l00.d(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {50, 50}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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

                public AnonymousClass2(j jVar, x00.p pVar) {
                    this.f67929a = jVar;
                    this.f67930b = pVar;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
                
                    if (r7.emit(r8, r0) != r1) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, j00.c r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3c
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        kotlin.e.n(r8)
                        goto L5d
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        java.lang.Object r7 = r0.L$0
                        kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                        kotlin.e.n(r8)
                        goto L51
                    L3c:
                        kotlin.e.n(r8)
                        kotlinx.coroutines.flow.j r8 = r6.f67929a
                        x00.p r2 = r6.f67930b
                        r0.L$0 = r8
                        r0.label = r4
                        java.lang.Object r7 = r2.invoke(r7, r0)
                        if (r7 != r1) goto L4e
                        goto L5c
                    L4e:
                        r5 = r8
                        r8 = r7
                        r7 = r5
                    L51:
                        r2 = 0
                        r0.L$0 = r2
                        r0.label = r3
                        java.lang.Object r7 = r7.emit(r8, r0)
                        if (r7 != r1) goto L5d
                    L5c:
                        return r1
                    L5d:
                        yz.g2 r7 = yz.g2.f100423a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j jVar, j00.c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar, pVar), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        }, i11);
    }

    public static /* synthetic */ i d(i iVar, int i11, x00.p pVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = f67922a;
        }
        return k.E0(iVar, i11, pVar);
    }

    @y1
    @m80.k
    public static final <T> i<T> e(@m80.k i<? extends i<? extends T>> iVar) {
        return new a(iVar);
    }

    @y1
    @m80.k
    public static final <T> i<T> f(@m80.k i<? extends i<? extends T>> iVar, int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException(("Expected positive concurrency level, but had " + i11).toString());
        }
        if (i11 == 1) {
            return k.H0(iVar);
        }
        return new kotlinx.coroutines.flow.internal.f(iVar, i11, null, 0, null, 28, null);
    }

    public static /* synthetic */ i g(i iVar, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = f67922a;
        }
        return k.I0(iVar, i11);
    }

    public static final int h() {
        return f67922a;
    }

    @y1
    @m80.k
    public static final <T, R> i<R> k(@m80.k i<? extends T> iVar, @yz.b @m80.k x00.p<? super T, ? super j00.c<? super R>, ? extends Object> pVar) {
        return k.f2(iVar, new c(pVar, null));
    }

    @m80.k
    public static final <T> i<T> l(@m80.k Iterable<? extends i<? extends T>> iterable) {
        return new kotlinx.coroutines.flow.internal.j(iterable, null, 0, null, 14, null);
    }

    @m80.k
    public static final <T> i<T> m(@m80.k i<? extends T>... iVarArr) {
        return k.a1(a00.a0.K5(iVarArr));
    }

    @y1
    @m80.k
    public static final <T, R> i<R> n(@m80.k i<? extends T> iVar, @yz.b @m80.k x00.q<? super j<? super R>, ? super T, ? super j00.c<? super g2>, ? extends Object> qVar) {
        return new kotlinx.coroutines.flow.internal.i(qVar, iVar, null, 0, null, 28, null);
    }

    @a2
    public static /* synthetic */ void i() {
    }

    @a2
    public static /* synthetic */ void j() {
    }
}
