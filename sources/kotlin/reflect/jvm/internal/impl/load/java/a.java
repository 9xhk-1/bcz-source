package kotlin.reflect.jvm.internal.impl.load.java;

import h20.c0;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.g;
import m80.k;
import m80.l;
import n10.j;
import n20.f;
import u20.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a extends SpecialGenericSignatures {

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final a f67272o = new a();

    public static final boolean l(g gVar, CallableMemberDescriptor it) {
        g0.p(it, "it");
        return SpecialGenericSignatures.f67253a.j().containsKey(c0.d(gVar));
    }

    @l
    public final f j(@k g functionDescriptor) {
        g0.p(functionDescriptor, "functionDescriptor");
        Map<String, f> j11 = SpecialGenericSignatures.f67253a.j();
        String d11 = c0.d(functionDescriptor);
        if (d11 == null) {
            return null;
        }
        return j11.get(d11);
    }

    public final boolean k(@k g functionDescriptor) {
        g0.p(functionDescriptor, "functionDescriptor");
        return j.g0(functionDescriptor) && e.i(functionDescriptor, false, new y10.d(functionDescriptor), 1, null) != null;
    }

    public final boolean m(@k g gVar) {
        g0.p(gVar, "<this>");
        return g0.g(gVar.getName().b(), "removeAt") && g0.g(c0.d(gVar), SpecialGenericSignatures.f67253a.h().d());
    }
}
