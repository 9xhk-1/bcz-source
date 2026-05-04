package io.openinstall.sdk;

import android.content.Context;
import android.util.Pair;
import io.openinstall.sdk.a;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes8.dex */
public class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinkedBlockingQueue f62621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f62622b;

    public l(g gVar, LinkedBlockingQueue linkedBlockingQueue) {
        this.f62622b = gVar;
        this.f62621a = linkedBlockingQueue;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        context = this.f62622b.f62608j;
        a.C0730a a11 = a.a(context);
        this.f62621a.offer(Pair.create("ga", (a11 == null || a11.b()) ? null : a11.a()));
    }
}
