package r90;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.DataProcessingException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class c extends v<Boolean> {

    /* renamed from: c, reason: collision with root package name */
    public String f83849c;

    /* renamed from: d, reason: collision with root package name */
    public String f83850d;

    /* renamed from: e, reason: collision with root package name */
    public final Set<String> f83851e;

    /* renamed from: f, reason: collision with root package name */
    public final Set<String> f83852f;

    public c(String[] strArr, String[] strArr2) {
        this(null, null, strArr, strArr2);
    }

    public static Boolean t(String str, Set<String> set, Set<String> set2) {
        String v11 = v(str);
        if (set2.contains(v11)) {
            return Boolean.FALSE;
        }
        if (set.contains(v11)) {
            return Boolean.TRUE;
        }
        DataProcessingException dataProcessingException = new DataProcessingException("Unable to convert '{value}' to Boolean. Allowed Strings are: " + set + " for true; and " + set2 + " for false.");
        dataProcessingException.setValue(str);
        throw dataProcessingException;
    }

    public static Boolean u(String str, String[] strArr, String[] strArr2) {
        if (strArr == null || strArr.length == 0) {
            strArr = new String[]{n6.m.f74525c};
        }
        if (strArr2 == null || strArr2.length == 0) {
            strArr2 = new String[]{"false"};
        }
        c cVar = new c(strArr, strArr2);
        return t(str, cVar.f83852f, cVar.f83851e);
    }

    public static String v(String str) {
        if (str == null) {
            return null;
        }
        return str.trim().toLowerCase();
    }

    public static void w(Collection<String> collection) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection.size());
        for (String str : collection) {
            if (str == null) {
                linkedHashSet.add(null);
            } else {
                linkedHashSet.add(str.trim().toLowerCase());
            }
        }
        collection.clear();
        collection.addAll(linkedHashSet);
    }

    @Override // r90.v
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Boolean l(String str) {
        return str != null ? t(str, this.f83852f, this.f83851e) : (Boolean) super.n();
    }

    @Override // r90.v
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public String a(Boolean bool) {
        if (bool != null) {
            if (Boolean.FALSE.equals(bool)) {
                return this.f83850d;
            }
            if (Boolean.TRUE.equals(bool)) {
                return this.f83849c;
            }
        }
        return m();
    }

    public c(Boolean bool, String str, String[] strArr, String[] strArr2) {
        super(bool, str);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        this.f83851e = linkedHashSet;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        this.f83852f = linkedHashSet2;
        org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.w("Values for true", strArr);
        org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.w("Values for false", strArr2);
        Collections.addAll(linkedHashSet, strArr2);
        Collections.addAll(linkedHashSet2, strArr);
        w(linkedHashSet);
        w(linkedHashSet2);
        for (String str2 : linkedHashSet) {
            if (this.f83852f.contains(str2)) {
                throw new DataProcessingException("Ambiguous string representation for both false and true values: '" + str2 + '\'');
            }
        }
        this.f83849c = strArr[0];
        this.f83850d = strArr2[0];
    }
}
