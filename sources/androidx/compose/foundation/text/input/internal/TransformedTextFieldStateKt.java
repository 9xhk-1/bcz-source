package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.TextRange;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TransformedTextFieldStateKt {
    public static final <R> R getIndexTransformationType(@m80.k TransformedTextFieldState transformedTextFieldState, int i11, @m80.k x00.q<? super IndexTransformationType, ? super TextRange, ? super TextRange, ? extends R> qVar) {
        long m1312mapFromTransformedjx7JFs = transformedTextFieldState.m1312mapFromTransformedjx7JFs(i11);
        long m1315mapToTransformedGEjPoXI = transformedTextFieldState.m1315mapToTransformedGEjPoXI(m1312mapFromTransformedjx7JFs);
        return qVar.invoke((TextRange.m4553getCollapsedimpl(m1312mapFromTransformedjx7JFs) && TextRange.m4553getCollapsedimpl(m1315mapToTransformedGEjPoXI)) ? IndexTransformationType.Untransformed : (TextRange.m4553getCollapsedimpl(m1312mapFromTransformedjx7JFs) || TextRange.m4553getCollapsedimpl(m1315mapToTransformedGEjPoXI)) ? (!TextRange.m4553getCollapsedimpl(m1312mapFromTransformedjx7JFs) || TextRange.m4553getCollapsedimpl(m1315mapToTransformedGEjPoXI)) ? IndexTransformationType.Deletion : IndexTransformationType.Insertion : IndexTransformationType.Replacement, TextRange.m4547boximpl(m1312mapFromTransformedjx7JFs), TextRange.m4547boximpl(m1315mapToTransformedGEjPoXI));
    }
}
