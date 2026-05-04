package androidx.compose.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.g0;
import l50.b;
import m80.k;
import org.junit.jupiter.api.j2;
import x00.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class CombinedModifier implements Modifier {
    public static final int $stable = 0;

    @k
    private final Modifier inner;

    @k
    private final Modifier outer;

    public CombinedModifier(@k Modifier modifier, @k Modifier modifier2) {
        this.outer = modifier;
        this.inner = modifier2;
    }

    @Override // androidx.compose.ui.Modifier
    public boolean all(@k l<? super Modifier.Element, Boolean> lVar) {
        return this.outer.all(lVar) && this.inner.all(lVar);
    }

    @Override // androidx.compose.ui.Modifier
    public boolean any(@k l<? super Modifier.Element, Boolean> lVar) {
        return this.outer.any(lVar) || this.inner.any(lVar);
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof CombinedModifier)) {
            return false;
        }
        CombinedModifier combinedModifier = (CombinedModifier) obj;
        return g0.g(this.outer, combinedModifier.outer) && g0.g(this.inner, combinedModifier.inner);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.Modifier
    public <R> R foldIn(R r11, @k p<? super R, ? super Modifier.Element, ? extends R> pVar) {
        return (R) this.inner.foldIn(this.outer.foldIn(r11, pVar), pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.Modifier
    public <R> R foldOut(R r11, @k p<? super Modifier.Element, ? super R, ? extends R> pVar) {
        return (R) this.outer.foldOut(this.inner.foldOut(r11, pVar), pVar);
    }

    @k
    public final Modifier getInner$ui_release() {
        return this.inner;
    }

    @k
    public final Modifier getOuter$ui_release() {
        return this.outer;
    }

    public int hashCode() {
        return this.outer.hashCode() + (this.inner.hashCode() * 31);
    }

    @k
    public String toString() {
        return '[' + ((String) foldIn("", new p<String, Modifier.Element, String>() { // from class: androidx.compose.ui.CombinedModifier$toString$1
            @Override // x00.p
            public final String invoke(String str, Modifier.Element element) {
                if (str.length() == 0) {
                    return element.toString();
                }
                return str + j2.O + element;
            }
        })) + b.f69930l;
    }
}
