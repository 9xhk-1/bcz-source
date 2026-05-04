package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class FieldNamingPolicy implements com.google.gson.c {
    private static final /* synthetic */ FieldNamingPolicy[] $VALUES;
    public static final FieldNamingPolicy IDENTITY;
    public static final FieldNamingPolicy LOWER_CASE_WITH_DASHES;
    public static final FieldNamingPolicy LOWER_CASE_WITH_DOTS;
    public static final FieldNamingPolicy LOWER_CASE_WITH_UNDERSCORES;
    public static final FieldNamingPolicy UPPER_CAMEL_CASE;
    public static final FieldNamingPolicy UPPER_CAMEL_CASE_WITH_SPACES;
    public static final FieldNamingPolicy UPPER_CASE_WITH_UNDERSCORES;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a extends FieldNamingPolicy {
        public a(String str, int i11) {
            super(str, i11, null);
        }

        @Override // com.google.gson.c
        public String a(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        IDENTITY = aVar;
        FieldNamingPolicy fieldNamingPolicy = new FieldNamingPolicy("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.FieldNamingPolicy.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c
            public String a(Field field) {
                return FieldNamingPolicy.upperCaseFirstLetter(field.getName());
            }
        };
        UPPER_CAMEL_CASE = fieldNamingPolicy;
        FieldNamingPolicy fieldNamingPolicy2 = new FieldNamingPolicy("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.FieldNamingPolicy.c
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c
            public String a(Field field) {
                return FieldNamingPolicy.upperCaseFirstLetter(FieldNamingPolicy.separateCamelCase(field.getName(), ' '));
            }
        };
        UPPER_CAMEL_CASE_WITH_SPACES = fieldNamingPolicy2;
        FieldNamingPolicy fieldNamingPolicy3 = new FieldNamingPolicy("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.FieldNamingPolicy.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c
            public String a(Field field) {
                return FieldNamingPolicy.separateCamelCase(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        UPPER_CASE_WITH_UNDERSCORES = fieldNamingPolicy3;
        FieldNamingPolicy fieldNamingPolicy4 = new FieldNamingPolicy("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: com.google.gson.FieldNamingPolicy.e
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c
            public String a(Field field) {
                return FieldNamingPolicy.separateCamelCase(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_UNDERSCORES = fieldNamingPolicy4;
        FieldNamingPolicy fieldNamingPolicy5 = new FieldNamingPolicy("LOWER_CASE_WITH_DASHES", 5) { // from class: com.google.gson.FieldNamingPolicy.f
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c
            public String a(Field field) {
                return FieldNamingPolicy.separateCamelCase(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DASHES = fieldNamingPolicy5;
        FieldNamingPolicy fieldNamingPolicy6 = new FieldNamingPolicy("LOWER_CASE_WITH_DOTS", 6) { // from class: com.google.gson.FieldNamingPolicy.g
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c
            public String a(Field field) {
                return FieldNamingPolicy.separateCamelCase(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DOTS = fieldNamingPolicy6;
        $VALUES = new FieldNamingPolicy[]{aVar, fieldNamingPolicy, fieldNamingPolicy2, fieldNamingPolicy3, fieldNamingPolicy4, fieldNamingPolicy5, fieldNamingPolicy6};
    }

    private FieldNamingPolicy(String str, int i11) {
    }

    public static String separateCamelCase(String str, char c11) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (Character.isUpperCase(charAt) && sb2.length() != 0) {
                sb2.append(c11);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    public static String upperCaseFirstLetter(String str) {
        int length = str.length();
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = str.charAt(i11);
            if (!Character.isLetter(charAt)) {
                i11++;
            } else if (!Character.isUpperCase(charAt)) {
                char upperCase = Character.toUpperCase(charAt);
                if (i11 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i11) + upperCase + str.substring(i11 + 1);
            }
        }
        return str;
    }

    public static FieldNamingPolicy valueOf(String str) {
        return (FieldNamingPolicy) Enum.valueOf(FieldNamingPolicy.class, str);
    }

    public static FieldNamingPolicy[] values() {
        return (FieldNamingPolicy[]) $VALUES.clone();
    }

    public /* synthetic */ FieldNamingPolicy(String str, int i11, a aVar) {
        this(str, i11);
    }
}
