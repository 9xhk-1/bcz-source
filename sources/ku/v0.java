package ku;

import com.typesafe.config.ConfigException;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import ku.j0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class v0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Comparator<s0> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(s0 s0Var, s0 s0Var2) {
            return s0Var2.e() - s0Var.e();
        }
    }

    public static String a(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0) {
            return null;
        }
        return str.substring(0, lastIndexOf);
    }

    public static <K, V> c b(ju.m mVar, Set<Map.Entry<K, V>> set) {
        return d(mVar, g(set), true);
    }

    public static c c(ju.m mVar, Map<?, ?> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (!(key instanceof String)) {
                throw new ConfigException.BugOrBroken("Map has a non-string as a key, expecting a path expression as a String");
            }
            hashMap.put(s0.g((String) key), entry.getValue());
        }
        return d(mVar, hashMap, false);
    }

    public static c d(ju.m mVar, Map<s0, Object> map, boolean z11) {
        HashSet hashSet = new HashSet();
        HashSet<s0> hashSet2 = new HashSet();
        for (s0 s0Var : map.keySet()) {
            hashSet2.add(s0Var);
            for (s0 h11 = s0Var.h(); h11 != null; h11 = h11.h()) {
                hashSet.add(h11);
            }
        }
        if (z11) {
            hashSet2.removeAll(hashSet);
        } else {
            for (s0 s0Var2 : hashSet2) {
                if (hashSet.contains(s0Var2)) {
                    throw new ConfigException.BugOrBroken("In the map, path '" + s0Var2.k() + "' occurs as both the parent object of a value and as a value. Because Map has no defined ordering, this is a broken situation.");
                }
            }
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            hashMap2.put((s0) it.next(), new HashMap());
        }
        for (s0 s0Var3 : hashSet2) {
            s0 h12 = s0Var3.h();
            Map map2 = h12 != null ? (Map) hashMap2.get(h12) : hashMap;
            String d11 = s0Var3.d();
            Object obj = map.get(s0Var3);
            ju.t aVar = z11 ? obj instanceof String ? new j0.a(mVar, (String) obj) : null : p.s(map.get(s0Var3), mVar, m0.KEYS_ARE_PATHS);
            if (aVar != null) {
                map2.put(d11, aVar);
            }
        }
        ArrayList<s0> arrayList = new ArrayList();
        arrayList.addAll(hashSet);
        Collections.sort(arrayList, new a());
        for (s0 s0Var4 : arrayList) {
            Map map3 = (Map) hashMap2.get(s0Var4);
            s0 h13 = s0Var4.h();
            (h13 != null ? (Map) hashMap2.get(h13) : hashMap).put(s0Var4.d(), new w1(mVar, map3, b1.RESOLVED, false));
        }
        return new w1(mVar, hashMap, b1.RESOLVED, false);
    }

    public static c e(ju.m mVar, Properties properties) {
        return b(mVar, properties.entrySet());
    }

    public static c f(ju.m mVar, Map<String, String> map) {
        return b(mVar, map.entrySet());
    }

    public static <K, V> Map<s0, Object> g(Set<Map.Entry<K, V>> set) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<K, V> entry : set) {
            K key = entry.getKey();
            if (key instanceof String) {
                hashMap.put(j((String) key), entry.getValue());
            }
        }
        return hashMap;
    }

    public static String h(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf < 0 ? str : str.substring(lastIndexOf + 1);
    }

    public static c i(Reader reader, ju.m mVar) throws IOException {
        Properties properties = new Properties();
        properties.load(reader);
        return e(mVar, properties);
    }

    public static s0 j(String str) {
        String h11 = h(str);
        String a11 = a(str);
        s0 s0Var = new s0(h11, null);
        while (a11 != null) {
            String h12 = h(a11);
            a11 = a(a11);
            s0Var = new s0(h12, s0Var);
        }
        return s0Var;
    }
}
