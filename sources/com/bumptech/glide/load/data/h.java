package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class h extends b<AssetFileDescriptor> {
    public h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // com.bumptech.glide.load.data.b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public AssetFileDescriptor b(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public Class<AssetFileDescriptor> getDataClass() {
        return AssetFileDescriptor.class;
    }
}
