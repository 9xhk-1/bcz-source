package w;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import cn.hugo.android.scanner.CaptureActivity;
import com.google.zxing.DecodeHintType;
import com.google.zxing.h;
import com.jiongji.andriod.card.R;
import java.io.ByteArrayOutputStream;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class e extends Handler {

    /* renamed from: d, reason: collision with root package name */
    public static final String f94441d = "DecodeHandler";

    /* renamed from: a, reason: collision with root package name */
    public final CaptureActivity f94442a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.zxing.f f94443b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f94444c = true;

    public e(CaptureActivity activity, Map<DecodeHintType, Object> hints) {
        com.google.zxing.f fVar = new com.google.zxing.f();
        this.f94443b = fVar;
        fVar.e(hints);
        this.f94442a = activity;
    }

    public static void a(h source, Bundle bundle) {
        int[] m11 = source.m();
        int l11 = source.l();
        Bitmap createBitmap = Bitmap.createBitmap(m11, 0, l11, l11, source.k(), Bitmap.Config.ARGB_8888);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.JPEG, 50, byteArrayOutputStream);
        bundle.putByteArray(f.f94445e, byteArrayOutputStream.toByteArray());
        bundle.putFloat(f.f94446f, l11 / source.e());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(byte[] r10, int r11, int r12) {
        /*
            r9 = this;
            long r0 = java.lang.System.currentTimeMillis()
            int r2 = r10.length
            byte[] r2 = new byte[r2]
            r3 = 0
            r4 = r3
        L9:
            java.lang.String r5 = "DecodeHandler"
            if (r4 >= r12) goto L3f
            r6 = r3
        Le:
            if (r6 >= r11) goto L3c
            int r7 = r6 * r12
            int r7 = r7 + r12
            int r7 = r7 - r4
            int r7 = r7 + (-1)
            int r8 = r4 * r11
            int r8 = r8 + r6
            r8 = r10[r8]     // Catch: java.lang.Exception -> L20
            r2[r7] = r8     // Catch: java.lang.Exception -> L20
            int r6 = r6 + 1
            goto Le
        L20:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()
            int r10 = r10.length
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r10 = new java.lang.Object[]{r4, r10, r6, r7}
            java.lang.String r4 = "rotated data error: %s [len=%d, w=%d, h=%d]"
            qb.c.d(r5, r4, r10)
            goto L3f
        L3c:
            int r4 = r4 + 1
            goto L9
        L3f:
            cn.hugo.android.scanner.CaptureActivity r10 = r9.f94442a
            t.d r10 = r10.X0()
            com.google.zxing.h r10 = r10.a(r2, r12, r11)
            if (r10 == 0) goto L6d
            com.google.zxing.b r11 = new com.google.zxing.b
            kp.i r12 = new kp.i
            r12.<init>(r10)
            r11.<init>(r12)
            com.google.zxing.f r12 = r9.f94443b     // Catch: java.lang.Throwable -> L61 com.google.zxing.ReaderException -> L68
            com.google.zxing.k r11 = r12.d(r11)     // Catch: java.lang.Throwable -> L61 com.google.zxing.ReaderException -> L68
            com.google.zxing.f r12 = r9.f94443b
            r12.reset()
            goto L6e
        L61:
            r10 = move-exception
            com.google.zxing.f r11 = r9.f94443b
            r11.reset()
            throw r10
        L68:
            com.google.zxing.f r11 = r9.f94443b
            r11.reset()
        L6d:
            r11 = 0
        L6e:
            cn.hugo.android.scanner.CaptureActivity r12 = r9.f94442a
            android.os.Handler r12 = r12.Y0()
            if (r11 == 0) goto Lae
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Found barcode in "
            r2.append(r4)
            long r6 = r6 - r0
            r2.append(r6)
            java.lang.String r0 = " ms"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.Object[] r1 = new java.lang.Object[r3]
            qb.c.b(r5, r0, r1)
            if (r12 == 0) goto Lba
            r0 = 2131362357(0x7f0a0235, float:1.8344492E38)
            android.os.Message r11 = android.os.Message.obtain(r12, r0, r11)
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>()
            a(r10, r12)
            r11.setData(r12)
            r11.sendToTarget()
            goto Lba
        Lae:
            if (r12 == 0) goto Lba
            r10 = 2131362356(0x7f0a0234, float:1.834449E38)
            android.os.Message r10 = android.os.Message.obtain(r12, r10)
            r10.sendToTarget()
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.e.b(byte[], int, int):void");
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (this.f94444c) {
            int i11 = message.what;
            if (i11 == R.id.decode) {
                b((byte[]) message.obj, message.arg1, message.arg2);
            } else {
                if (i11 != R.id.quit) {
                    return;
                }
                this.f94444c = false;
                Looper.myLooper().quit();
            }
        }
    }
}
