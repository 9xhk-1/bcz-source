package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes2.dex */
public final class Wrap {
    public static final int $stable = 0;

    @k
    private final String name;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final Wrap None = new Wrap("none");

    @k
    private static final Wrap Chain = new Wrap("chain");

    @k
    private static final Wrap Aligned = new Wrap("aligned");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final Wrap getAligned() {
            return Wrap.Aligned;
        }

        @k
        public final Wrap getChain() {
            return Wrap.Chain;
        }

        @k
        public final Wrap getNone() {
            return Wrap.None;
        }

        private Companion() {
        }
    }

    public Wrap(@k String str) {
        this.name = str;
    }

    @k
    public final String getName$constraintlayout_compose_release() {
        return this.name;
    }
}
