package k;

import j.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l.c;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nQueryExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueryExtensions.kt\napp/cash/sqldelight/async/coroutines/QueryExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
/* loaded from: classes3.dex */
public final class e {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "app.cash.sqldelight.async.coroutines.QueryExtensionsKt$awaitAsList$2$1", f = "QueryExtensions.kt", i = {}, l = {14, 15}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a<T> extends SuspendLambda implements l<j00.c<? super List<T>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f64759a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l.c<Boolean> f64760b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<T> f64761c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i<T> f64762d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l.d f64763e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l.c<Boolean> cVar, List<T> list, i<? extends T> iVar, l.d dVar, j00.c<? super a> cVar2) {
            super(1, cVar2);
            this.f64760b = cVar;
            this.f64761c = list;
            this.f64762d = iVar;
            this.f64763e = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return new a(this.f64760b, this.f64761c, this.f64762d, this.f64763e, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super List<T>> cVar) {
            return ((a) create(cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
        
            if (r5 != r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
        
            if (r5 == r0) goto L18;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0057 -> B:6:0x005a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r4.f64759a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r5)
                goto L5a
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.e.n(r5)
                goto L32
            L1e:
                kotlin.e.n(r5)
                l.c<java.lang.Boolean> r5 = r4.f64760b
                l.c$a r5 = (l.c.a) r5
                x00.l r5 = r5.j()
                r4.f64759a = r3
                java.lang.Object r5 = l.c.a.a(r5, r4)
                if (r5 != r0) goto L32
                goto L59
            L32:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L77
                java.util.List<T> r5 = r4.f64761c
                j.i<T> r1 = r4.f64762d
                x00.l r1 = r1.i()
                l.d r3 = r4.f64763e
                java.lang.Object r1 = r1.invoke(r3)
                r5.add(r1)
            L4b:
                l.d r5 = r4.f64763e
                l.c r5 = r5.next()
                r4.f64759a = r2
                java.lang.Object r5 = r5.i(r4)
                if (r5 != r0) goto L5a
            L59:
                return r0
            L5a:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L74
                java.util.List<T> r5 = r4.f64761c
                j.i<T> r1 = r4.f64762d
                x00.l r1 = r1.i()
                l.d r3 = r4.f64763e
                java.lang.Object r1 = r1.invoke(r3)
                r5.add(r1)
                goto L4b
            L74:
                java.util.List<T> r5 = r4.f64761c
                return r5
            L77:
                java.util.List<T> r5 = r4.f64761c
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: k.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "app.cash.sqldelight.async.coroutines.QueryExtensionsKt", f = "QueryExtensions.kt", i = {0}, l = {29}, m = "awaitAsOne", n = {"$this$awaitAsOne"}, s = {"L$0"}, v = 1)
    public static final class b<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f64764a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f64765b;

        /* renamed from: c, reason: collision with root package name */
        public int f64766c;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f64765b = obj;
            this.f64766c |= Integer.MIN_VALUE;
            return e.e(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "app.cash.sqldelight.async.coroutines.QueryExtensionsKt$awaitAsOneOrNull$2$1", f = "QueryExtensions.kt", i = {1}, l = {40, 42}, m = "invokeSuspend", n = {"value"}, s = {"L$0"}, v = 1)
    @u0({"SMAP\nQueryExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueryExtensions.kt\napp/cash/sqldelight/async/coroutines/QueryExtensionsKt$awaitAsOneOrNull$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
    public static final class c<T> extends SuspendLambda implements l<j00.c<? super T>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f64767a;

        /* renamed from: b, reason: collision with root package name */
        public int f64768b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l.c<Boolean> f64769c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i<T> f64770d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l.d f64771e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(l.c<Boolean> cVar, i<? extends T> iVar, l.d dVar, j00.c<? super c> cVar2) {
            super(1, cVar2);
            this.f64769c = cVar;
            this.f64770d = iVar;
            this.f64771e = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return new c(this.f64769c, this.f64770d, this.f64771e, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super T> cVar) {
            return ((c) create(cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:
        
            if (r5 == r0) goto L19;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0067 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r4.f64768b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r4.f64767a
                kotlin.e.n(r5)
                goto L5d
            L14:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1c:
                kotlin.e.n(r5)
                goto L34
            L20:
                kotlin.e.n(r5)
                l.c<java.lang.Boolean> r5 = r4.f64769c
                l.c$a r5 = (l.c.a) r5
                x00.l r5 = r5.j()
                r4.f64768b = r3
                java.lang.Object r5 = l.c.a.a(r5, r4)
                if (r5 != r0) goto L34
                goto L5a
            L34:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 != 0) goto L3e
                r5 = 0
                return r5
            L3e:
                j.i<T> r5 = r4.f64770d
                x00.l r5 = r5.i()
                l.d r1 = r4.f64771e
                java.lang.Object r5 = r5.invoke(r1)
                l.d r1 = r4.f64771e
                l.c r1 = r1.next()
                r4.f64767a = r5
                r4.f64768b = r2
                java.lang.Object r1 = r1.i(r4)
                if (r1 != r0) goto L5b
            L5a:
                return r0
            L5b:
                r0 = r5
                r5 = r1
            L5d:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                j.i<T> r1 = r4.f64770d
                if (r5 != 0) goto L68
                return r0
            L68:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "ResultSet returned more than 1 row for "
                r5.append(r0)
                r5.append(r1)
                java.lang.String r5 = r5.toString()
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r5 = r5.toString()
                r0.<init>(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: k.e.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @m80.l
    public static final <T> Object c(@k final i<? extends T> iVar, @k j00.c<? super List<? extends T>> cVar) {
        return iVar.c(new l() { // from class: k.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                l.c d11;
                d11 = e.d(i.this, (l.d) obj);
                return d11;
            }
        }).i(cVar);
    }

    public static final l.c d(i iVar, l.d cursor) {
        g0.p(cursor, "cursor");
        l.c<Boolean> next = cursor.next();
        ArrayList arrayList = new ArrayList();
        if (next instanceof c.a) {
            return c.a.b(c.a.c(new a(next, arrayList, iVar, cursor, null)));
        }
        if (!(next instanceof c.d)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!((Boolean) ((c.d) next).h()).booleanValue()) {
            return c.d.b(c.d.c(arrayList));
        }
        arrayList.add(iVar.i().invoke(cursor));
        while (cursor.next().getValue().booleanValue()) {
            arrayList.add(iVar.i().invoke(cursor));
        }
        return c.d.b(c.d.c(arrayList));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object e(@m80.k j.i<? extends T> r4, @m80.k j00.c<? super T> r5) {
        /*
            boolean r0 = r5 instanceof k.e.b
            if (r0 == 0) goto L13
            r0 = r5
            k.e$b r0 = (k.e.b) r0
            int r1 = r0.f64766c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f64766c = r1
            goto L18
        L13:
            k.e$b r0 = new k.e$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f64765b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f64766c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f64764a
            j.i r4 = (j.i) r4
            kotlin.e.n(r5)
            goto L43
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e.n(r5)
            r0.f64764a = r4
            r0.f64766c = r3
            java.lang.Object r5 = f(r4, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            if (r5 == 0) goto L46
            return r5
        L46:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ResultSet returned null for "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k.e.e(j.i, j00.c):java.lang.Object");
    }

    @m80.l
    public static final <T> Object f(@k final i<? extends T> iVar, @k j00.c<? super T> cVar) {
        return iVar.c(new l() { // from class: k.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                l.c g11;
                g11 = e.g(i.this, (l.d) obj);
                return g11;
            }
        }).i(cVar);
    }

    public static final l.c g(i iVar, l.d cursor) {
        g0.p(cursor, "cursor");
        l.c<Boolean> next = cursor.next();
        if (next instanceof c.a) {
            return c.a.b(c.a.c(new c(next, iVar, cursor, null)));
        }
        if (!(next instanceof c.d)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!((Boolean) ((c.d) next).h()).booleanValue()) {
            return c.d.b(c.d.c(null));
        }
        Object invoke = iVar.i().invoke(cursor);
        if (!cursor.next().getValue().booleanValue()) {
            return c.d.b(c.d.c(invoke));
        }
        throw new IllegalStateException(("ResultSet returned more than 1 row for " + iVar).toString());
    }
}
