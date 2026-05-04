package androidx.compose.ui.node;

import android.view.KeyEvent;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import m80.k;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface RootForTest {
    @k
    Density getDensity();

    @k
    SemanticsOwner getSemanticsOwner();

    @k
    TextInputService getTextInputService();

    /* renamed from: sendKeyEvent-ZmokQxo, reason: not valid java name */
    boolean mo4180sendKeyEventZmokQxo(@k KeyEvent keyEvent);

    @n(message = "Use PlatformTextInputModifierNode instead.")
    static /* synthetic */ void getTextInputService$annotations() {
    }

    default void measureAndLayoutForTest() {
    }

    default void forceAccessibilityForTesting(boolean z11) {
    }

    default void setAccessibilityEventBatchIntervalMillis(long j11) {
    }
}
