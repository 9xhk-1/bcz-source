package t3;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c<T> extends d<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.base.cache.CacheFirstCache", f = "CacheImpl.kt", i = {1, 2, 3, 3, 4, 4}, l = {65, 66, 69, 70, 71}, m = "doFetch", n = {"data", "data", "data", "remoteData", "data", "remoteData"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f89219a;

        /* renamed from: b, reason: collision with root package name */
        public Object f89220b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f89221c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c<T> f89222d;

        /* renamed from: e, reason: collision with root package name */
        public int f89223e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c<T> cVar, j00.c<? super a> cVar2) {
            super(cVar2);
            this.f89222d = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f89221c = obj;
            this.f89223e |= Integer.MIN_VALUE;
            return this.f89222d.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@m80.k j<T> storage, @m80.k x00.l<? super j00.c<? super T>, ? extends Object> remote, @m80.k h checker) {
        super(storage, remote, checker);
        g0.p(storage, "storage");
        g0.p(remote, "remote");
        g0.p(checker, "checker");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        if (r10 != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0065, code lost:
    
        if (r10 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // t3.d
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k j00.c<? super T> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof t3.c.a
            if (r0 == 0) goto L13
            r0 = r10
            t3.c$a r0 = (t3.c.a) r0
            int r1 = r0.f89223e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89223e = r1
            goto L18
        L13:
            t3.c$a r0 = new t3.c$a
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f89221c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f89223e
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L58
            if (r2 == r7) goto L54
            if (r2 == r6) goto L4e
            if (r2 == r5) goto L48
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r0 = r0.f89220b
            kotlin.e.n(r10)
            return r0
        L37:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3f:
            java.lang.Object r2 = r0.f89220b
            java.lang.Object r4 = r0.f89219a
            kotlin.e.n(r10)
            goto Laf
        L48:
            java.lang.Object r2 = r0.f89219a
            kotlin.e.n(r10)
            goto L98
        L4e:
            java.lang.Object r2 = r0.f89219a
            kotlin.e.n(r10)
            goto L7a
        L54:
            kotlin.e.n(r10)
            goto L68
        L58:
            kotlin.e.n(r10)
            t3.j r10 = r9.i()
            r0.f89223e = r7
            java.lang.Object r10 = r10.b(r0)
            if (r10 != r1) goto L68
            goto Lc3
        L68:
            t3.h r2 = r9.g()
            r0.f89219a = r10
            r0.f89223e = r6
            java.lang.Object r2 = r2.a(r0)
            if (r2 != r1) goto L77
            goto Lc3
        L77:
            r8 = r2
            r2 = r10
            r10 = r8
        L7a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L85
            if (r2 == 0) goto L85
            return r2
        L85:
            x00.l r10 = r9.h()
            java.lang.Object r6 = l00.k.a(r2)
            r0.f89219a = r6
            r0.f89223e = r5
            java.lang.Object r10 = r10.invoke(r0)
            if (r10 != r1) goto L98
            goto Lc3
        L98:
            t3.j r5 = r9.i()
            java.lang.Object r6 = l00.k.a(r2)
            r0.f89219a = r6
            r0.f89220b = r10
            r0.f89223e = r4
            java.lang.Object r4 = r5.c(r10, r0)
            if (r4 != r1) goto Lad
            goto Lc3
        Lad:
            r4 = r2
            r2 = r10
        Laf:
            t3.h r10 = r9.g()
            java.lang.Object r4 = l00.k.a(r4)
            r0.f89219a = r4
            r0.f89220b = r2
            r0.f89223e = r3
            java.lang.Object r10 = r10.b(r0)
            if (r10 != r1) goto Lc4
        Lc3:
            return r1
        Lc4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.c.d(j00.c):java.lang.Object");
    }
}
