package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import m80.k;
import x00.l;
import x00.p;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@n(message = "Use FocusEventModifierNode instead")
/* loaded from: classes.dex */
public interface FocusEventModifier extends Modifier.Element {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@k FocusEventModifier focusEventModifier, @k l<? super Modifier.Element, Boolean> lVar) {
            return FocusEventModifier.super.all(lVar);
        }

        @Deprecated
        public static boolean any(@k FocusEventModifier focusEventModifier, @k l<? super Modifier.Element, Boolean> lVar) {
            return FocusEventModifier.super.any(lVar);
        }

        @Deprecated
        public static <R> R foldIn(@k FocusEventModifier focusEventModifier, R r11, @k p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) FocusEventModifier.super.foldIn(r11, pVar);
        }

        @Deprecated
        public static <R> R foldOut(@k FocusEventModifier focusEventModifier, R r11, @k p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) FocusEventModifier.super.foldOut(r11, pVar);
        }

        @Deprecated
        @k
        public static Modifier then(@k FocusEventModifier focusEventModifier, @k Modifier modifier) {
            return FocusEventModifier.super.then(modifier);
        }
    }

    void onFocusEvent(@k FocusState focusState);
}
