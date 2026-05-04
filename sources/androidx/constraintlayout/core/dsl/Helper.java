package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Constraint;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class Helper {
    protected static final Map<Constraint.Side, String> sideMap;
    protected static final Map<Type, String> typeMap;
    protected String config;
    protected Map<String, String> configMap;
    protected final String name;
    protected HelperType type;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class HelperType {
        final String mName;

        public HelperType(String str) {
            this.mName = str;
        }

        public String toString() {
            return this.mName;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Type {
        VERTICAL_GUIDELINE,
        HORIZONTAL_GUIDELINE,
        VERTICAL_CHAIN,
        HORIZONTAL_CHAIN,
        BARRIER
    }

    static {
        HashMap hashMap = new HashMap();
        sideMap = hashMap;
        hashMap.put(Constraint.Side.LEFT, "'left'");
        hashMap.put(Constraint.Side.RIGHT, "'right'");
        hashMap.put(Constraint.Side.TOP, "'top'");
        hashMap.put(Constraint.Side.BOTTOM, "'bottom'");
        hashMap.put(Constraint.Side.START, "'start'");
        hashMap.put(Constraint.Side.END, "'end'");
        hashMap.put(Constraint.Side.BASELINE, "'baseline'");
        HashMap hashMap2 = new HashMap();
        typeMap = hashMap2;
        hashMap2.put(Type.VERTICAL_GUIDELINE, "vGuideline");
        hashMap2.put(Type.HORIZONTAL_GUIDELINE, "hGuideline");
        hashMap2.put(Type.VERTICAL_CHAIN, "vChain");
        hashMap2.put(Type.HORIZONTAL_CHAIN, "hChain");
        hashMap2.put(Type.BARRIER, "barrier");
    }

    public Helper(String str, HelperType helperType) {
        this.type = null;
        this.configMap = new HashMap();
        this.name = str;
        this.type = helperType;
    }

    public static void main(String[] strArr) {
        System.out.println(new Barrier("abc", "['a1', 'b2']").toString());
    }

    public void append(Map<String, String> map, StringBuilder sb2) {
        if (map.isEmpty()) {
            return;
        }
        for (String str : map.keySet()) {
            sb2.append(str);
            sb2.append(":");
            sb2.append(map.get(str));
            sb2.append(",\n");
        }
    }

    public Map<String, String> convertConfigToMap() {
        String str = this.config;
        if (str == null || str.length() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < this.config.length(); i13++) {
            char charAt = this.config.charAt(i13);
            if (charAt == ':') {
                str2 = sb2.toString();
                sb2.setLength(0);
            } else if (charAt == ',' && i11 == 0 && i12 == 0) {
                hashMap.put(str2, sb2.toString());
                sb2.setLength(0);
                str2 = "";
            } else if (charAt != ' ') {
                if (charAt == '[') {
                    i11++;
                } else if (charAt == ']') {
                    i11--;
                } else if (charAt == '{') {
                    i12++;
                } else if (charAt == '}') {
                    i12--;
                }
                sb2.append(charAt);
            }
        }
        hashMap.put(str2, sb2.toString());
        return hashMap;
    }

    public String getConfig() {
        return this.config;
    }

    public String getId() {
        return this.name;
    }

    public HelperType getType() {
        return this.type;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.name + ":{\n");
        if (this.type != null) {
            sb2.append("type:'");
            sb2.append(this.type.toString());
            sb2.append("',\n");
        }
        Map<String, String> map = this.configMap;
        if (map != null) {
            append(map, sb2);
        }
        sb2.append("},\n");
        return sb2.toString();
    }

    public Helper(String str, HelperType helperType, String str2) {
        this.type = null;
        this.configMap = new HashMap();
        this.name = str;
        this.type = helperType;
        this.config = str2;
        this.configMap = convertConfigToMap();
    }
}
