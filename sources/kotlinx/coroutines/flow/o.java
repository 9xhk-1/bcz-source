package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final /* synthetic */ class o {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {13}, m = "count", n = {"i"}, s = {"L$0"})
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f68334a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68335b;

        /* renamed from: c, reason: collision with root package name */
        public int f68336c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f68335b = obj;
            this.f68336c |= Integer.MIN_VALUE;
            return k.a0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> implements j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f68337a;

        public b(Ref.IntRef intRef) {
            this.f68337a = intRef;
        }

        @Override // kotlinx.coroutines.flow.j
        public final Object emit(T t11, j00.c<? super g2> cVar) {
            this.f68337a.element++;
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {25}, m = "count", n = {"i"}, s = {"L$0"})
    public static final class c<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f68338a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68339b;

        /* renamed from: c, reason: collision with root package name */
        public int f68340c;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f68339b = obj;
            this.f68340c |= Integer.MIN_VALUE;
            return k.b0(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d<T> implements j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.p<T, j00.c<? super Boolean>, Object> f68341a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f68342b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.flow.FlowKt__CountKt$count$4", f = "Count.kt", i = {0}, l = {26}, m = "emit", n = {"this"}, s = {"L$0"})
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f68343a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f68344b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d<T> f68345c;

            /* renamed from: d, reason: collision with root package name */
            public int f68346d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(d<? super T> dVar, j00.c<? super a> cVar) {
                super(cVar);
                this.f68345c = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f68344b = obj;
                this.f68346d |= Integer.MIN_VALUE;
                return this.f68345c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(x00.p<? super T, ? super j00.c<? super Boolean>, ? extends Object> pVar, Ref.IntRef intRef) {
            this.f68341a = pVar;
            this.f68342b = intRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r5, j00.c<? super yz.g2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.o.d.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.o$d$a r0 = (kotlinx.coroutines.flow.o.d.a) r0
                int r1 = r0.f68346d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f68346d = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.o$d$a r0 = new kotlinx.coroutines.flow.o$d$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f68344b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f68346d
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.f68343a
                kotlinx.coroutines.flow.o$d r5 = (kotlinx.coroutines.flow.o.d) r5
                kotlin.e.n(r6)
                goto L46
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L35:
                kotlin.e.n(r6)
                x00.p<T, j00.c<? super java.lang.Boolean>, java.lang.Object> r6 = r4.f68341a
                r0.f68343a = r4
                r0.f68346d = r3
                java.lang.Object r6 = r6.invoke(r5, r0)
                if (r6 != r1) goto L45
                return r1
            L45:
                r5 = r4
            L46:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L55
                kotlin.jvm.internal.Ref$IntRef r5 = r5.f68342b
                int r6 = r5.element
                int r6 = r6 + r3
                r5.element = r6
            L55:
                yz.g2 r5 = yz.g2.f100423a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.o.d.emit(java.lang.Object, j00.c):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object a(@m80.k kotlinx.coroutines.flow.i<? extends T> r4, @m80.k j00.c<? super java.lang.Integer> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.o.a
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.o$a r0 = (kotlinx.coroutines.flow.o.a) r0
            int r1 = r0.f68336c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68336c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.o$a r0 = new kotlinx.coroutines.flow.o$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f68335b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f68336c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f68334a
            kotlin.jvm.internal.Ref$IntRef r4 = (kotlin.jvm.internal.Ref.IntRef) r4
            kotlin.e.n(r5)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e.n(r5)
            kotlin.jvm.internal.Ref$IntRef r5 = new kotlin.jvm.internal.Ref$IntRef
            r5.<init>()
            kotlinx.coroutines.flow.o$b r2 = new kotlinx.coroutines.flow.o$b
            r2.<init>(r5)
            r0.f68334a = r5
            r0.f68336c = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L4d
            return r1
        L4d:
            r4 = r5
        L4e:
            int r4 = r4.element
            java.lang.Integer r4 = l00.a.f(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.o.a(kotlinx.coroutines.flow.i, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@m80.k kotlinx.coroutines.flow.i<? extends T> r4, @m80.k x00.p<? super T, ? super j00.c<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @m80.k j00.c<? super java.lang.Integer> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.o.c
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.o$c r0 = (kotlinx.coroutines.flow.o.c) r0
            int r1 = r0.f68340c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68340c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.o$c r0 = new kotlinx.coroutines.flow.o$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f68339b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f68340c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f68338a
            kotlin.jvm.internal.Ref$IntRef r4 = (kotlin.jvm.internal.Ref.IntRef) r4
            kotlin.e.n(r6)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e.n(r6)
            kotlin.jvm.internal.Ref$IntRef r6 = new kotlin.jvm.internal.Ref$IntRef
            r6.<init>()
            kotlinx.coroutines.flow.o$d r2 = new kotlinx.coroutines.flow.o$d
            r2.<init>(r5, r6)
            r0.f68338a = r6
            r0.f68340c = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L4d
            return r1
        L4d:
            r4 = r6
        L4e:
            int r4 = r4.element
            java.lang.Integer r4 = l00.a.f(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.o.b(kotlinx.coroutines.flow.i, x00.p, j00.c):java.lang.Object");
    }
}
