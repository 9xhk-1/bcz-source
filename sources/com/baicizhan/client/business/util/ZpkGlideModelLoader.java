package com.baicizhan.client.business.util;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import pk.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ZpkGlideModelLoader implements pk.o<Uri, InputStream>, ZpkConfig {
    @Override // pk.o
    public o.a<InputStream> buildLoadData(@NonNull Uri model, int width, int height, @NonNull ik.e options) {
        return new o.a<>(new el.e(model.toString()), new ZpkGlideDataFetcher(model));
    }

    @Override // pk.o
    public boolean handles(@NonNull Uri model) {
        return match(model);
    }
}
