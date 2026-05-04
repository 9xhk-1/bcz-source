package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import m80.k;
import x00.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface ParentDataModifier extends Modifier.Element {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@k ParentDataModifier parentDataModifier, @k l<? super Modifier.Element, Boolean> lVar) {
            return ParentDataModifier.super.all(lVar);
        }

        @Deprecated
        public static boolean any(@k ParentDataModifier parentDataModifier, @k l<? super Modifier.Element, Boolean> lVar) {
            return ParentDataModifier.super.any(lVar);
        }

        @Deprecated
        public static <R> R foldIn(@k ParentDataModifier parentDataModifier, R r11, @k p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) ParentDataModifier.super.foldIn(r11, pVar);
        }

        @Deprecated
        public static <R> R foldOut(@k ParentDataModifier parentDataModifier, R r11, @k p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) ParentDataModifier.super.foldOut(r11, pVar);
        }

        @Deprecated
        @k
        public static Modifier then(@k ParentDataModifier parentDataModifier, @k Modifier modifier) {
            return ParentDataModifier.super.then(modifier);
        }
    }

    @m80.l
    Object modifyParentData(@k Density density, @m80.l Object obj);
}
