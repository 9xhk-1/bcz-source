package com.tencent.liteav.muxer;

import android.content.Context;
import android.media.MediaFormat;
import com.tencent.liteav.basic.log.TXCLog;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private int f43643a;

    /* renamed from: b, reason: collision with root package name */
    private a f43644b;

    public c(Context context, int i11) {
        this.f43643a = 0;
        if (i11 == 0) {
            this.f43643a = 0;
            this.f43644b = new d();
            TXCLog.i("TXCMP4Muxer", "TXCMP4Muxer: use sw model ");
        } else if (i11 == 1) {
            this.f43643a = 1;
            this.f43644b = new b();
            TXCLog.i("TXCMP4Muxer", "TXCMP4Muxer: use hw model ");
        } else if (a(context)) {
            this.f43643a = 0;
            this.f43644b = new d();
            TXCLog.i("TXCMP4Muxer", "TXCMP4Muxer: use sw model ");
        } else {
            this.f43643a = 1;
            this.f43644b = new b();
            TXCLog.i("TXCMP4Muxer", "TXCMP4Muxer: use hw model ");
        }
    }

    public static boolean a(Context context) {
        com.tencent.liteav.basic.d.c.a().a(context);
        return com.tencent.liteav.basic.d.c.a().d() == 1;
    }

    @Override // com.tencent.liteav.muxer.a
    public void b(MediaFormat mediaFormat) {
        this.f43644b.b(mediaFormat);
    }

    @Override // com.tencent.liteav.muxer.a
    public boolean c() {
        return this.f43644b.c();
    }

    @Override // com.tencent.liteav.muxer.a
    public void b(byte[] bArr, int i11, int i12, long j11, int i13) {
        this.f43644b.b(bArr, i11, i12, j11, i13);
    }

    @Override // com.tencent.liteav.muxer.a
    public void a(MediaFormat mediaFormat) {
        this.f43644b.a(mediaFormat);
    }

    @Override // com.tencent.liteav.muxer.a
    public int b() {
        return this.f43644b.b();
    }

    @Override // com.tencent.liteav.muxer.a
    public void a(String str) {
        this.f43644b.a(str);
    }

    @Override // com.tencent.liteav.muxer.a
    public void a(byte[] bArr, int i11, int i12, long j11, int i13) {
        this.f43644b.a(bArr, i11, i12, j11, i13);
    }

    @Override // com.tencent.liteav.muxer.a
    public int a() {
        return this.f43644b.a();
    }
}
