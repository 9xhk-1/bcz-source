package jp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class j0 extends t {
    @Override // jp.t
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public i0 k(com.google.zxing.k kVar) {
        String substring;
        String g11;
        String c11 = t.c(kVar);
        if (!c11.startsWith("WIFI:") || (g11 = t.g("S:", (substring = c11.substring(5)), l70.f.f70689d, false)) == null || g11.isEmpty()) {
            return null;
        }
        String g12 = t.g("P:", substring, l70.f.f70689d, false);
        String g13 = t.g("T:", substring, l70.f.f70689d, false);
        if (g13 == null) {
            g13 = "nopass";
        }
        return new i0(g13, g11, g12, Boolean.parseBoolean(t.g("H:", substring, l70.f.f70689d, false)), t.g("I:", substring, l70.f.f70689d, false), t.g("A:", substring, l70.f.f70689d, false), t.g("E:", substring, l70.f.f70689d, false), t.g("H:", substring, l70.f.f70689d, false));
    }
}
