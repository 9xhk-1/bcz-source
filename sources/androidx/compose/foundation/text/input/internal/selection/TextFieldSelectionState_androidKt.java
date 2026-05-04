package androidx.compose.foundation.text.input.internal.selection;

import android.os.Build;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1;
import androidx.compose.foundation.text.MenuItemsAvailability;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.runtime.State;
import m80.k;
import x00.a;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TextFieldSelectionState_androidKt {
    @k
    public static final l<ContextMenuScope, g2> contextMenuBuilder(@k final TextFieldSelectionState textFieldSelectionState, @k final ContextMenuState contextMenuState, @k final State<MenuItemsAvailability> state, @k final p<? super TextFieldSelectionState, ? super TextContextMenuItems, g2> pVar) {
        return new l<ContextMenuScope, g2>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                final p<TextFieldSelectionState, TextContextMenuItems, g2> pVar2 = pVar;
                final TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
                if (m1115getCanCutimpl) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems), null, false, null, new a<g2>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1
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
                            pVar2.invoke(textFieldSelectionState2, TextContextMenuItems.Cut);
                            ContextMenuState_androidKt.close(ContextMenuState.this);
                        }
                    }, 14, null);
                }
                final ContextMenuState contextMenuState3 = contextMenuState;
                TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.Copy;
                boolean m1114getCanCopyimpl = MenuItemsAvailability.m1114getCanCopyimpl(m1120unboximpl);
                final p<TextFieldSelectionState, TextContextMenuItems, g2> pVar3 = pVar;
                final TextFieldSelectionState textFieldSelectionState3 = textFieldSelectionState;
                if (m1114getCanCopyimpl) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems2), null, false, null, new a<g2>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2
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
                            pVar3.invoke(textFieldSelectionState3, TextContextMenuItems.Copy);
                            ContextMenuState_androidKt.close(ContextMenuState.this);
                        }
                    }, 14, null);
                }
                final ContextMenuState contextMenuState4 = contextMenuState;
                TextContextMenuItems textContextMenuItems3 = TextContextMenuItems.Paste;
                boolean m1116getCanPasteimpl = MenuItemsAvailability.m1116getCanPasteimpl(m1120unboximpl);
                final p<TextFieldSelectionState, TextContextMenuItems, g2> pVar4 = pVar;
                final TextFieldSelectionState textFieldSelectionState4 = textFieldSelectionState;
                if (m1116getCanPasteimpl) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems3), null, false, null, new a<g2>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$3
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
                            pVar4.invoke(textFieldSelectionState4, TextContextMenuItems.Paste);
                            ContextMenuState_androidKt.close(ContextMenuState.this);
                        }
                    }, 14, null);
                }
                final ContextMenuState contextMenuState5 = contextMenuState;
                TextContextMenuItems textContextMenuItems4 = TextContextMenuItems.SelectAll;
                boolean m1117getCanSelectAllimpl = MenuItemsAvailability.m1117getCanSelectAllimpl(m1120unboximpl);
                final p<TextFieldSelectionState, TextContextMenuItems, g2> pVar5 = pVar;
                final TextFieldSelectionState textFieldSelectionState5 = textFieldSelectionState;
                if (m1117getCanSelectAllimpl) {
                    ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems4), null, false, null, new a<g2>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$4
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
                            pVar5.invoke(textFieldSelectionState5, TextContextMenuItems.SelectAll);
                            ContextMenuState_androidKt.close(ContextMenuState.this);
                        }
                    }, 14, null);
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    final ContextMenuState contextMenuState6 = contextMenuState;
                    TextContextMenuItems textContextMenuItems5 = TextContextMenuItems.Autofill;
                    boolean m1113getCanAutofillimpl = MenuItemsAvailability.m1113getCanAutofillimpl(m1120unboximpl);
                    final p<TextFieldSelectionState, TextContextMenuItems, g2> pVar6 = pVar;
                    final TextFieldSelectionState textFieldSelectionState6 = textFieldSelectionState;
                    if (m1113getCanAutofillimpl) {
                        ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems5), null, false, null, new a<g2>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$5
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
                                pVar6.invoke(textFieldSelectionState6, TextContextMenuItems.Autofill);
                                ContextMenuState_androidKt.close(ContextMenuState.this);
                            }
                        }, 14, null);
                    }
                }
            }
        };
    }
}
