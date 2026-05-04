package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.OffsetMapping;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class TextPreparedSelection extends BaseTextPreparedSelection<TextPreparedSelection> {
    public static final int $stable = 0;

    public /* synthetic */ TextPreparedSelection(AnnotatedString annotatedString, long j11, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState, v vVar) {
        this(annotatedString, j11, textLayoutResult, offsetMapping, textPreparedSelectionState);
    }

    public /* synthetic */ TextPreparedSelection(AnnotatedString annotatedString, long j11, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState, int i11, v vVar) {
        this(annotatedString, j11, (i11 & 4) != 0 ? null : textLayoutResult, (i11 & 8) != 0 ? OffsetMapping.Companion.getIdentity() : offsetMapping, (i11 & 16) != 0 ? new TextPreparedSelectionState() : textPreparedSelectionState, null);
    }

    private TextPreparedSelection(AnnotatedString annotatedString, long j11, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState) {
        super(annotatedString, j11, textLayoutResult, offsetMapping, textPreparedSelectionState, null);
    }
}
