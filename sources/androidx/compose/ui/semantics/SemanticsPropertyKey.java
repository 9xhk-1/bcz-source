package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import h10.n;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class SemanticsPropertyKey<T> {
    public static final int $stable = 8;
    private boolean isImportantForAccessibility;

    @k
    private final p<T, T, T> mergePolicy;

    @k
    private final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(@k String str, @k p<? super T, ? super T, ? extends T> pVar) {
        this.name = str;
        this.mergePolicy = pVar;
    }

    @k
    public final p<T, T, T> getMergePolicy$ui_release() {
        return this.mergePolicy;
    }

    @k
    public final String getName() {
        return this.name;
    }

    public final T getValue(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @k n<?> nVar) {
        Object throwSemanticsGetNotSupported;
        throwSemanticsGetNotSupported = SemanticsPropertiesKt.throwSemanticsGetNotSupported();
        return (T) throwSemanticsGetNotSupported;
    }

    public final boolean isImportantForAccessibility$ui_release() {
        return this.isImportantForAccessibility;
    }

    @l
    public final T merge(@l T t11, T t12) {
        return this.mergePolicy.invoke(t11, t12);
    }

    public final void setValue(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @k n<?> nVar, T t11) {
        semanticsPropertyReceiver.set(this, t11);
    }

    @k
    public String toString() {
        return "AccessibilityKey: " + this.name;
    }

    public /* synthetic */ SemanticsPropertyKey(String str, p pVar, int i11, v vVar) {
        this(str, (i11 & 2) != 0 ? new p<T, T, T>() { // from class: androidx.compose.ui.semantics.SemanticsPropertyKey.1
            @Override // x00.p
            public final T invoke(T t11, T t12) {
                return t11 == null ? t12 : t11;
            }
        } : pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(@k String str, boolean z11) {
        this(str, null, 2, 0 == true ? 1 : 0);
        this.isImportantForAccessibility = z11;
    }

    public SemanticsPropertyKey(@k String str, boolean z11, @k p<? super T, ? super T, ? extends T> pVar) {
        this(str, pVar);
        this.isImportantForAccessibility = z11;
    }
}
