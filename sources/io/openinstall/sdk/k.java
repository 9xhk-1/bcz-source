package io.openinstall.sdk;

import android.content.Context;
import android.util.Pair;
import java.util.concurrent.LinkedBlockingQueue;
import tz.b1;

/* loaded from: classes8.dex */
public class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinkedBlockingQueue f62619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f62620b;

    public k(g gVar, LinkedBlockingQueue linkedBlockingQueue) {
        this.f62620b = gVar;
        this.f62619a = linkedBlockingQueue;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        b1 b11 = b1.b();
        context = this.f62620b.f62608j;
        this.f62619a.offer(Pair.create("si", String.valueOf(b11.c(context))));
    }
}
