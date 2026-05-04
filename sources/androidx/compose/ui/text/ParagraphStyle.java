package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.j;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@u0({"SMAP\nParagraphStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParagraphStyle.kt\nandroidx/compose/ui/text/ParagraphStyle\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,531:1\n77#2,8:532\n*S KotlinDebug\n*F\n+ 1 ParagraphStyle.kt\nandroidx/compose/ui/text/ParagraphStyle\n*L\n208#1:532,8\n*E\n"})
/* loaded from: classes2.dex */
public final class ParagraphStyle implements AnnotatedString.Annotation {
    public static final int $stable = 0;
    private final int hyphens;
    private final int lineBreak;
    private final long lineHeight;

    @l
    private final LineHeightStyle lineHeightStyle;

    @l
    private final PlatformParagraphStyle platformStyle;
    private final int textAlign;
    private final int textDirection;

    @l
    private final TextIndent textIndent;

    @l
    private final TextMotion textMotion;

    public /* synthetic */ ParagraphStyle(int i11, int i12, long j11, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i13, int i14, TextMotion textMotion, v vVar) {
        this(i11, i12, j11, textIndent, platformParagraphStyle, lineHeightStyle, i13, i14, textMotion);
    }

    /* renamed from: copy-Elsmlbk$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m4434copyElsmlbk$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAlign = TextAlign.m4970boximpl(paragraphStyle.textAlign);
        }
        if ((i11 & 2) != 0) {
            textDirection = TextDirection.m4984boximpl(paragraphStyle.textDirection);
        }
        if ((i11 & 4) != 0) {
            j11 = paragraphStyle.lineHeight;
        }
        if ((i11 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        TextIndent textIndent2 = textIndent;
        return paragraphStyle.m4443copyElsmlbk(textAlign, textDirection, j11, textIndent2);
    }

    /* renamed from: copy-NH1kkwU$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m4435copyNH1kkwU$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAlign = TextAlign.m4970boximpl(paragraphStyle.textAlign);
        }
        if ((i11 & 2) != 0) {
            textDirection = TextDirection.m4984boximpl(paragraphStyle.textDirection);
        }
        if ((i11 & 4) != 0) {
            j11 = paragraphStyle.lineHeight;
        }
        if ((i11 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        if ((i11 & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        if ((i11 & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        if ((i11 & 64) != 0) {
            lineBreak = LineBreak.m4878boximpl(paragraphStyle.lineBreak);
        }
        if ((i11 & 128) != 0) {
            hyphens = Hyphens.m4868boximpl(paragraphStyle.hyphens);
        }
        if ((i11 & 256) != 0) {
            textMotion = paragraphStyle.textMotion;
        }
        Hyphens hyphens2 = hyphens;
        TextMotion textMotion2 = textMotion;
        long j12 = j11;
        return paragraphStyle.m4444copyNH1kkwU(textAlign, textDirection, j12, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens2, textMotion2);
    }

    /* renamed from: copy-ciSxzs0$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m4436copyciSxzs0$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAlign = TextAlign.m4970boximpl(paragraphStyle.textAlign);
        }
        if ((i11 & 2) != 0) {
            textDirection = TextDirection.m4984boximpl(paragraphStyle.textDirection);
        }
        if ((i11 & 4) != 0) {
            j11 = paragraphStyle.lineHeight;
        }
        if ((i11 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        if ((i11 & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        if ((i11 & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        if ((i11 & 64) != 0) {
            lineBreak = LineBreak.m4878boximpl(paragraphStyle.lineBreak);
        }
        if ((i11 & 128) != 0) {
            hyphens = Hyphens.m4868boximpl(paragraphStyle.hyphens);
        }
        Hyphens hyphens2 = hyphens;
        LineHeightStyle lineHeightStyle2 = lineHeightStyle;
        TextIndent textIndent2 = textIndent;
        long j12 = j11;
        return paragraphStyle.m4445copyciSxzs0(textAlign, textDirection, j12, textIndent2, platformParagraphStyle, lineHeightStyle2, lineBreak, hyphens2);
    }

    /* renamed from: copy-xPh5V4g$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m4437copyxPh5V4g$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAlign = TextAlign.m4970boximpl(paragraphStyle.textAlign);
        }
        if ((i11 & 2) != 0) {
            textDirection = TextDirection.m4984boximpl(paragraphStyle.textDirection);
        }
        if ((i11 & 4) != 0) {
            j11 = paragraphStyle.lineHeight;
        }
        if ((i11 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        if ((i11 & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        if ((i11 & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        LineHeightStyle lineHeightStyle2 = lineHeightStyle;
        TextIndent textIndent2 = textIndent;
        long j12 = j11;
        return paragraphStyle.m4446copyxPh5V4g(textAlign, textDirection, j12, textIndent2, platformParagraphStyle, lineHeightStyle2);
    }

    /* renamed from: copy-ykzQM6k$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m4438copyykzQM6k$default(ParagraphStyle paragraphStyle, int i11, int i12, long j11, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i13, int i14, TextMotion textMotion, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = paragraphStyle.textAlign;
        }
        if ((i15 & 2) != 0) {
            i12 = paragraphStyle.textDirection;
        }
        if ((i15 & 4) != 0) {
            j11 = paragraphStyle.lineHeight;
        }
        if ((i15 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        if ((i15 & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        if ((i15 & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        if ((i15 & 64) != 0) {
            i13 = paragraphStyle.lineBreak;
        }
        if ((i15 & 128) != 0) {
            i14 = paragraphStyle.hyphens;
        }
        if ((i15 & 256) != 0) {
            textMotion = paragraphStyle.textMotion;
        }
        int i16 = i14;
        TextMotion textMotion2 = textMotion;
        long j12 = j11;
        return paragraphStyle.m4447copyykzQM6k(i11, i12, j12, textIndent, platformParagraphStyle, lineHeightStyle, i13, i16, textMotion2);
    }

    public static /* synthetic */ ParagraphStyle merge$default(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            paragraphStyle2 = null;
        }
        return paragraphStyle.merge(paragraphStyle2);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-Elsmlbk, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m4443copyElsmlbk(TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent) {
        return new ParagraphStyle(textAlign != null ? textAlign.m4976unboximpl() : TextAlign.Companion.m4983getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m4990unboximpl() : TextDirection.Companion.m4996getUnspecifieds_7Xco(), j11, textIndent, this.platformStyle, this.lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (v) null);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    /* renamed from: copy-NH1kkwU, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m4444copyNH1kkwU(TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        return new ParagraphStyle(textAlign != null ? textAlign.m4976unboximpl() : TextAlign.Companion.m4983getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m4990unboximpl() : TextDirection.Companion.m4996getUnspecifieds_7Xco(), j11, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m4890unboximpl() : LineBreak.Companion.m4898getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m4874unboximpl() : Hyphens.Companion.m4877getUnspecifiedvmbZdU8(), textMotion, (v) null);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineBreak, Hyphens, TextMotion are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-ciSxzs0, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m4445copyciSxzs0(TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        return new ParagraphStyle(textAlign != null ? textAlign.m4976unboximpl() : TextAlign.Companion.m4983getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m4990unboximpl() : TextDirection.Companion.m4996getUnspecifieds_7Xco(), j11, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m4890unboximpl() : LineBreak.Companion.m4898getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m4874unboximpl() : Hyphens.Companion.m4877getUnspecifiedvmbZdU8(), this.textMotion, (v) null);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-xPh5V4g, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m4446copyxPh5V4g(TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle) {
        return new ParagraphStyle(textAlign != null ? textAlign.m4976unboximpl() : TextAlign.Companion.m4983getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m4990unboximpl() : TextDirection.Companion.m4996getUnspecifieds_7Xco(), j11, textIndent, platformParagraphStyle, lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (v) null);
    }

    @k
    /* renamed from: copy-ykzQM6k, reason: not valid java name */
    public final ParagraphStyle m4447copyykzQM6k(int i11, int i12, long j11, @l TextIndent textIndent, @l PlatformParagraphStyle platformParagraphStyle, @l LineHeightStyle lineHeightStyle, int i13, int i14, @l TextMotion textMotion) {
        return new ParagraphStyle(i11, i12, j11, textIndent, platformParagraphStyle, lineHeightStyle, i13, i14, textMotion, (v) null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphStyle)) {
            return false;
        }
        ParagraphStyle paragraphStyle = (ParagraphStyle) obj;
        return TextAlign.m4973equalsimpl0(this.textAlign, paragraphStyle.textAlign) && TextDirection.m4987equalsimpl0(this.textDirection, paragraphStyle.textDirection) && TextUnit.m5306equalsimpl0(this.lineHeight, paragraphStyle.lineHeight) && g0.g(this.textIndent, paragraphStyle.textIndent) && g0.g(this.platformStyle, paragraphStyle.platformStyle) && g0.g(this.lineHeightStyle, paragraphStyle.lineHeightStyle) && LineBreak.m4884equalsimpl0(this.lineBreak, paragraphStyle.lineBreak) && Hyphens.m4871equalsimpl0(this.hyphens, paragraphStyle.hyphens) && g0.g(this.textMotion, paragraphStyle.textMotion);
    }

