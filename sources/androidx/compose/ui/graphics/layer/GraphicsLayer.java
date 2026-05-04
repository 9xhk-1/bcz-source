package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawContextKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAndroidGraphicsLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGraphicsLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayer\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 ChildLayerDependenciesTracker.kt\nandroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 8 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 9 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 10 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 11 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 12 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 13 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 14 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 15 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n*L\n1#1,1018:1\n640#1,6:1109\n646#1,3:1116\n644#1,7:1119\n640#1,6:1190\n646#1,3:1197\n644#1,7:1200\n153#2:1019\n153#2:1115\n153#2:1150\n153#2:1196\n44#3,6:1020\n50#3,14:1027\n64#3,4:1066\n104#3,6:1156\n110#3,3:1187\n1#4:1026\n1#4:1074\n231#5,3:1041\n200#5,7:1044\n211#5,3:1052\n214#5,9:1056\n234#5:1065\n231#5,3:1162\n200#5,7:1165\n211#5,3:1173\n214#5,9:1177\n234#5:1186\n1399#6:1051\n1270#6:1055\n1399#6:1172\n1270#6:1176\n54#7:1070\n59#7:1072\n85#8:1071\n90#8:1073\n80#8:1108\n60#8:1127\n70#8:1134\n60#8:1141\n70#8:1146\n60#8:1208\n70#8:1211\n60#8:1214\n70#8:1217\n53#8,3:1220\n305#9,26:1075\n36#10,5:1101\n36#10,5:1151\n26#11:1106\n22#11,5:1128\n22#11,5:1135\n22#11:1142\n26#11:1144\n22#11:1147\n26#11:1149\n22#11:1209\n22#11:1212\n22#11:1215\n22#11:1218\n30#12:1107\n65#13:1126\n69#13:1133\n65#13:1140\n69#13:1145\n65#13:1207\n69#13:1210\n57#14:1143\n61#14:1148\n57#14:1213\n61#14:1216\n33#15:1219\n*S KotlinDebug\n*F\n+ 1 AndroidGraphicsLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayer\n*L\n620#1:1109,6\n620#1:1116,3\n620#1:1119,7\n746#1:1190,6\n746#1:1197,3\n746#1:1200,7\n153#1:1019\n620#1:1115\n645#1:1150\n746#1:1196\n440#1:1020,6\n440#1:1027,14\n440#1:1066,4\n710#1:1156,6\n710#1:1187,3\n440#1:1026\n440#1:1041,3\n440#1:1044,7\n440#1:1052,3\n440#1:1056,9\n440#1:1065\n710#1:1162,3\n710#1:1165,7\n710#1:1173,3\n710#1:1177,9\n710#1:1186\n440#1:1051\n440#1:1055\n710#1:1172\n710#1:1176\n456#1:1070\n457#1:1072\n456#1:1071\n457#1:1073\n605#1:1108\n622#1:1127\n623#1:1134\n625#1:1141\n627#1:1146\n747#1:1208\n748#1:1211\n749#1:1214\n750#1:1217\n754#1:1220,3\n558#1:1075,26\n600#1:1101,5\n663#1:1151,5\n605#1:1106\n622#1:1128,5\n623#1:1135,5\n625#1:1142\n625#1:1144\n627#1:1147\n627#1:1149\n747#1:1209\n748#1:1212\n749#1:1215\n750#1:1218\n605#1:1107\n622#1:1126\n623#1:1133\n625#1:1140\n627#1:1145\n747#1:1207\n748#1:1210\n625#1:1143\n627#1:1148\n749#1:1213\n750#1:1216\n754#1:1219\n*E\n"})
/* loaded from: classes.dex */
public final class GraphicsLayer {

    @m80.k
    public static final Companion Companion = new Companion(null);

    @m80.k
    private static final LayerSnapshotImpl SnapshotImpl;

    @m80.l
    private Outline androidOutline;

    @m80.k
    private final ChildLayerDependenciesTracker childDependenciesTracker;
    private boolean clip;

    @m80.k
    private final GraphicsLayerImpl impl;

    @m80.l
    private androidx.compose.ui.graphics.Outline internalOutline;
    private boolean isReleased;

    @m80.l
    private final LayerManager layerManager;

    @m80.l
    private Path outlinePath;
    private int parentLayerUsages;

    @m80.l
    private RectF pathBounds;
    private long pivotOffset;

