package zl;

import java.util.Collection;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a {
    @l
    public static final <T, R> R a(@l Collection<? extends T> collection, @k x00.l<? super Collection<? extends T>, ? extends R> block) {
        g0.q(block, "block");
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        return block.invoke(collection);
    }
}
