package androidx.media3.exoplayer.video.spherical;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class SceneRenderer implements VideoFrameMetadataListener, CameraMotionListener {
    private static final String TAG = "SceneRenderer";

    @Nullable
    private byte[] lastProjectionData;
    private SurfaceTexture surfaceTexture;
    private int textureId;
    private final AtomicBoolean frameAvailable = new AtomicBoolean();
    private final AtomicBoolean resetRotationAtNextFrame = new AtomicBoolean(true);
    private final ProjectionRenderer projectionRenderer = new ProjectionRenderer();
    private final FrameRotationQueue frameRotationQueue = new FrameRotationQueue();
    private final TimedValueQueue<Long> sampleTimestampQueue = new TimedValueQueue<>();
    private final TimedValueQueue<Projection> projectionQueue = new TimedValueQueue<>();
    private final float[] rotationMatrix = new float[16];
    private final float[] tempMatrix = new float[16];
    private volatile int defaultStereoMode = 0;
    private int lastStereoMode = -1;

    private void setProjection(@Nullable byte[] bArr, int i11, long j11) {
        byte[] bArr2 = this.lastProjectionData;
        int i12 = this.lastStereoMode;
        this.lastProjectionData = bArr;
        if (i11 == -1) {
            i11 = this.defaultStereoMode;
        }
        this.lastStereoMode = i11;
        if (i12 == i11 && Arrays.equals(bArr2, this.lastProjectionData)) {
            return;
        }
        byte[] bArr3 = this.lastProjectionData;
        Projection decode = bArr3 != null ? ProjectionDecoder.decode(bArr3, this.lastStereoMode) : null;
        if (decode == null || !ProjectionRenderer.isSupported(decode)) {
            decode = Projection.createEquirectangular(this.lastStereoMode);
        }
        this.projectionQueue.add(j11, decode);
    }

    public void drawFrame(float[] fArr, boolean z11) {
        GLES20.glClear(16384);
        try {
            GlUtil.checkGlError();
        } catch (GlUtil.GlException e11) {
            Log.e(TAG, "Failed to draw a frame", e11);
        }
        if (this.frameAvailable.compareAndSet(true, false)) {
            ((SurfaceTexture) Assertions.checkNotNull(this.surfaceTexture)).updateTexImage();
            try {
                GlUtil.checkGlError();
            } catch (GlUtil.GlException e12) {
                Log.e(TAG, "Failed to draw a frame", e12);
            }
            if (this.resetRotationAtNextFrame.compareAndSet(true, false)) {
                GlUtil.setToIdentity(this.rotationMatrix);
            }
            long timestamp = this.surfaceTexture.getTimestamp();
            Long poll = this.sampleTimestampQueue.poll(timestamp);
            if (poll != null) {
                this.frameRotationQueue.pollRotationMatrix(this.rotationMatrix, poll.longValue());
            }
            Projection pollFloor = this.projectionQueue.pollFloor(timestamp);
            if (pollFloor != null) {
                this.projectionRenderer.setProjection(pollFloor);
            }
        }
        Matrix.multiplyMM(this.tempMatrix, 0, fArr, 0, this.rotationMatrix, 0);
        this.projectionRenderer.draw(this.textureId, this.tempMatrix, z11);
    }

    public SurfaceTexture init() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            GlUtil.checkGlError();
            this.projectionRenderer.init();
            GlUtil.checkGlError();
            this.textureId = GlUtil.createExternalTexture();
        } catch (GlUtil.GlException e11) {
            Log.e(TAG, "Failed to initialize the renderer", e11);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.textureId);
        this.surfaceTexture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: androidx.media3.exoplayer.video.spherical.a
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                SceneRenderer.this.frameAvailable.set(true);
            }
        });
        return this.surfaceTexture;
    }

    @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
    public void onCameraMotion(long j11, float[] fArr) {
        this.frameRotationQueue.setRotation(j11, fArr);
    }

    @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
    public void onCameraMotionReset() {
        this.sampleTimestampQueue.clear();
        this.frameRotationQueue.reset();
        this.resetRotationAtNextFrame.set(true);
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameMetadataListener
    public void onVideoFrameAboutToBeRendered(long j11, long j12, Format format, @Nullable MediaFormat mediaFormat) {
        this.sampleTimestampQueue.add(j12, Long.valueOf(j11));
        setProjection(format.projectionData, format.stereoMode, j12);
    }

    public void setDefaultStereoMode(int i11) {
        this.defaultStereoMode = i11;
    }

    public void shutdown() {
        this.projectionRenderer.shutdown();
    }
}
