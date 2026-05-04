package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.baicizhan.client.business.util.ZpkGlideModule;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* renamed from: a, reason: collision with root package name */
    public final ZpkGlideModule f28621a = new ZpkGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.baicizhan.client.business.util.ZpkGlideModule");
        }
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @NonNull
    public Set<Class<?>> a() {
        return Collections.EMPTY_SET;
    }

    @Override // zk.a, zk.b
    public void applyOptions(@NonNull Context context, @NonNull d builder) {
        this.f28621a.applyOptions(context, builder);
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @NonNull
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a b() {
        return new a();
    }

    @Override // zk.a
    public boolean isManifestParsingEnabled() {
        return this.f28621a.isManifestParsingEnabled();
    }

    @Override // zk.d, zk.f
    public void registerComponents(@NonNull Context context, @NonNull c glide, @NonNull Registry registry) {
        this.f28621a.registerComponents(context, glide, registry);
    }
}
