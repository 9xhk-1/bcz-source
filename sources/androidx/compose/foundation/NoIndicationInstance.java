package androidx.compose.foundation;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class NoIndicationInstance implements IndicationInstance {

    @m80.k
    public static final NoIndicationInstance INSTANCE = new NoIndicationInstance();

    private NoIndicationInstance() {
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public void drawIndication(@m80.k ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
    }
}
