package uw;

import c40.h1;
import c40.m0;
import java.io.File;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j {
    @m80.k
    public static final b a(@m80.k File directory, @m80.k m0 dispatcher) {
        g0.p(directory, "directory");
        g0.p(dispatcher, "dispatcher");
        return new d(new h(directory, dispatcher));
    }

    public static /* synthetic */ b b(File file, m0 m0Var, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            m0Var = h1.c();
        }
        return a(file, m0Var);
    }
}
