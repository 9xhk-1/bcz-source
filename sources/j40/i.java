package j40;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import g10.u;
import h40.a1;
import h40.c1;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final String f63195a = a1.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public static final long f63196b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public static final int f63197c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public static final int f63198d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public static final long f63199e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static f f63200f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f63201g = false;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f63202h = true;

    static {
        long f11;
        int e11;
        int e12;
        long f12;
        f11 = c1.f("kotlinx.coroutines.scheduler.resolution.ns", SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, 0L, 0L, 12, null);
        f63196b = f11;
        e11 = c1.e("kotlinx.coroutines.scheduler.core.pool.size", u.u(a1.a(), 2), 1, 0, 8, null);
        f63197c = e11;
        e12 = c1.e("kotlinx.coroutines.scheduler.max.pool.size", CoroutineScheduler.f68462v, 0, CoroutineScheduler.f68462v, 4, null);
        f63198d = e12;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f12 = c1.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f63199e = timeUnit.toNanos(f12);
        f63200f = d.f63186a;
    }

    @m80.k
    public static final g b(@m80.k Runnable runnable, long j11, boolean z11) {
        return new h(runnable, j11, z11);
    }

    public static final boolean c(@m80.k g gVar) {
        return gVar.f63193b;
    }

    public static final String d(boolean z11) {
        return z11 ? "Blocking" : "Non-blocking";
    }
}
