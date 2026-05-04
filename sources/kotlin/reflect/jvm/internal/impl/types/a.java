package kotlin.reflect.jvm.internal.impl.types;

import a00.r0;
import i30.g;
import i30.h;
import i30.l;
import i30.o;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAbstractTypeChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/AbstractNullabilityChecker\n+ 2 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/TypeCheckerState\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,860:1\n132#2,16:861\n148#2,13:878\n132#2,16:891\n148#2,13:908\n1#3:877\n1#3:907\n*S KotlinDebug\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/AbstractNullabilityChecker\n*L\n804#1:861,16\n804#1:878,13\n818#1:891,16\n818#1:908,13\n804#1:877\n818#1:907\n*E\n"})
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f67666a = new a();

    public final boolean a(@k TypeCheckerState typeCheckerState, @k h type, @k TypeCheckerState.b supertypesPolicy) {
        g0.p(typeCheckerState, "<this>");
        g0.p(type, "type");
        g0.p(supertypesPolicy, "supertypesPolicy");
        o j11 = typeCheckerState.j();
        if ((j11.h(type) && !j11.B0(type)) || j11.z0(type)) {
            return true;
        }
        typeCheckerState.k();
        ArrayDeque<h> h11 = typeCheckerState.h();
        g0.m(h11);
        Set<h> i11 = typeCheckerState.i();
        g0.m(i11);
        h11.push(type);
        while (!h11.isEmpty()) {
            if (i11.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + type + ". Supertypes = " + r0.r3(i11, null, null, null, 0, null, null, 63, null)).toString());
            }
            h pop = h11.pop();
            g0.m(pop);
            if (i11.add(pop)) {
                TypeCheckerState.b bVar = j11.B0(pop) ? TypeCheckerState.b.c.f67664a : supertypesPolicy;
                if (g0.g(bVar, TypeCheckerState.b.c.f67664a)) {
                    bVar = null;
                }
                if (bVar == null) {
                    continue;
                } else {
                    o j12 = typeCheckerState.j();
                    Iterator<g> it = j12.r0(j12.d(pop)).iterator();
                    while (it.hasNext()) {
                        h a11 = bVar.a(typeCheckerState, it.next());
                        if ((j11.h(a11) && !j11.B0(a11)) || j11.z0(a11)) {
                            typeCheckerState.e();
                            return true;
                        }
                        h11.add(a11);
                    }
                }
            }
        }
        typeCheckerState.e();
        return false;
    }

    public final boolean b(@k TypeCheckerState state, @k h start, @k l end) {
        g0.p(state, "state");
        g0.p(start, "start");
        g0.p(end, "end");
        o j11 = state.j();
        if (f67666a.c(state, start, end)) {
            return true;
        }
        state.k();
        ArrayDeque<h> h11 = state.h();
        g0.m(h11);
        Set<h> i11 = state.i();
        g0.m(i11);
        h11.push(start);
        while (!h11.isEmpty()) {
            if (i11.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + start + ". Supertypes = " + r0.r3(i11, null, null, null, 0, null, null, 63, null)).toString());
            }
            h pop = h11.pop();
            g0.m(pop);
            if (i11.add(pop)) {
                TypeCheckerState.b bVar = j11.B0(pop) ? TypeCheckerState.b.c.f67664a : TypeCheckerState.b.C0802b.f67663a;
                if (g0.g(bVar, TypeCheckerState.b.c.f67664a)) {
                    bVar = null;
                }
                if (bVar == null) {
                    continue;
                } else {
                    o j12 = state.j();
                    Iterator<g> it = j12.r0(j12.d(pop)).iterator();
                    while (it.hasNext()) {
                        h a11 = bVar.a(state, it.next());
                        if (f67666a.c(state, a11, end)) {
                            state.e();
                            return true;
                        }
                        h11.add(a11);
                    }
                }
            }
        }
        state.e();
        return false;
    }

    public final boolean c(TypeCheckerState typeCheckerState, h hVar, l lVar) {
        o j11 = typeCheckerState.j();
        if (j11.U(hVar)) {
            return true;
        }
        if (j11.B0(hVar)) {
            return false;
        }
        if (typeCheckerState.n() && j11.A(hVar)) {
            return true;
        }
        return j11.Z(j11.d(hVar), lVar);
    }

    public final boolean d(@k TypeCheckerState state, @k h subType, @k h superType) {
        g0.p(state, "state");
        g0.p(subType, "subType");
        g0.p(superType, "superType");
        return e(state, subType, superType);
    }

    public final boolean e(TypeCheckerState typeCheckerState, h hVar, h hVar2) {
        o j11 = typeCheckerState.j();
        if (b.f67668b) {
            if (!j11.e(hVar) && !j11.o(j11.d(hVar))) {
                typeCheckerState.l(hVar);
            }
            if (!j11.e(hVar2)) {
                typeCheckerState.l(hVar2);
            }
        }
        if (j11.B0(hVar2) || j11.z0(hVar) || j11.f0(hVar)) {
            return true;
        }
        if ((hVar instanceof i30.b) && j11.W((i30.b) hVar)) {
            return true;
        }
        a aVar = f67666a;
        if (aVar.a(typeCheckerState, hVar, TypeCheckerState.b.C0802b.f67663a)) {
            return true;
        }
        if (j11.z0(hVar2) || aVar.a(typeCheckerState, hVar2, TypeCheckerState.b.d.f67665a) || j11.h(hVar)) {
            return false;
        }
        return aVar.b(typeCheckerState, hVar, j11.d(hVar2));
    }
}
