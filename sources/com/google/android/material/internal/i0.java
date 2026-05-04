package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class i0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public a f31594a;

    public i0(Context context, ViewGroup viewGroup, View view) {
        this.f31594a = new a(context, viewGroup, view, this);
    }

    public static i0 e(View view) {
        ViewGroup l11 = m0.l(view);
        if (l11 == null) {
            return null;
        }
        int childCount = l11.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = l11.getChildAt(i11);
            if (childAt instanceof a) {
                return ((a) childAt).f31599d;
            }
        }
        return new f0(l11.getContext(), l11, view);
    }

    @Override // com.google.android.material.internal.k0
    public void a(@NonNull Drawable drawable) {
        this.f31594a.g(drawable);
    }

    @Override // com.google.android.material.internal.k0
    public void b(@NonNull Drawable drawable) {
        this.f31594a.a(drawable);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @SuppressLint({"ViewConstructor", "PrivateApi"})
    public static class a extends ViewGroup {

        /* renamed from: f, reason: collision with root package name */
        public static Method f31595f;

        /* renamed from: a, reason: collision with root package name */
        public ViewGroup f31596a;

        /* renamed from: b, reason: collision with root package name */
        public View f31597b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList<Drawable> f31598c;

        /* renamed from: d, reason: collision with root package name */
        public i0 f31599d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f31600e;

        static {
            try {
                Class cls = Integer.TYPE;
                f31595f = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        public a(Context context, ViewGroup viewGroup, View view, i0 i0Var) {
            super(context);
            this.f31598c = null;
            this.f31596a = viewGroup;
            this.f31597b = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f31599d = i0Var;
        }

        public void a(Drawable drawable) {
            c();
            if (this.f31598c == null) {
                this.f31598c = new ArrayList<>();
            }
            if (this.f31598c.contains(drawable)) {
                return;
            }
            this.f31598c.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        public void b(View view) {
            c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f31596a && viewGroup.getParent() != null && ViewCompat.isAttachedToWindow(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f31596a.getLocationOnScreen(iArr2);
                    ViewCompat.offsetLeftAndRight(view, iArr[0] - iArr2[0]);
                    ViewCompat.offsetTopAndBottom(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        public final void c() {
            if (this.f31600e) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        public final void d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f31598c;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f31600e = true;
                    this.f31596a.removeView(this);
                }
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            this.f31596a.getLocationOnScreen(new int[2]);
            this.f31597b.getLocationOnScreen(new int[2]);
            canvas.translate(r0[0] - r1[0], r0[1] - r1[1]);
            canvas.clipRect(new Rect(0, 0, this.f31597b.getWidth(), this.f31597b.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f31598c;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f31598c.get(i11).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public final void e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f31596a.getLocationOnScreen(iArr2);
            this.f31597b.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ViewParent f(int i11, int i12, Rect rect) {
            if (this.f31596a == null || f31595f == null) {
                return null;
            }
            try {
                e(new int[2]);
                f31595f.invoke(this.f31596a, Integer.valueOf(i11), Integer.valueOf(i12), rect);
                return null;
            } catch (IllegalAccessException e11) {
                e11.printStackTrace();
                return null;
            } catch (InvocationTargetException e12) {
                e12.printStackTrace();
                return null;
            }
        }

        public void g(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f31598c;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                d();
            }
        }

        public void h(View view) {
            super.removeView(view);
            d();
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f31596a == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f31596a == null) {
                invalidate(rect);
                return null;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            int[] iArr2 = new int[2];
            e(iArr2);
            rect.offset(iArr2[0], iArr2[1]);
            return super.invalidateChildInParent(iArr, rect);
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@NonNull Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.View
        public boolean verifyDrawable(@NonNull Drawable drawable) {
            if (super.verifyDrawable(drawable)) {
                return true;
            }
            ArrayList<Drawable> arrayList = this.f31598c;
            return arrayList != null && arrayList.contains(drawable);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        }
    }
}