    @m80.l
    private Path roundRectClipPath;
    private float roundRectCornerRadius;
    private long roundRectOutlineSize;
    private long roundRectOutlineTopLeft;
    private long size;

    @m80.l
    private CanvasDrawScope softwareDrawScope;

    @m80.l
    private Paint softwareLayerPaint;
    private long topLeft;
    private boolean usePathForClip;

    @m80.k
    private Density density = DrawContextKt.getDefaultDensity();

    @m80.k
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;

    @m80.k
    private x00.l<? super DrawScope, g2> drawBlock = new x00.l<DrawScope, g2>() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$drawBlock$1
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DrawScope drawScope) {
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(DrawScope drawScope) {
            invoke2(drawScope);
            return g2.f100423a;
        }
    };

    @m80.k
    private final x00.l<DrawScope, g2> clipDrawBlock = new x00.l<DrawScope, g2>() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$clipDrawBlock$1
        {
            super(1);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(DrawScope drawScope) {
            invoke2(drawScope);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DrawScope drawScope) {
            Path path;
            boolean z11;
            path = GraphicsLayer.this.outlinePath;
            z11 = GraphicsLayer.this.usePathForClip;
            if (!z11 || !GraphicsLayer.this.getClip() || path == null) {
                GraphicsLayer.this.drawWithChildTracking(drawScope);
                return;
            }
            GraphicsLayer graphicsLayer = GraphicsLayer.this;
            int m2498getIntersectrtfAjoo = ClipOp.Companion.m2498getIntersectrtfAjoo();
            DrawContext drawContext = drawScope.getDrawContext();
            long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo2983clipPathmtrdDE(path, m2498getIntersectrtfAjoo);
                graphicsLayer.drawWithChildTracking(drawScope);
            } finally {
                drawContext.getCanvas().restore();
                drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
            }
        }
    };
    private boolean outlineDirty = true;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        private Companion() {
        }
    }

    static {
        SnapshotImpl = LayerManager.Companion.isRobolectric() ? LayerSnapshotV21.INSTANCE : Build.VERSION.SDK_INT >= 28 ? LayerSnapshotV28.INSTANCE : SurfaceUtils.INSTANCE.isLockHardwareCanvasAvailable() ? LayerSnapshotV22.INSTANCE : LayerSnapshotV21.INSTANCE;
    }

    public GraphicsLayer(@m80.k GraphicsLayerImpl graphicsLayerImpl, @m80.l LayerManager layerManager) {
        this.impl = graphicsLayerImpl;
        this.layerManager = layerManager;
        Offset.Companion companion = Offset.Companion;
        this.roundRectOutlineTopLeft = companion.m2284getZeroF1C5BW0();
        this.roundRectOutlineSize = Size.Companion.m2345getUnspecifiedNHjbRc();
        this.childDependenciesTracker = new ChildLayerDependenciesTracker();
        graphicsLayerImpl.setClip(false);
        this.topLeft = IntOffset.Companion.m5254getZeronOccac();
        this.size = IntSize.Companion.m5291getZeroYbymL2g();
        this.pivotOffset = companion.m2283getUnspecifiedF1C5BW0();
    }

    private final void addSubLayer(GraphicsLayer graphicsLayer) {
        if (this.childDependenciesTracker.onDependencyAdded(graphicsLayer)) {
            graphicsLayer.onAddedToParentLayer();
        }
    }

    private final void configureOutlineAndClip() {
        if (this.outlineDirty) {
            Outline outline = null;
            if (this.clip || getShadowElevation() > 0.0f) {
                Path path = this.outlinePath;
                if (path != null) {
                    RectF obtainPathBounds = obtainPathBounds();
                    if (!(path instanceof AndroidPath)) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((AndroidPath) path).getInternalPath().computeBounds(obtainPathBounds, false);
                    Outline updatePathOutline = updatePathOutline(path);
                    if (updatePathOutline != null) {
                        updatePathOutline.setAlpha(getAlpha());
                        outline = updatePathOutline;
                    }
                    this.impl.mo3171setOutlineO0kMr_c(outline, IntSize.m5281constructorimpl((4294967295L & Math.round(obtainPathBounds.height())) | (Math.round(obtainPathBounds.width()) << 32)));
                    if (this.usePathForClip && this.clip) {
                        this.impl.setClip(false);
                        this.impl.discardDisplayList();
                    } else {
                        this.impl.setClip(this.clip);
                    }
                } else {
                    this.impl.setClip(this.clip);
                    Size.Companion.m2346getZeroNHjbRc();
                    Outline obtainAndroidOutline = obtainAndroidOutline();
                    long m5298toSizeozmzZPI = IntSizeKt.m5298toSizeozmzZPI(this.size);
                    long j11 = this.roundRectOutlineTopLeft;
                    long j12 = this.roundRectOutlineSize;
                    long j13 = j12 == InlineClassHelperKt.UnspecifiedPackedFloats ? m5298toSizeozmzZPI : j12;
                    int i11 = (int) (j11 >> 32);
                    int i12 = (int) (j11 & 4294967295L);
                    obtainAndroidOutline.setRoundRect(Math.round(Float.intBitsToFloat(i11)), Math.round(Float.intBitsToFloat(i12)), Math.round(Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j13 >> 32))), Math.round(Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j13 & 4294967295L))), this.roundRectCornerRadius);
                    obtainAndroidOutline.setAlpha(getAlpha());
                    this.impl.mo3171setOutlineO0kMr_c(obtainAndroidOutline, IntSizeKt.m5294roundToIntSizeuvyYCjk(j13));
                }
            } else {
                this.impl.setClip(false);
                this.impl.mo3171setOutlineO0kMr_c(null, IntSize.Companion.m5291getZeroYbymL2g());
            }
        }
        this.outlineDirty = false;
    }

    private final void discardContentIfReleasedAndHaveNoParentLayerUsages() {
        if (this.isReleased && this.parentLayerUsages == 0) {
            LayerManager layerManager = this.layerManager;
            if (layerManager != null) {
                layerManager.release(this);
            } else {
                discardDisplayList$ui_graphics_release();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawWithChildTracking(DrawScope drawScope) {
        ChildLayerDependenciesTracker childLayerDependenciesTracker = this.childDependenciesTracker;
        childLayerDependenciesTracker.oldDependency = childLayerDependenciesTracker.dependency;
        MutableScatterSet mutableScatterSet = childLayerDependenciesTracker.dependenciesSet;
        if (mutableScatterSet != null && mutableScatterSet.isNotEmpty()) {
            MutableScatterSet mutableScatterSet2 = childLayerDependenciesTracker.oldDependenciesSet;
            if (mutableScatterSet2 == null) {
                mutableScatterSet2 = ScatterSetKt.mutableScatterSetOf();
                childLayerDependenciesTracker.oldDependenciesSet = mutableScatterSet2;
            }
            mutableScatterSet2.addAll(mutableScatterSet);
            mutableScatterSet.clear();
        }
        childLayerDependenciesTracker.trackingInProgress = true;
        this.drawBlock.invoke(drawScope);
        childLayerDependenciesTracker.trackingInProgress = false;
        GraphicsLayer graphicsLayer = childLayerDependenciesTracker.oldDependency;
        if (graphicsLayer != null) {
            graphicsLayer.onRemovedFromParentLayer();
        }
        MutableScatterSet mutableScatterSet3 = childLayerDependenciesTracker.oldDependenciesSet;
        if (mutableScatterSet3 == null || !mutableScatterSet3.isNotEmpty()) {
            return;
        }
        Object[] objArr = mutableScatterSet3.elements;
        long[] jArr = mutableScatterSet3.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            ((GraphicsLayer) objArr[(i11 << 3) + i13]).onRemovedFromParentLayer();
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        mutableScatterSet3.clear();
    }

    private final Outline obtainAndroidOutline() {
        Outline outline = this.androidOutline;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.androidOutline = outline2;
        return outline2;
    }

    private final RectF obtainPathBounds() {
        RectF rectF = this.pathBounds;
        if (rectF != null) {
            return rectF;
        }
        RectF rectF2 = new RectF();
        this.pathBounds = rectF2;
        return rectF2;
    }

    private final void onAddedToParentLayer() {
        this.parentLayerUsages++;
    }

    private final void onRemovedFromParentLayer() {
        this.parentLayerUsages--;
        discardContentIfReleasedAndHaveNoParentLayerUsages();
    }

    private final void recordInternal() {
        this.impl.record(this.density, this.layoutDirection, this, this.clipDrawBlock);
    }

    private final void recreateDisplayListIfNeeded() {
        if (this.impl.getHasDisplayList()) {
            return;
        }
        try {
            recordInternal();
        } catch (Throwable unused) {
        }
    }

    private final void resetOutlineParams() {
        this.internalOutline = null;
        this.outlinePath = null;
        this.roundRectOutlineSize = Size.Companion.m2345getUnspecifiedNHjbRc();
        this.roundRectOutlineTopLeft = Offset.Companion.m2284getZeroF1C5BW0();
        this.roundRectCornerRadius = 0.0f;
        this.outlineDirty = true;
        this.usePathForClip = false;
    }

    private final <T> T resolveOutlinePosition(x00.p<? super Offset, ? super Size, ? extends T> pVar) {
        long m5298toSizeozmzZPI = IntSizeKt.m5298toSizeozmzZPI(this.size);
        long j11 = this.roundRectOutlineTopLeft;
        long j12 = this.roundRectOutlineSize;
        if (j12 != InlineClassHelperKt.UnspecifiedPackedFloats) {
            m5298toSizeozmzZPI = j12;
        }
        return pVar.invoke(Offset.m2257boximpl(j11), Size.m2325boximpl(m5298toSizeozmzZPI));
    }

    /* renamed from: setPosition-VbeCjmY, reason: not valid java name */
    private final void m3143setPositionVbeCjmY(long j11, long j12) {
        this.impl.mo3173setPositionH0pRuoY(IntOffset.m5243getXimpl(j11), IntOffset.m5244getYimpl(j11), j12);
    }

    /* renamed from: setRectOutline-tz77jQw$default, reason: not valid java name */
    public static /* synthetic */ void m3144setRectOutlinetz77jQw$default(GraphicsLayer graphicsLayer, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = Offset.Companion.m2284getZeroF1C5BW0();
        }
        if ((i11 & 2) != 0) {
            j12 = Size.Companion.m2345getUnspecifiedNHjbRc();
        }
        graphicsLayer.m3159setRectOutlinetz77jQw(j11, j12);
    }

    /* renamed from: setRoundRectOutline-TNW_H78$default, reason: not valid java name */
    public static /* synthetic */ void m3145setRoundRectOutlineTNW_H78$default(GraphicsLayer graphicsLayer, long j11, long j12, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = Offset.Companion.m2284getZeroF1C5BW0();
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            j12 = Size.Companion.m2345getUnspecifiedNHjbRc();
        }
        long j14 = j12;
        if ((i11 & 4) != 0) {
            f11 = 0.0f;
        }
        graphicsLayer.m3160setRoundRectOutlineTNW_H78(j13, j14, f11);
    }

    /* renamed from: setSize-ozmzZPI, reason: not valid java name */
    private final void m3146setSizeozmzZPI(long j11) {
        if (IntSize.m5284equalsimpl0(this.size, j11)) {
            return;
        }
        this.size = j11;
        m3143setPositionVbeCjmY(this.topLeft, j11);
        if (this.roundRectOutlineSize == InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.outlineDirty = true;
            configureOutlineAndClip();
        }
    }

    private final void transformCanvas(Canvas canvas) {
        Canvas canvas2;
        float m5243getXimpl = IntOffset.m5243getXimpl(this.topLeft);
        float m5244getYimpl = IntOffset.m5244getYimpl(this.topLeft);
        float m5243getXimpl2 = IntOffset.m5243getXimpl(this.topLeft) + ((int) (this.size >> 32));
        float m5244getYimpl2 = IntOffset.m5244getYimpl(this.topLeft) + ((int) (this.size & 4294967295L));
        float alpha = getAlpha();
        ColorFilter colorFilter = getColorFilter();
        int m3148getBlendMode0nO6VwU = m3148getBlendMode0nO6VwU();
        if (alpha < 1.0f || !BlendMode.m2420equalsimpl0(m3148getBlendMode0nO6VwU, BlendMode.Companion.m2451getSrcOver0nO6VwU()) || colorFilter != null || CompositingStrategy.m3136equalsimpl0(m3149getCompositingStrategyke2Ky5w(), CompositingStrategy.Companion.m3142getOffscreenke2Ky5w())) {
            Paint paint = this.softwareLayerPaint;
            if (paint == null) {
                paint = AndroidPaint_androidKt.Paint();
                this.softwareLayerPaint = paint;
            }
            paint.setAlpha(alpha);
            paint.mo2387setBlendModes9anfk8(m3148getBlendMode0nO6VwU);
            paint.setColorFilter(colorFilter);
            canvas2 = canvas;
            canvas2.saveLayer(m5243getXimpl, m5244getYimpl, m5243getXimpl2, m5244getYimpl2, paint.asFrameworkPaint());
        } else {
            canvas.save();
            canvas2 = canvas;
        }
        canvas2.translate(m5243getXimpl, m5244getYimpl);
        canvas2.concat(this.impl.calculateMatrix());
    }

    private final Outline updatePathOutline(Path path) {
        Outline outline;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 > 28 || path.isConvex()) {
            Outline obtainAndroidOutline = obtainAndroidOutline();
            if (i11 >= 30) {
                OutlineVerificationHelper.INSTANCE.setPath(obtainAndroidOutline, path);
            } else {
                if (!(path instanceof AndroidPath)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                obtainAndroidOutline.setConvexPath(((AndroidPath) path).getInternalPath());
            }
            this.usePathForClip = !obtainAndroidOutline.canClip();
            outline = obtainAndroidOutline;
        } else {
            Outline outline2 = this.androidOutline;
            if (outline2 != null) {
                outline2.setEmpty();
            }
            this.usePathForClip = true;
            this.impl.setInvalidated(true);
            outline = null;
        }
        this.outlinePath = path;
        return outline;
    }

    public final void discardDisplayList$ui_graphics_release() {
        ChildLayerDependenciesTracker childLayerDependenciesTracker = this.childDependenciesTracker;
        GraphicsLayer graphicsLayer = childLayerDependenciesTracker.dependency;
        if (graphicsLayer != null) {
            graphicsLayer.onRemovedFromParentLayer();
            childLayerDependenciesTracker.dependency = null;
        }
        MutableScatterSet mutableScatterSet = childLayerDependenciesTracker.dependenciesSet;
        if (mutableScatterSet != null) {
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j11 = jArr[i11];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j11) < 128) {
                                ((GraphicsLayer) objArr[(i11 << 3) + i13]).onRemovedFromParentLayer();
                            }
                            j11 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        }
                    }
                    if (i11 == length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            mutableScatterSet.clear();
        }
        this.impl.discardDisplayList();
    }

    public final void draw$ui_graphics_release(@m80.k androidx.compose.ui.graphics.Canvas canvas, @m80.l GraphicsLayer graphicsLayer) {
        boolean z11;
        boolean z12;
        if (this.isReleased) {
            return;
        }
        configureOutlineAndClip();
        recreateDisplayListIfNeeded();
        boolean z13 = getShadowElevation() > 0.0f;
        if (z13) {
            canvas.enableZ();
        }
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        boolean isHardwareAccelerated = nativeCanvas.isHardwareAccelerated();
        if (!isHardwareAccelerated) {
            transformCanvas(nativeCanvas);
        }
        boolean z14 = !isHardwareAccelerated && this.clip;
        if (z14) {
            canvas.save();
            androidx.compose.ui.graphics.Outline outline = getOutline();
            if (outline instanceof Outline.Rectangle) {
                androidx.compose.ui.graphics.Canvas.m2482clipRectmtrdDE$default(canvas, outline.getBounds(), 0, 2, null);
            } else if (outline instanceof Outline.Rounded) {
                Path path = this.roundRectClipPath;
                if (path != null) {
                    path.rewind();
                } else {
                    path = AndroidPath_androidKt.Path();
                    this.roundRectClipPath = path;
                }
                Path.addRoundRect$default(path, ((Outline.Rounded) outline).getRoundRect(), null, 2, null);
                androidx.compose.ui.graphics.Canvas.m2480clipPathmtrdDE$default(canvas, path, 0, 2, null);
            } else if (outline instanceof Outline.Generic) {
                androidx.compose.ui.graphics.Canvas.m2480clipPathmtrdDE$default(canvas, ((Outline.Generic) outline).getPath(), 0, 2, null);
            }
        }
        if (graphicsLayer != null) {
            graphicsLayer.addSubLayer(this);
        }
        if (AndroidCanvas_androidKt.getNativeCanvas(canvas).isHardwareAccelerated() || this.impl.getSupportsSoftwareRendering()) {
            z11 = z13;
            z12 = z14;
            this.impl.draw(canvas);
        } else {
            CanvasDrawScope canvasDrawScope = this.softwareDrawScope;
            if (canvasDrawScope == null) {
                canvasDrawScope = new CanvasDrawScope();
                this.softwareDrawScope = canvasDrawScope;
            }
            CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
            Density density = this.density;
            LayoutDirection layoutDirection = this.layoutDirection;
            long m5298toSizeozmzZPI = IntSizeKt.m5298toSizeozmzZPI(this.size);
            Density density2 = canvasDrawScope2.getDrawContext().getDensity();
            LayoutDirection layoutDirection2 = canvasDrawScope2.getDrawContext().getLayoutDirection();
            androidx.compose.ui.graphics.Canvas canvas2 = canvasDrawScope2.getDrawContext().getCanvas();
            long mo2981getSizeNHjbRc = canvasDrawScope2.getDrawContext().mo2981getSizeNHjbRc();
            z11 = z13;
            GraphicsLayer graphicsLayer2 = canvasDrawScope2.getDrawContext().getGraphicsLayer();
            z12 = z14;
            DrawContext drawContext = canvasDrawScope2.getDrawContext();
            drawContext.setDensity(density);
            drawContext.setLayoutDirection(layoutDirection);
            drawContext.setCanvas(canvas);
            drawContext.mo2982setSizeuvyYCjk(m5298toSizeozmzZPI);
            drawContext.setGraphicsLayer(this);
            canvas.save();
            try {
                drawWithChildTracking(canvasDrawScope2);
            } finally {
                canvas.restore();
                DrawContext drawContext2 = canvasDrawScope2.getDrawContext();
                drawContext2.setDensity(density2);
                drawContext2.setLayoutDirection(layoutDirection2);
                drawContext2.setCanvas(canvas2);
                drawContext2.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
                drawContext2.setGraphicsLayer(graphicsLayer2);
            }
        }
        if (z12) {
            canvas.restore();
        }
        if (z11) {
            canvas.disableZ();
        }
        if (isHardwareAccelerated) {
            return;
        }
        nativeCanvas.restore();
    }

    public final void drawForPersistence$ui_graphics_release(@m80.k androidx.compose.ui.graphics.Canvas canvas) {
        if (AndroidCanvas_androidKt.getNativeCanvas(canvas).isHardwareAccelerated() || this.impl.getSupportsSoftwareRendering()) {
            recreateDisplayListIfNeeded();
            this.impl.draw(canvas);
        }
    }

    @m80.o
    public final void emulateTrimMemory$ui_graphics_release() {
        this.impl.discardDisplayList();
    }

    public final float getAlpha() {
        return this.impl.getAlpha();
    }

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public final long m3147getAmbientShadowColor0d7_KjU() {
        return this.impl.mo3163getAmbientShadowColor0d7_KjU();
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m3148getBlendMode0nO6VwU() {
        return this.impl.mo3164getBlendMode0nO6VwU();
    }

    public final float getCameraDistance() {
        return this.impl.getCameraDistance();
    }

    public final boolean getClip() {
        return this.clip;
    }

    @m80.l
    public final ColorFilter getColorFilter() {
        return this.impl.getColorFilter();
    }

    /* renamed from: getCompositingStrategy-ke2Ky5w, reason: not valid java name */
    public final int m3149getCompositingStrategyke2Ky5w() {
        return this.impl.mo3165getCompositingStrategyke2Ky5w();
    }

    @m80.k
    public final GraphicsLayerImpl getImpl$ui_graphics_release() {
        return this.impl;
    }

    public final long getLayerId() {
        return this.impl.getLayerId();
    }

    @m80.k
    public final androidx.compose.ui.graphics.Outline getOutline() {
        androidx.compose.ui.graphics.Outline rectangle;
        androidx.compose.ui.graphics.Outline outline = this.internalOutline;
        Path path = this.outlinePath;
        if (outline != null) {
            return outline;
        }
        if (path != null) {
            Outline.Generic generic = new Outline.Generic(path);
            this.internalOutline = generic;
            return generic;
        }
        long m5298toSizeozmzZPI = IntSizeKt.m5298toSizeozmzZPI(this.size);
        long j11 = this.roundRectOutlineTopLeft;
        long j12 = this.roundRectOutlineSize;
        if (j12 != InlineClassHelperKt.UnspecifiedPackedFloats) {
            m5298toSizeozmzZPI = j12;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (m5298toSizeozmzZPI >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = intBitsToFloat2 + Float.intBitsToFloat((int) (m5298toSizeozmzZPI & 4294967295L));
        if (this.roundRectCornerRadius > 0.0f) {
            rectangle = new Outline.Rounded(RoundRectKt.m2322RoundRectgG7oq9Y(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0)))));
        } else {
            rectangle = new Outline.Rectangle(new Rect(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.internalOutline = rectangle;
        return rectangle;
    }

    public final long getOwnerViewId() {
        return this.impl.getOwnerId();
    }

    /* renamed from: getPivotOffset-F1C5BW0, reason: not valid java name */
    public final long m3150getPivotOffsetF1C5BW0() {
        return this.pivotOffset;
    }

    @m80.l
    public final RenderEffect getRenderEffect() {
        return this.impl.getRenderEffect();
    }

    public final float getRotationX() {
        return this.impl.getRotationX();
    }

    public final float getRotationY() {
        return this.impl.getRotationY();
    }

    public final float getRotationZ() {
        return this.impl.getRotationZ();
    }

    public final float getScaleX() {
        return this.impl.getScaleX();
    }

    public final float getScaleY() {
        return this.impl.getScaleY();
    }

    public final float getShadowElevation() {
        return this.impl.getShadowElevation();
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m3151getSizeYbymL2g() {
        return this.size;
    }

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public final long m3152getSpotShadowColor0d7_KjU() {
        return this.impl.mo3167getSpotShadowColor0d7_KjU();
    }

    /* renamed from: getTopLeft-nOcc-ac, reason: not valid java name */
    public final long m3153getTopLeftnOccac() {
        return this.topLeft;
    }

    public final float getTranslationX() {
        return this.impl.getTranslationX();
    }

    public final float getTranslationY() {
        return this.impl.getTranslationY();
    }

    public final boolean isReleased() {
        return this.isReleased;
    }

    /* renamed from: record-mL-hObY, reason: not valid java name */
    public final void m3154recordmLhObY(@m80.k Density density, @m80.k LayoutDirection layoutDirection, long j11, @m80.k x00.l<? super DrawScope, g2> lVar) {
        m3146setSizeozmzZPI(j11);
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = lVar;
        this.impl.setInvalidated(true);
        recordInternal();
    }

    public final void release$ui_graphics_release() {
        if (this.isReleased) {
            return;
        }
        this.isReleased = true;
        discardContentIfReleasedAndHaveNoParentLayerUsages();
    }

    public final void setAlpha(float f11) {
        if (this.impl.getAlpha() == f11) {
            return;
        }
        this.impl.setAlpha(f11);
    }

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    public final void m3155setAmbientShadowColor8_81llA(long j11) {
        if (Color.m2510equalsimpl0(j11, this.impl.mo3163getAmbientShadowColor0d7_KjU())) {
            return;
        }
        this.impl.mo3168setAmbientShadowColor8_81llA(j11);
    }

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m3156setBlendModes9anfk8(int i11) {
        if (BlendMode.m2420equalsimpl0(this.impl.mo3164getBlendMode0nO6VwU(), i11)) {
            return;
        }
        this.impl.mo3169setBlendModes9anfk8(i11);
    }

    public final void setCameraDistance(float f11) {
        if (this.impl.getCameraDistance() == f11) {
            return;
        }
        this.impl.setCameraDistance(f11);
    }

    public final void setClip(boolean z11) {
        if (this.clip != z11) {
            this.clip = z11;
            this.outlineDirty = true;
            configureOutlineAndClip();
        }
    }

    public final void setColorFilter(@m80.l ColorFilter colorFilter) {
        if (kotlin.jvm.internal.g0.g(this.impl.getColorFilter(), colorFilter)) {
            return;
        }
        this.impl.setColorFilter(colorFilter);
    }

    /* renamed from: setCompositingStrategy-Wpw9cng, reason: not valid java name */
    public final void m3157setCompositingStrategyWpw9cng(int i11) {
        if (CompositingStrategy.m3136equalsimpl0(this.impl.mo3165getCompositingStrategyke2Ky5w(), i11)) {
            return;
        }
        this.impl.mo3170setCompositingStrategyWpw9cng(i11);
    }

    public final void setPathOutline(@m80.k Path path) {
        resetOutlineParams();
        this.outlinePath = path;
        configureOutlineAndClip();
    }

    /* renamed from: setPivotOffset-k-4lQ0M, reason: not valid java name */
    public final void m3158setPivotOffsetk4lQ0M(long j11) {
        if (Offset.m2265equalsimpl0(this.pivotOffset, j11)) {
            return;
        }
        this.pivotOffset = j11;
        this.impl.mo3172setPivotOffsetk4lQ0M(j11);
    }

    /* renamed from: setRectOutline-tz77jQw, reason: not valid java name */
    public final void m3159setRectOutlinetz77jQw(long j11, long j12) {
        m3160setRoundRectOutlineTNW_H78(j11, j12, 0.0f);
    }

    public final void setRenderEffect(@m80.l RenderEffect renderEffect) {
        if (kotlin.jvm.internal.g0.g(this.impl.getRenderEffect(), renderEffect)) {
            return;
        }
        this.impl.setRenderEffect(renderEffect);
    }

    public final void setRotationX(float f11) {
        if (this.impl.getRotationX() == f11) {
            return;
        }
        this.impl.setRotationX(f11);
    }

    public final void setRotationY(float f11) {
        if (this.impl.getRotationY() == f11) {
            return;
        }
        this.impl.setRotationY(f11);
    }

    public final void setRotationZ(float f11) {
        if (this.impl.getRotationZ() == f11) {
            return;
        }
        this.impl.setRotationZ(f11);
    }

    /* renamed from: setRoundRectOutline-TNW_H78, reason: not valid java name */
    public final void m3160setRoundRectOutlineTNW_H78(long j11, long j12, float f11) {
        if (Offset.m2265equalsimpl0(this.roundRectOutlineTopLeft, j11) && Size.m2333equalsimpl0(this.roundRectOutlineSize, j12) && this.roundRectCornerRadius == f11 && this.outlinePath == null) {
            return;
        }
        resetOutlineParams();
        this.roundRectOutlineTopLeft = j11;
        this.roundRectOutlineSize = j12;
        this.roundRectCornerRadius = f11;
        configureOutlineAndClip();
    }

    public final void setScaleX(float f11) {
        if (this.impl.getScaleX() == f11) {
            return;
        }
        this.impl.setScaleX(f11);
    }

    public final void setScaleY(float f11) {
        if (this.impl.getScaleY() == f11) {
            return;
        }
        this.impl.setScaleY(f11);
    }

    public final void setShadowElevation(float f11) {
        if (this.impl.getShadowElevation() == f11) {
            return;
        }
        this.impl.setShadowElevation(f11);
        this.outlineDirty = true;
        configureOutlineAndClip();
    }

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    public final void m3161setSpotShadowColor8_81llA(long j11) {
        if (Color.m2510equalsimpl0(j11, this.impl.mo3167getSpotShadowColor0d7_KjU())) {
            return;
        }
        this.impl.mo3174setSpotShadowColor8_81llA(j11);
    }

    /* renamed from: setTopLeft--gyyYBs, reason: not valid java name */
    public final void m3162setTopLeftgyyYBs(long j11) {
        if (IntOffset.m5242equalsimpl0(this.topLeft, j11)) {
            return;
        }
        this.topLeft = j11;
        m3143setPositionVbeCjmY(j11, this.size);
    }

    public final void setTranslationX(float f11) {
        if (this.impl.getTranslationX() == f11) {
            return;
        }
        this.impl.setTranslationX(f11);
    }

    public final void setTranslationY(float f11) {
        if (this.impl.getTranslationY() == f11) {
            return;
        }
        this.impl.setTranslationY(f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object toImageBitmap(@m80.k j00.c<? super androidx.compose.ui.graphics.ImageBitmap> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1 r0 = (androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1 r0 = new androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.e.n(r5)
            androidx.compose.ui.graphics.layer.LayerSnapshotImpl r5 = androidx.compose.ui.graphics.layer.GraphicsLayer.SnapshotImpl
            r0.label = r3
            java.lang.Object r5 = r5.toBitmap(r4, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            androidx.compose.ui.graphics.ImageBitmap r5 = androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asImageBitmap(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.GraphicsLayer.toImageBitmap(j00.c):java.lang.Object");
    }

    public static /* synthetic */ void getClip$annotations() {
    }
}
