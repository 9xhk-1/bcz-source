package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSelectionMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionMode.kt\nandroidx/compose/foundation/text/selection/SelectionMode\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,111:1\n65#2:112\n69#2:115\n60#3:113\n70#3:116\n22#4:114\n*S KotlinDebug\n*F\n+ 1 SelectionMode.kt\nandroidx/compose/foundation/text/selection/SelectionMode\n*L\n109#1:112\n109#1:115\n109#1:113\n109#1:116\n109#1:114\n*E\n"})
/* loaded from: classes.dex */
public abstract class SelectionMode {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ SelectionMode[] $VALUES;
    public static final SelectionMode Vertical = new SelectionMode("Vertical", 0) { // from class: androidx.compose.foundation.text.selection.SelectionMode.Vertical
        {
            v vVar = null;
        }

        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* renamed from: compare-3MmeM6k$foundation_release */
        public int mo1492compare3MmeM6k$foundation_release(long j11, @k Rect rect) {
            if (SelectionManagerKt.m1485containsInclusiveUv8p0NA(rect, j11)) {
                return 0;
            }
            int i11 = (int) (4294967295L & j11);
            if (Float.intBitsToFloat(i11) < rect.getTop()) {
                return -1;
            }
            return (Float.intBitsToFloat((int) (j11 >> 32)) >= rect.getLeft() || Float.intBitsToFloat(i11) >= rect.getBottom()) ? 1 : -1;
        }
    };
    public static final SelectionMode Horizontal = new SelectionMode("Horizontal", 1) { // from class: androidx.compose.foundation.text.selection.SelectionMode.Horizontal
        {
            v vVar = null;
        }

        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* renamed from: compare-3MmeM6k$foundation_release */
        public int mo1492compare3MmeM6k$foundation_release(long j11, @k Rect rect) {
            if (SelectionManagerKt.m1485containsInclusiveUv8p0NA(rect, j11)) {
                return 0;
            }
            int i11 = (int) (j11 >> 32);
            if (Float.intBitsToFloat(i11) < rect.getLeft()) {
                return -1;
            }
            return (Float.intBitsToFloat((int) (j11 & 4294967295L)) >= rect.getTop() || Float.intBitsToFloat(i11) >= rect.getRight()) ? 1 : -1;
        }
    };

    private static final /* synthetic */ SelectionMode[] $values() {
        return new SelectionMode[]{Vertical, Horizontal};
    }

    static {
        SelectionMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    public /* synthetic */ SelectionMode(String str, int i11, v vVar) {
        this(str, i11);
    }

    /* renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    private final boolean m1491containsInclusiveUv8p0NA(Rect rect, long j11) {
        float left = rect.getLeft();
        float right = rect.getRight();
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        if (left > intBitsToFloat || intBitsToFloat > right) {
            return false;
        }
        float top = rect.getTop();
        float bottom = rect.getBottom();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        return top <= intBitsToFloat2 && intBitsToFloat2 <= bottom;
    }

    @k
    public static m00.a<SelectionMode> getEntries() {
        return $ENTRIES;
    }

    public static SelectionMode valueOf(String str) {
        return (SelectionMode) Enum.valueOf(SelectionMode.class, str);
    }

    public static SelectionMode[] values() {
        return (SelectionMode[]) $VALUES.clone();
    }

    /* renamed from: compare-3MmeM6k$foundation_release, reason: not valid java name */
    public abstract int mo1492compare3MmeM6k$foundation_release(long j11, @k Rect rect);

    /* renamed from: isSelected-2x9bVx0$foundation_release, reason: not valid java name */
    public final boolean m1493isSelected2x9bVx0$foundation_release(@k Rect rect, long j11, long j12) {
        if (m1491containsInclusiveUv8p0NA(rect, j11) || m1491containsInclusiveUv8p0NA(rect, j12)) {
            return true;
        }
        return (mo1492compare3MmeM6k$foundation_release(j11, rect) > 0) ^ (mo1492compare3MmeM6k$foundation_release(j12, rect) > 0);
    }

    private SelectionMode(String str, int i11) {
    }
}
