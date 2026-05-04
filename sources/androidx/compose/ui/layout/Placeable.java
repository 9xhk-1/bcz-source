package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.MotionReferencePlacementDelegate;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import g10.u;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nPlaceable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,567:1\n30#2:568\n80#3:569\n85#3:571\n90#3:573\n85#3:575\n90#3:577\n85#3:579\n90#3:581\n80#3:583\n54#4:570\n59#4:572\n54#4:574\n59#4:576\n54#4:578\n59#4:580\n32#5:582\n*S KotlinDebug\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable\n*L\n67#1:568\n67#1:569\n60#1:571\n64#1:573\n77#1:575\n82#1:577\n87#1:579\n87#1:581\n87#1:583\n60#1:570\n64#1:572\n77#1:574\n82#1:576\n87#1:578\n87#1:580\n87#1:582\n*E\n"})
/* loaded from: classes.dex */
public abstract class Placeable implements Measured {
    public static final int $stable = 8;
    private long apparentToRealOffset;
    private int height;
    private long measuredSize;
    private long measurementConstraints;
    private int width;

    public Placeable() {
        long j11;
        long j12 = 0;
        this.measuredSize = IntSize.m5281constructorimpl((j12 & 4294967295L) | (j12 << 32));
        j11 = PlaceableKt.DefaultConstraints;
        this.measurementConstraints = j11;
        this.apparentToRealOffset = IntOffset.Companion.m5254getZeronOccac();
    }

    private final void onMeasuredSizeChanged() {
        this.width = u.I((int) (this.measuredSize >> 32), Constraints.m5070getMinWidthimpl(this.measurementConstraints), Constraints.m5068getMaxWidthimpl(this.measurementConstraints));
        this.height = u.I((int) (this.measuredSize & 4294967295L), Constraints.m5069getMinHeightimpl(this.measurementConstraints), Constraints.m5067getMaxHeightimpl(this.measurementConstraints));
        int i11 = this.width;
        long j11 = this.measuredSize;
        this.apparentToRealOffset = IntOffset.m5237constructorimpl((((i11 - ((int) (j11 >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j11 & 4294967295L))) / 2)));
    }

    /* renamed from: getApparentToRealOffset-nOcc-ac, reason: not valid java name */
    public final long m3915getApparentToRealOffsetnOccac() {
        return this.apparentToRealOffset;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        return (int) (this.measuredSize & 4294967295L);
    }

    /* renamed from: getMeasuredSize-YbymL2g, reason: not valid java name */
    public final long m3916getMeasuredSizeYbymL2g() {
        return this.measuredSize;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        return (int) (this.measuredSize >> 32);
    }

    /* renamed from: getMeasurementConstraints-msEJaDk, reason: not valid java name */
    public final long m3917getMeasurementConstraintsmsEJaDk() {
        return this.measurementConstraints;
    }

    public final int getWidth() {
        return this.width;
    }

    /* renamed from: placeAt-f8xVGno, reason: not valid java name */
    public void mo3918placeAtf8xVGno(long j11, float f11, @k GraphicsLayer graphicsLayer) {
        mo3858placeAtf8xVGno(j11, f11, (l<? super GraphicsLayerScope, g2>) null);
    }

    /* renamed from: placeAt-f8xVGno */
    public abstract void mo3858placeAtf8xVGno(long j11, float f11, @m80.l l<? super GraphicsLayerScope, g2> lVar);

    /* renamed from: setMeasuredSize-ozmzZPI, reason: not valid java name */
    public final void m3919setMeasuredSizeozmzZPI(long j11) {
        if (IntSize.m5284equalsimpl0(this.measuredSize, j11)) {
            return;
        }
        this.measuredSize = j11;
        onMeasuredSizeChanged();
    }

