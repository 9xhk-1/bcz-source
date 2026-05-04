package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import a00.g0;
import a00.h0;
import a00.l1;
import a00.r0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m00.c;
import m80.k;
import yz.h1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nKotlinTarget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinTarget.kt\norg/jetbrains/kotlin/descriptors/annotations/KotlinTarget\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,140:1\n774#2:141\n865#2,2:142\n*S KotlinDebug\n*F\n+ 1 KotlinTarget.kt\norg/jetbrains/kotlin/descriptors/annotations/KotlinTarget\n*L\n81#1:141\n81#1:142,2\n*E\n"})
/* loaded from: classes8.dex */
public final class KotlinTarget {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ KotlinTarget[] $VALUES;

    @k
    private static final Set<KotlinTarget> ALL_TARGET_SET;

    @k
    private static final List<KotlinTarget> ANNOTATION_CLASS_LIST;

    @k
    private static final List<KotlinTarget> CLASS_LIST;

    @k
    private static final List<KotlinTarget> COMPANION_OBJECT_LIST;

    @k
    public static final a Companion;

    @k
    private static final Set<KotlinTarget> DEFAULT_TARGET_SET;

    @k
    private static final List<KotlinTarget> ENUM_ENTRY_LIST;

    @k
    private static final List<KotlinTarget> ENUM_LIST;

    @k
    private static final List<KotlinTarget> FILE_LIST;

    @k
    private static final List<KotlinTarget> FUNCTION_LIST;

    @k
    private static final List<KotlinTarget> INTERFACE_LIST;

    @k
    private static final List<KotlinTarget> LOCAL_CLASS_LIST;

    @k
    private static final List<KotlinTarget> OBJECT_LIST;

    @k
    private static final List<KotlinTarget> PROPERTY_GETTER_LIST;

    @k
    private static final List<KotlinTarget> PROPERTY_SETTER_LIST;

    @k
    private static final Map<AnnotationUseSiteTarget, KotlinTarget> USE_SITE_MAPPING;

    @k
    private static final HashMap<String, KotlinTarget> map;

