package cl;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a extends e<Bitmap> {

    /* renamed from: d, reason: collision with root package name */
    public final int[] f8726d;

    /* renamed from: e, reason: collision with root package name */
    public final ComponentName f8727e;

    /* renamed from: f, reason: collision with root package name */
    public final RemoteViews f8728f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f8729g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8730h;

    public a(Context context, int i11, int i12, int i13, RemoteViews remoteViews, int... iArr) {
        super(i11, i12);
        if (iArr.length == 0) {
            throw new IllegalArgumentException("WidgetIds must have length > 0");
        }
        this.f8729g = (Context) fl.m.f(context, "Context can not be null!");
        this.f8728f = (RemoteViews) fl.m.f(remoteViews, "RemoteViews object can not be null!");
        this.f8726d = (int[]) fl.m.f(iArr, "WidgetIds can not be null!");
        this.f8730h = i13;
        this.f8727e = null;
    }

    @Override // cl.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void h(@NonNull Bitmap bitmap, @Nullable dl.f<? super Bitmap> fVar) {
        b(bitmap);
    }

    public final void b(@Nullable Bitmap bitmap) {
        this.f8728f.setImageViewBitmap(this.f8730h, bitmap);
        c();
    }

    public final void c() {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this.f8729g);
        ComponentName componentName = this.f8727e;
        if (componentName != null) {
            appWidgetManager.updateAppWidget(componentName, this.f8728f);
        } else {
            appWidgetManager.updateAppWidget(this.f8726d, this.f8728f);
        }
    }

    @Override // cl.p
    public void i(@Nullable Drawable drawable) {
        b(null);
    }

    public a(Context context, int i11, RemoteViews remoteViews, int... iArr) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i11, remoteViews, iArr);
    }

    public a(Context context, int i11, int i12, int i13, RemoteViews remoteViews, ComponentName componentName) {
        super(i11, i12);
        this.f8729g = (Context) fl.m.f(context, "Context can not be null!");
        this.f8728f = (RemoteViews) fl.m.f(remoteViews, "RemoteViews object can not be null!");
        this.f8727e = (ComponentName) fl.m.f(componentName, "ComponentName can not be null!");
        this.f8730h = i13;
        this.f8726d = null;
    }

    public a(Context context, int i11, RemoteViews remoteViews, ComponentName componentName) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i11, remoteViews, componentName);
    }
}
