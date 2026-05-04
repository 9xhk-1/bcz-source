package androidx.compose.foundation.text.selection;

import android.os.Build;
import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1;
import androidx.compose.foundation.text.MenuItemsAvailability;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.text.TextRange;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TextFieldSelectionManager_androidKt {
    @k
    public static final l<ContextMenuScope, g2> contextMenuBuilder(@k final TextFieldSelectionManager textFieldSelectionManager, @k final ContextMenuState contextMenuState, @k final State<MenuItemsAvailability> state) {
        return new l<ContextMenuScope, g2>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1
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
                int m1120unboximpl = state.getValue().m1120unboximpl();
                final ContextMenuState contextMenuState2 = contextMenuState;
                TextContextMenuItems textContextMenuItems = TextContextMenuItems.Cut;
                boolean m1115getCanCutimpl = MenuItemsAvailability.m1115getCanCutimpl(m1120unboximpl);
                final TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                if (m1115getCanCutimpl) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems), null, false, null, new x00.a<g2>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1
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
                            textFieldSelectionManager2.cut$foundation_release();
                            ContextMenuState_androidKt.close(ContextMenuState.this);
                        }
                    }, 14, null);
                }
                final ContextMenuState contextMenuState3 = contextMenuState;
                TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.Copy;
                boolean m1114getCanCopyimpl = MenuItemsAvailability.m1114getCanCopyimpl(m1120unboximpl);
                final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager;
                if (m1114getCanCopyimpl) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems2), null, false, null, new x00.a<g2>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2
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
                            textFieldSelectionManager3.copy$foundation_release(false);
                            ContextMenuState_androidKt.close(ContextMenuState.this);
                        }
                    }, 14, null);
                }
                final ContextMenuState contextMenuState4 = contextMenuState;
                TextContextMenuItems textContextMenuItems3 = TextContextMenuItems.Paste;
                boolean m1116getCanPasteimpl = MenuItemsAvailability.m1116getCanPasteimpl(m1120unboximpl);
                final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager;
                if (m1116getCanPasteimpl) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems3), null, false, null, new x00.a<g2>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$3
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
                            textFieldSelectionManager4.paste$foundation_release();
                            ContextMenuState_androidKt.close(ContextMenuState.this);
                        }
                    }, 14, null);
                }
                final ContextMenuState contextMenuState5 = contextMenuState;
                TextContextMenuItems textContextMenuItems4 = TextContextMenuItems.SelectAll;
                boolean m1117getCanSelectAllimpl = MenuItemsAvailability.m1117getCanSelectAllimpl(m1120unboximpl);
                final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager;
                if (m1117getCanSelectAllimpl) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems4), null, false, null, new x00.a<g2>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$4
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
                            textFieldSelectionManager5.selectAll$foundation_release();
                            ContextMenuState_androidKt.close(ContextMenuState.this);
                        }
                    }, 14, null);
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    final ContextMenuState contextMenuState6 = contextMenuState;
                    TextContextMenuItems textContextMenuItems5 = TextContextMenuItems.Autofill;
                    boolean z11 = textFieldSelectionManager.getEditable() && TextRange.m4553getCollapsedimpl(textFieldSelectionManager.getValue$foundation_release().m4807getSelectiond9O1mEE());
                    final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager;
                    if (z11) {
                        ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems5), null, false, null, new x00.a<g2>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$5
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
                                textFieldSelectionManager6.autofill$foundation_release();
                                ContextMenuState_androidKt.close(ContextMenuState.this);
                            }
                        }, 14, null);
                    }
                }
            }
        };
    }

    public static final boolean isShiftPressed(@k PointerEvent pointerEvent) {
        return false;
    }

    @k
    public static final Modifier textFieldMagnifier(@k Modifier modifier, @k TextFieldSelectionManager textFieldSelectionManager) {
        return !Magnifier_androidKt.isPlatformMagnifierSupported$default(0, 1, null) ? modifier : ComposedModifierKt.composed$default(modifier, null, new TextFieldSelectionManager_androidKt$textFieldMagnifier$1(textFieldSelectionManager), 1, null);
    }
}
