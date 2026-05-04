package com.igexin.push.core.i.a;

import android.content.Context;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f38187a = "BufferGifDecoder";

    /* renamed from: b, reason: collision with root package name */
    private final Context f38188b;

    /* renamed from: d, reason: collision with root package name */
    private final c f38190d = new c();

    /* renamed from: c, reason: collision with root package name */
    private final j f38189c = new j();

    public a(Context context) {
        this.f38188b = context.getApplicationContext();
    }

    private static int a(i iVar, int i11, int i12) {
        int min = Math.min(iVar.f38258i / i12, iVar.f38257h / i11);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        com.igexin.c.a.c.a.b("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i11 + "x" + i12 + "], actual dimens: [" + iVar.f38257h + "x" + iVar.f38258i + "]");
        return max;
    }

    public final f a(ByteBuffer byteBuffer, int i11, int i12) {
        j a11 = this.f38189c.a(byteBuffer);
        f fVar = null;
        try {
            i b11 = a11.b();
            if (b11.f38254e > 0 && b11.f38253d == 0) {
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                int min = Math.min(b11.f38258i / i12, b11.f38257h / i11);
                int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
                com.igexin.c.a.c.a.b("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i11 + "x" + i12 + "], actual dimens: [" + b11.f38257h + "x" + b11.f38258i + "]");
                n nVar = new n(this.f38190d, b11, byteBuffer, max);
                nVar.a(config);
                nVar.e();
                Bitmap n11 = nVar.n();
                if (n11 != null) {
                    fVar = new f(new e(nVar, n11));
                }
            }
            return fVar;
        } catch (Throwable th2) {
            try {
                com.igexin.c.a.c.a.a(th2);
                return null;
            } finally {
                a11.a();
            }
        }
    }

    private f a(ByteBuffer byteBuffer, int i11, int i12, j jVar) {
        i b11 = jVar.b();
        if (b11.f38254e <= 0 || b11.f38253d != 0) {
            return null;
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int min = Math.min(b11.f38258i / i12, b11.f38257h / i11);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        com.igexin.c.a.c.a.b("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i11 + "x" + i12 + "], actual dimens: [" + b11.f38257h + "x" + b11.f38258i + "]");
        n nVar = new n(this.f38190d, b11, byteBuffer, max);
        nVar.a(config);
        nVar.e();
        Bitmap n11 = nVar.n();
        if (n11 == null) {
            return null;
        }
        return new f(new e(nVar, n11));
    }

    private f a(byte[] bArr, int i11, int i12) {
        return a(ByteBuffer.wrap(bArr), i11, i12);
    }
}
