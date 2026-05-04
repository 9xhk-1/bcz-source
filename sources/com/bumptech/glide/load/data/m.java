package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class m extends b<InputStream> {
    public m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.bumptech.glide.load.data.b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream b(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }
}
