package ho;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.CheckForNull;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final ho.d f59650a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f59651b;

    /* renamed from: c, reason: collision with root package name */
    public final h f59652c;

    /* renamed from: d, reason: collision with root package name */
    public final int f59653d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ho.d f59654a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: ho.m0$a$a, reason: collision with other inner class name */
        public class C0679a extends g {
            public C0679a(m0 splitter, CharSequence toSplit) {
                super(splitter, toSplit);
            }

            @Override // ho.m0.g
            public int e(int separatorPosition) {
                return separatorPosition + 1;
            }

            @Override // ho.m0.g
            public int f(int start) {
                return a.this.f59654a.o(this.f59668c, start);
            }
        }

        public a(final ho.d val$separatorMatcher) {
            this.f59654a = val$separatorMatcher;
        }

        @Override // ho.m0.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(m0 splitter, final CharSequence toSplit) {
            return new C0679a(splitter, toSplit);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f59656a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends g {
            public a(m0 splitter, CharSequence toSplit) {
                super(splitter, toSplit);
            }

            @Override // ho.m0.g
            public int e(int separatorPosition) {
                return separatorPosition + b.this.f59656a.length();
            }

            /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
            
                r6 = r6 + 1;
             */
            @Override // ho.m0.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public int f(int r6) {
                /*
                    r5 = this;
                    ho.m0$b r0 = ho.m0.b.this
                    java.lang.String r0 = r0.f59656a
                    int r0 = r0.length()
                    java.lang.CharSequence r1 = r5.f59668c
                    int r1 = r1.length()
                    int r1 = r1 - r0
                Lf:
                    if (r6 > r1) goto L2d
                    r2 = 0
                L12:
                    if (r2 >= r0) goto L2c
                    java.lang.CharSequence r3 = r5.f59668c
                    int r4 = r2 + r6
                    char r3 = r3.charAt(r4)
                    ho.m0$b r4 = ho.m0.b.this
                    java.lang.String r4 = r4.f59656a
                    char r4 = r4.charAt(r2)
                    if (r3 == r4) goto L29
                    int r6 = r6 + 1
                    goto Lf
                L29:
                    int r2 = r2 + 1
                    goto L12
                L2c:
                    return r6
                L2d:
                    r6 = -1
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: ho.m0.b.a.f(int):int");
            }
        }

        public b(final String val$separator) {
            this.f59656a = val$separator;
        }

        @Override // ho.m0.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(m0 splitter, CharSequence toSplit) {
            return new a(splitter, toSplit);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ho.g f59658a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends g {

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ ho.f f59659h;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ c f59660i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(final c this$0, m0 splitter, CharSequence toSplit, final ho.f val$matcher) {
                super(splitter, toSplit);
                this.f59659h = val$matcher;
                this.f59660i = this$0;
            }

            @Override // ho.m0.g
            public int e(int separatorPosition) {
                return this.f59659h.a();
            }

            @Override // ho.m0.g
            public int f(int start) {
                if (this.f59659h.c(start)) {
                    return this.f59659h.f();
                }
                return -1;
            }
        }

        public c(final ho.g val$separatorPattern) {
            this.f59658a = val$separatorPattern;
        }

        @Override // ho.m0.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(final m0 splitter, CharSequence toSplit) {
            return new a(this, splitter, toSplit, this.f59658a.d(toSplit));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements Iterable<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f59663a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m0 f59664b;

        public e(final m0 this$0, final CharSequence val$sequence) {
            this.f59663a = val$sequence;
            this.f59664b = this$0;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return this.f59664b.p(this.f59663a);
        }

        public String toString() {
            a0 p11 = a0.p(j2.O);
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            StringBuilder f11 = p11.f(sb2, this);
            f11.append(l50.b.f69930l);
            return f11.toString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f {

        /* renamed from: c, reason: collision with root package name */
        public static final String f59665c = "Chunk [%s] is not a valid entry";

        /* renamed from: a, reason: collision with root package name */
        public final m0 f59666a;

        /* renamed from: b, reason: collision with root package name */
        public final m0 f59667b;

        public /* synthetic */ f(m0 m0Var, m0 m0Var2, a aVar) {
            this(m0Var, m0Var2);
        }

        public Map<String, String> a(CharSequence sequence) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : this.f59666a.n(sequence)) {
                Iterator p11 = this.f59667b.p(str);
                Preconditions.checkArgument(p11.hasNext(), f59665c, str);
                String str2 = (String) p11.next();
                Preconditions.checkArgument(!linkedHashMap.containsKey(str2), "Duplicate key [%s] found.", str2);
                Preconditions.checkArgument(p11.hasNext(), f59665c, str);
                linkedHashMap.put(str2, (String) p11.next());
                Preconditions.checkArgument(!p11.hasNext(), f59665c, str);
            }
            return Collections.unmodifiableMap(linkedHashMap);
        }

        public f(m0 outerSplitter, m0 entrySplitter) {
            this.f59666a = outerSplitter;
            this.f59667b = (m0) Preconditions.checkNotNull(entrySplitter);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class g extends ho.b<String> {

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f59668c;

        /* renamed from: d, reason: collision with root package name */
        public final ho.d f59669d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f59670e;

        /* renamed from: f, reason: collision with root package name */
        public int f59671f = 0;

        /* renamed from: g, reason: collision with root package name */
        public int f59672g;

        public g(m0 splitter, CharSequence toSplit) {
            this.f59669d = splitter.f59650a;
            this.f59670e = splitter.f59651b;
            this.f59672g = splitter.f59653d;
            this.f59668c = toSplit;
        }

        @Override // ho.b
        @CheckForNull
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a() {
            int f11;
            int i11 = this.f59671f;
            while (true) {
                int i12 = this.f59671f;
                if (i12 == -1) {
                    return b();
                }
                f11 = f(i12);
                if (f11 == -1) {
                    f11 = this.f59668c.length();
                    this.f59671f = -1;
                } else {
                    this.f59671f = e(f11);
                }
                int i13 = this.f59671f;
                if (i13 == i11) {
                    int i14 = i13 + 1;
                    this.f59671f = i14;
                    if (i14 > this.f59668c.length()) {
                        this.f59671f = -1;
                    }
                } else {
                    while (i11 < f11 && this.f59669d.B(this.f59668c.charAt(i11))) {
                        i11++;
                    }
                    while (f11 > i11 && this.f59669d.B(this.f59668c.charAt(f11 - 1))) {
                        f11--;
                    }
                    if (!this.f59670e || i11 != f11) {
                        break;
                    }
                    i11 = this.f59671f;
                }
            }
            int i15 = this.f59672g;
            if (i15 == 1) {
                f11 = this.f59668c.length();
                this.f59671f = -1;
                while (f11 > i11 && this.f59669d.B(this.f59668c.charAt(f11 - 1))) {
                    f11--;
                }
            } else {
                this.f59672g = i15 - 1;
            }
            return this.f59668c.subSequence(i11, f11).toString();
        }

        public abstract int e(int separatorPosition);

        public abstract int f(int start);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface h {
        Iterator<String> a(m0 splitter, CharSequence toSplit);
    }

    public m0(h strategy) {
        this(strategy, false, ho.d.G(), Integer.MAX_VALUE);
    }

    public static m0 e(final int length) {
        Preconditions.checkArgument(length > 0, "The length may not be less than 1");
        return new m0(new d(length));
    }

    public static m0 h(char separator) {
        return i(ho.d.q(separator));
    }

    public static m0 i(final ho.d separatorMatcher) {
        Preconditions.checkNotNull(separatorMatcher);
        return new m0(new a(separatorMatcher));
    }

    public static m0 j(final String separator) {
        Preconditions.checkArgument(separator.length() != 0, "The separator may not be the empty string.");
        return separator.length() == 1 ? h(separator.charAt(0)) : new m0(new b(separator));
    }

    @go.c
    public static m0 k(Pattern separatorPattern) {
        return m(new z(separatorPattern));
    }

    @go.c
    public static m0 l(String separatorPattern) {
        return m(h0.a(separatorPattern));
    }

    public static m0 m(final ho.g separatorPattern) {
        Preconditions.checkArgument(!separatorPattern.d("").d(), "The pattern may not match the empty string: %s", separatorPattern);
        return new m0(new c(separatorPattern));
    }

    public m0 f(int maxItems) {
        Preconditions.checkArgument(maxItems > 0, "must be greater than zero: %s", maxItems);
        return new m0(this.f59652c, this.f59651b, this.f59650a, maxItems);
    }

    public m0 g() {
        return new m0(this.f59652c, true, this.f59650a, this.f59653d);
    }

    public Iterable<String> n(final CharSequence sequence) {
        Preconditions.checkNotNull(sequence);
        return new e(this, sequence);
    }

    public List<String> o(CharSequence sequence) {
        Preconditions.checkNotNull(sequence);
        Iterator<String> p11 = p(sequence);
        ArrayList arrayList = new ArrayList();
        while (p11.hasNext()) {
            arrayList.add(p11.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Iterator<String> p(CharSequence sequence) {
        return this.f59652c.a(this, sequence);
    }

    public m0 q() {
        return r(ho.d.X());
    }

    public m0 r(ho.d trimmer) {
        Preconditions.checkNotNull(trimmer);
        return new m0(this.f59652c, this.f59651b, trimmer, this.f59653d);
    }

    public f s(char separator) {
        return t(h(separator));
    }

    public f t(m0 keyValueSplitter) {
        return new f(this, keyValueSplitter, null);
    }

    public f u(String separator) {
        return t(j(separator));
    }

    public m0(h strategy, boolean omitEmptyStrings, ho.d trimmer, int limit) {
        this.f59652c = strategy;
        this.f59651b = omitEmptyStrings;
        this.f59650a = trimmer;
        this.f59653d = limit;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f59661a;

        public d(final int val$length) {
            this.f59661a = val$length;
        }

        @Override // ho.m0.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(final m0 splitter, CharSequence toSplit) {
            return new a(splitter, toSplit);
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends g {
            public a(m0 splitter, CharSequence toSplit) {
                super(splitter, toSplit);
            }

            @Override // ho.m0.g
            public int f(int start) {
                int i11 = start + d.this.f59661a;
                if (i11 < this.f59668c.length()) {
                    return i11;
                }
                return -1;
            }

            @Override // ho.m0.g
            public int e(int separatorPosition) {
                return separatorPosition;
            }
        }
    }
}
