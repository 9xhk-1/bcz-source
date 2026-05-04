package com.getui.gtc.base.http;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes6.dex */
public final class Headers {
    private final String[] namesAndValues;

    public static final class Builder {
        final List<String> namesAndValues = new ArrayList(20);

        public final Builder add(String str) {
            int indexOf = str.indexOf(":");
            if (indexOf != -1) {
                return add(str.substring(0, indexOf).trim(), str.substring(indexOf + 1));
            }
            throw new IllegalArgumentException("Unexpected header: ".concat(str));
        }

        public final Builder addAll(Headers headers) {
            int size = headers.size();
            for (int i11 = 0; i11 < size; i11++) {
                addLenient(headers.name(i11), headers.value(i11));
            }
            return this;
        }

        public final Builder addLenient(String str) {
            int indexOf = str.indexOf(":", 1);
            return indexOf != -1 ? addLenient(str.substring(0, indexOf), str.substring(indexOf + 1)) : str.startsWith(":") ? addLenient("", str.substring(1)) : addLenient("", str);
        }

        public final Builder addUnsafeNonAscii(String str, String str2) {
            Headers.checkName(str);
            return addLenient(str, str2);
        }

        public final Headers build() {
            return new Headers(this);
        }

        public final String get(String str) {
            for (int size = this.namesAndValues.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase(this.namesAndValues.get(size))) {
                    return this.namesAndValues.get(size + 1);
                }
            }
            return null;
        }

        public final Builder removeAll(String str) {
            int i11 = 0;
            while (i11 < this.namesAndValues.size()) {
                if (str.equalsIgnoreCase(this.namesAndValues.get(i11))) {
                    this.namesAndValues.remove(i11);
                    this.namesAndValues.remove(i11);
                    i11 -= 2;
                }
                i11 += 2;
            }
            return this;
        }

        public final Builder set(String str, String str2) {
            Headers.checkName(str);
            Headers.checkValue(str2, str);
            removeAll(str);
            addLenient(str, str2);
            return this;
        }

        public final Builder add(String str, String str2) {
            Headers.checkName(str);
            Headers.checkValue(str2, str);
            return addLenient(str, str2);
        }

        public final Builder addLenient(String str, String str2) {
            this.namesAndValues.add(str);
            this.namesAndValues.add(str2.trim());
            return this;
        }
    }

    public static class Util {
        private Util() {
        }

        public static String format(String str, Object... objArr) {
            return String.format(Locale.US, str, objArr);
        }
    }

    public Headers(Builder builder) {
        List<String> list = builder.namesAndValues;
        this.namesAndValues = (String[]) list.toArray(new String[list.size()]);
    }

    public static void checkName(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt <= ' ' || charAt >= 127) {
                throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i11), str));
            }
        }
    }

    public static void checkValue(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("value for name " + str2 + " == null");
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i11), str2, str));
            }
        }
    }

    public static Headers of(Map<String, String> map) {
        if (map == null) {
            throw new NullPointerException("headers == null");
        }
        String[] strArr = new String[map.size() * 2];
        int i11 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() == null || entry.getValue() == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            String trim = entry.getKey().trim();
            String trim2 = entry.getValue().trim();
            checkName(trim);
            checkValue(trim2, trim);
            strArr[i11] = trim;
            strArr[i11 + 1] = trim2;
            i11 += 2;
        }
        return new Headers(strArr);
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        for (int i11 = 0; i11 < strArr.length; i11++) {
            length += this.namesAndValues[i11].length();
        }
        return length;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Headers) && Arrays.equals(((Headers) obj).namesAndValues, this.namesAndValues);
    }

    public final String get(String str) {
        return get(this.namesAndValues, str);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    public final String name(int i11) {
        return this.namesAndValues[i11 * 2];
    }

    public final Set<String> names() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            treeSet.add(name(i11));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        Collections.addAll(builder.namesAndValues, this.namesAndValues);
        return builder;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public final Map<String, List<String>> toMultimap() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            String lowerCase = name(i11).toLowerCase(Locale.US);
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(value(i11));
        }
        return treeMap;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            sb2.append(name(i11));
            sb2.append(": ");
            sb2.append(value(i11));
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public final String value(int i11) {
        return this.namesAndValues[(i11 * 2) + 1];
    }

    public final List<String> values(String str) {
        int size = size();
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < size; i11++) {
            if (str.equalsIgnoreCase(name(i11))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i11));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    private static String get(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public static Headers of(String... strArr) {
        if (strArr == null) {
            throw new NullPointerException("namesAndValues == null");
        }
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        for (int i11 = 0; i11 < strArr2.length; i11++) {
            String str = strArr2[i11];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i11] = str.trim();
        }
        for (int i12 = 0; i12 < strArr2.length; i12 += 2) {
            String str2 = strArr2[i12];
            String str3 = strArr2[i12 + 1];
            checkName(str2);
            checkValue(str3, str2);
        }
        return new Headers(strArr2);
    }
}
