package ku;

import com.typesafe.config.ConfigValueType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import ku.j0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class l0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Comparator<Map.Entry<Integer, d>> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Map.Entry<Integer, d> entry, Map.Entry<Integer, d> entry2) {
            return Integer.compare(entry.getKey().intValue(), entry2.getKey().intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f68745a;

        static {
            int[] iArr = new int[ConfigValueType.values().length];
            f68745a = iArr;
            try {
                iArr[ConfigValueType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68745a[ConfigValueType.NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68745a[ConfigValueType.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68745a[ConfigValueType.LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f68745a[ConfigValueType.OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f68745a[ConfigValueType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static d a(d dVar, ConfigValueType configValueType) {
        ConfigValueType valueType = dVar.valueType();
        ConfigValueType configValueType2 = ConfigValueType.STRING;
        if (valueType == configValueType2) {
            String str = (String) dVar.c();
            int i11 = b.f68745a[configValueType.ordinal()];
            if (i11 == 1) {
                try {
                    try {
                        return new t(dVar.g(), Long.parseLong(str), str);
                    } catch (NumberFormatException unused) {
                        return new m(dVar.g(), Double.parseDouble(str), str);
                    }
                } catch (NumberFormatException unused2) {
                }
            } else if (i11 != 2) {
                if (i11 == 3) {
                    if (str.equals(n6.m.f74525c) || str.equals(ma.b.H0) || str.equals(c40.t0.f7979d)) {
                        return new h(dVar.g(), true);
                    }
                    if (str.equals("false") || str.equals(ma.b.I0) || str.equals(c40.t0.f7980e)) {
                        return new h(dVar.g(), false);
                    }
                }
            } else if (str.equals("null")) {
                return new f0(dVar.g());
            }
        } else if (configValueType == configValueType2) {
            int i12 = b.f68745a[dVar.valueType().ordinal()];
            if (i12 == 1 || i12 == 3) {
                return new j0.a(dVar.g(), dVar.Q0());
            }
        } else if (configValueType == ConfigValueType.LIST && dVar.valueType() == ConfigValueType.OBJECT) {
            c cVar = (c) dVar;
            HashMap hashMap = new HashMap();
            for (String str2 : cVar.keySet()) {
                try {
                    int parseInt = Integer.parseInt(str2, 10);
                    if (parseInt >= 0) {
                        hashMap.put(Integer.valueOf(parseInt), cVar.get(str2));
                    }
                } catch (NumberFormatException unused3) {
                }
            }
            if (!hashMap.isEmpty()) {
                ArrayList arrayList = new ArrayList(hashMap.entrySet());
                Collections.sort(arrayList, new a());
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((Map.Entry) it.next()).getValue());
                }
                return new v1(dVar.g(), arrayList2);
            }
        }
        return dVar;
    }
}
