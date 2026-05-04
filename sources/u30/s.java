package u30;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,404:1\n1803#2,3:405\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n*L\n21#1:405,3\n*E\n"})
/* loaded from: classes8.dex */
public final class s {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt$fromInt$1$1\n*L\n1#1,404:1\n*E\n"})
    public static final class a<T> implements x00.l<T, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f91702a;

        public a(int i11) {
            this.f91702a = i11;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Enum r32) {
            g gVar = (g) r32;
            return Boolean.valueOf((this.f91702a & gVar.getMask()) == gVar.getValue());
        }
    }

    public static final o f(Matcher matcher, int i11, CharSequence charSequence) {
        if (matcher.find(i11)) {
            return new p(matcher, charSequence);
        }
        return null;
    }

    public static final /* synthetic */ <T extends Enum<T> & g> Set<T> g(int i11) {
        kotlin.jvm.internal.g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        EnumSet allOf = EnumSet.allOf(Enum.class);
        kotlin.jvm.internal.g0.m(allOf);
        kotlin.jvm.internal.g0.w();
        a00.m0.S0(allOf, new a(i11));
        Set<T> unmodifiableSet = Collections.unmodifiableSet(allOf);
        kotlin.jvm.internal.g0.o(unmodifiableSet, "unmodifiableSet(...)");
        return unmodifiableSet;
    }

    public static final o h(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new p(matcher, charSequence);
        }
        return null;
    }

    public static final g10.l i(MatchResult matchResult) {
        return g10.u.W1(matchResult.start(), matchResult.end());
    }

    public static final g10.l j(MatchResult matchResult, int i11) {
        return g10.u.W1(matchResult.start(i11), matchResult.end(i11));
    }

    public static final int k(Iterable<? extends g> iterable) {
        Iterator<? extends g> it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 |= it.next().getValue();
        }
        return i11;
    }
}
