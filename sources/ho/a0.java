package ho;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j
@go.b
/* loaded from: classes7.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f59512a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends a0 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f59513b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a0 f59514c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(final a0 this$0, a0 prototype, final String val$nullText) {
            super(prototype, null);
            this.f59513b = val$nullText;
            this.f59514c = this$0;
        }

        @Override // ho.a0
        public a0 q() {
            throw new UnsupportedOperationException("already specified useForNull");
        }

        @Override // ho.a0
        public CharSequence r(@CheckForNull Object part) {
            return part == null ? this.f59513b : this.f59514c.r(part);
        }

        @Override // ho.a0
        public a0 s(String nullText) {
            throw new UnsupportedOperationException("already specified useForNull");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends a0 {
        public b(a0 prototype) {
            super(prototype, null);
        }

        @Override // ho.a0
        public <A extends Appendable> A d(A appendable, Iterator<? extends Object> parts) throws IOException {
            Preconditions.checkNotNull(appendable, "appendable");
            Preconditions.checkNotNull(parts, "parts");
            while (true) {
                if (!parts.hasNext()) {
                    break;
                }
                Object next = parts.next();
                if (next != null) {
                    appendable.append(a0.this.r(next));
                    break;
                }
            }
            while (parts.hasNext()) {
                Object next2 = parts.next();
                if (next2 != null) {
                    appendable.append(a0.this.f59512a);
                    appendable.append(a0.this.r(next2));
                }
            }
            return appendable;
        }

        @Override // ho.a0
        public a0 s(String nullText) {
            throw new UnsupportedOperationException("already specified skipNulls");
        }

        @Override // ho.a0
        public d u(String kvs) {
            throw new UnsupportedOperationException("can't use .skipNulls() with maps");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends AbstractList<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object[] f59516a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f59517b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f59518c;

        public c(final Object[] val$rest, final Object val$first, final Object val$second) {
            this.f59516a = val$rest;
            this.f59517b = val$first;
            this.f59518c = val$second;
        }

        @Override // java.util.AbstractList, java.util.List
        @CheckForNull
        public Object get(int index) {
            return index != 0 ? index != 1 ? this.f59516a[index - 2] : this.f59518c : this.f59517b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f59516a.length + 2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final a0 f59519a;

        /* renamed from: b, reason: collision with root package name */
        public final String f59520b;

        public /* synthetic */ d(a0 a0Var, String str, a aVar) {
            this(a0Var, str);
        }

        @uo.a
        public <A extends Appendable> A a(A a11, Iterable<? extends Map.Entry<?, ?>> iterable) throws IOException {
            return (A) b(a11, iterable.iterator());
        }

        @uo.a
        public <A extends Appendable> A b(A appendable, Iterator<? extends Map.Entry<?, ?>> parts) throws IOException {
            Preconditions.checkNotNull(appendable);
            if (parts.hasNext()) {
                Map.Entry<?, ?> next = parts.next();
                appendable.append(this.f59519a.r(next.getKey()));
                appendable.append(this.f59520b);
                appendable.append(this.f59519a.r(next.getValue()));
                while (parts.hasNext()) {
                    appendable.append(this.f59519a.f59512a);
                    Map.Entry<?, ?> next2 = parts.next();
                    appendable.append(this.f59519a.r(next2.getKey()));
                    appendable.append(this.f59520b);
                    appendable.append(this.f59519a.r(next2.getValue()));
                }
            }
            return appendable;
        }

        @uo.a
        public <A extends Appendable> A c(A a11, Map<?, ?> map) throws IOException {
            return (A) a(a11, map.entrySet());
        }

        @uo.a
        public StringBuilder d(StringBuilder builder, Iterable<? extends Map.Entry<?, ?>> entries) {
            return e(builder, entries.iterator());
        }

        @uo.a
        public StringBuilder e(StringBuilder builder, Iterator<? extends Map.Entry<?, ?>> entries) {
            try {
                b(builder, entries);
                return builder;
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @uo.a
        public StringBuilder f(StringBuilder builder, Map<?, ?> map) {
            return d(builder, map.entrySet());
        }

        public String g(Iterable<? extends Map.Entry<?, ?>> entries) {
            return h(entries.iterator());
        }

        public String h(Iterator<? extends Map.Entry<?, ?>> entries) {
            return e(new StringBuilder(), entries).toString();
        }

        public String i(Map<?, ?> map) {
            return g(map.entrySet());
        }

        public d j(String nullText) {
            return new d(this.f59519a.s(nullText), this.f59520b);
        }

        public d(a0 joiner, String keyValueSeparator) {
            this.f59519a = joiner;
            this.f59520b = (String) Preconditions.checkNotNull(keyValueSeparator);
        }
    }

    public /* synthetic */ a0(a0 a0Var, a aVar) {
        this(a0Var);
    }

    public static Iterable<Object> j(@CheckForNull Object first, @CheckForNull Object second, Object[] rest) {
        Preconditions.checkNotNull(rest);
        return new c(rest, first, second);
    }

    public static a0 o(char separator) {
        return new a0(String.valueOf(separator));
    }

    public static a0 p(String separator) {
        return new a0(separator);
    }

    @uo.a
    public <A extends Appendable> A b(A a11, Iterable<? extends Object> iterable) throws IOException {
        return (A) d(a11, iterable.iterator());
    }

    @uo.a
    public final <A extends Appendable> A c(A a11, @CheckForNull Object obj, @CheckForNull Object obj2, Object... objArr) throws IOException {
        return (A) b(a11, j(obj, obj2, objArr));
    }

    @uo.a
    public <A extends Appendable> A d(A appendable, Iterator<? extends Object> parts) throws IOException {
        Preconditions.checkNotNull(appendable);
        if (parts.hasNext()) {
            appendable.append(r(parts.next()));
            while (parts.hasNext()) {
                appendable.append(this.f59512a);
                appendable.append(r(parts.next()));
            }
        }
        return appendable;
    }

    @uo.a
    public final <A extends Appendable> A e(A a11, Object[] objArr) throws IOException {
        return (A) b(a11, Arrays.asList(objArr));
    }

    @uo.a
    public final StringBuilder f(StringBuilder builder, Iterable<? extends Object> parts) {
        return h(builder, parts.iterator());
    }

    @uo.a
    public final StringBuilder g(StringBuilder builder, @CheckForNull Object first, @CheckForNull Object second, Object... rest) {
        return f(builder, j(first, second, rest));
    }

    @uo.a
    public final StringBuilder h(StringBuilder builder, Iterator<? extends Object> parts) {
        try {
            d(builder, parts);
            return builder;
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }

    @uo.a
    public final StringBuilder i(StringBuilder builder, Object[] parts) {
        return f(builder, Arrays.asList(parts));
    }

    public final String k(Iterable<? extends Object> parts) {
        return m(parts.iterator());
    }

    public final String l(@CheckForNull Object first, @CheckForNull Object second, Object... rest) {
        return k(j(first, second, rest));
    }

    public final String m(Iterator<? extends Object> parts) {
        return h(new StringBuilder(), parts).toString();
    }

    public final String n(Object[] parts) {
        return k(Arrays.asList(parts));
    }

    public a0 q() {
        return new b(this);
    }

    public CharSequence r(@CheckForNull Object part) {
        Objects.requireNonNull(part);
        return part instanceof CharSequence ? (CharSequence) part : part.toString();
    }

    public a0 s(String nullText) {
        Preconditions.checkNotNull(nullText);
        return new a(this, this, nullText);
    }

    public d t(char keyValueSeparator) {
        return u(String.valueOf(keyValueSeparator));
    }

    public d u(String keyValueSeparator) {
        return new d(this, keyValueSeparator, null);
    }

    public a0(String separator) {
        this.f59512a = (String) Preconditions.checkNotNull(separator);
    }

    public a0(a0 prototype) {
        this.f59512a = prototype.f59512a;
    }
}
