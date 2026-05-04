package androidx.navigation;

import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class NamedNavArgumentKt {
    @k
    public static final NamedNavArgument navArgument(@k String name, @k l<? super NavArgumentBuilder, g2> builder) {
        g0.p(name, "name");
        g0.p(builder, "builder");
        NavArgumentBuilder navArgumentBuilder = new NavArgumentBuilder();
        builder.invoke(navArgumentBuilder);
        return new NamedNavArgument(name, navArgumentBuilder.build());
    }
}
