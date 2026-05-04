package cl;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class l extends e<Bitmap> {

    /* renamed from: d, reason: collision with root package name */
    public final RemoteViews f8760d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f8761e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8762f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8763g;

    /* renamed from: h, reason: collision with root package name */
    public final Notification f8764h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8765i;

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public l(Context context, int i11, RemoteViews remoteViews, Notification notification, int i12) {
        this(context, i11, remoteViews, notification, i12, null);
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    private void b(@Nullable Bitmap bitmap) {
        this.f8760d.setImageViewBitmap(this.f8765i, bitmap);
        c();
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    private void c() {
        ((NotificationManager) fl.m.e((NotificationManager) this.f8761e.getSystemService("notification"))).notify(this.f8763g, this.f8762f, this.f8764h);
    }

    @Override // cl.p
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void h(@NonNull Bitmap bitmap, @Nullable dl.f<? super Bitmap> fVar) {
        b(bitmap);
    }

    @Override // cl.p
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public void i(@Nullable Drawable drawable) {
        b(null);
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public l(Context context, int i11, RemoteViews remoteViews, Notification notification, int i12, String str) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i11, remoteViews, notification, i12, str);
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public l(Context context, int i11, int i12, int i13, RemoteViews remoteViews, Notification notification, int i14, String str) {
        super(i11, i12);
        this.f8761e = (Context) fl.m.f(context, "Context must not be null!");
        this.f8764h = (Notification) fl.m.f(notification, "Notification object can not be null!");
        this.f8760d = (RemoteViews) fl.m.f(remoteViews, "RemoteViews object can not be null!");
        this.f8765i = i13;
        this.f8762f = i14;
        this.f8763g = str;
    }
}
