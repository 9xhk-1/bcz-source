package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ValueElement {
    public static final int $stable = 8;

    @m80.k
    private final String name;

    @m80.l
    private final Object value;

    public ValueElement(@m80.k String str, @m80.l Object obj) {
        this.name = str;
        this.value = obj;
    }

    public static /* synthetic */ ValueElement copy$default(ValueElement valueElement, String str, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            str = valueElement.name;
        }
        if ((i11 & 2) != 0) {
            obj = valueElement.value;
        }
        return valueElement.copy(str, obj);
    }

    @m80.k
    public final String component1() {
        return this.name;
    }

    @m80.l
    public final Object component2() {
        return this.value;
    }

    @m80.k
    public final ValueElement copy(@m80.k String str, @m80.l Object obj) {
        return new ValueElement(str, obj);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValueElement)) {
            return false;
        }
        ValueElement valueElement = (ValueElement) obj;
        return kotlin.jvm.internal.g0.g(this.name, valueElement.name) && kotlin.jvm.internal.g0.g(this.value, valueElement.value);
    }

    @m80.k
    public final String getName() {
        return this.name;
    }

    @m80.l
    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        Object obj = this.value;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    @m80.k
    public String toString() {
        return "ValueElement(name=" + this.name + ", value=" + this.value + ')';
    }
}
