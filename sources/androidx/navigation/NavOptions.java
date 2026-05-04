package androidx.navigation;

import androidx.annotation.AnimRes;
import androidx.annotation.AnimatorRes;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.serialization.RouteSerializerKt;
import f50.k0;
import h10.d;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import pn.j;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class NavOptions {
    private final int enterAnim;
    private final int exitAnim;
    private final int popEnterAnim;
    private final int popExitAnim;

    @IdRes
    private final int popUpToId;
    private final boolean popUpToInclusive;

    @l
    private String popUpToRoute;

    @l
    private d<?> popUpToRouteClass;

    @l
    private Object popUpToRouteObject;
    private final boolean popUpToSaveState;
    private final boolean restoreState;
    private final boolean singleTop;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nNavOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavOptions.kt\nandroidx/navigation/NavOptions$Builder\n*L\n1#1,599:1\n434#1,6:600\n*S KotlinDebug\n*F\n+ 1 NavOptions.kt\nandroidx/navigation/NavOptions$Builder\n*L\n-1#1:600,6\n*E\n"})
    public static final class Builder {
        private boolean popUpToInclusive;

        @l
        private String popUpToRoute;

        @l
        private d<?> popUpToRouteClass;

        @l
        private Object popUpToRouteObject;
        private boolean popUpToSaveState;
        private boolean restoreState;
        private boolean singleTop;

        @IdRes
        private int popUpToId = -1;

        @AnimRes
        @AnimatorRes
        private int enterAnim = -1;

        @AnimRes
        @AnimatorRes
        private int exitAnim = -1;

        @AnimRes
        @AnimatorRes
        private int popEnterAnim = -1;

        @AnimRes
        @AnimatorRes
        private int popExitAnim = -1;

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, int i11, boolean z11, boolean z12, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                z12 = false;
            }
            return builder.setPopUpTo(i11, z11, z12);
        }

        @k
        public final NavOptions build() {
            String str = this.popUpToRoute;
            if (str != null) {
                return new NavOptions(this.singleTop, this.restoreState, str, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
            }
            d<?> dVar = this.popUpToRouteClass;
            if (dVar != null) {
                return new NavOptions(this.singleTop, this.restoreState, dVar, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
            }
            Object obj = this.popUpToRouteObject;
            if (obj == null) {
                return new NavOptions(this.singleTop, this.restoreState, this.popUpToId, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
            }
            boolean z11 = this.singleTop;
            boolean z12 = this.restoreState;
            g0.m(obj);
            return new NavOptions(z11, z12, obj, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
        }

        @k
        public final Builder setEnterAnim(@AnimRes @AnimatorRes int i11) {
            this.enterAnim = i11;
            return this;
        }

        @k
        public final Builder setExitAnim(@AnimRes @AnimatorRes int i11) {
            this.exitAnim = i11;
            return this;
        }

        @k
        public final Builder setLaunchSingleTop(boolean z11) {
            this.singleTop = z11;
            return this;
        }

        @k
        public final Builder setPopEnterAnim(@AnimRes @AnimatorRes int i11) {
            this.popEnterAnim = i11;
            return this;
        }

        @k
        public final Builder setPopExitAnim(@AnimRes @AnimatorRes int i11) {
            this.popExitAnim = i11;
            return this;
        }

        @w00.k
        @k
        public final Builder setPopUpTo(@IdRes int i11, boolean z11) {
            return setPopUpTo$default(this, i11, z11, false, 4, (Object) null);
        }

        @k
        public final Builder setRestoreState(boolean z11) {
            this.restoreState = z11;
            return this;
        }

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, String str, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z12 = false;
            }
            return builder.setPopUpTo(str, z11, z12);
        }

        @w00.k
        @k
        public final <T> Builder setPopUpTo(@k T route, boolean z11) {
            g0.p(route, "route");
            return setPopUpTo$default(this, (Object) route, z11, false, 4, (Object) null);
        }

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                z12 = false;
            }
            g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
            builder.setPopUpTo(o0.d(Object.class), z11, z12);
            return builder;
        }

        @w00.k
        @k
        public final Builder setPopUpTo(@l String str, boolean z11) {
            return setPopUpTo$default(this, str, z11, false, 4, (Object) null);
        }

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, d dVar, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z12 = false;
            }
            return builder.setPopUpTo((d<?>) dVar, z11, z12);
        }

        @w00.k
        @k
        public final Builder setPopUpTo(@IdRes int i11, boolean z11, boolean z12) {
            this.popUpToId = i11;
            this.popUpToRoute = null;
            this.popUpToInclusive = z11;
            this.popUpToSaveState = z12;
            return this;
        }

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, Object obj, boolean z11, boolean z12, int i11, Object obj2) {
            if ((i11 & 4) != 0) {
                z12 = false;
            }
            return builder.setPopUpTo((Builder) obj, z11, z12);
        }

        @w00.k
        @k
        public final Builder setPopUpTo(@l String str, boolean z11, boolean z12) {
            this.popUpToRoute = str;
            this.popUpToId = -1;
            this.popUpToInclusive = z11;
            this.popUpToSaveState = z12;
            return this;
        }

        @w00.k
        public final /* synthetic */ <T> Builder setPopUpTo(boolean z11, boolean z12) {
            g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
            setPopUpTo(o0.d(Object.class), z11, z12);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @k
        public final Builder setPopUpTo(@k d<?> klass, boolean z11, boolean z12) {
            g0.p(klass, "klass");
            this.popUpToRouteClass = klass;
            this.popUpToId = -1;
            this.popUpToInclusive = z11;
            this.popUpToSaveState = z12;
            return this;
        }

        @w00.k
        @k
        public final <T> Builder setPopUpTo(@k T route, boolean z11, boolean z12) {
            g0.p(route, "route");
            this.popUpToRouteObject = route;
            setPopUpTo(RouteSerializerKt.generateHashCode(k0.h(o0.d(route.getClass()))), z11, z12);
            return this;
        }

        @w00.k
        public final /* synthetic */ <T> Builder setPopUpTo(boolean z11) {
            g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
            setPopUpTo(o0.d(Object.class), z11, false);
            return this;
        }
    }

    public NavOptions(boolean z11, boolean z12, @IdRes int i11, boolean z13, boolean z14, @AnimRes @AnimatorRes int i12, @AnimRes @AnimatorRes int i13, @AnimRes @AnimatorRes int i14, @AnimRes @AnimatorRes int i15) {
        this.singleTop = z11;
        this.restoreState = z12;
        this.popUpToId = i11;
        this.popUpToInclusive = z13;
        this.popUpToSaveState = z14;
        this.enterAnim = i12;
        this.exitAnim = i13;
        this.popEnterAnim = i14;
        this.popExitAnim = i15;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof NavOptions)) {
            NavOptions navOptions = (NavOptions) obj;
            if (this.singleTop == navOptions.singleTop && this.restoreState == navOptions.restoreState && this.popUpToId == navOptions.popUpToId && g0.g(this.popUpToRoute, navOptions.popUpToRoute) && g0.g(this.popUpToRouteClass, navOptions.popUpToRouteClass) && g0.g(this.popUpToRouteObject, navOptions.popUpToRouteObject) && this.popUpToInclusive == navOptions.popUpToInclusive && this.popUpToSaveState == navOptions.popUpToSaveState && this.enterAnim == navOptions.enterAnim && this.exitAnim == navOptions.exitAnim && this.popEnterAnim == navOptions.popEnterAnim && this.popExitAnim == navOptions.popExitAnim) {
                return true;
            }
        }
        return false;
    }

    @AnimRes
    @AnimatorRes
    public final int getEnterAnim() {
        return this.enterAnim;
    }

    @AnimRes
    @AnimatorRes
    public final int getExitAnim() {
        return this.exitAnim;
    }

    @AnimRes
    @AnimatorRes
    public final int getPopEnterAnim() {
        return this.popEnterAnim;
    }

    @AnimRes
    @AnimatorRes
    public final int getPopExitAnim() {
        return this.popExitAnim;
    }

    @IdRes
    @n(message = "Use popUpToId instead.", replaceWith = @w0(expression = "popUpToId", imports = {}))
    public final int getPopUpTo() {
        return this.popUpToId;
    }

    @IdRes
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

    public int hashCode() {
        int i11 = (((((shouldLaunchSingleTop() ? 1 : 0) * 31) + (shouldRestoreState() ? 1 : 0)) * 31) + this.popUpToId) * 31;
        String str = this.popUpToRoute;
        int hashCode = (i11 + (str != null ? str.hashCode() : 0)) * 31;
        d<?> dVar = this.popUpToRouteClass;
        int hashCode2 = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        Object obj = this.popUpToRouteObject;
        return ((((((((((((hashCode2 + (obj != null ? obj.hashCode() : 0)) * 31) + (isPopUpToInclusive() ? 1 : 0)) * 31) + (shouldPopUpToSaveState() ? 1 : 0)) * 31) + this.enterAnim) * 31) + this.exitAnim) * 31) + this.popEnterAnim) * 31) + this.popExitAnim;
    }

    public final boolean isPopUpToInclusive() {
        return this.popUpToInclusive;
    }

    public final boolean shouldLaunchSingleTop() {
        return this.singleTop;
    }

    public final boolean shouldPopUpToSaveState() {
        return this.popUpToSaveState;
    }

    public final boolean shouldRestoreState() {
        return this.restoreState;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(NavOptions.class.getSimpleName());
        sb2.append(j.f81006c);
        if (this.singleTop) {
            sb2.append("launchSingleTop ");
        }
        if (this.restoreState) {
            sb2.append("restoreState ");
        }
        String str = this.popUpToRoute;
        if ((str != null || this.popUpToId != -1) && str != null) {
            sb2.append("popUpTo(");
            String str2 = this.popUpToRoute;
            if (str2 != null) {
                sb2.append(str2);
            } else {
                d<?> dVar = this.popUpToRouteClass;
                if (dVar != null) {
                    sb2.append(dVar);
                } else {
                    Object obj = this.popUpToRouteObject;
                    if (obj != null) {
                        sb2.append(obj);
                    } else {
                        sb2.append("0x");
                        sb2.append(Integer.toHexString(this.popUpToId));
                    }
                }
            }
            if (this.popUpToInclusive) {
                sb2.append(" inclusive");
            }
            if (this.popUpToSaveState) {
                sb2.append(" saveState");
            }
            sb2.append(j.f81007d);
        }
        if (this.enterAnim != -1 || this.exitAnim != -1 || this.popEnterAnim != -1 || this.popExitAnim != -1) {
            sb2.append("anim(enterAnim=0x");
            sb2.append(Integer.toHexString(this.enterAnim));
            sb2.append(" exitAnim=0x");
            sb2.append(Integer.toHexString(this.exitAnim));
            sb2.append(" popEnterAnim=0x");
            sb2.append(Integer.toHexString(this.popEnterAnim));
            sb2.append(" popExitAnim=0x");
            sb2.append(Integer.toHexString(this.popExitAnim));
            sb2.append(j.f81007d);
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "sb.toString()");
        return sb3;
    }

    public NavOptions(boolean z11, boolean z12, @l String str, boolean z13, boolean z14, int i11, int i12, int i13, int i14) {
        this(z11, z12, NavDestination.Companion.createRoute(str).hashCode(), z13, z14, i11, i12, i13, i14);
        this.popUpToRoute = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavOptions(boolean z11, boolean z12, @l d<?> dVar, boolean z13, boolean z14, int i11, int i12, int i13, int i14) {
        this(z11, z12, RouteSerializerKt.generateHashCode(k0.h(dVar)), z13, z14, i11, i12, i13, i14);
        g0.m(dVar);
        this.popUpToRouteClass = dVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavOptions(boolean z11, boolean z12, @k Object popUpToRouteObject, boolean z13, boolean z14, int i11, int i12, int i13, int i14) {
        this(z11, z12, RouteSerializerKt.generateHashCode(k0.h(o0.d(popUpToRouteObject.getClass()))), z13, z14, i11, i12, i13, i14);
        g0.p(popUpToRouteObject, "popUpToRouteObject");
        this.popUpToRouteObject = popUpToRouteObject;
    }
}
