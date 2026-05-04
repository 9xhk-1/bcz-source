package androidx.navigation;

import a00.l1;
import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import h10.d;
import h10.r;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class NavDeepLinkDslBuilderKt {
    @k
    public static final NavDeepLink navDeepLink(@k l<? super NavDeepLinkDslBuilder, g2> deepLinkBuilder) {
        g0.p(deepLinkBuilder, "deepLinkBuilder");
        NavDeepLinkDslBuilder navDeepLinkDslBuilder = new NavDeepLinkDslBuilder();
        deepLinkBuilder.invoke(navDeepLinkDslBuilder);
        return navDeepLinkDslBuilder.build$navigation_common_release();
    }

    public static /* synthetic */ NavDeepLink navDeepLink$default(String basePath, Map typeMap, l deepLinkBuilder, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            typeMap = l1.z();
        }
        if ((i11 & 4) != 0) {
            deepLinkBuilder = new l<NavDeepLinkDslBuilder, g2>() { // from class: androidx.navigation.NavDeepLinkDslBuilderKt$navDeepLink$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(NavDeepLinkDslBuilder navDeepLinkDslBuilder) {
                    g0.p(navDeepLinkDslBuilder, "$this$null");
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(NavDeepLinkDslBuilder navDeepLinkDslBuilder) {
                    invoke2(navDeepLinkDslBuilder);
                    return g2.f100423a;
                }
            };
        }
        g0.p(basePath, "basePath");
        g0.p(typeMap, "typeMap");
        g0.p(deepLinkBuilder, "deepLinkBuilder");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return navDeepLink(basePath, o0.d(Object.class), typeMap, deepLinkBuilder);
    }

    public static final /* synthetic */ <T> NavDeepLink navDeepLink(String basePath, Map<r, NavType<?>> typeMap, l<? super NavDeepLinkDslBuilder, g2> deepLinkBuilder) {
        g0.p(basePath, "basePath");
        g0.p(typeMap, "typeMap");
        g0.p(deepLinkBuilder, "deepLinkBuilder");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return navDeepLink(basePath, o0.d(Object.class), typeMap, deepLinkBuilder);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    public static final <T> NavDeepLink navDeepLink(@k String basePath, @k d<T> route, @k Map<r, NavType<?>> typeMap, @k l<? super NavDeepLinkDslBuilder, g2> deepLinkBuilder) {
        g0.p(basePath, "basePath");
        g0.p(route, "route");
        g0.p(typeMap, "typeMap");
        g0.p(deepLinkBuilder, "deepLinkBuilder");
        NavDeepLinkDslBuilder navDeepLinkDslBuilder = new NavDeepLinkDslBuilder(basePath, route, typeMap);
        deepLinkBuilder.invoke(navDeepLinkDslBuilder);
        return navDeepLinkDslBuilder.build$navigation_common_release();
    }
}
