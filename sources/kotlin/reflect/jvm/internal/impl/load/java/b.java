package kotlin.reflect.jvm.internal.impl.load.java;

import a00.r0;
import h20.c0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import m80.k;
import m80.l;
import n20.f;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nspecialBuiltinMembers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 specialBuiltinMembers.kt\norg/jetbrains/kotlin/load/java/BuiltinMethodsWithSpecialGenericSignature\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
/* loaded from: classes8.dex */
public final class b extends SpecialGenericSignatures {

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final b f67273o = new b();

    @l
    @o
    public static final e l(@k e functionDescriptor) {
        g0.p(functionDescriptor, "functionDescriptor");
        b bVar = f67273o;
        f name = functionDescriptor.getName();
        g0.o(name, "getName(...)");
        if (bVar.n(name)) {
            return (e) u20.e.i(functionDescriptor, false, y10.e.f99029a, 1, null);
        }
        return null;
    }

    public static final boolean m(CallableMemberDescriptor it) {
        g0.p(it, "it");
        return f67273o.k(it);
    }

    @l
    @o
    public static final SpecialGenericSignatures.SpecialSignatureInfo o(@k CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor i11;
        String d11;
        g0.p(callableMemberDescriptor, "<this>");
        SpecialGenericSignatures.a aVar = SpecialGenericSignatures.f67253a;
        if (!aVar.d().contains(callableMemberDescriptor.getName()) || (i11 = u20.e.i(callableMemberDescriptor, false, y10.f.f99053a, 1, null)) == null || (d11 = c0.d(i11)) == null) {
            return null;
        }
        return aVar.l(d11);
    }

    public static final boolean p(CallableMemberDescriptor it) {
        g0.p(it, "it");
        return (it instanceof e) && f67273o.k(it);
    }

    public final boolean k(CallableMemberDescriptor callableMemberDescriptor) {
        return r0.a2(SpecialGenericSignatures.f67253a.e(), c0.d(callableMemberDescriptor));
    }

    public final boolean n(@k f fVar) {
        g0.p(fVar, "<this>");
        return SpecialGenericSignatures.f67253a.d().contains(fVar);
    }
}
