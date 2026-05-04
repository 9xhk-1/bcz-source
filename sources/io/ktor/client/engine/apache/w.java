package io.ktor.client.engine.apache;

import c40.l2;
import c40.m0;
import java.util.concurrent.ArrayBlockingQueue;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nReactorLoopDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactorLoopDispatcher.kt\nio/ktor/client/engine/apache/ReactorLoopDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n1#2:51\n*E\n"})
/* loaded from: classes8.dex */
public final class w extends m0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final v f60795a;

    /* renamed from: b, reason: collision with root package name */
    public final int f60796b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final ArrayBlockingQueue<Runnable> f60797c;

    public w(@m80.k v interestController, int i11) {
        g0.p(interestController, "interestController");
        this.f60795a = interestController;
        this.f60796b = i11;
        this.f60797c = new ArrayBlockingQueue<>(i11);
    }

    @Override // c40.m0
    public void dispatch(@m80.k kotlin.coroutines.d context, @m80.k Runnable block) {
        g0.p(context, "context");
        g0.p(block, "block");
        l2 l2Var = (l2) context.get(l2.f7886e0);
        if (l2Var != null && l2Var.isCancelled()) {
            block.run();
            return;
        }
        if (this.f60797c.add(block)) {
            this.f60795a.c();
            return;
        }
        throw new IllegalStateException(("Dispatcher queue of size " + this.f60796b + " is full: " + this.f60797c).toString());
    }

    public final boolean q() {
        return !this.f60797c.isEmpty();
    }

    public final void w() {
        while (true) {
            Runnable poll = this.f60797c.poll();
            if (poll == null) {
                return;
            } else {
                poll.run();
            }
        }
    }
}
