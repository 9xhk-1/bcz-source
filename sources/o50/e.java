package o50;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@m80.k String msg) {
        super(msg);
        g0.p(msg, "msg");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(@m80.k h10.d<?> baseClass, @m80.k h10.d<?> concreteClass) {
        this("Serializer for " + concreteClass + " already registered in the scope of " + baseClass);
        g0.p(baseClass, "baseClass");
        g0.p(concreteClass, "concreteClass");
    }
}
