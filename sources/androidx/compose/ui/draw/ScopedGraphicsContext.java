package androidx.compose.ui.draw;

import androidx.collection.MutableObjectList;
import androidx.collection.ObjectListKt;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/ScopedGraphicsContext\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,415:1\n56#2,5:416\n1#3:421\n287#4,6:422\n*S KotlinDebug\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/ScopedGraphicsContext\n*L\n180#1:416,5\n198#1:422,6\n*E\n"})
/* loaded from: classes.dex */
final class ScopedGraphicsContext implements GraphicsContext {

    @l
    private MutableObjectList<GraphicsLayer> allocatedGraphicsLayers;

    @l
    private GraphicsContext graphicsContext;

    @Override // androidx.compose.ui.graphics.GraphicsContext
    @k
    public GraphicsLayer createGraphicsLayer() {
        GraphicsContext graphicsContext = this.graphicsContext;
        if (!(graphicsContext != null)) {
            InlineClassHelperKt.throwIllegalStateException("GraphicsContext not provided");
        }
        GraphicsLayer createGraphicsLayer = graphicsContext.createGraphicsLayer();
        MutableObjectList<GraphicsLayer> mutableObjectList = this.allocatedGraphicsLayers;
        if (mutableObjectList == null) {
            this.allocatedGraphicsLayers = ObjectListKt.mutableObjectListOf(createGraphicsLayer);
            return createGraphicsLayer;
        }
        mutableObjectList.add(createGraphicsLayer);
        return createGraphicsLayer;
    }

    @l
    public final GraphicsContext getGraphicsContext() {
        return this.graphicsContext;
    }

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public void releaseGraphicsLayer(@k GraphicsLayer graphicsLayer) {
        GraphicsContext graphicsContext = this.graphicsContext;
        if (graphicsContext != null) {
            graphicsContext.releaseGraphicsLayer(graphicsLayer);
        }
    }

    public final void releaseGraphicsLayers() {
        MutableObjectList<GraphicsLayer> mutableObjectList = this.allocatedGraphicsLayers;
        if (mutableObjectList != null) {
            Object[] objArr = mutableObjectList.content;
            int i11 = mutableObjectList._size;
            for (int i12 = 0; i12 < i11; i12++) {
                releaseGraphicsLayer((GraphicsLayer) objArr[i12]);
            }
            mutableObjectList.clear();
        }
    }

    public final void setGraphicsContext(@l GraphicsContext graphicsContext) {
        releaseGraphicsLayers();
        this.graphicsContext = graphicsContext;
    }
}
