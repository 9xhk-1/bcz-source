package lk;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class f implements e {
    @Override // lk.e
    public long a() {
        return 0L;
    }

    @Override // lk.e
    public void e(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // lk.e
    @NonNull
    public Bitmap f(int i11, int i12, Bitmap.Config config) {
        return Bitmap.createBitmap(i11, i12, config);
    }

    @Override // lk.e
    @NonNull
    public Bitmap g(int i11, int i12, Bitmap.Config config) {
        return f(i11, i12, config);
    }

    @Override // lk.e
    public void c() {
    }

    @Override // lk.e
    public void b(int i11) {
    }

    @Override // lk.e
    public void d(float f11) {
    }
}
