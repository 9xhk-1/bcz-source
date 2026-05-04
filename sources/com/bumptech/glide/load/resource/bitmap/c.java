package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.bitmap.a;
import fl.e;
import fl.k;
import ik.f;
import java.io.IOException;
import java.io.InputStream;
import kk.u;
import sk.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c implements f<InputStream, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.resource.bitmap.a f28848a;

    /* renamed from: b, reason: collision with root package name */
    public final lk.b f28849b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements a.b {

        /* renamed from: a, reason: collision with root package name */
        public final v0 f28850a;

        /* renamed from: b, reason: collision with root package name */
        public final e f28851b;

        public a(v0 v0Var, e eVar) {
            this.f28850a = v0Var;
            this.f28851b = eVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public void a() {
            this.f28850a.c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public void b(lk.e eVar, Bitmap bitmap) throws IOException {
            IOException c11 = this.f28851b.c();
            if (c11 != null) {
                if (bitmap == null) {
                    throw c11;
                }
                eVar.e(bitmap);
                throw c11;
            }
        }
    }

    public c(com.bumptech.glide.load.resource.bitmap.a aVar, lk.b bVar) {
        this.f28848a = aVar;
        this.f28849b = bVar;
    }

    @Override // ik.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public u<Bitmap> a(@NonNull InputStream inputStream, int i11, int i12, @NonNull ik.e eVar) throws IOException {
        boolean z11;
        v0 v0Var;
        if (inputStream instanceof v0) {
            v0Var = (v0) inputStream;
            z11 = false;
        } else {
            z11 = true;
            v0Var = new v0(inputStream, this.f28849b);
        }
        e e11 = e.e(v0Var);
        try {
            u<Bitmap> g11 = this.f28848a.g(new k(e11), i11, i12, eVar, new a(v0Var, e11));
            e11.release();
            if (z11) {
                v0Var.release();
            }
            return g11;
        } finally {
        }
    }

    @Override // ik.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull InputStream inputStream, @NonNull ik.e eVar) {
        return this.f28848a.s(inputStream);
    }
}
