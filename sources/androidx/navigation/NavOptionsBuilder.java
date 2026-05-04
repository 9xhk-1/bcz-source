package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.NavOptions;
import h10.d;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import u30.k0;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@NavOptionsDsl
@u0({"SMAP\nNavOptionsBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavOptionsBuilder.kt\nandroidx/navigation/NavOptionsBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
/* loaded from: classes3.dex */
public final class NavOptionsBuilder {
    private boolean inclusive;
    private boolean launchSingleTop;

    @l
    private String popUpToRoute;

    @l
    private d<?> popUpToRouteClass;

    @l
    private Object popUpToRouteObject;
    private boolean restoreState;
    private boolean saveState;

    @k
    private final NavOptions.Builder builder = new NavOptions.Builder();

    @IdRes
    private int popUpToId = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void popUpTo$default(NavOptionsBuilder navOptionsBuilder, int i11, x00.l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            lVar = new x00.l<PopUpToBuilder, g2>() { // from class: androidx.navigation.NavOptionsBuilder$popUpTo$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(PopUpToBuilder popUpToBuilder) {
                    g0.p(popUpToBuilder, "$this$null");
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(PopUpToBuilder popUpToBuilder) {
                    invoke2(popUpToBuilder);
                    return g2.f100423a;
                }
            };
        }
        navOptionsBuilder.popUpTo(i11, (x00.l<? super PopUpToBuilder, g2>) lVar);
    }

    private final void setPopUpToRoute(String str) {
        if (str != null) {
            if (k0.O3(str)) {
                throw new IllegalArgumentException("Cannot pop up to an empty route");
            }
            this.popUpToRoute = str;
            this.inclusive = false;
        }
    }

    private final void setPopUpToRouteClass(d<?> dVar) {
        if (dVar != null) {
            this.popUpToRouteClass = dVar;
            this.inclusive = false;
        }
    }

    private final void setPopUpToRouteObject(Object obj) {
        if (obj != null) {
            this.popUpToRouteObject = obj;
            this.inclusive = false;
        }
    }

    public final void anim(@k x00.l<? super AnimBuilder, g2> animBuilder) {
        g0.p(animBuilder, "animBuilder");
        AnimBuilder animBuilder2 = new AnimBuilder();
        animBuilder.invoke(animBuilder2);
        this.builder.setEnterAnim(animBuilder2.getEnter()).setExitAnim(animBuilder2.getExit()).setPopEnterAnim(animBuilder2.getPopEnter()).setPopExitAnim(animBuilder2.getPopExit());
    }

    @k
    public final NavOptions build$navigation_common_release() {
        NavOptions.Builder builder = this.builder;
        builder.setLaunchSingleTop(this.launchSingleTop);
        builder.setRestoreState(this.restoreState);
        String str = this.popUpToRoute;
        if (str != null) {
            builder.setPopUpTo(str, this.inclusive, this.saveState);
        } else {
            d<?> dVar = this.popUpToRouteClass;
            if (dVar != null) {
                g0.m(dVar);
                builder.setPopUpTo(dVar, this.inclusive, this.saveState);
            } else {
                Object obj = this.popUpToRouteObject;
                if (obj != null) {
                    g0.m(obj);
                    builder.setPopUpTo((NavOptions.Builder) obj, this.inclusive, this.saveState);
                } else {
                    builder.setPopUpTo(this.popUpToId, this.inclusive, this.saveState);
                }
            }
        }
        return builder.build();
    }

    public final boolean getLaunchSingleTop() {
        return this.launchSingleTop;
    }

    public final int getPopUpTo() {
        return this.popUpToId;
    }

    public final int getPopUpToId() {
        return this.popUpToId;
    }

    @l
    public final String getPopUpToRoute() {
        return this.popUpToRoute;
    }

    @l
    public final d<?> getPopUpToRouteClass() {
        return this.popUpToRouteClass;
    }

    @l
    public final Object getPopUpToRouteObject() {
        return this.popUpToRouteObject;
    }

    public final boolean getRestoreState() {
        return this.restoreState;
    }

    public final void popUpTo(@IdRes int i11, @k x00.l<? super PopUpToBuilder, g2> popUpToBuilder) {
        g0.p(popUpToBuilder, "popUpToBuilder");
        setPopUpToId$navigation_common_release(i11);
        setPopUpToRoute(null);
        PopUpToBuilder popUpToBuilder2 = new PopUpToBuilder();
        popUpToBuilder.invoke(popUpToBuilder2);
        this.inclusive = popUpToBuilder2.getInclusive();
        this.saveState = popUpToBuilder2.getSaveState();
    }

    public final void setLaunchSingleTop(boolean z11) {
        this.launchSingleTop = z11;
    }

    @n(message = "Use the popUpTo function and passing in the id.")
    public final void setPopUpTo(int i11) {
        popUpTo$default(this, i11, (x00.l) null, 2, (Object) null);
    }

    public final void setPopUpToId$navigation_common_release(int i11) {
        this.popUpToId = i11;
        this.inclusive = false;
    }

    public final void setRestoreState(boolean z11) {
        this.restoreState = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void popUpTo$default(NavOptionsBuilder navOptionsBuilder, String str, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = new x00.l<PopUpToBuilder, g2>() { // from class: androidx.navigation.NavOptionsBuilder$popUpTo$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(PopUpToBuilder popUpToBuilder) {
                    g0.p(popUpToBuilder, "$this$null");
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(PopUpToBuilder popUpToBuilder) {
                    invoke2(popUpToBuilder);
                    return g2.f100423a;
                }
            };
        }
        navOptionsBuilder.popUpTo(str, (x00.l<? super PopUpToBuilder, g2>) lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void popUpTo$default(NavOptionsBuilder navOptionsBuilder, x00.l popUpToBuilder, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            popUpToBuilder = new x00.l<PopUpToBuilder, g2>() { // from class: androidx.navigation.NavOptionsBuilder$popUpTo$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(PopUpToBuilder popUpToBuilder2) {
                    g0.p(popUpToBuilder2, "$this$null");
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(PopUpToBuilder popUpToBuilder2) {
                    invoke2(popUpToBuilder2);
                    return g2.f100423a;
                }
            };
        }
        g0.p(popUpToBuilder, "popUpToBuilder");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        navOptionsBuilder.popUpTo(o0.d(Object.class), (x00.l<? super PopUpToBuilder, g2>) popUpToBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void popUpTo$default(NavOptionsBuilder navOptionsBuilder, Object obj, x00.l lVar, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            lVar = new x00.l<PopUpToBuilder, g2>() { // from class: androidx.navigation.NavOptionsBuilder$popUpTo$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(PopUpToBuilder popUpToBuilder) {
                    g0.p(popUpToBuilder, "$this$null");
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(PopUpToBuilder popUpToBuilder) {
                    invoke2(popUpToBuilder);
                    return g2.f100423a;
                }
            };
        }
        navOptionsBuilder.popUpTo((NavOptionsBuilder) obj, (x00.l<? super PopUpToBuilder, g2>) lVar);
    }

    public final void popUpTo(@k String route, @k x00.l<? super PopUpToBuilder, g2> popUpToBuilder) {
        g0.p(route, "route");
        g0.p(popUpToBuilder, "popUpToBuilder");
        setPopUpToRoute(route);
        setPopUpToId$navigation_common_release(-1);
        PopUpToBuilder popUpToBuilder2 = new PopUpToBuilder();
        popUpToBuilder.invoke(popUpToBuilder2);
        this.inclusive = popUpToBuilder2.getInclusive();
        this.saveState = popUpToBuilder2.getSaveState();
    }

    public final /* synthetic */ <T> void popUpTo(x00.l<? super PopUpToBuilder, g2> popUpToBuilder) {
        g0.p(popUpToBuilder, "popUpToBuilder");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        popUpTo((d) o0.d(Object.class), popUpToBuilder);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final <T> void popUpTo(@k d<T> klass, @k x00.l<? super PopUpToBuilder, g2> popUpToBuilder) {
        g0.p(klass, "klass");
        g0.p(popUpToBuilder, "popUpToBuilder");
        setPopUpToRouteClass(klass);
        setPopUpToId$navigation_common_release(-1);
        setPopUpToRoute(null);
        PopUpToBuilder popUpToBuilder2 = new PopUpToBuilder();
        popUpToBuilder.invoke(popUpToBuilder2);
        this.inclusive = popUpToBuilder2.getInclusive();
        this.saveState = popUpToBuilder2.getSaveState();
    }

    @n(message = "Use the popUpToId property.")
    public static /* synthetic */ void getPopUpTo$annotations() {
    }

    public final <T> void popUpTo(@k T route, @k x00.l<? super PopUpToBuilder, g2> popUpToBuilder) {
        g0.p(route, "route");
        g0.p(popUpToBuilder, "popUpToBuilder");
        setPopUpToRouteObject(route);
        setPopUpToId$navigation_common_release(-1);
        setPopUpToRoute(null);
        PopUpToBuilder popUpToBuilder2 = new PopUpToBuilder();
        popUpToBuilder.invoke(popUpToBuilder2);
        this.inclusive = popUpToBuilder2.getInclusive();
        this.saveState = popUpToBuilder2.getSaveState();
    }
}
