package aa;

import android.os.SystemClock;
import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import kotlin.jvm.internal.g0;
import m80.k;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class c implements a {

    /* renamed from: b, reason: collision with root package name */
    public static final int f2476b = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final nc.a f2477a;

    @Inject
    public c(@q9.k @k nc.a mem) {
        g0.p(mem, "mem");
        this.f2477a = mem;
    }

    @Override // aa.a
    public void a(long j11) {
        long currentTimeMillis = System.currentTimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j12 = currentTimeMillis - elapsedRealtime;
        this.f2477a.n("time_repo_sys_boot_time", j12);
        this.f2477a.n("time_repo_elapse", elapsedRealtime);
        this.f2477a.n("time_repo_server_time", j11);
        qb.c.i(b.f2472a, "time is trusted from now " + j12 + " " + elapsedRealtime + " , " + j11, new Object[0]);
    }

    @Override // aa.a
    public void b() {
        long j11 = this.f2477a.getLong("time_repo_sys_boot_time", 0L);
        long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        long j12 = j11 - currentTimeMillis;
        qb.c.i(b.f2472a, "check " + j11 + j2.O + currentTimeMillis + j2.O + Math.abs(j12), new Object[0]);
        if (Math.abs(j12) <= 3000) {
            qb.c.i(b.f2472a, "time is still trusted", new Object[0]);
            return;
        }
        this.f2477a.r("time_repo_server_time");
        this.f2477a.r("time_repo_sys_boot_time");
        this.f2477a.r("time_repo_elapse");
        qb.c.d(b.f2472a, "time illegality", new Object[0]);
    }

    @Override // aa.a
    public boolean c() {
        return this.f2477a.getLong("time_repo_sys_boot_time", 0L) != 0;
    }

    @Override // aa.a
    public long currentTimeMillis() {
        long j11 = this.f2477a.getLong("time_repo_sys_boot_time", 0L);
        long j12 = this.f2477a.getLong("time_repo_server_time", 0L);
        long j13 = this.f2477a.getLong("time_repo_elapse", 0L);
        return (j11 == 0 || j12 == 0 || j13 == 0) ? System.currentTimeMillis() : j12 + (SystemClock.elapsedRealtime() - j13);
    }
}
