package androidx.media3.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.text.HorizontalTextInVerticalContextSpan;
import androidx.media3.common.text.RubySpan;
import androidx.media3.common.text.TextEmphasisSpan;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.media3.ui.SpannedToHtmlConverter;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class SpannedToHtmlConverter {
    private static final Pattern NEWLINE_PATTERN = Pattern.compile("(&#13;)?&#10;");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class HtmlAndCss {
        public final Map<String, String> cssRuleSets;
        public final String html;

        private HtmlAndCss(String str, Map<String, String> map) {
            this.html = str;
            this.cssRuleSets = map;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SpanInfo {
        public final String closingTag;
        public final int end;
        public final String openingTag;
        public final int start;
        private static final Comparator<SpanInfo> FOR_OPENING_TAGS = new Comparator() { // from class: androidx.media3.ui.o0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SpannedToHtmlConverter.SpanInfo.b((SpannedToHtmlConverter.SpanInfo) obj, (SpannedToHtmlConverter.SpanInfo) obj2);
            }
        };
        private static final Comparator<SpanInfo> FOR_CLOSING_TAGS = new Comparator() { // from class: androidx.media3.ui.p0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SpannedToHtmlConverter.SpanInfo.a((SpannedToHtmlConverter.SpanInfo) obj, (SpannedToHtmlConverter.SpanInfo) obj2);
            }
        };

        public static /* synthetic */ int a(SpanInfo spanInfo, SpanInfo spanInfo2) {
            int compare = Integer.compare(spanInfo2.start, spanInfo.start);
            if (compare != 0) {
                return compare;
            }
            int compareTo = spanInfo2.openingTag.compareTo(spanInfo.openingTag);
            return compareTo != 0 ? compareTo : spanInfo2.closingTag.compareTo(spanInfo.closingTag);
        }

        public static /* synthetic */ int b(SpanInfo spanInfo, SpanInfo spanInfo2) {
            int compare = Integer.compare(spanInfo2.end, spanInfo.end);
            if (compare != 0) {
                return compare;
            }
            int compareTo = spanInfo.openingTag.compareTo(spanInfo2.openingTag);
            return compareTo != 0 ? compareTo : spanInfo.closingTag.compareTo(spanInfo2.closingTag);
        }

        private SpanInfo(int i11, int i12, String str, String str2) {
            this.start = i11;
            this.end = i12;
            this.openingTag = str;
            this.closingTag = str2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Transition {
        private final List<SpanInfo> spansAdded = new ArrayList();
        private final List<SpanInfo> spansRemoved = new ArrayList();
    }

    private SpannedToHtmlConverter() {
    }

    public static HtmlAndCss convert(@Nullable CharSequence charSequence, float f11) {
        if (charSequence == null) {
            return new HtmlAndCss("", ImmutableMap.of());
        }
        if (!(charSequence instanceof Spanned)) {
            return new HtmlAndCss(escapeHtml(charSequence), ImmutableMap.of());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        int i11 = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            hashMap.put(HtmlUtils.cssAllClassDescendantsSelector("bg_" + intValue), Util.formatInvariant("background-color:%s;", HtmlUtils.toCssRgba(intValue)));
        }
        SparseArray<Transition> findSpanTransitions = findSpanTransitions(spanned, f11);
        StringBuilder sb2 = new StringBuilder(spanned.length());
        int i12 = 0;
        while (i11 < findSpanTransitions.size()) {
            int keyAt = findSpanTransitions.keyAt(i11);
            sb2.append(escapeHtml(spanned.subSequence(i12, keyAt)));
            Transition transition = findSpanTransitions.get(keyAt);
            Collections.sort(transition.spansRemoved, SpanInfo.FOR_CLOSING_TAGS);
            Iterator it2 = transition.spansRemoved.iterator();
            while (it2.hasNext()) {
                sb2.append(((SpanInfo) it2.next()).closingTag);
            }
            Collections.sort(transition.spansAdded, SpanInfo.FOR_OPENING_TAGS);
            Iterator it3 = transition.spansAdded.iterator();
            while (it3.hasNext()) {
                sb2.append(((SpanInfo) it3.next()).openingTag);
            }
            i11++;
            i12 = keyAt;
        }
        sb2.append(escapeHtml(spanned.subSequence(i12, spanned.length())));
        return new HtmlAndCss(sb2.toString(), hashMap);
    }

    private static String escapeHtml(CharSequence charSequence) {
        return NEWLINE_PATTERN.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    private static SparseArray<Transition> findSpanTransitions(Spanned spanned, float f11) {
        SparseArray<Transition> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String openingTag = getOpeningTag(obj, f11);
            String closingTag = getClosingTag(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (openingTag != null) {
                Assertions.checkNotNull(closingTag);
                SpanInfo spanInfo = new SpanInfo(spanStart, spanEnd, openingTag, closingTag);
                getOrCreate(sparseArray, spanStart).spansAdded.add(spanInfo);
                getOrCreate(sparseArray, spanEnd).spansRemoved.add(spanInfo);
            }
        }
        return sparseArray;
    }

    @Nullable
    private static String getClosingTag(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof HorizontalTextInVerticalContextSpan) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof TextEmphasisSpan)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof RubySpan) {
                return "<rt>" + escapeHtml(((RubySpan) obj).rubyText) + "</rt></ruby>";
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    @Nullable
    private static String getOpeningTag(Object obj, float f11) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return Util.formatInvariant("<span style='color:%s;'>", HtmlUtils.toCssRgba(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return Util.formatInvariant("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof HorizontalTextInVerticalContextSpan) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            return Util.formatInvariant("<span style='font-size:%.2fpx;'>", Float.valueOf(((AbsoluteSizeSpan) obj).getDip() ? r3.getSize() : r3.getSize() / f11));
        }
        if (obj instanceof RelativeSizeSpan) {
            return Util.formatInvariant("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return Util.formatInvariant("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (!(obj instanceof RubySpan)) {
            if (obj instanceof UnderlineSpan) {
                return "<u>";
            }
            if (!(obj instanceof TextEmphasisSpan)) {
                return null;
            }
            TextEmphasisSpan textEmphasisSpan = (TextEmphasisSpan) obj;
            return Util.formatInvariant("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", getTextEmphasisStyle(textEmphasisSpan.markShape, textEmphasisSpan.markFill), getTextEmphasisPosition(textEmphasisSpan.position));
        }
        int i11 = ((RubySpan) obj).position;
        if (i11 == -1) {
            return "<ruby style='ruby-position:unset;'>";
        }
        if (i11 == 1) {
            return "<ruby style='ruby-position:over;'>";
        }
        if (i11 != 2) {
            return null;
        }
        return "<ruby style='ruby-position:under;'>";
    }

    private static Transition getOrCreate(SparseArray<Transition> sparseArray, int i11) {
        Transition transition = sparseArray.get(i11);
        if (transition != null) {
            return transition;
        }
        Transition transition2 = new Transition();
        sparseArray.put(i11, transition2);
        return transition2;
    }

    private static String getTextEmphasisPosition(int i11) {
        return i11 != 2 ? "over right" : "under left";
    }

    private static String getTextEmphasisStyle(int i11, int i12) {
        StringBuilder sb2 = new StringBuilder();
        if (i12 == 1) {
            sb2.append("filled ");
        } else if (i12 == 2) {
            sb2.append("open ");
        }
        if (i11 == 0) {
            sb2.append("none");
        } else if (i11 == 1) {
            sb2.append("circle");
        } else if (i11 == 2) {
            sb2.append(TtmlNode.TEXT_EMPHASIS_MARK_DOT);
        } else if (i11 != 3) {
            sb2.append("unset");
        } else {
            sb2.append(TtmlNode.TEXT_EMPHASIS_MARK_SESAME);
        }
        return sb2.toString();
    }
}
