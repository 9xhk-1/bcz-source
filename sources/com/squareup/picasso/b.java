package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.a0;
import java.io.IOException;
import l60.r0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b extends a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final String f41774d = "android_asset";

    /* renamed from: e, reason: collision with root package name */
    public static final int f41775e = 22;

    /* renamed from: a, reason: collision with root package name */
    public final Context f41776a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f41777b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public AssetManager f41778c;

    public b(Context context) {
        this.f41776a = context;
    }

    public static String a(y yVar) {
        return yVar.f41978d.toString().substring(f41775e);
    }

    @Override // com.squareup.picasso.a0
    public boolean canHandleRequest(y yVar) {
        Uri uri = yVar.f41978d;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // com.squareup.picasso.a0
    public a0.a load(y yVar, int i11) throws IOException {
        if (this.f41778c == null) {
            synchronized (this.f41777b) {
                try {
                    if (this.f41778c == null) {
                        this.f41778c = this.f41776a.getAssets();
                    }
                } finally {
                }
            }
        }
        return new a0.a(r0.v(this.f41778c.open(a(yVar))), Picasso.LoadedFrom.DISK);
    }
}
