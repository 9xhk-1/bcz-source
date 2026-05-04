package y10;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p10.q0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l {
    public static /* synthetic */ void a(int i11) {
        Object[] objArr = new Object[3];
        if (i11 == 1 || i11 == 2) {
            objArr[0] = "companionObject";
        } else if (i11 != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i11 == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i11 == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i11 != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean b(@m80.k CallableMemberDescriptor callableMemberDescriptor) {
        p10.r Q;
        if (callableMemberDescriptor == null) {
            a(3);
        }
        if ((callableMemberDescriptor instanceof q0) && (Q = ((q0) callableMemberDescriptor).Q()) != null && Q.getAnnotations().a0(d0.f99025b)) {
            return true;
        }
        return callableMemberDescriptor.getAnnotations().a0(d0.f99025b);
    }

    public static boolean c(@m80.k p10.h hVar) {
        if (hVar == null) {
            a(1);
        }
        return q20.h.x(hVar) && q20.h.w(hVar.b()) && !d((p10.b) hVar);
    }

    public static boolean d(@m80.k p10.b bVar) {
        if (bVar == null) {
            a(2);
        }
        return n10.e.a(n10.d.f73966a, bVar);
    }

    public static boolean e(@m80.k q0 q0Var) {
        if (q0Var == null) {
            a(0);
        }
        if (q0Var.getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            return false;
        }
        if (c(q0Var.b())) {
            return true;
        }
        return q20.h.x(q0Var.b()) && b(q0Var);
    }
}
