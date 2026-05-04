package kotlinx.coroutines.flow;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b<T> extends f<T> {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final x00.p<e40.i0<? super T>, j00.c<? super g2>, Object> f68096e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", i = {0}, l = {330}, m = "collectTo", n = {"scope"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f68097a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68098b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b<T> f68099c;

        /* renamed from: d, reason: collision with root package name */
        public int f68100d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<T> bVar, j00.c<? super a> cVar) {
            super(cVar);
            this.f68099c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f68098b = obj;
            this.f68100d |= Integer.MIN_VALUE;
            return this.f68099c.i(null, this);
        }
    }

    public /* synthetic */ b(x00.p pVar, kotlin.coroutines.d dVar, int i11, BufferOverflow bufferOverflow, int i12, kotlin.jvm.internal.v vVar) {
        this(pVar, (i12 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : dVar, (i12 & 4) != 0 ? -2 : i11, (i12 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.f, kotlinx.coroutines.flow.internal.d
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(@m80.k e40.i0<? super T> r5, @m80.k j00.c<? super yz.g2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.b.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.b$a r0 = (kotlinx.coroutines.flow.b.a) r0
            int r1 = r0.f68100d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68100d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.b$a r0 = new kotlinx.coroutines.flow.b$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f68098b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f68100d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f68097a
            e40.i0 r5 = (e40.i0) r5
            kotlin.e.n(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.e.n(r6)
            r0.f68097a = r5
            r0.f68100d = r3
            java.lang.Object r6 = super.i(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.o()
            if (r5 == 0) goto L4c
            yz.g2 r5 = yz.g2.f100423a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.b.i(e40.i0, j00.c):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.f, kotlinx.coroutines.flow.internal.d
    @m80.k
    public kotlinx.coroutines.flow.internal.d<T> j(@m80.k kotlin.coroutines.d dVar, int i11, @m80.k BufferOverflow bufferOverflow) {
        return new b(this.f68096e, dVar, i11, bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@m80.k x00.p<? super e40.i0<? super T>, ? super j00.c<? super g2>, ? extends Object> pVar, @m80.k kotlin.coroutines.d dVar, int i11, @m80.k BufferOverflow bufferOverflow) {
        super(pVar, dVar, i11, bufferOverflow);
        this.f68096e = pVar;
    }
}
