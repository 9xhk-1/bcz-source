package j10;

import h10.i;
import h10.j;
import h10.n;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import k10.q2;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "KCallablesJvm")
/* loaded from: classes8.dex */
public final class b {
    public static final boolean a(@k h10.c<?> cVar) {
        kotlin.reflect.jvm.internal.calls.a<?> W;
        g0.p(cVar, "<this>");
        if (cVar instanceof h10.j) {
            n nVar = (n) cVar;
            Field e11 = e.e(nVar);
            if (e11 != null ? e11.isAccessible() : true) {
                Method f11 = e.f(nVar);
                if (f11 != null ? f11.isAccessible() : true) {
                    Method h11 = e.h((h10.j) cVar);
                    if (h11 != null ? h11.isAccessible() : true) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (cVar instanceof n) {
            n nVar2 = (n) cVar;
            Field e12 = e.e(nVar2);
            if (e12 != null ? e12.isAccessible() : true) {
                Method f12 = e.f(nVar2);
                if (f12 != null ? f12.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (cVar instanceof n.c) {
            Field e13 = e.e(((n.c) cVar).d0());
            if (e13 != null ? e13.isAccessible() : true) {
                Method g11 = e.g((i) cVar);
                if (g11 != null ? g11.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (cVar instanceof j.a) {
            Field e14 = e.e(((j.a) cVar).d0());
            if (e14 != null ? e14.isAccessible() : true) {
                Method g12 = e.g((i) cVar);
                if (g12 != null ? g12.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (!(cVar instanceof i)) {
            throw new UnsupportedOperationException("Unknown callable: " + cVar + " (" + cVar.getClass() + ')');
        }
        i iVar = (i) cVar;
        Method g13 = e.g(iVar);
        if (g13 != null ? g13.isAccessible() : true) {
            kotlin.reflect.jvm.internal.e<?> b11 = q2.b(cVar);
            Object b12 = (b11 == null || (W = b11.W()) == null) ? null : W.b();
            AccessibleObject accessibleObject = b12 instanceof AccessibleObject ? (AccessibleObject) b12 : null;
            if (accessibleObject != null ? accessibleObject.isAccessible() : true) {
                Constructor c11 = e.c(iVar);
                if (c11 != null ? c11.isAccessible() : true) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void b(@k h10.c<?> cVar, boolean z11) {
        kotlin.reflect.jvm.internal.calls.a<?> W;
        g0.p(cVar, "<this>");
        if (cVar instanceof h10.j) {
            n nVar = (n) cVar;
            Field e11 = e.e(nVar);
            if (e11 != null) {
                e11.setAccessible(z11);
            }
            Method f11 = e.f(nVar);
            if (f11 != null) {
                f11.setAccessible(z11);
            }
            Method h11 = e.h((h10.j) cVar);
            if (h11 != null) {
                h11.setAccessible(z11);
                return;
            }
            return;
        }
        if (cVar instanceof n) {
            n nVar2 = (n) cVar;
            Field e12 = e.e(nVar2);
            if (e12 != null) {
                e12.setAccessible(z11);
            }
            Method f12 = e.f(nVar2);
            if (f12 != null) {
                f12.setAccessible(z11);
                return;
            }
            return;
        }
        if (cVar instanceof n.c) {
            Field e13 = e.e(((n.c) cVar).d0());
            if (e13 != null) {
                e13.setAccessible(z11);
            }
            Method g11 = e.g((i) cVar);
            if (g11 != null) {
                g11.setAccessible(z11);
                return;
            }
            return;
        }
        if (cVar instanceof j.a) {
            Field e14 = e.e(((j.a) cVar).d0());
            if (e14 != null) {
                e14.setAccessible(z11);
            }
            Method g12 = e.g((i) cVar);
            if (g12 != null) {
                g12.setAccessible(z11);
                return;
            }
            return;
        }
        if (!(cVar instanceof i)) {
            throw new UnsupportedOperationException("Unknown callable: " + cVar + " (" + cVar.getClass() + ')');
        }
        i iVar = (i) cVar;
        Method g13 = e.g(iVar);
        if (g13 != null) {
            g13.setAccessible(z11);
        }
        kotlin.reflect.jvm.internal.e<?> b11 = q2.b(cVar);
        Object b12 = (b11 == null || (W = b11.W()) == null) ? null : W.b();
        AccessibleObject accessibleObject = b12 instanceof AccessibleObject ? (AccessibleObject) b12 : null;
        if (accessibleObject != null) {
            accessibleObject.setAccessible(true);
        }
        Constructor c11 = e.c(iVar);
        if (c11 != null) {
            c11.setAccessible(z11);
        }
    }
}
