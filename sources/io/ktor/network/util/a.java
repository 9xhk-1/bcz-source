package io.ktor.network.util;

import java.nio.ByteBuffer;
import m80.k;
import pz.f;
import pz.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f61120a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public static final int f61121b = 4096;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final h<ByteBuffer> f61122c = new f(4096, 4096);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final h<ByteBuffer> f61123d = new f(2048, 65535);

    @k
    public static final h<ByteBuffer> a() {
        return f61122c;
    }

    @k
    public static final h<ByteBuffer> b() {
        return f61123d;
    }
}
