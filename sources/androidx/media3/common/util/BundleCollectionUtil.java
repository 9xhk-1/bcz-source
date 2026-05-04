package androidx.media3.common.util;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class BundleCollectionUtil {
    private BundleCollectionUtil() {
    }

    public static HashMap<String, String> bundleToStringHashMap(Bundle bundle) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (bundle != Bundle.EMPTY) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    hashMap.put(str, string);
                }
            }
        }
        return hashMap;
    }

    public static ImmutableMap<String, String> bundleToStringImmutableMap(Bundle bundle) {
        return bundle == Bundle.EMPTY ? ImmutableMap.of() : ImmutableMap.copyOf((Map) bundleToStringHashMap(bundle));
    }

    public static void ensureClassLoader(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) Util.castNonNull(BundleCollectionUtil.class.getClassLoader()));
        }
    }

    public static <T> ImmutableList<T> fromBundleList(ho.r<Bundle, T> rVar, List<Bundle> list) {
        ImmutableList.a builder = ImmutableList.builder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            builder.g(rVar.apply((Bundle) Assertions.checkNotNull(list.get(i11))));
        }
        return builder.e();
    }

    public static <T> SparseArray<T> fromBundleSparseArray(ho.r<Bundle, T> rVar, SparseArray<Bundle> sparseArray) {
        SparseArray<T> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            sparseArray2.put(sparseArray.keyAt(i11), rVar.apply(sparseArray.valueAt(i11)));
        }
        return sparseArray2;
    }

    public static Bundle getBundleWithDefault(Bundle bundle, String str, Bundle bundle2) {
        Bundle bundle3 = bundle.getBundle(str);
        return bundle3 != null ? bundle3 : bundle2;
    }

    public static ArrayList<Integer> getIntegerArrayListWithDefault(Bundle bundle, String str, ArrayList<Integer> arrayList) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str);
        return integerArrayList != null ? integerArrayList : arrayList;
    }

    public static Bundle stringMapToBundle(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public static <T> ArrayList<Bundle> toBundleArrayList(Collection<T> collection, ho.r<T, Bundle> rVar) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(rVar.apply(it.next()));
        }
        return arrayList;
    }

    public static <T> ImmutableList<Bundle> toBundleList(List<T> list, ho.r<T, Bundle> rVar) {
        ImmutableList.a builder = ImmutableList.builder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            builder.g(rVar.apply(list.get(i11)));
        }
        return builder.e();
    }

    public static <T> SparseArray<Bundle> toBundleSparseArray(SparseArray<T> sparseArray, ho.r<T, Bundle> rVar) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            sparseArray2.put(sparseArray.keyAt(i11), rVar.apply(sparseArray.valueAt(i11)));
        }
        return sparseArray2;
    }
}
