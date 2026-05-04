package androidx.navigation;

import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class NavOptionsBuilderKt {
    @k
    public static final NavOptions navOptions(@k l<? super NavOptionsBuilder, g2> optionsBuilder) {
        g0.p(optionsBuilder, "optionsBuilder");
        NavOptionsBuilder navOptionsBuilder = new NavOptionsBuilder();
        optionsBuilder.invoke(navOptionsBuilder);
        return navOptionsBuilder.build$navigation_common_release();
    }
}
