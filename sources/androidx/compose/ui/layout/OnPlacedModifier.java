package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import m80.k;
import x00.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface OnPlacedModifier extends Modifier.Element {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@k OnPlacedModifier onPlacedModifier, @k l<? super Modifier.Element, Boolean> lVar) {
            return OnPlacedModifier.super.all(lVar);
        }

        @Deprecated
        public static boolean any(@k OnPlacedModifier onPlacedModifier, @k l<? super Modifier.Element, Boolean> lVar) {
            return OnPlacedModifier.super.any(lVar);
        }

        @Deprecated
        public static <R> R foldIn(@k OnPlacedModifier onPlacedModifier, R r11, @k p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) OnPlacedModifier.super.foldIn(r11, pVar);
        }

        @Deprecated
        public static <R> R foldOut(@k OnPlacedModifier onPlacedModifier, R r11, @k p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) OnPlacedModifier.super.foldOut(r11, pVar);
        }

        @Deprecated
        @k
        public static Modifier then(@k OnPlacedModifier onPlacedModifier, @k Modifier modifier) {
            return OnPlacedModifier.super.then(modifier);
        }
    }

    void onPlaced(@k LayoutCoordinates layoutCoordinates);
}
