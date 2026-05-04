package j10;

import a00.r0;
import h10.g;
import h10.r;
import h10.s;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import m80.k;
import w00.j;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "KTypesJvm")
@u0({"SMAP\nKTypesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KTypesJvm.kt\nkotlin/reflect/jvm/KTypesJvm\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n295#2,2:53\n*S KotlinDebug\n*F\n+ 1 KTypesJvm.kt\nkotlin/reflect/jvm/KTypesJvm\n*L\n44#1:53,2\n*E\n"})
/* loaded from: classes8.dex */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    @k
    public static final h10.d<?> a(@k g gVar) {
        p10.b bVar;
        h10.d<?> b11;
        g0.p(gVar, "<this>");
        if (gVar instanceof h10.d) {
            return (h10.d) gVar;
        }
        if (!(gVar instanceof s)) {
            throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + gVar);
        }
        List<r> upperBounds = ((s) gVar).getUpperBounds();
        Iterator<T> it = upperBounds.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            r rVar = (r) next;
            g0.n(rVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            p10.d r11 = ((kotlin.reflect.jvm.internal.r) rVar).D().I0().r();
            bVar = r11 instanceof p10.b ? (p10.b) r11 : null;
            if (bVar != null && bVar.getKind() != ClassKind.INTERFACE && bVar.getKind() != ClassKind.ANNOTATION_CLASS) {
                bVar = next;
                break;
            }
        }
        r rVar2 = (r) bVar;
        if (rVar2 == null) {
            rVar2 = (r) r0.L2(upperBounds);
        }
        return (rVar2 == null || (b11 = b(rVar2)) == null) ? o0.d(Object.class) : b11;
    }

    @k
    public static final h10.d<?> b(@k r rVar) {
        h10.d<?> a11;
        g0.p(rVar, "<this>");
        g m11 = rVar.m();
        if (m11 != null && (a11 = a(m11)) != null) {
            return a11;
        }
        throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + rVar);
    }

    @y0(version = "1.1")
    public static /* synthetic */ void c(r rVar) {
    }
}
