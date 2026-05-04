package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nStateObjectImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/StateObjectImpl\n+ 2 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind\n*L\n1#1,63:1\n50#2:64\n47#2:65\n50#2:66\n*S KotlinDebug\n*F\n+ 1 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/StateObjectImpl\n*L\n34#1:64\n36#1:65\n41#1:66\n*E\n"})
/* loaded from: classes.dex */
public abstract class StateObjectImpl implements StateObject {
    public static final int $stable = 0;

    @k
    private final AtomicInt readerKind = new AtomicInt(0);

    /* renamed from: isReadIn-h_f27i8$runtime_release, reason: not valid java name */
    public final boolean m2083isReadInh_f27i8$runtime_release(int i11) {
        return (i11 & ReaderKind.m2071constructorimpl(this.readerKind.get())) != 0;
    }

    /* renamed from: recordReadIn-h_f27i8$runtime_release, reason: not valid java name */
    public final void m2084recordReadInh_f27i8$runtime_release(int i11) {
        int m2071constructorimpl;
        do {
            m2071constructorimpl = ReaderKind.m2071constructorimpl(this.readerKind.get());
            if ((m2071constructorimpl & i11) != 0) {
                return;
            }
        } while (!this.readerKind.compareAndSet(m2071constructorimpl, ReaderKind.m2071constructorimpl(m2071constructorimpl | i11)));
    }
}
