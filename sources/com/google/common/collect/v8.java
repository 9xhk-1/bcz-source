package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public final class v8 {
    public static <E, K extends Comparable> int a(List<E> list, ho.r<? super E, K> keyFunction, K key, c presentBehavior, b absentBehavior) {
        Preconditions.checkNotNull(key);
        return b(list, keyFunction, key, s7.z(), presentBehavior, absentBehavior);
    }

    public static <E, K> int b(List<E> list, ho.r<? super E, K> keyFunction, @t7 K key, Comparator<? super K> keyComparator, c presentBehavior, b absentBehavior) {
        return d(q6.D(list, keyFunction), key, keyComparator, presentBehavior, absentBehavior);
    }

    public static <E extends Comparable> int c(List<? extends E> list, E e11, c presentBehavior, b absentBehavior) {
        Preconditions.checkNotNull(e11);
        return d(list, e11, s7.z(), presentBehavior, absentBehavior);
    }

    public static <E> int d(List<? extends E> list, @t7 E e11, Comparator<? super E> comparator, c cVar, b bVar) {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(cVar);
        Preconditions.checkNotNull(bVar);
        if (!(list instanceof RandomAccess)) {
            list = new ArrayList(list);
        }
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int compare = comparator.compare(e11, list.get(i12));
            if (compare < 0) {
                size = i12 - 1;
            } else {
                if (compare <= 0) {
                    return i11 + cVar.b(comparator, e11, list.subList(i11, size + 1), i12 - i11);
                }
                i11 = i12 + 1;
            }
        }
        return bVar.b(i11);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f34059a = new a("NEXT_LOWER", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f34060b = new C0407b("NEXT_HIGHER", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f34061c = new c("INVERTED_INSERTION_INDEX", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ b[] f34062d = a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum a extends b {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // com.google.common.collect.v8.b
            public int b(int higherIndex) {
                return higherIndex - 1;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum c extends b {
            public c(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // com.google.common.collect.v8.b
            public int b(int higherIndex) {
                return ~higherIndex;
            }
        }

        public b(String $enum$name, int $enum$ordinal) {
        }

        public static /* synthetic */ b[] a() {
            return new b[]{f34059a, f34060b, f34061c};
        }

        public static b valueOf(String name) {
            return (b) Enum.valueOf(b.class, name);
        }

        public static b[] values() {
            return (b[]) f34062d.clone();
        }

        public abstract int b(int higherIndex);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.google.common.collect.v8$b$b, reason: collision with other inner class name */
        public enum C0407b extends b {
            public C0407b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // com.google.common.collect.v8.b
            public int b(int higherIndex) {
                return higherIndex;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f34063a = new a("ANY_PRESENT", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final c f34064b = new b("LAST_PRESENT", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final c f34065c = new C0408c("FIRST_PRESENT", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final c f34066d = new d("FIRST_AFTER", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final c f34067e = new e("LAST_BEFORE", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ c[] f34068f = a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum b extends c {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.v8.c
            public <E> int b(Comparator<? super E> comparator, @t7 E e11, List<? extends E> list, int i11) {
                int size = list.size() - 1;
                while (i11 < size) {
                    int i12 = ((i11 + size) + 1) >>> 1;
                    if (comparator.compare(list.get(i12), e11) > 0) {
                        size = i12 - 1;
                    } else {
                        i11 = i12;
                    }
                }
                return i11;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.google.common.collect.v8$c$c, reason: collision with other inner class name */
        public enum C0408c extends c {
            public C0408c(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.v8.c
            public <E> int b(Comparator<? super E> comparator, @t7 E e11, List<? extends E> list, int i11) {
                int i12 = 0;
                while (i12 < i11) {
                    int i13 = (i12 + i11) >>> 1;
                    if (comparator.compare(list.get(i13), e11) < 0) {
                        i12 = i13 + 1;
                    } else {
                        i11 = i13;
                    }
                }
                return i12;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum d extends c {
            public d(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // com.google.common.collect.v8.c
            public <E> int b(Comparator<? super E> comparator, @t7 E key, List<? extends E> list, int foundIndex) {
                return c.f34064b.b(comparator, key, list, foundIndex) + 1;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum e extends c {
            public e(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // com.google.common.collect.v8.c
            public <E> int b(Comparator<? super E> comparator, @t7 E key, List<? extends E> list, int foundIndex) {
                return c.f34065c.b(comparator, key, list, foundIndex) - 1;
            }
        }

        public c(String $enum$name, int $enum$ordinal) {
        }

        public static /* synthetic */ c[] a() {
            return new c[]{f34063a, f34064b, f34065c, f34066d, f34067e};
        }

        public static c valueOf(String name) {
            return (c) Enum.valueOf(c.class, name);
        }

        public static c[] values() {
            return (c[]) f34068f.clone();
        }

        public abstract <E> int b(Comparator<? super E> comparator, @t7 E key, List<? extends E> list, int foundIndex);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum a extends c {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // com.google.common.collect.v8.c
            public <E> int b(Comparator<? super E> comparator, @t7 E key, List<? extends E> list, int foundIndex) {
                return foundIndex;
            }
        }
    }
}
