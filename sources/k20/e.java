package k20;

import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final <M extends GeneratedMessageLite.ExtendableMessage<M>, T> T a(@k GeneratedMessageLite.ExtendableMessage<M> extendableMessage, @k GeneratedMessageLite.f<M, T> extension) {
        g0.p(extendableMessage, "<this>");
        g0.p(extension, "extension");
        if (extendableMessage.hasExtension(extension)) {
            return (T) extendableMessage.getExtension(extension);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final <M extends GeneratedMessageLite.ExtendableMessage<M>, T> T b(@k GeneratedMessageLite.ExtendableMessage<M> extendableMessage, @k GeneratedMessageLite.f<M, List<T>> extension, int i11) {
        g0.p(extendableMessage, "<this>");
        g0.p(extension, "extension");
        if (i11 < extendableMessage.getExtensionCount(extension)) {
            return (T) extendableMessage.getExtension(extension, i11);
        }
        return null;
    }
}
