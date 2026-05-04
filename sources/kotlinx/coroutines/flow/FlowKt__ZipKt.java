package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,328:1\n268#1,3:330\n268#1,3:333\n257#1:336\n259#1:338\n268#1,3:339\n257#1:342\n259#1:344\n268#1,3:345\n257#1:348\n259#1:350\n268#1,3:351\n105#2:329\n105#2:337\n105#2:343\n105#2:349\n105#2:354\n105#2:355\n105#2:360\n37#3:356\n36#3,3:357\n37#3:361\n36#3,3:362\n*S KotlinDebug\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n71#1:330,3\n99#1:333,3\n115#1:336\n115#1:338\n134#1:339,3\n152#1:342\n152#1:344\n173#1:345,3\n193#1:348\n193#1:350\n216#1:351,3\n28#1:329\n115#1:337\n152#1:343\n193#1:349\n233#1:354\n257#1:355\n284#1:360\n283#1:356\n283#1:357,3\n302#1:361\n302#1:362,3\n*E\n"})
/* loaded from: classes8.dex */
public final /* synthetic */ class FlowKt__ZipKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,108:1\n29#2,2:109\n*E\n"})
    public static final class a<R> implements i<R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f68078a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f68079b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.q f68080c;

        public a(i iVar, i iVar2, x00.q qVar) {
            this.f68078a = iVar;
            this.f68079b = iVar2;
            this.f68080c = qVar;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(j<? super R> jVar, j00.c<? super g2> cVar) {
            Object a11 = kotlinx.coroutines.flow.internal.k.a(jVar, new i[]{this.f68078a, this.f68079b}, FlowKt__ZipKt.r(), new b(this.f68080c, null), cVar);
            return a11 == kotlin.coroutines.intrinsics.b.l() ? a11 : g2.f100423a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", i = {}, l = {29, 29}, m = "invokeSuspend", n = {}, s = {})
    public static final class b<R> extends SuspendLambda implements x00.q<j<? super R>, Object[], j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f68081a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68082b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f68083c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x00.q<T1, T2, j00.c<? super R>, Object> f68084d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(x00.q<? super T1, ? super T2, ? super j00.c<? super R>, ? extends Object> qVar, j00.c<? super b> cVar) {
            super(3, cVar);
            this.f68084d = qVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
        
            if (r7 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f68081a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r7)
                goto L4c
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f68082b
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.e.n(r7)
                goto L40
            L22:
                kotlin.e.n(r7)
                java.lang.Object r7 = r6.f68082b
                r1 = r7
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                java.lang.Object r7 = r6.f68083c
                java.lang.Object[] r7 = (java.lang.Object[]) r7
                x00.q<T1, T2, j00.c<? super R>, java.lang.Object> r4 = r6.f68084d
                r5 = 0
                r5 = r7[r5]
                r7 = r7[r3]
                r6.f68082b = r1
                r6.f68081a = r3
                java.lang.Object r7 = r4.invoke(r5, r7, r6)
                if (r7 != r0) goto L40
                goto L4b
            L40:
                r3 = 0
                r6.f68082b = r3
                r6.f68081a = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L4c
            L4b:
                return r0
            L4c:
                yz.g2 r7 = yz.g2.f100423a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.q
        public final Object invoke(j<? super R> jVar, Object[] objArr, j00.c<? super g2> cVar) {
            b bVar = new b(this.f68084d, cVar);
            bVar.f68082b = jVar;
            bVar.f68083c = objArr;
            return bVar.invokeSuspend(g2.f100423a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<T> implements x00.a<T[]> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i<T>[] f68085a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(i<? extends T>[] iVarArr) {
            this.f68085a = iVarArr;
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T[] invoke() {
            int length = this.f68085a.length;
            kotlin.jvm.internal.g0.y(0, "T?");
            return (T[]) new Object[length];
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d<T> implements x00.a<T[]> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i<T>[] f68088a;

        public d(i<T>[] iVarArr) {
            this.f68088a = iVarArr;
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T[] invoke() {
            int length = this.f68088a.length;
            kotlin.jvm.internal.g0.y(0, "T?");
            return (T[]) new Object[length];
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e implements x00.a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f68089a = new e();

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    public static final /* synthetic */ <T, R> i<R> b(Iterable<? extends i<? extends T>> iterable, x00.p<? super T[], ? super j00.c<? super R>, ? extends Object> pVar) {
        i[] iVarArr = (i[]) a00.r0.a6(iterable).toArray(new i[0]);
        kotlin.jvm.internal.g0.w();
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$3(iVarArr, pVar);
    }

    @m80.k
    public static final <T1, T2, T3, T4, T5, R> i<R> c(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @m80.k i<? extends T3> iVar3, @m80.k i<? extends T4> iVar4, @m80.k i<? extends T5> iVar5, @m80.k final x00.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super j00.c<? super R>, ? extends Object> tVar) {
        final i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5};
        return new i<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @l00.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", f = "Zip.kt", i = {}, l = {259, 258}, m = "invokeSuspend", n = {}, s = {})
            @u0({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,258:1\n194#2,7:259\n*E\n"})
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements x00.q<j<? super R>, Object[], j00.c<? super g2>, Object> {
                final /* synthetic */ x00.t $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(j00.c cVar, x00.t tVar) {
                    super(3, cVar);
                    this.$transform$inlined = tVar;
                }

                /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
                
                    if (r1.emit(r12, r11) == r0) goto L15;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
                
                    if (r12 == r0) goto L15;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                    /*
                        r11 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                        int r1 = r11.label
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L24
                        if (r1 == r3) goto L1b
                        if (r1 != r2) goto L13
                        kotlin.e.n(r12)
                        r10 = r11
                        goto L5f
                    L13:
                        java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r12.<init>(r0)
                        throw r12
                    L1b:
                        java.lang.Object r1 = r11.L$0
                        kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                        kotlin.e.n(r12)
                        r10 = r11
                        goto L53
                    L24:
                        kotlin.e.n(r12)
                        java.lang.Object r12 = r11.L$0
                        r1 = r12
                        kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                        java.lang.Object r12 = r11.L$1
                        java.lang.Object[] r12 = (java.lang.Object[]) r12
                        x00.t r4 = r11.$transform$inlined
                        r5 = 0
                        r5 = r12[r5]
                        r6 = r12[r3]
                        r7 = r12[r2]
                        r8 = 3
                        r8 = r12[r8]
                        r9 = 4
                        r9 = r12[r9]
                        r11.L$0 = r1
                        r11.label = r3
                        r12 = 6
                        kotlin.jvm.internal.d0.e(r12)
                        r10 = r11
                        java.lang.Object r12 = r4.invoke(r5, r6, r7, r8, r9, r10)
                        r3 = 7
                        kotlin.jvm.internal.d0.e(r3)
                        if (r12 != r0) goto L53
                        goto L5e
                    L53:
                        r3 = 0
                        r10.L$0 = r3
                        r10.label = r2
                        java.lang.Object r12 = r1.emit(r12, r11)
                        if (r12 != r0) goto L5f
                    L5e:
                        return r0
                    L5f:
                        yz.g2 r12 = yz.g2.f100423a
                        return r12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // x00.q
                public final Object invoke(j<? super R> jVar, Object[] objArr, j00.c<? super g2> cVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar, this.$transform$inlined);
                    anonymousClass2.L$0 = jVar;
                    anonymousClass2.L$1 = objArr;
                    return anonymousClass2.invokeSuspend(g2.f100423a);
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j jVar, j00.c cVar) {
                Object a11 = kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, FlowKt__ZipKt.r(), new AnonymousClass2(null, tVar), cVar);
                return a11 == kotlin.coroutines.intrinsics.b.l() ? a11 : g2.f100423a;
            }
        };
    }

    @m80.k
    public static final <T1, T2, T3, T4, R> i<R> d(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @m80.k i<? extends T3> iVar3, @m80.k i<? extends T4> iVar4, @m80.k final x00.s<? super T1, ? super T2, ? super T3, ? super T4, ? super j00.c<? super R>, ? extends Object> sVar) {
        final i[] iVarArr = {iVar, iVar2, iVar3, iVar4};
        return new i<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @l00.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", i = {}, l = {259, 258}, m = "invokeSuspend", n = {}, s = {})
            @u0({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,258:1\n153#2,6:259\n*E\n"})
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements x00.q<j<? super R>, Object[], j00.c<? super g2>, Object> {
                final /* synthetic */ x00.s $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(j00.c cVar, x00.s sVar) {
                    super(3, cVar);
                    this.$transform$inlined = sVar;
                }

                /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
                
                    if (r1.emit(r11, r10) == r0) goto L15;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
                
                    if (r11 == r0) goto L15;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                    /*
                        r10 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                        int r1 = r10.label
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L24
                        if (r1 == r3) goto L1b
                        if (r1 != r2) goto L13
                        kotlin.e.n(r11)
                        r9 = r10
                        goto L5c
                    L13:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r0)
                        throw r11
                    L1b:
                        java.lang.Object r1 = r10.L$0
                        kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                        kotlin.e.n(r11)
                        r9 = r10
                        goto L50
                    L24:
                        kotlin.e.n(r11)
                        java.lang.Object r11 = r10.L$0
                        r1 = r11
                        kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                        java.lang.Object r11 = r10.L$1
                        java.lang.Object[] r11 = (java.lang.Object[]) r11
                        x00.s r4 = r10.$transform$inlined
                        r5 = 0
                        r5 = r11[r5]
                        r6 = r11[r3]
                        r7 = r11[r2]
                        r8 = 3
                        r8 = r11[r8]
                        r10.L$0 = r1
                        r10.label = r3
                        r11 = 6
                        kotlin.jvm.internal.d0.e(r11)
                        r9 = r10
                        java.lang.Object r11 = r4.invoke(r5, r6, r7, r8, r9)
                        r3 = 7
                        kotlin.jvm.internal.d0.e(r3)
                        if (r11 != r0) goto L50
                        goto L5b
                    L50:
                        r3 = 0
                        r9.L$0 = r3
                        r9.label = r2
                        java.lang.Object r11 = r1.emit(r11, r10)
                        if (r11 != r0) goto L5c
                    L5b:
                        return r0
                    L5c:
                        yz.g2 r11 = yz.g2.f100423a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // x00.q
                public final Object invoke(j<? super R> jVar, Object[] objArr, j00.c<? super g2> cVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar, this.$transform$inlined);
                    anonymousClass2.L$0 = jVar;
                    anonymousClass2.L$1 = objArr;
                    return anonymousClass2.invokeSuspend(g2.f100423a);
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j jVar, j00.c cVar) {
                Object a11 = kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, FlowKt__ZipKt.r(), new AnonymousClass2(null, sVar), cVar);
                return a11 == kotlin.coroutines.intrinsics.b.l() ? a11 : g2.f100423a;
            }
        };
    }

    @m80.k
    public static final <T1, T2, T3, R> i<R> e(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @m80.k i<? extends T3> iVar3, @yz.b @m80.k final x00.r<? super T1, ? super T2, ? super T3, ? super j00.c<? super R>, ? extends Object> rVar) {
        final i[] iVarArr = {iVar, iVar2, iVar3};
        return new i<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @l00.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", i = {}, l = {259, 258}, m = "invokeSuspend", n = {}, s = {})
            @u0({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,258:1\n116#2,5:259\n*E\n"})
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements x00.q<j<? super R>, Object[], j00.c<? super g2>, Object> {
                final /* synthetic */ x00.r $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(j00.c cVar, x00.r rVar) {
                    super(3, cVar);
                    this.$transform$inlined = rVar;
                }

                /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
                
                    if (r1.emit(r8, r7) == r0) goto L15;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
                
                    if (r8 == r0) goto L15;
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
                        int r1 = r7.label
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L22
                        if (r1 == r3) goto L1a
                        if (r1 != r2) goto L12
                        kotlin.e.n(r8)
                        goto L56
                    L12:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r0)
                        throw r8
                    L1a:
                        java.lang.Object r1 = r7.L$0
                        kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                        kotlin.e.n(r8)
                        goto L4a
                    L22:
                        kotlin.e.n(r8)
                        java.lang.Object r8 = r7.L$0
                        r1 = r8
                        kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                        java.lang.Object r8 = r7.L$1
                        java.lang.Object[] r8 = (java.lang.Object[]) r8
                        x00.r r4 = r7.$transform$inlined
                        r5 = 0
                        r5 = r8[r5]
                        r6 = r8[r3]
                        r8 = r8[r2]
                        r7.L$0 = r1
                        r7.label = r3
                        r3 = 6
                        kotlin.jvm.internal.d0.e(r3)
                        java.lang.Object r8 = r4.invoke(r5, r6, r8, r7)
                        r3 = 7
                        kotlin.jvm.internal.d0.e(r3)
                        if (r8 != r0) goto L4a
                        goto L55
                    L4a:
                        r3 = 0
                        r7.L$0 = r3
                        r7.label = r2
                        java.lang.Object r8 = r1.emit(r8, r7)
                        if (r8 != r0) goto L56
                    L55:
                        return r0
                    L56:
                        yz.g2 r8 = yz.g2.f100423a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // x00.q
                public final Object invoke(j<? super R> jVar, Object[] objArr, j00.c<? super g2> cVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar, this.$transform$inlined);
                    anonymousClass2.L$0 = jVar;
                    anonymousClass2.L$1 = objArr;
                    return anonymousClass2.invokeSuspend(g2.f100423a);
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j jVar, j00.c cVar) {
                Object a11 = kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, FlowKt__ZipKt.r(), new AnonymousClass2(null, rVar), cVar);
                return a11 == kotlin.coroutines.intrinsics.b.l() ? a11 : g2.f100423a;
            }
        };
    }

    @m80.k
    public static final <T1, T2, R> i<R> f(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @m80.k x00.q<? super T1, ? super T2, ? super j00.c<? super R>, ? extends Object> qVar) {
        return k.L0(iVar, iVar2, qVar);
    }

    public static final /* synthetic */ <T, R> i<R> g(i<? extends T>[] iVarArr, x00.p<? super T[], ? super j00.c<? super R>, ? extends Object> pVar) {
        kotlin.jvm.internal.g0.w();
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$2(iVarArr, pVar);
    }

    public static final /* synthetic */ <T, R> i<R> h(Iterable<? extends i<? extends T>> iterable, @yz.b x00.q<? super j<? super R>, ? super T[], ? super j00.c<? super g2>, ? extends Object> qVar) {
        i[] iVarArr = (i[]) a00.r0.a6(iterable).toArray(new i[0]);
        kotlin.jvm.internal.g0.w();
        return k.K0(new FlowKt__ZipKt$combineTransform$7(iVarArr, qVar, null));
    }

    @m80.k
    public static final <T1, T2, T3, T4, T5, R> i<R> i(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @m80.k i<? extends T3> iVar3, @m80.k i<? extends T4> iVar4, @m80.k i<? extends T5> iVar5, @yz.b @m80.k x00.u<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super j00.c<? super g2>, ? extends Object> uVar) {
        return k.K0(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5(new i[]{iVar, iVar2, iVar3, iVar4, iVar5}, null, uVar));
    }

    @m80.k
    public static final <T1, T2, T3, T4, R> i<R> j(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @m80.k i<? extends T3> iVar3, @m80.k i<? extends T4> iVar4, @yz.b @m80.k x00.t<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super j00.c<? super g2>, ? extends Object> tVar) {
        return k.K0(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4(new i[]{iVar, iVar2, iVar3, iVar4}, null, tVar));
    }

    @m80.k
    public static final <T1, T2, T3, R> i<R> k(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @m80.k i<? extends T3> iVar3, @yz.b @m80.k x00.s<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super j00.c<? super g2>, ? extends Object> sVar) {
        return k.K0(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3(new i[]{iVar, iVar2, iVar3}, null, sVar));
    }

    @m80.k
    public static final <T1, T2, R> i<R> l(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @yz.b @m80.k x00.r<? super j<? super R>, ? super T1, ? super T2, ? super j00.c<? super g2>, ? extends Object> rVar) {
        return k.K0(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2(new i[]{iVar, iVar2}, null, rVar));
    }

    public static final /* synthetic */ <T, R> i<R> m(i<? extends T>[] iVarArr, @yz.b x00.q<? super j<? super R>, ? super T[], ? super j00.c<? super g2>, ? extends Object> qVar) {
        kotlin.jvm.internal.g0.w();
        return k.K0(new FlowKt__ZipKt$combineTransform$6(iVarArr, qVar, null));
    }

    public static final /* synthetic */ <T, R> i<R> n(i<? extends T>[] iVarArr, @yz.b x00.q<? super j<? super R>, ? super T[], ? super j00.c<? super g2>, ? extends Object> qVar) {
        kotlin.jvm.internal.g0.w();
        return k.K0(new FlowKt__ZipKt$combineTransformUnsafe$1(iVarArr, qVar, null));
    }

    public static final /* synthetic */ <T, R> i<R> o(i<? extends T>[] iVarArr, x00.p<? super T[], ? super j00.c<? super R>, ? extends Object> pVar) {
        kotlin.jvm.internal.g0.w();
        return new FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1(iVarArr, pVar);
    }

    @w00.j(name = "flowCombine")
    @m80.k
    public static final <T1, T2, R> i<R> p(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @m80.k x00.q<? super T1, ? super T2, ? super j00.c<? super R>, ? extends Object> qVar) {
        return new a(iVar, iVar2, qVar);
    }

    @w00.j(name = "flowCombineTransform")
    @m80.k
    public static final <T1, T2, R> i<R> q(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @yz.b @m80.k x00.r<? super j<? super R>, ? super T1, ? super T2, ? super j00.c<? super g2>, ? extends Object> rVar) {
        return k.K0(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1(new i[]{iVar, iVar2}, null, rVar));
    }

    public static final <T> x00.a<T[]> r() {
        return e.f68089a;
    }

    @m80.k
    public static final <T1, T2, R> i<R> s(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @m80.k x00.q<? super T1, ? super T2, ? super j00.c<? super R>, ? extends Object> qVar) {
        return kotlinx.coroutines.flow.internal.k.b(iVar, iVar2, qVar);
    }
}
