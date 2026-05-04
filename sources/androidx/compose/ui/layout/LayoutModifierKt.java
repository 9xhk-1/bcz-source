package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import m80.k;
import x00.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LayoutModifierKt {
    @k
    public static final Modifier layout(@k Modifier modifier, @k q<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> qVar) {
        return modifier.then(new LayoutElement(qVar));
    }
}
