package px;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f81296a;

    /* renamed from: b, reason: collision with root package name */
    public final int f81297b;

    public a(@k String regexRaw, int i11, boolean z11) {
        g0.p(regexRaw, "regexRaw");
        if (z11) {
            regexRaw = '(' + regexRaw + ')';
        }
        this.f81296a = regexRaw;
        this.f81297b = z11 ? i11 + 1 : i11;
    }

    public final int a() {
        return this.f81297b;
    }

    @k
    public final String b() {
        return this.f81296a;
    }

    public /* synthetic */ a(String str, int i11, boolean z11, int i12, v vVar) {
        this(str, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? false : z11);
    }
}
