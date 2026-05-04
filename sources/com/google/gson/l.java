package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class l extends j {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedTreeMap<String, j> f35048a = new LinkedTreeMap<>();

    public void A(String str, Character ch2) {
        y(str, ch2 == null ? k.f35047a : new n(ch2));
    }

    public void B(String str, Number number) {
        y(str, number == null ? k.f35047a : new n(number));
    }

    public void C(String str, String str2) {
        y(str, str2 == null ? k.f35047a : new n(str2));
    }

    @Override // com.google.gson.j
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public l a() {
        l lVar = new l();
        for (Map.Entry<String, j> entry : this.f35048a.entrySet()) {
            lVar.y(entry.getKey(), entry.getValue().a());
        }
        return lVar;
    }

    public j E(String str) {
        return this.f35048a.get(str);
    }

    public g F(String str) {
        return (g) this.f35048a.get(str);
    }

    public l G(String str) {
        return (l) this.f35048a.get(str);
    }

    public n H(String str) {
        return (n) this.f35048a.get(str);
    }

    public boolean I(String str) {
        return this.f35048a.containsKey(str);
    }

    public Set<String> J() {
        return this.f35048a.keySet();
    }

    public j K(String str) {
        return this.f35048a.remove(str);
    }

    public Set<Map.Entry<String, j>> entrySet() {
        return this.f35048a.entrySet();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof l) && ((l) obj).f35048a.equals(this.f35048a);
        }
        return true;
    }

    public int hashCode() {
        return this.f35048a.hashCode();
    }

    public int size() {
        return this.f35048a.size();
    }

    public void y(String str, j jVar) {
        LinkedTreeMap<String, j> linkedTreeMap = this.f35048a;
        if (jVar == null) {
            jVar = k.f35047a;
        }
        linkedTreeMap.put(str, jVar);
    }

    public void z(String str, Boolean bool) {
        y(str, bool == null ? k.f35047a : new n(bool));
    }
}
