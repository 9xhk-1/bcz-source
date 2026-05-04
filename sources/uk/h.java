package uk;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import fl.m;
import kk.q;
import kk.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class h<T extends Drawable> implements u<T>, q {

    /* renamed from: a, reason: collision with root package name */
    public final T f92270a;

    public h(T t11) {
        this.f92270a = (T) m.e(t11);
    }

    @Override // kk.u
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final T get() {
        Drawable.ConstantState constantState = this.f92270a.getConstantState();
        return constantState == null ? this.f92270a : (T) constantState.newDrawable();
    }

    public void initialize() {
        T t11 = this.f92270a;
        if (t11 instanceof BitmapDrawable) {
            ((BitmapDrawable) t11).getBitmap().prepareToDraw();
        } else if (t11 instanceof wk.c) {
            ((wk.c) t11).e().prepareToDraw();
        }
    }
}
