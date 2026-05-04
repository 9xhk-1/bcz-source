package io.ktor.server.engine;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f2 extends Thread {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x00.a<yz.g2> f61370a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final AtomicBoolean f61371b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(@m80.k x00.a<yz.g2> stopFunction) {
        super("KtorShutdownHook");
        kotlin.jvm.internal.g0.p(stopFunction, "stopFunction");
        this.f61370a = stopFunction;
        this.f61371b = new AtomicBoolean(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (this.f61371b.compareAndSet(true, false)) {
            this.f61370a.invoke();
        }
    }
}
