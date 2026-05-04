package com.squareup.picasso;

import android.graphics.Bitmap;
import com.squareup.picasso.Picasso;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class l extends a<Object> {

    /* renamed from: m, reason: collision with root package name */
    public final Object f41920m;

    /* renamed from: n, reason: collision with root package name */
    public f f41921n;

    public l(Picasso picasso, y yVar, int i11, int i12, Object obj, String str, f fVar) {
        super(picasso, null, yVar, i11, i12, 0, null, str, obj, false);
        this.f41920m = new Object();
        this.f41921n = fVar;
    }

    @Override // com.squareup.picasso.a
    public void a() {
        super.a();
        this.f41921n = null;
    }

    @Override // com.squareup.picasso.a
    public void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        f fVar = this.f41921n;
        if (fVar != null) {
            fVar.onSuccess();
        }
    }

    @Override // com.squareup.picasso.a
    public void c(Exception exc) {
        f fVar = this.f41921n;
        if (fVar != null) {
            fVar.onError(exc);
        }
    }

    @Override // com.squareup.picasso.a
    public Object k() {
        return this.f41920m;
    }
}
