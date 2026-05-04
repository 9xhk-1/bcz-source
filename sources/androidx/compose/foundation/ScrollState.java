package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import g10.u;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@u0({"SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollState\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,485:1\n78#2:486\n107#2,2:487\n78#2:497\n107#2,2:498\n602#3,8:489\n85#4:500\n85#4:501\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollState\n*L\n90#1:486\n90#1:487,2\n109#1:497\n109#1:498,2\n98#1:489,8\n153#1:500\n155#1:501\n*E\n"})
/* loaded from: classes.dex */
public final class ScrollState implements ScrollableState {
    public static final int $stable = 0;

    @m80.k
    public static final Companion Companion = new Companion(null);

    @m80.k
    private static final Saver<ScrollState, ?> Saver = SaverKt.Saver(new p<SaverScope, ScrollState, Integer>() { // from class: androidx.compose.foundation.ScrollState$Companion$Saver$1
        @Override // x00.p
        public final Integer invoke(SaverScope saverScope, ScrollState scrollState) {
            return Integer.valueOf(scrollState.getValue());
        }
    }, new l<Integer, ScrollState>() { // from class: androidx.compose.foundation.ScrollState$Companion$Saver$2
        public final ScrollState invoke(int i11) {
            return new ScrollState(i11);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ ScrollState invoke(Integer num) {
            return invoke(num.intValue());
        }
    });
    private float accumulator;

    @m80.k
    private final MutableIntState value$delegate;

    @m80.k
    private final MutableIntState viewportSize$delegate = SnapshotIntStateKt.mutableIntStateOf(0);

    @m80.k
    private final MutableInteractionSource internalInteractionSource = InteractionSourceKt.MutableInteractionSource();

    @m80.k
    private MutableIntState _maxValueState = SnapshotIntStateKt.mutableIntStateOf(Integer.MAX_VALUE);

    @m80.k
    private final ScrollableState scrollableState = ScrollableStateKt.ScrollableState(new l<Float, Float>() { // from class: androidx.compose.foundation.ScrollState$scrollableState$1
        {
            super(1);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Float invoke(Float f11) {
            return invoke(f11.floatValue());
        }

        public final Float invoke(float f11) {
            float f12;
            f12 = ScrollState.this.accumulator;
            float value = ScrollState.this.getValue() + f11 + f12;
            float H = u.H(value, 0.0f, ScrollState.this.getMaxValue());
            boolean z11 = value == H;
            float value2 = H - ScrollState.this.getValue();
            int round = Math.round(value2);
            ScrollState scrollState = ScrollState.this;
            scrollState.setValue(scrollState.getValue() + round);
            ScrollState.this.accumulator = value2 - round;
            if (!z11) {
                f11 = value2;
            }
            return Float.valueOf(f11);
        }
    });

    @m80.k
    private final State canScrollForward$delegate = SnapshotStateKt.derivedStateOf(new x00.a<Boolean>() { // from class: androidx.compose.foundation.ScrollState$canScrollForward$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final Boolean invoke() {
            return Boolean.valueOf(ScrollState.this.getValue() < ScrollState.this.getMaxValue());
        }
    });

    @m80.k
    private final State canScrollBackward$delegate = SnapshotStateKt.derivedStateOf(new x00.a<Boolean>() { // from class: androidx.compose.foundation.ScrollState$canScrollBackward$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final Boolean invoke() {
            return Boolean.valueOf(ScrollState.this.getValue() > 0);
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @m80.k
        public final Saver<ScrollState, ?> getSaver() {
            return ScrollState.Saver;
        }

        private Companion() {
        }
    }

    public ScrollState(int i11) {
        this.value$delegate = SnapshotIntStateKt.mutableIntStateOf(i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollTo$default(ScrollState scrollState, int i11, AnimationSpec animationSpec, j00.c cVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 0.0f, null, 7, null);
        }
        return scrollState.animateScrollTo(i11, animationSpec, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setValue(int i11) {
        this.value$delegate.setIntValue(i11);
    }

    @m80.l
    public final Object animateScrollTo(int i11, @m80.k AnimationSpec<Float> animationSpec, @m80.k j00.c<? super g2> cVar) {
        Object animateScrollBy = ScrollExtensionsKt.animateScrollBy(this, i11 - getValue(), animationSpec, cVar);
        return animateScrollBy == kotlin.coroutines.intrinsics.b.l() ? animateScrollBy : g2.f100423a;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f11) {
        return this.scrollableState.dispatchRawDelta(f11);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    @m80.k
    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    @m80.k
    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.internalInteractionSource;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.scrollableState.getLastScrolledBackward();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.scrollableState.getLastScrolledForward();
    }

    public final int getMaxValue() {
        return this._maxValueState.getIntValue();
    }

    public final int getValue() {
        return this.value$delegate.getIntValue();
    }

    public final int getViewportSize() {
        return this.viewportSize$delegate.getIntValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    @m80.l
    public Object scroll(@m80.k MutatePriority mutatePriority, @m80.k p<? super ScrollScope, ? super j00.c<? super g2>, ? extends Object> pVar, @m80.k j00.c<? super g2> cVar) {
        Object scroll = this.scrollableState.scroll(mutatePriority, pVar, cVar);
        return scroll == kotlin.coroutines.intrinsics.b.l() ? scroll : g2.f100423a;
    }

    @m80.l
    public final Object scrollTo(int i11, @m80.k j00.c<? super Float> cVar) {
        return ScrollExtensionsKt.scrollBy(this, i11 - getValue(), cVar);
    }

    public final void setMaxValue$foundation_release(int i11) {
        this._maxValueState.setIntValue(i11);
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        l<Object, g2> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (getValue() > i11) {
                setValue(i11);
            }
            g2 g2Var = g2.f100423a;
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        } catch (Throwable th2) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th2;
        }
    }

    public final void setViewportSize$foundation_release(int i11) {
        this.viewportSize$delegate.setIntValue(i11);
    }
}
