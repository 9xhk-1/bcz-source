package io.openinstall.sdk;

import android.content.Context;
import android.util.Pair;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes8.dex */
public class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinkedBlockingQueue f62615a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f62616b;

    public i(g gVar, LinkedBlockingQueue linkedBlockingQueue) {
        this.f62616b = gVar;
        this.f62615a = linkedBlockingQueue;
    }

    @Override // java.lang.Runnable
    public void run() {
        tz.g gVar;
        Context context;
        tz.g gVar2;
        gVar = this.f62616b.f62610l;
        context = this.f62616b.f62608j;
        gVar.c(context);
        gVar2 = this.f62616b.f62610l;
        this.f62615a.offer(Pair.create("gR", gVar2.a()));
    }
}
