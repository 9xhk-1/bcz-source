package com.igexin.push.f;

import com.igexin.push.g.j;
import com.igexin.sdk.main.FeedbackImpl;

/* loaded from: classes7.dex */
public class c implements com.igexin.push.f.b.c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f38575a = "com.igexin.push.f.c";

    /* renamed from: c, reason: collision with root package name */
    private static final long f38576c = 3600000;

    /* renamed from: b, reason: collision with root package name */
    public long f38577b = 0;

    @Override // com.igexin.push.f.b.c
    public final void a(long j11) {
        this.f38577b = j11;
    }

    @Override // com.igexin.push.f.b.c
    public final void b() {
        com.igexin.c.a.c.a.a("start cron-keep task", new Object[0]);
        FeedbackImpl.getInstance().clearFeedbackMessage();
        com.igexin.push.core.e.c.a().d();
        com.igexin.push.core.e.c.a().c();
        com.igexin.push.core.a.b.d();
        com.igexin.push.core.a.b.j();
        j.h();
        j.i();
    }

    @Override // com.igexin.push.f.b.c
    public final boolean c() {
        return System.currentTimeMillis() - this.f38577b > 3600000;
    }
}
