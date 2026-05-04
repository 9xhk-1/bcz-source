package com.baicizhan.main.word_book.data.impl;

import c40.r0;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f26552a = "ServiceUtils";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.UtilsKt", f = "Utils.kt", i = {0, 0, 0}, l = {14}, m = "catchForTask", n = {c90.k.f8409a, "error", "task"}, s = {"L$0", "L$1", "L$2"}, v = 1)
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f26553a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26554b;

        /* renamed from: c, reason: collision with root package name */
        public Object f26555c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f26556d;

        /* renamed from: e, reason: collision with root package name */
        public int f26557e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26556d = obj;
            this.f26557e |= Integer.MIN_VALUE;
            Object c11 = c.c(null, null, null, this);
            return c11 == kotlin.coroutines.intrinsics.b.l() ? c11 : Result.m6307boximpl(c11);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.UtilsKt$catchForTask$3", f = "Utils.kt", i = {}, l = {16}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b<T> extends SuspendLambda implements x00.p<r0, j00.c<? super Result<? extends T>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26558a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.l<j00.c<? super T>, Object> f26559b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a<g2> f26560c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(x00.l<? super j00.c<? super T>, ? extends Object> lVar, x00.a<g2> aVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f26559b = lVar;
            this.f26560c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f26559b, this.f26560c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super Result<? extends T>> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m6308constructorimpl;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26558a;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    Result.a aVar = Result.Companion;
                    x00.l<j00.c<? super T>, Object> lVar = this.f26559b;
                    this.f26558a = 1;
                    obj = lVar.invoke(this);
                    if (obj == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                m6308constructorimpl = Result.m6308constructorimpl(obj);
            } catch (Exception e11) {
                qb.c.c(c.f26552a, "catchForTask ", e11);
                this.f26560c.invoke();
                Result.a aVar2 = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(e11));
            }
            return Result.m6307boximpl(m6308constructorimpl);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.UtilsKt$catchForTaskWithoutResult$3", f = "Utils.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: com.baicizhan.main.word_book.data.impl.c$c, reason: collision with other inner class name */
    public static final class C0330c extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26561a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.l<j00.c<? super g2>, Object> f26562b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a<g2> f26563c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0330c(x00.l<? super j00.c<? super g2>, ? extends Object> lVar, x00.a<g2> aVar, j00.c<? super C0330c> cVar) {
            super(2, cVar);
            this.f26562b = lVar;
            this.f26563c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new C0330c(this.f26562b, this.f26563c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((C0330c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26561a;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    x00.l<j00.c<? super g2>, Object> lVar = this.f26562b;
                    this.f26561a = 1;
                    if (lVar.invoke(this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
            } catch (Exception e11) {
                qb.c.c(c.f26552a, "catchForTaskWithoutResult ", e11);
                this.f26563c.invoke();
            }
            return g2.f100423a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(@m80.k kotlin.coroutines.d r4, @m80.k x00.a<yz.g2> r5, @m80.k x00.l<? super j00.c<? super T>, ? extends java.lang.Object> r6, @m80.k j00.c<? super kotlin.Result<? extends T>> r7) {
        /*
            boolean r0 = r7 instanceof com.baicizhan.main.word_book.data.impl.c.a
            if (r0 == 0) goto L13
            r0 = r7
            com.baicizhan.main.word_book.data.impl.c$a r0 = (com.baicizhan.main.word_book.data.impl.c.a) r0
            int r1 = r0.f26557e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26557e = r1
            goto L18
        L13:
            com.baicizhan.main.word_book.data.impl.c$a r0 = new com.baicizhan.main.word_book.data.impl.c$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f26556d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f26557e
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r4 = r0.f26555c
            x00.l r4 = (x00.l) r4
            java.lang.Object r4 = r0.f26554b
            x00.a r4 = (x00.a) r4
            java.lang.Object r4 = r0.f26553a
            kotlin.coroutines.d r4 = (kotlin.coroutines.d) r4
            kotlin.e.n(r7)
            goto L61
        L35:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3d:
            kotlin.e.n(r7)
            com.baicizhan.main.word_book.data.impl.c$b r7 = new com.baicizhan.main.word_book.data.impl.c$b
            r2 = 0
            r7.<init>(r6, r5, r2)
            java.lang.Object r2 = l00.k.a(r4)
            r0.f26553a = r2
            java.lang.Object r5 = l00.k.a(r5)
            r0.f26554b = r5
            java.lang.Object r5 = l00.k.a(r6)
            r0.f26555c = r5
            r0.f26557e = r3
            java.lang.Object r7 = c40.i.h(r4, r7, r0)
            if (r7 != r1) goto L61
            return r1
        L61:
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r4 = r7.m6317unboximpl()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.c.c(kotlin.coroutines.d, x00.a, x00.l, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object d(kotlin.coroutines.d dVar, x00.a aVar, x00.l lVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar = new x00.a() { // from class: com.baicizhan.main.word_book.data.impl.b
                @Override // x00.a
                public final Object invoke() {
                    g2 e11;
                    e11 = c.e();
                    return e11;
                }
            };
        }
        return c(dVar, aVar, lVar, cVar);
    }

    public static final g2 e() {
        return g2.f100423a;
    }

    @m80.l
    public static final Object f(@m80.k kotlin.coroutines.d dVar, @m80.k x00.a<g2> aVar, @m80.k x00.l<? super j00.c<? super g2>, ? extends Object> lVar, @m80.k j00.c<? super g2> cVar) {
        Object h11 = c40.i.h(dVar, new C0330c(lVar, aVar, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    public static /* synthetic */ Object g(kotlin.coroutines.d dVar, x00.a aVar, x00.l lVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar = new x00.a() { // from class: com.baicizhan.main.word_book.data.impl.a
                @Override // x00.a
                public final Object invoke() {
                    g2 h11;
                    h11 = c.h();
                    return h11;
                }
            };
        }
        return f(dVar, aVar, lVar, cVar);
    }

    public static final g2 h() {
        return g2.f100423a;
    }
}
