package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.core.os.HandlerCompat;
import java.util.Locale;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLayerManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayerManager.android.kt\nandroidx/compose/ui/graphics/layer/LayerManager\n+ 2 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,167:1\n1516#2:168\n1#3:169\n41#4,3:170\n44#4,2:198\n231#5,3:173\n200#5,7:176\n211#5,3:184\n214#5,9:188\n234#5:197\n1399#6:183\n1270#6:187\n287#7,6:200\n*S KotlinDebug\n*F\n+ 1 LayerManager.android.kt\nandroidx/compose/ui/graphics/layer/LayerManager\n*L\n82#1:168\n123#1:170,3\n123#1:198,2\n126#1:173,3\n126#1:176,7\n126#1:184,3\n126#1:188,9\n126#1:197\n126#1:183\n126#1:187\n132#1:200,6\n*E\n"})
/* loaded from: classes.dex */
public final class LayerManager {

    @m80.k
    public static final Companion Companion = new Companion(null);
    private static final boolean isRobolectric;

    @m80.k
    private final CanvasHolder canvasHolder;

    @m80.l
    private ImageReader imageReader;
    private boolean persistenceIterationInProgress;

    @m80.l
    private MutableObjectList<GraphicsLayer> postponedReleaseRequests;

    @m80.k
    private final MutableScatterSet<GraphicsLayer> layerSet = ScatterSetKt.mutableScatterSetOf();

    @m80.k
    private final Handler handler = HandlerCompat.createAsync(Looper.getMainLooper(), new Handler.Callback() { // from class: androidx.compose.ui.graphics.layer.z
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            boolean handler$lambda$0;
            handler$lambda$0 = LayerManager.handler$lambda$0(LayerManager.this, message);
            return handler$lambda$0;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final boolean isRobolectric() {
            return LayerManager.isRobolectric;
        }

        private Companion() {
        }
    }

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.g0.o(lowerCase, "toLowerCase(...)");
        isRobolectric = kotlin.jvm.internal.g0.g(lowerCase, "robolectric");
    }

    public LayerManager(@m80.k CanvasHolder canvasHolder) {
        this.canvasHolder = canvasHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean handler$lambda$0(LayerManager layerManager, Message message) {
        layerManager.persistLayers(layerManager.layerSet);
        return true;
    }

    private final void persistLayers(ScatterSet<GraphicsLayer> scatterSet) {
        if (!scatterSet.isNotEmpty() || isRobolectric) {
            return;
        }
        ImageReader imageReader = this.imageReader;
        if (imageReader == null) {
            imageReader = ImageReader.newInstance(1, 1, 1, 3);
            imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.compose.ui.graphics.layer.y
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader2) {
                    LayerManager.persistLayers$lambda$3$lambda$2(imageReader2);
                }
            }, this.handler);
            this.imageReader = imageReader;
        }
        Surface surface = imageReader.getSurface();
        Canvas lockHardwareCanvas = LockHardwareCanvasHelper.INSTANCE.lockHardwareCanvas(surface);
        this.persistenceIterationInProgress = true;
        CanvasHolder canvasHolder = this.canvasHolder;
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(lockHardwareCanvas);
        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        lockHardwareCanvas.save();
        int i11 = 0;
        lockHardwareCanvas.clipRect(0, 0, 1, 1);
        Object[] objArr = scatterSet.elements;
        long[] jArr = scatterSet.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j11 = jArr[i12];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i14 = i11; i14 < i13; i14++) {
                        if ((j11 & 255) < 128) {
                            ((GraphicsLayer) objArr[(i12 << 3) + i14]).drawForPersistence$ui_graphics_release(androidCanvas);
                        }
                        j11 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    }
                }
                if (i12 == length) {
                    break;
                }
                i12++;
                i11 = 0;
            }
        }
        lockHardwareCanvas.restore();
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        this.persistenceIterationInProgress = false;
        MutableObjectList<GraphicsLayer> mutableObjectList = this.postponedReleaseRequests;
        if (mutableObjectList != null && mutableObjectList.isNotEmpty()) {
            Object[] objArr2 = mutableObjectList.content;
            int i15 = mutableObjectList._size;
            for (int i16 = 0; i16 < i15; i16++) {
                release((GraphicsLayer) objArr2[i16]);
            }
            mutableObjectList.clear();
        }
        surface.unlockCanvasAndPost(lockHardwareCanvas);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void persistLayers$lambda$3$lambda$2(ImageReader imageReader) {
        Image acquireLatestImage;
        if (imageReader == null || (acquireLatestImage = imageReader.acquireLatestImage()) == null) {
            return;
        }
        acquireLatestImage.close();
    }

    public final void destroy() {
        ImageReader imageReader = this.imageReader;
        if (imageReader != null) {
            imageReader.close();
        }
        this.imageReader = null;
    }

    @m80.k
    public final CanvasHolder getCanvasHolder() {
        return this.canvasHolder;
    }

    public final boolean hasImageReader() {
        return this.imageReader != null;
    }

    public final void persist(@m80.k GraphicsLayer graphicsLayer) {
        this.layerSet.add(graphicsLayer);
        if (this.handler.hasMessages(0)) {
            return;
        }
        this.handler.sendMessageAtFrontOfQueue(Message.obtain());
    }

    public final void release(@m80.k GraphicsLayer graphicsLayer) {
        if (!this.persistenceIterationInProgress) {
            if (this.layerSet.remove(graphicsLayer)) {
                graphicsLayer.discardDisplayList$ui_graphics_release();
            }
        } else {
            MutableObjectList<GraphicsLayer> mutableObjectList = this.postponedReleaseRequests;
            if (mutableObjectList == null) {
                mutableObjectList = new MutableObjectList<>(0, 1, null);
                this.postponedReleaseRequests = mutableObjectList;
            }
            mutableObjectList.add(graphicsLayer);
        }
    }

    public final void updateLayerPersistence() {
        destroy();
        persistLayers(this.layerSet);
    }
}
