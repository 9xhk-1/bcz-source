package f00;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import o00.f;
import w00.j;
import x00.l;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "TimersKt")
/* loaded from: classes8.dex */
public final class c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n*L\n1#1,148:1\n*E\n"})
    public static final class a extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<TimerTask, g2> f50344a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super TimerTask, g2> lVar) {
            this.f50344a = lVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f50344a.invoke(this);
        }
    }

    @f
    public static final Timer a(String str, boolean z11, long j11, long j12, l<? super TimerTask, g2> action) {
        g0.p(action, "action");
        Timer k11 = k(str, z11);
        k11.scheduleAtFixedRate(new a(action), j11, j12);
        return k11;
    }

    @f
    public static final Timer b(String str, boolean z11, Date startAt, long j11, l<? super TimerTask, g2> action) {
        g0.p(startAt, "startAt");
        g0.p(action, "action");
        Timer k11 = k(str, z11);
        k11.scheduleAtFixedRate(new a(action), startAt, j11);
        return k11;
    }

    public static /* synthetic */ Timer c(String str, boolean z11, long j11, long j12, l action, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            j11 = 0;
        }
        g0.p(action, "action");
        Timer k11 = k(str, z11);
        k11.scheduleAtFixedRate(new a(action), j11, j12);
        return k11;
    }

    public static /* synthetic */ Timer d(String str, boolean z11, Date startAt, long j11, l action, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        g0.p(startAt, "startAt");
        g0.p(action, "action");
        Timer k11 = k(str, z11);
        k11.scheduleAtFixedRate(new a(action), startAt, j11);
        return k11;
    }

    @f
    public static final TimerTask e(Timer timer, long j11, long j12, l<? super TimerTask, g2> action) {
        g0.p(timer, "<this>");
        g0.p(action, "action");
        a aVar = new a(action);
        timer.schedule(aVar, j11, j12);
        return aVar;
    }

    @f
    public static final TimerTask f(Timer timer, long j11, l<? super TimerTask, g2> action) {
        g0.p(timer, "<this>");
        g0.p(action, "action");
        a aVar = new a(action);
        timer.schedule(aVar, j11);
        return aVar;
    }

    @f
    public static final TimerTask g(Timer timer, Date time, long j11, l<? super TimerTask, g2> action) {
        g0.p(timer, "<this>");
        g0.p(time, "time");
        g0.p(action, "action");
        a aVar = new a(action);
        timer.schedule(aVar, time, j11);
        return aVar;
    }

    @f
    public static final TimerTask h(Timer timer, Date time, l<? super TimerTask, g2> action) {
        g0.p(timer, "<this>");
        g0.p(time, "time");
        g0.p(action, "action");
        a aVar = new a(action);
        timer.schedule(aVar, time);
        return aVar;
    }

    @f
    public static final TimerTask i(Timer timer, long j11, long j12, l<? super TimerTask, g2> action) {
        g0.p(timer, "<this>");
        g0.p(action, "action");
        a aVar = new a(action);
        timer.scheduleAtFixedRate(aVar, j11, j12);
        return aVar;
    }

    @f
    public static final TimerTask j(Timer timer, Date time, long j11, l<? super TimerTask, g2> action) {
        g0.p(timer, "<this>");
        g0.p(time, "time");
        g0.p(action, "action");
        a aVar = new a(action);
        timer.scheduleAtFixedRate(aVar, time, j11);
        return aVar;
    }

    @v0
    @k
    public static final Timer k(@m80.l String str, boolean z11) {
        return str == null ? new Timer(z11) : new Timer(str, z11);
    }

    @f
    public static final Timer l(String str, boolean z11, long j11, long j12, l<? super TimerTask, g2> action) {
        g0.p(action, "action");
        Timer k11 = k(str, z11);
        k11.schedule(new a(action), j11, j12);
        return k11;
    }

    @f
    public static final Timer m(String str, boolean z11, Date startAt, long j11, l<? super TimerTask, g2> action) {
        g0.p(startAt, "startAt");
        g0.p(action, "action");
        Timer k11 = k(str, z11);
        k11.schedule(new a(action), startAt, j11);
        return k11;
    }

    public static /* synthetic */ Timer n(String str, boolean z11, long j11, long j12, l action, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            j11 = 0;
        }
        g0.p(action, "action");
        Timer k11 = k(str, z11);
        k11.schedule(new a(action), j11, j12);
        return k11;
    }

    public static /* synthetic */ Timer o(String str, boolean z11, Date startAt, long j11, l action, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        g0.p(startAt, "startAt");
        g0.p(action, "action");
        Timer k11 = k(str, z11);
        k11.schedule(new a(action), startAt, j11);
        return k11;
    }

    @f
    public static final TimerTask p(l<? super TimerTask, g2> action) {
        g0.p(action, "action");
        return new a(action);
    }
}
