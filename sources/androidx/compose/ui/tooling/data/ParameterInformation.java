package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@UiToolingDataApi
/* loaded from: classes2.dex */
public final class ParameterInformation {
    public static final int $stable = 8;
    private final boolean compared;
    private final boolean fromDefault;

    @l
    private final String inlineClass;

    @k
    private final String name;
    private final boolean stable;

    /* renamed from: static, reason: not valid java name */
    private final boolean f32static;

    @l
    private final Object value;

    public ParameterInformation(@k String str, @l Object obj, boolean z11, boolean z12, boolean z13, @l String str2, boolean z14) {
        this.name = str;
        this.value = obj;
        this.fromDefault = z11;
        this.f32static = z12;
        this.compared = z13;
        this.inlineClass = str2;
        this.stable = z14;
    }

    public static /* synthetic */ ParameterInformation copy$default(ParameterInformation parameterInformation, String str, Object obj, boolean z11, boolean z12, boolean z13, String str2, boolean z14, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            str = parameterInformation.name;
        }
        if ((i11 & 2) != 0) {
            obj = parameterInformation.value;
        }
        if ((i11 & 4) != 0) {
            z11 = parameterInformation.fromDefault;
        }
        if ((i11 & 8) != 0) {
            z12 = parameterInformation.f32static;
        }
        if ((i11 & 16) != 0) {
            z13 = parameterInformation.compared;
        }
        if ((i11 & 32) != 0) {
            str2 = parameterInformation.inlineClass;
        }
        if ((i11 & 64) != 0) {
            z14 = parameterInformation.stable;
        }
        String str3 = str2;
        boolean z15 = z14;
        boolean z16 = z13;
        boolean z17 = z11;
        return parameterInformation.copy(str, obj, z17, z12, z16, str3, z15);
    }

    @k
    public final String component1() {
        return this.name;
    }

    @l
    public final Object component2() {
        return this.value;
    }

    public final boolean component3() {
        return this.fromDefault;
    }

    public final boolean component4() {
        return this.f32static;
    }

    public final boolean component5() {
        return this.compared;
    }

    @l
    public final String component6() {
        return this.inlineClass;
    }

    public final boolean component7() {
        return this.stable;
    }

    @k
    public final ParameterInformation copy(@k String str, @l Object obj, boolean z11, boolean z12, boolean z13, @l String str2, boolean z14) {
        return new ParameterInformation(str, obj, z11, z12, z13, str2, z14);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParameterInformation)) {
            return false;
        }
        ParameterInformation parameterInformation = (ParameterInformation) obj;
        return g0.g(this.name, parameterInformation.name) && g0.g(this.value, parameterInformation.value) && this.fromDefault == parameterInformation.fromDefault && this.f32static == parameterInformation.f32static && this.compared == parameterInformation.compared && g0.g(this.inlineClass, parameterInformation.inlineClass) && this.stable == parameterInformation.stable;
    }

    public final boolean getCompared() {
        return this.compared;
    }

    public final boolean getFromDefault() {
        return this.fromDefault;
    }

    @l
    public final String getInlineClass() {
        return this.inlineClass;
    }

    @k
    public final String getName() {
        return this.name;
    }

    public final boolean getStable() {
        return this.stable;
    }

    public final boolean getStatic() {
        return this.f32static;
    }

    @l
    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        Object obj = this.value;
        int hashCode2 = (((((((hashCode + (obj == null ? 0 : obj.hashCode())) * 31) + Boolean.hashCode(this.fromDefault)) * 31) + Boolean.hashCode(this.f32static)) * 31) + Boolean.hashCode(this.compared)) * 31;
        String str = this.inlineClass;
        return ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.stable);
    }

    @k
    public String toString() {
        return "ParameterInformation(name=" + this.name + ", value=" + this.value + ", fromDefault=" + this.fromDefault + ", static=" + this.f32static + ", compared=" + this.compared + ", inlineClass=" + this.inlineClass + ", stable=" + this.stable + ')';
    }
}
