package t3;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class w<T> implements j<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l f89293a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final k<T> f89294b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.base.cache.NormalStorage", f = "IObjectStorage.kt", i = {}, l = {15}, m = ct.d.f46852f, n = {}, s = {}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f89295a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w<T> f89296b;

        /* renamed from: c, reason: collision with root package name */
        public int f89297c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w<T> wVar, j00.c<? super a> cVar) {
            super(cVar);
            this.f89296b = wVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f89295a = obj;
            this.f89297c |= Integer.MIN_VALUE;
            return this.f89296b.b(this);
        }
    }

    public w(@m80.k l storage, @m80.k k<T> serialize) {
        g0.p(storage, "storage");
        g0.p(serialize, "serialize");
        this.f89293a = storage;
        this.f89294b = serialize;
    }

    @Override // t3.j
    @m80.l
    public Object a(@m80.k j00.c<? super g2> cVar) {
        Object a11 = this.f89293a.a(cVar);
        return a11 == kotlin.coroutines.intrinsics.b.l() ? a11 : g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // t3.j
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@m80.k j00.c<? super T> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof t3.w.a
            if (r0 == 0) goto L13
            r0 = r5
            t3.w$a r0 = (t3.w.a) r0
            int r1 = r0.f89297c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89297c = r1
            goto L18
        L13:
            t3.w$a r0 = new t3.w$a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f89295a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f89297c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.e.n(r5)
            t3.l r5 = r4.f89293a
            r0.f89297c = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            byte[] r5 = (byte[]) r5
            if (r5 == 0) goto L4a
            t3.k<T> r0 = r4.f89294b
            java.lang.Object r5 = r0.b(r5)
            return r5
        L4a:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.w.b(j00.c):java.lang.Object");
    }

    @Override // t3.j
    @m80.l
    public Object c(T t11, @m80.k j00.c<? super g2> cVar) {
        Object b11 = this.f89293a.b(this.f89294b.a(t11), cVar);
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
    }
}
