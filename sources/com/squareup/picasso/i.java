package com.squareup.picasso;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final z f41885a;

    /* renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    public final WeakReference<ImageView> f41886b;

    /* renamed from: c, reason: collision with root package name */
    @VisibleForTesting
    public f f41887c;

    public i(z zVar, ImageView imageView, f fVar) {
        this.f41885a = zVar;
        this.f41886b = new WeakReference<>(imageView);
        this.f41887c = fVar;
        imageView.addOnAttachStateChangeListener(this);
        if (imageView.getWindowToken() != null) {
            onViewAttachedToWindow(imageView);
        }
    }

    public void a() {
        this.f41885a.d();
        this.f41887c = null;
        ImageView imageView = this.f41886b.get();
        if (imageView == null) {
            return;
        }
        this.f41886b.clear();
        imageView.removeOnAttachStateChangeListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
    }

    public Object b() {
        return this.f41885a.n();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ImageView imageView = this.f41886b.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            imageView.removeOnAttachStateChangeListener(this);
            viewTreeObserver.removeOnPreDrawListener(this);
            this.f41886b.clear();
            this.f41885a.O().G(width, height).p(imageView, this.f41887c);
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
}
