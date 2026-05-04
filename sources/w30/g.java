package w30;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import kotlin.jvm.internal.g0;
import kotlin.time.DurationUnit;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class g extends f {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94776a;

        static {
            int[] iArr = new int[DurationUnit.values().length];
            try {
                iArr[DurationUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DurationUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DurationUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DurationUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DurationUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DurationUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DurationUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f94776a = iArr;
        }
    }

    @y0(version = "1.5")
    @m80.k
    public static final DurationUnit f(char c11, boolean z11) {
        if (!z11) {
            if (c11 == 'D') {
                return DurationUnit.DAYS;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c11);
        }
        if (c11 == 'H') {
            return DurationUnit.HOURS;
        }
        if (c11 == 'M') {
            return DurationUnit.MINUTES;
        }
        if (c11 == 'S') {
            return DurationUnit.SECONDS;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c11);
    }

    @y0(version = "1.5")
    @m80.k
    public static final DurationUnit g(@m80.k String shortName) {
        g0.p(shortName, "shortName");
        int hashCode = shortName.hashCode();
        if (hashCode != 100) {
            if (hashCode != 104) {
                if (hashCode != 109) {
                    if (hashCode != 115) {
                        if (hashCode != 3494) {
                            if (hashCode != 3525) {
                                if (hashCode == 3742 && shortName.equals("us")) {
                                    return DurationUnit.MICROSECONDS;
                                }
                            } else if (shortName.equals(NotificationStyle.NOTIFICATION_STYLE)) {
                                return DurationUnit.NANOSECONDS;
                            }
                        } else if (shortName.equals("ms")) {
                            return DurationUnit.MILLISECONDS;
                        }
                    } else if (shortName.equals("s")) {
                        return DurationUnit.SECONDS;
                    }
                } else if (shortName.equals("m")) {
                    return DurationUnit.MINUTES;
                }
            } else if (shortName.equals(CmcdData.STREAMING_FORMAT_HLS)) {
                return DurationUnit.HOURS;
            }
        } else if (shortName.equals("d")) {
            return DurationUnit.DAYS;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }

    @y0(version = "1.3")
    @m80.k
    public static final String h(@m80.k DurationUnit durationUnit) {
        g0.p(durationUnit, "<this>");
        switch (a.f94776a[durationUnit.ordinal()]) {
            case 1:
                return NotificationStyle.NOTIFICATION_STYLE;
            case 2:
                return "us";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "m";
            case 6:
                return CmcdData.STREAMING_FORMAT_HLS;
            case 7:
                return "d";
            default:
                throw new IllegalStateException(("Unknown unit: " + durationUnit).toString());
        }
    }
}
