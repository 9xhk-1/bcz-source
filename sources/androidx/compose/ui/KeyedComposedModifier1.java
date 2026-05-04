package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
final class KeyedComposedModifier1 extends ComposedModifier {

    @k
    private final String fqName;

    @l
    private final Object key1;

    public KeyedComposedModifier1(@k String str, @l Object obj, @k x00.l<? super InspectorInfo, g2> lVar, @k q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        super(lVar, qVar);
        this.fqName = str;
        this.key1 = obj;
    }

    public boolean equals(@l Object obj) {
        if (!(obj instanceof KeyedComposedModifier1)) {
            return false;
        }
        KeyedComposedModifier1 keyedComposedModifier1 = (KeyedComposedModifier1) obj;
        return g0.g(this.fqName, keyedComposedModifier1.fqName) && g0.g(this.key1, keyedComposedModifier1.key1);
    }

    @k
    public final String getFqName() {
        return this.fqName;
    }

    @l
    public final Object getKey1() {
        return this.key1;
    }

    public int hashCode() {
        int hashCode = this.fqName.hashCode() * 31;
        Object obj = this.key1;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }
}
