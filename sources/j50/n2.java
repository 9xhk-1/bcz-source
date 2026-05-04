package j50;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nPluginGeneratedSerialDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n+ 2 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n160#2:135\n160#2:139\n1803#3,3:136\n1803#3,3:140\n*S KotlinDebug\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n124#1:135\n125#1:139\n124#1:136,3\n125#1:140,3\n*E\n"})
/* loaded from: classes8.dex */
public final class n2 {
    public static final /* synthetic */ <SD extends h50.f> boolean b(SD sd2, Object obj, x00.l<? super SD, Boolean> typeParamsAreEqual) {
        kotlin.jvm.internal.g0.p(sd2, "<this>");
        kotlin.jvm.internal.g0.p(typeParamsAreEqual, "typeParamsAreEqual");
        if (sd2 == obj) {
            return true;
        }
        kotlin.jvm.internal.g0.y(3, "SD");
        if (!(obj instanceof h50.f)) {
            return false;
        }
        h50.f fVar = (h50.f) obj;
        if (!kotlin.jvm.internal.g0.g(sd2.k(), fVar.k()) || !typeParamsAreEqual.invoke(obj).booleanValue() || sd2.h() != fVar.h()) {
            return false;
        }
        int h11 = sd2.h();
        for (int i11 = 0; i11 < h11; i11++) {
            if (!kotlin.jvm.internal.g0.g(sd2.e(i11).k(), fVar.e(i11).k()) || !kotlin.jvm.internal.g0.g(sd2.e(i11).getKind(), fVar.e(i11).getKind())) {
                return false;
            }
        }
        return true;
    }

    public static final int c(@m80.k h50.f fVar, @m80.k h50.f[] typeParams) {
        kotlin.jvm.internal.g0.p(fVar, "<this>");
        kotlin.jvm.internal.g0.p(typeParams, "typeParams");
        int hashCode = (fVar.k().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable<h50.f> a11 = h50.i.a(fVar);
        Iterator<h50.f> it = a11.iterator();
        int i11 = 1;
        int i12 = 1;
        while (true) {
            int i13 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i14 = i12 * 31;
            String k11 = it.next().k();
            if (k11 != null) {
                i13 = k11.hashCode();
            }
            i12 = i14 + i13;
        }
        Iterator<h50.f> it2 = a11.iterator();
        while (it2.hasNext()) {
            int i15 = i11 * 31;
            h50.m kind = it2.next().getKind();
            i11 = i15 + (kind != null ? kind.hashCode() : 0);
        }
        return (((hashCode * 31) + i12) * 31) + i11;
    }

    @m80.k
    public static final String d(@m80.k final h50.f fVar) {
        kotlin.jvm.internal.g0.p(fVar, "<this>");
        return a00.r0.r3(g10.u.W1(0, fVar.h()), org.junit.jupiter.api.j2.O, fVar.k() + '(', pn.j.f81007d, 0, null, new x00.l() { // from class: j50.m2
            @Override // x00.l
            public final Object invoke(Object obj) {
                CharSequence e11;
                e11 = n2.e(h50.f.this, ((Integer) obj).intValue());
                return e11;
            }
        }, 24, null);
    }

    public static final CharSequence e(h50.f fVar, int i11) {
        return fVar.i(i11) + ": " + fVar.e(i11).k();
    }
}
