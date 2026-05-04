package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.ToCharArray_androidKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextFieldCharSequence implements CharSequence {
    public static final int $stable = 8;

    @l
    private final List<AnnotatedString.Range<AnnotatedString.Annotation>> composingAnnotations;

    @l
    private final TextRange composition;

    @l
    private final Pair<TextHighlightType, TextRange> highlight;
    private final long selection;

    @k
    private final CharSequence text;

    public /* synthetic */ TextFieldCharSequence(CharSequence charSequence, long j11, TextRange textRange, Pair pair, List list, v vVar) {
        this(charSequence, j11, textRange, pair, list);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i11) {
        return get(i11);
    }

    public final boolean contentEquals(@k CharSequence charSequence) {
        return f0.O1(this.text, charSequence);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextFieldCharSequence.class != obj.getClass()) {
            return false;
        }
        TextFieldCharSequence textFieldCharSequence = (TextFieldCharSequence) obj;
        return TextRange.m4552equalsimpl0(this.selection, textFieldCharSequence.selection) && g0.g(this.composition, textFieldCharSequence.composition) && g0.g(this.highlight, textFieldCharSequence.highlight) && g0.g(this.composingAnnotations, textFieldCharSequence.composingAnnotations) && contentEquals(textFieldCharSequence.text);
    }

    public char get(int i11) {
        return this.text.charAt(i11);
    }

    @l
    public final List<AnnotatedString.Range<AnnotatedString.Annotation>> getComposingAnnotations() {
        return this.composingAnnotations;
    }

    @l
    /* renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final TextRange m1188getCompositionMzsxiRA() {
        return this.composition;
    }

    @l
    public final Pair<TextHighlightType, TextRange> getHighlight() {
        return this.highlight;
    }

    public int getLength() {
        return this.text.length();
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m1189getSelectiond9O1mEE() {
        return this.selection;
    }

    @k
    public final CharSequence getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = ((this.text.hashCode() * 31) + TextRange.m4560hashCodeimpl(this.selection)) * 31;
        TextRange textRange = this.composition;
        int m4560hashCodeimpl = (hashCode + (textRange != null ? TextRange.m4560hashCodeimpl(textRange.m4563unboximpl()) : 0)) * 31;
        Pair<TextHighlightType, TextRange> pair = this.highlight;
        int hashCode2 = (m4560hashCodeimpl + (pair != null ? pair.hashCode() : 0)) * 31;
        List<AnnotatedString.Range<AnnotatedString.Annotation>> list = this.composingAnnotations;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public final boolean shouldShowSelection() {
        return this.highlight == null;
    }

    @Override // java.lang.CharSequence
    @k
    public CharSequence subSequence(int i11, int i12) {
        return this.text.subSequence(i11, i12);
    }

    public final void toCharArray(@k char[] cArr, int i11, int i12, int i13) {
        ToCharArray_androidKt.toCharArray(this.text, cArr, i11, i12, i13);
    }

    @Override // java.lang.CharSequence
    @k
    public String toString() {
        return this.text.toString();
    }

    private TextFieldCharSequence(CharSequence charSequence, long j11, TextRange textRange, Pair<TextHighlightType, TextRange> pair, List<AnnotatedString.Range<AnnotatedString.Annotation>> list) {
        this.composingAnnotations = list;
        this.text = charSequence instanceof TextFieldCharSequence ? ((TextFieldCharSequence) charSequence).text : charSequence;
        this.selection = TextRangeKt.m4565coerceIn8ffj60Q(j11, 0, charSequence.length());
        this.composition = textRange != null ? TextRange.m4547boximpl(TextRangeKt.m4565coerceIn8ffj60Q(textRange.m4563unboximpl(), 0, charSequence.length())) : null;
        this.highlight = pair != null ? Pair.copy$default(pair, null, TextRange.m4547boximpl(TextRangeKt.m4565coerceIn8ffj60Q(pair.getSecond().m4563unboximpl(), 0, charSequence.length())), 1, null) : null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TextFieldCharSequence(java.lang.CharSequence r8, long r9, androidx.compose.ui.text.TextRange r11, kotlin.Pair r12, java.util.List r13, int r14, kotlin.jvm.internal.v r15) {
        /*
            r7 = this;
            r0 = r14 & 1
            if (r0 == 0) goto L7
            java.lang.String r0 = ""
            goto L8
        L7:
            r0 = r8
        L8:
            r1 = r14 & 2
            if (r1 == 0) goto L13
            androidx.compose.ui.text.TextRange$Companion r1 = androidx.compose.ui.text.TextRange.Companion
            long r1 = r1.m4564getZerod9O1mEE()
            goto L14
        L13:
            r1 = r9
        L14:
            r3 = r14 & 4
            r4 = 0
            if (r3 == 0) goto L1b
            r3 = r4
            goto L1c
        L1b:
            r3 = r11
        L1c:
            r5 = r14 & 8
            if (r5 == 0) goto L22
            r5 = r4
            goto L23
        L22:
            r5 = r12
        L23:
            r6 = r14 & 16
            if (r6 == 0) goto L28
            goto L29
        L28:
            r4 = r13
        L29:
            r6 = 0
            r8 = r7
            r9 = r0
            r10 = r1
            r12 = r3
            r14 = r4
            r13 = r5
            r15 = r6
            r8.<init>(r9, r10, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.TextFieldCharSequence.<init>(java.lang.CharSequence, long, androidx.compose.ui.text.TextRange, kotlin.Pair, java.util.List, int, kotlin.jvm.internal.v):void");
    }
}
