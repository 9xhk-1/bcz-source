package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nEditingBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditingBuffer.kt\nandroidx/compose/ui/text/input/EditingBuffer\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,382:1\n114#2,8:383\n114#2,8:391\n*S KotlinDebug\n*F\n+ 1 EditingBuffer.kt\nandroidx/compose/ui/text/input/EditingBuffer\n*L\n50#1:383,8\n59#1:391,8\n*E\n"})
/* loaded from: classes2.dex */
public final class EditingBuffer {
    public static final int NOWHERE = -1;
    private int compositionEnd;
    private int compositionStart;

    @k
    private final PartialGapBuffer gapBuffer;
    private int selectionEnd;
    private int selectionStart;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ EditingBuffer(AnnotatedString annotatedString, long j11, v vVar) {
        this(annotatedString, j11);
    }

    private final void setSelectionEnd(int i11) {
        if (!(i11 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot set selectionEnd to a negative value: " + i11);
        }
        this.selectionEnd = i11;
    }

    private final void setSelectionStart(int i11) {
        if (!(i11 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot set selectionStart to a negative value: " + i11);
        }
        this.selectionStart = i11;
    }

    public final void cancelComposition$ui_text_release() {
        replace$ui_text_release(this.compositionStart, this.compositionEnd, "");
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void commitComposition$ui_text_release() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void delete$ui_text_release(int i11, int i12) {
        long TextRange = TextRangeKt.TextRange(i11, i12);
        this.gapBuffer.replace(i11, i12, "");
        long m4721updateRangeAfterDeletepWDy79M = EditingBufferKt.m4721updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.selectionStart, this.selectionEnd), TextRange);
        setSelectionStart(TextRange.m4557getMinimpl(m4721updateRangeAfterDeletepWDy79M));
        setSelectionEnd(TextRange.m4556getMaximpl(m4721updateRangeAfterDeletepWDy79M));
        if (hasComposition$ui_text_release()) {
            long m4721updateRangeAfterDeletepWDy79M2 = EditingBufferKt.m4721updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd), TextRange);
            if (TextRange.m4553getCollapsedimpl(m4721updateRangeAfterDeletepWDy79M2)) {
                commitComposition$ui_text_release();
            } else {
                this.compositionStart = TextRange.m4557getMinimpl(m4721updateRangeAfterDeletepWDy79M2);
                this.compositionEnd = TextRange.m4556getMaximpl(m4721updateRangeAfterDeletepWDy79M2);
            }
        }
    }

    public final char get$ui_text_release(int i11) {
        return this.gapBuffer.get(i11);
    }

    @l
    /* renamed from: getComposition-MzsxiRA$ui_text_release, reason: not valid java name */
    public final TextRange m4719getCompositionMzsxiRA$ui_text_release() {
        if (hasComposition$ui_text_release()) {
            return TextRange.m4547boximpl(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    public final int getCompositionEnd$ui_text_release() {
        return this.compositionEnd;
    }

    public final int getCompositionStart$ui_text_release() {
        return this.compositionStart;
    }

    public final int getCursor$ui_text_release() {
        int i11 = this.selectionStart;
        int i12 = this.selectionEnd;
        if (i11 == i12) {
            return i12;
        }
        return -1;
    }

    public final int getLength$ui_text_release() {
        return this.gapBuffer.getLength();
    }

    /* renamed from: getSelection-d9O1mEE$ui_text_release, reason: not valid java name */
    public final long m4720getSelectiond9O1mEE$ui_text_release() {
        return TextRangeKt.TextRange(this.selectionStart, this.selectionEnd);
    }

    public final int getSelectionEnd$ui_text_release() {
        return this.selectionEnd;
    }

    public final int getSelectionStart$ui_text_release() {
        return this.selectionStart;
    }

    public final boolean hasComposition$ui_text_release() {
        return this.compositionStart != -1;
    }

    public final void replace$ui_text_release(int i11, int i12, @k AnnotatedString annotatedString) {
        replace$ui_text_release(i11, i12, annotatedString.getText());
    }

    public final void setComposition$ui_text_release(int i11, int i12) {
        if (i11 < 0 || i11 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + i11 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (i12 < 0 || i12 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + i12 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (i11 < i12) {
            this.compositionStart = i11;
            this.compositionEnd = i12;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed or empty range: " + i11 + " > " + i12);
    }

    public final void setCursor$ui_text_release(int i11) {
        setSelection$ui_text_release(i11, i11);
    }

    public final void setSelection$ui_text_release(int i11, int i12) {
        if (i11 < 0 || i11 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + i11 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (i12 < 0 || i12 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + i12 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (i11 <= i12) {
            setSelectionStart(i11);
            setSelectionEnd(i12);
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + i11 + " > " + i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public final AnnotatedString toAnnotatedString$ui_text_release() {
        return new AnnotatedString(toString(), null, 2, 0 == true ? 1 : 0);
    }

    @k
    public String toString() {
        return this.gapBuffer.toString();
    }

    public /* synthetic */ EditingBuffer(String str, long j11, v vVar) {
        this(str, j11);
    }

    public final void replace$ui_text_release(int i11, int i12, @k String str) {
        if (i11 < 0 || i11 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + i11 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (i12 < 0 || i12 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + i12 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (i11 <= i12) {
            this.gapBuffer.replace(i11, i12, str);
            setSelectionStart(str.length() + i11);
            setSelectionEnd(i11 + str.length());
            this.compositionStart = -1;
            this.compositionEnd = -1;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + i11 + " > " + i12);
    }

    private EditingBuffer(AnnotatedString annotatedString, long j11) {
        this.gapBuffer = new PartialGapBuffer(annotatedString.getText());
        this.selectionStart = TextRange.m4557getMinimpl(j11);
        this.selectionEnd = TextRange.m4556getMaximpl(j11);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        int m4557getMinimpl = TextRange.m4557getMinimpl(j11);
        int m4556getMaximpl = TextRange.m4556getMaximpl(j11);
        if (m4557getMinimpl >= 0 && m4557getMinimpl <= annotatedString.length()) {
            if (m4556getMaximpl < 0 || m4556getMaximpl > annotatedString.length()) {
                throw new IndexOutOfBoundsException("end (" + m4556getMaximpl + ") offset is outside of text region " + annotatedString.length());
            }
            if (m4557getMinimpl <= m4556getMaximpl) {
                return;
            }
            throw new IllegalArgumentException("Do not set reversed range: " + m4557getMinimpl + " > " + m4556getMaximpl);
        }
        throw new IndexOutOfBoundsException("start (" + m4557getMinimpl + ") offset is outside of text region " + annotatedString.length());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private EditingBuffer(String str, long j11) {
        this(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), j11, (v) (0 == true ? 1 : 0));
    }
}
