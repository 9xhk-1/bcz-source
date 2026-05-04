package androidx.compose.runtime.internal;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import kotlin.text.a;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class IntRef {
    public static final int $stable = 8;
    private int element;

    public IntRef() {
        this(0, 1, null);
    }

    public final int getElement() {
        return this.element;
    }

    public final void setElement(int i11) {
        this.element = i11;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("IntRef(element = ");
        sb2.append(this.element);
        sb2.append(")@");
        String num = Integer.toString(hashCode(), a.a(16));
        g0.o(num, "toString(...)");
        sb2.append(num);
        return sb2.toString();
    }

    public IntRef(int i11) {
        this.element = i11;
    }

    public /* synthetic */ IntRef(int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? 0 : i11);
    }
}
