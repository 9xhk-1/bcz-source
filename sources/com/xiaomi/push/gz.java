package com.xiaomi.push;

import com.xiaomi.push.am;

/* loaded from: classes8.dex */
final class gz extends am.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f45702a;

    public gz(Runnable runnable) {
        this.f45702a = runnable;
    }

    @Override // com.xiaomi.push.am.b
    public void b() {
        this.f45702a.run();
    }
}
