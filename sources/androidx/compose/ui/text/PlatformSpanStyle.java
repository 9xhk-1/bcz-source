package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class PlatformSpanStyle {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final PlatformSpanStyle Default = new PlatformSpanStyle();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final PlatformSpanStyle getDefault() {
            return PlatformSpanStyle.Default;
        }

        private Companion() {
        }
    }

    public boolean equals(@l Object obj) {
        return this == obj || (obj instanceof PlatformSpanStyle);
    }

    public int hashCode() {
        return super.hashCode();
    }

    @k
    public String toString() {
        return "PlatformSpanStyle()";
    }

    @k
    public final PlatformSpanStyle merge(@l PlatformSpanStyle platformSpanStyle) {
        return this;
    }
}
