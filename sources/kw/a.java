package kw;

import io.github.aakira.napier.Napier;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class a {
    public boolean a(@k Napier.Level priority, @l String str) {
        g0.p(priority, "priority");
        return true;
    }

    public final void b(@k Napier.Level priority, @l String str, @l Throwable th2, @l String str2) {
        g0.p(priority, "priority");
        if (a(priority, str)) {
            c(priority, str, th2, str2);
        }
    }

    public abstract void c(@k Napier.Level level, @l String str, @l Throwable th2, @l String str2);

    public final void d(@k Napier.Level priority, @l String str, @l Throwable th2, @l String str2) {
        g0.p(priority, "priority");
        c(priority, str, th2, str2);
    }
}
