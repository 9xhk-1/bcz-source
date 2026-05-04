package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.InspectorInfo;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
final class KeyedComposedModifierN extends ComposedModifier {

    @k
    private final String fqName;

    @k
    private final Object[] keys;

    public KeyedComposedModifierN(@k String str, @k Object[] objArr, @k l<? super InspectorInfo, g2> lVar, @k q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        super(lVar, qVar);
        this.fqName = str;
        this.keys = objArr;
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof KeyedComposedModifierN)) {
            return false;
        }
        KeyedComposedModifierN keyedComposedModifierN = (KeyedComposedModifierN) obj;
        return g0.g(this.fqName, keyedComposedModifierN.fqName) && Arrays.equals(this.keys, keyedComposedModifierN.keys);
    }

    @k
    public final String getFqName() {
        return this.fqName;
    }

    @k
    public final Object[] getKeys() {
        return this.keys;
    }

    public int hashCode() {
        return (this.fqName.hashCode() * 31) + Arrays.hashCode(this.keys);
    }
}
