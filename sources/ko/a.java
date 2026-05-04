package ko;

import com.google.common.base.Preconditions;
import java.util.Map;
import javax.annotation.CheckForNull;
import kotlin.jvm.internal.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b
@f
/* loaded from: classes7.dex */
public abstract class a extends d {

    /* renamed from: c, reason: collision with root package name */
    public final char[][] f66882c;

    /* renamed from: d, reason: collision with root package name */
    public final int f66883d;

    /* renamed from: e, reason: collision with root package name */
    public final char f66884e;

    /* renamed from: f, reason: collision with root package name */
    public final char f66885f;

    public a(Map<Character, String> replacementMap, char safeMin, char safeMax) {
        this(b.a(replacementMap), safeMin, safeMax);
    }

    @Override // ko.d, ko.h
    public final String b(String s11) {
        Preconditions.checkNotNull(s11);
        for (int i11 = 0; i11 < s11.length(); i11++) {
            char charAt = s11.charAt(i11);
            if ((charAt < this.f66883d && this.f66882c[charAt] != null) || charAt > this.f66885f || charAt < this.f66884e) {
                return d(s11, i11);
            }
        }
        return s11;
    }

    @Override // ko.d
    @CheckForNull
    public final char[] c(char c11) {
        char[] cArr;
        if (c11 < this.f66883d && (cArr = this.f66882c[c11]) != null) {
            return cArr;
        }
        if (c11 < this.f66884e || c11 > this.f66885f) {
            return f(c11);
        }
        return null;
    }

    @CheckForNull
    public abstract char[] f(char c11);

    public a(b escaperMap, char safeMin, char safeMax) {
        Preconditions.checkNotNull(escaperMap);
        char[][] c11 = escaperMap.c();
        this.f66882c = c11;
        this.f66883d = c11.length;
        if (safeMax < safeMin) {
            safeMax = 0;
            safeMin = q.f67020c;
        }
        this.f66884e = safeMin;
        this.f66885f = safeMax;
    }
}
