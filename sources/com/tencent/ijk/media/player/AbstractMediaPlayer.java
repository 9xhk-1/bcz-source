package com.tencent.ijk.media.player;

import com.tencent.ijk.media.player.IMediaPlayer;
import com.tencent.ijk.media.player.misc.IMediaDataSource;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class AbstractMediaPlayer implements IMediaPlayer {
    private IMediaPlayer.OnBufferingUpdateListener mOnBufferingUpdateListener;
    private IMediaPlayer.OnCompletionListener mOnCompletionListener;
    private IMediaPlayer.OnErrorListener mOnErrorListener;
    private IMediaPlayer.OnHLSKeyErrorListener mOnHLSKeyErrorListener;
    private IMediaPlayer.OnHevcVideoDecoderErrorListener mOnHevcVideoDecoderErrorListener;
    private IMediaPlayer.OnInfoListener mOnInfoListener;
    private IMediaPlayer.OnPreparedListener mOnPreparedListener;
    private IMediaPlayer.OnSeekCompleteListener mOnSeekCompleteListener;
    private IMediaPlayer.OnTimedTextListener mOnTimedTextListener;
    private IMediaPlayer.OnVideoDecoderErrorListener mOnVideoDecoderErrorListener;
    private IMediaPlayer.OnVideoSizeChangedListener mOnVideoSizeChangedListener;

    public final void notifyHLSKeyError() {
        IMediaPlayer.OnHLSKeyErrorListener onHLSKeyErrorListener = this.mOnHLSKeyErrorListener;
        if (onHLSKeyErrorListener != null) {
            onHLSKeyErrorListener.onHLSKeyError(this);
        }
    }

    public final void notifyHevcVideoDecoderError() {
        IMediaPlayer.OnHevcVideoDecoderErrorListener onHevcVideoDecoderErrorListener = this.mOnHevcVideoDecoderErrorListener;
        if (onHevcVideoDecoderErrorListener != null) {
            onHevcVideoDecoderErrorListener.onHevcVideoDecoderError(this);
        }
    }

    public final void notifyOnBufferingUpdate(int i11) {
        IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener = this.mOnBufferingUpdateListener;
        if (onBufferingUpdateListener != null) {
            onBufferingUpdateListener.onBufferingUpdate(this, i11);
        }
    }

    public final void notifyOnCompletion() {
        IMediaPlayer.OnCompletionListener onCompletionListener = this.mOnCompletionListener;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(this);
        }
    }

    public final boolean notifyOnError(int i11, int i12) {
        IMediaPlayer.OnErrorListener onErrorListener = this.mOnErrorListener;
        return onErrorListener != null && onErrorListener.onError(this, i11, i12);
    }

    public final boolean notifyOnInfo(int i11, int i12) {
        IMediaPlayer.OnInfoListener onInfoListener = this.mOnInfoListener;
        return onInfoListener != null && onInfoListener.onInfo(this, i11, i12);
    }

    public final void notifyOnPrepared() {
        IMediaPlayer.OnPreparedListener onPreparedListener = this.mOnPreparedListener;
        if (onPreparedListener != null) {
            onPreparedListener.onPrepared(this);
        }
    }

    public final void notifyOnSeekComplete() {
        IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener = this.mOnSeekCompleteListener;
        if (onSeekCompleteListener != null) {
            onSeekCompleteListener.onSeekComplete(this);
        }
    }

    public final void notifyOnTimedText(IjkTimedText ijkTimedText) {
        IMediaPlayer.OnTimedTextListener onTimedTextListener = this.mOnTimedTextListener;
        if (onTimedTextListener != null) {
            onTimedTextListener.onTimedText(this, ijkTimedText);
        }
    }

    public final void notifyOnVideoSizeChanged(int i11, int i12, int i13, int i14) {
        IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener = this.mOnVideoSizeChangedListener;
        if (onVideoSizeChangedListener != null) {
            onVideoSizeChangedListener.onVideoSizeChanged(this, i11, i12, i13, i14);
        }
    }

    public final void notifyVideoDecoderError() {
        IMediaPlayer.OnVideoDecoderErrorListener onVideoDecoderErrorListener = this.mOnVideoDecoderErrorListener;
        if (onVideoDecoderErrorListener != null) {
            onVideoDecoderErrorListener.onVideoDecoderError(this);
        }
    }

    public void resetListeners() {
        this.mOnPreparedListener = null;
        this.mOnBufferingUpdateListener = null;
        this.mOnCompletionListener = null;
        this.mOnSeekCompleteListener = null;
        this.mOnVideoSizeChangedListener = null;
        this.mOnErrorListener = null;
        this.mOnInfoListener = null;
        this.mOnTimedTextListener = null;
        this.mOnHLSKeyErrorListener = null;
        this.mOnHevcVideoDecoderErrorListener = null;
        this.mOnVideoDecoderErrorListener = null;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setDataSource(IMediaDataSource iMediaDataSource) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setOnBufferingUpdateListener(IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        this.mOnBufferingUpdateListener = onBufferingUpdateListener;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.mOnCompletionListener = onCompletionListener;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.mOnErrorListener = onErrorListener;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setOnHLSKeyErrorListener(IMediaPlayer.OnHLSKeyErrorListener onHLSKeyErrorListener) {
        this.mOnHLSKeyErrorListener = onHLSKeyErrorListener;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setOnHevcVideoDecoderErrorListener(IMediaPlayer.OnHevcVideoDecoderErrorListener onHevcVideoDecoderErrorListener) {
        this.mOnHevcVideoDecoderErrorListener = onHevcVideoDecoderErrorListener;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.mOnInfoListener = onInfoListener;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.mOnPreparedListener = onPreparedListener;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setOnSeekCompleteListener(IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        this.mOnSeekCompleteListener = onSeekCompleteListener;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setOnTimedTextListener(IMediaPlayer.OnTimedTextListener onTimedTextListener) {
        this.mOnTimedTextListener = onTimedTextListener;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setOnVideoDecoderErrorListener(IMediaPlayer.OnVideoDecoderErrorListener onVideoDecoderErrorListener) {
        this.mOnVideoDecoderErrorListener = onVideoDecoderErrorListener;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setOnVideoSizeChangedListener(IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        this.mOnVideoSizeChangedListener = onVideoSizeChangedListener;
    }
}
