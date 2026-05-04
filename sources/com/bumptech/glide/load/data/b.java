package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class b<T> implements d<T> {

    /* renamed from: d, reason: collision with root package name */
    public static final String f28733d = "AssetPathFetcher";

    /* renamed from: a, reason: collision with root package name */
    public final String f28734a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager f28735b;

    /* renamed from: c, reason: collision with root package name */
    public T f28736c;

    public b(AssetManager assetManager, String str) {
        this.f28735b = assetManager;
        this.f28734a = str;
    }

    public abstract void a(T t11) throws IOException;

    public abstract T b(AssetManager assetManager, String str) throws IOException;

    @Override // com.bumptech.glide.load.data.d
    public void cleanup() {
        T t11 = this.f28736c;
        if (t11 == null) {
            return;
        }
        try {
            a(t11);
        } catch (IOException unused) {
        }
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public DataSource getDataSource() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void loadData(@NonNull Priority priority, @NonNull d.a<? super T> aVar) {
        try {
            T b11 = b(this.f28735b, this.f28734a);
            this.f28736c = b11;
            aVar.b(b11);
        } catch (IOException e11) {
            if (Log.isLoggable(f28733d, 3)) {
                Log.d(f28733d, "Failed to load data from asset manager", e11);
            }
            aVar.c(e11);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
