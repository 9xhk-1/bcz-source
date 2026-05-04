package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a extends l<AssetFileDescriptor> {
    public a(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.data.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // com.bumptech.glide.load.data.l
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public AssetFileDescriptor b(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor c11 = c(uri);
        if (c11 != null) {
            return c11;
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public Class<AssetFileDescriptor> getDataClass() {
        return AssetFileDescriptor.class;
    }

    public a(ContentResolver contentResolver, Uri uri, boolean z11) {
        super(contentResolver, uri, z11);
    }
}
