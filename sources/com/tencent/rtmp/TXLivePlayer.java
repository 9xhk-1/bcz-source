package com.tencent.rtmp;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TXLivePlayer {
    public static final int PLAY_TYPE_LIVE_FLV = 1;
    public static final int PLAY_TYPE_LIVE_RTMP = 0;
    public static final int PLAY_TYPE_LIVE_RTMP_ACC = 5;
    public static final int PLAY_TYPE_LOCAL_VIDEO = 6;
    public static final int PLAY_TYPE_VOD_FLV = 2;
    public static final int PLAY_TYPE_VOD_HLS = 3;
    public static final int PLAY_TYPE_VOD_MP4 = 4;
    public static final String TAG = "TXLivePlayer";
    private a mTXLivePlayerImpl;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ITXAudioRawDataListener {
        void onAudioInfoChanged(int i11, int i12, int i13);

        void onPcmDataAvailable(byte[] bArr, long j11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ITXAudioVolumeEvaluationListener {
        void onAudioVolumeEvaluationNotify(int i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ITXLivePlayVideoRenderListener {
        void onRenderVideoFrame(TXLiteAVTexture tXLiteAVTexture);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ITXSnapshotListener {
        void onSnapshot(Bitmap bitmap);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ITXVideoRawDataListener {
        void onVideoRawDataAvailable(byte[] bArr, int i11, int i12, int i13);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TXLiteAVTexture {
        public Object eglContext;
        public int height;
        public int textureId;
        public int width;
    }

    public TXLivePlayer(Context context) {
        this.mTXLivePlayerImpl = new a(context);
    }

    public boolean addVideoRawData(byte[] bArr) {
        return this.mTXLivePlayerImpl.a(bArr);
    }

    public void callExperimentalAPI(String str) {
        this.mTXLivePlayerImpl.b(str);
    }

    public void enableAudioVolumeEvaluation(int i11) {
        this.mTXLivePlayerImpl.e(i11);
    }

    public boolean enableHardwareDecode(boolean z11) {
        return this.mTXLivePlayerImpl.b(z11);
    }

    public long getCurrentRenderPts() {
        return this.mTXLivePlayerImpl.f();
    }

    public boolean isPlaying() {
        return this.mTXLivePlayerImpl.a();
    }

    public void pause() {
        this.mTXLivePlayerImpl.b();
    }

    public int prepareLiveSeek(String str, int i11) {
        return this.mTXLivePlayerImpl.b(str, i11);
    }

    public void resume() {
        this.mTXLivePlayerImpl.c();
    }

    public int resumeLive() {
        return this.mTXLivePlayerImpl.e();
    }

    public void seek(int i11) {
        this.mTXLivePlayerImpl.g(i11);
    }

    public void setAudioRawDataListener(ITXAudioRawDataListener iTXAudioRawDataListener) {
        this.mTXLivePlayerImpl.a(iTXAudioRawDataListener);
    }

    public void setAudioRoute(int i11) {
        this.mTXLivePlayerImpl.d(i11);
    }

    public void setAudioVolumeEvaluationListener(ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.mTXLivePlayerImpl.a(iTXAudioVolumeEvaluationListener);
    }

    @Deprecated
    public void setAutoPlay(boolean z11) {
        this.mTXLivePlayerImpl.d(z11);
    }

    public void setConfig(TXLivePlayConfig tXLivePlayConfig) {
        this.mTXLivePlayerImpl.a(tXLivePlayConfig);
    }

    public void setMute(boolean z11) {
        this.mTXLivePlayerImpl.c(z11);
    }

    public void setPlayListener(ITXLivePlayListener iTXLivePlayListener) {
        this.mTXLivePlayerImpl.a(iTXLivePlayListener);
    }

    public void setPlayerView(TXCloudVideoView tXCloudVideoView) {
        this.mTXLivePlayerImpl.a(tXCloudVideoView);
    }

    @Deprecated
    public void setRate(float f11) {
        this.mTXLivePlayerImpl.a(f11);
    }

    public void setRenderMode(int i11) {
        this.mTXLivePlayerImpl.a(i11);
    }

    public void setRenderRotation(int i11) {
        this.mTXLivePlayerImpl.b(i11);
    }

    public void setSurface(Surface surface) {
        this.mTXLivePlayerImpl.a(surface);
    }

    public void setSurfaceSize(int i11, int i12) {
        this.mTXLivePlayerImpl.a(i11, i12);
    }

    public void setVideoRawDataListener(ITXVideoRawDataListener iTXVideoRawDataListener) {
        this.mTXLivePlayerImpl.a(iTXVideoRawDataListener);
    }

    public void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        this.mTXLivePlayerImpl.a(iTXVideoRecordListener);
    }

    public int setVideoRenderListener(ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener, Object obj) {
        return this.mTXLivePlayerImpl.a(iTXLivePlayVideoRenderListener, obj);
    }

    public void setVolume(int i11) {
        this.mTXLivePlayerImpl.c(i11);
    }

    public void snapshot(ITXSnapshotListener iTXSnapshotListener) {
        this.mTXLivePlayerImpl.a(iTXSnapshotListener);
    }

    public int startPlay(String str, int i11) {
        return this.mTXLivePlayerImpl.a(str, i11);
    }

    public int startRecord(int i11) {
        return this.mTXLivePlayerImpl.f(i11);
    }

    public int stopPlay(boolean z11) {
        return this.mTXLivePlayerImpl.a(z11);
    }

    public int stopRecord() {
        return this.mTXLivePlayerImpl.d();
    }

    public int switchStream(String str) {
        return this.mTXLivePlayerImpl.a(str);
    }
}
