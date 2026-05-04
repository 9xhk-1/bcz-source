package kotlinx.coroutines.flow;

import c40.y1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y1
/* loaded from: classes8.dex */
public abstract class a<T> implements i<T>, c<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", i = {0}, l = {226}, m = "collect", n = {"safeCollector"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.a$a, reason: collision with other inner class name */
    public static final class C0805a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f68090a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68091b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a<T> f68092c;

        /* renamed from: d, reason: collision with root package name */
        public int f68093d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0805a(a<T> aVar, j00.c<? super C0805a> cVar) {
            super(cVar);
            this.f68092c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f68091b = obj;
            this.f68093d |= Integer.MIN_VALUE;
            return this.f68092c.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.i
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(@m80.k kotlinx.coroutines.flow.j<? super T> r6, @m80.k j00.c<? super yz.g2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.a.C0805a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.a$a r0 = (kotlinx.coroutines.flow.a.C0805a) r0
            int r1 = r0.f68093d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68093d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.a$a r0 = new kotlinx.coroutines.flow.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f68091b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f68093d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f68090a
            kotlinx.coroutines.flow.internal.SafeCollector r6 = (kotlinx.coroutines.flow.internal.SafeCollector) r6
            kotlin.e.n(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.e.n(r7)
            kotlinx.coroutines.flow.internal.SafeCollector r7 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlin.coroutines.d r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f68090a = r7     // Catch: java.lang.Throwable -> L55
            r0.f68093d = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.g(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            yz.g2 r6 = yz.g2.f100423a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a.collect(kotlinx.coroutines.flow.j, j00.c):java.lang.Object");
    }

    @m80.l
    public abstract Object g(@m80.k j<? super T> jVar, @m80.k j00.c<? super g2> cVar);
}
