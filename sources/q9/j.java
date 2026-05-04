package q9;

import android.app.Application;
import com.baicizhan.client.business.dataset.models.ScheduleRecord;
import com.baicizhan.main.home.experiment.q0;
import k3.r0;
import k3.x2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCompatible.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Compatible.kt\ncom/baicizhan/client/business/managers/CompatibleKt\n+ 2 BizSdk.kt\ncom/baicizhan/app/biz/BizSdk\n+ 3 SdkContext.kt\ncom/baicizhan/app/biz/context/SdkContextKt\n+ 4 Koin.kt\norg/koin/core/Koin\n+ 5 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,48:1\n10#2:49\n43#3:50\n124#4,4:51\n142#5:55\n*S KotlinDebug\n*F\n+ 1 Compatible.kt\ncom/baicizhan/client/business/managers/CompatibleKt\n*L\n17#1:49\n17#1:50\n17#1:51,4\n17#1:55\n*E\n"})
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final c0 f81955a = e0.c(new x00.a() { // from class: q9.i
        @Override // x00.a
        public final Object invoke() {
            r0 e11;
            e11 = j.e();
            return e11;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.client.business.managers.CompatibleKt$compatibleSchedule$1", f = "Compatible.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super ScheduleRecord>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f81956a;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super ScheduleRecord> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f81956a;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    if (!q0.f21394a.b()) {
                        qb.c.b("Compatible", "not gaming, no compatible ScheduleRecord", new Object[0]);
                        return null;
                    }
                    qb.c.q("Compatible", "trying to get a compatible ScheduleRecord...", new Object[0]);
                    r0 d11 = j.d();
                    this.f81956a = 1;
                    obj = d11.t(this);
                    if (obj == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                k3.q0 q0Var = (k3.q0) obj;
                ScheduleRecord scheduleRecord = new ScheduleRecord();
                scheduleRecord.bookId = q0Var.m();
                scheduleRecord.bookName = q0Var.o();
                scheduleRecord.descImage = q0Var.n();
                return scheduleRecord;
            } catch (Exception e11) {
                qb.c.c("Compatible", "", e11);
                return null;
            }
        }
    }

    @m80.l
    public static final ScheduleRecord c() {
        Object b11;
        b11 = c40.j.b(null, new a(null), 1, null);
        return (ScheduleRecord) b11;
    }

    public static final r0 d() {
        return (r0) f81955a.getValue();
    }

    public static final r0 e() {
        Application a11 = pb.a.a();
        g0.o(a11, "getApp(...)");
        dd.h.g(a11);
        return (r0) ((x2) c4.j.f7801a.a().P().h().i(o0.d(r0.class), null, null));
    }
}
