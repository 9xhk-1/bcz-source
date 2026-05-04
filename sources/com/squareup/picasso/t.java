package com.squareup.picasso;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.io.File;
import java.io.IOException;
import t50.b;
import t50.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class t implements k {

    /* renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    public final b.a f41950a;

    /* renamed from: b, reason: collision with root package name */
    public final okhttp3.b f41951b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f41952c;

    public t(Context context) {
        this(h0.f(context));
    }

    @Override // com.squareup.picasso.k
    @NonNull
    public okhttp3.n a(@NonNull okhttp3.l lVar) throws IOException {
        return this.f41950a.b(lVar).execute();
    }

    @Override // com.squareup.picasso.k
    public void shutdown() {
        okhttp3.b bVar;
        if (this.f41952c || (bVar = this.f41951b) == null) {
            return;
        }
        try {
            bVar.close();
        } catch (IOException unused) {
        }
    }

    public t(File file) {
        this(file, h0.a(file));
    }

    public t(Context context, long j11) {
        this(h0.f(context), j11);
    }

    public t(File file, long j11) {
        this(new q.a().g(new okhttp3.b(file, j11)).f());
        this.f41952c = false;
    }

    public t(t50.q qVar) {
        this.f41952c = true;
        this.f41950a = qVar;
        this.f41951b = qVar.N();
    }

    public t(b.a aVar) {
        this.f41952c = true;
        this.f41950a = aVar;
        this.f41951b = null;
    }
}
