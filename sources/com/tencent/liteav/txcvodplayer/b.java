package com.tencent.liteav.txcvodplayer;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.tencent.ijk.media.player.IMediaPlayer;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import com.tencent.ijk.media.player.MediaPlayerProxy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private IMediaPlayer f44212a;

    /* renamed from: b, reason: collision with root package name */
    private Handler f44213b = new Handler() { // from class: com.tencent.liteav.txcvodplayer.b.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IMediaPlayer internalMediaPlayer;
            if (message.what == 1 && b.this.f44212a != null) {
                IjkMediaPlayer ijkMediaPlayer = b.this.f44212a instanceof IjkMediaPlayer ? (IjkMediaPlayer) b.this.f44212a : ((b.this.f44212a instanceof MediaPlayerProxy) && (internalMediaPlayer = ((MediaPlayerProxy) b.this.f44212a).getInternalMediaPlayer()) != null && (internalMediaPlayer instanceof IjkMediaPlayer)) ? (IjkMediaPlayer) internalMediaPlayer : null;
                if (ijkMediaPlayer == null) {
                    return;
                }
                float rate = ijkMediaPlayer.getRate();
                if (Math.abs(ijkMediaPlayer.getAVDiff()) <= 0.5f || rate <= 1.0f) {
                    b.this.f44213b.removeMessages(1);
                    b.this.f44213b.sendEmptyMessageDelayed(1, 500L);
                    return;
                }
                double d11 = rate;
                float min = (float) (d11 - Math.min((d11 - 1.0d) / 2.0d, 0.25d));
                ijkMediaPlayer.setRate(min);
                Log.w("RateHelper", "downside rate " + min);
                b.this.f44213b.removeMessages(1);
                b.this.f44213b.sendEmptyMessageDelayed(1, 3000L);
            }
        }
    };

    public void a(IMediaPlayer iMediaPlayer) {
        this.f44212a = iMediaPlayer;
        if (iMediaPlayer != null) {
            this.f44213b.sendEmptyMessageDelayed(1, 500L);
        } else {
            this.f44213b.removeMessages(1);
        }
    }
}
