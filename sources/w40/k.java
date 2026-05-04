package w40;

import a00.h0;
import a00.i0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nParserOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParserOperation.kt\nkotlinx/datetime/internal/format/parser/NumberSpanParserOperation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,557:1\n1#2:558\n1761#3,3:559\n1740#3,3:562\n1788#3,4:565\n774#3:569\n865#3,2:570\n1563#3:572\n1634#3,3:573\n1563#3:576\n1634#3,3:577\n*S KotlinDebug\n*F\n+ 1 ParserOperation.kt\nkotlinx/datetime/internal/format/parser/NumberSpanParserOperation\n*L\n52#1:559,3\n55#1:562,3\n56#1:565,4\n57#1:569\n57#1:570,2\n57#1:572\n57#1:573,3\n66#1:576\n66#1:577,3\n*E\n"})
/* loaded from: classes8.dex */
public final class k<Output> implements q<Output> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<e<Output>> f95268a;

    /* renamed from: b, reason: collision with root package name */
    public final int f95269b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f95270c;

    /* JADX WARN: Multi-variable type inference failed */
    public k(@m80.k List<? extends e<? super Output>> consumers) {
        boolean z11;
        boolean z12;
        int i11;
        g0.p(consumers, "consumers");
        this.f95268a = consumers;
        Iterator it = consumers.iterator();
        int i12 = 0;
        while (true) {
            int i13 = 1;
            if (!it.hasNext()) {
                break;
            }
            Integer b11 = ((e) it.next()).b();
            if (b11 != null) {
                i13 = b11.intValue();
            }
            i12 += i13;
        }
        this.f95269b = i12;
        List<e<Output>> list = this.f95268a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (((e) it2.next()).b() == null) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        this.f95270c = z11;
        List<e<Output>> list2 = this.f95268a;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                Integer b12 = ((e) it3.next()).b();
                if (!((b12 != null ? b12.intValue() : Integer.MAX_VALUE) > 0)) {
                    z12 = false;
                    break;
                }
            }
        }
        z12 = true;
        if (!z12) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        List<e<Output>> list3 = this.f95268a;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            i11 = 0;
        } else {
            Iterator<T> it4 = list3.iterator();
            i11 = 0;
            while (it4.hasNext()) {
                if ((((e) it4.next()).b() == null) && (i11 = i11 + 1) < 0) {
                    h0.a0();
                }
            }
        }
        if (i11 <= 1) {
            return;
        }
        List<e<Output>> list4 = this.f95268a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list4) {
            if (((e) obj).b() == null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i0.d0(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList2.add(((e) it5.next()).c());
        }
        throw new IllegalArgumentException(("At most one variable-length numeric field in a row is allowed, but got several: " + arrayList2 + ". Parsing is undefined: for example, with variable-length month number and variable-length day of month, '111' can be parsed as Jan 11th or Nov 1st.").toString());
    }

    public static final String e(String str, k kVar, int i11, g gVar) {
        return "Can not interpret the string '" + str + "' as " + kVar.f95268a.get(i11).c() + ": " + gVar.a();
    }

    public static final String f(k kVar) {
        return "Unexpected end of input: yet to parse " + kVar.i();
    }

    public static final String g(Ref.IntRef intRef, k kVar) {
        return "Only found " + intRef.element + " digits in a row, but need to parse " + kVar.i();
    }

    @Override // w40.q
    @m80.k
    public Object a(Output output, @m80.k CharSequence input, int i11) {
        g0.p(input, "input");
        if (this.f95269b + i11 > input.length()) {
            return m.f95273b.a(i11, new x00.a() { // from class: w40.h
                @Override // x00.a
                public final Object invoke() {
                    String f11;
                    f11 = k.f(k.this);
                    return f11;
                }
            });
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        while (intRef.element + i11 < input.length() && t40.h.b(input.charAt(intRef.element + i11))) {
            intRef.element++;
        }
        if (intRef.element < this.f95269b) {
            return m.f95273b.a(i11, new x00.a() { // from class: w40.i
                @Override // x00.a
                public final Object invoke() {
                    String g11;
                    g11 = k.g(Ref.IntRef.this, this);
                    return g11;
                }
            });
        }
        int size = this.f95268a.size();
        final int i12 = 0;
        while (i12 < size) {
            Integer b11 = this.f95268a.get(i12).b();
            int intValue = (b11 != null ? b11.intValue() : (intRef.element - this.f95269b) + 1) + i11;
            final g a11 = this.f95268a.get(i12).a(output, input, i11, intValue);
            if (a11 != null) {
                final String obj = input.subSequence(i11, intValue).toString();
                return m.f95273b.a(i11, new x00.a() { // from class: w40.j
                    @Override // x00.a
                    public final Object invoke() {
                        String e11;
                        e11 = k.e(obj, this, i12, a11);
                        return e11;
                    }
                });
            }
            i12++;
            i11 = intValue;
        }
        return m.f95273b.b(i11);
    }

    @m80.k
    public final List<e<Output>> h() {
        return this.f95268a;
    }

    public final String i() {
        String str;
        List<e<Output>> list = this.f95268a;
        ArrayList arrayList = new ArrayList(i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            StringBuilder sb2 = new StringBuilder();
            Integer b11 = eVar.b();
            if (b11 == null) {
                str = "at least one digit";
            } else {
                str = b11 + " digits";
            }
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(eVar.c());
            arrayList.add(sb2.toString());
        }
        if (this.f95270c) {
            return "a number with at least " + this.f95269b + " digits: " + arrayList;
        }
        return "a number with exactly " + this.f95269b + " digits: " + arrayList;
    }

    @m80.k
    public String toString() {
        return i();
    }
}
