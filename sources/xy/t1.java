package xy;

import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class t1 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final SecretKeySpec f98650a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f98651b;

    /* renamed from: c, reason: collision with root package name */
    public final long f98652c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final x00.a<String> f98653d;

    /* renamed from: e, reason: collision with root package name */
    public final int f98654e;

    public t1(@m80.k SecretKeySpec keySpec, @m80.k String algorithm, long j11, @m80.k x00.a<String> nonceGenerator) {
        kotlin.jvm.internal.g0.p(keySpec, "keySpec");
        kotlin.jvm.internal.g0.p(algorithm, "algorithm");
        kotlin.jvm.internal.g0.p(nonceGenerator, "nonceGenerator");
        this.f98650a = keySpec;
        this.f98651b = algorithm;
        this.f98652c = j11;
        this.f98653d = nonceGenerator;
        Mac mac = Mac.getInstance(algorithm);
        mac.init(keySpec);
        this.f98654e = mac.getMacLength();
    }

    public static final String e() {
        return b0.e();
    }

    public static final String f() {
        return b0.e();
    }

    @Override // xy.m1
    @m80.l
    public Object a(@m80.k String str, @m80.k j00.c<? super Boolean> cVar) {
        List n52 = u30.k0.n5(str, new char[]{'+'}, false, 0, 6, null);
        if (n52.size() != 3) {
            return l00.a.a(false);
        }
        String str2 = (String) n52.get(0);
        String str3 = (String) n52.get(1);
        String str4 = (String) n52.get(2);
        if (str2.length() < 8) {
            return l00.a.a(false);
        }
        if (str4.length() != this.f98654e * 2) {
            return l00.a.a(false);
        }
        if (str3.length() != 16) {
            return l00.a.a(false);
        }
        if (Long.parseLong(str3, kotlin.text.a.a(16)) + TimeUnit.MILLISECONDS.toNanos(this.f98652c) < System.nanoTime()) {
            return l00.a.a(false);
        }
        Mac mac = Mac.getInstance(this.f98651b);
        mac.init(this.f98650a);
        byte[] bytes = (str2 + ':' + str3).getBytes(u30.d.f91604g);
        kotlin.jvm.internal.g0.o(bytes, "getBytes(...)");
        mac.update(bytes);
        byte[] doFinal = mac.doFinal();
        kotlin.jvm.internal.g0.o(doFinal, "doFinal(...)");
        String h11 = b0.h(doFinal);
        int min = Math.min(h11.length(), str4.length());
        int i11 = 0;
        for (int i12 = 0; i12 < min; i12++) {
            if (h11.charAt(i12) == str4.charAt(i12)) {
                i11++;
            }
        }
        return l00.a.a(i11 == this.f98654e * 2);
    }

    @Override // xy.m1
    @m80.l
    public Object b(@m80.k j00.c<? super String> cVar) {
        String invoke = this.f98653d.invoke();
        String l11 = Long.toString(System.nanoTime(), kotlin.text.a.a(16));
        kotlin.jvm.internal.g0.o(l11, "toString(...)");
        String m42 = u30.k0.m4(l11, 16, '0');
        Mac mac = Mac.getInstance(this.f98651b);
        mac.init(this.f98650a);
        byte[] bytes = (invoke + ':' + m42).getBytes(u30.d.f91604g);
        kotlin.jvm.internal.g0.o(bytes, "getBytes(...)");
        mac.update(bytes);
        byte[] doFinal = mac.doFinal();
        kotlin.jvm.internal.g0.o(doFinal, "doFinal(...)");
        return invoke + '+' + m42 + '+' + b0.h(doFinal);
    }

    @m80.k
    public final String g() {
        return this.f98651b;
    }

    @m80.k
    public final SecretKeySpec h() {
        return this.f98650a;
    }

    @m80.k
    public final x00.a<String> i() {
        return this.f98653d;
    }

    public final long j() {
        return this.f98652c;
    }

    public /* synthetic */ t1(SecretKeySpec secretKeySpec, String str, long j11, x00.a aVar, int i11, kotlin.jvm.internal.v vVar) {
        this(secretKeySpec, (i11 & 2) != 0 ? qr.b.f82657b : str, (i11 & 4) != 0 ? 60000L : j11, (x00.a<String>) ((i11 & 8) != 0 ? new x00.a() { // from class: xy.s1
            @Override // x00.a
            public final Object invoke() {
                String e11;
                e11 = t1.e();
                return e11;
            }
        } : aVar));
    }

    public /* synthetic */ t1(byte[] bArr, String str, long j11, x00.a aVar, int i11, kotlin.jvm.internal.v vVar) {
        this(bArr, (i11 & 2) != 0 ? qr.b.f82657b : str, (i11 & 4) != 0 ? 60000L : j11, (x00.a<String>) ((i11 & 8) != 0 ? new x00.a() { // from class: xy.r1
            @Override // x00.a
            public final Object invoke() {
                String f11;
                f11 = t1.f();
                return f11;
            }
        } : aVar));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t1(@m80.k byte[] key, @m80.k String algorithm, long j11, @m80.k x00.a<String> nonceGenerator) {
        this(new SecretKeySpec(key, algorithm), algorithm, j11, nonceGenerator);
        kotlin.jvm.internal.g0.p(key, "key");
        kotlin.jvm.internal.g0.p(algorithm, "algorithm");
        kotlin.jvm.internal.g0.p(nonceGenerator, "nonceGenerator");
    }
}
