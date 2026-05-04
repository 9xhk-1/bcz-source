package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes2.dex */
public final class ChainStyle {
    public static final int $stable = 0;

    @k
    public static final Companion Companion;

    @k
    private static final ChainStyle Packed;

    @k
    private static final ChainStyle Spread;

    @k
    private static final ChainStyle SpreadInside;

    @l
    private final Float bias;

    @k
    private final String name;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @Stable
        @k
        public final ChainStyle Packed(float f11) {
            return new ChainStyle("packed", Float.valueOf(f11));
        }

        @k
        public final ChainStyle getPacked() {
            return ChainStyle.Packed;
        }

        @k
        public final ChainStyle getSpread() {
            return ChainStyle.Spread;
        }

        @k
        public final ChainStyle getSpreadInside() {
            return ChainStyle.SpreadInside;
        }

        private Companion() {
        }

        @Stable
        public static /* synthetic */ void getPacked$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpread$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpreadInside$annotations() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        Companion = companion;
        int i11 = 2;
        Spread = new ChainStyle("spread", 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        SpreadInside = new ChainStyle("spread_inside", 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        Packed = companion.Packed(0.5f);
    }

    public ChainStyle(@k String str, @l Float f11) {
        this.name = str;
        this.bias = f11;
    }

    @l
    public final Float getBias$constraintlayout_compose_release() {
        return this.bias;
    }

    @k
    public final String getName$constraintlayout_compose_release() {
        return this.name;
    }

    public /* synthetic */ ChainStyle(String str, Float f11, int i11, v vVar) {
        this(str, (i11 & 2) != 0 ? null : f11);
    }
}
