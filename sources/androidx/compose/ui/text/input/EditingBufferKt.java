package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m4721updateRangeAfterDeletepWDy79M(long j11, long j12) {
        int m4555getLengthimpl;
        int m4557getMinimpl = TextRange.m4557getMinimpl(j11);
        int m4556getMaximpl = TextRange.m4556getMaximpl(j11);
        if (TextRange.m4561intersects5zctL8(j12, j11)) {
            if (TextRange.m4549contains5zctL8(j12, j11)) {
                m4557getMinimpl = TextRange.m4557getMinimpl(j12);
                m4556getMaximpl = m4557getMinimpl;
            } else {
                if (TextRange.m4549contains5zctL8(j11, j12)) {
                    m4555getLengthimpl = TextRange.m4555getLengthimpl(j12);
                } else if (TextRange.m4550containsimpl(j12, m4557getMinimpl)) {
                    m4557getMinimpl = TextRange.m4557getMinimpl(j12);
                    m4555getLengthimpl = TextRange.m4555getLengthimpl(j12);
                } else {
                    m4556getMaximpl = TextRange.m4557getMinimpl(j12);
                }
                m4556getMaximpl -= m4555getLengthimpl;
            }
        } else if (m4556getMaximpl > TextRange.m4557getMinimpl(j12)) {
            m4557getMinimpl -= TextRange.m4555getLengthimpl(j12);
            m4555getLengthimpl = TextRange.m4555getLengthimpl(j12);
            m4556getMaximpl -= m4555getLengthimpl;
        }
        return TextRangeKt.TextRange(m4557getMinimpl, m4556getMaximpl);
    }
}
