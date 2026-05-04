package u10;

import a30.v;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j implements v {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final j f91519b = new j();

    @Override // a30.v
    public void a(@m80.k CallableMemberDescriptor descriptor) {
        g0.p(descriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + descriptor);
    }

    @Override // a30.v
    public void b(@m80.k p10.b descriptor, @m80.k List<String> unresolvedSuperClasses) {
        g0.p(descriptor, "descriptor");
        g0.p(unresolvedSuperClasses, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + descriptor.getName() + ", unresolved classes " + unresolvedSuperClasses);
    }
}
