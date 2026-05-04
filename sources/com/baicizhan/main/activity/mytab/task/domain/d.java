package com.baicizhan.main.activity.mytab.task.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.TimeUtil;
import com.baicizhan.main.activity.mytab.task.data.h;
import javax.inject.Inject;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlinx.coroutines.flow.i;
import m80.k;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final int f18813b = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h f18814a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.mytab.task.domain.GetCoinTasksCenter$invoke$1", f = "GetCoinTasksCenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements r<com.baicizhan.main.activity.mytab.task.data.f, Integer, Integer, j00.c<? super le.a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18815a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18816b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ int f18817c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ int f18818d;

        public a(j00.c<? super a> cVar) {
            super(4, cVar);
        }

        public final Object i(com.baicizhan.main.activity.mytab.task.data.f fVar, int i11, int i12, j00.c<? super le.a> cVar) {
            a aVar = new a(cVar);
            aVar.f18816b = fVar;
            aVar.f18817c = i11;
            aVar.f18818d = i12;
            return aVar.invokeSuspend(g2.f100423a);
        }

        @Override // x00.r
        public /* bridge */ /* synthetic */ Object invoke(com.baicizhan.main.activity.mytab.task.data.f fVar, Integer num, Integer num2, j00.c<? super le.a> cVar) {
            return i(fVar, num.intValue(), num2.intValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.baicizhan.main.activity.mytab.task.data.f fVar = (com.baicizhan.main.activity.mytab.task.data.f) this.f18816b;
            int i11 = this.f18817c;
            int i12 = this.f18818d;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f18815a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return e.a(fVar, i11, i12, TimeUtil.todayStart() == TimeUtil.getStartOfDay(fVar.p()));
        }
    }

    @Inject
    public d(@k h tasksRepository) {
        g0.p(tasksRepository, "tasksRepository");
        this.f18814a = tasksRepository;
    }

    @k
    public final h a() {
        return this.f18814a;
    }

    @k
    public final i<le.a> b() {
        return kotlinx.coroutines.flow.k.H(this.f18814a.d(), this.f18814a.f(), this.f18814a.b(), new a(null));
    }
}
