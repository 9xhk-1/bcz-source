package l50;

import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nArrayPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayPools.kt\nkotlinx/serialization/json/internal/ByteArrayPoolBase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
/* loaded from: classes8.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final a00.m<byte[]> f70030a = new a00.m<>();

    /* renamed from: b, reason: collision with root package name */
    public int f70031b;

    public final void a(@m80.k byte[] array) {
        int i11;
        kotlin.jvm.internal.g0.p(array, "array");
        synchronized (this) {
            try {
                int length = this.f70031b + array.length;
                i11 = j.f70001a;
                if (length < i11) {
                    this.f70031b += array.length / 2;
                    this.f70030a.addLast(array);
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @m80.k
    public final byte[] b(int i11) {
        byte[] t11;
        synchronized (this) {
            t11 = this.f70030a.t();
            if (t11 != null) {
                this.f70031b -= t11.length / 2;
            } else {
                t11 = null;
            }
        }
        return t11 == null ? new byte[i11] : t11;
    }
}