    @k
    private final String description;
    private final boolean isDefault;
    public static final KotlinTarget CLASS = new KotlinTarget("CLASS", 0, "class", false, 2, null);
    public static final KotlinTarget ANNOTATION_CLASS = new KotlinTarget("ANNOTATION_CLASS", 1, "annotation class", false, 2, null);
    public static final KotlinTarget TYPE_PARAMETER = new KotlinTarget("TYPE_PARAMETER", 2, "type parameter", false);
    public static final KotlinTarget PROPERTY = new KotlinTarget("PROPERTY", 3, "property", false, 2, null);
    public static final KotlinTarget FIELD = new KotlinTarget("FIELD", 4, "field", false, 2, null);
    public static final KotlinTarget LOCAL_VARIABLE = new KotlinTarget("LOCAL_VARIABLE", 5, "local variable", false, 2, null);
    public static final KotlinTarget VALUE_PARAMETER = new KotlinTarget("VALUE_PARAMETER", 6, "value parameter", false, 2, null);
    public static final KotlinTarget CONSTRUCTOR = new KotlinTarget("CONSTRUCTOR", 7, "constructor", false, 2, null);
    public static final KotlinTarget FUNCTION = new KotlinTarget("FUNCTION", 8, "function", false, 2, null);
    public static final KotlinTarget PROPERTY_GETTER = new KotlinTarget("PROPERTY_GETTER", 9, "getter", false, 2, null);
    public static final KotlinTarget PROPERTY_SETTER = new KotlinTarget("PROPERTY_SETTER", 10, "setter", false, 2, null);
    public static final KotlinTarget TYPE = new KotlinTarget("TYPE", 11, "type usage", false);
    public static final KotlinTarget EXPRESSION = new KotlinTarget("EXPRESSION", 12, "expression", false);
    public static final KotlinTarget FILE = new KotlinTarget("FILE", 13, "file", false);
    public static final KotlinTarget TYPEALIAS = new KotlinTarget("TYPEALIAS", 14, "typealias", false);
    public static final KotlinTarget TYPE_PROJECTION = new KotlinTarget("TYPE_PROJECTION", 15, "type projection", false);
    public static final KotlinTarget STAR_PROJECTION = new KotlinTarget("STAR_PROJECTION", 16, "star projection", false);
    public static final KotlinTarget PROPERTY_PARAMETER = new KotlinTarget("PROPERTY_PARAMETER", 17, "property constructor parameter", false);
    public static final KotlinTarget CLASS_ONLY = new KotlinTarget("CLASS_ONLY", 18, "class", false);
    public static final KotlinTarget OBJECT = new KotlinTarget("OBJECT", 19, "object", false);
    public static final KotlinTarget STANDALONE_OBJECT = new KotlinTarget("STANDALONE_OBJECT", 20, "standalone object", false);
    public static final KotlinTarget COMPANION_OBJECT = new KotlinTarget("COMPANION_OBJECT", 21, "companion object", false);
    public static final KotlinTarget INTERFACE = new KotlinTarget("INTERFACE", 22, "interface", false);
    public static final KotlinTarget ENUM_CLASS = new KotlinTarget("ENUM_CLASS", 23, "enum class", false);
    public static final KotlinTarget ENUM_ENTRY = new KotlinTarget("ENUM_ENTRY", 24, "enum entry", false);
    public static final KotlinTarget LOCAL_CLASS = new KotlinTarget("LOCAL_CLASS", 25, "local class", false);
    public static final KotlinTarget LOCAL_FUNCTION = new KotlinTarget("LOCAL_FUNCTION", 26, "local function", false);
    public static final KotlinTarget MEMBER_FUNCTION = new KotlinTarget("MEMBER_FUNCTION", 27, "member function", false);
    public static final KotlinTarget TOP_LEVEL_FUNCTION = new KotlinTarget("TOP_LEVEL_FUNCTION", 28, "top level function", false);
    public static final KotlinTarget MEMBER_PROPERTY = new KotlinTarget("MEMBER_PROPERTY", 29, "member property", false);
    public static final KotlinTarget MEMBER_PROPERTY_WITH_BACKING_FIELD = new KotlinTarget("MEMBER_PROPERTY_WITH_BACKING_FIELD", 30, "member property with backing field", false);
    public static final KotlinTarget MEMBER_PROPERTY_WITH_DELEGATE = new KotlinTarget("MEMBER_PROPERTY_WITH_DELEGATE", 31, "member property with delegate", false);
    public static final KotlinTarget MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE = new KotlinTarget("MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 32, "member property without backing field or delegate", false);
    public static final KotlinTarget TOP_LEVEL_PROPERTY = new KotlinTarget("TOP_LEVEL_PROPERTY", 33, "top level property", false);
    public static final KotlinTarget TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD = new KotlinTarget("TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", 34, "top level property with backing field", false);
    public static final KotlinTarget TOP_LEVEL_PROPERTY_WITH_DELEGATE = new KotlinTarget("TOP_LEVEL_PROPERTY_WITH_DELEGATE", 35, "top level property with delegate", false);
    public static final KotlinTarget TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE = new KotlinTarget("TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 36, "top level property without backing field or delegate", false);
    public static final KotlinTarget BACKING_FIELD = new KotlinTarget("BACKING_FIELD", 37, "backing field", false, 2, null);
    public static final KotlinTarget INITIALIZER = new KotlinTarget("INITIALIZER", 38, "initializer", false);
    public static final KotlinTarget DESTRUCTURING_DECLARATION = new KotlinTarget("DESTRUCTURING_DECLARATION", 39, "destructuring declaration", false);
    public static final KotlinTarget LAMBDA_EXPRESSION = new KotlinTarget("LAMBDA_EXPRESSION", 40, "lambda expression", false);
    public static final KotlinTarget ANONYMOUS_FUNCTION = new KotlinTarget("ANONYMOUS_FUNCTION", 41, "anonymous function", false);
    public static final KotlinTarget OBJECT_LITERAL = new KotlinTarget("OBJECT_LITERAL", 42, "object literal", false);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    private static final /* synthetic */ KotlinTarget[] $values() {
        return new KotlinTarget[]{CLASS, ANNOTATION_CLASS, TYPE_PARAMETER, PROPERTY, FIELD, LOCAL_VARIABLE, VALUE_PARAMETER, CONSTRUCTOR, FUNCTION, PROPERTY_GETTER, PROPERTY_SETTER, TYPE, EXPRESSION, FILE, TYPEALIAS, TYPE_PROJECTION, STAR_PROJECTION, PROPERTY_PARAMETER, CLASS_ONLY, OBJECT, STANDALONE_OBJECT, COMPANION_OBJECT, INTERFACE, ENUM_CLASS, ENUM_ENTRY, LOCAL_CLASS, LOCAL_FUNCTION, MEMBER_FUNCTION, TOP_LEVEL_FUNCTION, MEMBER_PROPERTY, MEMBER_PROPERTY_WITH_BACKING_FIELD, MEMBER_PROPERTY_WITH_DELEGATE, MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE, TOP_LEVEL_PROPERTY, TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD, TOP_LEVEL_PROPERTY_WITH_DELEGATE, TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE, BACKING_FIELD, INITIALIZER, DESTRUCTURING_DECLARATION, LAMBDA_EXPRESSION, ANONYMOUS_FUNCTION, OBJECT_LITERAL};
    }

    static {
        KotlinTarget[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
        map = new HashMap<>();
        for (KotlinTarget kotlinTarget : getEntries()) {
            map.put(kotlinTarget.name(), kotlinTarget);
        }
        m00.a<KotlinTarget> entries = getEntries();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entries) {
            if (((KotlinTarget) obj).isDefault) {
                arrayList.add(obj);
            }
        }
        DEFAULT_TARGET_SET = r0.f6(arrayList);
        ALL_TARGET_SET = r0.f6(getEntries());
        KotlinTarget kotlinTarget2 = ANNOTATION_CLASS;
        KotlinTarget kotlinTarget3 = CLASS;
        ANNOTATION_CLASS_LIST = h0.Q(kotlinTarget2, kotlinTarget3);
        LOCAL_CLASS_LIST = h0.Q(LOCAL_CLASS, kotlinTarget3);
        CLASS_LIST = h0.Q(CLASS_ONLY, kotlinTarget3);
        KotlinTarget kotlinTarget4 = COMPANION_OBJECT;
        KotlinTarget kotlinTarget5 = OBJECT;
        COMPANION_OBJECT_LIST = h0.Q(kotlinTarget4, kotlinTarget5, kotlinTarget3);
        OBJECT_LIST = h0.Q(STANDALONE_OBJECT, kotlinTarget5, kotlinTarget3);
        INTERFACE_LIST = h0.Q(INTERFACE, kotlinTarget3);
        ENUM_LIST = h0.Q(ENUM_CLASS, kotlinTarget3);
        KotlinTarget kotlinTarget6 = ENUM_ENTRY;
        KotlinTarget kotlinTarget7 = PROPERTY;
        KotlinTarget kotlinTarget8 = FIELD;
        ENUM_ENTRY_LIST = h0.Q(kotlinTarget6, kotlinTarget7, kotlinTarget8);
        KotlinTarget kotlinTarget9 = PROPERTY_SETTER;
        PROPERTY_SETTER_LIST = g0.l(kotlinTarget9);
        KotlinTarget kotlinTarget10 = PROPERTY_GETTER;
        PROPERTY_GETTER_LIST = g0.l(kotlinTarget10);
        FUNCTION_LIST = g0.l(FUNCTION);
        KotlinTarget kotlinTarget11 = FILE;
        FILE_LIST = g0.l(kotlinTarget11);
        AnnotationUseSiteTarget annotationUseSiteTarget = AnnotationUseSiteTarget.CONSTRUCTOR_PARAMETER;
        KotlinTarget kotlinTarget12 = VALUE_PARAMETER;
        USE_SITE_MAPPING = l1.W(h1.a(annotationUseSiteTarget, kotlinTarget12), h1.a(AnnotationUseSiteTarget.FIELD, kotlinTarget8), h1.a(AnnotationUseSiteTarget.PROPERTY, kotlinTarget7), h1.a(AnnotationUseSiteTarget.FILE, kotlinTarget11), h1.a(AnnotationUseSiteTarget.PROPERTY_GETTER, kotlinTarget10), h1.a(AnnotationUseSiteTarget.PROPERTY_SETTER, kotlinTarget9), h1.a(AnnotationUseSiteTarget.RECEIVER, kotlinTarget12), h1.a(AnnotationUseSiteTarget.SETTER_PARAMETER, kotlinTarget12), h1.a(AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD, kotlinTarget8));
    }

    private KotlinTarget(String str, int i11, String str2, boolean z11) {
        this.description = str2;
        this.isDefault = z11;
    }

    @k
    public static m00.a<KotlinTarget> getEntries() {
        return $ENTRIES;
    }

    public static KotlinTarget valueOf(String str) {
        return (KotlinTarget) Enum.valueOf(KotlinTarget.class, str);
    }

    public static KotlinTarget[] values() {
        return (KotlinTarget[]) $VALUES.clone();
    }

    public /* synthetic */ KotlinTarget(String str, int i11, String str2, boolean z11, int i12, v vVar) {
        this(str, i11, str2, (i12 & 2) != 0 ? true : z11);
    }
}
