package androidx.constraintlayout.core.parser;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class CLNumber extends CLElement {
    float mValue;

    public CLNumber(char[] cArr) {
        super(cArr);
        this.mValue = Float.NaN;
    }

    public static CLElement allocate(char[] cArr) {
        return new CLNumber(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CLNumber) {
            float f11 = getFloat();
            float f12 = ((CLNumber) obj).getFloat();
            if ((Float.isNaN(f11) && Float.isNaN(f12)) || f11 == f12) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public float getFloat() {
        if (Float.isNaN(this.mValue) && hasContent()) {
            this.mValue = Float.parseFloat(content());
        }
        return this.mValue;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int getInt() {
        if (Float.isNaN(this.mValue) && hasContent()) {
            this.mValue = Integer.parseInt(content());
        }
        return (int) this.mValue;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        float f11 = this.mValue;
        return hashCode + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }

    public boolean isInt() {
        float f11 = getFloat();
        return ((float) ((int) f11)) == f11;
    }

    public void putValue(float f11) {
        this.mValue = f11;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i11, int i12) {
        StringBuilder sb2 = new StringBuilder();
        addIndent(sb2, i11);
        float f11 = getFloat();
        int i13 = (int) f11;
        if (i13 == f11) {
            sb2.append(i13);
        } else {
            sb2.append(f11);
        }
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        float f11 = getFloat();
        int i11 = (int) f11;
        if (i11 == f11) {
            return "" + i11;
        }
        return "" + f11;
    }

    public CLNumber(float f11) {
        super(null);
        this.mValue = f11;
    }
}
