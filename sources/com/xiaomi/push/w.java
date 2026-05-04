package com.xiaomi.push;

import android.content.Context;
import java.io.File;

/* loaded from: classes8.dex */
final class w extends v {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f46418a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, File file, Runnable runnable) {
        super(context, file, null);
        this.f46418a = runnable;
    }

    @Override // com.xiaomi.push.v
    public void a(Context context) {
        Runnable runnable = this.f46418a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
