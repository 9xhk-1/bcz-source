package com.google.android.material.textfield;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import vn.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class h extends vn.k {

    @NonNull
    public b E;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends h {
        public Paint F;
        public int G;

        public c(@NonNull b bVar) {
            super(bVar);
        }

        public final Paint X0() {
            if (this.F == null) {
                Paint paint = new Paint(1);
                this.F = paint;
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                this.F.setColor(-1);
                this.F.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            return this.F;
        }

        public final void Y0(@NonNull Canvas canvas) {
            if (b1(getCallback())) {
                return;
            }
            canvas.restoreToCount(this.G);
        }

        public final void Z0(@NonNull Canvas canvas) {
            Drawable.Callback callback = getCallback();
            if (!b1(callback)) {
                a1(canvas);
                return;
            }
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        }

        public final void a1(@NonNull Canvas canvas) {
            this.G = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        }

        public final boolean b1(Drawable.Callback callback) {
            return callback instanceof View;
        }

        @Override // vn.k, android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
            Z0(canvas);
            super.draw(canvas);
            Y0(canvas);
        }

        @Override // vn.k
        public void t(@NonNull Canvas canvas) {
            super.t(canvas);
            canvas.drawRect(this.E.f32424w, X0());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @TargetApi(18)
    public static class d extends h {
        public d(@NonNull b bVar) {
            super(bVar);
        }

        @Override // vn.k
        public void t(@NonNull Canvas canvas) {
            if (this.E.f32424w.isEmpty()) {
                super.t(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.E.f32424w);
            } else {
                canvas.clipRect(this.E.f32424w, Region.Op.DIFFERENCE);
            }
            super.t(canvas);
            canvas.restore();
        }
    }

    public static h R0(@NonNull b bVar) {
        return new d(bVar);
    }

    public static h S0(@Nullable vn.p pVar) {
        if (pVar == null) {
            pVar = new vn.p();
        }
        return R0(new b(pVar, new RectF()));
    }

    public boolean T0() {
        return !this.E.f32424w.isEmpty();
    }

    public void U0() {
        V0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void V0(float f11, float f12, float f13, float f14) {
        if (f11 == this.E.f32424w.left && f12 == this.E.f32424w.top && f13 == this.E.f32424w.right && f14 == this.E.f32424w.bottom) {
            return;
        }
        this.E.f32424w.set(f11, f12, f13, f14);
        invalidateSelf();
    }

    public void W0(@NonNull RectF rectF) {
        V0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // vn.k, android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.E = new b(this.E);
        return this;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends k.d {

        /* renamed from: w, reason: collision with root package name */
        @NonNull
        public final RectF f32424w;

        @Override // vn.k.d, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            h R0 = h.R0(this);
            R0.invalidateSelf();
            return R0;
        }

        public b(@NonNull vn.p pVar, @NonNull RectF rectF) {
            super(pVar, null);
            this.f32424w = rectF;
        }

        public b(@NonNull b bVar) {
            super(bVar);
            this.f32424w = bVar.f32424w;
        }
    }

    public h(@NonNull b bVar) {
        super(bVar);
        this.E = bVar;
    }
}
