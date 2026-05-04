package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes2.dex */
public final class HorizontalAlign {
    public static final int $stable = 0;

    @k
    private final String name;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final HorizontalAlign Start = new HorizontalAlign(TtmlNode.START);

    @k
    private static final HorizontalAlign End = new HorizontalAlign(TtmlNode.END);

    @k
    private static final HorizontalAlign Center = new HorizontalAlign(TtmlNode.CENTER);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final HorizontalAlign getCenter() {
            return HorizontalAlign.Center;
        }

        @k
        public final HorizontalAlign getEnd() {
            return HorizontalAlign.End;
        }

        @k
        public final HorizontalAlign getStart() {
            return HorizontalAlign.Start;
        }

        private Companion() {
        }
    }

    public HorizontalAlign(@k String str) {
        this.name = str;
    }

    @k
    public final String getName$constraintlayout_compose_release() {
        return this.name;
    }
}
