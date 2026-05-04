package com.tencent.ijk.media.player;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaDataSource;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.media.TimedText;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.ijk.media.player.misc.AndroidTrackInfo;
import com.tencent.ijk.media.player.misc.IMediaDataSource;
import com.tencent.ijk.media.player.misc.ITrackInfo;
import com.tencent.ijk.media.player.pragma.DebugLog;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class AndroidMediaPlayer extends AbstractMediaPlayer {
    private static final String TAG = "AndroidMediaPlayer";
    private static MediaInfo sMediaInfo;
    private String mDataSource;
    private final Object mInitLock;
    private final AndroidMediaPlayerListenerHolder mInternalListenerAdapter;
    private final MediaPlayer mInternalMediaPlayer;
    private boolean mIsReleased;
    private MediaDataSource mMediaDataSource;
    private Surface mSurface;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class AndroidMediaPlayerListenerHolder implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnTimedTextListener, MediaPlayer.OnVideoSizeChangedListener {
        public final WeakReference<AndroidMediaPlayer> mWeakMediaPlayer;

        public AndroidMediaPlayerListenerHolder(AndroidMediaPlayer androidMediaPlayer) {
            this.mWeakMediaPlayer = new WeakReference<>(androidMediaPlayer);
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i11) {
            if (this.mWeakMediaPlayer.get() == null) {
                return;
            }
            AndroidMediaPlayer.this.notifyOnBufferingUpdate(i11);
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            if (this.mWeakMediaPlayer.get() == null) {
                return;
            }
            AndroidMediaPlayer.this.notifyOnCompletion();
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i11, int i12) {
            return this.mWeakMediaPlayer.get() != null && AndroidMediaPlayer.this.notifyOnError(i11, i12);
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i11, int i12) {
            return this.mWeakMediaPlayer.get() != null && AndroidMediaPlayer.this.notifyOnInfo(i11, i12);
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            if (this.mWeakMediaPlayer.get() == null) {
                return;
            }
            AndroidMediaPlayer.this.notifyOnPrepared();
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            if (this.mWeakMediaPlayer.get() == null) {
                return;
            }
            AndroidMediaPlayer.this.notifyOnSeekComplete();
        }

        @Override // android.media.MediaPlayer.OnTimedTextListener
        public void onTimedText(MediaPlayer mediaPlayer, TimedText timedText) {
            if (this.mWeakMediaPlayer.get() == null) {
                return;
            }
            AndroidMediaPlayer.this.notifyOnTimedText(timedText != null ? new IjkTimedText(timedText.getBounds(), timedText.getText()) : null);
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i11, int i12) {
            if (this.mWeakMediaPlayer.get() == null) {
                return;
            }
            AndroidMediaPlayer.this.notifyOnVideoSizeChanged(i11, i12, 1, 1);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @TargetApi(23)
    public static class MediaDataSourceProxy extends MediaDataSource {
        private final IMediaDataSource mMediaDataSource;

        public MediaDataSourceProxy(IMediaDataSource iMediaDataSource) {
            this.mMediaDataSource = iMediaDataSource;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.mMediaDataSource.close();
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
            return this.mMediaDataSource.getSize();
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j11, byte[] bArr, int i11, int i12) throws IOException {
            return this.mMediaDataSource.readAt(j11, bArr, i11, i12);
        }
    }

    public AndroidMediaPlayer() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.mInitLock = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.mInternalMediaPlayer = mediaPlayer;
        }
        mediaPlayer.setAudioStreamType(3);
        this.mInternalListenerAdapter = new AndroidMediaPlayerListenerHolder(this);
        attachInternalListeners();
    }

    private void attachInternalListeners() {
        this.mInternalMediaPlayer.setOnPreparedListener(this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnBufferingUpdateListener(this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnCompletionListener(this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnSeekCompleteListener(this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnVideoSizeChangedListener(this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnErrorListener(this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnInfoListener(this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnTimedTextListener(this.mInternalListenerAdapter);
    }

    private void releaseMediaDataSource() {
        MediaDataSource mediaDataSource = this.mMediaDataSource;
        if (mediaDataSource != null) {
            try {
                mediaDataSource.close();
            } catch (IOException e11) {
                TXCLog.e(TAG, "close media data source failed.", e11);
            }
            this.mMediaDataSource = null;
        }
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public int getAudioSessionId() {
        return this.mInternalMediaPlayer.getAudioSessionId();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public int getBitrateIndex() {
        return 0;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public long getCurrentPosition() {
        try {
            return this.mInternalMediaPlayer.getCurrentPosition();
        } catch (IllegalStateException e11) {
            DebugLog.printStackTrace(e11);
            return 0L;
        }
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public String getDataSource() {
        return this.mDataSource;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public long getDuration() {
        try {
            return this.mInternalMediaPlayer.getDuration();
        } catch (IllegalStateException e11) {
            DebugLog.printStackTrace(e11);
            return 0L;
        }
    }

    public MediaPlayer getInternalMediaPlayer() {
        return this.mInternalMediaPlayer;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public MediaInfo getMediaInfo() {
        if (sMediaInfo == null) {
            MediaInfo mediaInfo = new MediaInfo();
            mediaInfo.mVideoDecoder = "android";
            mediaInfo.mVideoDecoderImpl = "HW";
            mediaInfo.mAudioDecoder = "android";
            mediaInfo.mAudioDecoderImpl = "HW";
            sMediaInfo = mediaInfo;
        }
        return sMediaInfo;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    @TargetApi(23)
    public float getRate() {
        return this.mInternalMediaPlayer.getPlaybackParams().getSpeed();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public ArrayList<IjkBitrateItem> getSupportedBitrates() {
        return new ArrayList<>();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public Surface getSurface() {
        return this.mSurface;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public ITrackInfo[] getTrackInfo() {
        return AndroidTrackInfo.fromMediaPlayer(this.mInternalMediaPlayer);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public int getVideoHeight() {
        return this.mInternalMediaPlayer.getVideoHeight();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public int getVideoSarDen() {
        return 1;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public int getVideoSarNum() {
        return 1;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public int getVideoWidth() {
        return this.mInternalMediaPlayer.getVideoWidth();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public boolean isLooping() {
        return this.mInternalMediaPlayer.isLooping();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public boolean isPlayable() {
        return true;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public boolean isPlaying() {
        try {
            return this.mInternalMediaPlayer.isPlaying();
        } catch (IllegalStateException e11) {
            DebugLog.printStackTrace(e11);
            return false;
        }
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void pause() throws IllegalStateException {
        this.mInternalMediaPlayer.pause();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void prepareAsync() throws IllegalStateException {
        this.mInternalMediaPlayer.prepareAsync();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void release() {
        this.mIsReleased = true;
        this.mInternalMediaPlayer.release();
        releaseMediaDataSource();
        resetListeners();
        attachInternalListeners();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void reset() {
        try {
            this.mInternalMediaPlayer.reset();
        } catch (IllegalStateException e11) {
            DebugLog.printStackTrace(e11);
        }
        releaseMediaDataSource();
        resetListeners();
        attachInternalListeners();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void seekTo(long j11) throws IllegalStateException {
        this.mInternalMediaPlayer.seekTo((int) j11);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setAudioStreamType(int i11) {
        this.mInternalMediaPlayer.setAudioStreamType(i11);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setDataSource(Context context, Uri uri) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        this.mInternalMediaPlayer.setDataSource(context, uri);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
        synchronized (this.mInitLock) {
            try {
                if (!this.mIsReleased) {
                    this.mInternalMediaPlayer.setDisplay(surfaceHolder);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setLooping(boolean z11) {
        this.mInternalMediaPlayer.setLooping(z11);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    @TargetApi(23)
    public void setRate(float f11) {
        PlaybackParams playbackParams = new PlaybackParams();
        playbackParams.setPitch(f11);
        playbackParams.setSpeed(f11);
        this.mInternalMediaPlayer.setPlaybackParams(playbackParams);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setScreenOnWhilePlaying(boolean z11) {
        this.mInternalMediaPlayer.setScreenOnWhilePlaying(z11);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    @TargetApi(14)
    public void setSurface(Surface surface) {
        this.mInternalMediaPlayer.setSurface(surface);
        this.mSurface = surface;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setVolume(float f11, float f12) {
        this.mInternalMediaPlayer.setVolume(f11, f12);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setWakeMode(Context context, int i11) {
        this.mInternalMediaPlayer.setWakeMode(context, i11);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void start() throws IllegalStateException {
        this.mInternalMediaPlayer.start();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void stop() throws IllegalStateException {
        this.mInternalMediaPlayer.stop();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    @TargetApi(14)
    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        this.mInternalMediaPlayer.setDataSource(context, uri, map);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setDataSource(FileDescriptor fileDescriptor) throws IOException, IllegalArgumentException, IllegalStateException {
        this.mInternalMediaPlayer.setDataSource(fileDescriptor);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setDataSource(String str) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        this.mDataSource = str;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (!TextUtils.isEmpty(scheme) && scheme.equalsIgnoreCase("file")) {
            this.mInternalMediaPlayer.setDataSource(parse.getPath());
        } else {
            this.mInternalMediaPlayer.setDataSource(str);
        }
    }

    @Override // com.tencent.ijk.media.player.AbstractMediaPlayer, com.tencent.ijk.media.player.IMediaPlayer
    @TargetApi(23)
    public void setDataSource(IMediaDataSource iMediaDataSource) {
        releaseMediaDataSource();
        MediaDataSourceProxy mediaDataSourceProxy = new MediaDataSourceProxy(iMediaDataSource);
        this.mMediaDataSource = mediaDataSourceProxy;
        this.mInternalMediaPlayer.setDataSource(mediaDataSourceProxy);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void enableAdaptiveBitrate() {
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void publishAudioToNetwork() {
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void unpublishAudioToNetwork() {
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setAudioVolume(int i11) {
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setBitrateIndex(int i11) {
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setKeepInBackground(boolean z11) {
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setLogEnabled(boolean z11) {
    }
}
