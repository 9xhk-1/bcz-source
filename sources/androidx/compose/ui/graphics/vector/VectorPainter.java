package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composition;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 4 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,474:1\n85#2:475\n113#2,2:476\n85#2:478\n113#2,2:479\n78#3:481\n107#3,2:482\n262#4:484\n263#4:505\n167#5,6:485\n249#5,14:491\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter\n*L\n188#1:475\n188#1:476,2\n190#1:478\n190#1:479,2\n226#1:481\n226#1:482,2\n240#1:484\n240#1:505\n240#1:485,6\n240#1:491,14\n*E\n"})
/* loaded from: classes.dex */
public final class VectorPainter extends Painter {
    public static final int $stable = 8;

    @k
    private final MutableState autoMirror$delegate;

    @l
    private Composition composition;
    private float currentAlpha;

    @l
    private ColorFilter currentColorFilter;
    private int drawCount;

    @k
    private final MutableIntState invalidateCount$delegate;

    @k
    private final MutableState size$delegate;

    @k
    private final VectorComponent vector;

    /* JADX WARN: Multi-variable type inference failed */
    public VectorPainter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getInvalidateCount() {
        return this.invalidateCount$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInvalidateCount(int i11) {
        this.invalidateCount$delegate.setIntValue(i11);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float f11) {
        this.currentAlpha = f11;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(@l ColorFilter colorFilter) {
        this.currentColorFilter = colorFilter;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getAutoMirror$ui_release() {
        return ((Boolean) this.autoMirror$delegate.getValue()).booleanValue();
    }

    /* renamed from: getBitmapConfig-_sVssgQ$ui_release, reason: not valid java name */
    public final int m3212getBitmapConfig_sVssgQ$ui_release() {
        return this.vector.m3204getCacheBitmapConfig_sVssgQ$ui_release();
    }

    @l
    public final Composition getComposition$ui_release() {
        return this.composition;
    }

    @l
    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return this.vector.getIntrinsicColorFilter$ui_release();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo3180getIntrinsicSizeNHjbRc() {
        return m3213getSizeNHjbRc$ui_release();
    }

    @k
    public final String getName$ui_release() {
        return this.vector.getName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSize-NH-jbRc$ui_release, reason: not valid java name */
    public final long m3213getSizeNHjbRc$ui_release() {
        return ((Size) this.size$delegate.getValue()).m2342unboximpl();
    }

    @k
    public final VectorComponent getVector$ui_release() {
        return this.vector;
    }

    /* renamed from: getViewportSize-NH-jbRc$ui_release, reason: not valid java name */
    public final long m3214getViewportSizeNHjbRc$ui_release() {
        return this.vector.m3205getViewportSizeNHjbRc$ui_release();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@k DrawScope drawScope) {
        VectorComponent vectorComponent = this.vector;
        ColorFilter colorFilter = this.currentColorFilter;
        if (colorFilter == null) {
            colorFilter = vectorComponent.getIntrinsicColorFilter$ui_release();
        }
        if (getAutoMirror$ui_release() && drawScope.getLayoutDirection() == LayoutDirection.Rtl) {
            long mo3059getCenterF1C5BW0 = drawScope.mo3059getCenterF1C5BW0();
            DrawContext drawContext = drawScope.getDrawContext();
            long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo2988scale0AR0LA0(-1.0f, 1.0f, mo3059getCenterF1C5BW0);
                vectorComponent.draw(drawScope, this.currentAlpha, colorFilter);
            } finally {
                drawContext.getCanvas().restore();
                drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
            }
        } else {
            vectorComponent.draw(drawScope, this.currentAlpha, colorFilter);
        }
        this.drawCount = getInvalidateCount();
    }

    public final void setAutoMirror$ui_release(boolean z11) {
        this.autoMirror$delegate.setValue(Boolean.valueOf(z11));
    }

    public final void setComposition$ui_release(@l Composition composition) {
        this.composition = composition;
    }

    public final void setIntrinsicColorFilter$ui_release(@l ColorFilter colorFilter) {
        this.vector.setIntrinsicColorFilter$ui_release(colorFilter);
    }

    public final void setName$ui_release(@k String str) {
        this.vector.setName(str);
    }

    /* renamed from: setSize-uvyYCjk$ui_release, reason: not valid java name */
    public final void m3215setSizeuvyYCjk$ui_release(long j11) {
        this.size$delegate.setValue(Size.m2325boximpl(j11));
    }

    /* renamed from: setViewportSize-uvyYCjk$ui_release, reason: not valid java name */
    public final void m3216setViewportSizeuvyYCjk$ui_release(long j11) {
        this.vector.m3206setViewportSizeuvyYCjk$ui_release(j11);
    }

    public VectorPainter(@k GroupComponent groupComponent) {
        this.size$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m2325boximpl(Size.Companion.m2346getZeroNHjbRc()), null, 2, null);
        this.autoMirror$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        VectorComponent vectorComponent = new VectorComponent(groupComponent);
        vectorComponent.setInvalidateCallback$ui_release(new a<g2>() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$vector$1$1
            {
                super(0);
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                int i11;
                int invalidateCount;
                int invalidateCount2;
                i11 = VectorPainter.this.drawCount;
                invalidateCount = VectorPainter.this.getInvalidateCount();
                if (i11 == invalidateCount) {
                    VectorPainter vectorPainter = VectorPainter.this;
                    invalidateCount2 = vectorPainter.getInvalidateCount();
                    vectorPainter.setInvalidateCount(invalidateCount2 + 1);
                }
            }
        });
        this.vector = vectorComponent;
        this.invalidateCount$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.currentAlpha = 1.0f;
        this.drawCount = -1;
    }

    public /* synthetic */ VectorPainter(GroupComponent groupComponent, int i11, v vVar) {
        this((i11 & 1) != 0 ? new GroupComponent() : groupComponent);
    }
}
