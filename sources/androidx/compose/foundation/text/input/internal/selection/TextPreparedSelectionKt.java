package androidx.compose.foundation.text.input.internal.selection;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.ui.text.TextRange;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt\n+ 2 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldStateKt\n*L\n1#1,560:1\n722#2,23:561\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt\n*L\n465#1:561,23\n*E\n"})
/* loaded from: classes.dex */
public final class TextPreparedSelectionKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IndexTransformationType.values().length];
            try {
                iArr[IndexTransformationType.Untransformed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IndexTransformationType.Deletion.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IndexTransformationType.Replacement.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IndexTransformationType.Insertion.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @VisibleForTesting
    public static final long calculateNextCursorPositionAndWedgeAffinity(int i11, int i12, @k TransformedTextFieldState transformedTextFieldState) {
        if (i11 == -1) {
            return CursorAndWedgeAffinity.m1327constructorimpl(i12);
        }
        boolean z11 = i11 > i12;
        long m1312mapFromTransformedjx7JFs = transformedTextFieldState.m1312mapFromTransformedjx7JFs(i11);
        long m1315mapToTransformedGEjPoXI = transformedTextFieldState.m1315mapToTransformedGEjPoXI(m1312mapFromTransformedjx7JFs);
        int i13 = WhenMappings.$EnumSwitchMapping$0[((TextRange.m4553getCollapsedimpl(m1312mapFromTransformedjx7JFs) && TextRange.m4553getCollapsedimpl(m1315mapToTransformedGEjPoXI)) ? IndexTransformationType.Untransformed : (TextRange.m4553getCollapsedimpl(m1312mapFromTransformedjx7JFs) || TextRange.m4553getCollapsedimpl(m1315mapToTransformedGEjPoXI)) ? (!TextRange.m4553getCollapsedimpl(m1312mapFromTransformedjx7JFs) || TextRange.m4553getCollapsedimpl(m1315mapToTransformedGEjPoXI)) ? IndexTransformationType.Deletion : IndexTransformationType.Insertion : IndexTransformationType.Replacement).ordinal()];
        if (i13 == 1) {
            return CursorAndWedgeAffinity.m1328constructorimpl(i11, z11 ? WedgeAffinity.Start : WedgeAffinity.End);
        }
        if (i13 == 2) {
            return CursorAndWedgeAffinity.m1327constructorimpl(i11);
        }
        if (i13 == 3) {
            return z11 ? CursorAndWedgeAffinity.m1328constructorimpl(TextRange.m4554getEndimpl(m1315mapToTransformedGEjPoXI), WedgeAffinity.Start) : CursorAndWedgeAffinity.m1328constructorimpl(TextRange.m4559getStartimpl(m1315mapToTransformedGEjPoXI), WedgeAffinity.End);
        }
        if (i13 == 4) {
            return z11 ? i11 == TextRange.m4559getStartimpl(m1315mapToTransformedGEjPoXI) ? CursorAndWedgeAffinity.m1328constructorimpl(i11, WedgeAffinity.Start) : CursorAndWedgeAffinity.m1328constructorimpl(TextRange.m4554getEndimpl(m1315mapToTransformedGEjPoXI), WedgeAffinity.End) : i11 == TextRange.m4554getEndimpl(m1315mapToTransformedGEjPoXI) ? CursorAndWedgeAffinity.m1328constructorimpl(i11, WedgeAffinity.End) : CursorAndWedgeAffinity.m1328constructorimpl(TextRange.m4559getStartimpl(m1315mapToTransformedGEjPoXI), WedgeAffinity.Start);
        }
        throw new NoWhenBranchMatchedException();
    }
}
