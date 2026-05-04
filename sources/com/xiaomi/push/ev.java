package com.xiaomi.push;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.SystemClock;
import com.xiaomi.push.et;
import com.xiaomi.push.service.XMJobService;

@TargetApi(21)
/* loaded from: classes8.dex */
public class ev implements et.a {

    /* renamed from: a, reason: collision with root package name */
    JobScheduler f45492a;

    /* renamed from: a, reason: collision with other field name */
    Context f363a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f364a = false;

    public ev(Context context) {
        this.f363a = context;
        this.f45492a = (JobScheduler) context.getSystemService("jobscheduler");
    }

    @Override // com.xiaomi.push.et.a
    public void a() {
        this.f364a = false;
        this.f45492a.cancel(1);
    }

    public void a(long j11) {
        JobInfo.Builder builder = new JobInfo.Builder(1, new ComponentName(this.f363a.getPackageName(), XMJobService.class.getName()));
        builder.setMinimumLatency(j11);
        builder.setOverrideDeadline(j11);
        builder.setRequiredNetworkType(1);
        builder.setPersisted(false);
        com.xiaomi.channel.commonutils.logger.b.c("schedule Job = " + builder.build().getId() + " in " + j11);
        this.f45492a.schedule(builder.build());
    }

    @Override // com.xiaomi.push.et.a
    public void a(boolean z11) {
        if (z11 || this.f364a) {
            long b11 = gb.b();
            if (z11) {
                a();
                b11 -= SystemClock.elapsedRealtime() % b11;
            }
            this.f364a = true;
            a(b11);
        }
    }

    @Override // com.xiaomi.push.et.a
    /* renamed from: a */
    public boolean mo5928a() {
        return this.f364a;
    }
}
