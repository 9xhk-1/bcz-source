package kotlin.reflect.jvm.internal.impl.builtins.functions;

import a00.a1;
import a00.h0;
import a00.i0;
import a00.r0;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.open.SocialConstants;
import e30.f2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import l30.t;
import m80.k;
import m80.l;
import n10.i;
import p10.c1;
import p10.h;
import p10.j1;
import p10.o;
import p10.t0;
import p10.x0;
import q10.g;
import s10.o0;
import s10.s;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFunctionInvokeDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionInvokeDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionInvokeDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,161:1\n2632#2,3:162\n1557#2:165\n1628#2,3:166\n1734#2,3:169\n1557#2:172\n1628#2,3:173\n1755#2,3:176\n*S KotlinDebug\n*F\n+ 1 FunctionInvokeDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionInvokeDescriptor\n*L\n63#1:162,3\n64#1:165\n64#1:166,3\n88#1:169,3\n92#1:172\n92#1:173,3\n106#1:176,3\n*E\n"})
/* loaded from: classes8.dex */
public final class d extends o0 {

    @k
    public static final a E = new a(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nFunctionInvokeDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionInvokeDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionInvokeDescriptor$Factory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,161:1\n967#2,7:162\n1557#2:169\n1628#2,3:170\n*S KotlinDebug\n*F\n+ 1 FunctionInvokeDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionInvokeDescriptor$Factory\n*L\n122#1:162,7\n124#1:169\n124#1:170,3\n*E\n"})
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final d a(@k b functionClass, boolean z11) {
            g0.p(functionClass, "functionClass");
            List<c1> t11 = functionClass.t();
            d dVar = new d(functionClass, null, CallableMemberDescriptor.Kind.DECLARATION, z11, null);
            t0 W = functionClass.W();
            List<t0> J = h0.J();
            List<? extends c1> J2 = h0.J();
            ArrayList arrayList = new ArrayList();
            for (Object obj : t11) {
                if (((c1) obj).j() != Variance.IN_VARIANCE) {
                    break;
                }
                arrayList.add(obj);
            }
            Iterable<a1> m62 = r0.m6(arrayList);
            ArrayList arrayList2 = new ArrayList(i0.d0(m62, 10));
            for (a1 a1Var : m62) {
                arrayList2.add(d.E.b(dVar, a1Var.e(), (c1) a1Var.f()));
            }
            dVar.M0(null, W, J, J2, arrayList2, ((c1) r0.u3(t11)).s(), Modality.ABSTRACT, o.f78590e);
            dVar.U0(true);
            return dVar;
        }

        public final j1 b(d dVar, int i11, c1 c1Var) {
            String lowerCase;
            String b11 = c1Var.getName().b();
            g0.o(b11, "asString(...)");
            if (g0.g(b11, ExifInterface.GPS_DIRECTION_TRUE)) {
                lowerCase = "instance";
            } else if (g0.g(b11, ExifInterface.LONGITUDE_EAST)) {
                lowerCase = SocialConstants.PARAM_RECEIVER;
            } else {
                lowerCase = b11.toLowerCase(Locale.ROOT);
                g0.o(lowerCase, "toLowerCase(...)");
            }
            g b12 = g.A0.b();
            n20.f f11 = n20.f.f(lowerCase);
            g0.o(f11, "identifier(...)");
            e30.c1 s11 = c1Var.s();
            g0.o(s11, "getDefaultType(...)");
            x0 NO_SOURCE = x0.f78622a;
            g0.o(NO_SOURCE, "NO_SOURCE");
            return new s10.u0(dVar, null, i11, b12, f11, s11, false, false, false, null, NO_SOURCE);
        }

        public a() {
        }
    }

    public /* synthetic */ d(h hVar, d dVar, CallableMemberDescriptor.Kind kind, boolean z11, v vVar) {
        this(hVar, dVar, kind, z11);
    }

    @Override // s10.s, kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean A() {
        return false;
    }

    @Override // s10.o0, s10.s
    @k
    /* renamed from: G0 */
    public s j1(@k h newOwner, @l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @k CallableMemberDescriptor.Kind kind, @l n20.f fVar, @k g annotations, @k x0 source) {
        g0.p(newOwner, "newOwner");
        g0.p(kind, "kind");
        g0.p(annotations, "annotations");
        g0.p(source, "source");
        return new d(newOwner, (d) eVar, kind, isSuspend());
    }

    @Override // s10.s
    @l
    public kotlin.reflect.jvm.internal.impl.descriptors.e H0(@k s.c configuration) {
        g0.p(configuration, "configuration");
        d dVar = (d) super.H0(configuration);
        if (dVar == null) {
            return null;
        }
        List<j1> g11 = dVar.g();
        g0.o(g11, "getValueParameters(...)");
        List<j1> list = g11;
        if ((list instanceof Collection) && list.isEmpty()) {
            return dVar;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            e30.r0 type = ((j1) it.next()).getType();
            g0.o(type, "getType(...)");
            if (i.d(type) != null) {
                List<j1> g12 = dVar.g();
                g0.o(g12, "getValueParameters(...)");
                List<j1> list2 = g12;
                ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    e30.r0 type2 = ((j1) it2.next()).getType();
                    g0.o(type2, "getType(...)");
                    arrayList.add(i.d(type2));
                }
                return dVar.k1(arrayList);
            }
        }
        return dVar;
    }

    @Override // s10.s, p10.x
    public boolean isExternal() {
        return false;
    }

    @Override // s10.s, kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean isInline() {
        return false;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.e k1(List<n20.f> list) {
        n20.f fVar;
        int size = g().size() - list.size();
        boolean z11 = true;
        if (size == 0) {
            List<j1> g11 = g();
            g0.o(g11, "getValueParameters(...)");
            List<Pair> o62 = r0.o6(list, g11);
            if ((o62 instanceof Collection) && o62.isEmpty()) {
                return this;
            }
            for (Pair pair : o62) {
                if (!g0.g((n20.f) pair.component1(), ((j1) pair.component2()).getName())) {
                }
            }
            return this;
        }
        List<j1> g12 = g();
        g0.o(g12, "getValueParameters(...)");
        List<j1> list2 = g12;
        ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
        for (j1 j1Var : list2) {
            n20.f name = j1Var.getName();
            g0.o(name, "getName(...)");
            int index = j1Var.getIndex();
            int i11 = index - size;
            if (i11 >= 0 && (fVar = list.get(i11)) != null) {
                name = fVar;
            }
            arrayList.add(j1Var.O(this, name, index));
        }
        s.c N0 = N0(f2.f48583b);
        List<n20.f> list3 = list;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (((n20.f) it.next()) == null) {
                    break;
                }
            }
        }
        z11 = false;
        s.c e11 = N0.G(z11).k(arrayList).e(a());
        g0.o(e11, "setOriginal(...)");
        kotlin.reflect.jvm.internal.impl.descriptors.e H0 = super.H0(e11);
        g0.m(H0);
        return H0;
    }

    public d(h hVar, d dVar, CallableMemberDescriptor.Kind kind, boolean z11) {
        super(hVar, dVar, g.A0.b(), t.f69818i, kind, x0.f78622a);
        a1(true);
        c1(z11);
        T0(false);
    }
}
