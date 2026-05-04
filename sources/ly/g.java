package ly;

import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ix.k f71687a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final io.ktor.serialization.c f71688b;

    public g(@k ix.k contentType, @k io.ktor.serialization.c converter) {
        g0.p(contentType, "contentType");
        g0.p(converter, "converter");
        this.f71687a = contentType;
        this.f71688b = converter;
    }

    @k
    public final ix.k a() {
        return this.f71687a;
    }

    @k
    public final io.ktor.serialization.c b() {
        return this.f71688b;
    }
}
