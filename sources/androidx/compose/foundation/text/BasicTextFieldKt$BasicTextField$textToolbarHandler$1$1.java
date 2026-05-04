package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import c40.r0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBasicTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1\n+ 2 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionStateKt\n*L\n1#1,963:1\n1538#2,7:964\n1538#2,7:971\n1538#2,7:978\n1538#2,7:985\n1538#2,7:992\n*S KotlinDebug\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1\n*L\n315#1:964,7\n321#1:971,7\n327#1:978,7\n333#1:985,7\n337#1:992,7\n*E\n"})
/* loaded from: classes.dex */
public final class BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 implements TextToolbarHandler {
    final /* synthetic */ r0 $coroutineScope;
    final /* synthetic */ TextToolbar $currentTextToolbar;

    public BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1(TextToolbar textToolbar, r0 r0Var) {
        this.$currentTextToolbar = textToolbar;
        this.$coroutineScope = r0Var;
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler
    public void hideTextToolbar() {
        if (this.$currentTextToolbar.getStatus() == TextToolbarStatus.Shown) {
            this.$currentTextToolbar.hide();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object showTextToolbar(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r17, androidx.compose.ui.geometry.Rect r18, j00.c<? super yz.g2> r19) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1.showTextToolbar(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, androidx.compose.ui.geometry.Rect, j00.c):java.lang.Object");
    }
}
