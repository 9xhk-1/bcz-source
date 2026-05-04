package androidx.compose.ui.text;

import a00.h0;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,546:1\n1#2:547\n*E\n"})
/* loaded from: classes2.dex */
public final class SaversKt {

    @k
    private static final Saver<AnnotatedString, Object> AnnotatedStringSaver = SaverKt.Saver(new p<SaverScope, AnnotatedString, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$1
        @Override // x00.p
        public final Object invoke(SaverScope saverScope, AnnotatedString annotatedString) {
            Saver saver;
            Object save = SaversKt.save(annotatedString.getText());
            List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release();
            saver = SaversKt.AnnotationRangeListSaver;
            return h0.t(save, SaversKt.save(annotations$ui_text_release, saver, saverScope));
        }
    }, new l<Object, AnnotatedString>() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.l
        public final AnnotatedString invoke(Object obj) {
            Saver saver;
            g0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(1);
            saver = SaversKt.AnnotationRangeListSaver;
            List list2 = ((!g0.g(obj2, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? (List) saver.restore(obj2) : null;
            Object obj3 = list.get(0);
            String str = obj3 != null ? (String) obj3 : null;
            g0.m(str);
            return new AnnotatedString((List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>>) list2, str);
        }
    });

    @k
    private static final Saver<List<AnnotatedString.Range<? extends Object>>, Object> AnnotationRangeListSaver = SaverKt.Saver(new p<SaverScope, List<? extends AnnotatedString.Range<? extends Object>>, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$1
        @Override // x00.p
        public final Object invoke(SaverScope saverScope, List<? extends AnnotatedString.Range<? extends Object>> list) {
            Saver saver;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                AnnotatedString.Range<? extends Object> range = list.get(i11);
                saver = SaversKt.AnnotationRangeSaver;
                arrayList.add(SaversKt.save(range, saver, saverScope));
            }
            return arrayList;
        }
    }, new l<Object, List<? extends AnnotatedString.Range<? extends Object>>>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$2
        @Override // x00.l
        public final List<? extends AnnotatedString.Range<? extends Object>> invoke(Object obj) {
            Saver saver;
            g0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj2 = list.get(i11);
                saver = SaversKt.AnnotationRangeSaver;
                AnnotatedString.Range range = null;
                if ((!g0.g(obj2, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) {
                    range = (AnnotatedString.Range) saver.restore(obj2);
                }
                g0.m(range);
                arrayList.add(range);
            }
            return arrayList;
        }
    });

    @k
    private static final Saver<AnnotatedString.Range<? extends Object>, Object> AnnotationRangeSaver = SaverKt.Saver(new p<SaverScope, AnnotatedString.Range<? extends Object>, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$1

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AnnotationType.values().length];
                try {
                    iArr[AnnotationType.Paragraph.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AnnotationType.Span.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AnnotationType.Url.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AnnotationType.Link.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AnnotationType.Clickable.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AnnotationType.String.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // x00.p
        public final Object invoke(SaverScope saverScope, AnnotatedString.Range<? extends Object> range) {
            AnnotationType annotationType;
            Object save;
            Saver saver;
            Saver saver2;
            Saver saver3;
            Saver saver4;
            Object item = range.getItem();
            if (item instanceof ParagraphStyle) {
                annotationType = AnnotationType.Paragraph;
            } else if (item instanceof SpanStyle) {
                annotationType = AnnotationType.Span;
            } else if (item instanceof VerbatimTtsAnnotation) {
                annotationType = AnnotationType.VerbatimTts;
            } else if (item instanceof UrlAnnotation) {
                annotationType = AnnotationType.Url;
            } else if (item instanceof LinkAnnotation.Url) {
                annotationType = AnnotationType.Link;
            } else if (item instanceof LinkAnnotation.Clickable) {
                annotationType = AnnotationType.Clickable;
            } else {
                if (!(item instanceof StringAnnotation)) {
                    throw new UnsupportedOperationException();
                }
                annotationType = AnnotationType.String;
            }
            switch (WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()]) {
                case 1:
                    Object item2 = range.getItem();
                    g0.n(item2, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                    save = SaversKt.save((ParagraphStyle) item2, SaversKt.getParagraphStyleSaver(), saverScope);
                    break;
                case 2:
                    Object item3 = range.getItem();
                    g0.n(item3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                    save = SaversKt.save((SpanStyle) item3, SaversKt.getSpanStyleSaver(), saverScope);
                    break;
                case 3:
                    Object item4 = range.getItem();
                    g0.n(item4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                    saver = SaversKt.VerbatimTtsAnnotationSaver;
                    save = SaversKt.save((VerbatimTtsAnnotation) item4, saver, saverScope);
                    break;
                case 4:
                    Object item5 = range.getItem();
                    g0.n(item5, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                    saver2 = SaversKt.UrlAnnotationSaver;
                    save = SaversKt.save((UrlAnnotation) item5, saver2, saverScope);
                    break;
                case 5:
                    Object item6 = range.getItem();
                    g0.n(item6, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                    saver3 = SaversKt.LinkSaver;
                    save = SaversKt.save((LinkAnnotation.Url) item6, saver3, saverScope);
                    break;
                case 6:
                    Object item7 = range.getItem();
                    g0.n(item7, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                    saver4 = SaversKt.ClickableSaver;
                    save = SaversKt.save((LinkAnnotation.Clickable) item7, saver4, saverScope);
                    break;
                case 7:
                    Object item8 = range.getItem();
                    g0.n(item8, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                    save = SaversKt.save(((StringAnnotation) item8).m4513unboximpl());
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return h0.t(SaversKt.save(annotationType), save, SaversKt.save(Integer.valueOf(range.getStart())), SaversKt.save(Integer.valueOf(range.getEnd())), SaversKt.save(range.getTag()));
        }
    }, new l<Object, AnnotatedString.Range<? extends Object>>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$2

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AnnotationType.values().length];
                try {
                    iArr[AnnotationType.Paragraph.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AnnotationType.Span.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AnnotationType.Url.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AnnotationType.Link.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AnnotationType.Clickable.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AnnotationType.String.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.l
        public final AnnotatedString.Range<? extends Object> invoke(Object obj) {
            Saver saver;
            Saver saver2;
            Saver saver3;
            Saver saver4;
            g0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ParagraphStyle paragraphStyle = null;
            r1 = null;
            LinkAnnotation.Clickable clickable = null;
            r1 = null;
            LinkAnnotation.Url url = null;
            r1 = null;
            UrlAnnotation urlAnnotation = null;
            r1 = null;
            VerbatimTtsAnnotation verbatimTtsAnnotation = null;
            r1 = null;
            SpanStyle restore = null;
            paragraphStyle = null;
            AnnotationType annotationType = obj2 != null ? (AnnotationType) obj2 : null;
            g0.m(annotationType);
            Object obj3 = list.get(2);
            Integer num = obj3 != null ? (Integer) obj3 : null;
            g0.m(num);
            int intValue = num.intValue();
            Object obj4 = list.get(3);
            Integer num2 = obj4 != null ? (Integer) obj4 : null;
            g0.m(num2);
            int intValue2 = num2.intValue();
            Object obj5 = list.get(4);
            String str = obj5 != null ? (String) obj5 : null;
            g0.m(str);
            switch (WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()]) {
                case 1:
                    Object obj6 = list.get(1);
                    Saver<ParagraphStyle, Object> paragraphStyleSaver = SaversKt.getParagraphStyleSaver();
                    if ((!g0.g(obj6, Boolean.FALSE) || (paragraphStyleSaver instanceof NonNullValueClassSaver)) && obj6 != null) {
                        paragraphStyle = paragraphStyleSaver.restore(obj6);
                    }
                    g0.m(paragraphStyle);
                    return new AnnotatedString.Range<>(paragraphStyle, intValue, intValue2, str);
                case 2:
                    Object obj7 = list.get(1);
                    Saver<SpanStyle, Object> spanStyleSaver = SaversKt.getSpanStyleSaver();
                    if ((!g0.g(obj7, Boolean.FALSE) || (spanStyleSaver instanceof NonNullValueClassSaver)) && obj7 != null) {
                        restore = spanStyleSaver.restore(obj7);
                    }
                    g0.m(restore);
                    return new AnnotatedString.Range<>(restore, intValue, intValue2, str);
                case 3:
                    Object obj8 = list.get(1);
                    saver = SaversKt.VerbatimTtsAnnotationSaver;
                    if ((!g0.g(obj8, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj8 != null) {
                        verbatimTtsAnnotation = (VerbatimTtsAnnotation) saver.restore(obj8);
                    }
                    g0.m(verbatimTtsAnnotation);
                    return new AnnotatedString.Range<>(verbatimTtsAnnotation, intValue, intValue2, str);
                case 4:
                    Object obj9 = list.get(1);
                    saver2 = SaversKt.UrlAnnotationSaver;
                    if ((!g0.g(obj9, Boolean.FALSE) || (saver2 instanceof NonNullValueClassSaver)) && obj9 != null) {
                        urlAnnotation = (UrlAnnotation) saver2.restore(obj9);
                    }
                    g0.m(urlAnnotation);
                    return new AnnotatedString.Range<>(urlAnnotation, intValue, intValue2, str);
                case 5:
                    Object obj10 = list.get(1);
                    saver3 = SaversKt.LinkSaver;
                    if ((!g0.g(obj10, Boolean.FALSE) || (saver3 instanceof NonNullValueClassSaver)) && obj10 != null) {
                        url = (LinkAnnotation.Url) saver3.restore(obj10);
                    }
                    g0.m(url);
                    return new AnnotatedString.Range<>(url, intValue, intValue2, str);
                case 6:
                    Object obj11 = list.get(1);
                    saver4 = SaversKt.ClickableSaver;
                    if ((!g0.g(obj11, Boolean.FALSE) || (saver4 instanceof NonNullValueClassSaver)) && obj11 != null) {
                        clickable = (LinkAnnotation.Clickable) saver4.restore(obj11);
                    }
                    g0.m(clickable);
                    return new AnnotatedString.Range<>(clickable, intValue, intValue2, str);
                case 7:
                    Object obj12 = list.get(1);
                    String str2 = obj12 != null ? (String) obj12 : null;
                    g0.m(str2);
                    return new AnnotatedString.Range<>(StringAnnotation.m4507boximpl(StringAnnotation.m4508constructorimpl(str2)), intValue, intValue2, str);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    });

    @k
    private static final Saver<VerbatimTtsAnnotation, Object> VerbatimTtsAnnotationSaver = SaverKt.Saver(new p<SaverScope, VerbatimTtsAnnotation, Object>() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$1
        @Override // x00.p
        public final Object invoke(SaverScope saverScope, VerbatimTtsAnnotation verbatimTtsAnnotation) {
            return SaversKt.save(verbatimTtsAnnotation.getVerbatim());
        }
    }, new l<Object, VerbatimTtsAnnotation>() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.l
        public final VerbatimTtsAnnotation invoke(Object obj) {
            String str = obj != null ? (String) obj : null;
            g0.m(str);
            return new VerbatimTtsAnnotation(str);
        }
    });

    @k
    private static final Saver<UrlAnnotation, Object> UrlAnnotationSaver = SaverKt.Saver(new p<SaverScope, UrlAnnotation, Object>() { // from class: androidx.compose.ui.text.SaversKt$UrlAnnotationSaver$1
        @Override // x00.p
        public final Object invoke(SaverScope saverScope, UrlAnnotation urlAnnotation) {
            return SaversKt.save(urlAnnotation.getUrl());
        }
    }, new l<Object, UrlAnnotation>() { // from class: androidx.compose.ui.text.SaversKt$UrlAnnotationSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.l
        public final UrlAnnotation invoke(Object obj) {
            String str = obj != null ? (String) obj : null;
            g0.m(str);
            return new UrlAnnotation(str);
        }
    });

    @k
    private static final Saver<LinkAnnotation.Url, Object> LinkSaver = SaverKt.Saver(new p<SaverScope, LinkAnnotation.Url, Object>() { // from class: androidx.compose.ui.text.SaversKt$LinkSaver$1
        @Override // x00.p
        public final Object invoke(SaverScope saverScope, LinkAnnotation.Url url) {
            return h0.t(SaversKt.save(url.getUrl()), SaversKt.save(url.getStyles(), SaversKt.getTextLinkStylesSaver(), saverScope));
        }
    }, new l<Object, LinkAnnotation.Url>() { // from class: androidx.compose.ui.text.SaversKt$LinkSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.l
        public final LinkAnnotation.Url invoke(Object obj) {
            g0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            TextLinkStyles textLinkStyles = null;
            String str = obj2 != null ? (String) obj2 : null;
            g0.m(str);
            Object obj3 = list.get(1);
            Saver<TextLinkStyles, Object> textLinkStylesSaver = SaversKt.getTextLinkStylesSaver();
            if ((!g0.g(obj3, Boolean.FALSE) || (textLinkStylesSaver instanceof NonNullValueClassSaver)) && obj3 != null) {
                textLinkStyles = textLinkStylesSaver.restore(obj3);
            }
            return new LinkAnnotation.Url(str, textLinkStyles, null, 4, null);
        }
    });

    @k
    private static final Saver<LinkAnnotation.Clickable, Object> ClickableSaver = SaverKt.Saver(new p<SaverScope, LinkAnnotation.Clickable, Object>() { // from class: androidx.compose.ui.text.SaversKt$ClickableSaver$1
        @Override // x00.p
        public final Object invoke(SaverScope saverScope, LinkAnnotation.Clickable clickable) {
            return h0.t(SaversKt.save(clickable.getTag()), SaversKt.save(clickable.getStyles(), SaversKt.getTextLinkStylesSaver(), saverScope));
        }
    }, new l<Object, LinkAnnotation.Clickable>() { // from class: androidx.compose.ui.text.SaversKt$ClickableSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.l
        public final LinkAnnotation.Clickable invoke(Object obj) {
            g0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            String str = obj2 != null ? (String) obj2 : null;
            g0.m(str);
            Object obj3 = list.get(1);
            Saver<TextLinkStyles, Object> textLinkStylesSaver = SaversKt.getTextLinkStylesSaver();
            return new LinkAnnotation.Clickable(str, ((!g0.g(obj3, Boolean.FALSE) || (textLinkStylesSaver instanceof NonNullValueClassSaver)) && obj3 != null) ? textLinkStylesSaver.restore(obj3) : null, null);
        }
    });

    @k
    private static final Saver<ParagraphStyle, Object> ParagraphStyleSaver = SaverKt.Saver(new p<SaverScope, ParagraphStyle, Object>() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$1
        @Override // x00.p
        public final Object invoke(SaverScope saverScope, ParagraphStyle paragraphStyle) {
            return h0.t(SaversKt.save(TextAlign.m4970boximpl(paragraphStyle.m4454getTextAligne0LSkKk())), SaversKt.save(TextDirection.m4984boximpl(paragraphStyle.m4456getTextDirections_7Xco())), SaversKt.save(TextUnit.m5299boximpl(paragraphStyle.m4452getLineHeightXSAIIZE()), SaversKt.getSaver(TextUnit.Companion), saverScope), SaversKt.save(paragraphStyle.getTextIndent(), SaversKt.getSaver(TextIndent.Companion), saverScope), SaversKt.save(paragraphStyle.getPlatformStyle(), Savers_androidKt.getSaver(PlatformParagraphStyle.Companion), saverScope), SaversKt.save(paragraphStyle.getLineHeightStyle(), SaversKt.getSaver(LineHeightStyle.Companion), saverScope), SaversKt.save(LineBreak.m4878boximpl(paragraphStyle.m4451getLineBreakrAG3T2k()), Savers_androidKt.getSaver(LineBreak.Companion), saverScope), SaversKt.save(Hyphens.m4868boximpl(paragraphStyle.m4449getHyphensvmbZdU8())), SaversKt.save(paragraphStyle.getTextMotion(), Savers_androidKt.getSaver(TextMotion.Companion), saverScope));
        }
    }, new l<Object, ParagraphStyle>() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.l
        public final ParagraphStyle invoke(Object obj) {
            g0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            TextMotion textMotion = null;
            TextAlign textAlign = obj2 != null ? (TextAlign) obj2 : null;
            g0.m(textAlign);
            int m4976unboximpl = textAlign.m4976unboximpl();
            Object obj3 = list.get(1);
            TextDirection textDirection = obj3 != null ? (TextDirection) obj3 : null;
            g0.m(textDirection);
            int m4990unboximpl = textDirection.m4990unboximpl();
            Object obj4 = list.get(2);
            Saver<TextUnit, Object> saver = SaversKt.getSaver(TextUnit.Companion);
            Boolean bool = Boolean.FALSE;
            TextUnit restore = ((!g0.g(obj4, bool) || (saver instanceof NonNullValueClassSaver)) && obj4 != null) ? saver.restore(obj4) : null;
            g0.m(restore);
            long m5318unboximpl = restore.m5318unboximpl();
            Object obj5 = list.get(3);
            Saver<TextIndent, Object> saver2 = SaversKt.getSaver(TextIndent.Companion);
            TextIndent restore2 = ((!g0.g(obj5, bool) || (saver2 instanceof NonNullValueClassSaver)) && obj5 != null) ? saver2.restore(obj5) : null;
            Object obj6 = list.get(4);
            Saver<PlatformParagraphStyle, Object> saver3 = Savers_androidKt.getSaver(PlatformParagraphStyle.Companion);
            PlatformParagraphStyle restore3 = ((!g0.g(obj6, bool) || (saver3 instanceof NonNullValueClassSaver)) && obj6 != null) ? saver3.restore(obj6) : null;
            Object obj7 = list.get(5);
            Saver<LineHeightStyle, Object> saver4 = SaversKt.getSaver(LineHeightStyle.Companion);
            LineHeightStyle restore4 = ((!g0.g(obj7, bool) || (saver4 instanceof NonNullValueClassSaver)) && obj7 != null) ? saver4.restore(obj7) : null;
            Object obj8 = list.get(6);
            Saver<LineBreak, Object> saver5 = Savers_androidKt.getSaver(LineBreak.Companion);
            LineBreak restore5 = ((!g0.g(obj8, bool) || (saver5 instanceof NonNullValueClassSaver)) && obj8 != null) ? saver5.restore(obj8) : null;
            g0.m(restore5);
            int m4890unboximpl = restore5.m4890unboximpl();
            Object obj9 = list.get(7);
            Hyphens hyphens = obj9 != null ? (Hyphens) obj9 : null;
            g0.m(hyphens);
            int m4874unboximpl = hyphens.m4874unboximpl();
            Object obj10 = list.get(8);
            Saver<TextMotion, Object> saver6 = Savers_androidKt.getSaver(TextMotion.Companion);
            if ((!g0.g(obj10, bool) || (saver6 instanceof NonNullValueClassSaver)) && obj10 != null) {
                textMotion = saver6.restore(obj10);
            }
            return new ParagraphStyle(m4976unboximpl, m4990unboximpl, m5318unboximpl, restore2, restore3, restore4, m4890unboximpl, m4874unboximpl, textMotion, (v) null);
        }
    });

    @k
    private static final Saver<SpanStyle, Object> SpanStyleSaver = SaverKt.Saver(new p<SaverScope, SpanStyle, Object>() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$1
        @Override // x00.p
        public final Object invoke(SaverScope saverScope, SpanStyle spanStyle) {
            Color m2499boximpl = Color.m2499boximpl(spanStyle.m4500getColor0d7_KjU());
            Color.Companion companion = Color.Companion;
            Object save = SaversKt.save(m2499boximpl, SaversKt.getSaver(companion), saverScope);
            TextUnit m5299boximpl = TextUnit.m5299boximpl(spanStyle.m4501getFontSizeXSAIIZE());
            TextUnit.Companion companion2 = TextUnit.Companion;
            return h0.t(save, SaversKt.save(m5299boximpl, SaversKt.getSaver(companion2), saverScope), SaversKt.save(spanStyle.getFontWeight(), SaversKt.getSaver(FontWeight.Companion), saverScope), SaversKt.save(spanStyle.m4502getFontStyle4Lr2A7w()), SaversKt.save(spanStyle.m4503getFontSynthesisZQGJjVo()), SaversKt.save(-1), SaversKt.save(spanStyle.getFontFeatureSettings()), SaversKt.save(TextUnit.m5299boximpl(spanStyle.m4504getLetterSpacingXSAIIZE()), SaversKt.getSaver(companion2), saverScope), SaversKt.save(spanStyle.m4499getBaselineShift5SSeXJ0(), SaversKt.getSaver(BaselineShift.Companion), saverScope), SaversKt.save(spanStyle.getTextGeometricTransform(), SaversKt.getSaver(TextGeometricTransform.Companion), saverScope), SaversKt.save(spanStyle.getLocaleList(), SaversKt.getSaver(LocaleList.Companion), saverScope), SaversKt.save(Color.m2499boximpl(spanStyle.m4498getBackground0d7_KjU()), SaversKt.getSaver(companion), saverScope), SaversKt.save(spanStyle.getTextDecoration(), SaversKt.getSaver(TextDecoration.Companion), saverScope), SaversKt.save(spanStyle.getShadow(), SaversKt.getSaver(Shadow.Companion), saverScope));
        }
    }, new l<Object, SpanStyle>() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$2
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 androidx.compose.ui.text.SpanStyle, still in use, count: 2, list:
              (r1v1 androidx.compose.ui.text.SpanStyle) from 0x00d8: MOVE (r16v2 androidx.compose.ui.text.SpanStyle) = (r1v1 androidx.compose.ui.text.SpanStyle)
              (r1v1 androidx.compose.ui.text.SpanStyle) from 0x00d0: MOVE (r16v7 androidx.compose.ui.text.SpanStyle) = (r1v1 androidx.compose.ui.text.SpanStyle)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
            	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.l
        public final androidx.compose.ui.text.SpanStyle invoke(java.lang.Object r29) {
            /*
                Method dump skipped, instructions count: 450
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.SaversKt$SpanStyleSaver$2.invoke(java.lang.Object):androidx.compose.ui.text.SpanStyle");
        }
    });

    @k
    private static final Saver<TextLinkStyles, Object> TextLinkStylesSaver = SaverKt.Saver(new p<SaverScope, TextLinkStyles, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextLinkStylesSaver$1
        @Override // x00.p
        public final Object invoke(SaverScope saverScope, TextLinkStyles textLinkStyles) {
            return h0.t(SaversKt.save(textLinkStyles.getStyle(), SaversKt.getSpanStyleSaver(), saverScope), SaversKt.save(textLinkStyles.getFocusedStyle(), SaversKt.getSpanStyleSaver(), saverScope), SaversKt.save(textLinkStyles.getHoveredStyle(), SaversKt.getSpanStyleSaver(), saverScope), SaversKt.save(textLinkStyles.getPressedStyle(), SaversKt.getSpanStyleSaver(), saverScope));
        }
    }, new l<Object, TextLinkStyles>() { // from class: androidx.compose.ui.text.SaversKt$TextLinkStylesSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.l
        public final TextLinkStyles invoke(Object obj) {
            g0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Saver<SpanStyle, Object> spanStyleSaver = SaversKt.getSpanStyleSaver();
            Boolean bool = Boolean.FALSE;
            SpanStyle spanStyle = null;
            SpanStyle restore = ((!g0.g(obj2, bool) || (spanStyleSaver instanceof NonNullValueClassSaver)) && obj2 != null) ? spanStyleSaver.restore(obj2) : null;
            Object obj3 = list.get(1);
            Saver<SpanStyle, Object> spanStyleSaver2 = SaversKt.getSpanStyleSaver();
            SpanStyle restore2 = ((!g0.g(obj3, bool) || (spanStyleSaver2 instanceof NonNullValueClassSaver)) && obj3 != null) ? spanStyleSaver2.restore(obj3) : null;
            Object obj4 = list.get(2);
            Saver<SpanStyle, Object> spanStyleSaver3 = SaversKt.getSpanStyleSaver();
            SpanStyle restore3 = ((!g0.g(obj4, bool) || (spanStyleSaver3 instanceof NonNullValueClassSaver)) && obj4 != null) ? spanStyleSaver3.restore(obj4) : null;
            Object obj5 = list.get(3);
            Saver<SpanStyle, Object> spanStyleSaver4 = SaversKt.getSpanStyleSaver();
            if ((!g0.g(obj5, bool) || (spanStyleSaver4 instanceof NonNullValueClassSaver)) && obj5 != null) {
                spanStyle = spanStyleSaver4.restore(obj5);
            }
            return new TextLinkStyles(restore, restore2, restore3, spanStyle);
        }
    });

    @k
    private static final Saver<TextDecoration, Object> TextDecorationSaver = SaverKt.Saver(new p<SaverScope, TextDecoration, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$1
        @Override // x00.p
        public final Object invoke(SaverScope saverScope, TextDecoration textDecoration) {
            return Integer.valueOf(textDecoration.getMask());
        }
    }, new l<Object, TextDecoration>() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.l
        public final TextDecoration invoke(Object obj) {
            g0.n(obj, "null cannot be cast to non-null type kotlin.Int");
            return new TextDecoration(((Integer) obj).intValue());
        }
    });

    @k
    private static final Saver<TextGeometricTransform, Object> TextGeometricTransformSaver = SaverKt.Saver(new p<SaverScope, TextGeometricTransform, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$1
        @Override // x00.p
        public final Object invoke(SaverScope saverScope, TextGeometricTransform textGeometricTransform) {
            return h0.t(Float.valueOf(textGeometricTransform.getScaleX()), Float.valueOf(textGeometricTransform.getSkewX()));
        }
    }, new l<Object, TextGeometricTransform>() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.l
        public final TextGeometricTransform invoke(Object obj) {
            g0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
            List list = (List) obj;
            return new TextGeometricTransform(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
        }
    });

    @k
    private static final Saver<TextIndent, Object> TextIndentSaver = SaverKt.Saver(new p<SaverScope, TextIndent, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$1
        @Override // x00.p
        public final Object invoke(SaverScope saverScope, TextIndent textIndent) {
            TextUnit m5299boximpl = TextUnit.m5299boximpl(textIndent.m5001getFirstLineXSAIIZE());
            TextUnit.Companion companion = TextUnit.Companion;
            return h0.t(SaversKt.save(m5299boximpl, SaversKt.getSaver(companion), saverScope), SaversKt.save(TextUnit.m5299boximpl(textIndent.m5002getRestLineXSAIIZE()), SaversKt.getSaver(companion), saverScope));
        }
    }, new l<Object, TextIndent>() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.l
        public final TextIndent invoke(Object obj) {
            g0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            TextUnit.Companion companion = TextUnit.Companion;
            Saver<TextUnit, Object> saver = SaversKt.getSaver(companion);
            Boolean bool = Boolean.FALSE;
            TextUnit textUnit = null;
            TextUnit restore = ((!g0.g(obj2, bool) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? saver.restore(obj2) : null;
            g0.m(restore);
            long m5318unboximpl = restore.m5318unboximpl();
            Object obj3 = list.get(1);
            Saver<TextUnit, Object> saver2 = SaversKt.getSaver(companion);
            if ((!g0.g(obj3, bool) || (saver2 instanceof NonNullValueClassSaver)) && obj3 != null) {
                textUnit = saver2.restore(obj3);
            }
            g0.m(textUnit);
            return new TextIndent(m5318unboximpl, textUnit.m5318unboximpl(), null);
        }
    });

    @k
    private static final Saver<FontWeight, Object> FontWeightSaver = SaverKt.Saver(new p<SaverScope, FontWeight, Object>() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$1
        @Override // x00.p
        public final Object invoke(SaverScope saverScope, FontWeight fontWeight) {
            return Integer.valueOf(fontWeight.getWeight());
        }
    }, new l<Object, FontWeight>() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.l
        public final FontWeight invoke(Object obj) {
            g0.n(obj, "null cannot be cast to non-null type kotlin.Int");
            return new FontWeight(((Integer) obj).intValue());
        }
    });

    @k
    private static final Saver<BaselineShift, Object> BaselineShiftSaver = SaverKt.Saver(new p<SaverScope, BaselineShift, Object>() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$1
        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, BaselineShift baselineShift) {
            return m4478invoke8a2Sb4w(saverScope, baselineShift.m4855unboximpl());
        }

        /* renamed from: invoke-8a2Sb4w, reason: not valid java name */
        public final Object m4478invoke8a2Sb4w(SaverScope saverScope, float f11) {
            return Float.valueOf(f11);
        }
    }, new l<Object, BaselineShift>() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$2
        @Override // x00.l
        /* renamed from: invoke-jTk7eUs, reason: not valid java name and merged with bridge method [inline-methods] */
        public final BaselineShift invoke(Object obj) {
            g0.n(obj, "null cannot be cast to non-null type kotlin.Float");
            return BaselineShift.m4849boximpl(BaselineShift.m4850constructorimpl(((Float) obj).floatValue()));
        }
    });

    @k
    private static final Saver<TextRange, Object> TextRangeSaver = SaverKt.Saver(new p<SaverScope, TextRange, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$1
        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, TextRange textRange) {
            return m4484invokeFDrldGo(saverScope, textRange.m4563unboximpl());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke-FDrldGo, reason: not valid java name */
        public final Object m4484invokeFDrldGo(SaverScope saverScope, long j11) {
            return h0.t(SaversKt.save(Integer.valueOf(TextRange.m4559getStartimpl(j11))), SaversKt.save(Integer.valueOf(TextRange.m4554getEndimpl(j11))));
        }
    }, new l<Object, TextRange>() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$2
        @Override // x00.l
        /* renamed from: invoke-VqIyPBM, reason: not valid java name and merged with bridge method [inline-methods] */
        public final TextRange invoke(Object obj) {
            g0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Integer num = obj2 != null ? (Integer) obj2 : null;
            g0.m(num);
            int intValue = num.intValue();
            Object obj3 = list.get(1);
            Integer num2 = obj3 != null ? (Integer) obj3 : null;
            g0.m(num2);
            return TextRange.m4547boximpl(TextRangeKt.TextRange(intValue, num2.intValue()));
        }
    });

    @k
    private static final Saver<Shadow, Object> ShadowSaver = SaverKt.Saver(new p<SaverScope, Shadow, Object>() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$1
        @Override // x00.p
        public final Object invoke(SaverScope saverScope, Shadow shadow) {
            return h0.t(SaversKt.save(Color.m2499boximpl(shadow.m2834getColor0d7_KjU()), SaversKt.getSaver(Color.Companion), saverScope), SaversKt.save(Offset.m2257boximpl(shadow.m2835getOffsetF1C5BW0()), SaversKt.getSaver(Offset.Companion), saverScope), SaversKt.save(Float.valueOf(shadow.getBlurRadius())));
        }
    }, new l<Object, Shadow>() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.l
        public final Shadow invoke(Object obj) {
            g0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Saver<Color, Object> saver = SaversKt.getSaver(Color.Companion);
            Boolean bool = Boolean.FALSE;
            Color restore = ((!g0.g(obj2, bool) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? saver.restore(obj2) : null;
            g0.m(restore);
            long m2519unboximpl = restore.m2519unboximpl();
            Object obj3 = list.get(1);
            Saver<Offset, Object> saver2 = SaversKt.getSaver(Offset.Companion);
            Offset restore2 = ((!g0.g(obj3, bool) || (saver2 instanceof NonNullValueClassSaver)) && obj3 != null) ? saver2.restore(obj3) : null;
            g0.m(restore2);
            long m2278unboximpl = restore2.m2278unboximpl();
            Object obj4 = list.get(2);
            Float f11 = obj4 != null ? (Float) obj4 : null;
            g0.m(f11);
            return new Shadow(m2519unboximpl, m2278unboximpl, f11.floatValue(), null);
        }
    });

    @k
    private static final NonNullValueClassSaver<Color, Object> ColorSaver = NonNullValueClassSaver(new p<SaverScope, Color, Object>() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$1
        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, Color color) {
            return m4480invoke4WTKRHQ(saverScope, color.m2519unboximpl());
        }

        /* renamed from: invoke-4WTKRHQ, reason: not valid java name */
        public final Object m4480invoke4WTKRHQ(SaverScope saverScope, long j11) {
            return j11 == 16 ? Boolean.FALSE : Integer.valueOf(ColorKt.m2563toArgb8_81llA(j11));
        }
    }, new l<Object, Color>() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$2
        @Override // x00.l
        /* renamed from: invoke-ijrfgN4, reason: not valid java name and merged with bridge method [inline-methods] */
        public final Color invoke(Object obj) {
            if (g0.g(obj, Boolean.FALSE)) {
                return Color.m2499boximpl(Color.Companion.m2545getUnspecified0d7_KjU());
            }
            g0.n(obj, "null cannot be cast to non-null type kotlin.Int");
            return Color.m2499boximpl(ColorKt.Color(((Integer) obj).intValue()));
        }
    });

    @k
    private static final NonNullValueClassSaver<TextUnit, Object> TextUnitSaver = NonNullValueClassSaver(new p<SaverScope, TextUnit, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$1
        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, TextUnit textUnit) {
            return m4486invokempE4wyQ(saverScope, textUnit.m5318unboximpl());
        }

        /* renamed from: invoke-mpE4wyQ, reason: not valid java name */
        public final Object m4486invokempE4wyQ(SaverScope saverScope, long j11) {
            return TextUnit.m5306equalsimpl0(j11, TextUnit.Companion.m5320getUnspecifiedXSAIIZE()) ? Boolean.FALSE : h0.t(SaversKt.save(Float.valueOf(TextUnit.m5309getValueimpl(j11))), SaversKt.save(TextUnitType.m5334boximpl(TextUnit.m5308getTypeUIouoOA(j11))));
        }
    }, new l<Object, TextUnit>() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$2
        @Override // x00.l
        /* renamed from: invoke-XNhUCwk, reason: not valid java name and merged with bridge method [inline-methods] */
        public final TextUnit invoke(Object obj) {
            if (g0.g(obj, Boolean.FALSE)) {
                return TextUnit.m5299boximpl(TextUnit.Companion.m5320getUnspecifiedXSAIIZE());
            }
            g0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f11 = obj2 != null ? (Float) obj2 : null;
            g0.m(f11);
            float floatValue = f11.floatValue();
            Object obj3 = list.get(1);
            TextUnitType textUnitType = obj3 != null ? (TextUnitType) obj3 : null;
            g0.m(textUnitType);
            return TextUnit.m5299boximpl(TextUnitKt.m5321TextUnitanM5pPY(floatValue, textUnitType.m5340unboximpl()));
        }
    });

    @k
    private static final NonNullValueClassSaver<Offset, Object> OffsetSaver = NonNullValueClassSaver(new p<SaverScope, Offset, Object>() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$1
        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, Offset offset) {
            return m4482invokeUv8p0NA(saverScope, offset.m2278unboximpl());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
        public final Object m4482invokeUv8p0NA(SaverScope saverScope, long j11) {
            return Offset.m2265equalsimpl0(j11, Offset.Companion.m2283getUnspecifiedF1C5BW0()) ? Boolean.FALSE : h0.t(SaversKt.save(Float.valueOf(Float.intBitsToFloat((int) (j11 >> 32)))), SaversKt.save(Float.valueOf(Float.intBitsToFloat((int) (j11 & 4294967295L)))));
        }
    }, new l<Object, Offset>() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$2
        @Override // x00.l
        /* renamed from: invoke-x-9fifI, reason: not valid java name and merged with bridge method [inline-methods] */
        public final Offset invoke(Object obj) {
            if (g0.g(obj, Boolean.FALSE)) {
                return Offset.m2257boximpl(Offset.Companion.m2283getUnspecifiedF1C5BW0());
            }
            g0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f11 = obj2 != null ? (Float) obj2 : null;
            g0.m(f11);
            float floatValue = f11.floatValue();
            Object obj3 = list.get(1);
            g0.m(obj3 != null ? (Float) obj3 : null);
            return Offset.m2257boximpl(Offset.m2260constructorimpl((Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(r1.floatValue()) & 4294967295L)));
        }
    });

    @k
    private static final Saver<LocaleList, Object> LocaleListSaver = SaverKt.Saver(new p<SaverScope, LocaleList, Object>() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$1
        @Override // x00.p
        public final Object invoke(SaverScope saverScope, LocaleList localeList) {
            List<Locale> localeList2 = localeList.getLocaleList();
            ArrayList arrayList = new ArrayList(localeList2.size());
            int size = localeList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(SaversKt.save(localeList2.get(i11), SaversKt.getSaver(Locale.Companion), saverScope));
            }
            return arrayList;
        }
    }, new l<Object, LocaleList>() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.l
        public final LocaleList invoke(Object obj) {
            g0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj2 = list.get(i11);
                Saver<Locale, Object> saver = SaversKt.getSaver(Locale.Companion);
                Locale locale = null;
                if ((!g0.g(obj2, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) {
                    locale = saver.restore(obj2);
                }
                g0.m(locale);
                arrayList.add(locale);
            }
            return new LocaleList(arrayList);
        }
    });

    @k
    private static final Saver<Locale, Object> LocaleSaver = SaverKt.Saver(new p<SaverScope, Locale, Object>() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$1
        @Override // x00.p
        public final Object invoke(SaverScope saverScope, Locale locale) {
            return locale.toLanguageTag();
        }
    }, new l<Object, Locale>() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.l
        public final Locale invoke(Object obj) {
            g0.n(obj, "null cannot be cast to non-null type kotlin.String");
            return new Locale((String) obj);
        }
    });

    @k
    private static final Saver<LineHeightStyle, Object> LineHeightStyleSaver = SaverKt.Saver(new p<SaverScope, LineHeightStyle, Object>() { // from class: androidx.compose.ui.text.SaversKt$LineHeightStyleSaver$1
        @Override // x00.p
        public final Object invoke(SaverScope saverScope, LineHeightStyle lineHeightStyle) {
            return h0.t(SaversKt.save(LineHeightStyle.Alignment.m4937boximpl(lineHeightStyle.m4934getAlignmentPIaL0Z0())), SaversKt.save(LineHeightStyle.Trim.m4957boximpl(lineHeightStyle.m4936getTrimEVpEnUU())), SaversKt.save(LineHeightStyle.Mode.m4948boximpl(lineHeightStyle.m4935getModelzQqcRY())));
        }
    }, new l<Object, LineHeightStyle>() { // from class: androidx.compose.ui.text.SaversKt$LineHeightStyleSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.l
        public final LineHeightStyle invoke(Object obj) {
            g0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            LineHeightStyle.Alignment alignment = obj2 != null ? (LineHeightStyle.Alignment) obj2 : null;
            g0.m(alignment);
            float m4943unboximpl = alignment.m4943unboximpl();
            Object obj3 = list.get(1);
            LineHeightStyle.Trim trim = obj3 != null ? (LineHeightStyle.Trim) obj3 : null;
            g0.m(trim);
            int m4965unboximpl = trim.m4965unboximpl();
            Object obj4 = list.get(2);
            LineHeightStyle.Mode mode = obj4 != null ? (LineHeightStyle.Mode) obj4 : null;
            g0.m(mode);
            return new LineHeightStyle(m4943unboximpl, m4965unboximpl, mode.m4954unboximpl(), null);
        }
    });

    private static final <Original, Saveable> NonNullValueClassSaver<Original, Saveable> NonNullValueClassSaver(final p<? super SaverScope, ? super Original, ? extends Saveable> pVar, final l<? super Saveable, ? extends Original> lVar) {
        return new NonNullValueClassSaver<Original, Saveable>() { // from class: androidx.compose.ui.text.SaversKt$NonNullValueClassSaver$1
            @Override // androidx.compose.runtime.saveable.Saver
            public Original restore(Saveable saveable) {
                return lVar.invoke(saveable);
            }

            @Override // androidx.compose.runtime.saveable.Saver
            public Saveable save(SaverScope saverScope, Original original) {
                return pVar.invoke(saverScope, original);
            }
        };
    }

    @k
    public static final Saver<AnnotatedString, Object> getAnnotatedStringSaver() {
        return AnnotatedStringSaver;
    }

    @k
    public static final Saver<ParagraphStyle, Object> getParagraphStyleSaver() {
        return ParagraphStyleSaver;
    }

    @k
    public static final Saver<TextDecoration, Object> getSaver(@k TextDecoration.Companion companion) {
        return TextDecorationSaver;
    }

    @k
    public static final Saver<SpanStyle, Object> getSpanStyleSaver() {
        return SpanStyleSaver;
    }

    @k
    public static final Saver<TextLinkStyles, Object> getTextLinkStylesSaver() {
        return TextLinkStylesSaver;
    }

    public static final /* synthetic */ <T extends Saver<Original, Saveable>, Original, Saveable, Result> Result restore(Saveable saveable, T t11) {
        if ((g0.g(saveable, Boolean.FALSE) && !(t11 instanceof NonNullValueClassSaver)) || saveable == null) {
            return null;
        }
        Result result = (Result) t11.restore(saveable);
        g0.y(1, "Result");
        return result;
    }

    @m80.l
    public static final <T> T save(@m80.l T t11) {
        return t11;
    }

    @k
    public static final Saver<TextGeometricTransform, Object> getSaver(@k TextGeometricTransform.Companion companion) {
        return TextGeometricTransformSaver;
    }

    @k
    public static final <T extends Saver<Original, Saveable>, Original, Saveable> Object save(@m80.l Original original, @k T t11, @k SaverScope saverScope) {
        Object save;
        return (original == null || (save = t11.save(saverScope, original)) == null) ? Boolean.FALSE : save;
    }

    @k
    public static final Saver<TextIndent, Object> getSaver(@k TextIndent.Companion companion) {
        return TextIndentSaver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <Result> Result restore(Object obj) {
        if (obj == 0) {
            return null;
        }
        g0.y(1, "Result");
        return obj;
    }

    @k
    public static final Saver<FontWeight, Object> getSaver(@k FontWeight.Companion companion) {
        return FontWeightSaver;
    }

    @k
    public static final Saver<BaselineShift, Object> getSaver(@k BaselineShift.Companion companion) {
        return BaselineShiftSaver;
    }

    @k
    public static final Saver<TextRange, Object> getSaver(@k TextRange.Companion companion) {
        return TextRangeSaver;
    }

    @k
    public static final Saver<Shadow, Object> getSaver(@k Shadow.Companion companion) {
        return ShadowSaver;
    }

    @k
    public static final Saver<Color, Object> getSaver(@k Color.Companion companion) {
        return ColorSaver;
    }

    @k
    public static final Saver<TextUnit, Object> getSaver(@k TextUnit.Companion companion) {
        return TextUnitSaver;
    }

    @k
    public static final Saver<Offset, Object> getSaver(@k Offset.Companion companion) {
        return OffsetSaver;
    }

    @k
    public static final Saver<LocaleList, Object> getSaver(@k LocaleList.Companion companion) {
        return LocaleListSaver;
    }

    @k
    public static final Saver<Locale, Object> getSaver(@k Locale.Companion companion) {
        return LocaleSaver;
    }

    @k
    public static final Saver<LineHeightStyle, Object> getSaver(@k LineHeightStyle.Companion companion) {
        return LineHeightStyleSaver;
    }

    private static /* synthetic */ void getAnnotationRangeSaver$annotations() {
    }

    private static /* synthetic */ void getUrlAnnotationSaver$annotations() {
    }
}
