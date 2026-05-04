package androidx.navigation;

import a00.l1;
import androidx.annotation.IdRes;
import androidx.exifinterface.media.ExifInterface;
import h10.r;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nActivityNavigatorDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigatorDestinationBuilder.kt\nandroidx/navigation/ActivityNavigatorDestinationBuilderKt\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n*L\n1#1,126:1\n157#2:127\n157#2:128\n157#2:129\n*S KotlinDebug\n*F\n+ 1 ActivityNavigatorDestinationBuilder.kt\nandroidx/navigation/ActivityNavigatorDestinationBuilderKt\n*L\n40#1:127\n49#1:128\n66#1:129\n*E\n"})
/* loaded from: classes3.dex */
public final class ActivityNavigatorDestinationBuilderKt {
    @n(message = "Use routes to build your ActivityDestination instead", replaceWith = @w0(expression = "activity(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void activity(@k NavGraphBuilder navGraphBuilder, @IdRes int i11, @k l<? super ActivityNavigatorDestinationBuilder, g2> builder) {
        g0.p(navGraphBuilder, "<this>");
        g0.p(builder, "builder");
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new ActivityNavigatorDestinationBuilder((ActivityNavigator) navGraphBuilder.getProvider().getNavigator(ActivityNavigator.class), i11);
        builder.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }

    public static /* synthetic */ void activity$default(NavGraphBuilder navGraphBuilder, Map typeMap, l builder, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            typeMap = l1.z();
        }
        g0.p(navGraphBuilder, "<this>");
        g0.p(typeMap, "typeMap");
        g0.p(builder, "builder");
        ActivityNavigator activityNavigator = (ActivityNavigator) navGraphBuilder.getProvider().getNavigator(ActivityNavigator.class);
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new ActivityNavigatorDestinationBuilder(activityNavigator, o0.d(Object.class), typeMap);
        builder.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }

    public static final void activity(@k NavGraphBuilder navGraphBuilder, @k String route, @k l<? super ActivityNavigatorDestinationBuilder, g2> builder) {
        g0.p(navGraphBuilder, "<this>");
        g0.p(route, "route");
        g0.p(builder, "builder");
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new ActivityNavigatorDestinationBuilder((ActivityNavigator) navGraphBuilder.getProvider().getNavigator(ActivityNavigator.class), route);
        builder.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }

    public static final /* synthetic */ <T> void activity(NavGraphBuilder navGraphBuilder, Map<r, NavType<?>> typeMap, l<? super ActivityNavigatorDestinationBuilder, g2> builder) {
        g0.p(navGraphBuilder, "<this>");
        g0.p(typeMap, "typeMap");
        g0.p(builder, "builder");
        ActivityNavigator activityNavigator = (ActivityNavigator) navGraphBuilder.getProvider().getNavigator(ActivityNavigator.class);
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new ActivityNavigatorDestinationBuilder(activityNavigator, o0.d(Object.class), typeMap);
        builder.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }
}
