package io.ktor.http.content;

import ix.g1;
import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class VersionCheckResult {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ VersionCheckResult[] $VALUES;
    public static final VersionCheckResult NOT_MODIFIED;
    public static final VersionCheckResult OK;
    public static final VersionCheckResult PRECONDITION_FAILED;

    @k
    private final g1 statusCode;

    private static final /* synthetic */ VersionCheckResult[] $values() {
        return new VersionCheckResult[]{OK, NOT_MODIFIED, PRECONDITION_FAILED};
    }

    static {
        g1.a aVar = g1.f62797c;
        OK = new VersionCheckResult("OK", 0, aVar.C());
        NOT_MODIFIED = new VersionCheckResult("NOT_MODIFIED", 1, aVar.B());
        PRECONDITION_FAILED = new VersionCheckResult("PRECONDITION_FAILED", 2, aVar.H());
        VersionCheckResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private VersionCheckResult(String str, int i11, g1 g1Var) {
        this.statusCode = g1Var;
    }

    @k
    public static a<VersionCheckResult> getEntries() {
        return $ENTRIES;
    }

    public static VersionCheckResult valueOf(String str) {
        return (VersionCheckResult) Enum.valueOf(VersionCheckResult.class, str);
    }

    public static VersionCheckResult[] values() {
        return (VersionCheckResult[]) $VALUES.clone();
    }

    @k
    public final g1 getStatusCode() {
        return this.statusCode;
    }
}
