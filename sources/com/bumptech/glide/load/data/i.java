package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class i extends l<ParcelFileDescriptor> {
    public i(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.data.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // com.bumptech.glide.load.data.l
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor b(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor c11 = c(uri);
        if (c11 != null) {
            return c11.getParcelFileDescriptor();
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public Class<ParcelFileDescriptor> getDataClass() {
        return ParcelFileDescriptor.class;
    }

    public i(ContentResolver contentResolver, Uri uri, boolean z11) {
        super(contentResolver, uri, z11);
    }
}
