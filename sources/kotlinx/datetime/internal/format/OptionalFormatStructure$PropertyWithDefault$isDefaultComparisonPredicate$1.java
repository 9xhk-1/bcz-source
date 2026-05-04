package kotlinx.datetime.internal.format;

import kotlin.jvm.internal.FunctionReferenceImpl;
import u40.b;
import x00.l;

/* JADX INFO: Add missing generic type declarations: [T, E] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public /* synthetic */ class OptionalFormatStructure$PropertyWithDefault$isDefaultComparisonPredicate$1<E, T> extends FunctionReferenceImpl implements l<T, E> {
    public OptionalFormatStructure$PropertyWithDefault$isDefaultComparisonPredicate$1(Object obj) {
        super(1, obj, b.class, "getter", "getter(Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // x00.l
    public final E invoke(T t11) {
        return (E) ((b) this.receiver).a(t11);
    }
}
