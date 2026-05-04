package sk;

import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c extends uk.h<BitmapDrawable> implements kk.q {

    /* renamed from: b, reason: collision with root package name */
    public final lk.e f88738b;

    public c(BitmapDrawable bitmapDrawable, lk.e eVar) {
        super(bitmapDrawable);
        this.f88738b = eVar;
    }

    @Override // kk.u
    @NonNull
    public Class<BitmapDrawable> a() {
        return BitmapDrawable.class;
    }

    @Override // kk.u
    public int getSize() {
        return fl.o.i(((BitmapDrawable) this.f92270a).getBitmap());
    }

    @Override // uk.h, kk.q
    public void initialize() {
        ((BitmapDrawable) this.f92270a).getBitmap().prepareToDraw();
    }

    @Override // kk.u
    public void recycle() {
        this.f88738b.e(((BitmapDrawable) this.f92270a).getBitmap());
    }
}
