package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.manager.ClientReportClient;

/* loaded from: classes8.dex */
public class en {

    /* renamed from: a, reason: collision with root package name */
    private static volatile en f45479a;

    /* renamed from: a, reason: collision with other field name */
    private Context f345a;

    private en(Context context) {
        this.f345a = context;
    }

    public static en a(Context context) {
        if (f45479a == null) {
            synchronized (en.class) {
                try {
                    if (f45479a == null) {
                        f45479a = new en(context);
                    }
                } finally {
                }
            }
        }
        return f45479a;
    }

    public void b(String str, String str2, String str3, String str4) {
        a(str, str2, str3, PlaybackException.ERROR_CODE_AUDIO_TRACK_INIT_FAILED, System.currentTimeMillis(), str4);
    }

    public void c(String str, String str2, String str3, String str4) {
        a(str, str2, str3, PlaybackException.ERROR_CODE_DECODER_QUERY_FAILED, System.currentTimeMillis(), str4);
    }

    private void a(com.xiaomi.clientreport.data.a aVar) {
        if (aVar instanceof PerfClientReport) {
            ClientReportClient.reportPerf(this.f345a, (PerfClientReport) aVar);
        } else if (aVar instanceof EventClientReport) {
            ClientReportClient.reportEvent(this.f345a, (EventClientReport) aVar);
        }
    }

    public void a(String str, int i11, long j11, long j12) {
        if (i11 < 0 || j12 < 0 || j11 <= 0) {
            return;
        }
        PerfClientReport a11 = em.a(this.f345a, i11, j11, j12);
        a11.setAppPackageName(str);
        a11.setSdkVersion(BuildConfig.VERSION_NAME);
        a(a11);
    }

    public void a(String str, Intent intent, int i11, String str2) {
        if (intent == null) {
            return;
        }
        a(str, em.m5913a(intent.getIntExtra("eventMessageType", -1)), intent.getStringExtra("messageId"), i11, System.currentTimeMillis(), str2);
    }

    public void a(String str, Intent intent, String str2) {
        if (intent == null) {
            return;
        }
        a(str, em.m5913a(intent.getIntExtra("eventMessageType", -1)), intent.getStringExtra("messageId"), PlaybackException.ERROR_CODE_AUDIO_TRACK_INIT_FAILED, System.currentTimeMillis(), str2);
    }

    public void a(String str, String str2, String str3, int i11, long j11, String str4) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        EventClientReport a11 = em.a(this.f345a, str2, str3, i11, j11, str4);
        a11.setAppPackageName(str);
        a11.setSdkVersion(BuildConfig.VERSION_NAME);
        a(a11);
    }

    public void a(String str, String str2, String str3, int i11, String str4) {
        a(str, str2, str3, i11, System.currentTimeMillis(), str4);
    }

    public void a(String str, String str2, String str3, String str4) {
        a(str, str2, str3, PlaybackException.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED, System.currentTimeMillis(), str4);
    }
}
