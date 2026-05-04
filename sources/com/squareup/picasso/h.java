package com.squareup.picasso;

import android.content.Context;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.a0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import l60.r0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f41858a;

    public h(Context context) {
        this.f41858a = context;
    }

    public InputStream a(y yVar) throws FileNotFoundException {
        return this.f41858a.getContentResolver().openInputStream(yVar.f41978d);
    }

    @Override // com.squareup.picasso.a0
    public boolean canHandleRequest(y yVar) {
        return "content".equals(yVar.f41978d.getScheme());
    }

    @Override // com.squareup.picasso.a0
    public a0.a load(y yVar, int i11) throws IOException {
        return new a0.a(r0.v(a(yVar)), Picasso.LoadedFrom.DISK);
    }
}
