package ho;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.common.base.Preconditions;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f59673a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f59674b;

    /* renamed from: c, reason: collision with root package name */
    public long f59675c;

    /* renamed from: d, reason: collision with root package name */
    public long f59676d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f59677a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f59677a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59677a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59677a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59677a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f59677a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f59677a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f59677a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public n0() {
        this.f59673a = u0.b();
    }

    public static String a(TimeUnit unit) {
        switch (a.f59677a[unit.ordinal()]) {
            case 1:
                return NotificationStyle.NOTIFICATION_STYLE;
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "min";
            case 6:
                return CmcdData.STREAMING_FORMAT_HLS;
            case 7:
                return "d";
            default:
                throw new AssertionError();
        }
    }

    public static TimeUnit b(long nanos) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(nanos, timeUnit2) > 0) {
            return timeUnit;
        }
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        if (timeUnit3.convert(nanos, timeUnit2) > 0) {
            return timeUnit3;
        }
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        if (timeUnit4.convert(nanos, timeUnit2) > 0) {
            return timeUnit4;
        }
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        if (timeUnit5.convert(nanos, timeUnit2) > 0) {
            return timeUnit5;
        }
        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
        if (timeUnit6.convert(nanos, timeUnit2) > 0) {
            return timeUnit6;
        }
        TimeUnit timeUnit7 = TimeUnit.MICROSECONDS;
        return timeUnit7.convert(nanos, timeUnit2) > 0 ? timeUnit7 : timeUnit2;
    }

    public static n0 c() {
        return new n0().k();
    }

    public static n0 d(u0 ticker) {
        return new n0(ticker).k();
    }

    public static n0 e() {
        return new n0();
    }

    public static n0 f(u0 ticker) {
        return new n0(ticker);
    }

    public long g(TimeUnit desiredUnit) {
        return desiredUnit.convert(h(), TimeUnit.NANOSECONDS);
    }

    public final long h() {
        return this.f59674b ? (this.f59673a.a() - this.f59676d) + this.f59675c : this.f59675c;
    }

    public boolean i() {
        return this.f59674b;
    }

    @uo.a
    public n0 j() {
        this.f59675c = 0L;
        this.f59674b = false;
        return this;
    }

    @uo.a
    public n0 k() {
        Preconditions.checkState(!this.f59674b, "This stopwatch is already running.");
        this.f59674b = true;
        this.f59676d = this.f59673a.a();
        return this;
    }

    @uo.a
    public n0 l() {
        long a11 = this.f59673a.a();
        Preconditions.checkState(this.f59674b, "This stopwatch is already stopped.");
        this.f59674b = false;
        this.f59675c += a11 - this.f59676d;
        return this;
    }

    public String toString() {
        long h11 = h();
        TimeUnit b11 = b(h11);
        return h0.c(h11 / TimeUnit.NANOSECONDS.convert(1L, b11)) + " " + a(b11);
    }

    public n0(u0 ticker) {
        this.f59673a = (u0) Preconditions.checkNotNull(ticker, RemoteMessageConst.Notification.TICKER);
    }
}
