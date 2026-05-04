package ug;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.baicizhan.client.business.util.Standard_extKt;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.w0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class e {
    @k
    public static final String a(long j11, int i11) {
        if (j11 < 1000) {
            return String.valueOf(j11);
        }
        double d11 = j11 / 1000.0d;
        if (d11 % 1.0d == 0.0d) {
            return ((long) d11) + "K";
        }
        w0 w0Var = w0.f67050a;
        String format = String.format(Locale.US, "%." + i11 + "fK", Arrays.copyOf(new Object[]{Double.valueOf(d11)}, 1));
        g0.o(format, "format(...)");
        return format;
    }

    public static /* synthetic */ String b(long j11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 1;
        }
        return a(j11, i11);
    }

    @k
    public static final String c(long j11, int i11) {
        if (j11 >= 1000000) {
            return e(i11, j11 / 1000000) + "M";
        }
        if (j11 < 1000) {
            return String.valueOf((int) Math.floor(j11));
        }
        return e(i11, j11 / 1000) + "K";
    }

    public static /* synthetic */ String d(long j11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 1;
        }
        return c(j11, i11);
    }

    public static final String e(int i11, double d11) {
        double d12 = 10;
        double floor = Math.floor(d11 * d12) / d12;
        if (floor % 1.0d == 0.0d) {
            return String.valueOf((int) floor);
        }
        String format = String.format("%." + i11 + "f", Arrays.copyOf(new Object[]{Double.valueOf(floor)}, 1));
        g0.o(format, "format(...)");
        return format;
    }

    @k
    public static final String f(long j11, boolean z11) {
        String str;
        String str2;
        long j12 = 60;
        long j13 = (j11 + (z11 ? 60 : 0)) / j12;
        long j14 = 1440;
        long j15 = j13 / j14;
        long j16 = (j13 % j14) / j12;
        long j17 = j13 % j12;
        if (j15 > 0) {
            str2 = j15 + "d";
        } else {
            String str3 = "";
            if (j16 == 0) {
                str = "";
            } else {
                str = j16 + CmcdData.STREAMING_FORMAT_HLS;
            }
            if (j17 != 0) {
                str3 = j17 + "m";
            }
            str2 = str + str3;
        }
        return Standard_extKt.availableWith(str2, "0m");
    }

    public static /* synthetic */ String g(long j11, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return f(j11, z11);
    }
}
