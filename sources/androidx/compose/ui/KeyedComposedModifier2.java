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
final class KeyedComposedModifier2 extends ComposedModifier {

    @k
    private final String fqName;

    @l
    private final Object key1;

    @l
    private final Object key2;

    public KeyedComposedModifier2(@k String str, @l Object obj, @l Object obj2, @k x00.l<? super InspectorInfo, g2> lVar, @k q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        super(lVar, qVar);
        this.fqName = str;
        this.key1 = obj;
        this.key2 = obj2;
    }

    public boolean equals(@l Object obj) {
        if (!(obj instanceof KeyedComposedModifier2)) {
            return false;
        }
        KeyedComposedModifier2 keyedComposedModifier2 = (KeyedComposedModifier2) obj;
        return g0.g(this.fqName, keyedComposedModifier2.fqName) && g0.g(this.key1, keyedComposedModifier2.key1) && g0.g(this.key2, keyedComposedModifier2.key2);
    }

    @k
    public final String getFqName() {
        return this.fqName;
    }

    @l
    public final Object getKey1() {
        return this.key1;
    }

    @l
    public final Object getKey2() {
        return this.key2;
    }

    public int hashCode() {
        int hashCode = this.fqName.hashCode() * 31;
        Object obj = this.key1;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.key2;
        return hashCode2 + (obj2 != null ? obj2.hashCode() : 0);
    }
}
