package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class Ref {
    private String mId;
    private float mPostMargin;
    private float mPreMargin;
    private float mWeight;

    public Ref(String str) {
        this.mWeight = Float.NaN;
        this.mPreMargin = Float.NaN;
        this.mPostMargin = Float.NaN;
        this.mId = str;
    }

    public static void addStringToReferences(String str, ArrayList<Ref> arrayList) {
        Object obj;
        if (str == null || str.length() == 0) {
            return;
        }
        Object[] objArr = new Object[4];
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char charAt = str.charAt(i13);
            if (charAt != ' ' && charAt != '\'') {
                if (charAt == ',') {
                    if (i11 < 3) {
                        objArr[i11] = sb2.toString();
                        sb2.setLength(0);
                        i11++;
                    }
                    if (i12 == 1 && (obj = objArr[0]) != null) {
                        arrayList.add(new Ref(obj.toString()));
                        objArr[0] = null;
                        i11 = 0;
                    }
                } else if (charAt == '[') {
                    i12++;
                } else if (charAt != ']') {
                    sb2.append(charAt);
                } else if (i12 > 0) {
                    i12--;
                    objArr[i11] = sb2.toString();
                    sb2.setLength(0);
                    Object obj2 = objArr[0];
                    if (obj2 != null) {
                        arrayList.add(new Ref(obj2.toString(), parseFloat(objArr[1]), parseFloat(objArr[2]), parseFloat(objArr[3])));
                        Arrays.fill(objArr, (Object) null);
                        i11 = 0;
                    }
                }
            }
        }
    }

    public static float parseFloat(Object obj) {
        try {
            return Float.parseFloat(obj.toString());
        } catch (Exception unused) {
            return Float.NaN;
        }
    }

    public static Ref parseStringToRef(String str) {
        String[] split = str.replaceAll("[\\[\\]\\']", "").split(",");
        if (split.length == 0) {
            return null;
        }
        Object[] objArr = new Object[4];
        for (int i11 = 0; i11 < split.length && i11 < 4; i11++) {
            objArr[i11] = split[i11];
        }
        return new Ref(objArr[0].toString().replace("'", ""), parseFloat(objArr[1]), parseFloat(objArr[2]), parseFloat(objArr[3]));
    }

    public String getId() {
        return this.mId;
    }

    public float getPostMargin() {
        return this.mPostMargin;
    }

    public float getPreMargin() {
        return this.mPreMargin;
    }

    public float getWeight() {
        return this.mWeight;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setPostMargin(float f11) {
        this.mPostMargin = f11;
    }

    public void setPreMargin(float f11) {
        this.mPreMargin = f11;
    }

    public void setWeight(float f11) {
        this.mWeight = f11;
    }

    public String toString() {
        String str = this.mId;
        if (str == null || str.length() == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = (Float.isNaN(this.mWeight) && Float.isNaN(this.mPreMargin) && Float.isNaN(this.mPostMargin)) ? false : true;
        if (z11) {
            sb2.append("[");
        }
        sb2.append("'");
        sb2.append(this.mId);
        sb2.append("'");
        if (!Float.isNaN(this.mPostMargin)) {
            sb2.append(",");
            sb2.append(!Float.isNaN(this.mWeight) ? this.mWeight : 0.0f);
            sb2.append(",");
            sb2.append(Float.isNaN(this.mPreMargin) ? 0.0f : this.mPreMargin);
            sb2.append(",");
            sb2.append(this.mPostMargin);
        } else if (!Float.isNaN(this.mPreMargin)) {
            sb2.append(",");
            sb2.append(Float.isNaN(this.mWeight) ? 0.0f : this.mWeight);
            sb2.append(",");
            sb2.append(this.mPreMargin);
        } else if (!Float.isNaN(this.mWeight)) {
            sb2.append(",");
            sb2.append(this.mWeight);
        }
        if (z11) {
            sb2.append("]");
        }
        sb2.append(",");
        return sb2.toString();
    }

    public Ref(String str, float f11) {
        this.mPreMargin = Float.NaN;
        this.mPostMargin = Float.NaN;
        this.mId = str;
        this.mWeight = f11;
    }

    public Ref(String str, float f11, float f12) {
        this.mPostMargin = Float.NaN;
        this.mId = str;
        this.mWeight = f11;
        this.mPreMargin = f12;
    }

    public Ref(String str, float f11, float f12, float f13) {
        this.mId = str;
        this.mWeight = f11;
        this.mPreMargin = f12;
        this.mPostMargin = f13;
    }
}
