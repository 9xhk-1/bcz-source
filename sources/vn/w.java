package vn;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(22)
/* loaded from: classes7.dex */
public class w extends u {

    /* renamed from: f, reason: collision with root package name */
    public boolean f94246f = false;

    /* renamed from: g, reason: collision with root package name */
    public float f94247g = 0.0f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            w wVar = w.this;
            if (wVar.f94243c == null || wVar.f94244d.isEmpty()) {
                return;
            }
            w wVar2 = w.this;
            RectF rectF = wVar2.f94244d;
            outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, wVar2.f94247g);
        }
    }

    public w(@NonNull View view) {
        o(view);
    }

    @DoNotInline
    private void o(View view) {
        view.setOutlineProvider(new a());
    }

    public static boolean r(p pVar) {
        return (pVar.q() instanceof o) && (pVar.s() instanceof o) && (pVar.i() instanceof o) && (pVar.k() instanceof o);
    }

    @Override // vn.u
    public void b(@NonNull View view) {
        this.f94247g = n();
        this.f94246f = p() || q();
        view.setClipToOutline(!j());
        if (j()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // vn.u
    public boolean j() {
        return !this.f94246f || this.f94241a;
    }

    @VisibleForTesting
    public float m() {
        return this.f94247g;
    }

    public final float n() {
        RectF rectF;
        p pVar = this.f94243c;
        if (pVar == null || (rectF = this.f94244d) == null) {
            return 0.0f;
        }
        return pVar.f94160f.a(rectF);
    }

    public final boolean p() {
        p pVar;
        if (this.f94244d.isEmpty() || (pVar = this.f94243c) == null) {
            return false;
        }
        return pVar.u(this.f94244d);
    }

    public final boolean q() {
        p pVar;
        if (!this.f94244d.isEmpty() && (pVar = this.f94243c) != null && this.f94242b && !pVar.u(this.f94244d) && r(this.f94243c)) {
            float a11 = this.f94243c.r().a(this.f94244d);
            float a12 = this.f94243c.t().a(this.f94244d);
            float a13 = this.f94243c.j().a(this.f94244d);
            float a14 = this.f94243c.l().a(this.f94244d);
            if (a11 == 0.0f && a13 == 0.0f && a12 == a14) {
                RectF rectF = this.f94244d;
                rectF.set(rectF.left - a12, rectF.top, rectF.right, rectF.bottom);
                this.f94247g = a12;
                return true;
            }
            if (a11 == 0.0f && a12 == 0.0f && a13 == a14) {
                RectF rectF2 = this.f94244d;
                rectF2.set(rectF2.left, rectF2.top - a13, rectF2.right, rectF2.bottom);
                this.f94247g = a13;
                return true;
            }
            if (a12 == 0.0f && a14 == 0.0f && a11 == a13) {
                RectF rectF3 = this.f94244d;
                rectF3.set(rectF3.left, rectF3.top, rectF3.right + a11, rectF3.bottom);
                this.f94247g = a11;
                return true;
            }
            if (a13 == 0.0f && a14 == 0.0f && a11 == a12) {
                RectF rectF4 = this.f94244d;
                rectF4.set(rectF4.left, rectF4.top, rectF4.right, rectF4.bottom + a11);
                this.f94247g = a11;
                return true;
            }
        }
        return false;
    }
}
