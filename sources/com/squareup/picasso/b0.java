package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.a0;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b0 extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f41779a;

    public b0(Context context) {
        this.f41779a = context;
    }

    public static Bitmap a(Resources resources, int i11, y yVar) {
        BitmapFactory.Options createBitmapOptions = a0.createBitmapOptions(yVar);
        if (a0.requiresInSampleSize(createBitmapOptions)) {
            BitmapFactory.decodeResource(resources, i11, createBitmapOptions);
            a0.calculateInSampleSize(yVar.f41982h, yVar.f41983i, createBitmapOptions, yVar);
        }
        return BitmapFactory.decodeResource(resources, i11, createBitmapOptions);
    }

    @Override // com.squareup.picasso.a0
    public boolean canHandleRequest(y yVar) {
        if (yVar.f41979e != 0) {
            return true;
        }
        return "android.resource".equals(yVar.f41978d.getScheme());
    }

    @Override // com.squareup.picasso.a0
    public a0.a load(y yVar, int i11) throws IOException {
        Resources n11 = h0.n(this.f41779a, yVar);
        return new a0.a(a(n11, h0.m(n11, yVar), yVar), Picasso.LoadedFrom.DISK);
    }
}
