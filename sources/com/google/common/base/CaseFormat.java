package com.google.common.base;

import com.xiaomi.mipush.sdk.Constants;
import ho.h;
import ho.j;
import java.io.Serializable;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j
@go.b
/* loaded from: classes7.dex */
public abstract class CaseFormat {
    public static final CaseFormat LOWER_CAMEL;
    public static final CaseFormat LOWER_UNDERSCORE;
    public static final CaseFormat UPPER_CAMEL;
    public static final CaseFormat UPPER_UNDERSCORE;
    private final ho.d wordBoundary;
    private final String wordSeparator;
    public static final CaseFormat LOWER_HYPHEN = new a("LOWER_HYPHEN", 0, ho.d.q('-'), Constants.ACCEPT_TIME_SEPARATOR_SERVER);
    private static final /* synthetic */ CaseFormat[] $VALUES = $values();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a extends CaseFormat {
        public a(String $enum$name, int $enum$ordinal, ho.d wordBoundary, String wordSeparator) {
            super($enum$name, $enum$ordinal, wordBoundary, wordSeparator, null);
        }

        @Override // com.google.common.base.CaseFormat
        public String convert(CaseFormat format, String s11) {
            return format == CaseFormat.LOWER_UNDERSCORE ? s11.replace('-', '_') : format == CaseFormat.UPPER_UNDERSCORE ? ho.c.j(s11.replace('-', '_')) : super.convert(format, s11);
        }

        @Override // com.google.common.base.CaseFormat
        public String normalizeWord(String word) {
            return ho.c.g(word);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f extends h<String, String> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: c, reason: collision with root package name */
        public final CaseFormat f32727c;

        /* renamed from: d, reason: collision with root package name */
        public final CaseFormat f32728d;

        public f(CaseFormat sourceFormat, CaseFormat targetFormat) {
            this.f32727c = (CaseFormat) Preconditions.checkNotNull(sourceFormat);
            this.f32728d = (CaseFormat) Preconditions.checkNotNull(targetFormat);
        }

        @Override // ho.h, ho.r
        public boolean equals(@CheckForNull Object object) {
            if (object instanceof f) {
                f fVar = (f) object;
                if (this.f32727c.equals(fVar.f32727c) && this.f32728d.equals(fVar.f32728d)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f32727c.hashCode() ^ this.f32728d.hashCode();
        }

        @Override // ho.h
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public String g(String s11) {
            return this.f32728d.to(this.f32727c, s11);
        }

        @Override // ho.h
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public String h(String s11) {
            return this.f32727c.to(this.f32728d, s11);
        }

        public String toString() {
            return this.f32727c + ".converterTo(" + this.f32728d + pn.j.f81007d;
        }
    }

    private static /* synthetic */ CaseFormat[] $values() {
        return new CaseFormat[]{LOWER_HYPHEN, LOWER_UNDERSCORE, LOWER_CAMEL, UPPER_CAMEL, UPPER_UNDERSCORE};
    }

    static {
        String str = "_";
        LOWER_UNDERSCORE = new CaseFormat("LOWER_UNDERSCORE", 1, ho.d.q('_'), str) { // from class: com.google.common.base.CaseFormat.b
            {
                a aVar = null;
            }

            @Override // com.google.common.base.CaseFormat
            public String convert(CaseFormat format, String s11) {
                return format == CaseFormat.LOWER_HYPHEN ? s11.replace('_', '-') : format == CaseFormat.UPPER_UNDERSCORE ? ho.c.j(s11) : super.convert(format, s11);
            }

            @Override // com.google.common.base.CaseFormat
            public String normalizeWord(String word) {
                return ho.c.g(word);
            }
        };
        String str2 = "";
        LOWER_CAMEL = new CaseFormat("LOWER_CAMEL", 2, ho.d.m('A', 'Z'), str2) { // from class: com.google.common.base.CaseFormat.c
            {
                a aVar = null;
            }

            @Override // com.google.common.base.CaseFormat
            public String normalizeFirstWord(String word) {
                return ho.c.g(word);
            }

            @Override // com.google.common.base.CaseFormat
            public String normalizeWord(String word) {
                return CaseFormat.firstCharOnlyToUpper(word);
            }
        };
        UPPER_CAMEL = new CaseFormat("UPPER_CAMEL", 3, ho.d.m('A', 'Z'), str2) { // from class: com.google.common.base.CaseFormat.d
            {
                a aVar = null;
            }

            @Override // com.google.common.base.CaseFormat
            public String normalizeWord(String word) {
                return CaseFormat.firstCharOnlyToUpper(word);
            }
        };
        UPPER_UNDERSCORE = new CaseFormat("UPPER_UNDERSCORE", 4, ho.d.q('_'), str) { // from class: com.google.common.base.CaseFormat.e
            {
                a aVar = null;
            }

            @Override // com.google.common.base.CaseFormat
            public String convert(CaseFormat format, String s11) {
                return format == CaseFormat.LOWER_HYPHEN ? ho.c.g(s11.replace('_', '-')) : format == CaseFormat.LOWER_UNDERSCORE ? ho.c.g(s11) : super.convert(format, s11);
            }

            @Override // com.google.common.base.CaseFormat
            public String normalizeWord(String word) {
                return ho.c.j(word);
            }
        };
    }

    public /* synthetic */ CaseFormat(String str, int i11, ho.d dVar, String str2, a aVar) {
        this(str, i11, dVar, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String firstCharOnlyToUpper(String word) {
        if (word.isEmpty()) {
            return word;
        }
        return ho.c.h(word.charAt(0)) + ho.c.g(word.substring(1));
    }

    public static CaseFormat valueOf(String name) {
        return (CaseFormat) Enum.valueOf(CaseFormat.class, name);
    }

    public static CaseFormat[] values() {
        return (CaseFormat[]) $VALUES.clone();
    }

    public String convert(CaseFormat format, String s11) {
        StringBuilder sb2 = null;
        int i11 = 0;
        int i12 = -1;
        while (true) {
            i12 = this.wordBoundary.o(s11, i12 + 1);
            if (i12 == -1) {
                break;
            }
            if (i11 == 0) {
                sb2 = new StringBuilder(s11.length() + (format.wordSeparator.length() * 4));
                sb2.append(format.normalizeFirstWord(s11.substring(i11, i12)));
            } else {
                Objects.requireNonNull(sb2);
                sb2.append(format.normalizeWord(s11.substring(i11, i12)));
            }
            sb2.append(format.wordSeparator);
            i11 = this.wordSeparator.length() + i12;
        }
        if (i11 == 0) {
            return format.normalizeFirstWord(s11);
        }
        Objects.requireNonNull(sb2);
        sb2.append(format.normalizeWord(s11.substring(i11)));
        return sb2.toString();
    }

    public h<String, String> converterTo(CaseFormat targetFormat) {
        return new f(this, targetFormat);
    }

    public String normalizeFirstWord(String word) {
        return normalizeWord(word);
    }

    public abstract String normalizeWord(String word);

    public final String to(CaseFormat format, String str) {
        Preconditions.checkNotNull(format);
        Preconditions.checkNotNull(str);
        return format == this ? str : convert(format, str);
    }

    private CaseFormat(String $enum$name, int $enum$ordinal, ho.d wordBoundary, String wordSeparator) {
        this.wordBoundary = wordBoundary;
        this.wordSeparator = wordSeparator;
    }
}
