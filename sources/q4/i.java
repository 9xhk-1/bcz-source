package q4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f81703a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f81704b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Map<String, List<String>> f81705c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final byte[] f81706d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f81707e;

    /* JADX WARN: Multi-variable type inference failed */
    public i(int i11, @k String statusText, @k Map<String, ? extends List<String>> headers, @k byte[] body, @l String str) {
        g0.p(statusText, "statusText");
        g0.p(headers, "headers");
        g0.p(body, "body");
        this.f81703a = i11;
        this.f81704b = statusText;
        this.f81705c = headers;
        this.f81706d = body;
        this.f81707e = str;
    }

    public static /* synthetic */ i g(i iVar, int i11, String str, Map map, byte[] bArr, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = iVar.f81703a;
        }
        if ((i12 & 2) != 0) {
            str = iVar.f81704b;
        }
        if ((i12 & 4) != 0) {
            map = iVar.f81705c;
        }
        if ((i12 & 8) != 0) {
            bArr = iVar.f81706d;
        }
        if ((i12 & 16) != 0) {
            str2 = iVar.f81707e;
        }
        String str3 = str2;
        Map map2 = map;
        return iVar.f(i11, str, map2, bArr, str3);
    }

    public final int a() {
        return this.f81703a;
    }

    @k
    public final String b() {
        return this.f81704b;
    }

    @k
    public final Map<String, List<String>> c() {
        return this.f81705c;
    }

    @k
    public final byte[] d() {
        return this.f81706d;
    }

    @l
    public final String e() {
        return this.f81707e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f81703a == iVar.f81703a && g0.g(this.f81704b, iVar.f81704b) && g0.g(this.f81705c, iVar.f81705c) && Arrays.equals(this.f81706d, iVar.f81706d) && g0.g(this.f81707e, iVar.f81707e);
    }

    @k
    public final i f(int i11, @k String statusText, @k Map<String, ? extends List<String>> headers, @k byte[] body, @l String str) {
        g0.p(statusText, "statusText");
        g0.p(headers, "headers");
        g0.p(body, "body");
        return new i(i11, statusText, headers, body, str);
    }

    @k
    public final byte[] h() {
        return this.f81706d;
    }

    public int hashCode() {
        int hashCode = ((((((this.f81703a * 31) + this.f81704b.hashCode()) * 31) + this.f81705c.hashCode()) * 31) + Arrays.hashCode(this.f81706d)) * 31;
        String str = this.f81707e;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @l
    public final String i() {
        return this.f81707e;
    }

    @k
    public final Map<String, List<String>> j() {
        return this.f81705c;
    }

    public final int k() {
        return this.f81703a;
    }

    @k
    public final String l() {
        return this.f81704b;
    }

    @k
    public String toString() {
        return "VirtualResponse(statusCode=" + this.f81703a + ", statusText=" + this.f81704b + ", headers=" + this.f81705c + ", body=" + Arrays.toString(this.f81706d) + ", contentType=" + this.f81707e + ')';
    }

    public /* synthetic */ i(int i11, String str, Map map, byte[] bArr, String str2, int i12, v vVar) {
        this(i11, str, map, bArr, (i12 & 16) != 0 ? null : str2);
    }
}
