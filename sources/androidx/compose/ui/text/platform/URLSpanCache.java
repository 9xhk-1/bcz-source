package androidx.compose.ui.text.platform;

import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.InternalTextApi;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.UrlAnnotation;
import java.util.WeakHashMap;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@InternalTextApi
@u0({"SMAP\nURLSpanCache.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URLSpanCache.android.kt\nandroidx/compose/ui/text/platform/URLSpanCache\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,76:1\n372#2,7:77\n372#2,7:84\n372#2,7:91\n*S KotlinDebug\n*F\n+ 1 URLSpanCache.android.kt\nandroidx/compose/ui/text/platform/URLSpanCache\n*L\n56#1:77,7\n59#1:84,7\n66#1:91,7\n*E\n"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class URLSpanCache {
    public static final int $stable = 8;

    @k
    private final WeakHashMap<UrlAnnotation, URLSpan> spansByAnnotation = new WeakHashMap<>();

    @k
    private final WeakHashMap<AnnotatedString.Range<LinkAnnotation.Url>, URLSpan> urlSpansByAnnotation = new WeakHashMap<>();

    @k
    private final WeakHashMap<AnnotatedString.Range<LinkAnnotation>, ComposeClickableSpan> linkSpansWithListenerByAnnotation = new WeakHashMap<>();

    @l
    public final ClickableSpan toClickableSpan(@k AnnotatedString.Range<LinkAnnotation> range) {
        WeakHashMap<AnnotatedString.Range<LinkAnnotation>, ComposeClickableSpan> weakHashMap = this.linkSpansWithListenerByAnnotation;
        ComposeClickableSpan composeClickableSpan = weakHashMap.get(range);
        if (composeClickableSpan == null) {
            composeClickableSpan = new ComposeClickableSpan(range.getItem());
            weakHashMap.put(range, composeClickableSpan);
        }
        return composeClickableSpan;
    }

    @k
    public final URLSpan toURLSpan(@k UrlAnnotation urlAnnotation) {
        WeakHashMap<UrlAnnotation, URLSpan> weakHashMap = this.spansByAnnotation;
        URLSpan uRLSpan = weakHashMap.get(urlAnnotation);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(urlAnnotation.getUrl());
            weakHashMap.put(urlAnnotation, uRLSpan);
        }
        return uRLSpan;
    }

    @k
    public final URLSpan toURLSpan(@k AnnotatedString.Range<LinkAnnotation.Url> range) {
        WeakHashMap<AnnotatedString.Range<LinkAnnotation.Url>, URLSpan> weakHashMap = this.urlSpansByAnnotation;
        URLSpan uRLSpan = weakHashMap.get(range);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(range.getItem().getUrl());
            weakHashMap.put(range, uRLSpan);
        }
        return uRLSpan;
    }
}
