package kotlin.reflect.jvm.internal.impl.builtins.functions;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import kotlin.reflect.jvm.internal.impl.builtins.functions.e;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class FunctionClassKind {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ FunctionClassKind[] $VALUES;

    @k
    public static final a Companion;
    public static final FunctionClassKind Function = new FunctionClassKind("Function", 0);
    public static final FunctionClassKind SuspendFunction = new FunctionClassKind("SuspendFunction", 1);
    public static final FunctionClassKind KFunction = new FunctionClassKind("KFunction", 2);
    public static final FunctionClassKind KSuspendFunction = new FunctionClassKind("KSuspendFunction", 3);
    public static final FunctionClassKind UNKNOWN = new FunctionClassKind("UNKNOWN", 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final FunctionClassKind a(@k e functionTypeKind) {
            g0.p(functionTypeKind, "functionTypeKind");
            return g0.g(functionTypeKind, e.a.f67204e) ? FunctionClassKind.Function : g0.g(functionTypeKind, e.d.f67207e) ? FunctionClassKind.SuspendFunction : g0.g(functionTypeKind, e.b.f67205e) ? FunctionClassKind.KFunction : g0.g(functionTypeKind, e.c.f67206e) ? FunctionClassKind.KSuspendFunction : FunctionClassKind.UNKNOWN;
        }

        public a() {
        }
    }

    private static final /* synthetic */ FunctionClassKind[] $values() {
        return new FunctionClassKind[]{Function, SuspendFunction, KFunction, KSuspendFunction, UNKNOWN};
    }

    static {
        FunctionClassKind[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
        Companion = new a(null);
    }

    private FunctionClassKind(String str, int i11) {
    }

    public static FunctionClassKind valueOf(String str) {
        return (FunctionClassKind) Enum.valueOf(FunctionClassKind.class, str);
    }

    public static FunctionClassKind[] values() {
        return (FunctionClassKind[]) $VALUES.clone();
    }
}
