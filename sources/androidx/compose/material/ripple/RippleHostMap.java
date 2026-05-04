package androidx.compose.material.ripple;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRippleContainer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleContainer.android.kt\nandroidx/compose/material/ripple/RippleHostMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"})
/* loaded from: classes.dex */
final class RippleHostMap {

    @k
    private final Map<RippleHostKey, RippleHostView> indicationToHostMap = new LinkedHashMap();

    @k
    private final Map<RippleHostView, RippleHostKey> hostToIndicationMap = new LinkedHashMap();

    @l
    public final RippleHostView get(@k RippleHostKey rippleHostKey) {
        return this.indicationToHostMap.get(rippleHostKey);
    }

    public final void remove(@k RippleHostKey rippleHostKey) {
        RippleHostView rippleHostView = this.indicationToHostMap.get(rippleHostKey);
        if (rippleHostView != null) {
            this.hostToIndicationMap.remove(rippleHostView);
        }
        this.indicationToHostMap.remove(rippleHostKey);
    }

    public final void set(@k RippleHostKey rippleHostKey, @k RippleHostView rippleHostView) {
        this.indicationToHostMap.put(rippleHostKey, rippleHostView);
        this.hostToIndicationMap.put(rippleHostView, rippleHostKey);
    }

    @l
    public final RippleHostKey get(@k RippleHostView rippleHostView) {
        return this.hostToIndicationMap.get(rippleHostView);
    }
}
