package com.xiaomi.push;

import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes8.dex */
public final class it {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator f46147a = new a();

    public static class a implements Comparator {
        private a() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            if (obj == null && obj2 == null) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            return obj instanceof List ? it.a((List) obj, (List) obj2) : obj instanceof Set ? it.a((Set) obj, (Set) obj2) : obj instanceof Map ? it.a((Map) obj, (Map) obj2) : obj instanceof byte[] ? it.a((byte[]) obj, (byte[]) obj2) : it.a((Comparable) obj, (Comparable) obj2);
        }
    }

    public static int a(byte b11, byte b12) {
        if (b11 < b12) {
            return -1;
        }
        return b12 < b11 ? 1 : 0;
    }

    public static int a(int i11, int i12) {
        if (i11 < i12) {
            return -1;
        }
        return i12 < i11 ? 1 : 0;
    }

    public static int a(long j11, long j12) {
        if (j11 < j12) {
            return -1;
        }
        return j12 < j11 ? 1 : 0;
    }

    public static int a(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static int a(String str, String str2) {
        return str.compareTo(str2);
    }

    public static int a(ByteBuffer byteBuffer, byte[] bArr, int i11) {
        int remaining = byteBuffer.remaining();
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), bArr, i11, remaining);
        return remaining;
    }

    public static int a(List list, List list2) {
        int a11 = a(list.size(), list2.size());
        if (a11 != 0) {
            return a11;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            int compare = f46147a.compare(list.get(i11), list2.get(i11));
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    public static int a(Map map, Map map2) {
        int a11 = a(map.size(), map2.size());
        if (a11 != 0) {
            return a11;
        }
        Comparator comparator = f46147a;
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        Iterator it = treeMap.entrySet().iterator();
        TreeMap treeMap2 = new TreeMap(comparator);
        treeMap2.putAll(map2);
        Iterator it2 = treeMap2.entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            Comparator comparator2 = f46147a;
            int compare = comparator2.compare(entry.getKey(), entry2.getKey());
            if (compare != 0) {
                return compare;
            }
            int compare2 = comparator2.compare(entry.getValue(), entry2.getValue());
            if (compare2 != 0) {
                return compare2;
            }
        }
        return 0;
    }

    public static int a(Set set, Set set2) {
        int a11 = a(set.size(), set2.size());
        if (a11 != 0) {
            return a11;
        }
        Comparator comparator = f46147a;
        TreeSet treeSet = new TreeSet(comparator);
        treeSet.addAll(set);
        TreeSet treeSet2 = new TreeSet(comparator);
        treeSet2.addAll(set2);
        Iterator it = treeSet.iterator();
        Iterator it2 = treeSet2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compare = f46147a.compare(it.next(), it2.next());
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    public static int a(short s11, short s12) {
        if (s11 < s12) {
            return -1;
        }
        return s12 < s11 ? 1 : 0;
    }

    public static int a(boolean z11, boolean z12) {
        return Boolean.valueOf(z11).compareTo(Boolean.valueOf(z12));
    }

    public static int a(byte[] bArr, byte[] bArr2) {
        int a11 = a(bArr.length, bArr2.length);
        if (a11 != 0) {
            return a11;
        }
        for (int i11 = 0; i11 < bArr.length; i11++) {
            int a12 = a(bArr[i11], bArr2[i11]);
            if (a12 != 0) {
                return a12;
            }
        }
        return 0;
    }

    public static String a(byte b11) {
        return Integer.toHexString((b11 | 256) & 511).toUpperCase().substring(1);
    }

    public static ByteBuffer a(ByteBuffer byteBuffer) {
        return m6151a(byteBuffer) ? byteBuffer : ByteBuffer.wrap(m6152a(byteBuffer));
    }

    public static void a(ByteBuffer byteBuffer, StringBuilder sb2) {
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset();
        int limit = byteBuffer.limit();
        int i11 = limit - arrayOffset > 128 ? arrayOffset + 128 : limit;
        for (int i12 = arrayOffset; i12 < i11; i12++) {
            if (i12 > arrayOffset) {
                sb2.append(" ");
            }
            sb2.append(a(array[i12]));
        }
        if (limit != i11) {
            sb2.append("...");
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m6151a(ByteBuffer byteBuffer) {
        return byteBuffer.hasArray() && byteBuffer.position() == 0 && byteBuffer.arrayOffset() == 0 && byteBuffer.remaining() == byteBuffer.capacity();
    }

    /* renamed from: a, reason: collision with other method in class */
    public static byte[] m6152a(ByteBuffer byteBuffer) {
        if (m6151a(byteBuffer)) {
            return byteBuffer.array();
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        a(byteBuffer, bArr, 0);
        return bArr;
    }
}
