package io.ktor.util.pipeline;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f62059a;

    public h(@m80.k String name) {
        g0.p(name, "name");
        this.f62059a = name;
    }

    @m80.k
    public final String a() {
        return this.f62059a;
    }

    @m80.k
    public String toString() {
        return "Phase('" + this.f62059a + "')";
    }
}
