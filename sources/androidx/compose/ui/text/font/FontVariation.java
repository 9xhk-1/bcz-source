package androidx.compose.ui.text.font;

import a00.m0;
import a00.r0;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.v0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,350:1\n114#2,8:351\n114#2,8:359\n114#2,8:367\n114#2,8:375\n114#2,8:383\n114#2,8:391\n114#2,8:399\n*S KotlinDebug\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation\n*L\n211#1:351,8\n233#1:359,8\n255#1:367,8\n270#1:375,8\n286#1:383,8\n311#1:391,8\n333#1:399,8\n*E\n"})
/* loaded from: classes2.dex */
public final class FontVariation {
    public static final int $stable = 0;

    @k
    public static final FontVariation INSTANCE = new FontVariation();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Immutable
    public interface Setting {
        @k
        String getAxisName();

        boolean getNeedsDensity();

        float toVariationValue(@l Density density);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Immutable
    public static final class SettingFloat implements Setting {

        @k
        private final String axisName;
        private final boolean needsDensity;
        private final float value;

        public SettingFloat(@k String str, float f11) {
            this.axisName = str;
            this.value = f11;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingFloat)) {
                return false;
            }
            SettingFloat settingFloat = (SettingFloat) obj;
            return g0.g(getAxisName(), settingFloat.getAxisName()) && this.value == settingFloat.value;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        @k
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public final float getValue() {
            return this.value;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + Float.hashCode(this.value);
        }

        @k
        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.value + ')';
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(@l Density density) {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Immutable
    public static final class SettingInt implements Setting {

        @k
        private final String axisName;
        private final boolean needsDensity;
        private final int value;

        public SettingInt(@k String str, int i11) {
            this.axisName = str;
            this.value = i11;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingInt)) {
                return false;
            }
            SettingInt settingInt = (SettingInt) obj;
            return g0.g(getAxisName(), settingInt.getAxisName()) && this.value == settingInt.value;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        @k
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + this.value;
        }

        @k
        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.value + ')';
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(@l Density density) {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$SettingTextUnit\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,350:1\n131#2,10:351\n*S KotlinDebug\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$SettingTextUnit\n*L\n135#1:351,10\n*E\n"})
    @Immutable
    public static final class SettingTextUnit implements Setting {

        @k
        private final String axisName;
        private final boolean needsDensity;
        private final long value;

        public /* synthetic */ SettingTextUnit(String str, long j11, v vVar) {
            this(str, j11);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingTextUnit)) {
                return false;
            }
            SettingTextUnit settingTextUnit = (SettingTextUnit) obj;
            return g0.g(getAxisName(), settingTextUnit.getAxisName()) && TextUnit.m5306equalsimpl0(this.value, settingTextUnit.value);
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        @k
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        /* renamed from: getValue-XSAIIZE, reason: not valid java name */
        public final long m4694getValueXSAIIZE() {
            return this.value;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + TextUnit.m5310hashCodeimpl(this.value);
        }

        @k
        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + ((Object) TextUnit.m5316toStringimpl(this.value)) + ')';
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(@l Density density) {
            if (density != null) {
                return TextUnit.m5309getValueimpl(this.value) * density.getFontScale();
            }
            InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("density must not be null");
            throw new KotlinNothingValueException();
        }

        private SettingTextUnit(String str, long j11) {
            this.axisName = str;
            this.value = j11;
            this.needsDensity = true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,350:1\n10513#2:351\n10738#2,3:352\n10741#2,3:362\n372#3,7:355\n76#4:365\n96#4,5:366\n102#5,2:371\n34#5,6:373\n104#5:379\n*S KotlinDebug\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n*L\n54#1:351\n54#1:352,3\n54#1:362,3\n54#1:355,7\n55#1:365\n55#1:366,5\n63#1:371,2\n63#1:373,6\n63#1:379\n*E\n"})
    @Immutable
    public static final class Settings {
        public static final int $stable = 0;
        private final boolean needsDensity;

        @k
        private final List<Setting> settings;

        public Settings(@k Setting... settingArr) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z11 = false;
            for (Setting setting : settingArr) {
                String axisName = setting.getAxisName();
                Object obj = linkedHashMap.get(axisName);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(axisName, obj);
                }
                ((List) obj).add(setting);
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.size() != 1) {
                    throw new IllegalArgumentException(('\'' + str + "' must be unique. Actual [ [" + r0.r3(list, null, null, null, 0, null, null, 63, null) + l50.b.f69930l).toString());
                }
                m0.s0(arrayList, list);
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.settings = arrayList2;
            int size = arrayList2.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                if (((Setting) arrayList2.get(i11)).getNeedsDensity()) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            this.needsDensity = z11;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Settings) && g0.g(this.settings, ((Settings) obj).settings);
        }

