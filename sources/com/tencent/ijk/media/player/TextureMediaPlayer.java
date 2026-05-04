package com.tencent.ijk.media.player;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@TargetApi(14)
/* loaded from: classes4.dex */
public class TextureMediaPlayer extends MediaPlayerProxy implements IMediaPlayer, ISurfaceTextureHolder {
    private IMediaPlayer mBackEndMediaPlayer;
    private boolean mReuseSurfaceTexture;
    private Surface mSurface;
    private SurfaceTexture mSurfaceTexture;
    private ISurfaceTextureHost mSurfaceTextureHost;

    public TextureMediaPlayer(IMediaPlayer iMediaPlayer) {
        super(iMediaPlayer);
        this.mBackEndMediaPlayer = iMediaPlayer;
    }

    public IMediaPlayer getBackEndMediaPlayer() {
        return this.mBackEndMediaPlayer;
    }

    @Override // com.tencent.ijk.media.player.MediaPlayerProxy, com.tencent.ijk.media.player.IMediaPlayer
    public int getBitrateIndex() {
        return this.mBackEndMediaPlayer.getBitrateIndex();
    }

    @Override // com.tencent.ijk.media.player.MediaPlayerProxy, com.tencent.ijk.media.player.IMediaPlayer
    public ArrayList<IjkBitrateItem> getSupportedBitrates() {
        return this.mBackEndMediaPlayer.getSupportedBitrates();
    }

    @Override // com.tencent.ijk.media.player.MediaPlayerProxy, com.tencent.ijk.media.player.IMediaPlayer
    public Surface getSurface() {
        return super.getSurface();
    }

    @Override // com.tencent.ijk.media.player.ISurfaceTextureHolder
    public SurfaceTexture getSurfaceTexture() {
        return this.mSurfaceTexture;
    }

    @Override // com.tencent.ijk.media.player.MediaPlayerProxy, com.tencent.ijk.media.player.IMediaPlayer
    public void release() {
        super.release();
        releaseSurfaceTexture();
    }

    public void releaseSurfaceTexture() {
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture == null || this.mReuseSurfaceTexture) {
            return;
        }
        ISurfaceTextureHost iSurfaceTextureHost = this.mSurfaceTextureHost;
        if (iSurfaceTextureHost != null) {
            iSurfaceTextureHost.releaseSurfaceTexture(surfaceTexture);
        } else {
            surfaceTexture.release();
        }
        this.mSurfaceTexture = null;
    }

    @Override // com.tencent.ijk.media.player.MediaPlayerProxy, com.tencent.ijk.media.player.IMediaPlayer
    public void reset() {
        super.reset();
        releaseSurfaceTexture();
    }

    @Override // com.tencent.ijk.media.player.MediaPlayerProxy, com.tencent.ijk.media.player.IMediaPlayer
    public void setBitrateIndex(int i11) {
        this.mBackEndMediaPlayer.setBitrateIndex(i11);
    }

    @Override // com.tencent.ijk.media.player.MediaPlayerProxy, com.tencent.ijk.media.player.IMediaPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
        if (this.mSurfaceTexture == null) {
            super.setDisplay(surfaceHolder);
        }
    }

    public void setReuseSurfaceTexture(boolean z11) {
        this.mReuseSurfaceTexture = z11;
    }

    @Override // com.tencent.ijk.media.player.MediaPlayerProxy, com.tencent.ijk.media.player.IMediaPlayer
    public void setSurface(Surface surface) {
        if (this.mSurfaceTexture == null) {
            super.setSurface(surface);
        }
        this.mSurface = surface;
    }

    @Override // com.tencent.ijk.media.player.ISurfaceTextureHolder
    public void setSurfaceTexture(SurfaceTexture surfaceTexture) {
        if (this.mSurfaceTexture == surfaceTexture) {
            return;
        }
        releaseSurfaceTexture();
        this.mSurfaceTexture = surfaceTexture;
        if (surfaceTexture == null) {
            this.mSurface = null;
            super.setSurface(null);
        } else {
            if (this.mSurface == null) {
                this.mSurface = new Surface(surfaceTexture);
            }
            super.setSurface(this.mSurface);
        }
    }

    @Override // com.tencent.ijk.media.player.ISurfaceTextureHolder
    public void setSurfaceTextureHost(ISurfaceTextureHost iSurfaceTextureHost) {
        this.mSurfaceTextureHost = iSurfaceTextureHost;
    }
}
