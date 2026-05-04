package androidx.compose.ui.text.intl;

import a00.a0;
import a00.h0;
import androidx.compose.runtime.Immutable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import y00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLocaleList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocaleList.kt\nandroidx/compose/ui/text/intl/LocaleList\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,87:1\n150#2,3:88\n34#2,6:91\n153#2:97\n34#2,6:98\n153#2:104\n*S KotlinDebug\n*F\n+ 1 LocaleList.kt\nandroidx/compose/ui/text/intl/LocaleList\n*L\n53#1:88,3\n53#1:91,6\n53#1:97\n53#1:98,6\n53#1:104\n*E\n"})
@Immutable
/* loaded from: classes2.dex */
public final class LocaleList implements Collection<Locale>, a {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final LocaleList Empty = new LocaleList((List<Locale>) h0.J());

    @k
    private final List<Locale> localeList;
    private final int size;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final LocaleList getCurrent() {
            return PlatformLocaleKt.getPlatformLocaleDelegate().getCurrent();
        }

        @k
        public final LocaleList getEmpty() {
            return LocaleList.Empty;
        }

        private Companion() {
        }
    }

    public LocaleList(@k List<Locale> list) {
        this.localeList = list;
        this.size = list.size();
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public boolean add2(Locale locale) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends Locale> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Locale) {
            return contains((Locale) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@k Collection<? extends Object> collection) {
        return this.localeList.containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocaleList) && g0.g(this.localeList, ((LocaleList) obj).localeList);
    }

    @k
    public final Locale get(int i11) {
        return this.localeList.get(i11);
    }

    @k
    public final List<Locale> getLocaleList() {
        return this.localeList;
    }

    public int getSize() {
        return this.size;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.localeList.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.localeList.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @k
    public Iterator<Locale> iterator() {
        return this.localeList.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super Locale> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return u.a(this);
    }

    @k
    public String toString() {
        return "LocaleList(localeList=" + this.localeList + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Locale locale) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(@k Locale locale) {
        return this.localeList.contains(locale);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) u.b(this, tArr);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LocaleList(@m80.k java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = ","
            java.lang.String[] r2 = new java.lang.String[]{r0}
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r8
            java.util.List r8 = u30.k0.o5(r1, r2, r3, r4, r5, r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r8.size()
            r0.<init>(r1)
            r1 = r8
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r2 = 0
            r3 = r2
        L21:
            if (r3 >= r1) goto L37
            java.lang.Object r4 = r8.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.CharSequence r4 = u30.k0.b6(r4)
            java.lang.String r4 = r4.toString()
            r0.add(r4)
            int r3 = r3 + 1
            goto L21
        L37:
            java.util.ArrayList r8 = new java.util.ArrayList
            int r1 = r0.size()
            r8.<init>(r1)
            int r1 = r0.size()
        L44:
            if (r2 >= r1) goto L57
            java.lang.Object r3 = r0.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            androidx.compose.ui.text.intl.Locale r4 = new androidx.compose.ui.text.intl.Locale
            r4.<init>(r3)
            r8.add(r4)
            int r2 = r2 + 1
            goto L44
        L57:
            r7.<init>(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.intl.LocaleList.<init>(java.lang.String):void");
    }

    public LocaleList(@k Locale... localeArr) {
        this((List<Locale>) a0.dz(localeArr));
    }
}
