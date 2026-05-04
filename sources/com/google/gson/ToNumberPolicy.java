package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class ToNumberPolicy implements r {
    private static final /* synthetic */ ToNumberPolicy[] $VALUES;
    public static final ToNumberPolicy BIG_DECIMAL;
    public static final ToNumberPolicy DOUBLE;
    public static final ToNumberPolicy LAZILY_PARSED_NUMBER;
    public static final ToNumberPolicy LONG_OR_DOUBLE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a extends ToNumberPolicy {
        public a(String str, int i11) {
            super(str, i11, null);
        }

        @Override // com.google.gson.r
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Double a(cp.a aVar) throws IOException {
            return Double.valueOf(aVar.U());
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        DOUBLE = aVar;
        ToNumberPolicy toNumberPolicy = new ToNumberPolicy("LAZILY_PARSED_NUMBER", 1) { // from class: com.google.gson.ToNumberPolicy.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.r
            public Number a(cp.a aVar2) throws IOException {
                return new LazilyParsedNumber(aVar2.h0());
            }
        };
        LAZILY_PARSED_NUMBER = toNumberPolicy;
        ToNumberPolicy toNumberPolicy2 = new ToNumberPolicy("LONG_OR_DOUBLE", 2) { // from class: com.google.gson.ToNumberPolicy.c
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.r
            public Number a(cp.a aVar2) throws IOException, JsonParseException {
                String h02 = aVar2.h0();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(h02));
                    } catch (NumberFormatException unused) {
                        Double valueOf = Double.valueOf(h02);
                        if (!valueOf.isInfinite()) {
                            if (valueOf.isNaN()) {
                            }
                            return valueOf;
                        }
                        if (!aVar2.H()) {
                            throw new MalformedJsonException("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar2.C());
                        }
                        return valueOf;
                    }
                } catch (NumberFormatException e11) {
                    throw new JsonParseException("Cannot parse " + h02 + "; at path " + aVar2.C(), e11);
                }
            }
        };
        LONG_OR_DOUBLE = toNumberPolicy2;
        ToNumberPolicy toNumberPolicy3 = new ToNumberPolicy("BIG_DECIMAL", 3) { // from class: com.google.gson.ToNumberPolicy.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.r
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public BigDecimal a(cp.a aVar2) throws IOException {
                String h02 = aVar2.h0();
                try {
                    return new BigDecimal(h02);
                } catch (NumberFormatException e11) {
                    throw new JsonParseException("Cannot parse " + h02 + "; at path " + aVar2.C(), e11);
                }
            }
        };
        BIG_DECIMAL = toNumberPolicy3;
        $VALUES = new ToNumberPolicy[]{aVar, toNumberPolicy, toNumberPolicy2, toNumberPolicy3};
    }

    private ToNumberPolicy(String str, int i11) {
    }

    public static ToNumberPolicy valueOf(String str) {
        return (ToNumberPolicy) Enum.valueOf(ToNumberPolicy.class, str);
    }

    public static ToNumberPolicy[] values() {
        return (ToNumberPolicy[]) $VALUES.clone();
    }

    public /* synthetic */ ToNumberPolicy(String str, int i11, a aVar) {
        this(str, i11);
    }
}
