package com.baicizhan.main.activity.mytab.task.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.activity.mytab.task.data.g;
import com.baicizhan.main.activity.mytab.task.data.h;
import javax.inject.Inject;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlinx.coroutines.flow.i;
import m80.k;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final int f18807c = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f18808a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h f18809b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.mytab.task.domain.DoSynUC$invoke$1", f = "DoSynUC.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements q<Object, Object, j00.c<? super Object>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18810a;

        public a(j00.c<? super a> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, Object obj2, j00.c<Object> cVar) {
            return new a(cVar).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f18810a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return new Object();
        }
    }

    @Inject
    public b(@k g achievementRepo, @k h tasksRepo) {
        g0.p(achievementRepo, "achievementRepo");
        g0.p(tasksRepo, "tasksRepo");
        this.f18808a = achievementRepo;
        this.f18809b = tasksRepo;
    }

    @k
    public final i<Object> a() {
        return kotlinx.coroutines.flow.k.I(this.f18808a.a(), this.f18809b.a(), new a(null));
    }
}
