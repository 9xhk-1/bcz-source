package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import en.r;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class l<T> implements d<T> {

    /* renamed from: e, reason: collision with root package name */
    public static final String f28764e = "LocalUriFetcher";

    /* renamed from: a, reason: collision with root package name */
    public final boolean f28765a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f28766b;

    /* renamed from: c, reason: collision with root package name */
    public final ContentResolver f28767c;

    /* renamed from: d, reason: collision with root package name */
    public T f28768d;

    public l(ContentResolver contentResolver, Uri uri) {
        this(contentResolver, uri, false);
    }

    public abstract void a(T t11) throws IOException;

    public abstract T b(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    public AssetFileDescriptor c(Uri uri) throws FileNotFoundException {
        return (this.f28765a && jk.b.d(uri) && jk.b.c()) ? jk.b.h(uri, this.f28767c) : this.f28767c.openAssetFileDescriptor(uri, r.f50027a);
    }

    @Override // com.bumptech.glide.load.data.d
    public void cleanup() {
        T t11 = this.f28768d;
        if (t11 != null) {
            try {
                a(t11);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public DataSource getDataSource() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void loadData(@NonNull Priority priority, @NonNull d.a<? super T> aVar) {
        try {
            T b11 = b(this.f28766b, this.f28767c);
            this.f28768d = b11;
            aVar.b(b11);
        } catch (FileNotFoundException e11) {
            if (Log.isLoggable(f28764e, 3)) {
                Log.d(f28764e, "Failed to open Uri", e11);
            }
            aVar.c(e11);
        }
    }

    public l(ContentResolver contentResolver, Uri uri, boolean z11) {
        this.f28767c = contentResolver;
        this.f28766b = uri;
        this.f28765a = z11;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
