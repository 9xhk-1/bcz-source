package q20;

import java.util.Collection;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class l {
    public abstract void a(@m80.k CallableMemberDescriptor callableMemberDescriptor);

    public abstract void b(@m80.k CallableMemberDescriptor callableMemberDescriptor, @m80.k CallableMemberDescriptor callableMemberDescriptor2);

    public abstract void c(@m80.k CallableMemberDescriptor callableMemberDescriptor, @m80.k CallableMemberDescriptor callableMemberDescriptor2);

    public void d(@m80.k CallableMemberDescriptor member, @m80.k Collection<? extends CallableMemberDescriptor> overridden) {
        g0.p(member, "member");
        g0.p(overridden, "overridden");
        member.T(overridden);
    }
}
