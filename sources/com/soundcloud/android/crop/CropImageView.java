package com.soundcloud.android.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import com.soundcloud.android.crop.ImageViewTouchBase;
import com.soundcloud.android.crop.e;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class CropImageView extends ImageViewTouchBase {

    /* renamed from: m, reason: collision with root package name */
    public ArrayList<e> f41634m;

    /* renamed from: n, reason: collision with root package name */
    public e f41635n;

    /* renamed from: o, reason: collision with root package name */
    public Context f41636o;

    /* renamed from: p, reason: collision with root package name */
    public float f41637p;

    /* renamed from: q, reason: collision with root package name */
    public float f41638q;

    /* renamed from: r, reason: collision with root package name */
    public int f41639r;

    /* renamed from: s, reason: collision with root package name */
    public int f41640s;

    public CropImageView(Context context) {
        super(context);
        this.f41634m = new ArrayList<>();
    }

    @Override // com.soundcloud.android.crop.ImageViewTouchBase
    public /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    @Override // com.soundcloud.android.crop.ImageViewTouchBase
    public /* bridge */ /* synthetic */ Matrix getUnrotatedMatrix() {
        return super.getUnrotatedMatrix();
    }

    @Override // com.soundcloud.android.crop.ImageViewTouchBase
    public void k(float deltaX, float deltaY) {
        super.k(deltaX, deltaY);
        Iterator<e> it = this.f41634m.iterator();
        while (it.hasNext()) {
            e next = it.next();
            next.f41694c.postTranslate(deltaX, deltaY);
            next.n();
        }
    }

    @Override // com.soundcloud.android.crop.ImageViewTouchBase
    public /* bridge */ /* synthetic */ void m(final Bitmap bitmap, final boolean resetSupp) {
        super.m(bitmap, resetSupp);
    }

    @Override // com.soundcloud.android.crop.ImageViewTouchBase
    public /* bridge */ /* synthetic */ void n(final h bitmap, final boolean resetSupp) {
        super.n(bitmap, resetSupp);
    }

    @Override // com.soundcloud.android.crop.ImageViewTouchBase
    public void o() {
        super.o();
        Iterator<e> it = this.f41634m.iterator();
        while (it.hasNext()) {
            e next = it.next();
            next.f41694c.set(getUnrotatedMatrix());
            next.n();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        Iterator<e> it = this.f41634m.iterator();
        while (it.hasNext()) {
            it.next().c(canvas);
        }
    }

    @Override // com.soundcloud.android.crop.ImageViewTouchBase, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyDown(int keyCode, KeyEvent event) {
        return super.onKeyDown(keyCode, event);
    }

    @Override // com.soundcloud.android.crop.ImageViewTouchBase, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyUp(int keyCode, KeyEvent event) {
        return super.onKeyUp(keyCode, event);
    }

    @Override // com.soundcloud.android.crop.ImageViewTouchBase, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (this.f41646e.a() != null) {
            Iterator<e> it = this.f41634m.iterator();
            while (it.hasNext()) {
                e next = it.next();
                next.f41694c.set(getUnrotatedMatrix());
                next.n();
                if (next.l()) {
                    w(next);
                }
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent event) {
        if (((CropImageActivity) this.f41636o).c1()) {
            return false;
        }
        int action = event.getAction();
        if (action == 0) {
            Iterator<e> it = this.f41634m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                e next = it.next();
                int h11 = next.h(event.getX(), event.getY());
                if (h11 != 1) {
                    this.f41639r = h11;
                    this.f41635n = next;
                    this.f41637p = event.getX();
                    this.f41638q = event.getY();
                    this.f41640s = event.getPointerId(event.getActionIndex());
                    this.f41635n.r(h11 == 32 ? e.b.Move : e.b.Grow);
                }
            }
        } else if (action == 1) {
            e eVar = this.f41635n;
            if (eVar != null) {
                w(eVar);
                this.f41635n.r(e.b.None);
            }
            this.f41635n = null;
            b();
        } else if (action == 2) {
            if (this.f41635n != null && event.getPointerId(event.getActionIndex()) == this.f41640s) {
                this.f41635n.k(this.f41639r, event.getX() - this.f41637p, event.getY() - this.f41638q);
                this.f41637p = event.getX();
                this.f41638q = event.getY();
            }
            if (getScale() == 1.0f) {
                b();
            }
        }
        return true;
    }

    @Override // com.soundcloud.android.crop.ImageViewTouchBase
    public void q() {
        super.q();
        Iterator<e> it = this.f41634m.iterator();
        while (it.hasNext()) {
            e next = it.next();
            next.f41694c.set(getUnrotatedMatrix());
            next.n();
        }
    }

    @Override // com.soundcloud.android.crop.ImageViewTouchBase, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public /* bridge */ /* synthetic */ void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
    }

    @Override // com.soundcloud.android.crop.ImageViewTouchBase
    public /* bridge */ /* synthetic */ void setRecycler(ImageViewTouchBase.c recycler) {
        super.setRecycler(recycler);
    }

    @Override // com.soundcloud.android.crop.ImageViewTouchBase
    public void t(float scale, float centerX, float centerY) {
        super.t(scale, centerX, centerY);
        Iterator<e> it = this.f41634m.iterator();
        while (it.hasNext()) {
            e next = it.next();
            next.f41694c.set(getUnrotatedMatrix());
            next.n();
        }
    }

    public void v(e hv2) {
        this.f41634m.add(hv2);
        invalidate();
    }

    public final void w(e hv2) {
        Rect rect = hv2.f41693b;
        float max = Math.max(1.0f, Math.min((getWidth() / rect.width()) * 0.6f, (getHeight() / rect.height()) * 0.6f) * getScale());
        if (Math.abs(max - getScale()) / max > 0.1d) {
            float[] fArr = {hv2.f41692a.centerX(), hv2.f41692a.centerY()};
            getUnrotatedMatrix().mapPoints(fArr);
            u(max, fArr[0], fArr[1], 300.0f);
        }
        x(hv2);
    }

    public final void x(e hv2) {
        Rect rect = hv2.f41693b;
        int max = Math.max(0, getLeft() - rect.left);
        int min = Math.min(0, getRight() - rect.right);
        int max2 = Math.max(0, getTop() - rect.top);
        int min2 = Math.min(0, getBottom() - rect.bottom);
        if (max == 0) {
            max = min;
        }
        if (max2 == 0) {
            max2 = min2;
        }
        if (max == 0 && max2 == 0) {
            return;
        }
        j(max, max2);
    }

    public CropImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f41634m = new ArrayList<>();
    }

    public CropImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f41634m = new ArrayList<>();
    }
}
