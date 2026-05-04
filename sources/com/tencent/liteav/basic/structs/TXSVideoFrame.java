package com.tencent.liteav.basic.structs;

import android.opengl.GLES20;
import com.badlogic.gdx.graphics.f;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class TXSVideoFrame {
    public ByteBuffer buffer;
    public byte[] data;
    public Object eglContext;
    public int frameType;
    public int height;
    public long pts;
    public int rotation;
    public int textureId;
    public int width;

    private native void nativeLoadArrayFromBuffer(byte[] bArr, int i11);

    private native void nativeLoadArrayFromGL(byte[] bArr, int i11, int i12);

    private native void nativeLoadBufferFromGL(int i11, int i12);

    private native void nativeLoadNV21BufferFromI420Buffer(int i11, int i12);

    public byte[] I420toNV21(byte[] bArr, byte[] bArr2, int i11, int i12) {
        if (bArr2 == null) {
            bArr2 = new byte[bArr.length];
        }
        int i13 = i11 * i12;
        int i14 = (i13 / 4) + i13;
        System.arraycopy(bArr, 0, bArr2, 0, i13);
        int i15 = i13;
        int i16 = i14;
        while (i13 < i14) {
            bArr2[i15] = bArr[i16];
            bArr2[i15 + 1] = bArr[i13];
            i13++;
            i16++;
            i15 += 2;
        }
        return bArr2;
    }

    public void finalize() throws Throwable {
        release();
        super.finalize();
    }

    public void loadNV21BufferFromI420Buffer() {
        nativeLoadNV21BufferFromI420Buffer(this.width, this.height);
    }

    public void loadYUVArray(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            int i11 = this.width;
            int i12 = this.height;
            if (length < ((i11 * i12) * 3) / 2) {
                return;
            }
            if (this.buffer == null) {
                GLES20.glReadPixels(0, 0, i11, (i12 * 3) / 8, 6408, f.f11673u1, ByteBuffer.wrap(bArr));
            } else {
                nativeLoadArrayFromBuffer(bArr, ((i11 * i12) * 3) / 2);
            }
        }
    }

    public void loadYUVBufferFromGL() {
        nativeLoadBufferFromGL(this.width, this.height);
    }

    public native void nativeClone(ByteBuffer byteBuffer);

    public native void release();

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public TXSVideoFrame m5636clone() {
        TXSVideoFrame tXSVideoFrame = new TXSVideoFrame();
        tXSVideoFrame.width = this.width;
        tXSVideoFrame.height = this.height;
        tXSVideoFrame.frameType = this.frameType;
        tXSVideoFrame.rotation = this.rotation;
        tXSVideoFrame.pts = this.pts;
        tXSVideoFrame.data = this.data;
        tXSVideoFrame.textureId = this.textureId;
        tXSVideoFrame.eglContext = this.eglContext;
        tXSVideoFrame.nativeClone(this.buffer);
        return tXSVideoFrame;
    }
}
