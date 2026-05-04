package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g<T> implements i<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final i<T> f68134a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final x00.l<T, Object> f68135b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final x00.p<Object, Object, Boolean> f68136c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> implements j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g<T> f68137a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<Object> f68138b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j<T> f68139c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", i = {}, l = {73}, m = "emit", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.g$a$a, reason: collision with other inner class name */
        public static final class C0807a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f68140a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a<T> f68141b;

            /* renamed from: c, reason: collision with root package name */
            public int f68142c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0807a(a<? super T> aVar, j00.c<? super C0807a> cVar) {
                super(cVar);
                this.f68141b = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f68140a = obj;
                this.f68142c |= Integer.MIN_VALUE;
                return this.f68141b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(g<T> gVar, Ref.ObjectRef<Object> objectRef, j<? super T> jVar) {
            this.f68137a = gVar;
            this.f68138b = objectRef;
            this.f68139c = jVar;
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
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.g.a.C0807a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.g$a$a r0 = (kotlinx.coroutines.flow.g.a.C0807a) r0
                int r1 = r0.f68142c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f68142c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.g$a$a r0 = new kotlinx.coroutines.flow.g$a$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f68140a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f68142c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.e.n(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.e.n(r7)
                kotlinx.coroutines.flow.g<T> r7 = r5.f68137a
                x00.l<T, java.lang.Object> r7 = r7.f68135b
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r2 = r5.f68138b
                T r2 = r2.element
                h40.x0 r4 = kotlinx.coroutines.flow.internal.s.f68282a
                if (r2 == r4) goto L58
                kotlinx.coroutines.flow.g<T> r4 = r5.f68137a
                x00.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f68136c
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                yz.g2 r6 = yz.g2.f100423a
                return r6
            L58:
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r2 = r5.f68138b
                r2.element = r7
                kotlinx.coroutines.flow.j<T> r7 = r5.f68139c
                r0.f68142c = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                yz.g2 r6 = yz.g2.f100423a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.g.a.emit(java.lang.Object, j00.c):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@m80.k i<? extends T> iVar, @m80.k x00.l<? super T, ? extends Object> lVar, @m80.k x00.p<Object, Object, Boolean> pVar) {
        this.f68134a = iVar;
        this.f68135b = lVar;
        this.f68136c = pVar;
    }

    @Override // kotlinx.coroutines.flow.i
    @m80.l
    public Object collect(@m80.k j<? super T> jVar, @m80.k j00.c<? super g2> cVar) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) kotlinx.coroutines.flow.internal.s.f68282a;
        Object collect = this.f68134a.collect(new a(this, objectRef, jVar), cVar);
        return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
    }
}
