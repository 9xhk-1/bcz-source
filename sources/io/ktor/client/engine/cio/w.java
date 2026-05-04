package io.ktor.client.engine.cio;

import a00.h0;
import cx.d0;
import ix.e1;
import ix.q0;
import ix.y0;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import rw.c1;
import rw.d1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nEngineTasks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EngineTasks.kt\nio/ktor/client/engine/cio/EngineTasksKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n1755#2,3:38\n*S KotlinDebug\n*F\n+ 1 EngineTasks.kt\nio/ktor/client/engine/cio/EngineTasksKt\n*L\n22#1:38,3\n*E\n"})
/* loaded from: classes8.dex */
public final class w {
    public static final boolean a(cx.z zVar) {
        d1 d1Var = (d1) zVar.c(c1.f84603a);
        if (d1Var != null) {
            return (d1Var.c() == null && d1Var.e() == null) ? false : true;
        }
        return false;
    }

    public static final boolean b(@m80.k cx.z zVar) {
        g0.p(zVar, "<this>");
        List<q0> Q = h0.Q(zVar.e(), zVar.b().d());
        if (!(Q instanceof Collection) || !Q.isEmpty()) {
            for (q0 q0Var : Q) {
                y0 y0Var = y0.f63006a;
                if (g0.g(q0Var.get(y0Var.v()), "close") || q0Var.contains(y0Var.K0())) {
                    break;
                }
            }
        }
        e1.a aVar = e1.f62753b;
        return !h0.Q(aVar.c(), aVar.d()).contains(zVar.f()) || a(zVar) || d0.j(zVar);
    }
}
