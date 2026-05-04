package androidx.compose.animation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.ContentScale;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SkipToLookaheadNodeKt {

    @k
    private static final x00.a<Boolean> DefaultEnabled = new x00.a<Boolean>() { // from class: androidx.compose.animation.SkipToLookaheadNodeKt$DefaultEnabled$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    };

    @k
    public static final Modifier createContentScaleModifier(@k Modifier modifier, @k ScaleToBoundsImpl scaleToBoundsImpl, @k final x00.a<Boolean> aVar) {
        return modifier.then(g0.g(scaleToBoundsImpl.getContentScale(), ContentScale.Companion.getCrop()) ? GraphicsLayerModifierKt.graphicsLayer(Modifier.Companion, new l<GraphicsLayerScope, g2>() { // from class: androidx.compose.animation.SkipToLookaheadNodeKt$createContentScaleModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                graphicsLayerScope.setClip(aVar.invoke().booleanValue());
            }
        }) : Modifier.Companion).then(new SkipToLookaheadElement(scaleToBoundsImpl, aVar));
    }
}
