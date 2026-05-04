package androidx.media3.extractor.text.ttml;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableSet;
import ho.c;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class TextEmphasis {
    public static final int MARK_SHAPE_AUTO = -1;
    public static final int POSITION_OUTSIDE = -2;
    public final int markFill;
    public final int markShape;
    public final int position;
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\s+");
    private static final ImmutableSet<String> SINGLE_STYLE_VALUES = ImmutableSet.of("auto", "none");
    private static final ImmutableSet<String> MARK_SHAPE_VALUES = ImmutableSet.of(TtmlNode.TEXT_EMPHASIS_MARK_DOT, TtmlNode.TEXT_EMPHASIS_MARK_SESAME, "circle");
    private static final ImmutableSet<String> MARK_FILL_VALUES = ImmutableSet.of(TtmlNode.TEXT_EMPHASIS_MARK_FILLED, "open");
    private static final ImmutableSet<String> POSITION_VALUES = ImmutableSet.of(TtmlNode.ANNOTATION_POSITION_AFTER, TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_OUTSIDE);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Position {
    }

    private TextEmphasis(int i11, int i12, int i13) {
        this.markShape = i11;
        this.markFill = i12;
        this.position = i13;
    }

    @Nullable
    public static TextEmphasis parse(@Nullable String str) {
        if (str == null) {
            return null;
        }
        String g11 = c.g(str.trim());
        if (g11.isEmpty()) {
            return null;
        }
        return parseWords(ImmutableSet.copyOf(TextUtils.split(g11, WHITESPACE_PATTERN)));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.media3.extractor.text.ttml.TextEmphasis parseWords(com.google.common.collect.ImmutableSet<java.lang.String> r7) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.ttml.TextEmphasis.parseWords(com.google.common.collect.ImmutableSet):androidx.media3.extractor.text.ttml.TextEmphasis");
    }
}
