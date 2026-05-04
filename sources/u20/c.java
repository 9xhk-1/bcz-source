package u20;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import o30.b;

/* loaded from: classes8.dex */
public class c implements b.d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f91566a;

    public c(boolean z11) {
        this.f91566a = z11;
    }

    @Override // o30.b.d
    public Iterable a(Object obj) {
        Iterable j11;
        j11 = e.j(this.f91566a, (CallableMemberDescriptor) obj);
        return j11;
    }
}
