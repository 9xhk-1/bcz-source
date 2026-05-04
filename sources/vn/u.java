package vn;

import an.a;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public abstract class u {

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public p f94243c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f94241a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f94242b = false;

    /* renamed from: d, reason: collision with root package name */
    public RectF f94244d = new RectF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f94245e = new Path();

    @NonNull
    public static u a(@NonNull View view) {
        return Build.VERSION.SDK_INT >= 33 ? new x(view) : new w(view);
    }

    public abstract void b(@NonNull View view);

    public boolean c() {
        return this.f94241a;
    }

    public final boolean d() {
        RectF rectF = this.f94244d;
        return rectF.left <= rectF.right && rectF.top <= rectF.bottom;
    }

    public void e(@NonNull Canvas canvas, @NonNull a.InterfaceC0022a interfaceC0022a) {
        if (!j() || this.f94245e.isEmpty()) {
            interfaceC0022a.a(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(this.f94245e);
        interfaceC0022a.a(canvas);
        canvas.restore();
    }

    public void f(@NonNull View view, @NonNull RectF rectF) {
        this.f94244d = rectF;
        k();
        b(view);
    }

    public void g(@NonNull View view, @NonNull p pVar) {
        this.f94243c = pVar;
        k();
        b(view);
    }

    public void h(@NonNull View view, boolean z11) {
        if (z11 != this.f94241a) {
            this.f94241a = z11;
            b(view);
        }
    }

    public void i(@NonNull View view, boolean z11) {
        this.f94242b = z11;
        b(view);
    }

    public abstract boolean j();

    public final void k() {
        if (!d() || this.f94243c == null) {
            return;
        }
        q.k().d(this.f94243c, 1.0f, this.f94244d, this.f94245e);
    }
}
