package com.xiaomi.mipush.sdk;

/* loaded from: classes6.dex */
class ac implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NotificationClickedActivity f45175a;

    public ac(NotificationClickedActivity notificationClickedActivity) {
        this.f45175a = notificationClickedActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.xiaomi.channel.commonutils.logger.b.e("clicked activity finish by timeout.");
        this.f45175a.finish();
    }
}
