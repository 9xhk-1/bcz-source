package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import m80.k;
import x00.l;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class FocusOrderModifierKt {
    @n(message = "Use focusProperties() instead", replaceWith = @w0(expression = "this.focusProperties(focusOrderReceiver)", imports = {"androidx.compose.ui.focus.focusProperties"}))
    @k
    public static final Modifier focusOrder(@k Modifier modifier, @k l<? super FocusOrder, g2> lVar) {
        final FocusOrderToProperties focusOrderToProperties = new FocusOrderToProperties(lVar);
        return FocusPropertiesKt.focusProperties(modifier, new l<FocusProperties, g2>() { // from class: androidx.compose.ui.focus.FocusOrderModifierKt$focusOrder$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(FocusProperties focusProperties) {
                invoke2(focusProperties);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(FocusProperties focusProperties) {
                FocusOrderToProperties.this.apply(focusProperties);
            }
        });
    }

    @n(message = "Use focusRequester() instead", replaceWith = @w0(expression = "this.focusRequester(focusRequester)", imports = {"androidx.compose.ui.focus.focusRequester"}))
    @k
    public static final Modifier focusOrder(@k Modifier modifier, @k FocusRequester focusRequester) {
        return FocusRequesterModifierKt.focusRequester(modifier, focusRequester);
    }

    @n(message = "Use focusProperties() and focusRequester() instead", replaceWith = @w0(expression = "this.focusRequester(focusRequester).focusProperties(focusOrderReceiver)", imports = {"androidx.compose.ui.focus.focusProperties, androidx.compose.ui.focus.focusRequester"}))
    @k
    public static final Modifier focusOrder(@k Modifier modifier, @k FocusRequester focusRequester, @k l<? super FocusOrder, g2> lVar) {
        final FocusOrderToProperties focusOrderToProperties = new FocusOrderToProperties(lVar);
        return FocusPropertiesKt.focusProperties(FocusRequesterModifierKt.focusRequester(modifier, focusRequester), new l<FocusProperties, g2>() { // from class: androidx.compose.ui.focus.FocusOrderModifierKt$focusOrder$2
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(FocusProperties focusProperties) {
                invoke2(focusProperties);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(FocusProperties focusProperties) {
                FocusOrderToProperties.this.apply(focusProperties);
            }
        });
    }
}
