package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import m80.k;
import x00.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface OnGloballyPositionedModifier extends Modifier.Element {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@k OnGloballyPositionedModifier onGloballyPositionedModifier, @k l<? super Modifier.Element, Boolean> lVar) {
            return OnGloballyPositionedModifier.super.all(lVar);
        }

        @Deprecated
        public static boolean any(@k OnGloballyPositionedModifier onGloballyPositionedModifier, @k l<? super Modifier.Element, Boolean> lVar) {
            return OnGloballyPositionedModifier.super.any(lVar);
        }

        @Deprecated
        public static <R> R foldIn(@k OnGloballyPositionedModifier onGloballyPositionedModifier, R r11, @k p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) OnGloballyPositionedModifier.super.foldIn(r11, pVar);
        }

        @Deprecated
        public static <R> R foldOut(@k OnGloballyPositionedModifier onGloballyPositionedModifier, R r11, @k p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) OnGloballyPositionedModifier.super.foldOut(r11, pVar);
        }

        @Deprecated
        @k
        public static Modifier then(@k OnGloballyPositionedModifier onGloballyPositionedModifier, @k Modifier modifier) {
            return OnGloballyPositionedModifier.super.then(modifier);
        }
    }

    void onGloballyPositioned(@k LayoutCoordinates layoutCoordinates);
}
