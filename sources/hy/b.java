package hy;

import io.ktor.server.http.content.CompressedFileType;
import java.net.URL;
import mx.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final URL f59795a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final v.e f59796b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final CompressedFileType f59797c;

    public b(@m80.k URL url, @m80.k v.e content, @m80.k CompressedFileType compression) {
        kotlin.jvm.internal.g0.p(url, "url");
        kotlin.jvm.internal.g0.p(content, "content");
        kotlin.jvm.internal.g0.p(compression, "compression");
        this.f59795a = url;
        this.f59796b = content;
        this.f59797c = compression;
    }

    @m80.k
    public final CompressedFileType a() {
        return this.f59797c;
    }

    @m80.k
    public final v.e b() {
        return this.f59796b;
    }

    @m80.k
    public final URL c() {
        return this.f59795a;
    }
}
