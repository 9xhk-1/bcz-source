package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nApplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,289:1\n4643#2,5:290\n*S KotlinDebug\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n*L\n263#1:290,5\n*E\n"})
/* loaded from: classes.dex */
public final class OffsetApplier<N> implements Applier<N> {
    public static final int $stable = 8;

    @k
    private final Applier<N> applier;
    private int nesting;
    private final int offset;

    public OffsetApplier(@k Applier<N> applier, int i11) {
        this.applier = applier;
        this.offset = i11;
    }

    @Override // androidx.compose.runtime.Applier
    public void clear() {
        ComposerKt.composeImmediateRuntimeError("Clear is not valid on OffsetApplier");
    }

    @Override // androidx.compose.runtime.Applier
    public void down(N n11) {
        this.nesting++;
        this.applier.down(n11);
    }

    @Override // androidx.compose.runtime.Applier
    public N getCurrent() {
        return this.applier.getCurrent();
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i11, N n11) {
        this.applier.insertBottomUp(i11 + (this.nesting == 0 ? this.offset : 0), n11);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int i11, N n11) {
        this.applier.insertTopDown(i11 + (this.nesting == 0 ? this.offset : 0), n11);
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i11, int i12, int i13) {
        int i14 = this.nesting == 0 ? this.offset : 0;
        this.applier.move(i11 + i14, i12 + i14, i13);
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i11, int i12) {
        this.applier.remove(i11 + (this.nesting == 0 ? this.offset : 0), i12);
    }

    @Override // androidx.compose.runtime.Applier
    public void up() {
        if (!(this.nesting > 0)) {
            ComposerKt.composeImmediateRuntimeError("OffsetApplier up called with no corresponding down");
        }
        this.nesting--;
        this.applier.up();
    }
}
