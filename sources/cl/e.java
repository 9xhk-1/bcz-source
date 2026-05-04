package cl;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class e<T> implements p<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f8732a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8733b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public bl.d f8734c;

    public e() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // cl.p
    @Nullable
    public final bl.d f() {
        return this.f8734c;
    }

    @Override // cl.p
    public final void j(@NonNull o oVar) {
        oVar.e(this.f8732a, this.f8733b);
    }

    @Override // cl.p
    public final void k(@Nullable bl.d dVar) {
        this.f8734c = dVar;
    }

    public e(int i11, int i12) {
        if (fl.o.x(i11, i12)) {
            this.f8732a = i11;
            this.f8733b = i12;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i11 + " and height: " + i12);
    }

    @Override // yk.l
    public void onDestroy() {
    }

    @Override // yk.l
    public void onStart() {
    }

    @Override // yk.l
    public void onStop() {
    }

    @Override // cl.p
    public final void g(@NonNull o oVar) {
    }

    @Override // cl.p
    public void l(@Nullable Drawable drawable) {
    }

    @Override // cl.p
    public void m(@Nullable Drawable drawable) {
    }
}
