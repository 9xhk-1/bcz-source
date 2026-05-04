package k10;

import java.util.Comparator;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;

/* loaded from: classes8.dex */
public class x0 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final x00.p f65009a;

    public x0(x00.p pVar) {
        this.f65009a = pVar;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int L;
        L = KDeclarationContainerImpl.L(this.f65009a, obj, obj2);
        return L;
    }
}
