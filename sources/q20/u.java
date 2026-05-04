package q20;

import java.util.Collection;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class u {
    @m80.k
    public static final CallableMemberDescriptor a(@m80.k Collection<? extends CallableMemberDescriptor> descriptors) {
        Integer d11;
        g0.p(descriptors, "descriptors");
        descriptors.isEmpty();
        CallableMemberDescriptor callableMemberDescriptor = null;
        for (CallableMemberDescriptor callableMemberDescriptor2 : descriptors) {
            if (callableMemberDescriptor == null || ((d11 = p10.o.d(callableMemberDescriptor.getVisibility(), callableMemberDescriptor2.getVisibility())) != null && d11.intValue() < 0)) {
                callableMemberDescriptor = callableMemberDescriptor2;
            }
        }
        g0.m(callableMemberDescriptor);
        return callableMemberDescriptor;
    }
}
