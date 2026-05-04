package androidx.compose.foundation.text;

import a00.h0;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextRange;
import g10.u;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@u0({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollerPosition\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,396:1\n79#2:397\n112#2,2:398\n79#2:400\n112#2,2:401\n78#3:403\n107#3,2:404\n85#4:406\n113#4,2:407\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollerPosition\n*L\n277#1:397\n277#1:398,2\n283#1:400\n283#1:401,2\n287#1:403\n287#1:404,2\n302#1:406\n302#1:407,2\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldScrollerPosition {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final Saver<TextFieldScrollerPosition, Object> Saver = ListSaverKt.listSaver(new p<SaverScope, TextFieldScrollerPosition, List<? extends Object>>() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$Companion$Saver$1
        @Override // x00.p
        public final List<Object> invoke(SaverScope saverScope, TextFieldScrollerPosition textFieldScrollerPosition) {
            return h0.Q(Float.valueOf(textFieldScrollerPosition.getOffset()), Boolean.valueOf(textFieldScrollerPosition.getOrientation() == Orientation.Vertical));
        }
    }, new l<List<? extends Object>, TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$Companion$Saver$2
        @Override // x00.l
        public final TextFieldScrollerPosition invoke(List<? extends Object> list) {
            Object obj = list.get(1);
            g0.n(obj, "null cannot be cast to non-null type kotlin.Boolean");
            Orientation orientation = ((Boolean) obj).booleanValue() ? Orientation.Vertical : Orientation.Horizontal;
            Object obj2 = list.get(0);
            g0.n(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new TextFieldScrollerPosition(orientation, ((Float) obj2).floatValue());
        }
    });

    @k
    private final MutableFloatState maximum$delegate;

    @k
    private final MutableFloatState offset$delegate;

    @k
    private final MutableState orientation$delegate;

    @k
    private Rect previousCursorRect;
    private long previousSelection;

    @k
    private final MutableIntState viewportSize$delegate;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final Saver<TextFieldScrollerPosition, Object> getSaver() {
            return TextFieldScrollerPosition.Saver;
        }

        private Companion() {
        }
    }

    public TextFieldScrollerPosition(@k Orientation orientation, float f11) {
        this.offset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f11);
        this.maximum$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.viewportSize$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.previousCursorRect = Rect.Companion.getZero();
        this.previousSelection = TextRange.Companion.m4564getZerod9O1mEE();
        this.orientation$delegate = SnapshotStateKt.mutableStateOf(orientation, SnapshotStateKt.structuralEqualityPolicy());
    }

    private final void setMaximum(float f11) {
        this.maximum$delegate.setFloatValue(f11);
    }

    private final void setViewportSize(int i11) {
        this.viewportSize$delegate.setIntValue(i11);
    }

    public final void coerceOffset$foundation_release(float f11, float f12, int i11) {
        float offset = getOffset();
        float f13 = i11;
        float f14 = offset + f13;
        setOffset(getOffset() + ((f12 <= f14 && (f11 >= offset || f12 - f11 <= f13)) ? (f11 >= offset || f12 - f11 > f13) ? 0.0f : f11 - offset : f12 - f14));
    }

    public final float getMaximum() {
        return this.maximum$delegate.getFloatValue();
    }

    public final float getOffset() {
        return this.offset$delegate.getFloatValue();
    }

    /* renamed from: getOffsetToFollow-5zc-tL8, reason: not valid java name */
    public final int m1156getOffsetToFollow5zctL8(long j11) {
        return TextRange.m4559getStartimpl(j11) != TextRange.m4559getStartimpl(this.previousSelection) ? TextRange.m4559getStartimpl(j11) : TextRange.m4554getEndimpl(j11) != TextRange.m4554getEndimpl(this.previousSelection) ? TextRange.m4554getEndimpl(j11) : TextRange.m4557getMinimpl(j11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public final Orientation getOrientation() {
        return (Orientation) this.orientation$delegate.getValue();
    }

    /* renamed from: getPreviousSelection-d9O1mEE, reason: not valid java name */
    public final long m1157getPreviousSelectiond9O1mEE() {
        return this.previousSelection;
    }

    public final int getViewportSize() {
        return this.viewportSize$delegate.getIntValue();
    }

    public final void setOffset(float f11) {
        this.offset$delegate.setFloatValue(f11);
    }

    public final void setOrientation(@k Orientation orientation) {
        this.orientation$delegate.setValue(orientation);
    }

    /* renamed from: setPreviousSelection-5zc-tL8, reason: not valid java name */
    public final void m1158setPreviousSelection5zctL8(long j11) {
        this.previousSelection = j11;
    }

    public final void update(@k Orientation orientation, @k Rect rect, int i11, int i12) {
        float f11 = i12 - i11;
        setMaximum(f11);
        if (rect.getLeft() != this.previousCursorRect.getLeft() || rect.getTop() != this.previousCursorRect.getTop()) {
            boolean z11 = orientation == Orientation.Vertical;
            coerceOffset$foundation_release(z11 ? rect.getTop() : rect.getLeft(), z11 ? rect.getBottom() : rect.getRight(), i11);
            this.previousCursorRect = rect;
        }
        setOffset(u.H(getOffset(), 0.0f, f11));
        setViewportSize(i11);
    }

    public /* synthetic */ TextFieldScrollerPosition(Orientation orientation, float f11, int i11, v vVar) {
        this(orientation, (i11 & 2) != 0 ? 0.0f : f11);
    }

    public TextFieldScrollerPosition() {
        this(Orientation.Vertical, 0.0f, 2, null);
    }
}
