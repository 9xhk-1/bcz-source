package com.tencent.ijk.media.player;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.ijk.media.player.IMediaPlayer;
import com.tencent.ijk.media.player.misc.IMediaDataSource;
import com.tencent.ijk.media.player.misc.ITrackInfo;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class MediaPlayerProxy implements IMediaPlayer {
    protected final IMediaPlayer mBackEndMediaPlayer;

    public MediaPlayerProxy(IMediaPlayer iMediaPlayer) {
        this.mBackEndMediaPlayer = iMediaPlayer;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void enableAdaptiveBitrate() {
        this.mBackEndMediaPlayer.enableAdaptiveBitrate();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public int getAudioSessionId() {
        return this.mBackEndMediaPlayer.getAudioSessionId();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public int getBitrateIndex() {
        return this.mBackEndMediaPlayer.getBitrateIndex();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public long getCurrentPosition() {
        return this.mBackEndMediaPlayer.getCurrentPosition();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public String getDataSource() {
        return this.mBackEndMediaPlayer.getDataSource();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public long getDuration() {
        return this.mBackEndMediaPlayer.getDuration();
    }

    public IMediaPlayer getInternalMediaPlayer() {
        return this.mBackEndMediaPlayer;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public MediaInfo getMediaInfo() {
        return this.mBackEndMediaPlayer.getMediaInfo();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public float getRate() {
        return this.mBackEndMediaPlayer.getRate();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public ArrayList<IjkBitrateItem> getSupportedBitrates() {
        return this.mBackEndMediaPlayer.getSupportedBitrates();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public Surface getSurface() {
        return this.mBackEndMediaPlayer.getSurface();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public ITrackInfo[] getTrackInfo() {
        return this.mBackEndMediaPlayer.getTrackInfo();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public int getVideoHeight() {
        return this.mBackEndMediaPlayer.getVideoHeight();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public int getVideoSarDen() {
        return this.mBackEndMediaPlayer.getVideoSarDen();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public int getVideoSarNum() {
        return this.mBackEndMediaPlayer.getVideoSarNum();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public int getVideoWidth() {
        return this.mBackEndMediaPlayer.getVideoWidth();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public boolean isLooping() {
        return this.mBackEndMediaPlayer.isLooping();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public boolean isPlayable() {
        return false;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public boolean isPlaying() {
        return this.mBackEndMediaPlayer.isPlaying();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void pause() throws IllegalStateException {
        this.mBackEndMediaPlayer.pause();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void prepareAsync() throws IllegalStateException {
        this.mBackEndMediaPlayer.prepareAsync();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void publishAudioToNetwork() {
        this.mBackEndMediaPlayer.publishAudioToNetwork();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void release() {
        this.mBackEndMediaPlayer.release();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void reset() {
        this.mBackEndMediaPlayer.reset();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void seekTo(long j11) throws IllegalStateException {
        this.mBackEndMediaPlayer.seekTo(j11);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setAudioStreamType(int i11) {
        this.mBackEndMediaPlayer.setAudioStreamType(i11);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setAudioVolume(int i11) {
        this.mBackEndMediaPlayer.setAudioVolume(i11);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setBitrateIndex(int i11) {
        this.mBackEndMediaPlayer.setBitrateIndex(i11);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setDataSource(Context context, Uri uri) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        this.mBackEndMediaPlayer.setDataSource(context, uri);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
        this.mBackEndMediaPlayer.setDisplay(surfaceHolder);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setKeepInBackground(boolean z11) {
        this.mBackEndMediaPlayer.setKeepInBackground(z11);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setLooping(boolean z11) {
        this.mBackEndMediaPlayer.setLooping(z11);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setOnBufferingUpdateListener(final IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        if (onBufferingUpdateListener != null) {
            this.mBackEndMediaPlayer.setOnBufferingUpdateListener(new IMediaPlayer.OnBufferingUpdateListener() { // from class: com.tencent.ijk.media.player.MediaPlayerProxy.3
                @Override // com.tencent.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
                public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i11) {
                    onBufferingUpdateListener.onBufferingUpdate(MediaPlayerProxy.this, i11);
                }
            });
        } else {
            this.mBackEndMediaPlayer.setOnBufferingUpdateListener(null);
        }
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setOnCompletionListener(final IMediaPlayer.OnCompletionListener onCompletionListener) {
        if (onCompletionListener != null) {
            this.mBackEndMediaPlayer.setOnCompletionListener(new IMediaPlayer.OnCompletionListener() { // from class: com.tencent.ijk.media.player.MediaPlayerProxy.2
                @Override // com.tencent.ijk.media.player.IMediaPlayer.OnCompletionListener
                public void onCompletion(IMediaPlayer iMediaPlayer) {
                    onCompletionListener.onCompletion(MediaPlayerProxy.this);
                }
            });
        } else {
            this.mBackEndMediaPlayer.setOnCompletionListener(null);
        }
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setOnErrorListener(final IMediaPlayer.OnErrorListener onErrorListener) {
        if (onErrorListener != null) {
            this.mBackEndMediaPlayer.setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: com.tencent.ijk.media.player.MediaPlayerProxy.6
                @Override // com.tencent.ijk.media.player.IMediaPlayer.OnErrorListener
                public boolean onError(IMediaPlayer iMediaPlayer, int i11, int i12) {
                    return onErrorListener.onError(MediaPlayerProxy.this, i11, i12);
                }
            });
        } else {
            this.mBackEndMediaPlayer.setOnErrorListener(null);
        }
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setOnHLSKeyErrorListener(final IMediaPlayer.OnHLSKeyErrorListener onHLSKeyErrorListener) {
        if (onHLSKeyErrorListener != null) {
            this.mBackEndMediaPlayer.setOnHLSKeyErrorListener(new IMediaPlayer.OnHLSKeyErrorListener() { // from class: com.tencent.ijk.media.player.MediaPlayerProxy.9
                @Override // com.tencent.ijk.media.player.IMediaPlayer.OnHLSKeyErrorListener
                public void onHLSKeyError(IMediaPlayer iMediaPlayer) {
                    onHLSKeyErrorListener.onHLSKeyError(MediaPlayerProxy.this);
                }
            });
        } else {
            this.mBackEndMediaPlayer.setOnHLSKeyErrorListener(null);
        }
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setOnHevcVideoDecoderErrorListener(final IMediaPlayer.OnHevcVideoDecoderErrorListener onHevcVideoDecoderErrorListener) {
        if (onHevcVideoDecoderErrorListener != null) {
            this.mBackEndMediaPlayer.setOnHevcVideoDecoderErrorListener(new IMediaPlayer.OnHevcVideoDecoderErrorListener() { // from class: com.tencent.ijk.media.player.MediaPlayerProxy.10
                @Override // com.tencent.ijk.media.player.IMediaPlayer.OnHevcVideoDecoderErrorListener
                public void onHevcVideoDecoderError(IMediaPlayer iMediaPlayer) {
                    onHevcVideoDecoderErrorListener.onHevcVideoDecoderError(MediaPlayerProxy.this);
                }
            });
        } else {
            this.mBackEndMediaPlayer.setOnHevcVideoDecoderErrorListener(null);
        }
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setOnInfoListener(final IMediaPlayer.OnInfoListener onInfoListener) {
        if (onInfoListener != null) {
            this.mBackEndMediaPlayer.setOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: com.tencent.ijk.media.player.MediaPlayerProxy.7
                @Override // com.tencent.ijk.media.player.IMediaPlayer.OnInfoListener
                public boolean onInfo(IMediaPlayer iMediaPlayer, int i11, int i12) {
                    return onInfoListener.onInfo(MediaPlayerProxy.this, i11, i12);
                }
            });
        } else {
            this.mBackEndMediaPlayer.setOnInfoListener(null);
        }
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setOnPreparedListener(final IMediaPlayer.OnPreparedListener onPreparedListener) {
        if (onPreparedListener != null) {
            this.mBackEndMediaPlayer.setOnPreparedListener(new IMediaPlayer.OnPreparedListener() { // from class: com.tencent.ijk.media.player.MediaPlayerProxy.1
                @Override // com.tencent.ijk.media.player.IMediaPlayer.OnPreparedListener
                public void onPrepared(IMediaPlayer iMediaPlayer) {
                    onPreparedListener.onPrepared(MediaPlayerProxy.this);
                }
            });
        } else {
            this.mBackEndMediaPlayer.setOnPreparedListener(null);
        }
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setOnSeekCompleteListener(final IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        if (onSeekCompleteListener != null) {
            this.mBackEndMediaPlayer.setOnSeekCompleteListener(new IMediaPlayer.OnSeekCompleteListener() { // from class: com.tencent.ijk.media.player.MediaPlayerProxy.4
                @Override // com.tencent.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
                public void onSeekComplete(IMediaPlayer iMediaPlayer) {
                    onSeekCompleteListener.onSeekComplete(MediaPlayerProxy.this);
                }
            });
        } else {
            this.mBackEndMediaPlayer.setOnSeekCompleteListener(null);
        }
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setOnTimedTextListener(final IMediaPlayer.OnTimedTextListener onTimedTextListener) {
        if (onTimedTextListener != null) {
            this.mBackEndMediaPlayer.setOnTimedTextListener(new IMediaPlayer.OnTimedTextListener() { // from class: com.tencent.ijk.media.player.MediaPlayerProxy.8
                @Override // com.tencent.ijk.media.player.IMediaPlayer.OnTimedTextListener
                public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
                    onTimedTextListener.onTimedText(MediaPlayerProxy.this, ijkTimedText);
                }
            });
        } else {
            this.mBackEndMediaPlayer.setOnTimedTextListener(null);
        }
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setOnVideoDecoderErrorListener(final IMediaPlayer.OnVideoDecoderErrorListener onVideoDecoderErrorListener) {
        if (onVideoDecoderErrorListener != null) {
            this.mBackEndMediaPlayer.setOnVideoDecoderErrorListener(new IMediaPlayer.OnVideoDecoderErrorListener() { // from class: com.tencent.ijk.media.player.MediaPlayerProxy.11
                @Override // com.tencent.ijk.media.player.IMediaPlayer.OnVideoDecoderErrorListener
                public void onVideoDecoderError(IMediaPlayer iMediaPlayer) {
                    onVideoDecoderErrorListener.onVideoDecoderError(MediaPlayerProxy.this);
                }
            });
        } else {
            this.mBackEndMediaPlayer.setOnVideoDecoderErrorListener(null);
        }
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setOnVideoSizeChangedListener(final IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        if (onVideoSizeChangedListener != null) {
            this.mBackEndMediaPlayer.setOnVideoSizeChangedListener(new IMediaPlayer.OnVideoSizeChangedListener() { // from class: com.tencent.ijk.media.player.MediaPlayerProxy.5
                @Override // com.tencent.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
                public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i11, int i12, int i13, int i14) {
                    onVideoSizeChangedListener.onVideoSizeChanged(MediaPlayerProxy.this, i11, i12, i13, i14);
                }
            });
        } else {
            this.mBackEndMediaPlayer.setOnVideoSizeChangedListener(null);
        }
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setRate(float f11) {
        this.mBackEndMediaPlayer.setRate(f11);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setScreenOnWhilePlaying(boolean z11) {
        this.mBackEndMediaPlayer.setScreenOnWhilePlaying(z11);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    @TargetApi(14)
    public void setSurface(Surface surface) {
        this.mBackEndMediaPlayer.setSurface(surface);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setVolume(float f11, float f12) {
        this.mBackEndMediaPlayer.setVolume(f11, f12);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setWakeMode(Context context, int i11) {
        this.mBackEndMediaPlayer.setWakeMode(context, i11);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void start() throws IllegalStateException {
        this.mBackEndMediaPlayer.start();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void stop() throws IllegalStateException {
        this.mBackEndMediaPlayer.stop();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void unpublishAudioToNetwork() {
        this.mBackEndMediaPlayer.unpublishAudioToNetwork();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    @TargetApi(14)
    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        this.mBackEndMediaPlayer.setDataSource(context, uri, map);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setDataSource(FileDescriptor fileDescriptor) throws IOException, IllegalArgumentException, IllegalStateException {
        this.mBackEndMediaPlayer.setDataSource(fileDescriptor);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setDataSource(String str) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        this.mBackEndMediaPlayer.setDataSource(str);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setDataSource(IMediaDataSource iMediaDataSource) {
        this.mBackEndMediaPlayer.setDataSource(iMediaDataSource);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setLogEnabled(boolean z11) {
    }
}
