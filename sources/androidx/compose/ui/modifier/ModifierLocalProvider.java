package androidx.compose.ui.modifier;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import m80.k;
import x00.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface ModifierLocalProvider<T> extends Modifier.Element {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static <T> boolean all(@k ModifierLocalProvider<T> modifierLocalProvider, @k l<? super Modifier.Element, Boolean> lVar) {
            return ModifierLocalProvider.super.all(lVar);
        }

        @Deprecated
        public static <T> boolean any(@k ModifierLocalProvider<T> modifierLocalProvider, @k l<? super Modifier.Element, Boolean> lVar) {
            return ModifierLocalProvider.super.any(lVar);
        }

        @Deprecated
        public static <T, R> R foldIn(@k ModifierLocalProvider<T> modifierLocalProvider, R r11, @k p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) ModifierLocalProvider.super.foldIn(r11, pVar);
        }

        @Deprecated
        public static <T, R> R foldOut(@k ModifierLocalProvider<T> modifierLocalProvider, R r11, @k p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) ModifierLocalProvider.super.foldOut(r11, pVar);
        }

        @Deprecated
        @k
        public static <T> Modifier then(@k ModifierLocalProvider<T> modifierLocalProvider, @k Modifier modifier) {
            return ModifierLocalProvider.super.then(modifier);
        }
    }

    @k
    ProvidableModifierLocal<T> getKey();

    T getValue();
}
