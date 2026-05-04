package kotlinx.serialization;

import f50.f;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f
/* loaded from: classes8.dex */
public final class MissingFieldException extends SerializationException {

    @k
    private final List<String> missingFields;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(@k List<String> missingFields, @l String str, @l Throwable th2) {
        super(str, th2);
        g0.p(missingFields, "missingFields");
        this.missingFields = missingFields;
    }

    @k
    public final List<String> getMissingFields() {
        return this.missingFields;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MissingFieldException(@m80.k java.util.List<java.lang.String> r3, @m80.k java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "missingFields"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "serialName"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.size()
            r1 = 1
            if (r0 != r1) goto L37
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Field '"
            r0.append(r1)
            r1 = 0
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r1 = "' is required for type with serial name '"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "', but it was missing"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            goto L55
        L37:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fields "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " are required for type with serial name '"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "', but they were missing"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L55:
            r0 = 0
            r2.<init>(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.MissingFieldException.<init>(java.util.List, java.lang.String):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(@k String missingField, @k String serialName) {
        this(a00.g0.l(missingField), "Field '" + missingField + "' is required for type with serial name '" + serialName + "', but it was missing", null);
        g0.p(missingField, "missingField");
        g0.p(serialName, "serialName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @v0
    public MissingFieldException(@k String missingField) {
        this(a00.g0.l(missingField), "Field '" + missingField + "' is required, but it was missing", null);
        g0.p(missingField, "missingField");
    }
}
