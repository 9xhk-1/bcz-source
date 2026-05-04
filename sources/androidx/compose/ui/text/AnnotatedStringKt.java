package androidx.compose.ui.text;

import a00.g0;
import a00.h0;
import a00.m;
import a00.r0;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import e00.g;
import g10.u;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.p;
import x00.q;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1607:1\n34#2,6:1608\n34#2,6:1614\n34#2,6:1621\n247#2,6:1627\n34#2,4:1633\n39#2:1657\n253#2:1658\n230#2,3:1659\n34#2,6:1662\n233#2:1668\n247#2,6:1669\n34#2,6:1675\n253#2:1681\n150#2,3:1682\n34#2,6:1685\n153#2:1691\n247#2,6:1700\n34#2,6:1706\n253#2:1712\n1045#3:1620\n101#4,10:1637\n101#4,10:1647\n114#5,8:1692\n1#6:1713\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1030#1:1608,6\n1031#1:1614,6\n1073#1:1621,6\n1183#1:1627,6\n1183#1:1633,4\n1183#1:1657\n1183#1:1658\n1209#1:1659,3\n1209#1:1662,6\n1209#1:1668\n1212#1:1669,6\n1212#1:1675,6\n1212#1:1681\n1245#1:1682,3\n1245#1:1685,6\n1245#1:1691\n1521#1:1700,6\n1521#1:1706,6\n1521#1:1712\n1066#1:1620\n1186#1:1637,10\n1187#1:1647,10\n1515#1:1692,8\n*E\n"})
/* loaded from: classes2.dex */
public final class AnnotatedStringKt {

    @k
    private static final AnnotatedString EmptyAnnotatedString = new AnnotatedString("", null, 2, 0 == true ? 1 : 0);

    @k
    public static final AnnotatedString AnnotatedString(@k String str, @k SpanStyle spanStyle, @l ParagraphStyle paragraphStyle) {
        return new AnnotatedString(str, g0.l(new AnnotatedString.Range(spanStyle, 0, str.length())), paragraphStyle == null ? h0.J() : g0.l(new AnnotatedString.Range(paragraphStyle, 0, str.length())));
    }

