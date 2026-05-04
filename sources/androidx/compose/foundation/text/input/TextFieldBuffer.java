package androidx.compose.foundation.text.input;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.internal.ChangeTracker;
import androidx.compose.foundation.text.input.internal.OffsetMappingCalculator;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import g10.u;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nTextFieldBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldBuffer.kt\nandroidx/compose/foundation/text/input/TextFieldBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 6 TextFieldBuffer.kt\nandroidx/compose/foundation/text/input/TextFieldBufferKt\n*L\n1#1,721:1\n1#2:722\n1095#3,3:723\n1101#3:726\n1083#3,2:727\n34#4,6:729\n96#5,5:735\n96#5,5:740\n96#5,5:790\n96#5,5:795\n666#6,45:745\n*S KotlinDebug\n*F\n+ 1 TextFieldBuffer.kt\nandroidx/compose/foundation/text/input/TextFieldBuffer\n*L\n168#1:723,3\n220#1:726\n220#1:727,2\n222#1:729,6\n306#1:735,5\n307#1:740,5\n465#1:790,5\n470#1:795,5\n322#1:745,45\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldBuffer implements Appendable {
    public static final int $stable = 8;

    @l
    private ChangeTracker backingChangeTracker;

    @k
    private final PartialGapBuffer buffer;

    @l
    private MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> composingAnnotations;

    @l
    private TextRange composition;

    @l
    private Pair<TextHighlightType, TextRange> highlight;

    @l
    private final OffsetMappingCalculator offsetMappingCalculator;

    @k
    private final TextFieldCharSequence originalValue;
    private long selectionInChars;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ChangeList {
        int getChangeCount();

        /* renamed from: getOriginalRange--jx7JFs, reason: not valid java name */
        long mo1185getOriginalRangejx7JFs(int i11);

        /* renamed from: getRange--jx7JFs, reason: not valid java name */
        long mo1186getRangejx7JFs(int i11);
    }

    public TextFieldBuffer(@k final TextFieldCharSequence textFieldCharSequence, @l ChangeTracker changeTracker, @k TextFieldCharSequence textFieldCharSequence2, @l OffsetMappingCalculator offsetMappingCalculator) {
        this.originalValue = textFieldCharSequence2;
        this.offsetMappingCalculator = offsetMappingCalculator;
        this.buffer = new PartialGapBuffer(textFieldCharSequence);
        MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> mutableVector = null;
        this.backingChangeTracker = changeTracker != null ? new ChangeTracker(changeTracker) : null;
        this.selectionInChars = textFieldCharSequence.m1189getSelectiond9O1mEE();
        this.composition = textFieldCharSequence.m1188getCompositionMzsxiRA();
        List<AnnotatedString.Range<AnnotatedString.Annotation>> composingAnnotations = textFieldCharSequence.getComposingAnnotations();
        if (composingAnnotations != null && !composingAnnotations.isEmpty()) {
            int size = textFieldCharSequence.getComposingAnnotations().size();
            x00.l<Integer, AnnotatedString.Range<AnnotatedString.Annotation>> lVar = new x00.l<Integer, AnnotatedString.Range<AnnotatedString.Annotation>>() { // from class: androidx.compose.foundation.text.input.TextFieldBuffer$composingAnnotations$1
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ AnnotatedString.Range<AnnotatedString.Annotation> invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final AnnotatedString.Range<AnnotatedString.Annotation> invoke(int i11) {
                    return TextFieldCharSequence.this.getComposingAnnotations().get(i11);
                }
            };
            AnnotatedString.Range[] rangeArr = new AnnotatedString.Range[size];
            for (int i11 = 0; i11 < size; i11++) {
                rangeArr[i11] = lVar.invoke(Integer.valueOf(i11));
            }
            mutableVector = new MutableVector<>(rangeArr, size);
        }
        this.composingAnnotations = mutableVector;
    }

    private final void clearChangeList() {
        getChangeTracker$foundation_release().clearChanges();
    }

    private final void onTextWillChange(int i11, int i12, int i13) {
        getChangeTracker$foundation_release().trackChange(i11, i12, i13);
        OffsetMappingCalculator offsetMappingCalculator = this.offsetMappingCalculator;
        if (offsetMappingCalculator != null) {
            offsetMappingCalculator.recordEditOperation(i11, i12, i13);
        }
        this.selectionInChars = TextFieldBufferKt.m1187adjustTextRangevJH6DeI(m1181getSelectiond9O1mEE(), i11, i12, i13);
    }

    public static /* synthetic */ void replace$foundation_release$default(TextFieldBuffer textFieldBuffer, int i11, int i12, CharSequence charSequence, int i13, int i14, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            i13 = 0;
        }
        int i16 = i13;
        if ((i15 & 16) != 0) {
            i14 = charSequence.length();
        }
        textFieldBuffer.replace$foundation_release(i11, i12, charSequence, i16, i14);
    }

    private final void requireValidIndex(int i11, boolean z11, boolean z12) {
        boolean z13 = false;
        int i12 = z11 ? 0 : -1;
        int length = z12 ? getLength() : getLength() + 1;
        if (i12 <= i11 && i11 < length) {
            z13 = true;
        }
        if (z13) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Expected " + i11 + " to be in [" + i12 + j2.O + length + ')');
    }

    /* renamed from: requireValidRange-5zc-tL8, reason: not valid java name */
    private final void m1176requireValidRange5zctL8(long j11) {
        long TextRange = TextRangeKt.TextRange(0, getLength());
        if (TextRange.m4549contains5zctL8(TextRange, j11)) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Expected " + ((Object) TextRange.m4562toStringimpl(j11)) + " to be in " + ((Object) TextRange.m4562toStringimpl(TextRange)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setComposition$foundation_release$default(TextFieldBuffer textFieldBuffer, int i11, int i12, List list, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            list = null;
        }
        textFieldBuffer.setComposition$foundation_release(i11, i12, list);
    }

    /* renamed from: setComposition-OEnZFl4, reason: not valid java name */
    private final void m1177setCompositionOEnZFl4(TextRange textRange) {
        if (textRange != null && !TextRange.m4553getCollapsedimpl(textRange.m4563unboximpl())) {
            this.composition = textRange;
            return;
        }
        this.composition = null;
        MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> mutableVector = this.composingAnnotations;
        if (mutableVector != null) {
            mutableVector.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: toTextFieldCharSequence-I88jaVs$foundation_release$default, reason: not valid java name */
    public static /* synthetic */ TextFieldCharSequence m1178toTextFieldCharSequenceI88jaVs$foundation_release$default(TextFieldBuffer textFieldBuffer, long j11, TextRange textRange, List list, int i11, Object obj) {
        MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> mutableVector;
        if ((i11 & 1) != 0) {
            j11 = textFieldBuffer.m1181getSelectiond9O1mEE();
        }
        if ((i11 & 2) != 0) {
            textRange = textFieldBuffer.composition;
        }
        if ((i11 & 4) != 0 && ((mutableVector = textFieldBuffer.composingAnnotations) == null || (list = mutableVector.asMutableList()) == null || list.isEmpty())) {
            list = null;
        }
        return textFieldBuffer.m1184toTextFieldCharSequenceI88jaVs$foundation_release(j11, textRange, list);
    }

    @Override // java.lang.Appendable
    @k
    public Appendable append(@l CharSequence charSequence) {
        if (charSequence != null) {
            onTextWillChange(getLength(), getLength(), charSequence.length());
            PartialGapBuffer partialGapBuffer = this.buffer;
            PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), charSequence, 0, 0, 24, null);
        }
        return this;
    }

    @k
    public final CharSequence asCharSequence() {
        return this.buffer;
    }

    public final char charAt(int i11) {
        return this.buffer.charAt(i11);
    }

    public final void clearHighlight$foundation_release() {
        this.highlight = null;
    }

    public final void commitComposition$foundation_release() {
        m1177setCompositionOEnZFl4(null);
    }

    @k
    public final ChangeTracker getChangeTracker$foundation_release() {
        ChangeTracker changeTracker = this.backingChangeTracker;
        if (changeTracker != null) {
            return changeTracker;
        }
        ChangeTracker changeTracker2 = new ChangeTracker(null, 1, null);
        this.backingChangeTracker = changeTracker2;
        return changeTracker2;
    }

    @k
    public final ChangeList getChanges() {
        return getChangeTracker$foundation_release();
    }

    @l
    public final MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> getComposingAnnotations$foundation_release() {
        return this.composingAnnotations;
    }

    @l
    /* renamed from: getComposition-MzsxiRA$foundation_release, reason: not valid java name */
    public final TextRange m1179getCompositionMzsxiRA$foundation_release() {
        return this.composition;
    }

    @l
    public final Pair<TextHighlightType, TextRange> getHighlight$foundation_release() {
        return this.highlight;
    }

    public final int getLength() {
        return this.buffer.length();
    }

    /* renamed from: getOriginalSelection-d9O1mEE, reason: not valid java name */
    public final long m1180getOriginalSelectiond9O1mEE() {
        return this.originalValue.m1189getSelectiond9O1mEE();
    }

    @k
    public final CharSequence getOriginalText() {
        return this.originalValue.getText();
    }

    @k
    public final TextFieldCharSequence getOriginalValue$foundation_release() {
        return this.originalValue;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m1181getSelectiond9O1mEE() {
        return this.selectionInChars;
    }

    public final boolean hasComposition$foundation_release() {
        return this.composition != null;
    }

    @j(name = "hasSelection")
    public final boolean hasSelection() {
        return !TextRange.m4553getCollapsedimpl(m1181getSelectiond9O1mEE());
    }

    public final void placeCursorAfterCharAt(int i11) {
        requireValidIndex(i11, false, true);
        this.selectionInChars = TextRangeKt.TextRange(u.B(i11 + 1, getLength()));
    }

    public final void placeCursorBeforeCharAt(int i11) {
        requireValidIndex(i11, true, false);
        this.selectionInChars = TextRangeKt.TextRange(i11);
    }

    public final void replace(int i11, int i12, @k CharSequence charSequence) {
        replace$foundation_release(i11, i12, charSequence, 0, charSequence.length());
    }

    public final void replace$foundation_release(int i11, int i12, @k CharSequence charSequence, int i13, int i14) {
        if (!(i11 <= i12)) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected start=" + i11 + " <= end=" + i12);
        }
        if (!(i13 <= i14)) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected textStart=" + i13 + " <= textEnd=" + i14);
        }
        onTextWillChange(i11, i12, i14 - i13);
        this.buffer.replace(i11, i12, charSequence, i13, i14);
        commitComposition$foundation_release();
        clearHighlight$foundation_release();
    }

    public final void revertAllChanges() {
        replace(0, getLength(), this.originalValue.toString());
        m1183setSelection5zctL8(this.originalValue.m1189getSelectiond9O1mEE());
        clearChangeList();
    }

    public final void setComposition$foundation_release(int i11, int i12, @l List<AnnotatedString.Range<AnnotatedString.Annotation>> list) {
        if (i11 < 0 || i11 > this.buffer.length()) {
            throw new IndexOutOfBoundsException("start (" + i11 + ") offset is outside of text region " + this.buffer.length());
        }
        if (i12 < 0 || i12 > this.buffer.length()) {
            throw new IndexOutOfBoundsException("end (" + i12 + ") offset is outside of text region " + this.buffer.length());
        }
        if (i11 >= i12) {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + i11 + " > " + i12);
        }
        m1177setCompositionOEnZFl4(TextRange.m4547boximpl(TextRangeKt.TextRange(i11, i12)));
        MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> mutableVector = this.composingAnnotations;
        if (mutableVector != null) {
            mutableVector.clear();
        }
        List<AnnotatedString.Range<AnnotatedString.Annotation>> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        if (this.composingAnnotations == null) {
            this.composingAnnotations = new MutableVector<>(new AnnotatedString.Range[16], 0);
        }
        int size = list2.size();
        for (int i13 = 0; i13 < size; i13++) {
            AnnotatedString.Range<AnnotatedString.Annotation> range = list.get(i13);
            MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> mutableVector2 = this.composingAnnotations;
            if (mutableVector2 != null) {
                mutableVector2.add(AnnotatedString.Range.copy$default(range, null, range.getStart() + i11, range.getEnd() + i11, null, 9, null));
            }
        }
    }

    /* renamed from: setHighlight-K7f2yys$foundation_release, reason: not valid java name */
    public final void m1182setHighlightK7f2yys$foundation_release(int i11, int i12, int i13) {
        if (i12 < i13) {
            this.highlight = new Pair<>(TextHighlightType.m1195boximpl(i11), TextRange.m4547boximpl(TextRangeKt.TextRange(u.I(i12, 0, getLength()), u.I(i13, 0, getLength()))));
        } else {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + i12 + " > " + i13);
        }
    }

    /* renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m1183setSelection5zctL8(long j11) {
        m1176requireValidRange5zctL8(j11);
        this.selectionInChars = j11;
        this.highlight = null;
    }

    public final void setTextIfChanged$foundation_release(@k CharSequence charSequence) {
        int i11;
        int i12;
        PartialGapBuffer partialGapBuffer = this.buffer;
        int length = partialGapBuffer.length();
        int length2 = charSequence.length();
        boolean z11 = false;
        if (partialGapBuffer.length() <= 0 || charSequence.length() <= 0) {
            i11 = 0;
            i12 = 0;
        } else {
            int i13 = 0;
            int i14 = 0;
            boolean z12 = false;
            while (true) {
                if (!z11) {
                    if (partialGapBuffer.charAt(i13) == charSequence.charAt(i14)) {
                        i13++;
                        i14++;
                    } else {
                        z11 = true;
                    }
                }
                if (!z12) {
                    if (partialGapBuffer.charAt(length - 1) == charSequence.charAt(length2 - 1)) {
                        length--;
                        length2--;
                    } else {
                        z12 = true;
                    }
                }
                if (i13 >= length || i14 >= length2 || (z11 && z12)) {
                    break;
                }
            }
            i11 = i13;
            i12 = i14;
        }
        int i15 = length;
        int i16 = length2;
        if (i11 < i15 || i12 < i16) {
            replace$foundation_release(i11, i15, charSequence, i12, i16);
        }
    }

    @k
    public String toString() {
        return this.buffer.toString();
    }

    @k
    /* renamed from: toTextFieldCharSequence-I88jaVs$foundation_release, reason: not valid java name */
    public final TextFieldCharSequence m1184toTextFieldCharSequenceI88jaVs$foundation_release(long j11, @l TextRange textRange, @l List<AnnotatedString.Range<AnnotatedString.Annotation>> list) {
        return new TextFieldCharSequence(this.buffer.toString(), j11, textRange, null, list, 8, null);
    }

    @Override // java.lang.Appendable
    @k
    public Appendable append(@l CharSequence charSequence, int i11, int i12) {
        if (charSequence != null) {
            onTextWillChange(getLength(), getLength(), i12 - i11);
            PartialGapBuffer partialGapBuffer = this.buffer;
            PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), charSequence.subSequence(i11, i12), 0, 0, 24, null);
        }
        return this;
    }

    @Override // java.lang.Appendable
    @k
    public Appendable append(char c11) {
        onTextWillChange(getLength(), getLength(), 1);
        PartialGapBuffer partialGapBuffer = this.buffer;
        PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), String.valueOf(c11), 0, 0, 24, null);
        return this;
    }

    public /* synthetic */ TextFieldBuffer(TextFieldCharSequence textFieldCharSequence, ChangeTracker changeTracker, TextFieldCharSequence textFieldCharSequence2, OffsetMappingCalculator offsetMappingCalculator, int i11, v vVar) {
        this(textFieldCharSequence, (i11 & 2) != 0 ? null : changeTracker, (i11 & 4) != 0 ? textFieldCharSequence : textFieldCharSequence2, (i11 & 8) != 0 ? null : offsetMappingCalculator);
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getChanges$annotations() {
    }
}
