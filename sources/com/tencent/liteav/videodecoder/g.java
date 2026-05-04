package com.tencent.liteav.videodecoder;

import com.tencent.liteav.basic.structs.TXSVideoFrame;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public interface g {
    void onDecodeFailed(int i11);

    void onDecodeFrame(TXSVideoFrame tXSVideoFrame, int i11, int i12, long j11, long j12, int i13);

    void onDecoderChange(String str, boolean z11);

    void onVideoSizeChange(int i11, int i12);
}
