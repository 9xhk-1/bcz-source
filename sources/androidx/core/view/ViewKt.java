package androidx.core.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.Px;
import androidx.exifinterface.media.ExifInterface;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,414:1\n37#1:415\n53#1:416\n326#1,4:420\n43#2,3:417\n*S KotlinDebug\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt\n*L\n68#1:415\n68#1:416\n310#1:420,4\n232#1:417,3\n*E\n"})
/* loaded from: classes2.dex */
public final class ViewKt {
    public static final void doOnAttach(@m80.k final View view, @m80.k final x00.l<? super View, yz.g2> lVar) {
        if (view.isAttachedToWindow()) {
            lVar.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.core.view.ViewKt$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@m80.k View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    lVar.invoke(view2);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@m80.k View view2) {
                }
            });
        }
    }

    public static final void doOnDetach(@m80.k final View view, @m80.k final x00.l<? super View, yz.g2> lVar) {
        if (view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.core.view.ViewKt$doOnDetach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@m80.k View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    lVar.invoke(view2);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@m80.k View view2) {
                }
            });
        } else {
            lVar.invoke(view);
        }
    }

    public static final void doOnLayout(@m80.k View view, @m80.k final x00.l<? super View, yz.g2> lVar) {
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.core.view.ViewKt$doOnLayout$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@m80.k View view2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                    view2.removeOnLayoutChangeListener(this);
                    x00.l.this.invoke(view2);
                }
            });
        } else {
            lVar.invoke(view);
        }
    }

    public static final void doOnNextLayout(@m80.k View view, @m80.k final x00.l<? super View, yz.g2> lVar) {
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.core.view.ViewKt$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(@m80.k View view2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                view2.removeOnLayoutChangeListener(this);
                lVar.invoke(view2);
            }
        });
    }

    @m80.k
    public static final OneShotPreDrawListener doOnPreDraw(@m80.k final View view, @m80.k final x00.l<? super View, yz.g2> lVar) {
        return OneShotPreDrawListener.add(view, new Runnable() { // from class: androidx.core.view.ViewKt$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                lVar.invoke(view);
            }
        });
    }

    @m80.k
    public static final Bitmap drawToBitmap(@m80.k View view, @m80.k Bitmap.Config config) {
        if (!view.isLaidOut()) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        return createBitmap;
    }

    public static /* synthetic */ Bitmap drawToBitmap$default(View view, Bitmap.Config config, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return drawToBitmap(view, config);
    }

    @m80.k
    public static final q30.m<View> getAllViews(@m80.k View view) {
        return q30.q.b(new ViewKt$allViews$1(view, null));
    }

    @m80.k
    public static final q30.m<ViewParent> getAncestors(@m80.k View view) {
        return q30.x.t(view.getParent(), ViewKt$ancestors$1.INSTANCE);
    }

    public static final int getMarginBottom(@m80.k View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int getMarginEnd(@m80.k View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
        }
        return 0;
    }

    public static final int getMarginLeft(@m80.k View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final int getMarginRight(@m80.k View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int getMarginStart(@m80.k View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        }
        return 0;
    }

    public static final int getMarginTop(@m80.k View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final boolean isGone(@m80.k View view) {
        return view.getVisibility() == 8;
    }

    public static final boolean isInvisible(@m80.k View view) {
        return view.getVisibility() == 4;
    }

    public static final boolean isVisible(@m80.k View view) {
        return view.getVisibility() == 0;
    }

    @m80.k
    public static final Runnable postDelayed(@m80.k View view, long j11, @m80.k final x00.a<yz.g2> aVar) {
        Runnable runnable = new Runnable() { // from class: androidx.core.view.ViewKt$postDelayed$runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                aVar.invoke();
            }
        };
        view.postDelayed(runnable, j11);
        return runnable;
    }

    @m80.k
    public static final Runnable postOnAnimationDelayed(@m80.k View view, long j11, @m80.k final x00.a<yz.g2> aVar) {
        Runnable runnable = new Runnable() { // from class: androidx.core.view.i0
            @Override // java.lang.Runnable
            public final void run() {
                x00.a.this.invoke();
            }
        };
        view.postOnAnimationDelayed(runnable, j11);
        return runnable;
    }

    public static final void setGone(@m80.k View view, boolean z11) {
        view.setVisibility(z11 ? 8 : 0);
    }

    public static final void setInvisible(@m80.k View view, boolean z11) {
        view.setVisibility(z11 ? 4 : 0);
    }

    public static final void setPadding(@m80.k View view, @Px int i11) {
        view.setPadding(i11, i11, i11, i11);
    }

    public static final void setVisible(@m80.k View view, boolean z11) {
        view.setVisibility(z11 ? 0 : 8);
    }

    public static final void updateLayoutParams(@m80.k View view, @m80.k x00.l<? super ViewGroup.LayoutParams, yz.g2> lVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        lVar.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    @w00.j(name = "updateLayoutParamsTyped")
    public static final /* synthetic */ <T extends ViewGroup.LayoutParams> void updateLayoutParamsTyped(View view, x00.l<? super T, yz.g2> lVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.g0.y(1, ExifInterface.GPS_DIRECTION_TRUE);
        lVar.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public static final void updatePadding(@m80.k View view, @Px int i11, @Px int i12, @Px int i13, @Px int i14) {
        view.setPadding(i11, i12, i13, i14);
    }

    public static /* synthetic */ void updatePadding$default(View view, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = view.getPaddingLeft();
        }
        if ((i15 & 2) != 0) {
            i12 = view.getPaddingTop();
        }
        if ((i15 & 4) != 0) {
            i13 = view.getPaddingRight();
        }
        if ((i15 & 8) != 0) {
            i14 = view.getPaddingBottom();
        }
        view.setPadding(i11, i12, i13, i14);
    }

    public static final void updatePaddingRelative(@m80.k View view, @Px int i11, @Px int i12, @Px int i13, @Px int i14) {
        view.setPaddingRelative(i11, i12, i13, i14);
    }

    public static /* synthetic */ void updatePaddingRelative$default(View view, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = view.getPaddingStart();
        }
        if ((i15 & 2) != 0) {
            i12 = view.getPaddingTop();
        }
        if ((i15 & 4) != 0) {
            i13 = view.getPaddingEnd();
        }
        if ((i15 & 8) != 0) {
            i14 = view.getPaddingBottom();
        }
        view.setPaddingRelative(i11, i12, i13, i14);
    }
}
