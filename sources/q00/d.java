package q00;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.random.Random;
import kotlin.time.Instant;
import m80.k;
import m80.l;
import w00.g;
import w30.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class d extends p00.a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nJDK8PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK8PlatformImplementations.kt\nkotlin/internal/jdk8/JDK8PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f81375a = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        @g
        public static final Integer f81376b;

        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                f81376b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            f81376b = num2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements w30.b {
        @Override // w30.b
        public Instant a() {
            java.time.Instant now;
            now = java.time.Instant.now();
            g0.o(now, "now(...)");
            return x30.g.b(now);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements w30.b {
        @Override // w30.b
        public Instant a() {
            return Instant.Companion.a(System.currentTimeMillis());
        }
    }

    @Override // o00.m
    @k
    public Random b() {
        return f(34) ? new f10.a() : super.b();
    }

    @Override // o00.m
    @l
    public u30.l c(@k MatchResult matchResult, @k String name) {
        int start;
        int end;
        String group;
        g0.p(matchResult, "matchResult");
        g0.p(name, "name");
        Matcher matcher = matchResult instanceof Matcher ? (Matcher) matchResult : null;
        if (matcher == null) {
            throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
        }
        start = matcher.start(name);
        end = matcher.end(name);
        g10.l lVar = new g10.l(start, end - 1);
        if (lVar.getStart().intValue() < 0) {
            return null;
        }
        group = matcher.group(name);
        g0.o(group, "group(...)");
        return new u30.l(group, lVar);
    }

    @Override // o00.m
    @h
    @k
    public w30.b e() {
        return f(26) ? new b() : new c();
    }

    public final boolean f(int i11) {
        Integer num = a.f81376b;
        return num == null || num.intValue() >= i11;
    }
}
