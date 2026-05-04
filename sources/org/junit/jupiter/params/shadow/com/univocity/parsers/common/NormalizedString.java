package org.junit.jupiter.params.shadow.com.univocity.parsers.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class NormalizedString implements Serializable, Comparable<NormalizedString>, CharSequence {
    private static final long serialVersionUID = -3904288692735859811L;
    private static final f0<NormalizedString> stringCache = new a();
    private final int hashCode;
    private final boolean literal;
    private final String normalized;
    private final String original;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends f0<NormalizedString> {
        @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.f0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public NormalizedString f(String str) {
            a aVar = null;
            if (str == null) {
                return null;
            }
            return new NormalizedString(str, aVar);
        }
    }

    public /* synthetic */ NormalizedString(String str, a aVar) {
        this(str);
    }

    public static f0<NormalizedString> getCache() {
        return stringCache;
    }

    private static <T extends Collection<NormalizedString>> T getCollection(T t11, String... strArr) {
        Collections.addAll(t11, toArray(strArr));
        return t11;
    }

    private static <T extends Collection<String>> T getStringCollection(T t11, Collection<NormalizedString> collection) {
        Collections.addAll(t11, toStringArray(collection));
        return t11;
    }

    public static boolean identifyLiterals(NormalizedString[] normalizedStringArr) {
        return identifyLiterals(normalizedStringArr, false, false);
    }

    public static NormalizedString literalValueOf(String str) {
        if (str == null) {
            return null;
        }
        return stringCache.c('\'' + str + "'");
    }

    private String normalize(Object obj) {
        return String.valueOf(obj).trim().toLowerCase();
    }

    private static boolean shouldBeLiteral(String str, boolean z11, boolean z12) {
        if (z11 || z12) {
            for (int i11 = 0; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (z12 && !Character.isUpperCase(charAt)) {
                    return true;
                }
                if (z11 && !Character.isLowerCase(charAt)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static NormalizedString[] toArray(Collection<String> collection) {
        if (collection == null) {
            throw new IllegalArgumentException("String collection cannot be null");
        }
        int size = collection.size();
        NormalizedString[] normalizedStringArr = new NormalizedString[size];
        Iterator<String> it = collection.iterator();
        for (int i11 = 0; i11 < size; i11++) {
            normalizedStringArr[i11] = valueOf(it.next());
        }
        return normalizedStringArr;
    }

    public static ArrayList<NormalizedString> toArrayList(String... strArr) {
        return (ArrayList) getCollection(new ArrayList(), strArr);
    }

    public static ArrayList<String> toArrayListOfStrings(NormalizedString... normalizedStringArr) {
        return (ArrayList) getCollection(new ArrayList(), normalizedStringArr);
    }

    public static HashSet<NormalizedString> toHashSet(String... strArr) {
        return (HashSet) getCollection(new HashSet(), strArr);
    }

    public static HashSet<String> toHashSetOfStrings(NormalizedString... normalizedStringArr) {
        return (HashSet) getCollection(new HashSet(), normalizedStringArr);
    }

    public static NormalizedString[] toIdentifierGroupArray(NormalizedString[] normalizedStringArr) {
        identifyLiterals(normalizedStringArr);
        return normalizedStringArr;
    }

    public static LinkedHashSet<NormalizedString> toLinkedHashSet(String... strArr) {
        return (LinkedHashSet) getCollection(new LinkedHashSet(), strArr);
    }

    public static LinkedHashSet<String> toLinkedHashSetOfStrings(NormalizedString... normalizedStringArr) {
        return (LinkedHashSet) getCollection(new LinkedHashSet(), normalizedStringArr);
    }

    public static String[] toStringArray(Collection<NormalizedString> collection) {
        if (collection == null) {
            throw new IllegalArgumentException("String collection cannot be null");
        }
        int size = collection.size();
        String[] strArr = new String[size];
        Iterator<NormalizedString> it = collection.iterator();
        for (int i11 = 0; i11 < size; i11++) {
            strArr[i11] = valueOf(it.next());
        }
        return strArr;
    }

    public static TreeSet<NormalizedString> toTreeSet(String... strArr) {
        return (TreeSet) getCollection(new TreeSet(), strArr);
    }

    public static TreeSet<String> toTreeSetOfStrings(NormalizedString... normalizedStringArr) {
        return (TreeSet) getCollection(new TreeSet(), normalizedStringArr);
    }

    public static NormalizedString[] toUniqueArray(String... strArr) {
        d.w("Element array", strArr);
        NormalizedString[] array = toArray(strArr);
        NormalizedString[] normalizedStringArr = (NormalizedString[]) d.b(array);
        if (normalizedStringArr.length <= 0) {
            return array;
        }
        throw new IllegalArgumentException("Duplicate elements found: " + Arrays.toString(normalizedStringArr));
    }

    public static NormalizedString valueOf(Object obj) {
        if (obj == null) {
            return null;
        }
        return stringCache.c(obj.toString());
    }

    @Override // java.lang.CharSequence
    public char charAt(int i11) {
        return this.original.charAt(i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof NormalizedString)) {
            return this.literal ? this.original.equals(String.valueOf(obj)) : this.normalized.equals(normalize(obj));
        }
        NormalizedString normalizedString = (NormalizedString) obj;
        return (this.literal || normalizedString.literal) ? this.original.equals(normalizedString.original) : this.normalized.equals(normalizedString.normalized);
    }

    public int hashCode() {
        return this.hashCode;
    }

    public boolean isLiteral() {
        return this.literal;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.original.length();
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i11, int i12) {
        return this.original.subSequence(i11, i12);
    }

    public NormalizedString toLiteral() {
        return this.literal ? this : literalValueOf(this.original);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.original;
    }

    private NormalizedString(String str) {
        String trim = str.trim();
        if (trim.length() > 2 && trim.charAt(0) == '\'' && trim.charAt(trim.length() - 1) == '\'') {
            String substring = str.substring(1, str.length() - 1);
            this.original = substring;
            this.normalized = substring;
            this.hashCode = normalize(substring).hashCode();
            this.literal = true;
            return;
        }
        this.original = str;
        String normalize = normalize(str);
        this.normalized = normalize;
        this.hashCode = normalize.hashCode();
        this.literal = false;
    }

    private static <T extends Collection<NormalizedString>> T getCollection(T t11, Collection<String> collection) {
        Collections.addAll(t11, toArray(collection));
        return t11;
    }

    public static boolean identifyLiterals(NormalizedString[] normalizedStringArr, boolean z11, boolean z12) {
        if (normalizedStringArr == null) {
            return false;
        }
        TreeMap treeMap = new TreeMap();
        boolean z13 = false;
        for (int i11 = 0; i11 < normalizedStringArr.length; i11++) {
            NormalizedString normalizedString = normalizedStringArr[i11];
            if (normalizedString != null && !normalizedString.isLiteral()) {
                if (shouldBeLiteral(normalizedString.original, z11, z12)) {
                    normalizedStringArr[i11] = literalValueOf(normalizedString.original);
                } else {
                    Object[] objArr = (Object[]) treeMap.get(normalizedString);
                    if (objArr == null || normalizedString.original.equals(((NormalizedString) objArr[0]).original)) {
                        treeMap.put(normalizedString, new Object[]{normalizedString, Integer.valueOf(i11)});
                    } else {
                        normalizedStringArr[i11] = literalValueOf(normalizedString.original);
                        z13 = true;
                        normalizedStringArr[((Integer) objArr[1]).intValue()] = ((NormalizedString) objArr[0]).toLiteral();
                    }
                }
            }
        }
        return z13;
    }

    public static ArrayList<NormalizedString> toArrayList(Collection<String> collection) {
        return (ArrayList) getCollection(new ArrayList(), collection);
    }

    public static ArrayList<String> toArrayListOfStrings(Collection<NormalizedString> collection) {
        return (ArrayList) getStringCollection(new ArrayList(), collection);
    }

    public static HashSet<NormalizedString> toHashSet(Collection<String> collection) {
        return (HashSet) getCollection(new HashSet(), collection);
    }

    public static HashSet<String> toHashSetOfStrings(Collection<NormalizedString> collection) {
        return (HashSet) getStringCollection(new HashSet(), collection);
    }

    public static NormalizedString[] toIdentifierGroupArray(String[] strArr) {
        NormalizedString[] array = toArray(strArr);
        identifyLiterals(array, false, false);
        return array;
    }

    public static LinkedHashSet<NormalizedString> toLinkedHashSet(Collection<String> collection) {
        return (LinkedHashSet) getCollection(new LinkedHashSet(), collection);
    }

    public static LinkedHashSet<String> toLinkedHashSetOfStrings(Collection<NormalizedString> collection) {
        return (LinkedHashSet) getStringCollection(new LinkedHashSet(), collection);
    }

    public static TreeSet<NormalizedString> toTreeSet(Collection<String> collection) {
        return (TreeSet) getCollection(new TreeSet(), collection);
    }

    public static TreeSet<String> toTreeSetOfStrings(Collection<NormalizedString> collection) {
        return (TreeSet) getStringCollection(new TreeSet(), collection);
    }

    public static NormalizedString valueOf(String str) {
        if (str == null) {
            return null;
        }
        return stringCache.c(str);
    }

    @Override // java.lang.Comparable
    public int compareTo(NormalizedString normalizedString) {
        if (normalizedString == this) {
            return 0;
        }
        return (this.literal || normalizedString.literal) ? this.original.compareTo(normalizedString.original) : this.normalized.compareTo(normalizedString.normalized);
    }

    private static <T extends Collection<String>> T getCollection(T t11, NormalizedString... normalizedStringArr) {
        Collections.addAll(t11, toArray(normalizedStringArr));
        return t11;
    }

    public static String valueOf(NormalizedString normalizedString) {
        if (normalizedString == null) {
            return null;
        }
        return normalizedString.original;
    }

    public static NormalizedString[] toArray(String... strArr) {
        if (strArr == null) {
            return null;
        }
        if (strArr.length == 0) {
            return d.f78086b;
        }
        NormalizedString[] normalizedStringArr = new NormalizedString[strArr.length];
        for (int i11 = 0; i11 < strArr.length; i11++) {
            normalizedStringArr[i11] = valueOf(strArr[i11]);
        }
        return normalizedStringArr;
    }

    public int compareTo(String str) {
        return compareTo(valueOf(str));
    }

    public static String[] toArray(NormalizedString... normalizedStringArr) {
        if (normalizedStringArr == null) {
            return null;
        }
        if (normalizedStringArr.length == 0) {
            return d.f78085a;
        }
        String[] strArr = new String[normalizedStringArr.length];
        for (int i11 = 0; i11 < normalizedStringArr.length; i11++) {
            strArr[i11] = valueOf(normalizedStringArr[i11]);
        }
        return strArr;
    }
}
