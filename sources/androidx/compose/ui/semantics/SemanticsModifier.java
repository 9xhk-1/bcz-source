package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import m80.k;
import x00.l;
import x00.p;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface SemanticsModifier extends Modifier.Element {
    default int getId() {
        return -1;
    }

    @k
    SemanticsConfiguration getSemanticsConfiguration();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@k SemanticsModifier semanticsModifier, @k l<? super Modifier.Element, Boolean> lVar) {
            return SemanticsModifier.super.all(lVar);
        }

        @Deprecated
        public static boolean any(@k SemanticsModifier semanticsModifier, @k l<? super Modifier.Element, Boolean> lVar) {
            return SemanticsModifier.super.any(lVar);
        }

        @Deprecated
        public static <R> R foldIn(@k SemanticsModifier semanticsModifier, R r11, @k p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) SemanticsModifier.super.foldIn(r11, pVar);
        }

        @Deprecated
        public static <R> R foldOut(@k SemanticsModifier semanticsModifier, R r11, @k p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) SemanticsModifier.super.foldOut(r11, pVar);
        }

        @Deprecated
        public static int getId(@k SemanticsModifier semanticsModifier) {
            return SemanticsModifier.super.getId();
        }

        @Deprecated
        @k
        public static Modifier then(@k SemanticsModifier semanticsModifier, @k Modifier modifier) {
            return SemanticsModifier.super.then(modifier);
        }

        @n(message = "SemanticsModifier.id is now unused and has been set to a fixed value. Retrieve the id from LayoutInfo instead.", replaceWith = @w0(expression = "", imports = {}))
        public static /* synthetic */ void getId$annotations() {
        }
    }
}
