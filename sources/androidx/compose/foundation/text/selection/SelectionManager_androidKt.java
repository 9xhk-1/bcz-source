package androidx.compose.foundation.text.selection;

import a00.h0;
import android.view.KeyEvent;
import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyMapping_androidKt;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SelectionManager_androidKt {
    @k
    public static final l<ContextMenuScope, g2> contextMenuBuilder(@k final SelectionManager selectionManager, @k final ContextMenuState contextMenuState) {
        return new l<ContextMenuScope, g2>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$contextMenuBuilder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(ContextMenuScope contextMenuScope) {
                invoke2(contextMenuScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContextMenuScope contextMenuScope) {
                final ContextMenuState contextMenuState2 = ContextMenuState.this;
                TextContextMenuItems textContextMenuItems = TextContextMenuItems.Copy;
                boolean isNonEmptySelection$foundation_release = selectionManager.isNonEmptySelection$foundation_release();
                final SelectionManager selectionManager2 = selectionManager;
                if (isNonEmptySelection$foundation_release) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems), null, false, null, new x00.a<g2>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // x00.a
                        public /* bridge */ /* synthetic */ g2 invoke() {
                            invoke2();
                            return g2.f100423a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            selectionManager2.copy$foundation_release();
                            ContextMenuState_androidKt.close(ContextMenuState.this);
                        }
                    }, 14, null);
                }
                g2 g2Var = g2.f100423a;
                final ContextMenuState contextMenuState3 = ContextMenuState.this;
                TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.SelectAll;
                boolean isEntireContainerSelected$foundation_release = selectionManager.isEntireContainerSelected$foundation_release();
                final SelectionManager selectionManager3 = selectionManager;
                if (!isEntireContainerSelected$foundation_release) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems2), null, false, null, new x00.a<g2>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // x00.a
                        public /* bridge */ /* synthetic */ g2 invoke() {
                            invoke2();
                            return g2.f100423a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            selectionManager3.selectAll$foundation_release();
                            ContextMenuState_androidKt.close(ContextMenuState.this);
                        }
                    }, 14, null);
                }
                h0.Q(g2Var, g2Var);
            }
        };
    }

    /* renamed from: isCopyKeyEvent-ZmokQxo, reason: not valid java name */
    public static final boolean m1487isCopyKeyEventZmokQxo(@k KeyEvent keyEvent) {
        return KeyMapping_androidKt.getPlatformDefaultKeyMapping().mo1052mapZmokQxo(keyEvent) == KeyCommand.COPY;
    }

    @k
    public static final Modifier selectionMagnifier(@k Modifier modifier, @k SelectionManager selectionManager) {
        return !Magnifier_androidKt.isPlatformMagnifierSupported$default(0, 1, null) ? modifier : ComposedModifierKt.composed$default(modifier, null, new SelectionManager_androidKt$selectionMagnifier$1(selectionManager), 1, null);
    }
}
