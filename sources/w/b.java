package w;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b extends com.google.zxing.e {

    /* renamed from: c, reason: collision with root package name */
    public byte[] f94426c;

    public b(Bitmap bitmap) {
        super(bitmap.getWidth(), bitmap.getHeight());
        int width = bitmap.getWidth() * bitmap.getHeight();
        int[] iArr = new int[width];
        this.f94426c = new byte[bitmap.getWidth() * bitmap.getHeight()];
        bitmap.getPixels(iArr, 0, e(), 0, 0, e(), b());
        for (int i11 = 0; i11 < width; i11++) {
            this.f94426c[i11] = (byte) iArr[i11];
        }
    }

    @Override // com.google.zxing.e
    public byte[] c() {
        return this.f94426c;
    }

    @Override // com.google.zxing.e
    public byte[] d(int y11, byte[] row) {
        System.arraycopy(this.f94426c, y11 * e(), row, 0, e());
        return row;
    }
}
