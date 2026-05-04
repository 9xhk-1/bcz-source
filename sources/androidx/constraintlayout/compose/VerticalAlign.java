package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes2.dex */
public final class VerticalAlign {
    public static final int $stable = 0;

    @k
    private final String name;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final VerticalAlign Top = new VerticalAlign("top");

    @k
    private static final VerticalAlign Bottom = new VerticalAlign("bottom");

    @k
    private static final VerticalAlign Center = new VerticalAlign(TtmlNode.CENTER);

    @k
    private static final VerticalAlign Baseline = new VerticalAlign("baseline");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final VerticalAlign getBaseline() {
            return VerticalAlign.Baseline;
        }

        @k
        public final VerticalAlign getBottom() {
            return VerticalAlign.Bottom;
        }

        @k
        public final VerticalAlign getCenter() {
            return VerticalAlign.Center;
        }

        @k
        public final VerticalAlign getTop() {
            return VerticalAlign.Top;
        }

        private Companion() {
        }
    }

    public VerticalAlign(@k String str) {
        this.name = str;
    }

    @k
    public final String getName$constraintlayout_compose_release() {
        return this.name;
    }
}
