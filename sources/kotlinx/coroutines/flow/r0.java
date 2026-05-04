package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r0<T> implements c0<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final c0<T> f68416a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.p<j<? super T>, j00.c<? super g2>, Object> f68417b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", i = {}, l = {412}, m = "collect", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f68418a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r0<T> f68419b;

        /* renamed from: c, reason: collision with root package name */
        public int f68420c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r0<T> r0Var, j00.c<? super a> cVar) {
            super(cVar);
            this.f68419b = r0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f68418a = obj;
            this.f68420c |= Integer.MIN_VALUE;
            return this.f68419b.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r0(@m80.k c0<? extends T> c0Var, @m80.k x00.p<? super j<? super T>, ? super j00.c<? super g2>, ? extends Object> pVar) {
        this.f68416a = c0Var;
        this.f68417b = pVar;
    }

    @Override // kotlinx.coroutines.flow.c0
    @m80.k
    public List<T> a() {
        return this.f68416a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.c0, kotlinx.coroutines.flow.i
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(@m80.k kotlinx.coroutines.flow.j<? super T> r6, @m80.k j00.c<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.r0.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.r0$a r0 = (kotlinx.coroutines.flow.r0.a) r0
            int r1 = r0.f68420c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68420c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.r0$a r0 = new kotlinx.coroutines.flow.r0$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f68418a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f68420c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            kotlin.e.n(r7)
            goto L46
        L31:
            kotlin.e.n(r7)
            kotlinx.coroutines.flow.c0<T> r7 = r5.f68416a
            kotlinx.coroutines.flow.q0 r2 = new kotlinx.coroutines.flow.q0
            x00.p<kotlinx.coroutines.flow.j<? super T>, j00.c<? super yz.g2>, java.lang.Object> r4 = r5.f68417b
            r2.<init>(r6, r4)
            r0.f68420c = r3
            java.lang.Object r6 = r7.collect(r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r0.collect(kotlinx.coroutines.flow.j, j00.c):java.lang.Object");
    }
}
