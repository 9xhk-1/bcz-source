package io.ktor.network.tls.extensions;

import a00.h0;
import io.ktor.network.tls.TLSException;
import io.ktor.network.tls.extensions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jz.j;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import ux.m;
import y40.c0;
import yz.c2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSignatureAlgorithm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignatureAlgorithm.kt\nio/ktor/network/tls/extensions/SignatureAlgorithmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final List<a> f61119a;

    static {
        HashAlgorithm hashAlgorithm = HashAlgorithm.SHA384;
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.ECDSA;
        m.a aVar = m.f92658c;
        a aVar2 = new a(hashAlgorithm, signatureAlgorithm, aVar.g());
        HashAlgorithm hashAlgorithm2 = HashAlgorithm.SHA256;
        a aVar3 = new a(hashAlgorithm2, signatureAlgorithm, aVar.f());
        HashAlgorithm hashAlgorithm3 = HashAlgorithm.SHA512;
        SignatureAlgorithm signatureAlgorithm2 = SignatureAlgorithm.RSA;
        f61119a = h0.Q(aVar2, aVar3, new a(hashAlgorithm3, signatureAlgorithm2, aVar.q()), new a(hashAlgorithm, signatureAlgorithm2, aVar.p()), new a(hashAlgorithm2, signatureAlgorithm2, aVar.o()), new a(HashAlgorithm.SHA1, signatureAlgorithm2, aVar.n()));
    }

    @l
    public static final a a(byte b11, byte b12, @l String str) {
        HashAlgorithm a11 = HashAlgorithm.Companion.a(b11);
        SignatureAlgorithm a12 = SignatureAlgorithm.Companion.a(b12);
        if (a12 == null) {
            return null;
        }
        return new a(a11, a12, str != null ? new m(str) : null);
    }

    public static /* synthetic */ a b(byte b11, byte b12, String str, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        return a(b11, b12, str);
    }

    @l
    public static final a c(@k a.C0706a c0706a, byte b11, byte b12) {
        Object obj;
        g0.p(c0706a, "<this>");
        if (b12 == SignatureAlgorithm.ANON.getCode()) {
            throw new IllegalStateException("Anonymous signature not allowed.");
        }
        Iterator<T> it = f61119a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            a aVar = (a) obj;
            if (aVar.f().getCode() == b11 && aVar.i().getCode() == b12) {
                break;
            }
        }
        a aVar2 = (a) obj;
        return aVar2 == null ? b(b11, b12, null, 4, null) : aVar2;
    }

    @k
    public static final List<a> d() {
        return f61119a;
    }

    @k
    public static final List<a> e(@k c0 c0Var) {
        g0.p(c0Var, "<this>");
        int readShort = c0Var.readShort() & c2.f100412d;
        ArrayList arrayList = new ArrayList();
        while (j.j(c0Var) > 0) {
            a f11 = f(c0Var);
            if (f11 != null) {
                arrayList.add(f11);
            }
        }
        if (((int) j.j(c0Var)) == readShort) {
            return arrayList;
        }
        throw new TLSException("Invalid hash and sign packet size: expected " + readShort + ", actual " + arrayList.size(), null, 2, null);
    }

    @l
    public static final a f(@k c0 c0Var) {
        g0.p(c0Var, "<this>");
        return c(a.f61114e, c0Var.readByte(), c0Var.readByte());
    }
}
