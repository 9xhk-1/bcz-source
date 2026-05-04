package com.tencent.liteav.videodecoder;

import android.view.Surface;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public interface b {
    int GetDecodeCost();

    int config(Surface surface);

    void decode(TXSNALPacket tXSNALPacket);

    void enableLimitDecCache(boolean z11);

    void setListener(g gVar);

    void setNotifyListener(WeakReference<com.tencent.liteav.basic.b.b> weakReference);

    int start(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z11, boolean z12);

    void stop();
}
