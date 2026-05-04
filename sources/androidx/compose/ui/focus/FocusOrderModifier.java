package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import m80.k;
import x00.l;
import x00.p;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@n(message = "Use Modifier.focusProperties() instead")
/* loaded from: classes.dex */
public interface FocusOrderModifier extends Modifier.Element {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@k FocusOrderModifier focusOrderModifier, @k l<? super Modifier.Element, Boolean> lVar) {
            return FocusOrderModifier.super.all(lVar);
        }

        @Deprecated
        public static boolean any(@k FocusOrderModifier focusOrderModifier, @k l<? super Modifier.Element, Boolean> lVar) {
            return FocusOrderModifier.super.any(lVar);
        }

        @Deprecated
        public static <R> R foldIn(@k FocusOrderModifier focusOrderModifier, R r11, @k p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) FocusOrderModifier.super.foldIn(r11, pVar);
        }

        @Deprecated
        public static <R> R foldOut(@k FocusOrderModifier focusOrderModifier, R r11, @k p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) FocusOrderModifier.super.foldOut(r11, pVar);
        }

        @Deprecated
        @k
        public static Modifier then(@k FocusOrderModifier focusOrderModifier, @k Modifier modifier) {
            return FocusOrderModifier.super.then(modifier);
        }
    }

    void populateFocusOrder(@k FocusOrder focusOrder);
}
