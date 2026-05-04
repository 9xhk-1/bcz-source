package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.IdRes;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.l;
import pn.j;
import w00.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNavAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavAction.kt\nandroidx/navigation/NavAction\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n1855#2,2:90\n*S KotlinDebug\n*F\n+ 1 NavAction.kt\nandroidx/navigation/NavAction\n*L\n58#1:87,3\n67#1:90,2\n*E\n"})
/* loaded from: classes3.dex */
public final class NavAction {

    @l
    private Bundle defaultArguments;

    @IdRes
    private final int destinationId;

    @l
    private NavOptions navOptions;

    @k
    public NavAction(@IdRes int i11) {
        this(i11, null, null, 6, null);
    }

    public boolean equals(@l Object obj) {
        Set<String> keySet;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof NavAction)) {
            NavAction navAction = (NavAction) obj;
            if (this.destinationId == navAction.destinationId && g0.g(this.navOptions, navAction.navOptions)) {
                if (!g0.g(this.defaultArguments, navAction.defaultArguments)) {
                    Bundle bundle = this.defaultArguments;
                    if (bundle != null && (keySet = bundle.keySet()) != null) {
                        Set<String> set = keySet;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            for (String str : set) {
                                Bundle bundle2 = this.defaultArguments;
                                Object obj2 = bundle2 != null ? bundle2.get(str) : null;
                                Bundle bundle3 = navAction.defaultArguments;
                                if (!g0.g(obj2, bundle3 != null ? bundle3.get(str) : null)) {
                                }
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @l
    public final Bundle getDefaultArguments() {
        return this.defaultArguments;
    }

    public final int getDestinationId() {
        return this.destinationId;
    }

    @l
    public final NavOptions getNavOptions() {
        return this.navOptions;
    }

    public int hashCode() {
        Set<String> keySet;
        int hashCode = Integer.hashCode(this.destinationId) * 31;
        NavOptions navOptions = this.navOptions;
        int hashCode2 = hashCode + (navOptions != null ? navOptions.hashCode() : 0);
        Bundle bundle = this.defaultArguments;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            for (String str : keySet) {
                int i11 = hashCode2 * 31;
                Bundle bundle2 = this.defaultArguments;
                Object obj = bundle2 != null ? bundle2.get(str) : null;
                hashCode2 = i11 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return hashCode2;
    }

    public final void setDefaultArguments(@l Bundle bundle) {
        this.defaultArguments = bundle;
    }

    public final void setNavOptions(@l NavOptions navOptions) {
        this.navOptions = navOptions;
    }

    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(NavAction.class.getSimpleName());
        sb2.append("(0x");
        sb2.append(Integer.toHexString(this.destinationId));
        sb2.append(j.f81007d);
        if (this.navOptions != null) {
            sb2.append(" navOptions=");
            sb2.append(this.navOptions);
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "sb.toString()");
        return sb3;
    }

    @k
    public NavAction(@IdRes int i11, @l NavOptions navOptions) {
        this(i11, navOptions, null, 4, null);
    }

    @k
    public NavAction(@IdRes int i11, @l NavOptions navOptions, @l Bundle bundle) {
        this.destinationId = i11;
        this.navOptions = navOptions;
        this.defaultArguments = bundle;
    }

    public /* synthetic */ NavAction(int i11, NavOptions navOptions, Bundle bundle, int i12, v vVar) {
        this(i11, (i12 & 2) != 0 ? null : navOptions, (i12 & 4) != 0 ? null : bundle);
    }
}
