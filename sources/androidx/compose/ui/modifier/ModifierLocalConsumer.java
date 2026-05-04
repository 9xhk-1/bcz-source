package androidx.compose.ui.modifier;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import m80.k;
import x00.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface ModifierLocalConsumer extends Modifier.Element {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@k ModifierLocalConsumer modifierLocalConsumer, @k l<? super Modifier.Element, Boolean> lVar) {
            return ModifierLocalConsumer.super.all(lVar);
        }

        @Deprecated
        public static boolean any(@k ModifierLocalConsumer modifierLocalConsumer, @k l<? super Modifier.Element, Boolean> lVar) {
            return ModifierLocalConsumer.super.any(lVar);
        }

        @Deprecated
        public static <R> R foldIn(@k ModifierLocalConsumer modifierLocalConsumer, R r11, @k p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) ModifierLocalConsumer.super.foldIn(r11, pVar);
        }

        @Deprecated
        public static <R> R foldOut(@k ModifierLocalConsumer modifierLocalConsumer, R r11, @k p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) ModifierLocalConsumer.super.foldOut(r11, pVar);
        }

        @Deprecated
        @k
        public static Modifier then(@k ModifierLocalConsumer modifierLocalConsumer, @k Modifier modifier) {
            return ModifierLocalConsumer.super.then(modifier);
        }
    }

    void onModifierLocalsUpdated(@k ModifierLocalReadScope modifierLocalReadScope);
}
