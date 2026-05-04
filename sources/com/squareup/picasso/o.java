package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class o extends a<ImageView> {

    /* renamed from: m, reason: collision with root package name */
    public f f41922m;

    public o(Picasso picasso, ImageView imageView, y yVar, int i11, int i12, int i13, Drawable drawable, String str, Object obj, f fVar, boolean z11) {
        super(picasso, imageView, yVar, i11, i12, i13, drawable, str, obj, z11);
        this.f41922m = fVar;
    }

    @Override // com.squareup.picasso.a
    public void a() {
        super.a();
        if (this.f41922m != null) {
            this.f41922m = null;
        }
    }

    @Override // com.squareup.picasso.a
    public void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        ImageView imageView = (ImageView) this.f41759c.get();
        if (imageView == null) {
            return;
        }
        Picasso picasso = this.f41757a;
        u.c(imageView, picasso.f41730e, bitmap, loadedFrom, this.f41760d, picasso.f41738m);
        f fVar = this.f41922m;
        if (fVar != null) {
            fVar.onSuccess();
        }
    }

    @Override // com.squareup.picasso.a
    public void c(Exception exc) {
        ImageView imageView = (ImageView) this.f41759c.get();
        if (imageView == null) {
            return;
        }
        Object drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        int i11 = this.f41763g;
        if (i11 != 0) {
            imageView.setImageResource(i11);
        } else {
            Drawable drawable2 = this.f41764h;
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
            }
        }
        f fVar = this.f41922m;
        if (fVar != null) {
            fVar.onError(exc);
        }
    }
}
