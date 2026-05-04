package b50;

import java.io.File;
import kotlin.jvm.internal.g0;
import y40.c0;
import y40.x;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public static final char f6119a = File.separatorChar;

    @m80.k
    public static final j a(@m80.k String path) {
        g0.p(path, "path");
        return new j(new File(path));
    }

    @w00.j(name = "sink")
    @v0
    @m80.k
    public static final x b(@m80.k j jVar) {
        g0.p(jVar, "<this>");
        return y40.g.a(c.a(e.f6113b, jVar, false, 2, null));
    }

    @w00.j(name = "source")
    @v0
    @m80.k
    public static final c0 c(@m80.k j jVar) {
        g0.p(jVar, "<this>");
        return y40.g.b(e.f6113b.h(jVar));
    }
}
