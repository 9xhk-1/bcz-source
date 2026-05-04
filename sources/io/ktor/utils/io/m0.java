package io.ktor.utils.io;

import c40.r0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class m0 implements r0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m f62284a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f62285b;

    public m0(@m80.k m channel, @m80.k kotlin.coroutines.d coroutineContext) {
        kotlin.jvm.internal.g0.p(channel, "channel");
        kotlin.jvm.internal.g0.p(coroutineContext, "coroutineContext");
        this.f62284a = channel;
        this.f62285b = coroutineContext;
    }

    @m80.k
    public final m a() {
        return this.f62284a;
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f62285b;
    }
}
