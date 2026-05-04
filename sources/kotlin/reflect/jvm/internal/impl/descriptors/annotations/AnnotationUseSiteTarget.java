package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.huawei.hms.push.constant.RemoteMessageConst;
import ct.d;
import kotlin.jvm.internal.v;
import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class AnnotationUseSiteTarget {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AnnotationUseSiteTarget[] $VALUES;

    @k
    private final String renderName;
    public static final AnnotationUseSiteTarget FIELD = new AnnotationUseSiteTarget("FIELD", 0, null, 1, null);
    public static final AnnotationUseSiteTarget FILE = new AnnotationUseSiteTarget("FILE", 1, null, 1, null);
    public static final AnnotationUseSiteTarget PROPERTY = new AnnotationUseSiteTarget("PROPERTY", 2, null, 1, null);
    public static final AnnotationUseSiteTarget PROPERTY_GETTER = new AnnotationUseSiteTarget("PROPERTY_GETTER", 3, d.f46852f);
    public static final AnnotationUseSiteTarget PROPERTY_SETTER = new AnnotationUseSiteTarget("PROPERTY_SETTER", 4, d.f46854h);
    public static final AnnotationUseSiteTarget RECEIVER = new AnnotationUseSiteTarget("RECEIVER", 5, 0 == true ? 1 : 0, 1, null);
    public static final AnnotationUseSiteTarget CONSTRUCTOR_PARAMETER = new AnnotationUseSiteTarget("CONSTRUCTOR_PARAMETER", 6, RemoteMessageConst.MessageBody.PARAM);
    public static final AnnotationUseSiteTarget SETTER_PARAMETER = new AnnotationUseSiteTarget("SETTER_PARAMETER", 7, "setparam");
    public static final AnnotationUseSiteTarget PROPERTY_DELEGATE_FIELD = new AnnotationUseSiteTarget("PROPERTY_DELEGATE_FIELD", 8, "delegate");

    private static final /* synthetic */ AnnotationUseSiteTarget[] $values() {
        return new AnnotationUseSiteTarget[]{FIELD, FILE, PROPERTY, PROPERTY_GETTER, PROPERTY_SETTER, RECEIVER, CONSTRUCTOR_PARAMETER, SETTER_PARAMETER, PROPERTY_DELEGATE_FIELD};
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        AnnotationUseSiteTarget[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private AnnotationUseSiteTarget(String str, int i11, String str2) {
        this.renderName = str2 == null ? m30.a.f(name()) : str2;
    }

    public static AnnotationUseSiteTarget valueOf(String str) {
        return (AnnotationUseSiteTarget) Enum.valueOf(AnnotationUseSiteTarget.class, str);
    }

    public static AnnotationUseSiteTarget[] values() {
        return (AnnotationUseSiteTarget[]) $VALUES.clone();
    }

    @k
    public final String getRenderName() {
        return this.renderName;
    }

    public /* synthetic */ AnnotationUseSiteTarget(String str, int i11, String str2, int i12, v vVar) {
        this(str, i11, (i12 & 1) != 0 ? null : str2);
    }
}
