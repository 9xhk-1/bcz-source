package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLayerSnapshot.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayerSnapshot.android.kt\nandroidx/compose/ui/graphics/layer/LayerSnapshotV21\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,220:1\n54#2:221\n59#2:223\n85#3:222\n90#3:224\n*S KotlinDebug\n*F\n+ 1 LayerSnapshot.android.kt\nandroidx/compose/ui/graphics/layer/LayerSnapshotV21\n*L\n114#1:221\n114#1:223\n114#1:222\n114#1:224\n*E\n"})
/* loaded from: classes.dex */
public final class LayerSnapshotV21 implements LayerSnapshotImpl {

    @m80.k
    public static final LayerSnapshotV21 INSTANCE = new LayerSnapshotV21();

    private LayerSnapshotV21() {
    }

    @Override // androidx.compose.ui.graphics.layer.LayerSnapshotImpl
    @m80.l
    public Object toBitmap(@m80.k GraphicsLayer graphicsLayer, @m80.k j00.c<? super Bitmap> cVar) {
        long m3151getSizeYbymL2g = graphicsLayer.m3151getSizeYbymL2g();
        Bitmap createBitmap = Bitmap.createBitmap((int) (m3151getSizeYbymL2g >> 32), (int) (m3151getSizeYbymL2g & 4294967295L), Bitmap.Config.ARGB_8888);
        graphicsLayer.draw$ui_graphics_release(AndroidCanvas_androidKt.Canvas(new Canvas(createBitmap)), null);
        return createBitmap;
    }
}
