package com.baicizhan.main.home.plan.allinone;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.home.plan.allinone.c1;
import javax.inject.Inject;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class HomeRepo implements e1 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f22058b = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final kotlinx.coroutines.flow.y<c1> f22059a = kotlinx.coroutines.flow.o0.a(c1.c.f22146b);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.allinone.HomeRepo$upgrade$1", f = "IHomeRepo.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f22062a;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new a(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super Boolean> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f22062a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            kotlinx.coroutines.flow.i<Boolean> c11 = StudyServiceFXKt.c();
            this.f22062a = 1;
            Object K1 = kotlinx.coroutines.flow.k.K1(c11, this);
            return K1 == l11 ? l11 : K1;
        }
    }

    @Inject
    public HomeRepo() {
    }

    @Override // com.baicizhan.main.home.plan.allinone.e1
    public void a() {
        c40.j.b(null, new a(null), 1, null);
    }

    @Override // com.baicizhan.main.home.plan.allinone.e1
    public void b() {
        c40.j.b(null, new HomeRepo$refresh$1(this, null), 1, null);
    }

    @Override // com.baicizhan.main.home.plan.allinone.e1
    @m80.k
    public kotlinx.coroutines.flow.m0<c1> c() {
        return this.f22059a;
    }
}
