package i50;

import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g {
    @l
    public static final <T> T a(@k f fVar, @k f50.e<? extends T> deserializer, @k x00.a<? extends T> block) {
        g0.p(fVar, "<this>");
        g0.p(deserializer, "deserializer");
        g0.p(block, "block");
        return (deserializer.a().b() || fVar.decodeNotNullMark()) ? block.invoke() : (T) fVar.decodeNull();
    }

    public static final <T> T b(@k f fVar, @k h50.f descriptor, @k x00.l<? super d, ? extends T> block) {
        g0.p(fVar, "<this>");
        g0.p(descriptor, "descriptor");
        g0.p(block, "block");
        d beginStructure = fVar.beginStructure(descriptor);
        T invoke = block.invoke(beginStructure);
        beginStructure.endStructure(descriptor);
        return invoke;
    }
}
