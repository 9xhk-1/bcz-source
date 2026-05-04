package org.junit.jupiter.api;

import ba0.g4;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.net.URI;
import java.util.Optional;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.3", status = API.Status.MAINTAINED)
/* loaded from: classes9.dex */
public abstract class c2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f77940a;

    /* renamed from: b, reason: collision with root package name */
    public final URI f77941b;

    public c2(String displayName, URI testSourceUri) {
        this.f77940a = ba0.c2.k(displayName, "displayName must not be null or blank");
        this.f77941b = testSourceUri;
    }

    public String a() {
        return this.f77940a;
    }

    public Optional<URI> b() {
        return Optional.ofNullable(this.f77941b);
    }

    public String toString() {
        return new g4(this).a(CommonConstant.KEY_DISPLAY_NAME, this.f77940a).a("testSourceUri", this.f77941b).toString();
    }
}