    /* renamed from: setMeasurementConstraints-BRTryo0, reason: not valid java name */
    public final void m3920setMeasurementConstraintsBRTryo0(long j11) {
        if (Constraints.m5061equalsimpl0(this.measurementConstraints, j11)) {
            return;
        }
        this.measurementConstraints = j11;
        onMeasuredSizeChanged();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @PlacementScopeMarker
    @u0({"SMAP\nPlaceable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,567:1\n432#1,2:568\n466#1,3:570\n435#1,2:573\n466#1,3:577\n441#1:580\n432#1,2:583\n466#1,3:585\n435#1,2:588\n466#1,3:590\n441#1:593\n466#1,3:596\n466#1,3:599\n432#1,2:602\n466#1,3:604\n435#1,2:607\n466#1,3:611\n441#1:614\n432#1,2:617\n466#1,3:619\n435#1,2:622\n466#1,3:624\n441#1:627\n466#1,3:630\n466#1,3:633\n476#1,3:638\n476#1,3:641\n449#1,2:646\n476#1,3:648\n452#1,2:651\n476#1,3:653\n458#1:656\n449#1,2:657\n476#1,3:659\n452#1,2:662\n476#1,3:666\n458#1:669\n466#1,3:670\n466#1,3:675\n476#1,3:678\n476#1,3:683\n32#2:575\n32#2:581\n32#2:594\n32#2:609\n32#2:615\n32#2:628\n32#2:636\n32#2:644\n32#2:664\n32#2:673\n32#2:681\n80#3:576\n80#3:582\n80#3:595\n80#3:610\n80#3:616\n80#3:629\n80#3:637\n80#3:645\n80#3:665\n80#3:674\n80#3:682\n*S KotlinDebug\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n*L\n208#1:568,2\n208#1:570,3\n208#1:573,2\n208#1:577,3\n208#1:580\n225#1:583,2\n225#1:585,3\n225#1:588,2\n225#1:590,3\n225#1:593\n239#1:596,3\n252#1:599,3\n274#1:602,2\n274#1:604,3\n274#1:607,2\n274#1:611,3\n274#1:614\n298#1:617,2\n298#1:619,3\n298#1:622,2\n298#1:624,3\n298#1:627\n319#1:630,3\n338#1:633,3\n359#1:638,3\n378#1:641,3\n402#1:646,2\n402#1:648,3\n402#1:651,2\n402#1:653,3\n402#1:656\n424#1:657,2\n424#1:659,3\n424#1:662,2\n424#1:666,3\n424#1:669\n433#1:670,3\n435#1:675,3\n450#1:678,3\n452#1:683,3\n208#1:575\n225#1:581\n239#1:594\n274#1:609\n298#1:615\n319#1:628\n359#1:636\n402#1:644\n424#1:664\n436#1:673\n453#1:681\n208#1:576\n225#1:582\n239#1:595\n274#1:610\n298#1:616\n319#1:629\n359#1:637\n402#1:645\n424#1:665\n436#1:674\n453#1:682\n*E\n"})
    public static abstract class PlacementScope {
        public static final int $stable = 8;
        private boolean motionFrameOfReferencePlacement;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final void handleMotionFrameOfReferencePlacement(Placeable placeable) {
            if (placeable instanceof MotionReferencePlacementDelegate) {
                ((MotionReferencePlacementDelegate) placeable).updatePlacedUnderMotionFrameOfReference(this.motionFrameOfReferencePlacement);
            }
        }

        public static /* synthetic */ void place$default(PlacementScope placementScope, Placeable placeable, int i11, int i12, float f11, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i13 & 4) != 0) {
                f11 = 0.0f;
            }
            placementScope.place(placeable, i11, i12, f11);
        }

