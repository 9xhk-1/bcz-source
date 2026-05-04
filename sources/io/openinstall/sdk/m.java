package io.openinstall.sdk;

import android.content.Context;
import android.util.Pair;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes8.dex */
public class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinkedBlockingQueue f62623a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f62624b;

    public m(g gVar, LinkedBlockingQueue linkedBlockingQueue) {
        this.f62624b = gVar;
        this.f62623a = linkedBlockingQueue;
    }

    @Override // java.lang.Runnable
    public void run() {
        tz.k kVar;
        Context context;
        tz.k kVar2;
        kVar = this.f62624b.f62609k;
        context = this.f62624b.f62608j;
        kVar.b(context);
        kVar2 = this.f62624b.f62609k;
        this.f62623a.offer(Pair.create("oa", kVar2.a()));
    }
}
