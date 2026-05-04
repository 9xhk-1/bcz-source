package q20;

import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class k extends l {
    @Override // q20.l
    public void b(@m80.k CallableMemberDescriptor first, @m80.k CallableMemberDescriptor second) {
        g0.p(first, "first");
        g0.p(second, "second");
        e(first, second);
    }

    @Override // q20.l
    public void c(@m80.k CallableMemberDescriptor fromSuper, @m80.k CallableMemberDescriptor fromCurrent) {
        g0.p(fromSuper, "fromSuper");
        g0.p(fromCurrent, "fromCurrent");
        e(fromSuper, fromCurrent);
    }

    public abstract void e(@m80.k CallableMemberDescriptor callableMemberDescriptor, @m80.k CallableMemberDescriptor callableMemberDescriptor2);
}
