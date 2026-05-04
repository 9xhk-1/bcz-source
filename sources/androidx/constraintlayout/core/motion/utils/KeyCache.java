package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class KeyCache {
    HashMap<Object, HashMap<String, float[]>> mMap = new HashMap<>();

    public float getFloatValue(Object obj, String str, int i11) {
        HashMap<String, float[]> hashMap;
        float[] fArr;
        if (this.mMap.containsKey(obj) && (hashMap = this.mMap.get(obj)) != null && hashMap.containsKey(str) && (fArr = hashMap.get(str)) != null && fArr.length > i11) {
            return fArr[i11];
        }
        return Float.NaN;
    }

    public void setFloatValue(Object obj, String str, int i11, float f11) {
        if (!this.mMap.containsKey(obj)) {
            HashMap<String, float[]> hashMap = new HashMap<>();
            float[] fArr = new float[i11 + 1];
            fArr[i11] = f11;
            hashMap.put(str, fArr);
            this.mMap.put(obj, hashMap);
            return;
        }
        HashMap<String, float[]> hashMap2 = this.mMap.get(obj);
        if (hashMap2 == null) {
            hashMap2 = new HashMap<>();
        }
        if (!hashMap2.containsKey(str)) {
            float[] fArr2 = new float[i11 + 1];
            fArr2[i11] = f11;
            hashMap2.put(str, fArr2);
            this.mMap.put(obj, hashMap2);
            return;
        }
        float[] fArr3 = hashMap2.get(str);
        if (fArr3 == null) {
            fArr3 = new float[0];
        }
        if (fArr3.length <= i11) {
            fArr3 = Arrays.copyOf(fArr3, i11 + 1);
        }
        fArr3[i11] = f11;
        hashMap2.put(str, fArr3);
    }
}
