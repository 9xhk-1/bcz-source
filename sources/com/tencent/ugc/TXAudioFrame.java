package com.tencent.ugc;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TXAudioFrame {
    private ByteBuffer mByteBuffer;
    private int mLength;

    public ByteBuffer getByteBuffer() {
        return this.mByteBuffer;
    }

    public int getLength() {
        return this.mLength;
    }

    public void setByteBuffer(ByteBuffer byteBuffer) {
        this.mByteBuffer = byteBuffer;
    }

    public void setLength(int i11) {
        this.mLength = i11;
    }
}
