package com.tencent.open.log;

import android.text.format.Time;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.xiaomi.mipush.sdk.Constants;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f44562a = new g();

    public final String a(int i11) {
        return i11 != 1 ? i11 != 2 ? i11 != 4 ? i11 != 8 ? i11 != 16 ? i11 != 32 ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : ExifInterface.GPS_MEASUREMENT_IN_PROGRESS : ExifInterface.LONGITUDE_EAST : ExifInterface.LONGITUDE_WEST : "I" : "D" : ExifInterface.GPS_MEASUREMENT_INTERRUPTED;
    }

    public String a(int i11, Thread thread, long j11, String str, String str2, Throwable th2) {
        long j12 = j11 % 1000;
        Time time = new Time();
        time.set(j11);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a(i11));
        sb2.append('/');
        sb2.append(time.format("%Y-%m-%d %H:%M:%S"));
        sb2.append('.');
        if (j12 < 10) {
            sb2.append(ChipTextInputComboView.b.f32535b);
        } else if (j12 < 100) {
            sb2.append('0');
        }
        sb2.append(j12);
        sb2.append(' ');
        sb2.append('[');
        if (thread == null) {
            sb2.append("N/A");
        } else {
            sb2.append(thread.getName());
        }
        sb2.append(l50.b.f69930l);
        sb2.append('[');
        sb2.append(str);
        sb2.append(l50.b.f69930l);
        sb2.append(' ');
        sb2.append(str2);
        sb2.append('\n');
        if (th2 != null) {
            sb2.append("* Exception : \n");
            sb2.append(Log.getStackTraceString(th2));
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
