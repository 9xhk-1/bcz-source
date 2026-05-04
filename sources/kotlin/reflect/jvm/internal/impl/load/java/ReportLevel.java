package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class ReportLevel {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ ReportLevel[] $VALUES;

    @k
    public static final a Companion;

    @k
    private final String description;
    public static final ReportLevel IGNORE = new ReportLevel("IGNORE", 0, "ignore");
    public static final ReportLevel WARN = new ReportLevel("WARN", 1, "warn");
    public static final ReportLevel STRICT = new ReportLevel("STRICT", 2, "strict");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nReportLevel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportLevel.kt\norg/jetbrains/kotlin/load/java/ReportLevel$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,20:1\n1310#2,2:21\n*S KotlinDebug\n*F\n+ 1 ReportLevel.kt\norg/jetbrains/kotlin/load/java/ReportLevel$Companion\n*L\n15#1:21,2\n*E\n"})
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    private static final /* synthetic */ ReportLevel[] $values() {
        return new ReportLevel[]{IGNORE, WARN, STRICT};
    }

    static {
        ReportLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
        Companion = new a(null);
    }

    private ReportLevel(String str, int i11, String str2) {
        this.description = str2;
    }

    public static ReportLevel valueOf(String str) {
        return (ReportLevel) Enum.valueOf(ReportLevel.class, str);
    }

    public static ReportLevel[] values() {
        return (ReportLevel[]) $VALUES.clone();
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    public final boolean isIgnore() {
        return this == IGNORE;
    }

    public final boolean isWarning() {
        return this == WARN;
    }
}