        /* renamed from: place-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m3921place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j11, float f11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i11 & 2) != 0) {
                f11 = 0.0f;
            }
            placementScope.m3927place70tqf50(placeable, j11, f11);
        }

        public static /* synthetic */ void placeRelative$default(PlacementScope placementScope, Placeable placeable, int i11, int i12, float f11, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i13 & 4) != 0) {
                f11 = 0.0f;
            }
            placementScope.placeRelative(placeable, i11, i12, f11);
        }

        /* renamed from: placeRelative-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m3922placeRelative70tqf50$default(PlacementScope placementScope, Placeable placeable, long j11, float f11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i11 & 2) != 0) {
                f11 = 0.0f;
            }
            placementScope.m3932placeRelative70tqf50(placeable, j11, f11);
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i11, int i12, float f11, l lVar, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i13 & 4) != 0) {
                f11 = 0.0f;
            }
            float f12 = f11;
            if ((i13 & 8) != 0) {
                lVar = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeRelativeWithLayer(placeable, i11, i12, f12, (l<? super GraphicsLayerScope, g2>) lVar);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m3923placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j11, float f11, l lVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i11 & 2) != 0) {
                f11 = 0.0f;
            }
            float f12 = f11;
            if ((i11 & 4) != 0) {
                lVar = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m3933placeRelativeWithLayeraW9wM(placeable, j11, f12, (l<? super GraphicsLayerScope, g2>) lVar);
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i11, int i12, float f11, l lVar, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i13 & 4) != 0) {
                f11 = 0.0f;
            }
            float f12 = f11;
            if ((i13 & 8) != 0) {
                lVar = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeWithLayer(placeable, i11, i12, f12, (l<? super GraphicsLayerScope, g2>) lVar);
        }

        /* renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m3925placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j11, float f11, l lVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i11 & 2) != 0) {
                f11 = 0.0f;
            }
            float f12 = f11;
            if ((i11 & 4) != 0) {
                lVar = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m3935placeWithLayeraW9wM(placeable, j11, f12, (l<? super GraphicsLayerScope, g2>) lVar);
        }

        @m80.l
        public LayoutCoordinates getCoordinates() {
            return null;
        }

        @k
        public abstract LayoutDirection getParentLayoutDirection();

        public abstract int getParentWidth();

        public final void place(@k Placeable placeable, int i11, int i12, float f11) {
            long m5237constructorimpl = IntOffset.m5237constructorimpl((i12 & 4294967295L) | (i11 << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo3858placeAtf8xVGno(IntOffset.m5247plusqkQi6aY(m5237constructorimpl, placeable.apparentToRealOffset), f11, (l<? super GraphicsLayerScope, g2>) null);
        }

        /* renamed from: place-70tqf50, reason: not valid java name */
        public final void m3927place70tqf50(@k Placeable placeable, long j11, float f11) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo3858placeAtf8xVGno(IntOffset.m5247plusqkQi6aY(j11, placeable.apparentToRealOffset), f11, (l<? super GraphicsLayerScope, g2>) null);
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui_release, reason: not valid java name */
        public final void m3929placeApparentToRealOffsetaW9wM$ui_release(@k Placeable placeable, long j11, float f11, @m80.l l<? super GraphicsLayerScope, g2> lVar) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo3858placeAtf8xVGno(IntOffset.m5247plusqkQi6aY(j11, placeable.apparentToRealOffset), f11, lVar);
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui_release, reason: not valid java name */
        public final void m3931placeAutoMirroredaW9wM$ui_release(@k Placeable placeable, long j11, float f11, @m80.l l<? super GraphicsLayerScope, g2> lVar) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo3858placeAtf8xVGno(IntOffset.m5247plusqkQi6aY(j11, placeable.apparentToRealOffset), f11, lVar);
                return;
            }
            long m5237constructorimpl = IntOffset.m5237constructorimpl((IntOffset.m5244getYimpl(j11) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m5243getXimpl(j11)) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo3858placeAtf8xVGno(IntOffset.m5247plusqkQi6aY(m5237constructorimpl, placeable.apparentToRealOffset), f11, lVar);
        }

        public final void placeRelative(@k Placeable placeable, int i11, int i12, float f11) {
            long m5237constructorimpl = IntOffset.m5237constructorimpl((i11 << 32) | (i12 & 4294967295L));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo3858placeAtf8xVGno(IntOffset.m5247plusqkQi6aY(m5237constructorimpl, placeable.apparentToRealOffset), f11, (l<? super GraphicsLayerScope, g2>) null);
            } else {
                long m5237constructorimpl2 = IntOffset.m5237constructorimpl((((getParentWidth() - placeable.getWidth()) - IntOffset.m5243getXimpl(m5237constructorimpl)) << 32) | (IntOffset.m5244getYimpl(m5237constructorimpl) & 4294967295L));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo3858placeAtf8xVGno(IntOffset.m5247plusqkQi6aY(m5237constructorimpl2, placeable.apparentToRealOffset), f11, (l<? super GraphicsLayerScope, g2>) null);
            }
        }

        /* renamed from: placeRelative-70tqf50, reason: not valid java name */
        public final void m3932placeRelative70tqf50(@k Placeable placeable, long j11, float f11) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo3858placeAtf8xVGno(IntOffset.m5247plusqkQi6aY(j11, placeable.apparentToRealOffset), f11, (l<? super GraphicsLayerScope, g2>) null);
                return;
            }
            long m5237constructorimpl = IntOffset.m5237constructorimpl((IntOffset.m5244getYimpl(j11) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m5243getXimpl(j11)) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo3858placeAtf8xVGno(IntOffset.m5247plusqkQi6aY(m5237constructorimpl, placeable.apparentToRealOffset), f11, (l<? super GraphicsLayerScope, g2>) null);
        }

        public final void placeRelativeWithLayer(@k Placeable placeable, int i11, int i12, float f11, @k l<? super GraphicsLayerScope, g2> lVar) {
            long m5237constructorimpl = IntOffset.m5237constructorimpl((i11 << 32) | (i12 & 4294967295L));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo3858placeAtf8xVGno(IntOffset.m5247plusqkQi6aY(m5237constructorimpl, placeable.apparentToRealOffset), f11, lVar);
            } else {
                long m5237constructorimpl2 = IntOffset.m5237constructorimpl((((getParentWidth() - placeable.getWidth()) - IntOffset.m5243getXimpl(m5237constructorimpl)) << 32) | (IntOffset.m5244getYimpl(m5237constructorimpl) & 4294967295L));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo3858placeAtf8xVGno(IntOffset.m5247plusqkQi6aY(m5237constructorimpl2, placeable.apparentToRealOffset), f11, lVar);
            }
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m3933placeRelativeWithLayeraW9wM(@k Placeable placeable, long j11, float f11, @k l<? super GraphicsLayerScope, g2> lVar) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo3858placeAtf8xVGno(IntOffset.m5247plusqkQi6aY(j11, placeable.apparentToRealOffset), f11, lVar);
                return;
            }
            long m5237constructorimpl = IntOffset.m5237constructorimpl((IntOffset.m5244getYimpl(j11) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m5243getXimpl(j11)) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo3858placeAtf8xVGno(IntOffset.m5247plusqkQi6aY(m5237constructorimpl, placeable.apparentToRealOffset), f11, lVar);
        }

        public final void placeWithLayer(@k Placeable placeable, int i11, int i12, float f11, @k l<? super GraphicsLayerScope, g2> lVar) {
            long m5237constructorimpl = IntOffset.m5237constructorimpl((i12 & 4294967295L) | (i11 << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo3858placeAtf8xVGno(IntOffset.m5247plusqkQi6aY(m5237constructorimpl, placeable.apparentToRealOffset), f11, lVar);
        }

        /* renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m3935placeWithLayeraW9wM(@k Placeable placeable, long j11, float f11, @k l<? super GraphicsLayerScope, g2> lVar) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo3858placeAtf8xVGno(IntOffset.m5247plusqkQi6aY(j11, placeable.apparentToRealOffset), f11, lVar);
        }

        public final void withMotionFrameOfReferencePlacement(@k l<? super PlacementScope, g2> lVar) {
            this.motionFrameOfReferencePlacement = true;
            lVar.invoke(this);
            this.motionFrameOfReferencePlacement = false;
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i11, int i12, GraphicsLayer graphicsLayer, float f11, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i13 & 8) != 0) {
                f11 = 0.0f;
            }
            placementScope.placeRelativeWithLayer(placeable, i11, i12, graphicsLayer, f11);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m3924placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j11, GraphicsLayer graphicsLayer, float f11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i11 & 4) != 0) {
                f11 = 0.0f;
            }
            placementScope.m3934placeRelativeWithLayeraW9wM(placeable, j11, graphicsLayer, f11);
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i11, int i12, GraphicsLayer graphicsLayer, float f11, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i13 & 8) != 0) {
                f11 = 0.0f;
            }
            placementScope.placeWithLayer(placeable, i11, i12, graphicsLayer, f11);
        }

        /* renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m3926placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j11, GraphicsLayer graphicsLayer, float f11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i11 & 4) != 0) {
                f11 = 0.0f;
            }
            placementScope.m3936placeWithLayeraW9wM(placeable, j11, graphicsLayer, f11);
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui_release, reason: not valid java name */
        public final void m3928placeApparentToRealOffsetaW9wM$ui_release(@k Placeable placeable, long j11, float f11, @k GraphicsLayer graphicsLayer) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo3918placeAtf8xVGno(IntOffset.m5247plusqkQi6aY(j11, placeable.apparentToRealOffset), f11, graphicsLayer);
        }

        /* renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m3936placeWithLayeraW9wM(@k Placeable placeable, long j11, @k GraphicsLayer graphicsLayer, float f11) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo3918placeAtf8xVGno(IntOffset.m5247plusqkQi6aY(j11, placeable.apparentToRealOffset), f11, graphicsLayer);
        }

        public final void placeWithLayer(@k Placeable placeable, int i11, int i12, @k GraphicsLayer graphicsLayer, float f11) {
            long m5237constructorimpl = IntOffset.m5237constructorimpl((i12 & 4294967295L) | (i11 << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo3918placeAtf8xVGno(IntOffset.m5247plusqkQi6aY(m5237constructorimpl, placeable.apparentToRealOffset), f11, graphicsLayer);
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui_release, reason: not valid java name */
        public final void m3930placeAutoMirroredaW9wM$ui_release(@k Placeable placeable, long j11, float f11, @k GraphicsLayer graphicsLayer) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo3918placeAtf8xVGno(IntOffset.m5247plusqkQi6aY(j11, placeable.apparentToRealOffset), f11, graphicsLayer);
                return;
            }
            long m5237constructorimpl = IntOffset.m5237constructorimpl((IntOffset.m5244getYimpl(j11) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m5243getXimpl(j11)) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo3918placeAtf8xVGno(IntOffset.m5247plusqkQi6aY(m5237constructorimpl, placeable.apparentToRealOffset), f11, graphicsLayer);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m3934placeRelativeWithLayeraW9wM(@k Placeable placeable, long j11, @k GraphicsLayer graphicsLayer, float f11) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo3918placeAtf8xVGno(IntOffset.m5247plusqkQi6aY(j11, placeable.apparentToRealOffset), f11, graphicsLayer);
                return;
            }
            long m5237constructorimpl = IntOffset.m5237constructorimpl((IntOffset.m5244getYimpl(j11) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m5243getXimpl(j11)) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo3918placeAtf8xVGno(IntOffset.m5247plusqkQi6aY(m5237constructorimpl, placeable.apparentToRealOffset), f11, graphicsLayer);
        }

        public final void placeRelativeWithLayer(@k Placeable placeable, int i11, int i12, @k GraphicsLayer graphicsLayer, float f11) {
            long m5237constructorimpl = IntOffset.m5237constructorimpl((i11 << 32) | (i12 & 4294967295L));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo3918placeAtf8xVGno(IntOffset.m5247plusqkQi6aY(m5237constructorimpl, placeable.apparentToRealOffset), f11, graphicsLayer);
            } else {
                long m5237constructorimpl2 = IntOffset.m5237constructorimpl((((getParentWidth() - placeable.getWidth()) - IntOffset.m5243getXimpl(m5237constructorimpl)) << 32) | (IntOffset.m5244getYimpl(m5237constructorimpl) & 4294967295L));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo3918placeAtf8xVGno(IntOffset.m5247plusqkQi6aY(m5237constructorimpl2, placeable.apparentToRealOffset), f11, graphicsLayer);
            }
        }

        public float current(@k Ruler ruler, float f11) {
            return f11;
        }
    }
}
