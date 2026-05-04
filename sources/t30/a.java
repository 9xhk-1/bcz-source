package t30;

import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: t30.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1172a extends FunctionReferenceImpl implements x00.l<Object, String> {

        /* renamed from: a, reason: collision with root package name */
        public static final C1172a f89304a = new C1172a();

        public C1172a() {
            super(1, g0.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(Object obj) {
            return String.valueOf(obj);
        }
    }

    public static final <T> void a(@m80.l String str, @m80.l T t11, @m80.l T t12, @m80.k x00.l<? super T, Integer> size, @m80.k x00.p<? super T, ? super Integer, ? extends Object> get, @m80.k x00.l<? super T, String> contentToString, @m80.k x00.p<? super T, ? super T, Boolean> contentEquals) {
        kotlin.jvm.internal.g0.p(size, "size");
        kotlin.jvm.internal.g0.p(get, "get");
        kotlin.jvm.internal.g0.p(contentToString, "contentToString");
        kotlin.jvm.internal.g0.p(contentEquals, "contentEquals");
        if (contentEquals.invoke(t11, t12).booleanValue() || c("Array", str, t11, t12, contentToString)) {
            return;
        }
        int intValue = size.invoke(t11).intValue();
        int intValue2 = size.invoke(t12).intValue();
        if (intValue == intValue2) {
            for (int i11 = 0; i11 < intValue; i11++) {
                Object invoke = get.invoke(t11, Integer.valueOf(i11));
                Object invoke2 = get.invoke(t12, Integer.valueOf(i11));
                if (!kotlin.jvm.internal.g0.g(invoke, invoke2)) {
                    l.r1(i0.j(str) + d("Array", i11, invoke, invoke2) + '\n' + ("Expected <" + contentToString.invoke(t11) + ">, actual <" + contentToString.invoke(t12) + ">."));
                    throw new KotlinNothingValueException();
                }
            }
            return;
        }
        l.r1(i0.j(str) + ("Array sizes differ. Expected size is " + intValue + ", actual size is " + intValue2 + '.') + '\n' + ("Expected <" + contentToString.invoke(t11) + ">, actual <" + contentToString.invoke(t12) + ">."));
        throw new KotlinNothingValueException();
    }

    public static final <T> void b(@m80.k String typeName, @m80.l String str, @m80.l T t11, @m80.l T t12, @m80.k x00.l<? super T, ? extends Iterator<?>> iterator) {
        kotlin.jvm.internal.g0.p(typeName, "typeName");
        kotlin.jvm.internal.g0.p(iterator, "iterator");
        if (c(typeName, str, t11, t12, C1172a.f89304a)) {
            return;
        }
        Iterator<?> invoke = iterator.invoke(t11);
        Iterator<?> invoke2 = iterator.invoke(t12);
        int i11 = 0;
        while (invoke.hasNext() && invoke2.hasNext()) {
            Object next = invoke.next();
            Object next2 = invoke2.next();
            if (!kotlin.jvm.internal.g0.g(next, next2)) {
                l.r1(i0.j(str) + d(typeName, i11, next, next2));
                throw new KotlinNothingValueException();
            }
            i11++;
        }
        if (invoke.hasNext()) {
            if (invoke2.hasNext()) {
                throw new IllegalStateException("Check failed.");
            }
            l.r1(i0.j(str) + typeName + " lengths differ. Expected length is bigger than " + i11 + ", actual length is " + i11 + '.');
            throw new KotlinNothingValueException();
        }
        if (invoke2.hasNext()) {
            if (invoke.hasNext()) {
                throw new IllegalStateException("Check failed.");
            }
            l.r1(i0.j(str) + typeName + " lengths differ. Expected length is " + i11 + ", actual length is bigger than " + i11 + '.');
            throw new KotlinNothingValueException();
        }
    }

    public static final <T> boolean c(String str, String str2, T t11, T t12, x00.l<? super T, String> lVar) {
        if (t11 == t12) {
            return true;
        }
        if (t11 == null) {
            l.r1(i0.j(str2) + "Expected <null> " + str + ", actual <" + lVar.invoke(t12) + ">.");
            throw new KotlinNothingValueException();
        }
        if (t12 != null) {
            return false;
        }
        l.r1(i0.j(str2) + "Expected non-null " + str + " <" + lVar.invoke(t11) + ">, actual <null>.");
        throw new KotlinNothingValueException();
    }

    public static final String d(String str, int i11, Object obj, Object obj2) {
        return str + " elements differ at index " + i11 + ". Expected element <" + obj + ">, actual element <" + obj2 + ">.";
    }
}
