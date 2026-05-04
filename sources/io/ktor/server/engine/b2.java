package io.ktor.server.engine;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b2 {
    @m80.k
    public static final String a(@m80.k yz.w<?> wVar) {
        Method g11;
        kotlin.jvm.internal.g0.p(wVar, "<this>");
        h10.i iVar = wVar instanceof h10.i ? (h10.i) wVar : null;
        if (iVar == null || (g11 = j10.e.g(iVar)) == null) {
            return wVar.getClass().getName() + ".invoke";
        }
        Class<?> declaringClass = g11.getDeclaringClass();
        return declaringClass.getName() + '.' + g11.getName();
    }
}
