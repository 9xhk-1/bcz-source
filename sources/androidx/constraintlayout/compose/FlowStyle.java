package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes2.dex */
public final class FlowStyle {
    public static final int $stable = 0;

    @k
    private final String name;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final FlowStyle Spread = new FlowStyle("spread");

    @k
    private static final FlowStyle SpreadInside = new FlowStyle("spread_inside");

    @k
    private static final FlowStyle Packed = new FlowStyle("packed");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final FlowStyle getPacked() {
            return FlowStyle.Packed;
        }

        @k
        public final FlowStyle getSpread() {
            return FlowStyle.Spread;
        }

        @k
        public final FlowStyle getSpreadInside() {
            return FlowStyle.SpreadInside;
        }

        private Companion() {
        }
    }

    public FlowStyle(@k String str) {
        this.name = str;
    }

    @k
    public final String getName$constraintlayout_compose_release() {
        return this.name;
    }
}
