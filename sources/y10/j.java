package y10;

import a00.r0;
import java.util.Collection;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nClassicBuiltinSpecialProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassicBuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/ClassicBuiltinSpecialProperties\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1#2:37\n1755#3,3:38\n*S KotlinDebug\n*F\n+ 1 ClassicBuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/ClassicBuiltinSpecialProperties\n*L\n33#1:38,3\n*E\n"})
/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final j f99093a = new j();

    public static final boolean c(CallableMemberDescriptor it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return f99093a.d(it);
    }

    @m80.l
    public final String b(@m80.k CallableMemberDescriptor callableMemberDescriptor) {
        n20.f fVar;
        kotlin.jvm.internal.g0.p(callableMemberDescriptor, "<this>");
        n10.j.g0(callableMemberDescriptor);
        CallableMemberDescriptor i11 = u20.e.i(u20.e.w(callableMemberDescriptor), false, i.f99089a, 1, null);
        if (i11 == null || (fVar = g.f99079a.a().get(u20.e.o(i11))) == null) {
            return null;
        }
        return fVar.b();
    }

    public final boolean d(@m80.k CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.jvm.internal.g0.p(callableMemberDescriptor, "callableMemberDescriptor");
        if (g.f99079a.d().contains(callableMemberDescriptor.getName())) {
            return e(callableMemberDescriptor);
        }
        return false;
    }

    public final boolean e(CallableMemberDescriptor callableMemberDescriptor) {
        if (r0.a2(g.f99079a.c(), u20.e.k(callableMemberDescriptor)) && callableMemberDescriptor.g().isEmpty()) {
            return true;
        }
        if (!n10.j.g0(callableMemberDescriptor)) {
            return false;
        }
        Collection<? extends CallableMemberDescriptor> e11 = callableMemberDescriptor.e();
        kotlin.jvm.internal.g0.o(e11, "getOverriddenDescriptors(...)");
        Collection<? extends CallableMemberDescriptor> collection = e11;
        if (collection.isEmpty()) {
            return false;
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            j jVar = f99093a;
            kotlin.jvm.internal.g0.m(callableMemberDescriptor2);
            if (jVar.d(callableMemberDescriptor2)) {
                return true;
            }
        }
        return false;
    }
}
