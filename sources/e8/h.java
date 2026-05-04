package e8;

import java.util.Arrays;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f49584a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final byte[] f49585b;

    public h(@k String cacheKey, @l byte[] bArr) {
        g0.p(cacheKey, "cacheKey");
        this.f49584a = cacheKey;
        this.f49585b = bArr;
    }

    public static /* synthetic */ h d(h hVar, String str, byte[] bArr, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = hVar.f49584a;
        }
        if ((i11 & 2) != 0) {
            bArr = hVar.f49585b;
        }
        return hVar.c(str, bArr);
    }

    @k
    public final String a() {
        return this.f49584a;
    }

    @l
    public final byte[] b() {
        return this.f49585b;
    }

    @k
    public final h c(@k String cacheKey, @l byte[] bArr) {
        g0.p(cacheKey, "cacheKey");
        return new h(cacheKey, bArr);
    }

    @k
    public final String e() {
        return this.f49584a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return g0.g(this.f49584a, hVar.f49584a) && g0.g(this.f49585b, hVar.f49585b);
    }

    @l
    public final byte[] f() {
        return this.f49585b;
    }

    public int hashCode() {
        int hashCode = this.f49584a.hashCode() * 31;
        byte[] bArr = this.f49585b;
        return hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr));
    }

    @k
    public String toString() {
        return "UserCacheRecord(cacheKey=" + this.f49584a + ", payload=" + Arrays.toString(this.f49585b) + ')';
    }
}
