package qx;

import jz.s;
import kotlin.jvm.internal.g0;
import m80.k;
import u30.d;
import u30.k0;
import xy.b0;
import xy.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final String f82728a = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";

    @k
    public static final String a(@k String nonce) {
        g0.p(nonce, "nonce");
        return f.g(b0.j(s.l(k0.b6(nonce).toString() + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11", d.f91604g)));
    }
}
