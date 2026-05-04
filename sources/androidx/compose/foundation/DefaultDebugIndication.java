package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DrawModifierNode;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class DefaultDebugIndication implements IndicationNodeFactory {

    @m80.k
    public static final DefaultDebugIndication INSTANCE = new DefaultDebugIndication();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultDebugIndicationInstance extends Modifier.Node implements DrawModifierNode {

        @m80.k
        private final InteractionSource interactionSource;
        private boolean isFocused;
        private boolean isHovered;
        private boolean isPressed;

        public DefaultDebugIndicationInstance(@m80.k InteractionSource interactionSource) {
            this.interactionSource = interactionSource;
        }

        @Override // androidx.compose.ui.node.DrawModifierNode
        public void draw(@m80.k ContentDrawScope contentDrawScope) {
            contentDrawScope.drawContent();
            if (this.isPressed) {
                DrawScope.m3054drawRectnJ9OG0$default(contentDrawScope, Color.m2508copywmQWz5c$default(Color.Companion.m2535getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, contentDrawScope.mo3060getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
            } else if (this.isHovered || this.isFocused) {
                DrawScope.m3054drawRectnJ9OG0$default(contentDrawScope, Color.m2508copywmQWz5c$default(Color.Companion.m2535getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, contentDrawScope.mo3060getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
            }
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onAttach() {
            c40.k.f(getCoroutineScope(), null, null, new DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this, null), 3, null);
        }
    }

    private DefaultDebugIndication() {
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    @m80.k
    public DelegatableNode create(@m80.k InteractionSource interactionSource) {
        return new DefaultDebugIndicationInstance(interactionSource);
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public boolean equals(@l Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public int hashCode() {
        return -1;
    }
}