    public static /* synthetic */ AnnotatedString AnnotatedString$default(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            paragraphStyle = null;
        }
        return AnnotatedString(str, spanStyle, paragraphStyle);
    }

    @k
    public static final AnnotatedString buildAnnotatedString(@k x00.l<? super AnnotatedString.Builder, g2> lVar) {
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        lVar.invoke(builder);
        return builder.toAnnotatedString();
    }

    @k
    public static final AnnotatedString capitalize(@k AnnotatedString annotatedString, @k final LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new q<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt$capitalize$1
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return invoke(str, num.intValue(), num2.intValue());
            }

            public final String invoke(String str, int i11, int i12) {
                if (i11 == 0) {
                    String substring = str.substring(i11, i12);
                    kotlin.jvm.internal.g0.o(substring, "substring(...)");
                    return StringKt.capitalize(substring, LocaleList.this);
                }
                String substring2 = str.substring(i11, i12);
                kotlin.jvm.internal.g0.o(substring2, "substring(...)");
                return substring2;
            }
        });
    }

    public static /* synthetic */ AnnotatedString capitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return capitalize(annotatedString, localeList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> constructAnnotationsFromSpansAndParagraphs(List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<ParagraphStyle>> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        if (list2.isEmpty()) {
            return list;
        }
        if (list.isEmpty()) {
            return list2;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(list.get(i11));
        }
        int size2 = list2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            arrayList.add(list2.get(i12));
        }
        return arrayList;
    }

    public static final boolean contains(int i11, int i12, int i13, int i14) {
        if (i11 <= i13 && i14 <= i12) {
            if (i12 == i14) {
                if ((i13 == i14) == (i11 == i12)) {
                }
            }
            return true;
        }
        return false;
    }

    @k
    public static final AnnotatedString decapitalize(@k AnnotatedString annotatedString, @k final LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new q<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt$decapitalize$1
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return invoke(str, num.intValue(), num2.intValue());
            }

            public final String invoke(String str, int i11, int i12) {
                if (i11 == 0) {
                    String substring = str.substring(i11, i12);
                    kotlin.jvm.internal.g0.o(substring, "substring(...)");
                    return StringKt.decapitalize(substring, LocaleList.this);
                }
                String substring2 = str.substring(i11, i12);
                kotlin.jvm.internal.g0.o(substring2, "substring(...)");
                return substring2;
            }
        });
    }

    public static /* synthetic */ AnnotatedString decapitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return decapitalize(annotatedString, localeList);
    }

    @k
    public static final AnnotatedString emptyAnnotatedString() {
        return EmptyAnnotatedString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<AnnotatedString.Range<T>> filterRanges(List<? extends AnnotatedString.Range<? extends T>> list, int i11, int i12) {
        if (!(i11 <= i12)) {
            InlineClassHelperKt.throwIllegalArgumentException("start (" + i11 + ") should be less than or equal to end (" + i12 + ')');
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            AnnotatedString.Range<? extends T> range = list.get(i13);
            if (intersect(i11, i12, range.getStart(), range.getEnd())) {
                arrayList.add(new AnnotatedString.Range(range.getItem(), Math.max(i11, range.getStart()) - i11, Math.min(i12, range.getEnd()) - i11, range.getTag()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    private static final List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> getLocalAnnotations(AnnotatedString annotatedString, int i11, int i12, x00.l<? super AnnotatedString.Annotation, Boolean> lVar) {
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> annotations$ui_text_release;
        if (i11 == i12 || (annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release()) == null) {
            return null;
        }
        if (i11 != 0 || i12 < annotatedString.getText().length()) {
            ArrayList arrayList = new ArrayList(annotations$ui_text_release.size());
            int size = annotations$ui_text_release.size();
            for (int i13 = 0; i13 < size; i13++) {
                AnnotatedString.Range<? extends AnnotatedString.Annotation> range = annotations$ui_text_release.get(i13);
                if ((lVar != null ? lVar.invoke(range.getItem()).booleanValue() : true) && intersect(i11, i12, range.getStart(), range.getEnd())) {
                    arrayList.add(new AnnotatedString.Range(range.getItem(), u.I(range.getStart(), i11, i12) - i11, u.I(range.getEnd(), i11, i12) - i11, range.getTag()));
                }
            }
            return arrayList;
        }
        if (lVar == null) {
            return annotations$ui_text_release;
        }
        ArrayList arrayList2 = new ArrayList(annotations$ui_text_release.size());
        int size2 = annotations$ui_text_release.size();
        for (int i14 = 0; i14 < size2; i14++) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range2 = annotations$ui_text_release.get(i14);
            if (lVar.invoke(range2.getItem()).booleanValue()) {
                arrayList2.add(range2);
            }
        }
        return arrayList2;
    }

    public static /* synthetic */ List getLocalAnnotations$default(AnnotatedString annotatedString, int i11, int i12, x00.l lVar, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            lVar = null;
        }
        return getLocalAnnotations(annotatedString, i11, i12, lVar);
    }

    private static final List<AnnotatedString.Range<ParagraphStyle>> getLocalParagraphStyles(AnnotatedString annotatedString, int i11, int i12) {
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release;
        if (i11 == i12 || (paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release()) == null) {
            return null;
        }
        if (i11 == 0 && i12 >= annotatedString.getText().length()) {
            return paragraphStylesOrNull$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(paragraphStylesOrNull$ui_text_release.size());
        int size = paragraphStylesOrNull$ui_text_release.size();
        for (int i13 = 0; i13 < size; i13++) {
            AnnotatedString.Range<ParagraphStyle> range = paragraphStylesOrNull$ui_text_release.get(i13);
            if (intersect(i11, i12, range.getStart(), range.getEnd())) {
                ParagraphStyle item = range.getItem();
                int start = range.getStart();
                if (start < i11) {
                    start = i11;
                }
                if (start > i12) {
                    start = i12;
                }
                int i14 = start - i11;
                int end = range.getEnd();
                if (end < i11) {
                    end = i11;
                }
                if (end > i12) {
                    end = i12;
                }
                arrayList.add(new AnnotatedString.Range(item, i14, end - i11));
            }
        }
        return arrayList;
    }

    public static final boolean intersect(int i11, int i12, int i13, int i14) {
        return ((i11 < i14) & (i13 < i12)) | (((i11 == i12) | (i13 == i14)) & (i11 == i13));
    }

    @k
    public static final <T> List<T> mapEachParagraphStyle(@k AnnotatedString annotatedString, @k ParagraphStyle paragraphStyle, @k p<? super AnnotatedString, ? super AnnotatedString.Range<ParagraphStyle>, ? extends T> pVar) {
        List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles = normalizedParagraphStyles(annotatedString, paragraphStyle);
        ArrayList arrayList = new ArrayList(normalizedParagraphStyles.size());
        int size = normalizedParagraphStyles.size();
        for (int i11 = 0; i11 < size; i11++) {
            AnnotatedString.Range<ParagraphStyle> range = normalizedParagraphStyles.get(i11);
            arrayList.add(pVar.invoke(substringWithoutParagraphStyles(annotatedString, range.getStart(), range.getEnd()), range));
        }
        return arrayList;
    }

    @k
    public static final List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles(@k AnnotatedString annotatedString, @k ParagraphStyle paragraphStyle) {
        List J;
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release();
        if (paragraphStylesOrNull$ui_text_release == null || (J = r0.z5(paragraphStylesOrNull$ui_text_release, new Comparator() { // from class: androidx.compose.ui.text.AnnotatedStringKt$normalizedParagraphStyles$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return g.l(Integer.valueOf(((AnnotatedString.Range) t11).getStart()), Integer.valueOf(((AnnotatedString.Range) t12).getStart()));
            }
        })) == null) {
            J = h0.J();
        }
        ArrayList arrayList = new ArrayList();
        m mVar = new m();
        int size = J.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            AnnotatedString.Range range = (AnnotatedString.Range) J.get(i12);
            AnnotatedString.Range copy$default = AnnotatedString.Range.copy$default(range, paragraphStyle.merge((ParagraphStyle) range.getItem()), 0, 0, null, 14, null);
            while (i11 < copy$default.getStart() && !mVar.isEmpty()) {
                AnnotatedString.Range range2 = (AnnotatedString.Range) mVar.last();
                if (copy$default.getStart() < range2.getEnd()) {
                    arrayList.add(new AnnotatedString.Range(range2.getItem(), i11, copy$default.getStart()));
                    i11 = copy$default.getStart();
                } else {
                    arrayList.add(new AnnotatedString.Range(range2.getItem(), i11, range2.getEnd()));
                    i11 = range2.getEnd();
                    while (!mVar.isEmpty() && i11 == ((AnnotatedString.Range) mVar.last()).getEnd()) {
                        mVar.removeLast();
                    }
                }
            }
            if (i11 < copy$default.getStart()) {
                arrayList.add(new AnnotatedString.Range(paragraphStyle, i11, copy$default.getStart()));
                i11 = copy$default.getStart();
            }
            AnnotatedString.Range range3 = (AnnotatedString.Range) mVar.n();
            if (range3 == null) {
                mVar.add(new AnnotatedString.Range(copy$default.getItem(), copy$default.getStart(), copy$default.getEnd()));
            } else if (range3.getStart() == copy$default.getStart() && range3.getEnd() == copy$default.getEnd()) {
                mVar.removeLast();
                mVar.add(new AnnotatedString.Range(((ParagraphStyle) range3.getItem()).merge((ParagraphStyle) copy$default.getItem()), copy$default.getStart(), copy$default.getEnd()));
            } else if (range3.getStart() == range3.getEnd()) {
                arrayList.add(new AnnotatedString.Range(range3.getItem(), range3.getStart(), range3.getEnd()));
                mVar.removeLast();
                mVar.add(new AnnotatedString.Range(copy$default.getItem(), copy$default.getStart(), copy$default.getEnd()));
            } else {
                if (range3.getEnd() < copy$default.getEnd()) {
                    throw new IllegalArgumentException();
                }
                mVar.add(new AnnotatedString.Range(((ParagraphStyle) range3.getItem()).merge((ParagraphStyle) copy$default.getItem()), copy$default.getStart(), copy$default.getEnd()));
            }
        }
        while (i11 <= annotatedString.getText().length() && !mVar.isEmpty()) {
            AnnotatedString.Range range4 = (AnnotatedString.Range) mVar.last();
            arrayList.add(new AnnotatedString.Range(range4.getItem(), i11, range4.getEnd()));
            i11 = range4.getEnd();
            while (!mVar.isEmpty() && i11 == ((AnnotatedString.Range) mVar.last()).getEnd()) {
                mVar.removeLast();
            }
        }
        if (i11 < annotatedString.getText().length()) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, i11, annotatedString.getText().length()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, 0, 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString substringWithoutParagraphStyles(AnnotatedString annotatedString, int i11, int i12) {
        String str;
        if (i11 != i12) {
            str = annotatedString.getText().substring(i11, i12);
            kotlin.jvm.internal.g0.o(str, "substring(...)");
        } else {
            str = "";
        }
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> localAnnotations = getLocalAnnotations(annotatedString, i11, i12, new x00.l<AnnotatedString.Annotation, Boolean>() { // from class: androidx.compose.ui.text.AnnotatedStringKt$substringWithoutParagraphStyles$1
            @Override // x00.l
            public final Boolean invoke(AnnotatedString.Annotation annotation) {
                return Boolean.valueOf(!(annotation instanceof ParagraphStyle));
            }
        });
        if (localAnnotations == null) {
            localAnnotations = h0.J();
        }
        return new AnnotatedString(str, localAnnotations);
    }

    @k
    public static final AnnotatedString toLowerCase(@k AnnotatedString annotatedString, @k final LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new q<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt$toLowerCase$1
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return invoke(str, num.intValue(), num2.intValue());
            }

            public final String invoke(String str, int i11, int i12) {
                String substring = str.substring(i11, i12);
                kotlin.jvm.internal.g0.o(substring, "substring(...)");
                return StringKt.toLowerCase(substring, LocaleList.this);
            }
        });
    }

    public static /* synthetic */ AnnotatedString toLowerCase$default(AnnotatedString annotatedString, LocaleList localeList, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return toLowerCase(annotatedString, localeList);
    }

    @k
    public static final AnnotatedString toUpperCase(@k AnnotatedString annotatedString, @k final LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new q<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt$toUpperCase$1
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return invoke(str, num.intValue(), num2.intValue());
            }

            public final String invoke(String str, int i11, int i12) {
                String substring = str.substring(i11, i12);
                kotlin.jvm.internal.g0.o(substring, "substring(...)");
                return StringKt.toUpperCase(substring, LocaleList.this);
            }
        });
    }

    public static /* synthetic */ AnnotatedString toUpperCase$default(AnnotatedString annotatedString, LocaleList localeList, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return toUpperCase(annotatedString, localeList);
    }

    @k
    public static final <R> R withAnnotation(@k AnnotatedString.Builder builder, @k String str, @k String str2, @k x00.l<? super AnnotatedString.Builder, ? extends R> lVar) {
        int pushStringAnnotation = builder.pushStringAnnotation(str, str2);
        try {
            return lVar.invoke(builder);
        } finally {
            d0.d(1);
            builder.pop(pushStringAnnotation);
            d0.c(1);
        }
    }

    @k
    public static final <R> R withBulletListItem(@k AnnotatedString.Builder.BulletScope bulletScope, @l Bullet bullet, @k x00.l<? super AnnotatedString.Builder, ? extends R> lVar) {
        Bullet bullet2;
        Pair pair = (Pair) r0.A3(bulletScope.getBulletListSettingStack$ui_text_release());
        long m5318unboximpl = pair != null ? ((TextUnit) pair.getFirst()).m5318unboximpl() : BulletKt.getDefaultBulletIndentation();
        if (bullet != null) {
            bullet2 = bullet;
        } else if (pair == null || (bullet2 = (Bullet) pair.getSecond()) == null) {
            bullet2 = BulletKt.getDefaultBullet();
        }
        int pushStyle = bulletScope.getBuilder$ui_text_release().pushStyle(new ParagraphStyle(0, 0, 0L, new TextIndent(m5318unboximpl, m5318unboximpl, null), (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 503, (v) null));
        int pushBullet$ui_text_release = bulletScope.getBuilder$ui_text_release().pushBullet$ui_text_release(bullet2);
        try {
            return lVar.invoke(bulletScope.getBuilder$ui_text_release());
        } finally {
            bulletScope.getBuilder$ui_text_release().pop(pushBullet$ui_text_release);
            bulletScope.getBuilder$ui_text_release().pop(pushStyle);
        }
    }

    public static /* synthetic */ Object withBulletListItem$default(AnnotatedString.Builder.BulletScope bulletScope, Bullet bullet, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bullet = null;
        }
        return withBulletListItem(bulletScope, bullet, lVar);
    }

    @k
    public static final <R> R withLink(@k AnnotatedString.Builder builder, @k LinkAnnotation linkAnnotation, @k x00.l<? super AnnotatedString.Builder, ? extends R> lVar) {
        int pushLink = builder.pushLink(linkAnnotation);
        try {
            return lVar.invoke(builder);
        } finally {
            d0.d(1);
            builder.pop(pushLink);
            d0.c(1);
        }
    }

    @k
    public static final <R> R withStyle(@k AnnotatedString.Builder builder, @k SpanStyle spanStyle, @k x00.l<? super AnnotatedString.Builder, ? extends R> lVar) {
        int pushStyle = builder.pushStyle(spanStyle);
        try {
            return lVar.invoke(builder);
        } finally {
            d0.d(1);
            builder.pop(pushStyle);
            d0.c(1);
        }
    }

    @k
    public static final <R> R withAnnotation(@k AnnotatedString.Builder builder, @k TtsAnnotation ttsAnnotation, @k x00.l<? super AnnotatedString.Builder, ? extends R> lVar) {
        int pushTtsAnnotation = builder.pushTtsAnnotation(ttsAnnotation);
        try {
            return lVar.invoke(builder);
        } finally {
            d0.d(1);
            builder.pop(pushTtsAnnotation);
            d0.c(1);
        }
    }

    @k
    public static final <R> R withStyle(@k AnnotatedString.Builder builder, @k ParagraphStyle paragraphStyle, @k x00.l<? super AnnotatedString.Builder, ? extends R> lVar) {
        int pushStyle = builder.pushStyle(paragraphStyle);
        try {
            return lVar.invoke(builder);
        } finally {
            d0.d(1);
            builder.pop(pushStyle);
            d0.c(1);
        }
    }

    @k
    public static final AnnotatedString AnnotatedString(@k String str, @k ParagraphStyle paragraphStyle) {
        return new AnnotatedString(str, h0.J(), g0.l(new AnnotatedString.Range(paragraphStyle, 0, str.length())));
    }

    @ExperimentalTextApi
    @n(message = "Use LinkAnnotation API for links instead", replaceWith = @w0(expression = "withLink(, block)", imports = {}))
    @k
    public static final <R> R withAnnotation(@k AnnotatedString.Builder builder, @k UrlAnnotation urlAnnotation, @k x00.l<? super AnnotatedString.Builder, ? extends R> lVar) {
        int pushUrlAnnotation = builder.pushUrlAnnotation(urlAnnotation);
        try {
            return lVar.invoke(builder);
        } finally {
            d0.d(1);
            builder.pop(pushUrlAnnotation);
            d0.c(1);
        }
    }
}
