package l50;

import kotlin.NoWhenBranchMatchedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class s1 {
    @j0
    public static final <T> T a(@m80.k k50.a json, @m80.k k50.k element, @m80.k f50.e<? extends T> deserializer) {
        i50.f r0Var;
        kotlin.jvm.internal.g0.p(json, "json");
        kotlin.jvm.internal.g0.p(element, "element");
        kotlin.jvm.internal.g0.p(deserializer, "deserializer");
        if (element instanceof k50.i0) {
            r0Var = new x0(json, (k50.i0) element, null, null, 12, null);
        } else if (element instanceof k50.b) {
            r0Var = new z0(json, (k50.b) element);
        } else {
            if (!(element instanceof k50.b0) && !kotlin.jvm.internal.g0.g(element, k50.f0.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            r0Var = new r0(json, (k50.l0) element, null, 4, null);
        }
        return (T) r0Var.decodeSerializableValue(deserializer);
    }

    public static final <T> T b(@m80.k k50.a aVar, @m80.k String discriminator, @m80.k k50.i0 element, @m80.k f50.e<? extends T> deserializer) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        kotlin.jvm.internal.g0.p(discriminator, "discriminator");
        kotlin.jvm.internal.g0.p(element, "element");
        kotlin.jvm.internal.g0.p(deserializer, "deserializer");
        return (T) new x0(aVar, element, discriminator, deserializer.a()).decodeSerializableValue(deserializer);
    }
}
