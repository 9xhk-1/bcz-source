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
final class KeyedComposedModifier3 extends ComposedModifier {

    @k
    private final String fqName;

    @l
    private final Object key1;

    @l
    private final Object key2;

    @l
    private final Object key3;

    public KeyedComposedModifier3(@k String str, @l Object obj, @l Object obj2, @l Object obj3, @k x00.l<? super InspectorInfo, g2> lVar, @k q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        super(lVar, qVar);
        this.fqName = str;
        this.key1 = obj;
        this.key2 = obj2;
        this.key3 = obj3;
    }

    public boolean equals(@l Object obj) {
        if (!(obj instanceof KeyedComposedModifier3)) {
            return false;
        }
        KeyedComposedModifier3 keyedComposedModifier3 = (KeyedComposedModifier3) obj;
        return g0.g(this.fqName, keyedComposedModifier3.fqName) && g0.g(this.key1, keyedComposedModifier3.key1) && g0.g(this.key2, keyedComposedModifier3.key2) && g0.g(this.key3, keyedComposedModifier3.key3);
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

    @l
    public final Object getKey3() {
        return this.key3;
    }

    public int hashCode() {
        int hashCode = this.fqName.hashCode() * 31;
        Object obj = this.key1;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.key2;
        int hashCode3 = (hashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object obj3 = this.key3;
        return hashCode3 + (obj3 != null ? obj3.hashCode() : 0);
    }
}
