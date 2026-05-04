package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class PlatformParagraphStyle {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final PlatformParagraphStyle Default = new PlatformParagraphStyle();
    private final int emojiSupportMatch;
    private final boolean includeFontPadding;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final PlatformParagraphStyle getDefault() {
            return PlatformParagraphStyle.Default;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PlatformParagraphStyle(int i11, v vVar) {
        this(i11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformParagraphStyle)) {
            return false;
        }
        PlatformParagraphStyle platformParagraphStyle = (PlatformParagraphStyle) obj;
        return this.includeFontPadding == platformParagraphStyle.includeFontPadding && EmojiSupportMatch.m4399equalsimpl0(this.emojiSupportMatch, platformParagraphStyle.emojiSupportMatch);
    }

    /* renamed from: getEmojiSupportMatch-_3YsG6Y, reason: not valid java name */
    public final int m4477getEmojiSupportMatch_3YsG6Y() {
        return this.emojiSupportMatch;
    }

    public final boolean getIncludeFontPadding() {
        return this.includeFontPadding;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.includeFontPadding) * 31) + EmojiSupportMatch.m4400hashCodeimpl(this.emojiSupportMatch);
    }

    @k
    public final PlatformParagraphStyle merge(@l PlatformParagraphStyle platformParagraphStyle) {
        return platformParagraphStyle == null ? this : platformParagraphStyle;
    }

    @k
    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.includeFontPadding + ", emojiSupportMatch=" + ((Object) EmojiSupportMatch.m4401toStringimpl(this.emojiSupportMatch)) + ')';
    }

    public /* synthetic */ PlatformParagraphStyle(int i11, boolean z11, v vVar) {
        this(i11, z11);
    }

    public PlatformParagraphStyle(boolean z11) {
        this.includeFontPadding = z11;
        this.emojiSupportMatch = EmojiSupportMatch.Companion.m4404getDefault_3YsG6Y();
    }

    public /* synthetic */ PlatformParagraphStyle(boolean z11, int i11, v vVar) {
        this((i11 & 1) != 0 ? false : z11);
    }

    public /* synthetic */ PlatformParagraphStyle(int i11, boolean z11, int i12, v vVar) {
        this((i12 & 1) != 0 ? EmojiSupportMatch.Companion.m4404getDefault_3YsG6Y() : i11, (i12 & 2) != 0 ? false : z11, (v) null);
    }

    private PlatformParagraphStyle(int i11, boolean z11) {
        this.includeFontPadding = z11;
        this.emojiSupportMatch = i11;
    }

    private PlatformParagraphStyle(int i11) {
        this.includeFontPadding = false;
        this.emojiSupportMatch = i11;
    }

    public /* synthetic */ PlatformParagraphStyle(int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? EmojiSupportMatch.Companion.m4404getDefault_3YsG6Y() : i11, (v) null);
    }

    public PlatformParagraphStyle() {
        this(EmojiSupportMatch.Companion.m4404getDefault_3YsG6Y(), false, (v) null);
    }

    public static /* synthetic */ void getIncludeFontPadding$annotations() {
    }
}
