package kotlin.reflect.jvm.internal.impl.resolve;

import m80.k;
import m80.l;
import p10.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface ExternalOverridabilityCondition {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Contract {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Result {
        OVERRIDABLE,
        INCOMPATIBLE,
        UNKNOWN
    }

    @k
    Result a(@k kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @k kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, @l b bVar);

    @k
    Contract b();
}
