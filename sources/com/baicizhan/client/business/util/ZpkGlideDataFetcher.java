package com.baicizhan.client.business.util;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ZpkGlideDataFetcher implements com.bumptech.glide.load.data.d<InputStream> {
    private static final String TAG = "ZpkGlideDataFetcher";
    private InputStream mStream;
    private Uri mUri;

    public ZpkGlideDataFetcher(Uri uri) {
        this.mUri = uri;
    }

    private void decodeContentStream() throws IOException {
        String path = this.mUri.getPath();
        this.mStream = new ya.e(path, 1).t(this.mUri.getQuery());
    }

    @Override // com.bumptech.glide.load.data.d
    public void cleanup() {
        InputStream inputStream = this.mStream;
        if (inputStream != null) {
            try {
                inputStream.close();
                this.mStream = null;
            } catch (Exception e11) {
                qb.c.c(TAG, "cleanup: ", e11);
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public DataSource getDataSource() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void loadData(@NonNull Priority priority, @NonNull d.a<? super InputStream> callback) {
        try {
            decodeContentStream();
            callback.b(this.mStream);
        } catch (IOException e11) {
            qb.c.c(TAG, "loadData: ", e11);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
