package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import m80.k;
import x00.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface DrawModifier extends Modifier.Element {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@k DrawModifier drawModifier, @k l<? super Modifier.Element, Boolean> lVar) {
            return DrawModifier.super.all(lVar);
        }

        @Deprecated
        public static boolean any(@k DrawModifier drawModifier, @k l<? super Modifier.Element, Boolean> lVar) {
            return DrawModifier.super.any(lVar);
        }

        @Deprecated
        public static <R> R foldIn(@k DrawModifier drawModifier, R r11, @k p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) DrawModifier.super.foldIn(r11, pVar);
        }

        @Deprecated
        public static <R> R foldOut(@k DrawModifier drawModifier, R r11, @k p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) DrawModifier.super.foldOut(r11, pVar);
        }

        @Deprecated
        @k
        public static Modifier then(@k DrawModifier drawModifier, @k Modifier modifier) {
            return DrawModifier.super.then(modifier);
        }
    }

    void draw(@k ContentDrawScope contentDrawScope);
}
