package org.apache.thrift;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import okhttp3.i;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class TBaseHelper {
    private static final Comparator comparator = new NestedStructureComparator();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class NestedStructureComparator implements Comparator, Serializable {
        private NestedStructureComparator() {
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
            return obj instanceof List ? TBaseHelper.compareTo((List) obj, (List) obj2) : obj instanceof Set ? TBaseHelper.compareTo((Set) obj, (Set) obj2) : obj instanceof Map ? TBaseHelper.compareTo((Map) obj, (Map) obj2) : obj instanceof byte[] ? TBaseHelper.compareTo((byte[]) obj, (byte[]) obj2) : TBaseHelper.compareTo((Comparable) obj, (Comparable) obj2);
        }
    }

    private TBaseHelper() {
    }

    public static byte[] byteBufferToByteArray(ByteBuffer byteBuffer) {
        if (wrapsFullArray(byteBuffer)) {
            return byteBuffer.array();
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBufferToByteArray(byteBuffer, bArr, 0);
        return bArr;
    }

    public static int compareTo(byte b11, byte b12) {
        if (b11 < b12) {
            return -1;
        }
        return b12 < b11 ? 1 : 0;
    }

    public static ByteBuffer copyBinary(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(new byte[byteBuffer.remaining()]);
        if (byteBuffer.hasArray()) {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), wrap.array(), 0, byteBuffer.remaining());
            return wrap;
        }
        byteBuffer.slice().get(wrap.array());
        return wrap;
    }

    public static String paddedByteString(byte b11) {
        return Integer.toHexString((b11 | 256) & 511).toUpperCase().substring(1);
    }

    public static ByteBuffer rightSize(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        return wrapsFullArray(byteBuffer) ? byteBuffer : ByteBuffer.wrap(byteBufferToByteArray(byteBuffer));
    }

    public static void toString(Collection<ByteBuffer> collection, StringBuilder sb2) {
        Iterator<ByteBuffer> it = collection.iterator();
        if (!it.hasNext()) {
            sb2.append(i.f77289p);
            return;
        }
        sb2.append("[");
        while (true) {
            toString(it.next(), sb2);
            if (!it.hasNext()) {
                sb2.append("]");
                return;
            }
            sb2.append(j2.O);
        }
    }

    public static boolean wrapsFullArray(ByteBuffer byteBuffer) {
        return byteBuffer.hasArray() && byteBuffer.position() == 0 && byteBuffer.arrayOffset() == 0 && byteBuffer.remaining() == byteBuffer.capacity();
    }

    public static int compareTo(double d11, double d12) {
        if (d11 < d12) {
            return -1;
        }
        return d12 < d11 ? 1 : 0;
    }

    public static int compareTo(int i11, int i12) {
        if (i11 < i12) {
            return -1;
        }
        return i12 < i11 ? 1 : 0;
    }

    public static int compareTo(long j11, long j12) {
        if (j11 < j12) {
            return -1;
        }
        return j12 < j11 ? 1 : 0;
    }

    public static int byteBufferToByteArray(ByteBuffer byteBuffer, byte[] bArr, int i11) {
        int remaining = byteBuffer.remaining();
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), bArr, i11, remaining);
        return remaining;
    }

    public static int compareTo(short s11, short s12) {
        if (s11 < s12) {
            return -1;
        }
        return s12 < s11 ? 1 : 0;
    }

    public static byte[] copyBinary(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int compareTo(Object obj, Object obj2) {
        if (obj instanceof Comparable) {
            return compareTo((Comparable) obj, (Comparable) obj2);
        }
        if (obj instanceof List) {
            return compareTo((List) obj, (List) obj2);
        }
        if (obj instanceof Set) {
            return compareTo((Set) obj, (Set) obj2);
        }
        if (obj instanceof Map) {
            return compareTo((Map) obj, (Map) obj2);
        }
        if (obj instanceof byte[]) {
            return compareTo((byte[]) obj, (byte[]) obj2);
        }
        throw new IllegalArgumentException("Cannot compare objects of type " + obj.getClass());
    }

    public static void toString(ByteBuffer byteBuffer, StringBuilder sb2) {
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset();
        int position = byteBuffer.position() + arrayOffset;
        int limit = arrayOffset + byteBuffer.limit();
        int i11 = limit - position > 128 ? position + 128 : limit;
        for (int i12 = position; i12 < i11; i12++) {
            if (i12 > position) {
                sb2.append(" ");
            }
            sb2.append(paddedByteString(array[i12]));
        }
        if (limit != i11) {
            sb2.append("...");
        }
    }

    public static int compareTo(boolean z11, boolean z12) {
        return Boolean.valueOf(z11).compareTo(Boolean.valueOf(z12));
    }

    public static int compareTo(String str, String str2) {
        return str.compareTo(str2);
    }

    public static int compareTo(byte[] bArr, byte[] bArr2) {
        int compareTo = compareTo(bArr.length, bArr2.length);
        if (compareTo != 0) {
            return compareTo;
        }
        for (int i11 = 0; i11 < bArr.length; i11++) {
            int compareTo2 = compareTo(bArr[i11], bArr2[i11]);
            if (compareTo2 != 0) {
                return compareTo2;
            }
        }
        return 0;
    }

    public static int compareTo(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static int compareTo(List list, List list2) {
        int compareTo = compareTo(list.size(), list2.size());
        if (compareTo != 0) {
            return compareTo;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            int compare = comparator.compare(list.get(i11), list2.get(i11));
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    public static int compareTo(Set set, Set set2) {
        int compareTo = compareTo(set.size(), set2.size());
        if (compareTo != 0) {
            return compareTo;
        }
        Comparator comparator2 = comparator;
        TreeSet treeSet = new TreeSet(comparator2);
        treeSet.addAll(set);
        TreeSet treeSet2 = new TreeSet(comparator2);
        treeSet2.addAll(set2);
        Iterator it = treeSet.iterator();
        Iterator it2 = treeSet2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compare = comparator.compare(it.next(), it2.next());
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    public static int compareTo(Map map, Map map2) {
        int compareTo = compareTo(map.size(), map2.size());
        if (compareTo != 0) {
            return compareTo;
        }
        Comparator comparator2 = comparator;
        TreeMap treeMap = new TreeMap(comparator2);
        treeMap.putAll(map);
        Iterator it = treeMap.entrySet().iterator();
        TreeMap treeMap2 = new TreeMap(comparator2);
        treeMap2.putAll(map2);
        Iterator it2 = treeMap2.entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            Comparator comparator3 = comparator;
            int compare = comparator3.compare(entry.getKey(), entry2.getKey());
            if (compare != 0) {
                return compare;
            }
            int compare2 = comparator3.compare(entry.getValue(), entry2.getValue());
            if (compare2 != 0) {
                return compare2;
            }
        }
        return 0;
    }
}
