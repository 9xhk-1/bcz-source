package androidx.core.text;

import android.text.Html;
import android.text.Spanned;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class HtmlKt {
    @m80.k
    public static final Spanned parseAsHtml(@m80.k String str, int i11, @m80.l Html.ImageGetter imageGetter, @m80.l Html.TagHandler tagHandler) {
        return HtmlCompat.fromHtml(str, i11, imageGetter, tagHandler);
    }

    public static /* synthetic */ Spanned parseAsHtml$default(String str, int i11, Html.ImageGetter imageGetter, Html.TagHandler tagHandler, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        if ((i12 & 2) != 0) {
            imageGetter = null;
        }
        if ((i12 & 4) != 0) {
            tagHandler = null;
        }
        return HtmlCompat.fromHtml(str, i11, imageGetter, tagHandler);
    }

    @m80.k
    public static final String toHtml(@m80.k Spanned spanned, int i11) {
        return HtmlCompat.toHtml(spanned, i11);
    }

    public static /* synthetic */ String toHtml$default(Spanned spanned, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return HtmlCompat.toHtml(spanned, i11);
    }
}
