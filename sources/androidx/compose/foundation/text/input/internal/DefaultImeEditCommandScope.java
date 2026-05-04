package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nImeEditCommand.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImeEditCommand.android.kt\nandroidx/compose/foundation/text/input/internal/DefaultImeEditCommandScope\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n+ 5 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n1#1,462:1\n1101#2:463\n1083#2,2:464\n519#3:466\n423#3,9:478\n320#4,2:467\n324#4:477\n325#4,2:487\n327#4:495\n254#5,8:469\n263#5,6:489\n*S KotlinDebug\n*F\n+ 1 ImeEditCommand.android.kt\nandroidx/compose/foundation/text/input/internal/DefaultImeEditCommandScope\n*L\n102#1:463\n102#1:464,2\n117#1:466\n122#1:478,9\n119#1:467,2\n119#1:477\n119#1:487,2\n119#1:495\n119#1:469,8\n119#1:489,6\n*E\n"})
/* loaded from: classes.dex */
public final class DefaultImeEditCommandScope implements ImeEditCommandScope {
    public static final int $stable = 8;
    private int batchDepth;

    @m80.k
    private final MutableVector<x00.l<TextFieldBuffer, g2>> editCommands = new MutableVector<>(new x00.l[16], 0);

    @m80.k
    private final TransformedTextFieldState transformedTextFieldState;

    public DefaultImeEditCommandScope(@m80.k TransformedTextFieldState transformedTextFieldState) {
        this.transformedTextFieldState = transformedTextFieldState;
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public boolean beginBatchEdit() {
        this.batchDepth++;
        return true;
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public void edit(@m80.k x00.l<? super TextFieldBuffer, g2> lVar) {
        beginBatchEdit();
        this.editCommands.add(lVar);
        endBatchEdit();
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public boolean endBatchEdit() {
        int i11 = this.batchDepth - 1;
        this.batchDepth = i11;
        if (i11 == 0 && this.editCommands.getSize() != 0) {
            TransformedTextFieldState transformedTextFieldState = this.transformedTextFieldState;
            TextFieldState textFieldState = transformedTextFieldState.textFieldState;
            InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
            TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
            textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
            TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
            MutableVector<x00.l<TextFieldBuffer, g2>> mutableVector = this.editCommands;
            x00.l<TextFieldBuffer, g2>[] lVarArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i12 = 0; i12 < size; i12++) {
                lVarArr[i12].invoke(mainBuffer$foundation_release);
            }
            transformedTextFieldState.updateWedgeAffinity(mainBuffer$foundation_release);
            textFieldState.commitEditAsUser(inputTransformation, false, textFieldEditUndoBehavior);
            this.editCommands.clear();
        }
        return this.batchDepth > 0;
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    /* renamed from: mapFromTransformed-GEjPoXI */
    public long mo1217mapFromTransformedGEjPoXI(long j11) {
        return this.transformedTextFieldState.m1313mapFromTransformedGEjPoXI(j11);
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    /* renamed from: mapToTransformed-GEjPoXI */
    public long mo1218mapToTransformedGEjPoXI(long j11) {
        return this.transformedTextFieldState.m1315mapToTransformedGEjPoXI(j11);
    }
}
