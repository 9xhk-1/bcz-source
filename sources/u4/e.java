package u4;

import h5.a1;
import h5.o0;
import h5.z;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a1 f91750a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final o0 f91751b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final z f91752c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final u8.e f91753d;

    public e(@k a1 streakTasks, @k o0 rank, @k z notification, @l u8.e eVar) {
        g0.p(streakTasks, "streakTasks");
        g0.p(rank, "rank");
        g0.p(notification, "notification");
        this.f91750a = streakTasks;
        this.f91751b = rank;
        this.f91752c = notification;
        this.f91753d = eVar;
    }

    public static /* synthetic */ e f(e eVar, a1 a1Var, o0 o0Var, z zVar, u8.e eVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            a1Var = eVar.f91750a;
        }
        if ((i11 & 2) != 0) {
            o0Var = eVar.f91751b;
        }
        if ((i11 & 4) != 0) {
            zVar = eVar.f91752c;
        }
        if ((i11 & 8) != 0) {
            eVar2 = eVar.f91753d;
        }
        return eVar.e(a1Var, o0Var, zVar, eVar2);
    }

    @k
    public final a1 a() {
        return this.f91750a;
    }

    @k
    public final o0 b() {
        return this.f91751b;
    }

    @k
    public final z c() {
        return this.f91752c;
    }

    @l
    public final u8.e d() {
        return this.f91753d;
    }

    @k
    public final e e(@k a1 streakTasks, @k o0 rank, @k z notification, @l u8.e eVar) {
        g0.p(streakTasks, "streakTasks");
        g0.p(rank, "rank");
        g0.p(notification, "notification");
        return new e(streakTasks, rank, notification, eVar);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return g0.g(this.f91750a, eVar.f91750a) && g0.g(this.f91751b, eVar.f91751b) && g0.g(this.f91752c, eVar.f91752c) && g0.g(this.f91753d, eVar.f91753d);
    }

    @k
    public final z g() {
        return this.f91752c;
    }

    @l
    public final u8.e h() {
        return this.f91753d;
    }

    public int hashCode() {
        int hashCode = ((((this.f91750a.hashCode() * 31) + this.f91751b.hashCode()) * 31) + this.f91752c.hashCode()) * 31;
        u8.e eVar = this.f91753d;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    @k
    public final o0 i() {
        return this.f91751b;
    }

    @k
    public final a1 j() {
        return this.f91750a;
    }

    @k
    public String toString() {
        return "OperationalData(streakTasks=" + this.f91750a + ", rank=" + this.f91751b + ", notification=" + this.f91752c + ", popupSale=" + this.f91753d + ')';
    }
}
