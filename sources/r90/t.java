package r90;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class t implements g<Object, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final Set<String> f83872a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83873b;

    public t(String... strArr) {
        HashSet hashSet = new HashSet();
        this.f83872a = hashSet;
        org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.v("Null representation strings", strArr);
        Collections.addAll(hashSet, strArr);
        this.f83873b = strArr[0];
    }

    @Override // r90.g
    public Object a(Object obj) {
        return obj == null ? this.f83873b : obj;
    }

    @Override // r90.g
    public Object b(Object obj) {
        if (obj == null || this.f83872a.contains(String.valueOf(obj))) {
            return null;
        }
        return obj;
    }
}
