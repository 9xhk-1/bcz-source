package io.ktor.utils.io;

import c40.l2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l0 implements s {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final g f62282a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final l2 f62283b;

    public l0(@m80.k g channel, @m80.k l2 job) {
        kotlin.jvm.internal.g0.p(channel, "channel");
        kotlin.jvm.internal.g0.p(job, "job");
        this.f62282a = channel;
        this.f62283b = job;
    }

    @Override // io.ktor.utils.io.s
    @m80.k
    public l2 a() {
        return this.f62283b;
    }

    @m80.k
    public final g b() {
        return this.f62282a;
    }
}
