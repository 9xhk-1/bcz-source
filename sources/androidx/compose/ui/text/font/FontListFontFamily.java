package androidx.compose.ui.text.font;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@u0({"SMAP\nFontFamily.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamily.kt\nandroidx/compose/ui/text/font/FontListFontFamily\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,252:1\n77#2,8:253\n*S KotlinDebug\n*F\n+ 1 FontFamily.kt\nandroidx/compose/ui/text/font/FontListFontFamily\n*L\n168#1:253,8\n*E\n"})
/* loaded from: classes2.dex */
public final class FontListFontFamily extends FileBasedFontFamily implements List<Font>, y00.a {
    public static final int $stable = 0;

    @k
    private final List<Font> fonts;

    /* JADX WARN: Multi-variable type inference failed */
    public FontListFontFamily(@k List<? extends Font> list) {
        super(null);
        this.fonts = list;
        if (list.isEmpty()) {
            InlineClassHelperKt.throwIllegalStateException("At least one font should be passed to FontFamily");
        }
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int i11, Font font) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i11, Collection<? extends Font> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void addFirst(Font font) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void addLast(Font font) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(@k Font font) {
        return this.fonts.contains(font);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@k Collection<? extends Object> collection) {
        return this.fonts.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FontListFontFamily) && g0.g(this.fonts, ((FontListFontFamily) obj).fonts);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    @k
    public Font get(int i11) {
        return this.fonts.get(i11);
    }

    @k
    public final List<Font> getFonts() {
        return this.fonts;
    }

    public int getSize() {
        return this.fonts.size();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.fonts.hashCode();
    }

    public int indexOf(@k Font font) {
        return this.fonts.indexOf(font);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.fonts.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @k
    public Iterator<Font> iterator() {
        return this.fonts.iterator();
    }

    public int lastIndexOf(@k Font font) {
        return this.fonts.lastIndexOf(font);
    }

    @Override // java.util.List
    @k
    public ListIterator<Font> listIterator() {
        return this.fonts.listIterator();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Font remove(int i11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Font removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Font removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<Font> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public Font set2(int i11, Font font) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super Font> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @k
    public List<Font> subList(int i11, int i12) {
        return this.fonts.subList(i11, i12);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return u.a(this);
    }

    @k
    public String toString() {
        return "FontListFontFamily(fonts=" + this.fonts + ')';
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i11, Font font) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Font> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Font) {
            return contains((Font) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Font) {
            return indexOf((Font) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Font) {
            return lastIndexOf((Font) obj);
        }
        return -1;
    }

    @Override // java.util.List
    @k
    public ListIterator<Font> listIterator(int i11) {
        return this.fonts.listIterator(i11);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Font remove(int i11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: removeFirst, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m4652removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: removeLast, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m4653removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Font set(int i11, Font font) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) u.b(this, tArr);
    }

    public boolean add(Font font) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
