package com.vivo.push.model;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private String f45041a;

    /* renamed from: b, reason: collision with root package name */
    private String f45042b;

    public a(String str, String str2) {
        this.f45041a = str;
        this.f45042b = str2;
    }

    public final String a() {
        return this.f45041a;
    }

    public final String b() {
        return this.f45042b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f45041a;
        if (str == null) {
            if (aVar.f45041a != null) {
                return false;
            }
        } else if (!str.equals(aVar.f45041a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f45041a;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public final String toString() {
        return "ConfigItem{mKey='" + this.f45041a + "', mValue='" + this.f45042b + '\'' + l50.b.f69928j;
    }
}
