package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(28)
/* loaded from: classes.dex */
public final class LayerSnapshotV28 implements LayerSnapshotImpl {

    @m80.k
    public static final LayerSnapshotV28 INSTANCE = new LayerSnapshotV28();

    private LayerSnapshotV28() {
    }

    @Override // androidx.compose.ui.graphics.layer.LayerSnapshotImpl
    @m80.l
    public Object toBitmap(@m80.k GraphicsLayer graphicsLayer, @m80.k j00.c<? super Bitmap> cVar) {
        Bitmap createBitmap;
        createBitmap = Bitmap.createBitmap(new GraphicsLayerPicture(graphicsLayer));
        return createBitmap;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nLayerSnapshot.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayerSnapshot.android.kt\nandroidx/compose/ui/graphics/layer/LayerSnapshotV28$GraphicsLayerPicture\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,220:1\n54#2:221\n59#2:223\n85#3:222\n90#3:224\n*S KotlinDebug\n*F\n+ 1 LayerSnapshot.android.kt\nandroidx/compose/ui/graphics/layer/LayerSnapshotV28$GraphicsLayerPicture\n*L\n64#1:221\n66#1:223\n64#1:222\n66#1:224\n*E\n"})
    public static final class GraphicsLayerPicture extends Picture {

        @m80.k
        private final GraphicsLayer graphicsLayer;

        public GraphicsLayerPicture(@m80.k GraphicsLayer graphicsLayer) {
            this.graphicsLayer = graphicsLayer;
        }

        @Override // android.graphics.Picture
        @m80.k
        public Canvas beginRecording(int i11, int i12) {
            return new Canvas();
        }

        @Override // android.graphics.Picture
        public void draw(@m80.k Canvas canvas) {
            this.graphicsLayer.draw$ui_graphics_release(AndroidCanvas_androidKt.Canvas(canvas), null);
        }

        @m80.k
        public final GraphicsLayer getGraphicsLayer() {
            return this.graphicsLayer;
        }

        @Override // android.graphics.Picture
        public int getHeight() {
            return (int) (this.graphicsLayer.m3151getSizeYbymL2g() & 4294967295L);
        }

        @Override // android.graphics.Picture
        public int getWidth() {
            return (int) (this.graphicsLayer.m3151getSizeYbymL2g() >> 32);
        }

        @Override // android.graphics.Picture
        public boolean requiresHardwareAcceleration() {
            return true;
        }

        @Override // android.graphics.Picture
        public void endRecording() {
        }
    }
}
