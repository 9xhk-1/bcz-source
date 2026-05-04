package com.baicizhan.main.customview.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import c40.b2;
import c40.c1;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlinx.coroutines.flow.o0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@c1
/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final q f20303a = new q();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final kotlinx.coroutines.flow.y<x00.a<g2>> f20304b = o0.a(new x00.a() { // from class: com.baicizhan.main.customview.compose.p
        @Override // x00.a
        public final Object invoke() {
            g2 d11;
            d11 = q.d();
            return d11;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    public static final int f20305c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.customview.compose.ClickHelper$1", f = "CpseUtils.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f20306a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.main.customview.compose.q$a$a, reason: collision with other inner class name */
        public static final class C0303a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: a, reason: collision with root package name */
            public static final C0303a<T> f20307a = new C0303a<>();

            @Override // kotlinx.coroutines.flow.j
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(x00.a<g2> aVar, j00.c<? super g2> cVar) {
                aVar.invoke();
                return g2.f100423a;
            }
        }

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f20306a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                kotlinx.coroutines.flow.i c02 = kotlinx.coroutines.flow.k.c0(q.f20304b, 300L);
                kotlinx.coroutines.flow.j jVar = C0303a.f20307a;
                this.f20306a = 1;
                if (c02.collect(jVar, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }
    }

    static {
        c40.k.f(b2.f7824a, null, null, new a(null), 3, null);
        f20305c = 8;
    }

    public static final g2 d() {
        return g2.f100423a;
    }

    public final void c(@m80.k x00.a<g2> block) {
        g0.p(block, "block");
        f20304b.setValue(block);
    }
}
