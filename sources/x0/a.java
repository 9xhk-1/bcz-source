package x0;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.NonNull;
import j1.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a extends Paint {
    public a() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i11) {
        if (Build.VERSION.SDK_INT >= 30) {
            super.setAlpha(i.d(i11, 0, 255));
        } else {
            setColor((i.d(i11, 0, 255) << 24) | (getColor() & 16777215));
        }
    }

    public a(int i11) {
        super(i11);
    }

    public a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public a(int i11, PorterDuff.Mode mode) {
        super(i11);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setTextLocales(@NonNull LocaleList localeList) {
    }
}
