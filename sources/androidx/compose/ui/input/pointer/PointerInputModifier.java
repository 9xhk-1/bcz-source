package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import m80.k;
import x00.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface PointerInputModifier extends Modifier.Element {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@k PointerInputModifier pointerInputModifier, @k l<? super Modifier.Element, Boolean> lVar) {
            return PointerInputModifier.super.all(lVar);
        }

        @Deprecated
        public static boolean any(@k PointerInputModifier pointerInputModifier, @k l<? super Modifier.Element, Boolean> lVar) {
            return PointerInputModifier.super.any(lVar);
        }

        @Deprecated
        public static <R> R foldIn(@k PointerInputModifier pointerInputModifier, R r11, @k p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) PointerInputModifier.super.foldIn(r11, pVar);
        }

        @Deprecated
        public static <R> R foldOut(@k PointerInputModifier pointerInputModifier, R r11, @k p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) PointerInputModifier.super.foldOut(r11, pVar);
        }

        @Deprecated
        @k
        public static Modifier then(@k PointerInputModifier pointerInputModifier, @k Modifier modifier) {
            return PointerInputModifier.super.then(modifier);
        }
    }

    @k
    PointerInputFilter getPointerInputFilter();
}
