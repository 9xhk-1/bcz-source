package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.e;
import java.io.IOException;
import java.io.InputStream;
import sk.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class k implements e<InputStream> {

    /* renamed from: b, reason: collision with root package name */
    public static final int f28761b = 5242880;

    /* renamed from: a, reason: collision with root package name */
    public final v0 f28762a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements e.a<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final lk.b f28763a;

        public a(lk.b bVar) {
            this.f28763a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e<InputStream> a(InputStream inputStream) {
            return new k(inputStream, this.f28763a);
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public Class<InputStream> getDataClass() {
            return InputStream.class;
        }
    }

    public k(InputStream inputStream, lk.b bVar) {
        v0 v0Var = new v0(inputStream, bVar);
        this.f28762a = v0Var;
        v0Var.mark(5242880);
    }

    public void b() {
        this.f28762a.c();
    }

    @Override // com.bumptech.glide.load.data.e
    @NonNull
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InputStream a() throws IOException {
        this.f28762a.reset();
        return this.f28762a;
    }

    @Override // com.bumptech.glide.load.data.e
    public void cleanup() {
        this.f28762a.release();
    }
}
