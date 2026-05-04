package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import m80.k;
import p10.h;
import p10.p;
import p10.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface CallableMemberDescriptor extends a, x {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Kind {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean isReal() {
            return this != FAKE_OVERRIDE;
        }
    }

    void T(@k Collection<? extends CallableMemberDescriptor> collection);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a, p10.h
    @k
    CallableMemberDescriptor a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @k
    Collection<? extends CallableMemberDescriptor> e();

    @k
    CallableMemberDescriptor g0(h hVar, Modality modality, p pVar, Kind kind, boolean z11);

    @k
    Kind getKind();
}
