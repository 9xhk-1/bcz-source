package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.a0;
import java.io.IOException;
import l60.r0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class m extends h {
    public m(Context context) {
        super(context);
    }

    public static int b(Uri uri) throws IOException {
        return new ExifInterface(uri.getPath()).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
    }

    @Override // com.squareup.picasso.h, com.squareup.picasso.a0
    public boolean canHandleRequest(y yVar) {
        return "file".equals(yVar.f41978d.getScheme());
    }

    @Override // com.squareup.picasso.h, com.squareup.picasso.a0
    public a0.a load(y yVar, int i11) throws IOException {
        return new a0.a(null, r0.v(a(yVar)), Picasso.LoadedFrom.DISK, b(yVar.f41978d));
    }
}