    @l
    @j(name = "getHyphens-EaSxIns")
    /* renamed from: getHyphens-EaSxIns, reason: not valid java name */
    public final Hyphens m4448getHyphensEaSxIns() {
        return Hyphens.m4868boximpl(this.hyphens);
    }

    /* renamed from: getHyphens-vmbZdU8, reason: not valid java name */
    public final int m4449getHyphensvmbZdU8() {
        return this.hyphens;
    }

    @l
    @j(name = "getLineBreak-LgCVezo")
    /* renamed from: getLineBreak-LgCVezo, reason: not valid java name */
    public final LineBreak m4450getLineBreakLgCVezo() {
        return LineBreak.m4878boximpl(this.lineBreak);
    }

    /* renamed from: getLineBreak-rAG3T2k, reason: not valid java name */
    public final int m4451getLineBreakrAG3T2k() {
        return this.lineBreak;
    }

    /* renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m4452getLineHeightXSAIIZE() {
        return this.lineHeight;
    }

    @l
    public final LineHeightStyle getLineHeightStyle() {
        return this.lineHeightStyle;
    }

    @l
    public final PlatformParagraphStyle getPlatformStyle() {
        return this.platformStyle;
    }

    @l
    @j(name = "getTextAlign-buA522U")
    /* renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final TextAlign m4453getTextAlignbuA522U() {
        return TextAlign.m4970boximpl(this.textAlign);
    }

    /* renamed from: getTextAlign-e0LSkKk, reason: not valid java name */
    public final int m4454getTextAligne0LSkKk() {
        return this.textAlign;
    }

