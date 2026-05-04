package androidx.core.text;

import android.annotation.SuppressLint;
import android.text.Html;
import android.text.Spanned;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"InlinedApi"})
/* loaded from: classes2.dex */
public final class HtmlCompat {
    public static final int FROM_HTML_MODE_COMPACT = 63;
    public static final int FROM_HTML_MODE_LEGACY = 0;
    public static final int FROM_HTML_OPTION_USE_CSS_COLORS = 256;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_BLOCKQUOTE = 32;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_DIV = 16;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_HEADING = 2;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST = 8;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST_ITEM = 4;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_PARAGRAPH = 1;
    public static final int TO_HTML_PARAGRAPH_LINES_CONSECUTIVE = 0;
    public static final int TO_HTML_PARAGRAPH_LINES_INDIVIDUAL = 1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        public static Spanned fromHtml(String str, int i11) {
            return Html.fromHtml(str, i11);
        }

        @DoNotInline
        public static String toHtml(Spanned spanned, int i11) {
            return Html.toHtml(spanned, i11);
        }

        @DoNotInline
        public static Spanned fromHtml(String str, int i11, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i11, imageGetter, tagHandler);
        }
    }

    private HtmlCompat() {
    }

    @NonNull
    public static Spanned fromHtml(@NonNull String str, int i11) {
        return Api24Impl.fromHtml(str, i11);
    }

    @NonNull
    public static String toHtml(@NonNull Spanned spanned, int i11) {
        return Api24Impl.toHtml(spanned, i11);
    }

    @NonNull
    public static Spanned fromHtml(@NonNull String str, int i11, @Nullable Html.ImageGetter imageGetter, @Nullable Html.TagHandler tagHandler) {
        return Api24Impl.fromHtml(str, i11, imageGetter, tagHandler);
    }
}
