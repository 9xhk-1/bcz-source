package ko;

import com.google.common.base.Preconditions;
import java.util.Map;
import javax.annotation.CheckForNull;
import kotlin.jvm.internal.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b
@f
/* loaded from: classes7.dex */
public abstract class c extends l {

    /* renamed from: c, reason: collision with root package name */
    public final char[][] f66888c;

    /* renamed from: d, reason: collision with root package name */
    public final int f66889d;

    /* renamed from: e, reason: collision with root package name */
    public final int f66890e;

    /* renamed from: f, reason: collision with root package name */
    public final int f66891f;

    /* renamed from: g, reason: collision with root package name */
    public final char f66892g;

    /* renamed from: h, reason: collision with root package name */
    public final char f66893h;

    public c(Map<Character, String> replacementMap, int safeMin, int safeMax, String unsafeReplacement) {
        this(b.a(replacementMap), safeMin, safeMax, unsafeReplacement);
    }

    @Override // ko.l, ko.h
    public final String b(String s11) {
        Preconditions.checkNotNull(s11);
        for (int i11 = 0; i11 < s11.length(); i11++) {
            char charAt = s11.charAt(i11);
            if ((charAt < this.f66889d && this.f66888c[charAt] != null) || charAt > this.f66893h || charAt < this.f66892g) {
                return e(s11, i11);
            }
        }
        return s11;
    }

    @Override // ko.l
    @CheckForNull
    public final char[] d(int cp2) {
        char[] cArr;
        if (cp2 < this.f66889d && (cArr = this.f66888c[cp2]) != null) {
            return cArr;
        }
        if (cp2 < this.f66890e || cp2 > this.f66891f) {
            return h(cp2);
        }
        return null;
    }

    @Override // ko.l
    public final int g(CharSequence csq, int index, int end) {
        while (index < end) {
            char charAt = csq.charAt(index);
            if ((charAt < this.f66889d && this.f66888c[charAt] != null) || charAt > this.f66893h || charAt < this.f66892g) {
                break;
            }
            index++;
        }
        return index;
    }

    @CheckForNull
    public abstract char[] h(int cp2);

    public c(b escaperMap, int safeMin, int safeMax, String unsafeReplacement) {
        Preconditions.checkNotNull(escaperMap);
        char[][] c11 = escaperMap.c();
        this.f66888c = c11;
        this.f66889d = c11.length;
        if (safeMax < safeMin) {
            safeMax = -1;
            safeMin = Integer.MAX_VALUE;
        }
        this.f66890e = safeMin;
        this.f66891f = safeMax;
        if (safeMin >= 55296) {
            this.f66892g = q.f67020c;
            this.f66893h = (char) 0;
        } else {
            this.f66892g = (char) safeMin;
            this.f66893h = (char) Math.min(safeMax, 55295);
        }
    }
}
