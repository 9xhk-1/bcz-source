package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import m80.k;
import x00.l;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class ComposedModifier extends InspectorValueInfo implements Modifier.Element {

    @k
    private final q<Modifier, Composer, Integer, Modifier> factory;

    /* JADX WARN: Multi-variable type inference failed */
    public ComposedModifier(@k l<? super InspectorInfo, g2> lVar, @k q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        super(lVar);
        this.factory = qVar;
    }

    @k
    public final q<Modifier, Composer, Integer, Modifier> getFactory() {
        return this.factory;
    }
}
