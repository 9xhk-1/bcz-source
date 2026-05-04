package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import m80.k;
import x00.l;
import x00.p;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@n(message = "Use FocusRequesterModifierNode instead")
/* loaded from: classes.dex */
public interface FocusRequesterModifier extends Modifier.Element {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@k FocusRequesterModifier focusRequesterModifier, @k l<? super Modifier.Element, Boolean> lVar) {
            return FocusRequesterModifier.super.all(lVar);
        }

        @Deprecated
        public static boolean any(@k FocusRequesterModifier focusRequesterModifier, @k l<? super Modifier.Element, Boolean> lVar) {
            return FocusRequesterModifier.super.any(lVar);
        }

        @Deprecated
        public static <R> R foldIn(@k FocusRequesterModifier focusRequesterModifier, R r11, @k p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) FocusRequesterModifier.super.foldIn(r11, pVar);
        }

        @Deprecated
        public static <R> R foldOut(@k FocusRequesterModifier focusRequesterModifier, R r11, @k p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) FocusRequesterModifier.super.foldOut(r11, pVar);
        }

        @Deprecated
        @k
        public static Modifier then(@k FocusRequesterModifier focusRequesterModifier, @k Modifier modifier) {
            return FocusRequesterModifier.super.then(modifier);
        }
    }

    @k
    FocusRequester getFocusRequester();
}
