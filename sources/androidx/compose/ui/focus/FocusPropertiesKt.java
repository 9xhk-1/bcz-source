package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class FocusPropertiesKt {
    @k
    public static final Modifier focusProperties(@k Modifier modifier, @k l<? super FocusProperties, g2> lVar) {
        return modifier.then(new FocusPropertiesElement(new FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0(lVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l<FocusEnterExitScope, g2> toUsingEnterExitScope(final l<? super FocusDirection, FocusRequester> lVar) {
        return new l<FocusEnterExitScope, g2>() { // from class: androidx.compose.ui.focus.FocusPropertiesKt$toUsingEnterExitScope$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(FocusEnterExitScope focusEnterExitScope) {
                invoke2(focusEnterExitScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(FocusEnterExitScope focusEnterExitScope) {
                FocusRequester invoke = lVar.invoke(FocusDirection.m2149boximpl(focusEnterExitScope.mo2148getRequestedFocusDirectiondhqQ8s()));
                FocusRequester.Companion companion = FocusRequester.Companion;
                if (invoke == companion.getCancel()) {
                    focusEnterExitScope.cancelFocusChange();
                } else if (invoke != companion.getDefault()) {
                    FocusRequester.m2179requestFocus3ESFkO8$default(invoke, 0, 1, null);
                }
            }
        };
    }
}
