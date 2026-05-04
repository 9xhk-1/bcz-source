package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import m80.k;
import x00.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface OnRemeasuredModifier extends Modifier.Element {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@k OnRemeasuredModifier onRemeasuredModifier, @k l<? super Modifier.Element, Boolean> lVar) {
            return OnRemeasuredModifier.super.all(lVar);
        }

        @Deprecated
        public static boolean any(@k OnRemeasuredModifier onRemeasuredModifier, @k l<? super Modifier.Element, Boolean> lVar) {
            return OnRemeasuredModifier.super.any(lVar);
        }

        @Deprecated
        public static <R> R foldIn(@k OnRemeasuredModifier onRemeasuredModifier, R r11, @k p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) OnRemeasuredModifier.super.foldIn(r11, pVar);
        }

        @Deprecated
        public static <R> R foldOut(@k OnRemeasuredModifier onRemeasuredModifier, R r11, @k p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) OnRemeasuredModifier.super.foldOut(r11, pVar);
        }

        @Deprecated
        @k
        public static Modifier then(@k OnRemeasuredModifier onRemeasuredModifier, @k Modifier modifier) {
            return OnRemeasuredModifier.super.then(modifier);
        }
    }

    /* renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    void m3911onRemeasuredozmzZPI(long j11);
}
