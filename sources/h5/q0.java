package h5;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final z8.j f58428a;

    /* renamed from: b, reason: collision with root package name */
    public final long f58429b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<r0> f58430c;

    public q0(@m80.k z8.j dailyTask, long j11, @m80.k List<r0> taskChanges) {
        kotlin.jvm.internal.g0.p(dailyTask, "dailyTask");
        kotlin.jvm.internal.g0.p(taskChanges, "taskChanges");
        this.f58428a = dailyTask;
        this.f58429b = j11;
        this.f58430c = taskChanges;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ q0 e(q0 q0Var, z8.j jVar, long j11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            jVar = q0Var.f58428a;
        }
        if ((i11 & 2) != 0) {
            j11 = q0Var.f58429b;
        }
        if ((i11 & 4) != 0) {
            list = q0Var.f58430c;
        }
        return q0Var.d(jVar, j11, list);
    }

    @m80.k
    public final z8.j a() {
        return this.f58428a;
    }

    public final long b() {
        return this.f58429b;
    }

    @m80.k
    public final List<r0> c() {
        return this.f58430c;
    }

    @m80.k
    public final q0 d(@m80.k z8.j dailyTask, long j11, @m80.k List<r0> taskChanges) {
        kotlin.jvm.internal.g0.p(dailyTask, "dailyTask");
        kotlin.jvm.internal.g0.p(taskChanges, "taskChanges");
        return new q0(dailyTask, j11, taskChanges);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return kotlin.jvm.internal.g0.g(this.f58428a, q0Var.f58428a) && this.f58429b == q0Var.f58429b && kotlin.jvm.internal.g0.g(this.f58430c, q0Var.f58430c);
    }

    @m80.k
    public final z8.j f() {
        return this.f58428a;
    }

    @m80.k
    public final List<r0> g() {
        return this.f58430c;
    }

    public final long h() {
        return this.f58429b;
    }

    public int hashCode() {
        return (((this.f58428a.hashCode() * 31) + Long.hashCode(this.f58429b)) * 31) + this.f58430c.hashCode();
    }

    @m80.k
    public String toString() {
        return "TaskPopupModel(dailyTask=" + this.f58428a + ", taskUpdateAt=" + this.f58429b + ", taskChanges=" + this.f58430c + ')';
    }
}
