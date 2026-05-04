package m20;

import a00.a1;
import a00.h0;
import a00.i0;
import a00.k1;
import a00.r0;
import g10.u;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import m80.k;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nJvmNameResolverBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmNameResolverBase.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmNameResolverBase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n1216#2,2:107\n1246#2,4:109\n*S KotlinDebug\n*F\n+ 1 JvmNameResolverBase.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmNameResolverBase\n*L\n101#1:107,2\n101#1:109,4\n*E\n"})
/* loaded from: classes8.dex */
public class g implements k20.c {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f71812d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final String f71813e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final List<String> f71814f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final Map<String, Integer> f71815g;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String[] f71816a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Set<Integer> f71817b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<JvmProtoBuf.StringTableTypes.Record> f71818c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71819a;

        static {
            int[] iArr = new int[JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f71819a = iArr;
        }
    }

    static {
        String r32 = r0.r3(h0.Q('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);
        f71813e = r32;
        List<String> Q = h0.Q(r32 + "/Any", r32 + "/Nothing", r32 + "/Unit", r32 + "/Throwable", r32 + "/Number", r32 + "/Byte", r32 + "/Double", r32 + "/Float", r32 + "/Int", r32 + "/Long", r32 + "/Short", r32 + "/Boolean", r32 + "/Char", r32 + "/CharSequence", r32 + "/String", r32 + "/Comparable", r32 + "/Enum", r32 + "/Array", r32 + "/ByteArray", r32 + "/DoubleArray", r32 + "/FloatArray", r32 + "/IntArray", r32 + "/LongArray", r32 + "/ShortArray", r32 + "/BooleanArray", r32 + "/CharArray", r32 + "/Cloneable", r32 + "/Annotation", r32 + "/collections/Iterable", r32 + "/collections/MutableIterable", r32 + "/collections/Collection", r32 + "/collections/MutableCollection", r32 + "/collections/List", r32 + "/collections/MutableList", r32 + "/collections/Set", r32 + "/collections/MutableSet", r32 + "/collections/Map", r32 + "/collections/MutableMap", r32 + "/collections/Map.Entry", r32 + "/collections/MutableMap.MutableEntry", r32 + "/collections/Iterator", r32 + "/collections/MutableIterator", r32 + "/collections/ListIterator", r32 + "/collections/MutableListIterator");
        f71814f = Q;
        Iterable<a1> m62 = r0.m6(Q);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(k1.j(i0.d0(m62, 10)), 16));
        for (a1 a1Var : m62) {
            linkedHashMap.put((String) a1Var.f(), Integer.valueOf(a1Var.e()));
        }
        f71815g = linkedHashMap;
    }

    public g(@k String[] strings, @k Set<Integer> localNameIndices, @k List<JvmProtoBuf.StringTableTypes.Record> records) {
        g0.p(strings, "strings");
        g0.p(localNameIndices, "localNameIndices");
        g0.p(records, "records");
        this.f71816a = strings;
        this.f71817b = localNameIndices;
        this.f71818c = records;
    }

    @Override // k20.c
    @k
    public String a(int i11) {
        return getString(i11);
    }

    @Override // k20.c
    public boolean b(int i11) {
        return this.f71817b.contains(Integer.valueOf(i11));
    }

    @Override // k20.c
    @k
    public String getString(int i11) {
        String str;
        JvmProtoBuf.StringTableTypes.Record record = this.f71818c.get(i11);
        if (record.hasString()) {
            str = record.getString();
        } else {
            if (record.hasPredefinedIndex()) {
                List<String> list = f71814f;
                int size = list.size();
                int predefinedIndex = record.getPredefinedIndex();
                if (predefinedIndex >= 0 && predefinedIndex < size) {
                    str = list.get(record.getPredefinedIndex());
                }
            }
            str = this.f71816a[i11];
        }
        if (record.getSubstringIndexCount() >= 2) {
            List<Integer> substringIndexList = record.getSubstringIndexList();
            g0.m(substringIndexList);
            Integer num = substringIndexList.get(0);
            Integer num2 = substringIndexList.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= str.length()) {
                g0.m(str);
                g0.m(num);
                int intValue = num.intValue();
                g0.m(num2);
                str = str.substring(intValue, num2.intValue());
                g0.o(str, "substring(...)");
            }
        }
        String str2 = str;
        if (record.getReplaceCharCount() >= 2) {
            List<Integer> replaceCharList = record.getReplaceCharList();
            g0.m(replaceCharList);
            Integer num3 = replaceCharList.get(0);
            Integer num4 = replaceCharList.get(1);
            g0.m(str2);
            str2 = f0.y2(str2, (char) num3.intValue(), (char) num4.intValue(), false, 4, null);
        }
        String str3 = str2;
        JvmProtoBuf.StringTableTypes.Record.Operation operation = record.getOperation();
        if (operation == null) {
            operation = JvmProtoBuf.StringTableTypes.Record.Operation.NONE;
        }
        int i12 = b.f71819a[operation.ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                g0.m(str3);
                str3 = f0.y2(str3, '$', '.', false, 4, null);
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (str3.length() >= 2) {
                    g0.m(str3);
                    str3 = str3.substring(1, str3.length() - 1);
                    g0.o(str3, "substring(...)");
                }
                String str4 = str3;
                g0.m(str4);
                str3 = f0.y2(str4, '$', '.', false, 4, null);
            }
        }
        g0.m(str3);
        return str3;
    }
}