        public final boolean getNeedsDensity$ui_text_release() {
            return this.needsDensity;
        }

        @k
        public final List<Setting> getSettings() {
            return this.settings;
        }

        public int hashCode() {
            return this.settings.hashCode();
        }
    }

    private FontVariation() {
    }

    @k
    public final Setting Setting(@k String str, float f11) {
        if (!(str.length() == 4)) {
            InlineClassHelperKt.throwIllegalArgumentException("Name must be exactly four characters. Actual: '" + str + '\'');
        }
        return new SettingFloat(str, f11);
    }

    @k
    /* renamed from: Settings-6EWAqTQ, reason: not valid java name */
    public final Settings m4692Settings6EWAqTQ(@k FontWeight fontWeight, int i11, @k Setting... settingArr) {
        v0 v0Var = new v0(3);
        v0Var.a(weight(fontWeight.getWeight()));
        v0Var.a(italic(i11));
        v0Var.b(settingArr);
        return new Settings((Setting[]) v0Var.d(new Setting[v0Var.c()]));
    }

    @k
    public final Setting grade(int i11) {
        boolean z11 = false;
        if (-1000 <= i11 && i11 < 1001) {
            z11 = true;
        }
        if (!z11) {
            InlineClassHelperKt.throwIllegalArgumentException("'GRAD' must be in -1000..1000");
        }
        return new SettingInt("GRAD", i11);
    }

    @k
    public final Setting italic(float f11) {
        boolean z11 = false;
        if (0.0f <= f11 && f11 <= 1.0f) {
            z11 = true;
        }
        if (!z11) {
            InlineClassHelperKt.throwIllegalArgumentException("'ital' must be in 0.0f..1.0f. Actual: " + f11);
        }
        return new SettingFloat("ital", f11);
    }

    @k
    /* renamed from: opticalSizing--R2X_6o, reason: not valid java name */
    public final Setting m4693opticalSizingR2X_6o(long j11) {
        if (!TextUnit.m5312isSpimpl(j11)) {
            InlineClassHelperKt.throwIllegalArgumentException("'opsz' must be provided in sp units");
        }
        return new SettingTextUnit("opsz", j11, null);
    }

    @k
    public final Setting slant(float f11) {
        boolean z11 = false;
        if (-90.0f <= f11 && f11 <= 90.0f) {
            z11 = true;
        }
        if (!z11) {
            InlineClassHelperKt.throwIllegalArgumentException("'slnt' must be in -90f..90f. Actual: " + f11);
        }
        return new SettingFloat("slnt", f11);
    }

    @k
    public final Setting weight(int i11) {
        boolean z11 = false;
        if (1 <= i11 && i11 < 1001) {
            z11 = true;
        }
        if (!z11) {
            InlineClassHelperKt.throwIllegalArgumentException("'wght' value must be in [1, 1000]. Actual: " + i11);
        }
        return new SettingInt("wght", i11);
    }

    @k
    public final Setting width(float f11) {
        if (!(f11 > 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("'wdth' must be strictly > 0.0f. Actual: " + f11);
        }
        return new SettingFloat("wdth", f11);
    }
}
