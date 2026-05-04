package com.baicizhan.client.business.util;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.bumptech.glide.Registry;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@dk.c
/* loaded from: classes4.dex */
public class ZpkGlideModule extends zk.a {
    @Override // zk.d, zk.f
    public void registerComponents(@NonNull Context context, @NonNull com.bumptech.glide.c glide, @NonNull Registry registry) {
        registry.r(Uri.class, InputStream.class, new ZpkGlideStreamFactory());
    }
}
