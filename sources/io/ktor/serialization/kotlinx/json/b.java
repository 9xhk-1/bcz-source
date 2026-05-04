package io.ktor.serialization.kotlinx.json;

import java.nio.charset.Charset;
import jz.s;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final byte[] f61225a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final byte[] f61226b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final byte[] f61227c;

    public b(@k Charset charset) {
        g0.p(charset, "charset");
        this.f61225a = s.l("[", charset);
        this.f61226b = s.l("]", charset);
        this.f61227c = s.l(",", charset);
    }

    @k
    public final byte[] a() {
        return this.f61225a;
    }

    @k
    public final byte[] b() {
        return this.f61226b;
    }

    @k
    public final byte[] c() {
        return this.f61227c;
    }
}