    @l
    @j(name = "getTextDirection-mmuk1to")
    /* renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final TextDirection m4455getTextDirectionmmuk1to() {
        return TextDirection.m4984boximpl(this.textDirection);
    }

    /* renamed from: getTextDirection-s_7X-co, reason: not valid java name */
    public final int m4456getTextDirections_7Xco() {
        return this.textDirection;
    }

    @l
    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    @l
    public final TextMotion getTextMotion() {
        return this.textMotion;
    }

    public int hashCode() {
        int m4974hashCodeimpl = ((((TextAlign.m4974hashCodeimpl(this.textAlign) * 31) + TextDirection.m4988hashCodeimpl(this.textDirection)) * 31) + TextUnit.m5310hashCodeimpl(this.lineHeight)) * 31;
        TextIndent textIndent = this.textIndent;
        int hashCode = (m4974hashCodeimpl + (textIndent != null ? textIndent.hashCode() : 0)) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.platformStyle;
        int hashCode2 = (hashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0)) * 31;
        LineHeightStyle lineHeightStyle = this.lineHeightStyle;
        int hashCode3 = (((((hashCode2 + (lineHeightStyle != null ? lineHeightStyle.hashCode() : 0)) * 31) + LineBreak.m4888hashCodeimpl(this.lineBreak)) * 31) + Hyphens.m4872hashCodeimpl(this.hyphens)) * 31;
        TextMotion textMotion = this.textMotion;
        return hashCode3 + (textMotion != null ? textMotion.hashCode() : 0);
    }

    @Stable
    @k
    public final ParagraphStyle merge(@l ParagraphStyle paragraphStyle) {
        return paragraphStyle == null ? this : ParagraphStyleKt.m4457fastMergej5T8yCg(this, paragraphStyle.textAlign, paragraphStyle.textDirection, paragraphStyle.lineHeight, paragraphStyle.textIndent, paragraphStyle.platformStyle, paragraphStyle.lineHeightStyle, paragraphStyle.lineBreak, paragraphStyle.hyphens, paragraphStyle.textMotion);
    }

    @Stable
    @k
    public final ParagraphStyle plus(@k ParagraphStyle paragraphStyle) {
        return merge(paragraphStyle);
    }

    @k
    public String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) TextAlign.m4975toStringimpl(this.textAlign)) + ", textDirection=" + ((Object) TextDirection.m4989toStringimpl(this.textDirection)) + ", lineHeight=" + ((Object) TextUnit.m5316toStringimpl(this.lineHeight)) + ", textIndent=" + this.textIndent + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + this.lineHeightStyle + ", lineBreak=" + ((Object) LineBreak.m4889toStringimpl(this.lineBreak)) + ", hyphens=" + ((Object) Hyphens.m4873toStringimpl(this.hyphens)) + ", textMotion=" + this.textMotion + ')';
    }

    @n(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, v vVar) {
        this(textAlign, textDirection, j11, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineBreak, Hyphens, TextMotion are deprecated. Please use the new stable constructors.")
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, v vVar) {
        this(textAlign, textDirection, j11, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructors.")
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, v vVar) {
        this(textAlign, textDirection, j11, textIndent, platformParagraphStyle, lineHeightStyle);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, v vVar) {
        this(textAlign, textDirection, j11, textIndent);
    }

    private ParagraphStyle(int i11, int i12, long j11, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i13, int i14, TextMotion textMotion) {
        this.textAlign = i11;
        this.textDirection = i12;
        this.lineHeight = j11;
        this.textIndent = textIndent;
        this.platformStyle = platformParagraphStyle;
        this.lineHeightStyle = lineHeightStyle;
        this.lineBreak = i13;
        this.hyphens = i14;
        this.textMotion = textMotion;
        if (TextUnit.m5306equalsimpl0(j11, TextUnit.Companion.m5320getUnspecifiedXSAIIZE())) {
            return;
        }
        if (TextUnit.m5309getValueimpl(j11) >= 0.0f) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("lineHeight can't be negative (" + TextUnit.m5309getValueimpl(j11) + ')');
    }

    @n(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getHyphens-EaSxIns$annotations, reason: not valid java name */
    public static /* synthetic */ void m4439getHyphensEaSxIns$annotations() {
    }

    @n(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getLineBreak-LgCVezo$annotations, reason: not valid java name */
    public static /* synthetic */ void m4440getLineBreakLgCVezo$annotations() {
    }

    @n(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getTextAlign-buA522U$annotations, reason: not valid java name */
    public static /* synthetic */ void m4441getTextAlignbuA522U$annotations() {
    }

    @n(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getTextDirection-mmuk1to$annotations, reason: not valid java name */
    public static /* synthetic */ void m4442getTextDirectionmmuk1to$annotations() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ParagraphStyle(int r12, int r13, long r14, androidx.compose.ui.text.style.TextIndent r16, androidx.compose.ui.text.PlatformParagraphStyle r17, androidx.compose.ui.text.style.LineHeightStyle r18, int r19, int r20, androidx.compose.ui.text.style.TextMotion r21, int r22, kotlin.jvm.internal.v r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            if (r1 == 0) goto Ld
            androidx.compose.ui.text.style.TextAlign$Companion r1 = androidx.compose.ui.text.style.TextAlign.Companion
            int r1 = r1.m4983getUnspecifiede0LSkKk()
            goto Le
        Ld:
            r1 = r12
        Le:
            r2 = r0 & 2
            if (r2 == 0) goto L19
            androidx.compose.ui.text.style.TextDirection$Companion r2 = androidx.compose.ui.text.style.TextDirection.Companion
            int r2 = r2.m4996getUnspecifieds_7Xco()
            goto L1a
        L19:
            r2 = r13
        L1a:
            r3 = r0 & 4
            if (r3 == 0) goto L25
            androidx.compose.ui.unit.TextUnit$Companion r3 = androidx.compose.ui.unit.TextUnit.Companion
            long r3 = r3.m5320getUnspecifiedXSAIIZE()
            goto L26
        L25:
            r3 = r14
        L26:
            r5 = r0 & 8
            r6 = 0
            if (r5 == 0) goto L2d
            r5 = r6
            goto L2f
        L2d:
            r5 = r16
        L2f:
            r7 = r0 & 16
            if (r7 == 0) goto L35
            r7 = r6
            goto L37
        L35:
            r7 = r17
        L37:
            r8 = r0 & 32
            if (r8 == 0) goto L3d
            r8 = r6
            goto L3f
        L3d:
            r8 = r18
        L3f:
            r9 = r0 & 64
            if (r9 == 0) goto L4a
            androidx.compose.ui.text.style.LineBreak$Companion r9 = androidx.compose.ui.text.style.LineBreak.Companion
            int r9 = r9.m4898getUnspecifiedrAG3T2k()
            goto L4c
        L4a:
            r9 = r19
        L4c:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L57
            androidx.compose.ui.text.style.Hyphens$Companion r10 = androidx.compose.ui.text.style.Hyphens.Companion
            int r10 = r10.m4877getUnspecifiedvmbZdU8()
            goto L59
        L57:
            r10 = r20
        L59:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L5e
            goto L60
        L5e:
            r6 = r21
        L60:
            r0 = 0
            r12 = r11
            r23 = r0
            r13 = r1
            r14 = r2
            r15 = r3
            r17 = r5
            r22 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r12.<init>(r13, r14, r15, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.ParagraphStyle.<init>(int, int, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle, int, int, androidx.compose.ui.text.style.TextMotion, int, kotlin.jvm.internal.v):void");
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : textAlign, (i11 & 2) != 0 ? null : textDirection, (i11 & 4) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : j11, (i11 & 8) != 0 ? null : textIndent, (i11 & 16) != 0 ? null : platformParagraphStyle, (i11 & 32) != 0 ? null : lineHeightStyle, (i11 & 64) != 0 ? null : lineBreak, (i11 & 128) != 0 ? null : hyphens, (i11 & 256) == 0 ? textMotion : null, (v) null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(textAlign != null ? textAlign.m4976unboximpl() : TextAlign.Companion.m4983getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m4990unboximpl() : TextDirection.Companion.m4996getUnspecifieds_7Xco(), j11, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m4890unboximpl() : LineBreak.Companion.m4898getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m4874unboximpl() : Hyphens.Companion.m4877getUnspecifiedvmbZdU8(), textMotion, (v) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : textAlign, (i11 & 2) != 0 ? null : textDirection, (i11 & 4) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : j11, (i11 & 8) != 0 ? null : textIndent, null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent) {
        this(textAlign != null ? textAlign.m4976unboximpl() : TextAlign.Companion.m4983getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m4990unboximpl() : TextDirection.Companion.m4996getUnspecifieds_7Xco(), j11, textIndent, (PlatformParagraphStyle) null, (LineHeightStyle) null, LineBreak.Companion.m4898getUnspecifiedrAG3T2k(), Hyphens.Companion.m4877getUnspecifiedvmbZdU8(), (TextMotion) null, (v) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : textAlign, (i11 & 2) != 0 ? null : textDirection, (i11 & 4) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : j11, (i11 & 8) != 0 ? null : textIndent, (i11 & 16) != 0 ? null : platformParagraphStyle, (i11 & 32) != 0 ? null : lineHeightStyle, null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle) {
        this(textAlign != null ? textAlign.m4976unboximpl() : TextAlign.Companion.m4983getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m4990unboximpl() : TextDirection.Companion.m4996getUnspecifieds_7Xco(), j11, textIndent, platformParagraphStyle, lineHeightStyle, LineBreak.Companion.m4898getUnspecifiedrAG3T2k(), Hyphens.Companion.m4877getUnspecifiedvmbZdU8(), (TextMotion) null, (v) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : textAlign, (i11 & 2) != 0 ? null : textDirection, (i11 & 4) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : j11, (i11 & 8) != 0 ? null : textIndent, (i11 & 16) != 0 ? null : platformParagraphStyle, (i11 & 32) != 0 ? null : lineHeightStyle, (i11 & 64) != 0 ? null : lineBreak, (i11 & 128) == 0 ? hyphens : null, (v) null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        this(textAlign != null ? textAlign.m4976unboximpl() : TextAlign.Companion.m4983getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m4990unboximpl() : TextDirection.Companion.m4996getUnspecifieds_7Xco(), j11, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m4890unboximpl() : LineBreak.Companion.m4898getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m4874unboximpl() : Hyphens.Companion.m4877getUnspecifiedvmbZdU8(), (TextMotion) null, (v) null);
    }
}
