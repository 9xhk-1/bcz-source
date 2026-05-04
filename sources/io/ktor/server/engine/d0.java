package io.ktor.server.engine;

import c40.n0;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.d;
import org.slf4j.Logger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d0 implements c40.n0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x00.a<Logger> f61341a;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(@m80.k x00.a<? extends Logger> logger) {
        kotlin.jvm.internal.g0.p(logger, "logger");
        this.f61341a = logger;
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    public <R> R fold(R r11, @m80.k x00.p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) n0.a.a(this, r11, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @m80.l
    public <E extends d.b> E get(@m80.k d.c<E> cVar) {
        return (E) n0.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d.b
    @m80.k
    public d.c<?> getKey() {
        return c40.n0.f7891d0;
    }

    @Override // c40.n0
    public void handleException(@m80.k kotlin.coroutines.d context, @m80.k Throwable exception) {
        kotlin.jvm.internal.g0.p(context, "context");
        kotlin.jvm.internal.g0.p(exception, "exception");
        if ((exception instanceof CancellationException) || (exception instanceof IOException)) {
            return;
        }
        Object obj = (c40.q0) context.get(c40.q0.f7924b);
        if (obj == null) {
            obj = context.toString();
        }
        this.f61341a.invoke().error("Unhandled exception caught for " + obj, exception);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @m80.k
    public kotlin.coroutines.d minusKey(@m80.k d.c<?> cVar) {
        return n0.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.d
    @m80.k
    public kotlin.coroutines.d plus(@m80.k kotlin.coroutines.d dVar) {
        return n0.a.d(this, dVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d0(@m80.k final Logger logger) {
        this((x00.a<? extends Logger>) new x00.a() { // from class: io.ktor.server.engine.c0
            @Override // x00.a
            public final Object invoke() {
                Logger c11;
                c11 = d0.c(Logger.this);
                return c11;
            }
        });
        kotlin.jvm.internal.g0.p(logger, "logger");
    }

    public static final Logger c(Logger logger) {
        return logger;
    }
}
