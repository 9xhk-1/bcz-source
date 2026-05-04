package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,141:1\n1#2:142\n105#3:143\n105#3:144\n105#3:145\n105#3:146\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n19#1:143\n30#1:144\n49#1:145\n81#1:146\n*E\n"})
/* loaded from: classes8.dex */
public final /* synthetic */ class FlowKt__LimitKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {134}, m = "collectWhile", n = {"collector"}, s = {"L$0"})
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f67872a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f67873b;

        /* renamed from: c, reason: collision with root package name */
        public int f67874c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f67873b = obj;
            this.f67874c |= Integer.MIN_VALUE;
            return FlowKt__LimitKt.b(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,108:1\n20#2,5:109\n*E\n"})
    public static final class b<T> implements i<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f67875a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f67876b;

        public b(i iVar, int i11) {
            this.f67875a = iVar;
            this.f67876b = i11;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(j<? super T> jVar, j00.c<? super g2> cVar) {
            Object collect = this.f67875a.collect(new c(new Ref.IntRef(), this.f67876b, jVar), cVar);
            return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<T> implements j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f67877a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f67878b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j<T> f67879c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", i = {}, l = {22}, m = "emit", n = {}, s = {})
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f67880a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c<T> f67881b;

            /* renamed from: c, reason: collision with root package name */
            public int f67882c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(c<? super T> cVar, j00.c<? super a> cVar2) {
                super(cVar2);
                this.f67881b = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f67880a = obj;
                this.f67882c |= Integer.MIN_VALUE;
                return this.f67881b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(Ref.IntRef intRef, int i11, j<? super T> jVar) {
            this.f67877a = intRef;
            this.f67878b = i11;
            this.f67879c = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, j00.c<? super yz.g2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt.c.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.FlowKt__LimitKt$c$a r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt.c.a) r0
                int r1 = r0.f67882c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f67882c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__LimitKt$c$a r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$c$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f67880a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f67882c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.e.n(r7)
                goto L47
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.e.n(r7)
                kotlin.jvm.internal.Ref$IntRef r7 = r5.f67877a
                int r2 = r7.element
                int r4 = r5.f67878b
                if (r2 < r4) goto L4a
                kotlinx.coroutines.flow.j<T> r7 = r5.f67879c
                r0.f67882c = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L47
                return r1
            L47:
                yz.g2 r6 = yz.g2.f100423a
                return r6
            L4a:
                int r2 = r2 + r3
                r7.element = r2
                yz.g2 r6 = yz.g2.f100423a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt.c.emit(java.lang.Object, j00.c):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,108:1\n31#2,10:109\n*E\n"})
    public static final class d<T> implements i<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f67884a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.p f67885b;

        public d(i iVar, x00.p pVar) {
            this.f67884a = iVar;
            this.f67885b = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(j<? super T> jVar, j00.c<? super g2> cVar) {
            Object collect = this.f67884a.collect(new e(new Ref.BooleanRef(), jVar, this.f67885b), cVar);
            return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e<T> implements j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f67886a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j<T> f67887b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.p<T, j00.c<? super Boolean>, Object> f67888c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", i = {1, 1}, l = {34, 35, 37}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f67889a;

            /* renamed from: b, reason: collision with root package name */
            public Object f67890b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f67891c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ e<T> f67892d;

            /* renamed from: e, reason: collision with root package name */
            public int f67893e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(e<? super T> eVar, j00.c<? super a> cVar) {
                super(cVar);
                this.f67892d = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f67891c = obj;
                this.f67893e |= Integer.MIN_VALUE;
                return this.f67892d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e(Ref.BooleanRef booleanRef, j<? super T> jVar, x00.p<? super T, ? super j00.c<? super Boolean>, ? extends Object> pVar) {
            this.f67886a = booleanRef;
            this.f67887b = jVar;
            this.f67888c = pVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // kotlinx.coroutines.flow.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, j00.c<? super yz.g2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt.e.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.FlowKt__LimitKt$e$a r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt.e.a) r0
                int r1 = r0.f67893e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f67893e = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__LimitKt$e$a r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$e$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f67891c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f67893e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                kotlin.e.n(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f67890b
                java.lang.Object r2 = r0.f67889a
                kotlinx.coroutines.flow.FlowKt__LimitKt$e r2 = (kotlinx.coroutines.flow.FlowKt__LimitKt.e) r2
                kotlin.e.n(r8)
                goto L6c
            L41:
                kotlin.e.n(r8)
                goto L59
            L45:
                kotlin.e.n(r8)
                kotlin.jvm.internal.Ref$BooleanRef r8 = r6.f67886a
                boolean r8 = r8.element
                if (r8 == 0) goto L5c
                kotlinx.coroutines.flow.j<T> r8 = r6.f67887b
                r0.f67893e = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L59
                goto L87
            L59:
                yz.g2 r7 = yz.g2.f100423a
                return r7
            L5c:
                x00.p<T, j00.c<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f67888c
                r0.f67889a = r6
                r0.f67890b = r7
                r0.f67893e = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                goto L87
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.Ref$BooleanRef r8 = r2.f67886a
                r8.element = r5
                kotlinx.coroutines.flow.j<T> r8 = r2.f67887b
                r2 = 0
                r0.f67889a = r2
                r0.f67890b = r2
                r0.f67893e = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
            L87:
                return r1
            L88:
                yz.g2 r7 = yz.g2.f100423a
                return r7
            L8b:
                yz.g2 r7 = yz.g2.f100423a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt.e.emit(java.lang.Object, j00.c):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {71}, m = "emitAbort$FlowKt__LimitKt", n = {"ownershipMarker"}, s = {"L$0"})
    public static final class f<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f67894a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f67895b;

        /* renamed from: c, reason: collision with root package name */
        public int f67896c;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f67895b = obj;
            this.f67896c |= Integer.MIN_VALUE;
            return FlowKt__LimitKt.f(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g<T> implements j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f67897a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f67898b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j<T> f67899c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f67900d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", i = {}, l = {59, 61}, m = "emit", n = {}, s = {})
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f67901a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g<T> f67902b;

            /* renamed from: c, reason: collision with root package name */
            public int f67903c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(g<? super T> gVar, j00.c<? super a> cVar) {
                super(cVar);
                this.f67902b = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f67901a = obj;
                this.f67903c |= Integer.MIN_VALUE;
                return this.f67902b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public g(Ref.IntRef intRef, int i11, j<? super T> jVar, Object obj) {
            this.f67897a = intRef;
            this.f67898b = i11;
            this.f67899c = jVar;
            this.f67900d = obj;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
        
            if (r7.emit(r6, r0) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt__LimitKt.f(r7, r6, r2, r0) == r1) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, j00.c<? super yz.g2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt.g.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.FlowKt__LimitKt$g$a r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt.g.a) r0
                int r1 = r0.f67903c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f67903c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__LimitKt$g$a r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$g$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f67901a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f67903c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.e.n(r7)
                goto L61
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                kotlin.e.n(r7)
                goto L51
            L38:
                kotlin.e.n(r7)
                kotlin.jvm.internal.Ref$IntRef r7 = r5.f67897a
                int r2 = r7.element
                int r2 = r2 + r4
                r7.element = r2
                int r7 = r5.f67898b
                if (r2 >= r7) goto L54
                kotlinx.coroutines.flow.j<T> r7 = r5.f67899c
                r0.f67903c = r4
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L51
                goto L60
            L51:
                yz.g2 r6 = yz.g2.f100423a
                return r6
            L54:
                kotlinx.coroutines.flow.j<T> r7 = r5.f67899c
                java.lang.Object r2 = r5.f67900d
                r0.f67903c = r3
                java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt__LimitKt.a(r7, r6, r2, r0)
                if (r6 != r1) goto L61
            L60:
                return r1
            L61:
                yz.g2 r6 = yz.g2.f100423a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt.g.emit(java.lang.Object, j00.c):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@m80.k kotlinx.coroutines.flow.i<? extends T> r4, @m80.k x00.p<? super T, ? super j00.c<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @m80.k j00.c<? super yz.g2> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__LimitKt$a r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt.a) r0
            int r1 = r0.f67874c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67874c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$a r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f67873b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f67874c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f67872a
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1 r4 = (kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1) r4
            kotlin.e.n(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            goto L56
        L2d:
            r5 = move-exception
            goto L4c
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.e.n(r6)
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1 r6 = new kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1
            r6.<init>(r5)
            r0.f67872a = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4a
            r0.f67874c = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4a
            java.lang.Object r4 = r4.collect(r6, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4a
            if (r4 != r1) goto L56
            return r1
        L4a:
            r5 = move-exception
            r4 = r6
        L4c:
            kotlinx.coroutines.flow.internal.o.b(r5, r4)
            kotlin.coroutines.d r4 = r0.getContext()
            c40.n2.z(r4)
        L56:
            yz.g2 r4 = yz.g2.f100423a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt.b(kotlinx.coroutines.flow.i, x00.p, j00.c):java.lang.Object");
    }

    public static final <T> Object c(i<? extends T> iVar, x00.p<? super T, ? super j00.c<? super Boolean>, ? extends Object> pVar, j00.c<? super g2> cVar) {
        FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1 = new FlowKt__LimitKt$collectWhile$collector$1(pVar);
        try {
            kotlin.jvm.internal.d0.e(0);
            iVar.collect(flowKt__LimitKt$collectWhile$collector$1, cVar);
            kotlin.jvm.internal.d0.e(1);
            return g2.f100423a;
        } catch (AbortFlowException e11) {
            kotlinx.coroutines.flow.internal.o.b(e11, flowKt__LimitKt$collectWhile$collector$1);
            kotlin.jvm.internal.d0.e(3);
            throw null;
        }
    }

    @m80.k
    public static final <T> i<T> d(@m80.k i<? extends T> iVar, int i11) {
        if (i11 >= 0) {
            return new b(iVar, i11);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i11).toString());
    }

    @m80.k
    public static final <T> i<T> e(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super Boolean>, ? extends Object> pVar) {
        return new d(iVar, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object f(kotlinx.coroutines.flow.j<? super T> r4, T r5, java.lang.Object r6, j00.c<? super yz.g2> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt.f
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__LimitKt$f r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt.f) r0
            int r1 = r0.f67896c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67896c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$f r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f67895b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f67896c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r6 = r0.f67894a
            kotlin.e.n(r7)
            goto L41
        L33:
            kotlin.e.n(r7)
            r0.f67894a = r6
            r0.f67896c = r3
            java.lang.Object r4 = r4.emit(r5, r0)
            if (r4 != r1) goto L41
            return r1
        L41:
            kotlinx.coroutines.flow.internal.AbortFlowException r4 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt.f(kotlinx.coroutines.flow.j, java.lang.Object, java.lang.Object, j00.c):java.lang.Object");
    }

    @m80.k
    public static final <T> i<T> g(@m80.k i<? extends T> iVar, int i11) {
        if (i11 > 0) {
            return new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(iVar, i11);
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " should be positive").toString());
    }

    @m80.k
    public static final <T> i<T> h(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super Boolean>, ? extends Object> pVar) {
        return new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(iVar, pVar);
    }

    @m80.k
    public static final <T, R> i<R> i(@m80.k i<? extends T> iVar, @yz.b @m80.k x00.q<? super j<? super R>, ? super T, ? super j00.c<? super Boolean>, ? extends Object> qVar) {
        return k.K0(new FlowKt__LimitKt$transformWhile$1(iVar, qVar, null));
    }
}
