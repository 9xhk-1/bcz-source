package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class LongSerializationPolicy {
    private static final /* synthetic */ LongSerializationPolicy[] $VALUES;
    public static final LongSerializationPolicy DEFAULT;
    public static final LongSerializationPolicy STRING;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a extends LongSerializationPolicy {
        public a(String str, int i11) {
            super(str, i11, null);
        }

        @Override // com.google.gson.LongSerializationPolicy
        public j serialize(Long l11) {
            return l11 == null ? k.f35047a : new n(l11);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        DEFAULT = aVar;
        LongSerializationPolicy longSerializationPolicy = new LongSerializationPolicy("STRING", 1) { // from class: com.google.gson.LongSerializationPolicy.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.LongSerializationPolicy
            public j serialize(Long l11) {
                return l11 == null ? k.f35047a : new n(l11.toString());
            }
        };
        STRING = longSerializationPolicy;
        $VALUES = new LongSerializationPolicy[]{aVar, longSerializationPolicy};
    }

    private LongSerializationPolicy(String str, int i11) {
    }

    public static LongSerializationPolicy valueOf(String str) {
        return (LongSerializationPolicy) Enum.valueOf(LongSerializationPolicy.class, str);
    }

    public static LongSerializationPolicy[] values() {
        return (LongSerializationPolicy[]) $VALUES.clone();
    }

    public abstract j serialize(Long l11);

    public /* synthetic */ LongSerializationPolicy(String str, int i11, a aVar) {
        this(str, i11);
    }
}
