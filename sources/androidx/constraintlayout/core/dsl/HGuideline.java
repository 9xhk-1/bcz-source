package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Helper;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
class HGuideline extends Guideline {
    public HGuideline(String str) {
        super(str);
        this.type = new Helper.HelperType(Helper.typeMap.get(Helper.Type.HORIZONTAL_GUIDELINE));
    }

    public HGuideline(String str, String str2) {
        super(str);
        this.config = str2;
        this.type = new Helper.HelperType(Helper.typeMap.get(Helper.Type.HORIZONTAL_GUIDELINE));
        this.configMap = convertConfigToMap();
    }
}
