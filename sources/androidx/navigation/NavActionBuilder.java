package androidx.navigation;

import a00.n1;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@NavDestinationDsl
@u0({"SMAP\nNavDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestinationBuilder.kt\nandroidx/navigation/NavActionBuilder\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,398:1\n37#2,2:399\n*S KotlinDebug\n*F\n+ 1 NavDestinationBuilder.kt\nandroidx/navigation/NavActionBuilder\n*L\n335#1:399,2\n*E\n"})
/* loaded from: classes3.dex */
public final class NavActionBuilder {

    @k
    private final Map<String, Object> defaultArguments = new LinkedHashMap();
    private int destinationId;

    @l
    private NavOptions navOptions;

    @k
    public final NavAction build$navigation_common_release() {
        Bundle bundleOf;
        int i11 = this.destinationId;
        NavOptions navOptions = this.navOptions;
        if (this.defaultArguments.isEmpty()) {
            bundleOf = null;
        } else {
            Pair[] pairArr = (Pair[]) n1.J1(this.defaultArguments).toArray(new Pair[0]);
            bundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
        return new NavAction(i11, navOptions, bundleOf);
    }

    @k
    public final Map<String, Object> getDefaultArguments() {
        return this.defaultArguments;
    }

    public final int getDestinationId() {
        return this.destinationId;
    }

    public final void navOptions(@k x00.l<? super NavOptionsBuilder, g2> optionsBuilder) {
        g0.p(optionsBuilder, "optionsBuilder");
        NavOptionsBuilder navOptionsBuilder = new NavOptionsBuilder();
        optionsBuilder.invoke(navOptionsBuilder);
        this.navOptions = navOptionsBuilder.build$navigation_common_release();
    }

    public final void setDestinationId(int i11) {
        this.destinationId = i11;
    }
}
