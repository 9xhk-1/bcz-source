package com.squareup.picasso;

import android.app.Notification;
import android.app.NotificationManager;
import android.appwidget.AppWidgetManager;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.squareup.picasso.Picasso;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class x extends com.squareup.picasso.a<c> {

    /* renamed from: m, reason: collision with root package name */
    public final RemoteViews f41964m;

    /* renamed from: n, reason: collision with root package name */
    public final int f41965n;

    /* renamed from: o, reason: collision with root package name */
    public f f41966o;

    /* renamed from: p, reason: collision with root package name */
    public c f41967p;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends x {

        /* renamed from: q, reason: collision with root package name */
        public final int[] f41968q;

        public a(Picasso picasso, y yVar, RemoteViews remoteViews, int i11, int[] iArr, int i12, int i13, String str, Object obj, int i14, f fVar) {
            super(picasso, yVar, remoteViews, i11, i14, i12, i13, obj, str, fVar);
            this.f41968q = iArr;
        }

        @Override // com.squareup.picasso.x, com.squareup.picasso.a
        public /* bridge */ /* synthetic */ c k() {
            return super.k();
        }

        @Override // com.squareup.picasso.x
        public void p() {
            AppWidgetManager.getInstance(this.f41757a.f41730e).updateAppWidget(this.f41968q, this.f41964m);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends x {

        /* renamed from: q, reason: collision with root package name */
        public final int f41969q;

        /* renamed from: r, reason: collision with root package name */
        public final String f41970r;

        /* renamed from: s, reason: collision with root package name */
        public final Notification f41971s;

        public b(Picasso picasso, y yVar, RemoteViews remoteViews, int i11, int i12, Notification notification, String str, int i13, int i14, String str2, Object obj, int i15, f fVar) {
            super(picasso, yVar, remoteViews, i11, i15, i13, i14, obj, str2, fVar);
            this.f41969q = i12;
            this.f41970r = str;
            this.f41971s = notification;
        }

        @Override // com.squareup.picasso.x, com.squareup.picasso.a
        public /* bridge */ /* synthetic */ c k() {
            return super.k();
        }

        @Override // com.squareup.picasso.x
        public void p() {
            ((NotificationManager) h0.o(this.f41757a.f41730e, "notification")).notify(this.f41970r, this.f41969q, this.f41971s);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final RemoteViews f41972a;

        /* renamed from: b, reason: collision with root package name */
        public final int f41973b;

        public c(RemoteViews remoteViews, int i11) {
            this.f41972a = remoteViews;
            this.f41973b = i11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                c cVar = (c) obj;
                if (this.f41973b == cVar.f41973b && this.f41972a.equals(cVar.f41972a)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f41972a.hashCode() * 31) + this.f41973b;
        }
    }

    public x(Picasso picasso, y yVar, RemoteViews remoteViews, int i11, int i12, int i13, int i14, Object obj, String str, f fVar) {
        super(picasso, null, yVar, i13, i14, i12, null, str, obj, false);
        this.f41964m = remoteViews;
        this.f41965n = i11;
        this.f41966o = fVar;
    }

    @Override // com.squareup.picasso.a
    public void a() {
        super.a();
        if (this.f41966o != null) {
            this.f41966o = null;
        }
    }

    @Override // com.squareup.picasso.a
    public void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        this.f41964m.setImageViewBitmap(this.f41965n, bitmap);
        p();
        f fVar = this.f41966o;
        if (fVar != null) {
            fVar.onSuccess();
        }
    }

    @Override // com.squareup.picasso.a
    public void c(Exception exc) {
        int i11 = this.f41763g;
        if (i11 != 0) {
            o(i11);
        }
        f fVar = this.f41966o;
        if (fVar != null) {
            fVar.onError(exc);
        }
    }

    @Override // com.squareup.picasso.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public c k() {
        if (this.f41967p == null) {
            this.f41967p = new c(this.f41964m, this.f41965n);
        }
        return this.f41967p;
    }

    public void o(int i11) {
        this.f41964m.setImageViewResource(this.f41965n, i11);
        p();
    }

    public abstract void p();
}
