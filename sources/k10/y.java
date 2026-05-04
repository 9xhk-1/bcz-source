package k10;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* loaded from: classes8.dex */
public class y implements x00.a {

    /* renamed from: a, reason: collision with root package name */
    public final CallableMemberDescriptor f65011a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65012b;

    public y(CallableMemberDescriptor callableMemberDescriptor, int i11) {
        this.f65011a = callableMemberDescriptor;
        this.f65012b = i11;
    }

    @Override // x00.a
    public Object invoke() {
        p10.o0 s11;
        s11 = kotlin.reflect.jvm.internal.e.s(this.f65011a, this.f65012b);
        return s11;
    }
}
