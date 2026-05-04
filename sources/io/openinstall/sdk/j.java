package io.openinstall.sdk;

import android.util.Pair;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes8.dex */
public class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinkedBlockingQueue f62617a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f62618b;

    public j(g gVar, LinkedBlockingQueue linkedBlockingQueue) {
        this.f62618b = gVar;
        this.f62617a = linkedBlockingQueue;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f62617a.offer(Pair.create("aI", this.f62618b.f91246e.n()));
    }
}
